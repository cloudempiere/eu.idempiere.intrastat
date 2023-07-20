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
package eu.idempiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.compiere.model.*;
import org.compiere.util.KeyNamePair;

/** Generated Interface for C_Intrastat_Schema
 *  @author iDempiere (generated) 
 *  @version Release 8.2
 */
@SuppressWarnings("all")
public interface I_C_Intrastat_Schema 
{

    /** TableName=C_Intrastat_Schema */
    public static final String Table_Name = "C_Intrastat_Schema";

    /** AD_Table_ID=200371 */
    public static final int Table_ID = 200371;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 7 - System - Client - Org 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(7);

    /** Load Meta Data */

    /** Column name AD_Client_ID */
    public static final String COLUMNNAME_AD_Client_ID = "AD_Client_ID";

	/** Get Tenant.
	  * Tenant for this installation.
	  */
	public int getAD_Client_ID();

    /** Column name AD_Org_ID */
    public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

	/** Set Organization.
	  * Organizational entity within tenant
	  */
	public void setAD_Org_ID (int AD_Org_ID);

	/** Get Organization.
	  * Organizational entity within tenant
	  */
	public int getAD_Org_ID();

    /** Column name C_AcctSchema_ID */
    public static final String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";

	/** Set Accounting Schema.
	  * Rules for accounting
	  */
	public void setC_AcctSchema_ID (int C_AcctSchema_ID);

	/** Get Accounting Schema.
	  * Rules for accounting
	  */
	public int getC_AcctSchema_ID();

	public org.compiere.model.I_C_AcctSchema getC_AcctSchema() throws RuntimeException;

    /** Column name C_Calendar_ID */
    public static final String COLUMNNAME_C_Calendar_ID = "C_Calendar_ID";

	/** Set Calendar.
	  * Accounting Calendar Name
	  */
	public void setC_Calendar_ID (int C_Calendar_ID);

	/** Get Calendar.
	  * Accounting Calendar Name
	  */
	public int getC_Calendar_ID();

	public org.compiere.model.I_C_Calendar getC_Calendar() throws RuntimeException;

    /** Column name C_IntrastatSchemaCountry_ID */
    public static final String COLUMNNAME_C_IntrastatSchemaCountry_ID = "C_IntrastatSchemaCountry_ID";

	/** Set Intrastat Schema Country	  */
	public void setC_IntrastatSchemaCountry_ID (int C_IntrastatSchemaCountry_ID);

	/** Get Intrastat Schema Country	  */
	public int getC_IntrastatSchemaCountry_ID();

    /** Column name C_Intrastat_Schema_ID */
    public static final String COLUMNNAME_C_Intrastat_Schema_ID = "C_Intrastat_Schema_ID";

	/** Set Intrastat Schema	  */
	public void setC_Intrastat_Schema_ID (int C_Intrastat_Schema_ID);

	/** Get Intrastat Schema	  */
	public int getC_Intrastat_Schema_ID();

    /** Column name C_Intrastat_Schema_UU */
    public static final String COLUMNNAME_C_Intrastat_Schema_UU = "C_Intrastat_Schema_UU";

	/** Set C_Intrastat_Schema_UU	  */
	public void setC_Intrastat_Schema_UU (String C_Intrastat_Schema_UU);

	/** Get C_Intrastat_Schema_UU	  */
	public String getC_Intrastat_Schema_UU();

    /** Column name Created */
    public static final String COLUMNNAME_Created = "Created";

	/** Get Created.
	  * Date this record was created
	  */
	public Timestamp getCreated();

    /** Column name CreatedBy */
    public static final String COLUMNNAME_CreatedBy = "CreatedBy";

	/** Get Created By.
	  * User who created this records
	  */
	public int getCreatedBy();

    /** Column name Description */
    public static final String COLUMNNAME_Description = "Description";

	/** Set Description.
	  * Optional short description of the record
	  */
	public void setDescription (String Description);

	/** Get Description.
	  * Optional short description of the record
	  */
	public String getDescription();

    /** Column name FOB */
    public static final String COLUMNNAME_FOB = "FOB";

	/** Set Freight Terms	  */
	public void setFOB (String FOB);

	/** Get Freight Terms	  */
	public String getFOB();

    /** Column name IntrastatCountryGroup_ID */
    public static final String COLUMNNAME_IntrastatCountryGroup_ID = "IntrastatCountryGroup_ID";

	/** Set Intrastat Country Group	  */
	public void setIntrastatCountryGroup_ID (int IntrastatCountryGroup_ID);

	/** Get Intrastat Country Group	  */
	public int getIntrastatCountryGroup_ID();

	public org.compiere.model.I_C_CountryGroup getIntrastatCountryGroup() throws RuntimeException;

    /** Column name IsActive */
    public static final String COLUMNNAME_IsActive = "IsActive";

	/** Set Active.
	  * The record is active in the system
	  */
	public void setIsActive (boolean IsActive);

	/** Get Active.
	  * The record is active in the system
	  */
	public boolean isActive();

    /** Column name Name */
    public static final String COLUMNNAME_Name = "Name";

	/** Set Name.
	  * Alphanumeric identifier of the entity
	  */
	public void setName (String Name);

	/** Get Name.
	  * Alphanumeric identifier of the entity
	  */
	public String getName();

    /** Column name Updated */
    public static final String COLUMNNAME_Updated = "Updated";

	/** Get Updated.
	  * Date this record was updated
	  */
	public Timestamp getUpdated();

    /** Column name UpdatedBy */
    public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

	/** Get Updated By.
	  * User who updated this records
	  */
	public int getUpdatedBy();

    /** Column name Value */
    public static final String COLUMNNAME_Value = "Value";

	/** Set Search Key.
	  * Search key for the record in the format required - must be unique
	  */
	public void setValue (String Value);

	/** Get Search Key.
	  * Search key for the record in the format required - must be unique
	  */
	public String getValue();

    /** Column name WeightMultiplier */
    public static final String COLUMNNAME_WeightMultiplier = "WeightMultiplier";

	/** Set Weight Multiplier.
	  * Coefficient to multiply weight from client weight settings
	  */
	public void setWeightMultiplier (BigDecimal WeightMultiplier);

	/** Get Weight Multiplier.
	  * Coefficient to multiply weight from client weight settings
	  */
	public BigDecimal getWeightMultiplier();
}
