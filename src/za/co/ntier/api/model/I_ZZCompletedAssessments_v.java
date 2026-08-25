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

/** Generated Interface for ZZCompletedAssessments_v
 *  @author iDempiere (generated) 
 *  @version Release 12
 */
@SuppressWarnings("all")
public interface I_ZZCompletedAssessments_v 
{

    /** TableName=ZZCompletedAssessments_v */
    public static final String Table_Name = "ZZCompletedAssessments_v";

    /** AD_Table_ID=1000375 */
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

    /** Column name AD_Table_ID */
    public static final String COLUMNNAME_AD_Table_ID = "AD_Table_ID";

	/** Set Table.
	  * Database Table information
	  */
	public void setAD_Table_ID (int AD_Table_ID);

	/** Get Table.
	  * Database Table information
	  */
	public int getAD_Table_ID();

	public org.compiere.model.I_AD_Table getAD_Table() throws RuntimeException;

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

    /** Column name Record_ID */
    public static final String COLUMNNAME_Record_ID = "Record_ID";

	/** Set Record ID.
	  * Direct internal record ID
	  */
	public void setRecord_ID (int Record_ID);

	/** Get Record ID.
	  * Direct internal record ID
	  */
	public int getRecord_ID();

    /** Column name Surname */
    public static final String COLUMNNAME_Surname = "Surname";

	/** Set Surname	  */
	public void setSurname (String Surname);

	/** Get Surname	  */
	public String getSurname();

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

    /** Column name ZZCompletedAssessments_v_ID */
    public static final String COLUMNNAME_ZZCompletedAssessments_v_ID = "ZZCompletedAssessments_v_ID";

	/** Set Completions	  */
	public void setZZCompletedAssessments_v_ID (int ZZCompletedAssessments_v_ID);

	/** Get Completions	  */
	public int getZZCompletedAssessments_v_ID();

    /** Column name ZZCompletedAssessments_v_UU */
    public static final String COLUMNNAME_ZZCompletedAssessments_v_UU = "ZZCompletedAssessments_v_UU";

	/** Set ZZCompletedAssessments_v_UU	  */
	public void setZZCompletedAssessments_v_UU (String ZZCompletedAssessments_v_UU);

	/** Get ZZCompletedAssessments_v_UU	  */
	public String getZZCompletedAssessments_v_UU();

    /** Column name ZZFirstName */
    public static final String COLUMNNAME_ZZFirstName = "ZZFirstName";

	/** Set First Name	  */
	public void setZZFirstName (String ZZFirstName);

	/** Get First Name	  */
	public String getZZFirstName();

    /** Column name ZZLearnerLearnershipAssessments_ID */
    public static final String COLUMNNAME_ZZLearnerLearnershipAssessments_ID = "ZZLearnerLearnershipAssessments_ID";

	/** Set ZZLearnerLearnershipAssessments	  */
	public void setZZLearnerLearnershipAssessments_ID (int ZZLearnerLearnershipAssessments_ID);

	/** Get ZZLearnerLearnershipAssessments	  */
	public int getZZLearnerLearnershipAssessments_ID();

    /** Column name ZZLearnerLearnership_ID */
    public static final String COLUMNNAME_ZZLearnerLearnership_ID = "ZZLearnerLearnership_ID";

	/** Set Learner Learnership	  */
	public void setZZLearnerLearnership_ID (int ZZLearnerLearnership_ID);

	/** Get Learner Learnership	  */
	public int getZZLearnerLearnership_ID();

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

    /** Column name ZZLearnerQCTOSkillsProgrammeAssessments_ID */
    public static final String COLUMNNAME_ZZLearnerQCTOSkillsProgrammeAssessments_ID = "ZZLearnerQCTOSkillsProgrammeAssessments_ID";

	/** Set ZZLearnerQCTOSkillsProgrammeAssessments	  */
	public void setZZLearnerQCTOSkillsProgrammeAssessments_ID (int ZZLearnerQCTOSkillsProgrammeAssessments_ID);

	/** Get ZZLearnerQCTOSkillsProgrammeAssessments	  */
	public int getZZLearnerQCTOSkillsProgrammeAssessments_ID();

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

    /** Column name ZZLearnerQctoLearnershipAssessments_ID */
    public static final String COLUMNNAME_ZZLearnerQctoLearnershipAssessments_ID = "ZZLearnerQctoLearnershipAssessments_ID";

