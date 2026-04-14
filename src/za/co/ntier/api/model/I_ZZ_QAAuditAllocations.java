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

/** Generated Interface for ZZ_QAAuditAllocations
 *  @author iDempiere (generated) 
 *  @version Release 12
 */
@SuppressWarnings("all")
public interface I_ZZ_QAAuditAllocations 
{

    /** TableName=ZZ_QAAuditAllocations */
    public static final String Table_Name = "ZZ_QAAuditAllocations";

    /** AD_Table_ID=1000239 */
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

    /** Column name Address1 */
    public static final String COLUMNNAME_Address1 = "Address1";

	/** Set Address 1.
	  * Address line 1 for this location
	  */
	public void setAddress1 (String Address1);

	/** Get Address 1.
	  * Address line 1 for this location
	  */
	public String getAddress1();

    /** Column name Address2 */
    public static final String COLUMNNAME_Address2 = "Address2";

	/** Set Address 2.
	  * Address line 2 for this location
	  */
	public void setAddress2 (String Address2);

	/** Get Address 2.
	  * Address line 2 for this location
	  */
	public String getAddress2();

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

    /** Column name LineNo */
    public static final String COLUMNNAME_LineNo = "LineNo";

	/** Set Line.
	  * Line No
	  */
	public void setLineNo (int LineNo);

	/** Get Line.
	  * Line No
	  */
	public int getLineNo();

    /** Column name ManualNote */
    public static final String COLUMNNAME_ManualNote = "ManualNote";

	/** Set Observation.
	  * Note for manual entry
	  */
	public void setManualNote (String ManualNote);

	/** Get Observation.
	  * Note for manual entry
	  */
	public String getManualNote();

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

    /** Column name Postalcode */
    public static final String COLUMNNAME_Postalcode = "Postalcode";

	/** Set Postalcode	  */
	public void setPostalcode (String Postalcode);

	/** Get Postalcode	  */
	public String getPostalcode();

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

    /** Column name ZZSurname */
    public static final String COLUMNNAME_ZZSurname = "ZZSurname";

	/** Set Surname	  */
	public void setZZSurname (String ZZSurname);

	/** Get Surname	  */
	public String getZZSurname();

    /** Column name ZZTradeName */
    public static final String COLUMNNAME_ZZTradeName = "ZZTradeName";

	/** Set Trade Name	  */
	public void setZZTradeName (String ZZTradeName);

	/** Get Trade Name	  */
	public String getZZTradeName();

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

    /** Column name ZZ_AltContactEmail */
    public static final String COLUMNNAME_ZZ_AltContactEmail = "ZZ_AltContactEmail";

	/** Set Alt Contact Email.
	  * Email of Alt Contact
	  */
	public void setZZ_AltContactEmail (String ZZ_AltContactEmail);

	/** Get Alt Contact Email.
	  * Email of Alt Contact
	  */
	public String getZZ_AltContactEmail();

    /** Column name ZZ_AltContactName */
    public static final String COLUMNNAME_ZZ_AltContactName = "ZZ_AltContactName";

	/** Set Alt Contact Name.
	  * Full Name(s) of Additional Contact Person
	  */
	public void setZZ_AltContactName (String ZZ_AltContactName);

	/** Get Alt Contact Name.
	  * Full Name(s) of Additional Contact Person
	  */
	public String getZZ_AltContactName();

    /** Column name ZZ_AltContactSurname */
    public static final String COLUMNNAME_ZZ_AltContactSurname = "ZZ_AltContactSurname";

	/** Set Alt Contact Surname.
	  * Surname of Alt Contact
	  */
	public void setZZ_AltContactSurname (String ZZ_AltContactSurname);

	/** Get Alt Contact Surname.
	  * Surname of Alt Contact
	  */
	public String getZZ_AltContactSurname();

    /** Column name ZZ_AltContactTitle */
    public static final String COLUMNNAME_ZZ_AltContactTitle = "ZZ_AltContactTitle";

	/** Set Alt Contact Title.
	  * Title of Additional Contact Person
	  */
	public void setZZ_AltContactTitle (String ZZ_AltContactTitle);

	/** Get Alt Contact Title.
	  * Title of Additional Contact Person
	  */
	public String getZZ_AltContactTitle();

    /** Column name ZZ_CIPCNumber */
    public static final String COLUMNNAME_ZZ_CIPCNumber = "ZZ_CIPCNumber";

