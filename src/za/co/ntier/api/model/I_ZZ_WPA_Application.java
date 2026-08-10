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

/** Generated Interface for ZZ_WPA_Application
 *  @author iDempiere (generated) 
 *  @version Release 12
 */
@SuppressWarnings("all")
public interface I_ZZ_WPA_Application 
{

    /** TableName=ZZ_WPA_Application */
    public static final String Table_Name = "ZZ_WPA_Application";

    /** AD_Table_ID=1000243 */
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

    /** Column name C_BPartner_ID */
    public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";

	/** Set Business Partner.
	  * Identifies a Business Partner
	  */
	public void setC_BPartner_ID (int C_BPartner_ID);

	/** Get Business Partner.
	  * Identifies a Business Partner
	  */
	public int getC_BPartner_ID();

	public org.compiere.model.I_C_BPartner getC_BPartner() throws RuntimeException;

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

    /** Column name Phone2 */
    public static final String COLUMNNAME_Phone2 = "Phone2";

	/** Set 2nd Phone.
	  * Identifies an alternate telephone number.
	  */
	public void setPhone2 (String Phone2);

	/** Get 2nd Phone.
	  * Identifies an alternate telephone number.
	  */
	public String getPhone2();

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

    /** Column name ZZSurname */
    public static final String COLUMNNAME_ZZSurname = "ZZSurname";

	/** Set Surname	  */
	public void setZZSurname (String ZZSurname);

	/** Get Surname	  */
	public String getZZSurname();

    /** Column name ZZVerifiedDate */
    public static final String COLUMNNAME_ZZVerifiedDate = "ZZVerifiedDate";

	/** Set Verified Date	  */
	public void setZZVerifiedDate (Timestamp ZZVerifiedDate);

	/** Get Verified Date	  */
	public Timestamp getZZVerifiedDate();

    /** Column name ZZ_ApprovedBy_ID */
    public static final String COLUMNNAME_ZZ_ApprovedBy_ID = "ZZ_ApprovedBy_ID";

	/** Set Approved By	  */
	public void setZZ_ApprovedBy_ID (int ZZ_ApprovedBy_ID);

	/** Get Approved By	  */
	public int getZZ_ApprovedBy_ID();

	public org.compiere.model.I_AD_User getZZ_ApprovedBy() throws RuntimeException;

    /** Column name ZZ_Date_Application */
    public static final String COLUMNNAME_ZZ_Date_Application = "ZZ_Date_Application";

	/** Set Application Date	  */
	public void setZZ_Date_Application (Timestamp ZZ_Date_Application);

	/** Get Application Date	  */
	public Timestamp getZZ_Date_Application();

    /** Column name ZZ_Date_Approved */
    public static final String COLUMNNAME_ZZ_Date_Approved = "ZZ_Date_Approved";

	/** Set Date Approved	  */
	public void setZZ_Date_Approved (Timestamp ZZ_Date_Approved);

	/** Get Date Approved	  */
	public Timestamp getZZ_Date_Approved();

    /** Column name ZZ_Date_Not_Approved */
    public static final String COLUMNNAME_ZZ_Date_Not_Approved = "ZZ_Date_Not_Approved";

	/** Set Date Not Approved	  */
	public void setZZ_Date_Not_Approved (Timestamp ZZ_Date_Not_Approved);

	/** Get Date Not Approved	  */
	public Timestamp getZZ_Date_Not_Approved();

    /** Column name ZZ_Date_Not_Recom_Mgr_QA_AC */
    public static final String COLUMNNAME_ZZ_Date_Not_Recom_Mgr_QA_AC = "ZZ_Date_Not_Recom_Mgr_QA_AC";

	/** Set Date Not Recommended By Mgr QA AC	  */
	public void setZZ_Date_Not_Recom_Mgr_QA_AC (Timestamp ZZ_Date_Not_Recom_Mgr_QA_AC);

	/** Get Date Not Recommended By Mgr QA AC	  */
	public Timestamp getZZ_Date_Not_Recom_Mgr_QA_AC();

    /** Column name ZZ_Date_Not_Recom_Officer_QA_AC */
    public static final String COLUMNNAME_ZZ_Date_Not_Recom_Officer_QA_AC = "ZZ_Date_Not_Recom_Officer_QA_AC";

	/** Set Date Not Recommended By Officer QA AC	  */
	public void setZZ_Date_Not_Recom_Officer_QA_AC (Timestamp ZZ_Date_Not_Recom_Officer_QA_AC);

	/** Get Date Not Recommended By Officer QA AC	  */
	public Timestamp getZZ_Date_Not_Recom_Officer_QA_AC();

    /** Column name ZZ_Date_Not_Recom_Snr_Mgr_QA */
    public static final String COLUMNNAME_ZZ_Date_Not_Recom_Snr_Mgr_QA = "ZZ_Date_Not_Recom_Snr_Mgr_QA";

	/** Set Date Not Recommended By Snr Mgr QA	  */
	public void setZZ_Date_Not_Recom_Snr_Mgr_QA (Timestamp ZZ_Date_Not_Recom_Snr_Mgr_QA);

	/** Get Date Not Recommended By Snr Mgr QA	  */
	public Timestamp getZZ_Date_Not_Recom_Snr_Mgr_QA();

    /** Column name ZZ_Date_Not_Recommended */
    public static final String COLUMNNAME_ZZ_Date_Not_Recommended = "ZZ_Date_Not_Recommended";

	/** Set Date Not Recommended	  */
	public void setZZ_Date_Not_Recommended (Timestamp ZZ_Date_Not_Recommended);

	/** Get Date Not Recommended	  */
	public Timestamp getZZ_Date_Not_Recommended();

