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

/** Generated Interface for ZZLearnerQCTOSkillsProgrammeAssessments
 *  @author iDempiere (generated) 
 *  @version Release 12
 */
@SuppressWarnings("all")
public interface I_ZZLearnerQCTOSkillsProgrammeAssessments 
{

    /** TableName=ZZLearnerQCTOSkillsProgrammeAssessments */
    public static final String Table_Name = "ZZLearnerQCTOSkillsProgrammeAssessments";

    /** AD_Table_ID=1000637 */
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

    /** Column name Assessment_Date */
    public static final String COLUMNNAME_Assessment_Date = "Assessment_Date";

	/** Set Assessment Date.
	  * ms_learnerqctoskillsprogrammeassessments.assessmentdate
	  */
	public void setAssessment_Date (Timestamp Assessment_Date);

	/** Get Assessment Date.
	  * ms_learnerqctoskillsprogrammeassessments.assessmentdate
	  */
	public Timestamp getAssessment_Date();

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

    /** Column name Date_Assessment_Captured */
    public static final String COLUMNNAME_Date_Assessment_Captured = "Date_Assessment_Captured";

	/** Set Date Assessment Captured.
	  * ms_learnerqctoskillsprogrammeassessments.dateassessmentcaptured
	  */
	public void setDate_Assessment_Captured (Timestamp Date_Assessment_Captured);

	/** Get Date Assessment Captured.
	  * ms_learnerqctoskillsprogrammeassessments.dateassessmentcaptured
	  */
	public Timestamp getDate_Assessment_Captured();

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

    /** Column name Moderation_Date */
    public static final String COLUMNNAME_Moderation_Date = "Moderation_Date";

	/** Set Moderation Date.
	  * ms_learnerqctoskillsprogrammeassessments.moderationdate
	  */
	public void setModeration_Date (Timestamp Moderation_Date);

	/** Get Moderation Date.
	  * ms_learnerqctoskillsprogrammeassessments.moderationdate
	  */
	public Timestamp getModeration_Date();

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

    /** Column name ZZAssessmentStatus */
    public static final String COLUMNNAME_ZZAssessmentStatus = "ZZAssessmentStatus";

	/** Set Assessment Status	  */
	public void setZZAssessmentStatus (String ZZAssessmentStatus);

	/** Get Assessment Status	  */
	public String getZZAssessmentStatus();

    /** Column name ZZLearnerQCTOSkillsProgrammeAssessments_ID */
    public static final String COLUMNNAME_ZZLearnerQCTOSkillsProgrammeAssessments_ID = "ZZLearnerQCTOSkillsProgrammeAssessments_ID";

	/** Set ZZLearnerQCTOSkillsProgrammeAssessments	  */
	public void setZZLearnerQCTOSkillsProgrammeAssessments_ID (int ZZLearnerQCTOSkillsProgrammeAssessments_ID);

	/** Get ZZLearnerQCTOSkillsProgrammeAssessments	  */
	public int getZZLearnerQCTOSkillsProgrammeAssessments_ID();

    /** Column name ZZLearnerQCTOSkillsProgrammeAssessments_UU */
    public static final String COLUMNNAME_ZZLearnerQCTOSkillsProgrammeAssessments_UU = "ZZLearnerQCTOSkillsProgrammeAssessments_UU";

	/** Set ZZLearnerQCTOSkillsProgrammeAssessments_UU	  */
	public void setZZLearnerQCTOSkillsProgrammeAssessments_UU (String ZZLearnerQCTOSkillsProgrammeAssessments_UU);

	/** Get ZZLearnerQCTOSkillsProgrammeAssessments_UU	  */
	public String getZZLearnerQCTOSkillsProgrammeAssessments_UU();

    /** Column name ZZLearnerQCTOSkillsProgramme_ID */
    public static final String COLUMNNAME_ZZLearnerQCTOSkillsProgramme_ID = "ZZLearnerQCTOSkillsProgramme_ID";

	/** Set Learner QCTOSkills Programme.
	  * Learner QCTOSkills Programme
	  */
	public void setZZLearnerQCTOSkillsProgramme_ID (int ZZLearnerQCTOSkillsProgramme_ID);

	/** Get Learner QCTOSkills Programme.
	  * Learner QCTOSkills Programme
	  */
	public int getZZLearnerQCTOSkillsProgramme_ID();

	public I_ZZLearnerQCTOSkillsProgramme getZZLearnerQCTOSkillsProgramme() throws RuntimeException;

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
	public void setZZRPL (boolean ZZRPL);

	/** Get RPL	  */
	public boolean isZZRPL();

    /** Column name id */
    public static final String COLUMNNAME_id = "id";

	/** Set id	  */
	public void setid (int id);

	/** Get id	  */
	public int getid();
}
