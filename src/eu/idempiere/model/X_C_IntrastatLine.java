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

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Properties;

import org.compiere.model.I_Persistent;
import org.compiere.model.MTable;
import org.compiere.model.PO;
import org.compiere.model.POInfo;
import org.compiere.util.Env;

/** Generated Model for C_IntrastatLine
 *  @author iDempiere (generated) 
 *  @version Release 8.2 - $Id$ */
public class X_C_IntrastatLine extends PO implements I_C_IntrastatLine, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20230714L;

    /** Standard Constructor */
    public X_C_IntrastatLine (Properties ctx, int C_IntrastatLine_ID, String trxName)
    {
      super (ctx, C_IntrastatLine_ID, trxName);
      /** if (C_IntrastatLine_ID == 0)
        {
			setC_IntrastatLine_ID (0);
        } */
    }

    /** Load Constructor */
    public X_C_IntrastatLine (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_C_IntrastatLine[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** 11 Transactions Actual Change Of OwnershipBusiness = 1,1 */
	public static final String BUSINESSTYPEINTRASTAT_11TransactionsActualChangeOfOwnershipBusiness = "1,1";
	/** 12 Transactions Actual Change Of Ownership Private Consumer = 1,2 */
	public static final String BUSINESSTYPEINTRASTAT_12TransactionsActualChangeOfOwnershipPrivateConsumer = "1,2";
	/** 21 Return Of Goods = 2,1 */
	public static final String BUSINESSTYPEINTRASTAT_21ReturnOfGoods = "2,1";
	/** 22 Replacement For Returned Goods = 2,2 */
	public static final String BUSINESSTYPEINTRASTAT_22ReplacementForReturnedGoods = "2,2";
	/** 23 Replacement EG Under Warranty For Goods Not Being Re = 2,3 */
	public static final String BUSINESSTYPEINTRASTAT_23ReplacementEGUnderWarrantyForGoodsNotBeingRe = "2,3";
	/** 31 Movements To From A Warehouse = 3,1 */
	public static final String BUSINESSTYPEINTRASTAT_31MovementsToFromAWarehouse = "3,1";
	/** 32 Supply For Sale On Approval Or AfterTrial = 3,2 */
	public static final String BUSINESSTYPEINTRASTAT_32SupplyForSaleOnApprovalOrAfterTrial = "3,2";
	/** 33 Financial Leasing = 3,3 */
	public static final String BUSINESSTYPEINTRASTAT_33FinancialLeasing = "3,3";
	/** 34 Transactions Without Financial Compensation = 3,4 */
	public static final String BUSINESSTYPEINTRASTAT_34TransactionsWithoutFinancialCompensation = "3,4";
	/** 41 Goods Expected To Return To TheInitial Member = 4,1 */
	public static final String BUSINESSTYPEINTRASTAT_41GoodsExpectedToReturnToTheInitialMember = "4,1";
	/** 42 Goods Not Expected To Return To TheInitial Member = 4,2 */
	public static final String BUSINESSTYPEINTRASTAT_42GoodsNotExpectedToReturnToTheInitialMember = "4,2";
	/** 51 Goods Returning To The Initial Member = 5,1 */
	public static final String BUSINESSTYPEINTRASTAT_51GoodsReturningToTheInitialMember = "5,1";
	/** 52 Goods Not Returning To The Initial Member State Country = 5,2 */
	public static final String BUSINESSTYPEINTRASTAT_52GoodsNotReturningToTheInitialMemberStateCountry = "5,2";
	/** 60 Operations Following Repair Or Maintenance = 6,0 */
	public static final String BUSINESSTYPEINTRASTAT_60OperationsFollowingRepairOrMaintenance = "6,0";
	/** 71 Release Of Goods For Free Circulation In A Member State = 7,1 */
	public static final String BUSINESSTYPEINTRASTAT_71ReleaseOfGoodsForFreeCirculationInAMemberState = "7,1";
	/** 72 Transportation Of Goods From One Member State To Another = 7,2 */
	public static final String BUSINESSTYPEINTRASTAT_72TransportationOfGoodsFromOneMemberStateToAnother = "7,2";
	/** 80 TransactionsI nvolving The Supply Of Building Materials = 8,0 */
	public static final String BUSINESSTYPEINTRASTAT_80TransactionsINvolvingTheSupplyOfBuildingMaterials = "8,0";
	/** 91 Hire Loan And Operational Leasing Longer Than 24 Month = 9,1 */
	public static final String BUSINESSTYPEINTRASTAT_91HireLoanAndOperationalLeasingLongerThan24Month = "9,1";
	/** 92 Other  = 9,2 */
	public static final String BUSINESSTYPEINTRASTAT_92Other = "9,2";
	/** Set Business Type Intrastat.
		@param BusinessTypeIntrastat Business Type Intrastat	  */
	public void setBusinessTypeIntrastat (String BusinessTypeIntrastat)
	{

		set_Value (COLUMNNAME_BusinessTypeIntrastat, BusinessTypeIntrastat);
	}

	/** Get Business Type Intrastat.
		@return Business Type Intrastat	  */
	public String getBusinessTypeIntrastat () 
	{
		return (String)get_Value(COLUMNNAME_BusinessTypeIntrastat);
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

	public org.compiere.model.I_C_Country getC_Country() throws RuntimeException
    {
		return (org.compiere.model.I_C_Country)MTable.get(getCtx(), org.compiere.model.I_C_Country.Table_Name)
			.getPO(getC_Country_ID(), get_TrxName());	}

	/** Set Country.
		@param C_Country_ID 
		Country 
	  */
	public void setC_Country_ID (int C_Country_ID)
	{
		if (C_Country_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_C_Country_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_C_Country_ID, Integer.valueOf(C_Country_ID));
	}

	/** Get Country.
		@return Country 
	  */
	public int getC_Country_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Country_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_C_Intrastat getC_Intrastat() throws RuntimeException
    {
		return (I_C_Intrastat)MTable.get(getCtx(), I_C_Intrastat.Table_Name)
			.getPO(getC_Intrastat_ID(), get_TrxName());	}

	/** Set Intrastat.
		@param C_Intrastat_ID Intrastat	  */
	public void setC_Intrastat_ID (int C_Intrastat_ID)
	{
		if (C_Intrastat_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_C_Intrastat_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_C_Intrastat_ID, Integer.valueOf(C_Intrastat_ID));
	}

	/** Get Intrastat.
		@return Intrastat	  */
	public int getC_Intrastat_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Intrastat_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Intrastat Line.
		@param C_IntrastatLine_ID Intrastat Line	  */
	public void setC_IntrastatLine_ID (int C_IntrastatLine_ID)
	{
		if (C_IntrastatLine_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_C_IntrastatLine_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_C_IntrastatLine_ID, Integer.valueOf(C_IntrastatLine_ID));
	}

	/** Get Intrastat Line.
		@return Intrastat Line	  */
	public int getC_IntrastatLine_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_IntrastatLine_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set C_IntrastatLine_UU.
		@param C_IntrastatLine_UU C_IntrastatLine_UU	  */
	public void setC_IntrastatLine_UU (String C_IntrastatLine_UU)
	{
		set_ValueNoCheck (COLUMNNAME_C_IntrastatLine_UU, C_IntrastatLine_UU);
	}

	/** Get C_IntrastatLine_UU.
		@return C_IntrastatLine_UU	  */
	public String getC_IntrastatLine_UU () 
	{
		return (String)get_Value(COLUMNNAME_C_IntrastatLine_UU);
	}

	public I_C_Intrastat_Port getC_Intrastat_Port() throws RuntimeException
    {
		return (I_C_Intrastat_Port)MTable.get(getCtx(), I_C_Intrastat_Port.Table_Name)
			.getPO(getC_Intrastat_Port_ID(), get_TrxName());	}

	/** Set Intrastat Port.
		@param C_Intrastat_Port_ID Intrastat Port	  */
	public void setC_Intrastat_Port_ID (int C_Intrastat_Port_ID)
	{
		if (C_Intrastat_Port_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_C_Intrastat_Port_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_C_Intrastat_Port_ID, Integer.valueOf(C_Intrastat_Port_ID));
	}

	/** Get Intrastat Port.
		@return Intrastat Port	  */
	public int getC_Intrastat_Port_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Intrastat_Port_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_InvoiceLine getC_InvoiceLine() throws RuntimeException
    {
		return (org.compiere.model.I_C_InvoiceLine)MTable.get(getCtx(), org.compiere.model.I_C_InvoiceLine.Table_Name)
			.getPO(getC_InvoiceLine_ID(), get_TrxName());	}

	/** Set Invoice Line.
		@param C_InvoiceLine_ID 
		Invoice Detail Line
	  */
	public void setC_InvoiceLine_ID (int C_InvoiceLine_ID)
	{
		if (C_InvoiceLine_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_C_InvoiceLine_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_C_InvoiceLine_ID, Integer.valueOf(C_InvoiceLine_ID));
	}

	/** Get Invoice Line.
		@return Invoice Detail Line
	  */
	public int getC_InvoiceLine_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_InvoiceLine_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Country Code Manufacurer.
		@param CountryCodeManufacurer Country Code Manufacurer	  */
	public void setCountryCodeManufacurer (String CountryCodeManufacurer)
	{
		set_Value (COLUMNNAME_CountryCodeManufacurer, CountryCodeManufacurer);
	}

	/** Get Country Code Manufacurer.
		@return Country Code Manufacurer	  */
	public String getCountryCodeManufacurer () 
	{
		return (String)get_Value(COLUMNNAME_CountryCodeManufacurer);
	}

	public org.compiere.model.I_C_UOM getC_UOM() throws RuntimeException
    {
		return (org.compiere.model.I_C_UOM)MTable.get(getCtx(), org.compiere.model.I_C_UOM.Table_Name)
			.getPO(getC_UOM_ID(), get_TrxName());	}

	/** Set UOM.
		@param C_UOM_ID 
		Unit of Measure
	  */
	public void setC_UOM_ID (int C_UOM_ID)
	{
		if (C_UOM_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_C_UOM_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_C_UOM_ID, Integer.valueOf(C_UOM_ID));
	}

	/** Get UOM.
		@return Unit of Measure
	  */
	public int getC_UOM_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_UOM_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Date Invoiced.
		@param DateInvoiced 
		Date printed on Invoice
	  */
	public void setDateInvoiced (Timestamp DateInvoiced)
	{
		set_ValueNoCheck (COLUMNNAME_DateInvoiced, DateInvoiced);
	}

	/** Get Date Invoiced.
		@return Date printed on Invoice
	  */
	public Timestamp getDateInvoiced () 
	{
		return (Timestamp)get_Value(COLUMNNAME_DateInvoiced);
	}

	/** Set Description.
		@param Description 
		Optional short description of the record
	  */
	public void setDescription (String Description)
	{
		set_Value (COLUMNNAME_Description, Description);
	}

	/** Get Description.
		@return Optional short description of the record
	  */
	public String getDescription () 
	{
		return (String)get_Value(COLUMNNAME_Description);
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

	/** Set Landed Cost Amount.
		@param LandedCostAmt Landed Cost Amount	  */
	public void setLandedCostAmt (BigDecimal LandedCostAmt)
	{
		set_Value (COLUMNNAME_LandedCostAmt, LandedCostAmt);
	}

	/** Get Landed Cost Amount.
		@return Landed Cost Amount	  */
	public BigDecimal getLandedCostAmt () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_LandedCostAmt);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Landed Cost Description.
		@param LandedCostDesc Landed Cost Description	  */
	public void setLandedCostDesc (String LandedCostDesc)
	{
		set_Value (COLUMNNAME_LandedCostDesc, LandedCostDesc);
	}

	/** Get Landed Cost Description.
		@return Landed Cost Description	  */
	public String getLandedCostDesc () 
	{
		return (String)get_Value(COLUMNNAME_LandedCostDesc);
	}

	/** Set Line Amount.
		@param LineNetAmt 
		Line Extended Amount (Quantity x Actual Price) without Freight and Charges
	  */
	public void setLineNetAmt (BigDecimal LineNetAmt)
	{
		set_ValueNoCheck (COLUMNNAME_LineNetAmt, LineNetAmt);
	}

	/** Get Line Amount.
		@return Line Extended Amount (Quantity x Actual Price) without Freight and Charges
	  */
	public BigDecimal getLineNetAmt () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_LineNetAmt);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	public org.compiere.model.I_C_BPartner getManufacturer() throws RuntimeException
    {
		return (org.compiere.model.I_C_BPartner)MTable.get(getCtx(), org.compiere.model.I_C_BPartner.Table_Name)
			.getPO(getManufacturer_ID(), get_TrxName());	}

	/** Set Manufacturer.
		@param Manufacturer_ID Manufacturer	  */
	public void setManufacturer_ID (int Manufacturer_ID)
	{
		if (Manufacturer_ID < 1) 
			set_Value (COLUMNNAME_Manufacturer_ID, null);
		else 
			set_Value (COLUMNNAME_Manufacturer_ID, Integer.valueOf(Manufacturer_ID));
	}

	/** Get Manufacturer.
		@return Manufacturer	  */
	public int getManufacturer_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Manufacturer_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	public I_M_Product_Commodity getM_Product_Commodity() throws RuntimeException
    {
		return (I_M_Product_Commodity)MTable.get(getCtx(), I_M_Product_Commodity.Table_Name)
			.getPO(getM_Product_Commodity_ID(), get_TrxName());	}

	/** Set Product Commodity.
		@param M_Product_Commodity_ID Product Commodity	  */
	public void setM_Product_Commodity_ID (int M_Product_Commodity_ID)
	{
		if (M_Product_Commodity_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_M_Product_Commodity_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_M_Product_Commodity_ID, Integer.valueOf(M_Product_Commodity_ID));
	}

	/** Get Product Commodity.
		@return Product Commodity	  */
	public int getM_Product_Commodity_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_M_Product_Commodity_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_M_Product getM_Product() throws RuntimeException
    {
		return (org.compiere.model.I_M_Product)MTable.get(getCtx(), org.compiere.model.I_M_Product.Table_Name)
			.getPO(getM_Product_ID(), get_TrxName());	}

	/** Set Product.
		@param M_Product_ID 
		Product, Service, Item
	  */
	public void setM_Product_ID (int M_Product_ID)
	{
		if (M_Product_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_M_Product_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_M_Product_ID, Integer.valueOf(M_Product_ID));
	}

	/** Get Product.
		@return Product, Service, Item
	  */
	public int getM_Product_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_M_Product_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Netto Weight.
		@param NettoWeight Netto Weight	  */
	public void setNettoWeight (BigDecimal NettoWeight)
	{
		set_Value (COLUMNNAME_NettoWeight, NettoWeight);
	}

	/** Get Netto Weight.
		@return Netto Weight	  */
	public BigDecimal getNettoWeight () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_NettoWeight);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Invoiced Quantity.
		@param QtyInvoiced 
		Invoiced Quantity
	  */
	public void setQtyInvoiced (BigDecimal QtyInvoiced)
	{
		set_ValueNoCheck (COLUMNNAME_QtyInvoiced, QtyInvoiced);
	}

	/** Get Invoiced Quantity.
		@return Invoiced Quantity
	  */
	public BigDecimal getQtyInvoiced () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_QtyInvoiced);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Sequence.
		@param SeqNo 
		Method of ordering records; lowest number comes first
	  */
	public void setSeqNo (int SeqNo)
	{
		set_Value (COLUMNNAME_SeqNo, Integer.valueOf(SeqNo));
	}

	/** Get Sequence.
		@return Method of ordering records; lowest number comes first
	  */
	public int getSeqNo () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_SeqNo);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Statistical Value.
		@param StatisticalValue Statistical Value	  */
	public void setStatisticalValue (BigDecimal StatisticalValue)
	{
		set_Value (COLUMNNAME_StatisticalValue, StatisticalValue);
	}

	/** Get Statistical Value.
		@return Statistical Value	  */
	public BigDecimal getStatisticalValue () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_StatisticalValue);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Tax ID.
		@param TaxID 
		Tax Identification
	  */
	public void setTaxID (String TaxID)
	{
		set_ValueNoCheck (COLUMNNAME_TaxID, TaxID);
	}

	/** Get Tax ID.
		@return Tax Identification
	  */
	public String getTaxID () 
	{
		return (String)get_Value(COLUMNNAME_TaxID);
	}
}