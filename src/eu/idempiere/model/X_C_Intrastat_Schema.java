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
import java.util.Properties;
import org.compiere.model.*;
import org.compiere.util.Env;

/** Generated Model for C_Intrastat_Schema
 *  @author iDempiere (generated) 
 *  @version Release 8.2 - $Id$ */
public class X_C_Intrastat_Schema extends PO implements I_C_Intrastat_Schema, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20230720L;

    /** Standard Constructor */
    public X_C_Intrastat_Schema (Properties ctx, int C_Intrastat_Schema_ID, String trxName)
    {
      super (ctx, C_Intrastat_Schema_ID, trxName);
      /** if (C_Intrastat_Schema_ID == 0)
        {
			setC_Intrastat_Schema_ID (0);
			setName (null);
        } */
    }

    /** Load Constructor */
    public X_C_Intrastat_Schema (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 7 - System - Client - Org 
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
      StringBuilder sb = new StringBuilder ("X_C_Intrastat_Schema[")
        .append(get_ID()).append(",Name=").append(getName()).append("]");
      return sb.toString();
    }

	public org.compiere.model.I_C_AcctSchema getC_AcctSchema() throws RuntimeException
    {
		return (org.compiere.model.I_C_AcctSchema)MTable.get(getCtx(), org.compiere.model.I_C_AcctSchema.Table_Name)
			.getPO(getC_AcctSchema_ID(), get_TrxName());	}

	/** Set Accounting Schema.
		@param C_AcctSchema_ID 
		Rules for accounting
	  */
	public void setC_AcctSchema_ID (int C_AcctSchema_ID)
	{
		if (C_AcctSchema_ID < 1) 
			set_Value (COLUMNNAME_C_AcctSchema_ID, null);
		else 
			set_Value (COLUMNNAME_C_AcctSchema_ID, Integer.valueOf(C_AcctSchema_ID));
	}

	/** Get Accounting Schema.
		@return Rules for accounting
	  */
	public int getC_AcctSchema_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_AcctSchema_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_Calendar getC_Calendar() throws RuntimeException
    {
		return (org.compiere.model.I_C_Calendar)MTable.get(getCtx(), org.compiere.model.I_C_Calendar.Table_Name)
			.getPO(getC_Calendar_ID(), get_TrxName());	}

	/** Set Calendar.
		@param C_Calendar_ID 
		Accounting Calendar Name
	  */
	public void setC_Calendar_ID (int C_Calendar_ID)
	{
		if (C_Calendar_ID < 1) 
			set_Value (COLUMNNAME_C_Calendar_ID, null);
		else 
			set_Value (COLUMNNAME_C_Calendar_ID, Integer.valueOf(C_Calendar_ID));
	}

	/** Get Calendar.
		@return Accounting Calendar Name
	  */
	public int getC_Calendar_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Calendar_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Intrastat Schema Country.
		@param C_IntrastatSchemaCountry_ID Intrastat Schema Country	  */
	public void setC_IntrastatSchemaCountry_ID (int C_IntrastatSchemaCountry_ID)
	{
		if (C_IntrastatSchemaCountry_ID < 1) 
			set_Value (COLUMNNAME_C_IntrastatSchemaCountry_ID, null);
		else 
			set_Value (COLUMNNAME_C_IntrastatSchemaCountry_ID, Integer.valueOf(C_IntrastatSchemaCountry_ID));
	}

	/** Get Intrastat Schema Country.
		@return Intrastat Schema Country	  */
	public int getC_IntrastatSchemaCountry_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_IntrastatSchemaCountry_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

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

	/** Set C_Intrastat_Schema_UU.
		@param C_Intrastat_Schema_UU C_Intrastat_Schema_UU	  */
	public void setC_Intrastat_Schema_UU (String C_Intrastat_Schema_UU)
	{
		set_Value (COLUMNNAME_C_Intrastat_Schema_UU, C_Intrastat_Schema_UU);
	}

	/** Get C_Intrastat_Schema_UU.
		@return C_Intrastat_Schema_UU	  */
	public String getC_Intrastat_Schema_UU () 
	{
		return (String)get_Value(COLUMNNAME_C_Intrastat_Schema_UU);
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

		set_Value (COLUMNNAME_FOB, FOB);
	}

	/** Get Freight Terms.
		@return Freight Terms	  */
	public String getFOB () 
	{
		return (String)get_Value(COLUMNNAME_FOB);
	}

	public org.compiere.model.I_C_CountryGroup getIntrastatCountryGroup() throws RuntimeException
    {
		return (org.compiere.model.I_C_CountryGroup)MTable.get(getCtx(), org.compiere.model.I_C_CountryGroup.Table_Name)
			.getPO(getIntrastatCountryGroup_ID(), get_TrxName());	}

	/** Set Intrastat Country Group.
		@param IntrastatCountryGroup_ID Intrastat Country Group	  */
	public void setIntrastatCountryGroup_ID (int IntrastatCountryGroup_ID)
	{
		if (IntrastatCountryGroup_ID < 1) 
			set_Value (COLUMNNAME_IntrastatCountryGroup_ID, null);
		else 
			set_Value (COLUMNNAME_IntrastatCountryGroup_ID, Integer.valueOf(IntrastatCountryGroup_ID));
	}

	/** Get Intrastat Country Group.
		@return Intrastat Country Group	  */
	public int getIntrastatCountryGroup_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_IntrastatCountryGroup_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	/** Set Weight Multiplier.
		@param WeightMultiplier 
		Coefficient to multiply weight from client weight settings
	  */
	public void setWeightMultiplier (BigDecimal WeightMultiplier)
	{
		set_Value (COLUMNNAME_WeightMultiplier, WeightMultiplier);
	}

	/** Get Weight Multiplier.
		@return Coefficient to multiply weight from client weight settings
	  */
	public BigDecimal getWeightMultiplier () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_WeightMultiplier);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}
}