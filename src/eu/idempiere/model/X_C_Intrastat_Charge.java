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

/** Generated Model for C_Intrastat_Charge
 *  @author iDempiere (generated) 
 *  @version Release 8.2 - $Id$ */
public class X_C_Intrastat_Charge extends PO implements I_C_Intrastat_Charge, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20230714L;

    /** Standard Constructor */
    public X_C_Intrastat_Charge (Properties ctx, int C_Intrastat_Charge_ID, String trxName)
    {
      super (ctx, C_Intrastat_Charge_ID, trxName);
      /** if (C_Intrastat_Charge_ID == 0)
        {
			setC_Intrastat_Charge_ID (0);
        } */
    }

    /** Load Constructor */
    public X_C_Intrastat_Charge (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_C_Intrastat_Charge[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public org.compiere.model.I_C_Charge getC_Charge() throws RuntimeException
    {
		return (org.compiere.model.I_C_Charge)MTable.get(getCtx(), org.compiere.model.I_C_Charge.Table_Name)
			.getPO(getC_Charge_ID(), get_TrxName());	}

	/** Set Charge.
		@param C_Charge_ID 
		Additional document charges
	  */
	public void setC_Charge_ID (int C_Charge_ID)
	{
		if (C_Charge_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_C_Charge_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_C_Charge_ID, Integer.valueOf(C_Charge_ID));
	}

	/** Get Charge.
		@return Additional document charges
	  */
	public int getC_Charge_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Charge_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Intrastat Charge.
		@param C_Intrastat_Charge_ID Intrastat Charge	  */
	public void setC_Intrastat_Charge_ID (int C_Intrastat_Charge_ID)
	{
		if (C_Intrastat_Charge_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_C_Intrastat_Charge_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_C_Intrastat_Charge_ID, Integer.valueOf(C_Intrastat_Charge_ID));
	}

	/** Get Intrastat Charge.
		@return Intrastat Charge	  */
	public int getC_Intrastat_Charge_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Intrastat_Charge_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set C_Intrastat_Charge_UU.
		@param C_Intrastat_Charge_UU C_Intrastat_Charge_UU	  */
	public void setC_Intrastat_Charge_UU (String C_Intrastat_Charge_UU)
	{
		set_ValueNoCheck (COLUMNNAME_C_Intrastat_Charge_UU, C_Intrastat_Charge_UU);
	}

	/** Get C_Intrastat_Charge_UU.
		@return C_Intrastat_Charge_UU	  */
	public String getC_Intrastat_Charge_UU () 
	{
		return (String)get_Value(COLUMNNAME_C_Intrastat_Charge_UU);
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
}