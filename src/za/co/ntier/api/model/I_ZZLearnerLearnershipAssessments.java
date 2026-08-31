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

/** Generated Interface for ZZLearnerLearnershipAssessments
 *  @author iDempiere (generated) 
 *  @version Release 12
 */
@SuppressWarnings("all")
public interface I_ZZLearnerLearnershipAssessments 
{

    /** TableName=ZZLearnerLearnershipAssessments */
    public static final String Table_Name = "ZZLearnerLearnershipAssessments";

    /** AD_Table_ID=1000366 */
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

    /** Column name Assessment_Status_ID */
    public static final String COLUMNNAME_Assessment_Status_ID = "Assessment_Status_ID";

	/** Set Assessment Status	  */
	public void setAssessment_Status_ID (int Assessment_Status_ID);

	/** Get Assessment Status	  */
	public int getAssessment_Status_ID();

	public I_Assessment_Status getAssessment_Status() throws RuntimeException;

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

    /** Column name ZZAssessmentDate */
    public static final String COLUMNNAME_ZZAssessmentDate = "ZZAssessmentDate";

	/** Set Assessment Date	  */
	public void setZZAssessmentDate (Timestamp ZZAssessmentDate);

	/** Get Assessment Date	  */
	public Timestamp getZZAssessmentDate();

    /** Column name ZZAssessmentStatus */
    public static final String COLUMNNAME_ZZAssessmentStatus = "ZZAssessmentStatus";

	/** Set Assessment Status	  */
	public void setZZAssessmentStatus (String ZZAssessmentStatus);

	/** Get Assessment Status	  */
	public String getZZAssessmentStatus();

    /** Column name ZZAssessorPerson_ID */
    public static final String COLUMNNAME_ZZAssessorPerson_ID = "ZZAssessorPerson_ID";

	/** Set Assessor Person	  */
	public void setZZAssessorPerson_ID (int ZZAssessorPerson_ID);

	/** Get Assessor Person	  */
	public int getZZAssessorPerson_ID();

	public org.compiere.model.I_AD_User getZZAssessorPerson() throws RuntimeException;

    /** Column name ZZCredits */
    public static final String COLUMNNAME_ZZCredits = "ZZCredits";

	/** Set Credits	  */
	public void setZZCredits (int ZZCredits);

	/** Get Credits	  */
	public int getZZCredits();

    /** Column name ZZDateAssessmentCaptured */
    public static final String COLUMNNAME_ZZDateAssessmentCaptured = "ZZDateAssessmentCaptured";

	/** Set Date Assessment Captured	  */
	public void setZZDateAssessmentCaptured (Timestamp ZZDateAssessmentCaptured);

	/** Get Date Assessment Captured	  */
	public Timestamp getZZDateAssessmentCaptured();

    /** Column name ZZDatePartialApproved */
    public static final String COLUMNNAME_ZZDatePartialApproved = "ZZDatePartialApproved";

	/** Set Date Partial Approved	  */
	public void setZZDatePartialApproved (Timestamp ZZDatePartialApproved);

	/** Get Date Partial Approved	  */
	public Timestamp getZZDatePartialApproved();

    /** Column name ZZIsPartialApproved */
    public static final String COLUMNNAME_ZZIsPartialApproved = "ZZIsPartialApproved";

	/** Set ZZIsPartialApproved.
	  * ms_learnerlearnershipassessments.ispartialapproved
	  */
	public void setZZIsPartialApproved (boolean ZZIsPartialApproved);

	/** Get ZZIsPartialApproved.
	  * ms_learnerlearnershipassessments.ispartialapproved
	  */
	public boolean isZZIsPartialApproved();

    /** Column name ZZIsPreviouslyAchieved */
    public static final String COLUMNNAME_ZZIsPreviouslyAchieved = "ZZIsPreviouslyAchieved";

	/** Set ZZIsPreviouslyAchieved.
	  * ms_learnerlearnershipassessments.ispreviouslyachieved
	  */
	public void setZZIsPreviouslyAchieved (boolean ZZIsPreviouslyAchieved);