	/** Set CIPC Registration.
	  * CIPC Registration
	  */
	public void setZZ_CIPCNumber (String ZZ_CIPCNumber);

	/** Get CIPC Registration.
	  * CIPC Registration
	  */
	public String getZZ_CIPCNumber();

    /** Column name ZZ_ContactTitle */
    public static final String COLUMNNAME_ZZ_ContactTitle = "ZZ_ContactTitle";

	/** Set Title of Contact Person.
	  * Title of Contact Person
	  */
	public void setZZ_ContactTitle (String ZZ_ContactTitle);

	/** Get Title of Contact Person.
	  * Title of Contact Person
	  */
	public String getZZ_ContactTitle();

    /** Column name ZZ_Date_Not_Recommended */
    public static final String COLUMNNAME_ZZ_Date_Not_Recommended = "ZZ_Date_Not_Recommended";

	/** Set Date Not Recommended	  */
	public void setZZ_Date_Not_Recommended (Timestamp ZZ_Date_Not_Recommended);

	/** Get Date Not Recommended	  */
	public Timestamp getZZ_Date_Not_Recommended();

    /** Column name ZZ_Date_Recommended */
    public static final String COLUMNNAME_ZZ_Date_Recommended = "ZZ_Date_Recommended";

	/** Set Date Recommended	  */
	public void setZZ_Date_Recommended (Timestamp ZZ_Date_Recommended);

	/** Get Date Recommended	  */
	public Timestamp getZZ_Date_Recommended();

    /** Column name ZZ_Designation */
    public static final String COLUMNNAME_ZZ_Designation = "ZZ_Designation";

	/** Set Designation	  */
	public void setZZ_Designation (String ZZ_Designation);

	/** Get Designation	  */
	public String getZZ_Designation();

    /** Column name ZZ_DocAction */
    public static final String COLUMNNAME_ZZ_DocAction = "ZZ_DocAction";

	/** Set Document Action	  */
	public void setZZ_DocAction (String ZZ_DocAction);

	/** Get Document Action	  */
	public String getZZ_DocAction();

    /** Column name ZZ_DocStatus */
    public static final String COLUMNNAME_ZZ_DocStatus = "ZZ_DocStatus";

	/** Set Document Status	  */
	public void setZZ_DocStatus (String ZZ_DocStatus);

	/** Get Document Status	  */
	public String getZZ_DocStatus();

    /** Column name ZZ_NQF_Level */
    public static final String COLUMNNAME_ZZ_NQF_Level = "ZZ_NQF_Level";

	/** Set NQF Level	  */
	public void setZZ_NQF_Level (String ZZ_NQF_Level);

	/** Get NQF Level	  */
	public String getZZ_NQF_Level();

    /** Column name ZZ_QAAuditAllocations_ID */
    public static final String COLUMNNAME_ZZ_QAAuditAllocations_ID = "ZZ_QAAuditAllocations_ID";

	/** Set QA Audit Allocations	  */
	public void setZZ_QAAuditAllocations_ID (int ZZ_QAAuditAllocations_ID);

	/** Get QA Audit Allocations	  */
	public int getZZ_QAAuditAllocations_ID();

    /** Column name ZZ_QAAuditAllocations_UU */
    public static final String COLUMNNAME_ZZ_QAAuditAllocations_UU = "ZZ_QAAuditAllocations_UU";

	/** Set ZZ_QAAuditAllocations_UU	  */
	public void setZZ_QAAuditAllocations_UU (String ZZ_QAAuditAllocations_UU);

	/** Get ZZ_QAAuditAllocations_UU	  */
	public String getZZ_QAAuditAllocations_UU();

    /** Column name ZZ_QAAudit_ID */
    public static final String COLUMNNAME_ZZ_QAAudit_ID = "ZZ_QAAudit_ID";

	/** Set QA Audit	  */
	public void setZZ_QAAudit_ID (int ZZ_QAAudit_ID);

	/** Get QA Audit	  */
	public int getZZ_QAAudit_ID();

	public I_ZZ_QAAudit getZZ_QAAudit() throws RuntimeException;

    /** Column name ZZ_QCTO_Alloc_AC_ID */
    public static final String COLUMNNAME_ZZ_QCTO_Alloc_AC_ID = "ZZ_QCTO_Alloc_AC_ID";

