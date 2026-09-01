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

/** Generated Interface for C_BP_Learnerships
 *  @author iDempiere (generated) 
 *  @version Release 12
 */
@SuppressWarnings("all")
public interface I_C_BP_Learnerships 
{

    /** TableName=C_BP_Learnerships */
    public static final String Table_Name = "C_BP_Learnerships";

    /** AD_Table_ID=1000376 */
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

    /** Column name C_BP_Learnerships_ID */
    public static final String COLUMNNAME_C_BP_Learnerships_ID = "C_BP_Learnerships_ID";

	/** Set Learnerships	  */
	public void setC_BP_Learnerships_ID (int C_BP_Learnerships_ID);

	/** Get Learnerships	  */
	public int getC_BP_Learnerships_ID();

    /** Column name C_BP_Learnerships_UU */
    public static final String COLUMNNAME_C_BP_Learnerships_UU = "C_BP_Learnerships_UU";

	/** Set C_BP_Learnerships_UU	  */
	public void setC_BP_Learnerships_UU (String C_BP_Learnerships_UU);

	/** Get C_BP_Learnerships_UU	  */
	public String getC_BP_Learnerships_UU();

    /** Column name C_BP_OC_ID */
    public static final String COLUMNNAME_C_BP_OC_ID = "C_BP_OC_ID";

	/** Set OC	  */
	public void setC_BP_OC_ID (int C_BP_OC_ID);

	/** Get OC	  */
	public int getC_BP_OC_ID();

	public I_C_BP_OC getC_BP_OC() throws RuntimeException;

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

    /** Column name EndDate */
    public static final String COLUMNNAME_EndDate = "EndDate";

	/** Set End Date.
	  * Last effective date (inclusive)
	  */
	public void setEndDate (Timestamp EndDate);

	/** Get End Date.
	  * Last effective date (inclusive)
	  */
	public Timestamp getEndDate();

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

    /** Column name StartDate */
    public static final String COLUMNNAME_StartDate = "StartDate";

	/** Set Start Date.
	  * First effective day (inclusive)
	  */
	public void setStartDate (Timestamp StartDate);

	/** Get Start Date.
	  * First effective day (inclusive)
	  */
	public Timestamp getStartDate();

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

    /** Column name ZZLastAchievementDate */
    public static final String COLUMNNAME_ZZLastAchievementDate = "ZZLastAchievementDate";

	/** Set Last Achievement Date	  */
	public void setZZLastAchievementDate (Timestamp ZZLastAchievementDate);

	/** Get Last Achievement Date	  */
	public Timestamp getZZLastAchievementDate();

    /** Column name ZZLearnership_ID */
    public static final String COLUMNNAME_ZZLearnership_ID = "ZZLearnership_ID";

	/** Set Learnership	  */
	public void setZZLearnership_ID (int ZZLearnership_ID);

	/** Get Learnership	  */
	public int getZZLearnership_ID();

    /** Column name ZZLkpOfoOccupation_ID */
    public static final String COLUMNNAME_ZZLkpOfoOccupation_ID = "ZZLkpOfoOccupation_ID";

	/** Set OFO Occupation.
	  * OFO Occupation
	  */
	public void setZZLkpOfoOccupation_ID (int ZZLkpOfoOccupation_ID);

	/** Get OFO Occupation.
	  * OFO Occupation
	  */
	public int getZZLkpOfoOccupation_ID();

    /** Column name ZZNqfLevel */
    public static final String COLUMNNAME_ZZNqfLevel = "ZZNqfLevel";

	/** Set NQF Level	  */
	public void setZZNqfLevel (String ZZNqfLevel);

	/** Get NQF Level	  */
	public String getZZNqfLevel();

    /** Column name ZZQctoLearnership_ID */
    public static final String COLUMNNAME_ZZQctoLearnership_ID = "ZZQctoLearnership_ID";

	/** Set QCTO Learnership	  */
	public void setZZQctoLearnership_ID (int ZZQctoLearnership_ID);

	/** Get QCTO Learnership	  */
	public int getZZQctoLearnership_ID();

    /** Column name ZZQctoQualification_ID */
    public static final String COLUMNNAME_ZZQctoQualification_ID = "ZZQctoQualification_ID";

	/** Set QCTO Qualification	  */
	public void setZZQctoQualification_ID (int ZZQctoQualification_ID);

	/** Get QCTO Qualification	  */
	public int getZZQctoQualification_ID();

    /** Column name ZZQualification_ID */
    public static final String COLUMNNAME_ZZQualification_ID = "ZZQualification_ID";

	/** Set Qualification	  */
	public void setZZQualification_ID (int ZZQualification_ID);

	/** Get Qualification	  */
	public int getZZQualification_ID();

    /** Column name ZZ_AccreditationNumber */
    public static final String COLUMNNAME_ZZ_AccreditationNumber = "ZZ_AccreditationNumber";

	/** Set Accreditation Number	  */
	public void setZZ_AccreditationNumber (String ZZ_AccreditationNumber);

	/** Get Accreditation Number	  */
	public String getZZ_AccreditationNumber();

    /** Column name ZZ_Status */
    public static final String COLUMNNAME_ZZ_Status = "ZZ_Status";

	/** Set Status	  */
	public void setZZ_Status (String ZZ_Status);

	/** Get Status	  */
	public String getZZ_Status();
}