	/** Set Learner QCTOLearnership Assessments	  */
	public void setZZLearnerQctoLearnershipAssessments_ID (int ZZLearnerQctoLearnershipAssessments_ID);

	/** Get Learner QCTOLearnership Assessments	  */
	public int getZZLearnerQctoLearnershipAssessments_ID();

    /** Column name ZZLearnerSkillsProgrammeAssessments_ID */
    public static final String COLUMNNAME_ZZLearnerSkillsProgrammeAssessments_ID = "ZZLearnerSkillsProgrammeAssessments_ID";

	/** Set Skills Programme Assessments	  */
	public void setZZLearnerSkillsProgrammeAssessments_ID (int ZZLearnerSkillsProgrammeAssessments_ID);

	/** Get Skills Programme Assessments	  */
	public int getZZLearnerSkillsProgrammeAssessments_ID();

    /** Column name ZZLearnerSkillsProgramme_ID */
    public static final String COLUMNNAME_ZZLearnerSkillsProgramme_ID = "ZZLearnerSkillsProgramme_ID";

	/** Set Learner Skills Programme	  */
	public void setZZLearnerSkillsProgramme_ID (int ZZLearnerSkillsProgramme_ID);

	/** Get Learner Skills Programme	  */
	public int getZZLearnerSkillsProgramme_ID();

    /** Column name ZZLearner_ID */
    public static final String COLUMNNAME_ZZLearner_ID = "ZZLearner_ID";

	/** Set Learner	  */
	public void setZZLearner_ID (int ZZLearner_ID);

	/** Get Learner	  */
	public int getZZLearner_ID();

    /** Column name ZZOtherIDNo */
    public static final String COLUMNNAME_ZZOtherIDNo = "ZZOtherIDNo";

	/** Set Other ID No.
	  * RSA Id store at ZZ_ID_Passport_No remain tyoe of id store at ZZOtherIDNo
	  */
	public void setZZOtherIDNo (String ZZOtherIDNo);

	/** Get Other ID No.
	  * RSA Id store at ZZ_ID_Passport_No remain tyoe of id store at ZZOtherIDNo
	  */
	public String getZZOtherIDNo();

    /** Column name ZZQCTO */
    public static final String COLUMNNAME_ZZQCTO = "ZZQCTO";

	/** Set ZZQCTO.
	  * ms_learnerlearnership.qcto (source data is messy free text - no crosswalk attempted)
	  */
	public void setZZQCTO (boolean ZZQCTO);

	/** Get ZZQCTO.
	  * ms_learnerlearnership.qcto (source data is messy free text - no crosswalk attempted)
	  */
	public boolean isZZQCTO();

    /** Column name ZZ_DocStatus */
    public static final String COLUMNNAME_ZZ_DocStatus = "ZZ_DocStatus";

	/** Set Document Status	  */
	public void setZZ_DocStatus (String ZZ_DocStatus);

	/** Get Document Status	  */
	public String getZZ_DocStatus();

    /** Column name ZZ_ID_Passport_No */
    public static final String COLUMNNAME_ZZ_ID_Passport_No = "ZZ_ID_Passport_No";

	/** Set ID No	  */
	public void setZZ_ID_Passport_No (String ZZ_ID_Passport_No);

	/** Get ID No	  */
	public String getZZ_ID_Passport_No();

    /** Column name met_requirements */
    public static final String COLUMNNAME_met_requirements = "met_requirements";

	/** Set Met Requirements	  */
	public void setmet_requirements (boolean met_requirements);

	/** Get Met Requirements	  */
	public boolean ismet_requirements();

    /** Column name minimum_required_credits */
    public static final String COLUMNNAME_minimum_required_credits = "minimum_required_credits";

	/** Set Minimum Required Credits	  */
	public void setminimum_required_credits (BigDecimal minimum_required_credits);

	/** Get Minimum Required Credits	  */
	public BigDecimal getminimum_required_credits();

    /** Column name total_achieved_credits */
    public static final String COLUMNNAME_total_achieved_credits = "total_achieved_credits";

	/** Set Total Achieved Credits	  */
	public void settotal_achieved_credits (BigDecimal total_achieved_credits);

	/** Get Total Achieved Credits	  */
	public BigDecimal gettotal_achieved_credits();
}
