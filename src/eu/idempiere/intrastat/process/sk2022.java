package eu.idempiere.intrastat.process;

import java.io.File;
import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.logging.Level;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.compiere.model.MAttachment;
import org.compiere.model.MPeriod;
import org.compiere.model.PO;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import eu.idempiere.model.MIntrastat;
import eu.idempiere.model.MIntrastatLine;
import eu.idempiere.model.X_C_Intrastat_Schema;

/**
 * Create Slovak Intrastat v.2022/01
 * 
 * @author MZI1SK
 *
 */
public class sk2022 extends SvrProcess {

	private static final String[] eu= new String[] {"AT","BE","BG","HR","CY","CZ","DK","EE","FI","FR","DE","GR","HR",
			"HU","IE","IT","LV","LT","LU","MT","NL","PL","PT","RO","SK","SI","ES","SE"};
	
	private int p_C_Intrastat_ID = 0;

	@Override
	protected void prepare() {
		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++) {
			String name = para[i].getParameterName();
			if (name.equals("C_Intrastat_ID"))
				p_C_Intrastat_ID = ((BigDecimal) para[i].getParameter()).intValue();
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}
	}

	@Override 
	protected String doIt() throws Exception {
		MIntrastat intrastat = new MIntrastat(getCtx(), p_C_Intrastat_ID, null);
		intrastat.setSummary("");
		X_C_Intrastat_Schema intrastatSchema = new X_C_Intrastat_Schema(getCtx(), intrastat.getC_Intrastat_Schema_ID(), null);
		String reportingType = intrastatSchema.get_ValueAsString("ReportingType");
		String region = intrastatSchema.get_ValueAsString("Region");
		String issotrx = (intrastat.getC_DocType().getDocBaseType().equals("ITR") ? "N" : "Y");
		try {
			PO.setCrossTenantSafe();

			DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();
			Document document = documentBuilder.newDocument();

			// root element

			String dirName = Env.getCtx().getProperty("documentDir", "");
			Calendar cal = Calendar.getInstance();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd_hh-mm-ss");
			String xmlFilePath = "intrastat_" + sdf.format(cal.getTime()) + ".xml";

			MPeriod period = new MPeriod(getCtx(), intrastat.getC_Period_ID(), null);
			
			String sql = "insert into c_intrastatline (ad_client_id," + "ad_org_id," + "businesstypeintrastat,"
					+ "c_bpartner_id," + "c_country_id," + "c_intrastat_id," + "c_intrastat_port_id,"
					+ "c_intrastatline_id," + "c_intrastatline_uu," + "c_invoiceline_id," + "c_uom_id,"
					+ "countrycodemanufacurer," + "created," + "createdby," + "dateinvoiced," + "description," + "fob,"
					+ "isactive," + "landedcostamt," + "linenetamt," + "M_Product_Commodity_id," + "m_product_id,"
					+ "manufacturer_id," + "modeoftransport," + "nettoweight," + "qtyinvoiced," + "seqno,"
					+ "statisticalvalue," + "taxid," + "updated," + "updatedby) " + "SELECT ad_client_id,"
					+ " ad_org_id," + " businesstypeintrastat," + " c_bpartner_id," + " c_country_id,"
					+ intrastat.get_ID() + "," + " null," // c_intrastat_port_id
					+ " nextval('c_intrastatline_sq')," // c_intrastatline_id
					+ " generate_uuid()," + " c_invoiceline_id," + " c_uom_id," + " country_manufacturer,"
					+ " current_date," + intrastat.getCreatedBy() + "," + " dateinvoiced," + " productname," + " fob,"
					+ " 'Y'," + " 0," // landedcostamt
					+ " linenetamt," + " M_Product_Commodity_id," + " m_product_id," + " manufacturer_id,"
					+ " coalesce(modeoftransport,'3')," + " netweight," + " qtyinvoiced," + " 0," // seqno
					+ " linenetamt," // statisticalvalue
					+ " taxid," + " current_date," + intrastat.getUpdatedBy()
					+ " from c_intrastat_v m where m.linenetamt!=0 and m.ad_client_id=? and dateinvoiced>=? and dateinvoiced<=? and issotrx=? ";
			DB.executeUpdate("DELETE FROM c_intrastatline WHERE C_Intrastat_ID=?",
					new Object[] { intrastat.getC_Intrastat_ID() }, false, get_TrxName());
			DB.executeUpdate(sql,
					new Object[] { intrastat.getAD_Client_ID(), period.getStartDate(), period.getEndDate(), issotrx },
					false, get_TrxName());
			DB.getSQLValue(get_TrxName(), "select intrastat_landedcosts(?,?,?)",
					new Object[] { intrastat.getC_Intrastat_ID(), intrastat.getC_Intrastat_Schema_ID() ,intrastat.getC_DocType().getDocBaseType()});

			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {

				Element root = document.createElement("INTRASTAT");
				document.appendChild(root);
				Element hlasenie = document.createElement("HLASENIE");
				root.appendChild(hlasenie);

				Calendar caldate = Calendar.getInstance();
				cal.setTimeInMillis(period.getStartDate().getTime());

				String p_Month = Integer.toString(caldate.get(Calendar.MONTH));
				String p_Year = Integer.toString(caldate.get(Calendar.YEAR));
				
				
				Element mesiac = document.createElement("MESIAC");
				mesiac.appendChild(document.createTextNode(p_Month));
				hlasenie.appendChild(mesiac);

				Element rok = document.createElement("ROK");
				rok.appendChild(document.createTextNode(p_Year.substring(p_Year.length()-2 )));
				hlasenie.appendChild(rok);

				Element druh = document.createElement("DRUH_HLASENIA");
				druh.appendChild(document.createTextNode("0"));
				hlasenie.appendChild(druh);

				Element typ = document.createElement("TYP_HLASENIA");
				typ.appendChild(document.createTextNode((intrastat.getC_DocType().getDocBaseType().equals("ITR") ? "P" : "O")));
				hlasenie.appendChild(typ);

				Element cislo = document.createElement("CISLO");
				cislo.appendChild(document.createTextNode("1"));
				hlasenie.appendChild(cislo);

				
				pstmt = DB.prepareStatement("select c_intrastatline_id from c_intrastatline where c_intrastat_id=?", null);
				pstmt.setInt(1, intrastat.getC_Intrastat_ID() );
				rs = pstmt.executeQuery();
				int lineNo=0;
				while (rs.next())
				{	
					MIntrastatLine line= new MIntrastatLine(getCtx(),rs.getInt(1),null);
					lineNo=lineNo+10;
					line.setSeqNo(lineNo);
					Element item = document.createElement("POLOZKA");
					hlasenie.appendChild(item);
					addelement(document, "KOD_TOVARU", line.getM_Product_Commodity().getValue(), item, "");
					addelement(document, "OPIS_TOVARU", 
							(reportingType.equals("T")? line.getM_Product_Commodity().getName():line.getM_Product().getName()),
							item, "");
					if (intrastat.getC_DocType().getDocBaseType().equals("ITR") )
						addelement(document, "KRAJINA_ODOSLANIA", line.getC_Country().getCountryCode(), item, "");
					else
						addelement(document, "KRAJINA_URCENIA", line.getC_Country().getCountryCode(), item, "");
					
					addelement(document, "KRAJINA_POVODU", line.getCountryCodeManufacurer(), item, "");
					addelement(document, "HMOTNOST", line.getNettoWeight().toString().replace(".",","), item, "");
					addelement(document, "MNOZSTVO", line.getQtyInvoiced().toString().replace(".",","), item, "");
					addelement(document, "SUMA", line.getStatisticalValue().toString().replace(".",","), item, "");
					addelement(document, "DODACIE_PODMIENKY", line.getFOB(), item, "");
					addelement(document, "DRUH_DOPRAVY", line.getModeOfTransport(), item, "");
					addelement(document, "DRUH_OBCHODU", line.getBusinessTypeIntrastat(), item, "");
					if (intrastat.getC_DocType().getDocBaseType().equals("ITR") )
						addelement(document, "REGION_URCENIA", region, item, "");
					else 
						addelement(document, "REGION_POVODU", region, item, "");
					
					addelement(document, "FAKTURA", line.getC_InvoiceLine().getC_Invoice().getDocumentNo(), item, "");
					addelement(document, "POZNAMKA", "", item, "");
					addelement(document, "ICD_PARTNERA", line.getTaxID(), item, "");

					if (line.getM_Product_Commodity().getValue()==null)
						intrastat.setSummary(intrastat.getSummary()+Env.NL+Msg.getElement(getCtx(), "Line")+" "+lineNo+" : chýba colný kód");
					else if (line.getM_Product_Commodity().getValue().length()<0)
						intrastat.setSummary(intrastat.getSummary()+Env.NL+Msg.getElement(getCtx(), "Line")+" "+lineNo+" : colný kód kratší ako 8 znakov");

					if (intrastat.getC_DocType().getDocBaseType().equals("ITR") && line.getC_Country().getCountryCode()==null)
						intrastat.setSummary(intrastat.getSummary()+Env.NL+Msg.getElement(getCtx(), "Line")+" "+lineNo+" : chýba krajina odoslania (zlé nastavenie OP)");
					else if (line.getC_Country().getCountryCode()==null)
						intrastat.setSummary(intrastat.getSummary()+Env.NL+Msg.getElement(getCtx(), "Line")+" "+lineNo+" : chýba krajina určenia (zlé nastavenie OP)");
					else if (intrastat.getC_DocType().getDocBaseType().equals("ITR") && line.getC_Country().getCountryCode().equals("SK"))
						intrastat.setSummary(intrastat.getSummary()+Env.NL+Msg.getElement(getCtx(), "Line")+" "+lineNo+" : krajina odoslania nemôže byť Slovensko (zlé nastavenie OP)");
					else if (line.getC_Country().getCountryCode().equals("SK"))
						intrastat.setSummary(intrastat.getSummary()+Env.NL+Msg.getElement(getCtx(), "Line")+" "+lineNo+" : krajina určenia nemôže byť Slovensko (zlé nastavenie OP)");
					else if (!Arrays.stream(eu).anyMatch(line.getC_Country().getCountryCode()::equals))
						intrastat.setSummary(intrastat.getSummary()+Env.NL+Msg.getElement(getCtx(), "Line")+" "+lineNo+" : krajina určenia/odoslania musí byť v EU (zlé nastavenie OP)");

					if ( line.getCountryCodeManufacurer()==null)
						intrastat.setSummary(intrastat.getSummary()+Env.NL+Msg.getElement(getCtx(), "Line")+" "+lineNo+" : chýba krajina výroby/pôvodu (zlé nastavenie produktu)");
					line.saveEx();
					
				}
			} 
			catch (Exception e) {
				e.printStackTrace();
			}
			finally {
				DB.close(rs, pstmt);
				rs = null;
				pstmt = null;
			}
			intrastat.saveEx();
			// create the xml file
			// transform the DOM Object to an XML File
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			DOMSource domSource = new DOMSource(document);
			StreamResult streamResult = new StreamResult(new File(dirName + xmlFilePath));

			transformer.transform(domSource, streamResult);

			// Writing to XML file
			

			
			PO.clearCrossTenantSafe();
			MAttachment attachment = new MAttachment(Env.getCtx(), 0, null);

			attachment.setRecord_ID(intrastat.get_ID());
			attachment.setAD_Table_ID(MIntrastat.Table_ID);
			attachment.addEntry(new File(dirName + xmlFilePath));
			attachment.setIsActive(true);
			attachment.setTitle("intrastat_" + sdf.format(cal.getTime()) + ".xml");
			attachment.saveEx();

			// readFile(dirName + xmlFilePath);

		} catch (ParserConfigurationException pce) {
			pce.printStackTrace();
		} catch (TransformerException tfe) {
			tfe.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
		}
		return null;

	}

	private void addelement(Document document, String elementname, String value, Node item, String fieldsNotToUse) {
		if (!fieldsNotToUse.contains(elementname) && value != null) {
			Element element = document.createElement(elementname);
			element.appendChild(document.createTextNode(value));
			item.appendChild(element);
		}
	}

//	private String readFile(String file) throws IOException {
//		BufferedReader reader = new BufferedReader(new FileReader(file));
//		String line = null;
//		StringBuilder stringBuilder = new StringBuilder();
//		String ls = System.getProperty("line.separator");
//
//		try {
//			while ((line = reader.readLine()) != null) {
//				stringBuilder.append(line);
//				stringBuilder.append(ls);
//			}
//
//			return stringBuilder.toString();
//		} finally {
//			reader.close();
//		}
//	}

	private String Win1250 = "ňľščťžýáíéúóäôŇĽŠČŤŽÝÁÍÉÚ";
	private String UTF8 = "nlsctzyaieuoaoNLSCTZYAIEU";

	public String toUTF8(String input) {
		try {
			input = input.replace("\"", "");

			for (int i = 0; i < input.length(); i++) {
				String chartocheck = input.substring(i, i + 1);
				if (Win1250.contains(chartocheck)) {
					int position = Win1250.lastIndexOf(chartocheck);
					if (UTF8.length() > position)
						input = input.substring(0, i) + UTF8.charAt(position) + input.substring(i + 1);
				}

			}
			return input;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}

}
