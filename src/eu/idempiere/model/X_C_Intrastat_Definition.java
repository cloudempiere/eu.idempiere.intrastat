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

/** Generated Model for C_Intrastat_Definition
 *  @author iDempiere (generated) 
 *  @version Release 8.2 - $Id$ */
public class X_C_Intrastat_Definition extends PO implements I_C_Intrastat_Definition, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20230714L;

    /** Standard Constructor */
    public X_C_Intrastat_Definition (Properties ctx, int C_Intrastat_Definition_ID, String trxName)
    {
      super (ctx, C_Intrastat_Definition_ID, trxName);
      /** if (C_Intrastat_Definition_ID == 0)
        {
			setC_Intrastat_Definition_ID (0);
			setName (null);
        } */
    }

    /** Load Constructor */
    public X_C_Intrastat_Definition (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_C_Intrastat_Definition[")
        .append(get_ID()).append(",Name=").append(getName()).append("]");
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

	/** Set Intrastat Definition.
		@param C_Intrastat_Definition_ID Intrastat Definition	  */
	public void setC_Intrastat_Definition_ID (int C_Intrastat_Definition_ID)
	{
		if (C_Intrastat_Definition_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_C_Intrastat_Definition_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_C_Intrastat_Definition_ID, Integer.valueOf(C_Intrastat_Definition_ID));
	}

	/** Get Intrastat Definition.
		@return Intrastat Definition	  */
	public int getC_Intrastat_Definition_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Intrastat_Definition_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set C_Intrastat_Definition_UU.
		@param C_Intrastat_Definition_UU C_Intrastat_Definition_UU	  */
	public void setC_Intrastat_Definition_UU (String C_Intrastat_Definition_UU)
	{
		set_ValueNoCheck (COLUMNNAME_C_Intrastat_Definition_UU, C_Intrastat_Definition_UU);
	}

	/** Get C_Intrastat_Definition_UU.
		@return C_Intrastat_Definition_UU	  */
	public String getC_Intrastat_Definition_UU () 
	{
		return (String)get_Value(COLUMNNAME_C_Intrastat_Definition_UU);
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

	public org.eevolution.model.I_C_TaxGroup getC_TaxGroup() throws RuntimeException
    {
		return (org.eevolution.model.I_C_TaxGroup)MTable.get(getCtx(), org.eevolution.model.I_C_TaxGroup.Table_Name)
			.getPO(getC_TaxGroup_ID(), get_TrxName());	}

	/** Set Tax Group.
		@param C_TaxGroup_ID Tax Group	  */
	public void setC_TaxGroup_ID (int C_TaxGroup_ID)
	{
		if (C_TaxGroup_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_C_TaxGroup_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_C_TaxGroup_ID, Integer.valueOf(C_TaxGroup_ID));
	}

	/** Get Tax Group.
		@return Tax Group	  */
	public int getC_TaxGroup_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_TaxGroup_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	/** DocBaseType AD_Reference_ID=183 */
	public static final int DOCBASETYPE_AD_Reference_ID=183;
	/** GL Journal = GLJ */
	public static final String DOCBASETYPE_GLJournal = "GLJ";
	/** GL Document = GLD */
	public static final String DOCBASETYPE_GLDocument = "GLD";
	/** AP Invoice = API */
	public static final String DOCBASETYPE_APInvoice = "API";
	/** AP Payment = APP */
	public static final String DOCBASETYPE_APPayment = "APP";
	/** AR Invoice = ARI */
	public static final String DOCBASETYPE_ARInvoice = "ARI";
	/** AR Receipt = ARR */
	public static final String DOCBASETYPE_ARReceipt = "ARR";
	/** Sales Order = SOO */
	public static final String DOCBASETYPE_SalesOrder = "SOO";
	/** AR Pro Forma Invoice = ARF */
	public static final String DOCBASETYPE_ARProFormaInvoice = "ARF";
	/** Material Delivery = MMS */
	public static final String DOCBASETYPE_MaterialDelivery = "MMS";
	/** Material Receipt = MMR */
	public static final String DOCBASETYPE_MaterialReceipt = "MMR";
	/** Material Movement = MMM */
	public static final String DOCBASETYPE_MaterialMovement = "MMM";
	/** Purchase Order = POO */
	public static final String DOCBASETYPE_PurchaseOrder = "POO";
	/** Purchase Requisition = POR */
	public static final String DOCBASETYPE_PurchaseRequisition = "POR";
	/** Material Physical Inventory = MMI */
	public static final String DOCBASETYPE_MaterialPhysicalInventory = "MMI";
	/** AP Credit Memo = APC */
	public static final String DOCBASETYPE_APCreditMemo = "APC";
	/** AR Credit Memo = ARC */
	public static final String DOCBASETYPE_ARCreditMemo = "ARC";
	/** Bank Statement = CMB */
	public static final String DOCBASETYPE_BankStatement = "CMB";
	/** Cash Journal = CMC */
	public static final String DOCBASETYPE_CashJournal = "CMC";
	/** Payment Allocation = CMA */
	public static final String DOCBASETYPE_PaymentAllocation = "CMA";
	/** Material Production = MMP */
	public static final String DOCBASETYPE_MaterialProduction = "MMP";
	/** Match Invoice = MXI */
	public static final String DOCBASETYPE_MatchInvoice = "MXI";
	/** Match PO = MXP */
	public static final String DOCBASETYPE_MatchPO = "MXP";
	/** Project Issue = PJI */
	public static final String DOCBASETYPE_ProjectIssue = "PJI";
	/** Maintenance Order = MOF */
	public static final String DOCBASETYPE_MaintenanceOrder = "MOF";
	/** Manufacturing Order = MOP */
	public static final String DOCBASETYPE_ManufacturingOrder = "MOP";
	/** Quality Order = MQO */
	public static final String DOCBASETYPE_QualityOrder = "MQO";
	/** Payroll = HRP */
	public static final String DOCBASETYPE_Payroll = "HRP";
	/** Distribution Order = DOO */
	public static final String DOCBASETYPE_DistributionOrder = "DOO";
	/** Manufacturing Cost Collector = MCC */
	public static final String DOCBASETYPE_ManufacturingCostCollector = "MCC";
	/** Fixed Assets Addition = FAA */
	public static final String DOCBASETYPE_FixedAssetsAddition = "FAA";
	/** Fixed Assets Disposal = FAD */
	public static final String DOCBASETYPE_FixedAssetsDisposal = "FAD";
	/** Fixed Assets Depreciation = FDP */
	public static final String DOCBASETYPE_FixedAssetsDepreciation = "FDP";
	/** Tax Declaration = TXD */
	public static final String DOCBASETYPE_TaxDeclaration = "TXD";
	/** Contract Simple = CTS */
	public static final String DOCBASETYPE_ContractSimple = "CTS";
	/** Contract Periodic = CTP */
	public static final String DOCBASETYPE_ContractPeriodic = "CTP";
	/** Project/Repair Order = ROR */
	public static final String DOCBASETYPE_ProjectRepairOrder = "ROR";
	/** Warehouse Managment Order = WMO */
	public static final String DOCBASETYPE_WarehouseManagmentOrder = "WMO";
	/** Contract Project = CTJ */
	public static final String DOCBASETYPE_ContractProject = "CTJ";
	/** Contract Subscription = CTU */
	public static final String DOCBASETYPE_ContractSubscription = "CTU";
	/** Contract Rental = CTR */
	public static final String DOCBASETYPE_ContractRental = "CTR";
	/** Distribution Order - Auto = DOA */
	public static final String DOCBASETYPE_DistributionOrder_Auto = "DOA";
	/** Cloud Account = CTA */
	public static final String DOCBASETYPE_CloudAccount = "CTA";
	/** Financial Report = PAA */
	public static final String DOCBASETYPE_FinancialReport = "PAA";
	/** Fixed Assets Revaluation = FAR */
	public static final String DOCBASETYPE_FixedAssetsRevaluation = "FAR";
	/** Expense Report = ERD */
	public static final String DOCBASETYPE_ExpenseReport = "ERD";
	/** Deliveries (Shipment/Receipt) Confirmation = MRD */
	public static final String DOCBASETYPE_DeliveriesShipmentReceiptConfirmation = "MRD";
	/** Movement Confirmation = MRM */
	public static final String DOCBASETYPE_MovementConfirmation = "MRM";
	/** Warehouse Managment Task = WMT */
	public static final String DOCBASETYPE_WarehouseManagmentTask = "WMT";
	/** Transport Order = TRO */
	public static final String DOCBASETYPE_TransportOrder = "TRO";
	/** Project = PRJ */
	public static final String DOCBASETYPE_Project = "PRJ";
	/** Packtype Transaction = PTT */
	public static final String DOCBASETYPE_PacktypeTransaction = "PTT";
	/** Set Document BaseType.
		@param DocBaseType 
		Logical type of document
	  */
	public void setDocBaseType (String DocBaseType)
	{

		set_ValueNoCheck (COLUMNNAME_DocBaseType, DocBaseType);
	}

	/** Get Document BaseType.
		@return Logical type of document
	  */
	public String getDocBaseType () 
	{
		return (String)get_Value(COLUMNNAME_DocBaseType);
	}

	/** Intrastat Transaction Receipt = ITR */
	public static final String INTRASTATTYPE_IntrastatTransactionReceipt = "ITR";
	/** Intrastat Trasnsaction Shipment = ITS */
	public static final String INTRASTATTYPE_IntrastatTrasnsactionShipment = "ITS";
	/** Set Intrastat Type.
		@param IntrastatType Intrastat Type	  */
	public void setIntrastatType (String IntrastatType)
	{

		set_Value (COLUMNNAME_IntrastatType, IntrastatType);
	}

	/** Get Intrastat Type.
		@return Intrastat Type	  */
	public String getIntrastatType () 
	{
		return (String)get_Value(COLUMNNAME_IntrastatType);
	}

	/** Set Sales Transaction.
		@param IsSOTrx 
		This is a Sales Transaction
	  */
	public void setIsSOTrx (boolean IsSOTrx)
	{
		set_ValueNoCheck (COLUMNNAME_IsSOTrx, Boolean.valueOf(IsSOTrx));
	}

	/** Get Sales Transaction.
		@return This is a Sales Transaction
	  */
	public boolean isSOTrx () 
	{
		Object oo = get_Value(COLUMNNAME_IsSOTrx);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Name.
		@param Name 
		Alphanumeric identifier of the entity
	  */
	public void setName (String Name)
	{
		set_Value (COLUMNNAME_Name, Name);
	}

	/** Get Name.
		@return Alphanumeric identifier of the entity
	  */
	public String getName () 
	{
		return (String)get_Value(COLUMNNAME_Name);
	}

	/** Set Search Key.
		@param Value 
		Search key for the record in the format required - must be unique
	  */
	public void setValue (String Value)
	{
		set_Value (COLUMNNAME_Value, Value);
	}

	/** Get Search Key.
		@return Search key for the record in the format required - must be unique
	  */
	public String getValue () 
	{
		return (String)get_Value(COLUMNNAME_Value);
	}
}