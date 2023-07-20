/******************************************************************************
 * Product: iDempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2012 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
/** Generated Model - DO NOT CHANGE */
package eu.idempiere.model;

import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.model.*;

/** Generated Model for C_Intrastat_BP
 *  @author iDempiere (generated) 
 *  @version Release 8.2 - $Id$ */
public class X_C_Intrastat_BP extends PO implements I_C_Intrastat_BP, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20230714L;

    /** Standard Constructor */
    public X_C_Intrastat_BP (Properties ctx, int C_Intrastat_BP_ID, String trxName)
    {
      super (ctx, C_Intrastat_BP_ID, trxName);
      /** if (C_Intrastat_BP_ID == 0)
        {
			setC_Intrastat_BP_ID (0);
        } */
    }

    /** Load Constructor */
    public X_C_Intrastat_BP (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 3 - Client - Org 
      */
    protected int get_AccessLevel()
    {
      return accessLevel.intValue();
    }

    /** Load Meta Data */
    protected POInfo initPO (Properties ctx)
    {
      POInfo poi = POInfo.getPOInfo (ctx, Table_ID, get_TrxName());
      return poi;
    }

    public String toString()
    {
      StringBuilder sb = new StringBuilder ("X_C_Intrastat_BP[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public org.compiere.model.I_C_BPartner getC_BPartner() throws RuntimeException
    {
		return (org.compiere.model.I_C_BPartner)MTable.get(getCtx(), org.compiere.model.I_C_BPartner.Table_Name)
			.getPO(getC_BPartner_ID(), get_TrxName());	}

	/** Set Business Partner .
		@param C_BPartner_ID 
		Identifies a Business Partner
	  */
	public void setC_BPartner_ID (int C_BPartner_ID)
	{
		if (C_BPartner_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_C_BPartner_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_C_BPartner_ID, Integer.valueOf(C_BPartner_ID));
	}

	/** Get Business Partner .
		@return Identifies a Business Partner
	  */
	public int getC_BPartner_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartner_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Busines.
		@param C_Intrastat_BP_ID Busines	  */
	public void setC_Intrastat_BP_ID (int C_Intrastat_BP_ID)
	{
		if (C_Intrastat_BP_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_C_Intrastat_BP_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_C_Intrastat_BP_ID, Integer.valueOf(C_Intrastat_BP_ID));
	}

	/** Get Busines.
		@return Busines	  */
	public int getC_Intrastat_BP_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Intrastat_BP_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set C_Intrastat_BP_UU.
		@param C_Intrastat_BP_UU C_Intrastat_BP_UU	  */
	public void setC_Intrastat_BP_UU (String C_Intrastat_BP_UU)
	{
		set_ValueNoCheck (COLUMNNAME_C_Intrastat_BP_UU, C_Intrastat_BP_UU);
	}

	/** Get C_Intrastat_BP_UU.
		@return C_Intrastat_BP_UU	  */
	public String getC_Intrastat_BP_UU () 
	{
		return (String)get_Value(COLUMNNAME_C_Intrastat_BP_UU);
	}

	public I_C_Intrastat_Schema getC_Intrastat_Schema() throws RuntimeException
    {
		return (I_C_Intrastat_Schema)MTable.get(getCtx(), I_C_Intrastat_Schema.Table_Name)
			.getPO(getC_Intrastat_Schema_ID(), get_TrxName());	}

	/** Set Intrastat Schema.
		@param C_Intrastat_Schema_ID Intrastat Schema	  */
	public void setC_Intrastat_Schema_ID (int C_Intrastat_Schema_ID)
	{
		if (C_Intrastat_Schema_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_C_Intrastat_Schema_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_C_Intrastat_Schema_ID, Integer.valueOf(C_Intrastat_Schema_ID));
	}

	/** Get Intrastat Schema.
		@return Intrastat Schema	  */
	public int getC_Intrastat_Schema_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Intrastat_Schema_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** FOB AD_Reference_ID=200030 */
	public static final int FOB_AD_Reference_ID=200030;
	/** FOB Origin = A_DFOBO */
	public static final String FOB_FOBOrigin = "A_DFOBO";
	/** Ex Works = B_EXW */
	public static final String FOB_ExWorks = "B_EXW";
	/** CFR - Cost and Freight = CFR */
	public static final String FOB_CFR_CostAndFreight = "CFR";
	/** CIF - Cost, Insurance, and Freight (FedEx) = CIF */
	public static final String FOB_CIF_CostInsuranceAndFreightFedEx = "CIF";
	/** CIP - Carriage and Insurance Paid To (FedEx) = CIP */
	public static final String FOB_CIP_CarriageAndInsurancePaidToFedEx = "CIP";
	/** CPT - Carriage Paid To = CPT */
	public static final String FOB_CPT_CarriagePaidTo = "CPT";
	/** DAF - Delivered at Frontier = DAF */
	public static final String FOB_DAF_DeliveredAtFrontier = "DAF";
	/** DDP - Delivered Duty Paid (FedEx) = DDP */
	public static final String FOB_DDP_DeliveredDutyPaidFedEx = "DDP";
	/** DDU - Delivered Duty Unpaid (FedEx) = DDU */
	public static final String FOB_DDU_DeliveredDutyUnpaidFedEx = "DDU";
	/** DEQ - Delivered Ex Quay = DEQ */
	public static final String FOB_DEQ_DeliveredExQuay = "DEQ";
	/** DES - Delivered Ex Ship = DES */
	public static final String FOB_DES_DeliveredExShip = "DES";
	/** Domestic FOB Destination = DFOBD */
	public static final String FOB_DomesticFOBDestination = "DFOBD";
	/** EXW - Ex Works = EXW */
	public static final String FOB_EXW_ExWorks = "EXW";
	/** FAS - Free Alongside Ship = FAS */
	public static final String FOB_FAS_FreeAlongsideShip = "FAS";
	/** FCA - Free Carrier (FedEx) = FCA */
	public static final String FOB_FCA_FreeCarrierFedEx = "FCA";
	/** FOB - Free on Board (FedEx) = FOB */
	public static final String FOB_FOB_FreeOnBoardFedEx = "FOB";
	/** DAP – Delivered At Place = DAP */
	public static final String FOB_DAPDeliveredAtPlace = "DAP";
	/** DAT (Delivered At Terminal) = DAT */
	public static final String FOB_DATDeliveredAtTerminal = "DAT";
	/** Set Freight Terms.
		@param FOB Freight Terms	  */
	public void setFOB (String FOB)
	{

		set_ValueNoCheck (COLUMNNAME_FOB, FOB);
	}

	/** Get Freight Terms.
		@return Freight Terms	  */
	public String getFOB () 
	{
		return (String)get_Value(COLUMNNAME_FOB);
	}

	/** Sea = 1 */
	public static final String MODEOFTRANSPORT_Sea = "1";
	/** Rail = 2 */
	public static final String MODEOFTRANSPORT_Rail = "2";
	/** Road = 3 */
	public static final String MODEOFTRANSPORT_Road = "3";
	/** Air = 4 */
	public static final String MODEOFTRANSPORT_Air = "4";
	/** Postal Consignment = 5 */
	public static final String MODEOFTRANSPORT_PostalConsignment = "5";
	/** Fixed Transport Installations = 7 */
	public static final String MODEOFTRANSPORT_FixedTransportInstallations = "7";
	/** Inland Waterway Transport = 8 */
	public static final String MODEOFTRANSPORT_InlandWaterwayTransport = "8";
	/** Own Propulsion = 9 */
	public static final String MODEOFTRANSPORT_OwnPropulsion = "9";
	/** Set Mode of Transport.
		@param ModeOfTransport Mode of Transport	  */
	public void setModeOfTransport (String ModeOfTransport)
	{

		set_Value (COLUMNNAME_ModeOfTransport, ModeOfTransport);
	}

	/** Get Mode of Transport.
		@return Mode of Transport	  */
	public String getModeOfTransport () 
	{
		return (String)get_Value(COLUMNNAME_ModeOfTransport);
	}
}