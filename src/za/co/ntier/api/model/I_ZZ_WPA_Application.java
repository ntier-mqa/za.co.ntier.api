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

    /** AD_Table_ID=1000250 */
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

    /** Column name ZZCredits */
    public static final String COLUMNNAME_ZZCredits = "ZZCredits";

	/** Set Credits	  */
	public void setZZCredits (int ZZCredits);

	/** Get Credits	  */
	public int getZZCredits();

    /** Column name ZZProgrammeName */
    public static final String COLUMNNAME_ZZProgrammeName = "ZZProgrammeName";

	/** Set Programme Name	  */
	public void setZZProgrammeName (String ZZProgrammeName);

	/** Get Programme Name	  */
	public String getZZProgrammeName();

    /** Column name ZZQualification_IDs */
    public static final String COLUMNNAME_ZZQualification_IDs = "ZZQualification_IDs";

	/** Set Qualifications.
	  * For multi selection reference
	  */
	public void setZZQualification_IDs (String ZZQualification_IDs);

	/** Get Qualifications.
	  * For multi selection reference
	  */
	public String getZZQualification_IDs();

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

    /** Column name ZZ_OCO_Code */
    public static final String COLUMNNAME_ZZ_OCO_Code = "ZZ_OCO_Code";

	/** Set OCO Code	  */
	public void setZZ_OCO_Code (String ZZ_OCO_Code);

	/** Get OCO Code	  */
	public String getZZ_OCO_Code();

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

    /** Column name ZZ_VerifiedBy_ID */
    public static final String COLUMNNAME_ZZ_VerifiedBy_ID = "ZZ_VerifiedBy_ID";

	/** Set Verified By	  */
	public void setZZ_VerifiedBy_ID (int ZZ_VerifiedBy_ID);

	/** Get Verified By	  */
	public int getZZ_VerifiedBy_ID();

	public org.compiere.model.I_AD_User getZZ_VerifiedBy() throws RuntimeException;

    /** Column name ZZ_WPA_Application_ID */
    public static final String COLUMNNAME_ZZ_WPA_Application_ID = "ZZ_WPA_Application_ID";

	/** Set WAP Application	  */
	public void setZZ_WPA_Application_ID (int ZZ_WPA_Application_ID);

	/** Get WAP Application	  */
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