	/** Get ZZIsPreviouslyAchieved.
	  * ms_learnerlearnershipassessments.ispreviouslyachieved
	  */
	public boolean isZZIsPreviouslyAchieved();

    /** Column name ZZLearnerLearnershipAssessments_ID */
    public static final String COLUMNNAME_ZZLearnerLearnershipAssessments_ID = "ZZLearnerLearnershipAssessments_ID";

	/** Set ZZLearnerLearnershipAssessments	  */
	public void setZZLearnerLearnershipAssessments_ID (int ZZLearnerLearnershipAssessments_ID);

	/** Get ZZLearnerLearnershipAssessments	  */
	public int getZZLearnerLearnershipAssessments_ID();

    /** Column name ZZLearnerLearnershipAssessments_UU */
    public static final String COLUMNNAME_ZZLearnerLearnershipAssessments_UU = "ZZLearnerLearnershipAssessments_UU";

	/** Set ZZLearnerLearnershipAssessments_UU	  */
	public void setZZLearnerLearnershipAssessments_UU (String ZZLearnerLearnershipAssessments_UU);

	/** Get ZZLearnerLearnershipAssessments_UU	  */
	public String getZZLearnerLearnershipAssessments_UU();

    /** Column name ZZLearnerLearnership_ID */
    public static final String COLUMNNAME_ZZLearnerLearnership_ID = "ZZLearnerLearnership_ID";

	/** Set Learner Learnership	  */
	public void setZZLearnerLearnership_ID (int ZZLearnerLearnership_ID);

	/** Get Learner Learnership	  */
	public int getZZLearnerLearnership_ID();

	public I_ZZLearnerLearnership getZZLearnerLearnership() throws RuntimeException;

    /** Column name ZZModerationDate */
    public static final String COLUMNNAME_ZZModerationDate = "ZZModerationDate";

	/** Set Moderation Date	  */
	public void setZZModerationDate (Timestamp ZZModerationDate);

	/** Get Moderation Date	  */
	public Timestamp getZZModerationDate();

    /** Column name ZZModerator_ID */
    public static final String COLUMNNAME_ZZModerator_ID = "ZZModerator_ID";

	/** Set Moderator	  */
	public void setZZModerator_ID (int ZZModerator_ID);

	/** Get Moderator	  */
	public int getZZModerator_ID();

	public org.compiere.model.I_AD_User getZZModerator() throws RuntimeException;

    /** Column name ZZPartialApprovedBy */
    public static final String COLUMNNAME_ZZPartialApprovedBy = "ZZPartialApprovedBy";

	/** Set ZZPartialApprovedBy.
	  * ms_learnerlearnershipassessments.partialapprovedby (ms_user email match)
	  */
	public void setZZPartialApprovedBy (int ZZPartialApprovedBy);

	/** Get ZZPartialApprovedBy.
	  * ms_learnerlearnershipassessments.partialapprovedby (ms_user email match)
	  */
	public int getZZPartialApprovedBy();

	public org.compiere.model.I_AD_User getZZPartialApprove() throws RuntimeException;

    /** Column name ZZRPL */
    public static final String COLUMNNAME_ZZRPL = "ZZRPL";

	/** Set RPL	  */
	public void setZZRPL (String ZZRPL);

	/** Get RPL	  */
	public String getZZRPL();

    /** Column name ZZUnitStandard_ID */
    public static final String COLUMNNAME_ZZUnitStandard_ID = "ZZUnitStandard_ID";

	/** Set Unit Standard	  */
	public void setZZUnitStandard_ID (int ZZUnitStandard_ID);

	/** Get Unit Standard	  */
	public int getZZUnitStandard_ID();

	public I_ZZUnitStandard getZZUnitStandard() throws RuntimeException;

    /** Column name id */
    public static final String COLUMNNAME_id = "id";

	/** Set id	  */
	public void setid (int id);

	/** Get id	  */
	public int getid();
}