    /** Column name ZZ_Date_Not_Verified */
    public static final String COLUMNNAME_ZZ_Date_Not_Verified = "ZZ_Date_Not_Verified";

	/** Set Date Not Verified	  */
	public void setZZ_Date_Not_Verified (Timestamp ZZ_Date_Not_Verified);

	/** Get Date Not Verified	  */
	public Timestamp getZZ_Date_Not_Verified();

    /** Column name ZZ_Date_Recom_Mgr_QA_AC */
    public static final String COLUMNNAME_ZZ_Date_Recom_Mgr_QA_AC = "ZZ_Date_Recom_Mgr_QA_AC";

	/** Set Date Recommended By Mgr QA AC	  */
	public void setZZ_Date_Recom_Mgr_QA_AC (Timestamp ZZ_Date_Recom_Mgr_QA_AC);

	/** Get Date Recommended By Mgr QA AC	  */
	public Timestamp getZZ_Date_Recom_Mgr_QA_AC();

    /** Column name ZZ_Date_Recom_Officer_QA_AC */
    public static final String COLUMNNAME_ZZ_Date_Recom_Officer_QA_AC = "ZZ_Date_Recom_Officer_QA_AC";

	/** Set Date Recommended By Officer QA AC	  */
	public void setZZ_Date_Recom_Officer_QA_AC (Timestamp ZZ_Date_Recom_Officer_QA_AC);

	/** Get Date Recommended By Officer QA AC	  */
	public Timestamp getZZ_Date_Recom_Officer_QA_AC();

    /** Column name ZZ_Date_Recom_Snr_Mgr_QA */
    public static final String COLUMNNAME_ZZ_Date_Recom_Snr_Mgr_QA = "ZZ_Date_Recom_Snr_Mgr_QA";

	/** Set Date Recommended By Snr Mgr QA	  */
	public void setZZ_Date_Recom_Snr_Mgr_QA (Timestamp ZZ_Date_Recom_Snr_Mgr_QA);

	/** Get Date Recommended By Snr Mgr QA	  */
	public Timestamp getZZ_Date_Recom_Snr_Mgr_QA();

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

    /** Column name ZZ_Mgr_QA_AC_ID */
    public static final String COLUMNNAME_ZZ_Mgr_QA_AC_ID = "ZZ_Mgr_QA_AC_ID";

	/** Set Mgr QA AC	  */
	public void setZZ_Mgr_QA_AC_ID (int ZZ_Mgr_QA_AC_ID);

	/** Get Mgr QA AC	  */
	public int getZZ_Mgr_QA_AC_ID();

	public org.compiere.model.I_AD_User getZZ_Mgr_QA_AC() throws RuntimeException;

    /** Column name ZZ_RecommendedDate */
    public static final String COLUMNNAME_ZZ_RecommendedDate = "ZZ_RecommendedDate";

	/** Set Recommended Date	  */
	public void setZZ_RecommendedDate (Timestamp ZZ_RecommendedDate);

	/** Get Recommended Date	  */
	public Timestamp getZZ_RecommendedDate();

    /** Column name ZZ_Recommender_ID */
    public static final String COLUMNNAME_ZZ_Recommender_ID = "ZZ_Recommender_ID";

	/** Set Recommender	  */
	public void setZZ_Recommender_ID (int ZZ_Recommender_ID);

	/** Get Recommender	  */
	public int getZZ_Recommender_ID();

	public org.compiere.model.I_AD_User getZZ_Recommender() throws RuntimeException;

    /** Column name ZZ_Snr_Mgr_QA_ID */
    public static final String COLUMNNAME_ZZ_Snr_Mgr_QA_ID = "ZZ_Snr_Mgr_QA_ID";

	/** Set Snr Mgr QA	  */
	public void setZZ_Snr_Mgr_QA_ID (int ZZ_Snr_Mgr_QA_ID);

	/** Get Snr Mgr QA	  */
	public int getZZ_Snr_Mgr_QA_ID();

	public org.compiere.model.I_AD_User getZZ_Snr_Mgr_QA() throws RuntimeException;

    /** Column name ZZ_VerifiedBy_ID */
    public static final String COLUMNNAME_ZZ_VerifiedBy_ID = "ZZ_VerifiedBy_ID";

	/** Set Verified By	  */
	public void setZZ_VerifiedBy_ID (int ZZ_VerifiedBy_ID);

	/** Get Verified By	  */
	public int getZZ_VerifiedBy_ID();

	public org.compiere.model.I_AD_User getZZ_VerifiedBy() throws RuntimeException;

    /** Column name ZZ_WPA_Application_ID */
    public static final String COLUMNNAME_ZZ_WPA_Application_ID = "ZZ_WPA_Application_ID";

	/** Set WPA Application	  */
	public void setZZ_WPA_Application_ID (int ZZ_WPA_Application_ID);

	/** Get WPA Application	  */
	public int getZZ_WPA_Application_ID();

    /** Column name ZZ_WPA_Application_UU */
    public static final String COLUMNNAME_ZZ_WPA_Application_UU = "ZZ_WPA_Application_UU";

	/** Set ZZ_WPA_Application_UU	  */
	public void setZZ_WPA_Application_UU (String ZZ_WPA_Application_UU);

	/** Get ZZ_WPA_Application_UU	  */
	public String getZZ_WPA_Application_UU();

    /** Column name ZZ_WPA_Number */
    public static final String COLUMNNAME_ZZ_WPA_Number = "ZZ_WPA_Number";

	/** Set WPA Number	  */
	public void setZZ_WPA_Number (String ZZ_WPA_Number);

	/** Get WPA Number	  */
	public String getZZ_WPA_Number();
}
