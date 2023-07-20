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

import org.compiere.model.I_Persistent;
import org.compiere.model.MTable;
import org.compiere.model.PO;
import org.compiere.model.POInfo;

/** Generated Model for M_Product_Commodity
 *  @author iDempiere (generated)
 *  @version Release 11 - $Id$ */
@org.adempiere.base.Model(table="M_Product_Commodity")
public class X_M_Product_Commodity extends PO implements I_M_Product_Commodity, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20230720L;

    /** Standard Constructor */
    public X_M_Product_Commodity (Properties ctx, int M_Product_Commodity_ID, String trxName)
    {
      super (ctx, M_Product_Commodity_ID, trxName);
      /** if (M_Product_Commodity_ID == 0)
        {
			setIsSummary (false);
			setM_Product_Commodity_ID (0);
			setName (null);
        } */
    }

    /** Standard Constructor */
    public X_M_Product_Commodity (Properties ctx, int M_Product_Commodity_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, M_Product_Commodity_ID, trxName, virtualColumns);
      /** if (M_Product_Commodity_ID == 0)
        {
			setIsSummary (false);
			setM_Product_Commodity_ID (0);
			setName (null);
        } */
    }

    /** Standard Constructor */
    public X_M_Product_Commodity (Properties ctx, String M_Product_Commodity_UU, String trxName)
    {
      super (ctx, M_Product_Commodity_UU, trxName);
      /** if (M_Product_Commodity_UU == null)
        {
			setIsSummary (false);
			setM_Product_Commodity_ID (0);
			setName (null);
        } */
    }

    /** Standard Constructor */
    public X_M_Product_Commodity (Properties ctx, String M_Product_Commodity_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, M_Product_Commodity_UU, trxName, virtualColumns);
      /** if (M_Product_Commodity_UU == null)
        {
			setIsSummary (false);
			setM_Product_Commodity_ID (0);
			setName (null);
        } */
    }

    /** Load Constructor */
    public X_M_Product_Commodity (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_M_Product_Commodity[")
        .append(get_ID()).append(",Name=").append(getName()).append("]");
      return sb.toString();
    }

	/** Set Description.
		@param Description Optional short description of the record
	*/
	public void setDescription (String Description)
	{
		set_Value (COLUMNNAME_Description, Description);
	}

	/** Get Description.
		@return Optional short description of the record
	  */
	public String getDescription()
	{
		return (String)get_Value(COLUMNNAME_Description);
	}

	/** Set Summary Level.
		@param IsSummary This is a summary entity
	*/
	public void setIsSummary (boolean IsSummary)
	{
		set_Value (COLUMNNAME_IsSummary, Boolean.valueOf(IsSummary));
	}

	/** Get Summary Level.
		@return This is a summary entity
	  */
	public boolean isSummary()
	{
		Object oo = get_Value(COLUMNNAME_IsSummary);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Product Commodity.
		@param M_Product_Commodity_ID Product Commodity
	*/
	public void setM_Product_Commodity_ID (int M_Product_Commodity_ID)
	{
		if (M_Product_Commodity_ID < 1)
			set_ValueNoCheck (COLUMNNAME_M_Product_Commodity_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_M_Product_Commodity_ID, Integer.valueOf(M_Product_Commodity_ID));
	}

	/** Get Product Commodity.
		@return Product Commodity	  */
	public int getM_Product_Commodity_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_M_Product_Commodity_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public eu.idempiere.model.I_M_Product_Commodity getM_Product_Commodity_Parent() throws RuntimeException
	{
		return (eu.idempiere.model.I_M_Product_Commodity)MTable.get(getCtx(), eu.idempiere.model.I_M_Product_Commodity.Table_ID)
			.getPO(getM_Product_Commodity_Parent_ID(), get_TrxName());
	}

	/** Set Parent Commodity.
		@param M_Product_Commodity_Parent_ID Parent Commodity
	*/
	public void setM_Product_Commodity_Parent_ID (int M_Product_Commodity_Parent_ID)
	{
		if (M_Product_Commodity_Parent_ID < 1)
			set_Value (COLUMNNAME_M_Product_Commodity_Parent_ID, null);
		else
			set_Value (COLUMNNAME_M_Product_Commodity_Parent_ID, Integer.valueOf(M_Product_Commodity_Parent_ID));
	}

	/** Get Parent Commodity.
		@return Parent Commodity	  */
	public int getM_Product_Commodity_Parent_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_M_Product_Commodity_Parent_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set M_Product_Commodity_UU.
		@param M_Product_Commodity_UU M_Product_Commodity_UU
	*/
	public void setM_Product_Commodity_UU (String M_Product_Commodity_UU)
	{
		set_Value (COLUMNNAME_M_Product_Commodity_UU, M_Product_Commodity_UU);
	}

	/** Get M_Product_Commodity_UU.
		@return M_Product_Commodity_UU	  */
	public String getM_Product_Commodity_UU()
	{
		return (String)get_Value(COLUMNNAME_M_Product_Commodity_UU);
	}

	/** Set Name.
		@param Name Alphanumeric identifier of the entity
	*/
	public void setName (String Name)
	{
		set_Value (COLUMNNAME_Name, Name);
	}

	/** Get Name.
		@return Alphanumeric identifier of the entity
	  */
	public String getName()
	{
		return (String)get_Value(COLUMNNAME_Name);
	}

	/** Set Search Key.
		@param Value Search key for the record in the format required - must be unique
	*/
	public void setValue (String Value)
	{
		set_Value (COLUMNNAME_Value, Value);
	}

	/** Get Search Key.
		@return Search key for the record in the format required - must be unique
	  */
	public String getValue()
	{
		return (String)get_Value(COLUMNNAME_Value);
	}
}