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

import org.compiere.model.MTable;
import org.compiere.util.KeyNamePair;

/** Generated Interface for C_IntrastatLine
 *  @author iDempiere (generated) 
 *  @version Release 8.2
 */
@SuppressWarnings("all")
public interface I_C_IntrastatLine 
{

    /** TableName=C_IntrastatLine */
    public static final String Table_Name = "C_IntrastatLine";

    /** AD_Table_ID=1001672 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 3 - Client - Org 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

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

    /** Column name BusinessTypeIntrastat */
    public static final String COLUMNNAME_BusinessTypeIntrastat = "BusinessTypeIntrastat";

	/** Set Business Type Intrastat	  */
	public void setBusinessTypeIntrastat (String BusinessTypeIntrastat);

	/** Get Business Type Intrastat	  */
	public String getBusinessTypeIntrastat();

    /** Column name C_BPartner_ID */
    public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";

	/** Set Business Partner .
	  * Identifies a Business Partner
	  */
	public void setC_BPartner_ID (int C_BPartner_ID);

	/** Get Business Partner .
	  * Identifies a Business Partner
	  */
	public int getC_BPartner_ID();

	public org.compiere.model.I_C_BPartner getC_BPartner() throws RuntimeException;

    /** Column name C_Country_ID */
    public static final String COLUMNNAME_C_Country_ID = "C_Country_ID";

	/** Set Country.
	  * Country 
	  */
	public void setC_Country_ID (int C_Country_ID);

	/** Get Country.
	  * Country 
	  */
	public int getC_Country_ID();

	public org.compiere.model.I_C_Country getC_Country() throws RuntimeException;

    /** Column name C_Intrastat_ID */
    public static final String COLUMNNAME_C_Intrastat_ID = "C_Intrastat_ID";

	/** Set Intrastat	  */
	public void setC_Intrastat_ID (int C_Intrastat_ID);

	/** Get Intrastat	  */
	public int getC_Intrastat_ID();

	public I_C_Intrastat getC_Intrastat() throws RuntimeException;

    /** Column name C_IntrastatLine_ID */
    public static final String COLUMNNAME_C_IntrastatLine_ID = "C_IntrastatLine_ID";

	/** Set Intrastat Line	  */
	public void setC_IntrastatLine_ID (int C_IntrastatLine_ID);

	/** Get Intrastat Line	  */
	public int getC_IntrastatLine_ID();

    /** Column name C_IntrastatLine_UU */
    public static final String COLUMNNAME_C_IntrastatLine_UU = "C_IntrastatLine_UU";

	/** Set C_IntrastatLine_UU	  */
	public void setC_IntrastatLine_UU (String C_IntrastatLine_UU);

	/** Get C_IntrastatLine_UU	  */
	public String getC_IntrastatLine_UU();

    /** Column name C_Intrastat_Port_ID */
    public static final String COLUMNNAME_C_Intrastat_Port_ID = "C_Intrastat_Port_ID";

	/** Set Intrastat Port	  */
	public void setC_Intrastat_Port_ID (int C_Intrastat_Port_ID);

	/** Get Intrastat Port	  */
	public int getC_Intrastat_Port_ID();

	public I_C_Intrastat_Port getC_Intrastat_Port() throws RuntimeException;

    /** Column name C_InvoiceLine_ID */
    public static final String COLUMNNAME_C_InvoiceLine_ID = "C_InvoiceLine_ID";

	/** Set Invoice Line.
	  * Invoice Detail Line
	  */
	public void setC_InvoiceLine_ID (int C_InvoiceLine_ID);

	/** Get Invoice Line.
	  * Invoice Detail Line
	  */
	public int getC_InvoiceLine_ID();

	public org.compiere.model.I_C_InvoiceLine getC_InvoiceLine() throws RuntimeException;

    /** Column name CountryCodeManufacurer */
    public static final String COLUMNNAME_CountryCodeManufacurer = "CountryCodeManufacurer";

	/** Set Country Code Manufacurer	  */
	public void setCountryCodeManufacurer (String CountryCodeManufacurer);

	/** Get Country Code Manufacurer	  */
	public String getCountryCodeManufacurer();

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

    /** Column name C_UOM_ID */
    public static final String COLUMNNAME_C_UOM_ID = "C_UOM_ID";

	/** Set UOM.
	  * Unit of Measure
	  */
	public void setC_UOM_ID (int C_UOM_ID);

	/** Get UOM.
	  * Unit of Measure
	  */
	public int getC_UOM_ID();

	public org.compiere.model.I_C_UOM getC_UOM() throws RuntimeException;

