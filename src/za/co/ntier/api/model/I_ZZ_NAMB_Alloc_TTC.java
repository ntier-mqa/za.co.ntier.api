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
package za.co.ntier.api.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.compiere.model.*;
import org.compiere.util.KeyNamePair;

/** Generated Interface for ZZ_NAMB_Alloc_TTC
 *  @author iDempiere (generated) 
 *  @version Release 12
 */
@SuppressWarnings("all")
public interface I_ZZ_NAMB_Alloc_TTC 
{

    /** TableName=ZZ_NAMB_Alloc_TTC */
    public static final String Table_Name = "ZZ_NAMB_Alloc_TTC";

    /** AD_Table_ID=1000242 */
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

	/** Set Unit.
	  * Organizational entity within tenant
	  */
	public void setAD_Org_ID (int AD_Org_ID);

	/** Get Unit.
	  * Organizational entity within tenant
	  */
	public int getAD_Org_ID();

    /** Column name Address */
    public static final String COLUMNNAME_Address = "Address";

	/** Set Address	  */
	public void setAddress (String Address);

	/** Get Address	  */
	public String getAddress();

    /** Column name City */
    public static final String COLUMNNAME_City = "City";

	/** Set City.
	  * Identifies a City
	  */
	public void setCity (String City);

	/** Get City.
	  * Identifies a City
	  */
	public String getCity();

    /** Column name ContactName */
    public static final String COLUMNNAME_ContactName = "ContactName";

	/** Set Contact Name.
	  * Business Partner Contact Name
	  */
	public void setContactName (String ContactName);

	/** Get Contact Name.
	  * Business Partner Contact Name
	  */
	public String getContactName();

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

    /** Column name DateReceived */
    public static final String COLUMNNAME_DateReceived = "DateReceived";

	/** Set Date Received.
	  * Date a product was received
	  */
	public void setDateReceived (Timestamp DateReceived);

	/** Get Date Received.
	  * Date a product was received
	  */
	public Timestamp getDateReceived();

    /** Column name DocumentNo */
    public static final String COLUMNNAME_DocumentNo = "DocumentNo";

	/** Set Document No.
	  * Document sequence number of the document
	  */
	public void setDocumentNo (String DocumentNo);

	/** Get Document No.
	  * Document sequence number of the document
	  */
	public String getDocumentNo();

    /** Column name EMail */
    public static final String COLUMNNAME_EMail = "EMail";

	/** Set EMail Address.
	  * Electronic Mail Address
	  */
	public void setEMail (String EMail);

	/** Get EMail Address.
	  * Electronic Mail Address
	  */
	public String getEMail();

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

    /** Column name IsOpenSchedule */
    public static final String COLUMNNAME_IsOpenSchedule = "IsOpenSchedule";

	/** Set IsOpenSchedule	  */
	public void setIsOpenSchedule (boolean IsOpenSchedule);

	/** Get IsOpenSchedule	  */
	public boolean isOpenSchedule();

    /** Column name Phone */
    public static final String COLUMNNAME_Phone = "Phone";

	/** Set Phone.
	  * Identifies a telephone number
	  */
	public void setPhone (String Phone);

	/** Get Phone.
	  * Identifies a telephone number
	  */
	public String getPhone();

    /** Column name Region */
    public static final String COLUMNNAME_Region = "Region";

	/** Set Region	  */
	public void setRegion (String Region);

	/** Get Region	  */
	public String getRegion();

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

    /** Column name ZZLegalName */
    public static final String COLUMNNAME_ZZLegalName = "ZZLegalName";

	/** Set Legal Name	  */
	public void setZZLegalName (String ZZLegalName);

	/** Get Legal Name	  */
	public String getZZLegalName();

    /** Column name ZZ_Allocated */
    public static final String COLUMNNAME_ZZ_Allocated = "ZZ_Allocated";

	/** Set Allocated	  */
	public void setZZ_Allocated (String ZZ_Allocated);

	/** Get Allocated	  */
	public String getZZ_Allocated();

    /** Column name ZZ_AllocationMonth */
    public static final String COLUMNNAME_ZZ_AllocationMonth = "ZZ_AllocationMonth";

	/** Set Allocation Month.
	  * Allocation Month
	  */
	public void setZZ_AllocationMonth (String ZZ_AllocationMonth);

	/** Get Allocation Month.
	  * Allocation Month
	  */
	public String getZZ_AllocationMonth();

    /** Column name ZZ_AllocationNo */
    public static final String COLUMNNAME_ZZ_AllocationNo = "ZZ_AllocationNo";

	/** Set Allocation No	  */
	public void setZZ_AllocationNo (String ZZ_AllocationNo);

	/** Get Allocation No	  */
	public String getZZ_AllocationNo();

    /** Column name ZZ_DocStatus */
    public static final String COLUMNNAME_ZZ_DocStatus = "ZZ_DocStatus";

	/** Set Document Status	  */
	public void setZZ_DocStatus (String ZZ_DocStatus);

	/** Get Document Status	  */
	public String getZZ_DocStatus();

    /** Column name ZZ_NAMB_Alloc_TTC_ID */
    public static final String COLUMNNAME_ZZ_NAMB_Alloc_TTC_ID = "ZZ_NAMB_Alloc_TTC_ID";

	/** Set TTC	  */
	public void setZZ_NAMB_Alloc_TTC_ID (int ZZ_NAMB_Alloc_TTC_ID);

	/** Get TTC	  */
	public int getZZ_NAMB_Alloc_TTC_ID();

    /** Column name ZZ_NAMB_Alloc_TTC_UU */
    public static final String COLUMNNAME_ZZ_NAMB_Alloc_TTC_UU = "ZZ_NAMB_Alloc_TTC_UU";

	/** Set ZZ_NAMB_Alloc_TTC_UU	  */
	public void setZZ_NAMB_Alloc_TTC_UU (String ZZ_NAMB_Alloc_TTC_UU);

	/** Get ZZ_NAMB_Alloc_TTC_UU	  */
	public String getZZ_NAMB_Alloc_TTC_UU();

    /** Column name ZZ_NAMB_Allocations_ID */
    public static final String COLUMNNAME_ZZ_NAMB_Allocations_ID = "ZZ_NAMB_Allocations_ID";

	/** Set NAMB Allocations	  */
	public void setZZ_NAMB_Allocations_ID (int ZZ_NAMB_Allocations_ID);

	/** Get NAMB Allocations	  */
	public int getZZ_NAMB_Allocations_ID();

	public I_ZZ_NAMB_Allocations getZZ_NAMB_Allocations() throws RuntimeException;

    /** Column name ZZ_ScopeOfTrades */
    public static final String COLUMNNAME_ZZ_ScopeOfTrades = "ZZ_ScopeOfTrades";

	/** Set Scope of Trades.
	  * Scope of Trades
	  */
	public void setZZ_ScopeOfTrades (String ZZ_ScopeOfTrades);

	/** Get Scope of Trades.
	  * Scope of Trades
	  */
	public String getZZ_ScopeOfTrades();
}
