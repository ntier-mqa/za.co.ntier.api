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

/** Generated Interface for ZZLearnerQctoLearnershipAssessments
 *  @author iDempiere (generated) 
 *  @version Release 12
 */
@SuppressWarnings("all")
public interface I_ZZLearnerQctoLearnershipAssessments 
{

    /** TableName=ZZLearnerQctoLearnershipAssessments */
    public static final String Table_Name = "ZZLearnerQctoLearnershipAssessments";

    /** AD_Table_ID=1000517 */
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

    /** Column name Assessor_ID */
    public static final String COLUMNNAME_Assessor_ID = "Assessor_ID";

	/** Set Assessor ID.
	  * ms_learnerqctoskillsprogrammeassessments.assessorid (ms_user email match)
	  */
	public void setAssessor_ID (int Assessor_ID);

	/** Get Assessor ID.
	  * ms_learnerqctoskillsprogrammeassessments.assessorid (ms_user email match)
	  */
	public int getAssessor_ID();

	public org.compiere.model.I_AD_User getAssessor() throws RuntimeException;

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

    /** Column name Date_Partial_Approved */
    public static final String COLUMNNAME_Date_Partial_Approved = "Date_Partial_Approved";

	/** Set Date Partial Approved.
	  * ms_learnerqctolearnershipassessments.datepartialapproved
	  */
	public void setDate_Partial_Approved (Timestamp Date_Partial_Approved);

	/** Get Date Partial Approved.
	  * ms_learnerqctolearnershipassessments.datepartialapproved
	  */
	public Timestamp getDate_Partial_Approved();

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

    /** Column name Is_Partial_Approved */
    public static final String COLUMNNAME_Is_Partial_Approved = "Is_Partial_Approved";

	/** Set Is Partial Approved.
	  * ms_learnerqctolearnershipassessments.ispartialapproved
	  */
	public void setIs_Partial_Approved (boolean Is_Partial_Approved);

	/** Get Is Partial Approved.
	  * ms_learnerqctolearnershipassessments.ispartialapproved
	  */
	public boolean is_Partial_Approved();

    /** Column name Is_Previously_Achieved */
    public static final String COLUMNNAME_Is_Previously_Achieved = "Is_Previously_Achieved";

	/** Set Is Previously Achieved.
	  * ms_learnerqctolearnershipassessments.ispreviouslyachieved
	  */
	public void setIs_Previously_Achieved (boolean Is_Previously_Achieved);

	/** Get Is Previously Achieved.
	  * ms_learnerqctolearnershipassessments.ispreviouslyachieved
	  */
	public boolean is_Previously_Achieved();

    /** Column name Moderator_ID */
    public static final String COLUMNNAME_Moderator_ID = "Moderator_ID";

	/** Set Moderator ID.
	  * ms_learnerqctoskillsprogrammeassessments.moderatorid (ms_user email match)
	  */
	public void setModerator_ID (int Moderator_ID);

	/** Get Moderator ID.
	  * ms_learnerqctoskillsprogrammeassessments.moderatorid (ms_user email match)
	  */
	public int getModerator_ID();

	public org.compiere.model.I_AD_User getModerator() throws RuntimeException;

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

	public I_ZZAssessorPerson getZZAssessorPerson() throws RuntimeException;

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

    /** Column name ZZLearnerQCTOLearnership_ID */
    public static final String COLUMNNAME_ZZLearnerQCTOLearnership_ID = "ZZLearnerQCTOLearnership_ID";

	/** Set Learner QCTOLearnership.
	  * Learner QCTOLearnership
	  */
	public void setZZLearnerQCTOLearnership_ID (int ZZLearnerQCTOLearnership_ID);

	/** Get Learner QCTOLearnership.
	  * Learner QCTOLearnership
	  */
	public int getZZLearnerQCTOLearnership_ID();

	public I_ZZLearnerQCTOLearnership getZZLearnerQCTOLearnership() throws RuntimeException;

    /** Column name ZZLearnerQctoLearnershipAssessments_ID */
    public static final String COLUMNNAME_ZZLearnerQctoLearnershipAssessments_ID = "ZZLearnerQctoLearnershipAssessments_ID";

	/** Set Learner QCTOLearnership Assessments	  */
	public void setZZLearnerQctoLearnershipAssessments_ID (int ZZLearnerQctoLearnershipAssessments_ID);

	/** Get Learner QCTOLearnership Assessments	  */
	public int getZZLearnerQctoLearnershipAssessments_ID();

    /** Column name ZZLearnerQctoLearnershipAssessments_UU */
    public static final String COLUMNNAME_ZZLearnerQctoLearnershipAssessments_UU = "ZZLearnerQctoLearnershipAssessments_UU";

	/** Set ZZLearnerQctoLearnershipAssessments_UU	  */
	public void setZZLearnerQctoLearnershipAssessments_UU (String ZZLearnerQctoLearnershipAssessments_UU);

	/** Get ZZLearnerQctoLearnershipAssessments_UU	  */
	public String getZZLearnerQctoLearnershipAssessments_UU();

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

	public I_ZZAssessorPerson getZZModerator() throws RuntimeException;

    /** Column name ZZPreviouslyAchieved */
    public static final String COLUMNNAME_ZZPreviouslyAchieved = "ZZPreviouslyAchieved";

	/** Set Previously Achieved	  */
	public void setZZPreviouslyAchieved (String ZZPreviouslyAchieved);

	/** Get Previously Achieved	  */
	public String getZZPreviouslyAchieved();

    /** Column name ZZQctoModule_ID */
    public static final String COLUMNNAME_ZZQctoModule_ID = "ZZQctoModule_ID";

	/** Set QCTO Module	  */
	public void setZZQctoModule_ID (int ZZQctoModule_ID);

	/** Get QCTO Module	  */
	public int getZZQctoModule_ID();

	public I_ZZQctoModule getZZQctoModule() throws RuntimeException;

    /** Column name ZZRPL */
    public static final String COLUMNNAME_ZZRPL = "ZZRPL";

	/** Set RPL	  */
	public void setZZRPL (String ZZRPL);

	/** Get RPL	  */
	public String getZZRPL();

    /** Column name id */
    public static final String COLUMNNAME_id = "id";

	/** Set id	  */
	public void setid (int id);

	/** Get id	  */
	public int getid();
}