	/** Set ZZ_QCTO_Alloc_AC	  */
	public void setZZ_QCTO_Alloc_AC_ID (int ZZ_QCTO_Alloc_AC_ID);

	/** Get ZZ_QCTO_Alloc_AC	  */
	public int getZZ_QCTO_Alloc_AC_ID();

	public I_ZZ_QCTO_Alloc_AC getZZ_QCTO_Alloc_AC() throws RuntimeException;

    /** Column name ZZ_QCTO_Alloc_OC_ID */
    public static final String COLUMNNAME_ZZ_QCTO_Alloc_OC_ID = "ZZ_QCTO_Alloc_OC_ID";

	/** Set ZZ_QCTO_Alloc_OC	  */
	public void setZZ_QCTO_Alloc_OC_ID (int ZZ_QCTO_Alloc_OC_ID);

	/** Get ZZ_QCTO_Alloc_OC	  */
	public int getZZ_QCTO_Alloc_OC_ID();

	public I_ZZ_QCTO_Alloc_OC getZZ_QCTO_Alloc_OC() throws RuntimeException;

    /** Column name ZZ_QCTO_Alloc_Skills_ID */
    public static final String COLUMNNAME_ZZ_QCTO_Alloc_Skills_ID = "ZZ_QCTO_Alloc_Skills_ID";

	/** Set ZZ_QCTO_Alloc_Skills	  */
	public void setZZ_QCTO_Alloc_Skills_ID (int ZZ_QCTO_Alloc_Skills_ID);

	/** Get ZZ_QCTO_Alloc_Skills	  */
	public int getZZ_QCTO_Alloc_Skills_ID();

	public I_ZZ_QCTO_Alloc_Skills getZZ_QCTO_Alloc_Skills() throws RuntimeException;

    /** Column name ZZ_QCTO_Allocation_ID */
    public static final String COLUMNNAME_ZZ_QCTO_Allocation_ID = "ZZ_QCTO_Allocation_ID";

	/** Set ZZ_QCTO_Allocation_ID	  */
	public void setZZ_QCTO_Allocation_ID (int ZZ_QCTO_Allocation_ID);

	/** Get ZZ_QCTO_Allocation_ID	  */
	public int getZZ_QCTO_Allocation_ID();

	public I_ZZ_QCTO_Allocation getZZ_QCTO_Allocation() throws RuntimeException;

    /** Column name ZZ_Qualification */
    public static final String COLUMNNAME_ZZ_Qualification = "ZZ_Qualification";

	/** Set Qualification	  */
	public void setZZ_Qualification (String ZZ_Qualification);

	/** Get Qualification	  */
	public String getZZ_Qualification();

    /** Column name ZZ_QualityPartner */
    public static final String COLUMNNAME_ZZ_QualityPartner = "ZZ_QualityPartner";

	/** Set Quality Partner.
	  * Quality Partner
	  */
	public void setZZ_QualityPartner (String ZZ_QualityPartner);

	/** Get Quality Partner.
	  * Quality Partner
	  */
	public String getZZ_QualityPartner();

    /** Column name ZZ_Recommender_ID */
    public static final String COLUMNNAME_ZZ_Recommender_ID = "ZZ_Recommender_ID";

	/** Set Recommender	  */
	public void setZZ_Recommender_ID (int ZZ_Recommender_ID);

	/** Get Recommender	  */
	public int getZZ_Recommender_ID();

	public org.compiere.model.I_AD_User getZZ_Recommender() throws RuntimeException;

    /** Column name ZZ_SAQAIDOrSPID */
    public static final String COLUMNNAME_ZZ_SAQAIDOrSPID = "ZZ_SAQAIDOrSPID";

	/** Set SAQA ID Number.
	  * SAQA ID Number
	  */
	public void setZZ_SAQAIDOrSPID (String ZZ_SAQAIDOrSPID);

	/** Get SAQA ID Number.
	  * SAQA ID Number
	  */
	public String getZZ_SAQAIDOrSPID();

    /** Column name ZZ_SiteVisitDate */
    public static final String COLUMNNAME_ZZ_SiteVisitDate = "ZZ_SiteVisitDate";

	/** Set Site Visit Date.
	  * Site Visit Date
	  */
	public void setZZ_SiteVisitDate (Timestamp ZZ_SiteVisitDate);

	/** Get Site Visit Date.
	  * Site Visit Date
	  */
	public Timestamp getZZ_SiteVisitDate();
}
