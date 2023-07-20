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

/** Generated Model for C_Intrastat_Region
 *  @author iDempiere (generated) 
 *  @version Release 8.2 - $Id$ */
public class X_C_Intrastat_Region extends PO implements I_C_Intrastat_Region, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20230714L;

    /** Standard Constructor */
    public X_C_Intrastat_Region (Properties ctx, int C_Intrastat_Region_ID, String trxName)
    {
      super (ctx, C_Intrastat_Region_ID, trxName);
      /** if (C_Intrastat_Region_ID == 0)
        {
			setC_Intrastat_Region_ID (0);
        } */
    }

    /** Load Constructor */
    public X_C_Intrastat_Region (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_C_Intrastat_Region[")
        .append(get_ID()).append("]");
      return sb.toString();
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

	public I_C_Intrastat_Region getC_Intrastat_Region() throws RuntimeException
    {
		return (I_C_Intrastat_Region)MTable.get(getCtx(), I_C_Intrastat_Region.Table_Name)
			.getPO(getC_Intrastat_Region_ID(), get_TrxName());	}

	/** Set Intrastat Region.
		@param C_Intrastat_Region_ID Intrastat Region	  */
	public void setC_Intrastat_Region_ID (int C_Intrastat_Region_ID)
	{
		if (C_Intrastat_Region_ID < 1) 
			set_Value (COLUMNNAME_C_Intrastat_Region_ID, null);
		else 
			set_Value (COLUMNNAME_C_Intrastat_Region_ID, Integer.valueOf(C_Intrastat_Region_ID));
	}

	/** Get Intrastat Region.
		@return Intrastat Region	  */
	public int getC_Intrastat_Region_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Intrastat_Region_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set C_Intrastat_Region_UU.
		@param C_Intrastat_Region_UU C_Intrastat_Region_UU	  */
	public void setC_Intrastat_Region_UU (String C_Intrastat_Region_UU)
	{
		set_ValueNoCheck (COLUMNNAME_C_Intrastat_Region_UU, C_Intrastat_Region_UU);
	}

	/** Get C_Intrastat_Region_UU.
		@return C_Intrastat_Region_UU	  */
	public String getC_Intrastat_Region_UU () 
	{
		return (String)get_Value(COLUMNNAME_C_Intrastat_Region_UU);
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

	public org.compiere.model.I_C_Region getC_Region() throws RuntimeException
    {
		return (org.compiere.model.I_C_Region)MTable.get(getCtx(), org.compiere.model.I_C_Region.Table_Name)
			.getPO(getC_Region_ID(), get_TrxName());	}

	/** Set Region.
		@param C_Region_ID 
		Identifies a geographical Region
	  */
	public void setC_Region_ID (int C_Region_ID)
	{
		if (C_Region_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_C_Region_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_C_Region_ID, Integer.valueOf(C_Region_ID));
	}

	/** Get Region.
		@return Identifies a geographical Region
	  */
	public int getC_Region_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Region_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
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