    /** Column name DateInvoiced */
    public static final String COLUMNNAME_DateInvoiced = "DateInvoiced";

	/** Set Date Invoiced.
	  * Date printed on Invoice
	  */
	public void setDateInvoiced (Timestamp DateInvoiced);

	/** Get Date Invoiced.
	  * Date printed on Invoice
	  */
	public Timestamp getDateInvoiced();

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

    /** Column name LandedCostAmt */
    public static final String COLUMNNAME_LandedCostAmt = "LandedCostAmt";

	/** Set Landed Cost Amount	  */
	public void setLandedCostAmt (BigDecimal LandedCostAmt);

	/** Get Landed Cost Amount	  */
	public BigDecimal getLandedCostAmt();

    /** Column name LandedCostDesc */
    public static final String COLUMNNAME_LandedCostDesc = "LandedCostDesc";

	/** Set Landed Cost Description	  */
	public void setLandedCostDesc (String LandedCostDesc);

	/** Get Landed Cost Description	  */
	public String getLandedCostDesc();

    /** Column name LineNetAmt */
    public static final String COLUMNNAME_LineNetAmt = "LineNetAmt";

	/** Set Line Amount.
	  * Line Extended Amount (Quantity x Actual Price) without Freight and Charges
	  */
	public void setLineNetAmt (BigDecimal LineNetAmt);

	/** Get Line Amount.
	  * Line Extended Amount (Quantity x Actual Price) without Freight and Charges
	  */
	public BigDecimal getLineNetAmt();

    /** Column name Manufacturer_ID */
    public static final String COLUMNNAME_Manufacturer_ID = "Manufacturer_ID";

	/** Set Manufacturer	  */
	public void setManufacturer_ID (int Manufacturer_ID);

	/** Get Manufacturer	  */
	public int getManufacturer_ID();

	public org.compiere.model.I_C_BPartner getManufacturer() throws RuntimeException;

    /** Column name ModeOfTransport */
    public static final String COLUMNNAME_ModeOfTransport = "ModeOfTransport";

	/** Set Mode of Transport	  */
	public void setModeOfTransport (String ModeOfTransport);

	/** Get Mode of Transport	  */
	public String getModeOfTransport();

    /** Column name M_Product_Commodity_ID */
    public static final String COLUMNNAME_M_Product_Commodity_ID = "M_Product_Commodity_ID";

	/** Set Product Commodity	  */
	public void setM_Product_Commodity_ID (int M_Product_Commodity_ID);

	/** Get Product Commodity	  */
	public int getM_Product_Commodity_ID();

	public I_M_Product_Commodity getM_Product_Commodity() throws RuntimeException;

    /** Column name M_Product_ID */
    public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";

	/** Set Product.
	  * Product, Service, Item
	  */
	public void setM_Product_ID (int M_Product_ID);

	/** Get Product.
	  * Product, Service, Item
	  */
	public int getM_Product_ID();

	public org.compiere.model.I_M_Product getM_Product() throws RuntimeException;

    /** Column name NettoWeight */
    public static final String COLUMNNAME_NettoWeight = "NettoWeight";

	/** Set Netto Weight	  */
	public void setNettoWeight (BigDecimal NettoWeight);

	/** Get Netto Weight	  */
	public BigDecimal getNettoWeight();

    /** Column name QtyInvoiced */
    public static final String COLUMNNAME_QtyInvoiced = "QtyInvoiced";

	/** Set Invoiced Quantity.
	  * Invoiced Quantity
	  */
	public void setQtyInvoiced (BigDecimal QtyInvoiced);

	/** Get Invoiced Quantity.
	  * Invoiced Quantity
	  */
	public BigDecimal getQtyInvoiced();

    /** Column name SeqNo */
    public static final String COLUMNNAME_SeqNo = "SeqNo";

	/** Set Sequence.
	  * Method of ordering records;
 lowest number comes first
	  */
	public void setSeqNo (int SeqNo);

	/** Get Sequence.
	  * Method of ordering records;
 lowest number comes first
	  */
	public int getSeqNo();

    /** Column name StatisticalValue */
    public static final String COLUMNNAME_StatisticalValue = "StatisticalValue";

	/** Set Statistical Value	  */
	public void setStatisticalValue (BigDecimal StatisticalValue);

	/** Get Statistical Value	  */
	public BigDecimal getStatisticalValue();

    /** Column name TaxID */
    public static final String COLUMNNAME_TaxID = "TaxID";

	/** Set Tax ID.
	  * Tax Identification
	  */
	public void setTaxID (String TaxID);

	/** Get Tax ID.
	  * Tax Identification
	  */
	public String getTaxID();

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
}
