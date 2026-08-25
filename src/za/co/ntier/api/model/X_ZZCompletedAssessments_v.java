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
/** Generated Model - DO NOT CHANGE */
package za.co.ntier.api.model;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Properties;
import org.compiere.model.*;
import org.compiere.util.Env;

/** Generated Model for ZZCompletedAssessments_v
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="ZZCompletedAssessments_v")
public class X_ZZCompletedAssessments_v extends PO implements I_ZZCompletedAssessments_v, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20260825L;

    /** Standard Constructor */
    public X_ZZCompletedAssessments_v (Properties ctx, int ZZCompletedAssessments_v_ID, String trxName)
    {
      super (ctx, ZZCompletedAssessments_v_ID, trxName);
      /** if (ZZCompletedAssessments_v_ID == 0)
        {
			setZZQCTO (false);
// N
			setmet_requirements (false);
// N
        } */
    }

    /** Standard Constructor */
    public X_ZZCompletedAssessments_v (Properties ctx, int ZZCompletedAssessments_v_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZCompletedAssessments_v_ID, trxName, virtualColumns);
      /** if (ZZCompletedAssessments_v_ID == 0)
        {
			setZZQCTO (false);
// N
			setmet_requirements (false);
// N
        } */
    }

    /** Standard Constructor */
    public X_ZZCompletedAssessments_v (Properties ctx, String ZZCompletedAssessments_v_UU, String trxName)
    {
      super (ctx, ZZCompletedAssessments_v_UU, trxName);
      /** if (ZZCompletedAssessments_v_UU == null)
        {
			setZZQCTO (false);
// N
			setmet_requirements (false);
// N
        } */
    }

    /** Standard Constructor */
    public X_ZZCompletedAssessments_v (Properties ctx, String ZZCompletedAssessments_v_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZCompletedAssessments_v_UU, trxName, virtualColumns);
      /** if (ZZCompletedAssessments_v_UU == null)
        {
			setZZQCTO (false);
// N
			setmet_requirements (false);
// N
        } */
    }

    /** Load Constructor */
    public X_ZZCompletedAssessments_v (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 3 - Client - Org
      */
    protected int get_AccessLevel()
    {
      return accessLevel.intValue();
    }

    /** Load Meta Data */
    protected POInfo initPO (Properties ctx)
    {
      POInfo poi = POInfo.getPOInfo (ctx, Table_ID, get_TrxName());
      return poi;
    }

    public String toString()
    {
      StringBuilder sb = new StringBuilder ("X_ZZCompletedAssessments_v[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public org.compiere.model.I_AD_Table getAD_Table() throws RuntimeException
	{
		return (org.compiere.model.I_AD_Table)MTable.get(getCtx(), org.compiere.model.I_AD_Table.Table_ID)
			.getPO(getAD_Table_ID(), get_TrxName());
	}

	/** Set Table.
		@param AD_Table_ID Database Table information
	*/
	public void setAD_Table_ID (int AD_Table_ID)
	{
		if (AD_Table_ID < 1)
			set_ValueNoCheck (COLUMNNAME_AD_Table_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_AD_Table_ID, Integer.valueOf(AD_Table_ID));
	}

	/** Get Table.
		@return Database Table information
	  */
	public int getAD_Table_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_Table_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Assessment Date.
		@param Assessment_Date ms_learnerqctoskillsprogrammeassessments.assessmentdate
	*/
	public void setAssessment_Date (Timestamp Assessment_Date)
	{
		set_ValueNoCheck (COLUMNNAME_Assessment_Date, Assessment_Date);
	}

	/** Get Assessment Date.
		@return ms_learnerqctoskillsprogrammeassessments.assessmentdate
	  */
	public Timestamp getAssessment_Date()
	{
		return (Timestamp)get_Value(COLUMNNAME_Assessment_Date);
	}

	/** Set Record ID.
		@param Record_ID Direct internal record ID
	*/
	public void setRecord_ID (int Record_ID)
	{
		if (Record_ID < 0)
			set_ValueNoCheck (COLUMNNAME_Record_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_Record_ID, Integer.valueOf(Record_ID));
	}

	/** Get Record ID.
		@return Direct internal record ID
	  */
	public int getRecord_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Record_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Surname.
		@param Surname Surname
	*/
	public void setSurname (String Surname)
	{
		set_ValueNoCheck (COLUMNNAME_Surname, Surname);
	}

	/** Get Surname.
		@return Surname	  */
	public String getSurname()
	{
		return (String)get_Value(COLUMNNAME_Surname);
	}

	/** Set Completions.
		@param ZZCompletedAssessments_v_ID Completions
	*/
	public void setZZCompletedAssessments_v_ID (int ZZCompletedAssessments_v_ID)
	{
		if (ZZCompletedAssessments_v_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZCompletedAssessments_v_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZCompletedAssessments_v_ID, Integer.valueOf(ZZCompletedAssessments_v_ID));
	}

	/** Get Completions.
		@return Completions	  */
	public int getZZCompletedAssessments_v_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZCompletedAssessments_v_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set ZZCompletedAssessments_v_UU.
		@param ZZCompletedAssessments_v_UU ZZCompletedAssessments_v_UU
	*/
	public void setZZCompletedAssessments_v_UU (String ZZCompletedAssessments_v_UU)
	{
		set_ValueNoCheck (COLUMNNAME_ZZCompletedAssessments_v_UU, ZZCompletedAssessments_v_UU);
	}

	/** Get ZZCompletedAssessments_v_UU.
		@return ZZCompletedAssessments_v_UU	  */
	public String getZZCompletedAssessments_v_UU()
	{
		return (String)get_Value(COLUMNNAME_ZZCompletedAssessments_v_UU);
	}

	/** Set First Name.
		@param ZZFirstName First Name
	*/
	public void setZZFirstName (String ZZFirstName)
	{
		set_ValueNoCheck (COLUMNNAME_ZZFirstName, ZZFirstName);
	}

	/** Get First Name.
		@return First Name	  */
	public String getZZFirstName()
	{
		return (String)get_Value(COLUMNNAME_ZZFirstName);
	}

	/** Set ZZLearnerLearnershipAssessments.
		@param ZZLearnerLearnershipAssessments_ID ZZLearnerLearnershipAssessments
	*/
	public void setZZLearnerLearnershipAssessments_ID (int ZZLearnerLearnershipAssessments_ID)
	{
		if (ZZLearnerLearnershipAssessments_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZLearnerLearnershipAssessments_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZLearnerLearnershipAssessments_ID, Integer.valueOf(ZZLearnerLearnershipAssessments_ID));
	}

	/** Get ZZLearnerLearnershipAssessments.
		@return ZZLearnerLearnershipAssessments	  */
	public int getZZLearnerLearnershipAssessments_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZLearnerLearnershipAssessments_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Learner Learnership.
		@param ZZLearnerLearnership_ID Learner Learnership
	*/
	public void setZZLearnerLearnership_ID (int ZZLearnerLearnership_ID)
	{
		if (ZZLearnerLearnership_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZLearnerLearnership_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZLearnerLearnership_ID, Integer.valueOf(ZZLearnerLearnership_ID));
	}

	/** Get Learner Learnership.
		@return Learner Learnership	  */
	public int getZZLearnerLearnership_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZLearnerLearnership_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Learner QCTOLearnership.
		@param ZZLearnerQCTOLearnership_ID Learner QCTOLearnership
	*/
	public void setZZLearnerQCTOLearnership_ID (int ZZLearnerQCTOLearnership_ID)
	{
		if (ZZLearnerQCTOLearnership_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZLearnerQCTOLearnership_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZLearnerQCTOLearnership_ID, Integer.valueOf(ZZLearnerQCTOLearnership_ID));
	}

	/** Get Learner QCTOLearnership.
		@return Learner QCTOLearnership
	  */
	public int getZZLearnerQCTOLearnership_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZLearnerQCTOLearnership_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set ZZLearnerQCTOSkillsProgrammeAssessments.
		@param ZZLearnerQCTOSkillsProgrammeAssessments_ID ZZLearnerQCTOSkillsProgrammeAssessments
	*/
	public void setZZLearnerQCTOSkillsProgrammeAssessments_ID (int ZZLearnerQCTOSkillsProgrammeAssessments_ID)
	{
		if (ZZLearnerQCTOSkillsProgrammeAssessments_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZLearnerQCTOSkillsProgrammeAssessments_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZLearnerQCTOSkillsProgrammeAssessments_ID, Integer.valueOf(ZZLearnerQCTOSkillsProgrammeAssessments_ID));
	}

	/** Get ZZLearnerQCTOSkillsProgrammeAssessments.
		@return ZZLearnerQCTOSkillsProgrammeAssessments	  */
	public int getZZLearnerQCTOSkillsProgrammeAssessments_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZLearnerQCTOSkillsProgrammeAssessments_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Learner QCTOSkills Programme.
		@param ZZLearnerQCTOSkillsProgramme_ID Learner QCTOSkills Programme
	*/
	public void setZZLearnerQCTOSkillsProgramme_ID (int ZZLearnerQCTOSkillsProgramme_ID)
	{
		if (ZZLearnerQCTOSkillsProgramme_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZLearnerQCTOSkillsProgramme_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZLearnerQCTOSkillsProgramme_ID, Integer.valueOf(ZZLearnerQCTOSkillsProgramme_ID));
	}

	/** Get Learner QCTOSkills Programme.
		@return Learner QCTOSkills Programme
	  */
	public int getZZLearnerQCTOSkillsProgramme_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZLearnerQCTOSkillsProgramme_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Learner QCTOLearnership Assessments.
		@param ZZLearnerQctoLearnershipAssessments_ID Learner QCTOLearnership Assessments
	*/
	public void setZZLearnerQctoLearnershipAssessments_ID (int ZZLearnerQctoLearnershipAssessments_ID)
	{
		if (ZZLearnerQctoLearnershipAssessments_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZLearnerQctoLearnershipAssessments_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZLearnerQctoLearnershipAssessments_ID, Integer.valueOf(ZZLearnerQctoLearnershipAssessments_ID));
	}

	/** Get Learner QCTOLearnership Assessments.
		@return Learner QCTOLearnership Assessments	  */
	public int getZZLearnerQctoLearnershipAssessments_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZLearnerQctoLearnershipAssessments_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Skills Programme Assessments.
		@param ZZLearnerSkillsProgrammeAssessments_ID Skills Programme Assessments
	*/
	public void setZZLearnerSkillsProgrammeAssessments_ID (int ZZLearnerSkillsProgrammeAssessments_ID)
	{
		if (ZZLearnerSkillsProgrammeAssessments_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZLearnerSkillsProgrammeAssessments_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZLearnerSkillsProgrammeAssessments_ID, Integer.valueOf(ZZLearnerSkillsProgrammeAssessments_ID));
	}

	/** Get Skills Programme Assessments.
		@return Skills Programme Assessments	  */
	public int getZZLearnerSkillsProgrammeAssessments_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZLearnerSkillsProgrammeAssessments_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Learner Skills Programme.
		@param ZZLearnerSkillsProgramme_ID Learner Skills Programme
	*/
	public void setZZLearnerSkillsProgramme_ID (int ZZLearnerSkillsProgramme_ID)
	{
		if (ZZLearnerSkillsProgramme_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZLearnerSkillsProgramme_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZLearnerSkillsProgramme_ID, Integer.valueOf(ZZLearnerSkillsProgramme_ID));
	}

	/** Get Learner Skills Programme.
		@return Learner Skills Programme	  */
	public int getZZLearnerSkillsProgramme_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZLearnerSkillsProgramme_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Learner.
		@param ZZLearner_ID Learner
	*/
	public void setZZLearner_ID (int ZZLearner_ID)
	{
		if (ZZLearner_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZLearner_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZLearner_ID, Integer.valueOf(ZZLearner_ID));
	}

	/** Get Learner.
		@return Learner	  */
	public int getZZLearner_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZLearner_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Other ID No.
		@param ZZOtherIDNo RSA Id store at ZZ_ID_Passport_No remain tyoe of id store at ZZOtherIDNo
	*/
	public void setZZOtherIDNo (String ZZOtherIDNo)
	{
		set_ValueNoCheck (COLUMNNAME_ZZOtherIDNo, ZZOtherIDNo);
	}

	/** Get Other ID No.
		@return RSA Id store at ZZ_ID_Passport_No remain tyoe of id store at ZZOtherIDNo
	  */
	public String getZZOtherIDNo()
	{
		return (String)get_Value(COLUMNNAME_ZZOtherIDNo);
	}

	/** Set ZZQCTO.
		@param ZZQCTO ms_learnerlearnership.qcto (source data is messy free text - no crosswalk attempted)
	*/
	public void setZZQCTO (boolean ZZQCTO)
	{
		set_ValueNoCheck (COLUMNNAME_ZZQCTO, Boolean.valueOf(ZZQCTO));
	}

	/** Get ZZQCTO.
		@return ms_learnerlearnership.qcto (source data is messy free text - no crosswalk attempted)
	  */
	public boolean isZZQCTO()
	{
		Object oo = get_Value(COLUMNNAME_ZZQCTO);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Approved By Manager Finance Consumables = AC */
	public static final String ZZ_DOCSTATUS_ApprovedByManagerFinanceConsumables = "AC";
	/** Approved = AP */
	public static final String ZZ_DOCSTATUS_Approved = "AP";
	/** Prepared for CEO = CF */
	public static final String ZZ_DOCSTATUS_PreparedForCEO = "CF";
	/** Completed = CO */
	public static final String ZZ_DOCSTATUS_Completed = "CO";
	/** Draft = DR */
	public static final String ZZ_DOCSTATUS_Draft = "DR";
	/** Error Importing = EE */
	public static final String ZZ_DOCSTATUS_ErrorImporting = "EE";
	/** Validation Error = ER */
	public static final String ZZ_DOCSTATUS_ValidationError = "ER";
	/** Evaluated = EV */
	public static final String ZZ_DOCSTATUS_Evaluated = "EV";
	/** Importing = IG */
	public static final String ZZ_DOCSTATUS_Importing = "IG";
	/** Imported = IM */
	public static final String ZZ_DOCSTATUS_Imported = "IM";
	/** In Progress = IP */
	public static final String ZZ_DOCSTATUS_InProgress = "IP";
	/** Not Recommended By Senior Mgr SDR = N1 */
	public static final String ZZ_DOCSTATUS_NotRecommendedBySeniorMgrSDR = "N1";
	/** Not Recommended By Senior Mgr Finance = N2 */
	public static final String ZZ_DOCSTATUS_NotRecommendedBySeniorMgrFinance = "N2";
	/** Not Recommended By COO = N3 */
	public static final String ZZ_DOCSTATUS_NotRecommendedByCOO = "N3";
	/** Not Recommended By CFO = N4 */
	public static final String ZZ_DOCSTATUS_NotRecommendedByCFO = "N4";
	/** Not Recommended By CEO = N5 */
	public static final String ZZ_DOCSTATUS_NotRecommendedByCEO = "N5";
	/** Not Approved by Snr Manager = NA */
	public static final String ZZ_DOCSTATUS_NotApprovedBySnrManager = "NA";
	/** Not Approved By Manager Finance Consumables = NC */
	public static final String ZZ_DOCSTATUS_NotApprovedByManagerFinanceConsumables = "NC";
	/** Not Approved By SDL Finance Mgr = ND */
	public static final String ZZ_DOCSTATUS_NotApprovedBySDLFinanceMgr = "ND";
	/** Not Approved By IT Manager = NI */
	public static final String ZZ_DOCSTATUS_NotApprovedByITManager = "NI";
	/** Not Approved by LM = NL */
	public static final String ZZ_DOCSTATUS_NotApprovedByLM = "NL";
	/** Not Approved = NP */
	public static final String ZZ_DOCSTATUS_NotApproved = "NP";
	/** Not Recommended = NR */
	public static final String ZZ_DOCSTATUS_NotRecommended = "NR";
	/** Not Approved by Snr Admin Finance = NS */
	public static final String ZZ_DOCSTATUS_NotApprovedBySnrAdminFinance = "NS";
	/** Not Verified = NV */
	public static final String ZZ_DOCSTATUS_NotVerified = "NV";
	/** Pending = PE */
	public static final String ZZ_DOCSTATUS_Pending = "PE";
	/** Query = QR */
	public static final String ZZ_DOCSTATUS_Query = "QR";
	/** Recommended By Senior Mgr Finance = R1 */
	public static final String ZZ_DOCSTATUS_RecommendedBySeniorMgrFinance = "R1";
	/** Recommended By COO = R2 */
	public static final String ZZ_DOCSTATUS_RecommendedByCOO = "R2";
	/** Recommended By CFO = R3 */
	public static final String ZZ_DOCSTATUS_RecommendedByCFO = "R3";
	/** Recommended By CEO = R4 */
	public static final String ZZ_DOCSTATUS_RecommendedByCEO = "R4";
	/** Recommended By Officer - QA Accreditation = R5 */
	public static final String ZZ_DOCSTATUS_RecommendedByOfficer_QAAccreditation = "R5";
	/** Recommended By Mgr - QA Accreditation = R6 */
	public static final String ZZ_DOCSTATUS_RecommendedByMgr_QAAccreditation = "R6";
	/** Recommended By Snr Mgr QA = R7 */
	public static final String ZZ_DOCSTATUS_RecommendedBySnrMgrQA = "R7";
	/** Recommended for Approval = RA */
	public static final String ZZ_DOCSTATUS_RecommendedForApproval = "RA";
	/** Recommended = RC */
	public static final String ZZ_DOCSTATUS_Recommended = "RC";
	/** Recommended By Senior Mgr SDR = RD */
	public static final String ZZ_DOCSTATUS_RecommendedBySeniorMgrSDR = "RD";
	/** Recommended for Evaluation = RE */
	public static final String ZZ_DOCSTATUS_RecommendedForEvaluation = "RE";
	/** Submitted to Manager Finance Consumables = SC */
	public static final String ZZ_DOCSTATUS_SubmittedToManagerFinanceConsumables = "SC";
	/** Submitted To SDL Finance Mgr = SD */
	public static final String ZZ_DOCSTATUS_SubmittedToSDLFinanceMgr = "SD";
	/** Submitted To IT Manager = SI */
	public static final String ZZ_DOCSTATUS_SubmittedToITManager = "SI";
	/** Submitted To IT Admin = ST */
	public static final String ZZ_DOCSTATUS_SubmittedToITAdmin = "ST";
	/** Submitted = SU */
	public static final String ZZ_DOCSTATUS_Submitted = "SU";
	/** Transfer Out = TO */
	public static final String ZZ_DOCSTATUS_TransferOut = "TO";
	/** Updated by SDR Admin = UA */
	public static final String ZZ_DOCSTATUS_UpdatedBySDRAdmin = "UA";
	/** Uploaded = UP */
	public static final String ZZ_DOCSTATUS_Uploaded = "UP";
	/** Delinked = UnSdfOrg */
	public static final String ZZ_DOCSTATUS_Delinked = "UnSdfOrg";
	/** Validating = VA */
	public static final String ZZ_DOCSTATUS_Validating = "VA";
	/** Verified = VE */
	public static final String ZZ_DOCSTATUS_Verified = "VE";
	/** Set Document Status.
		@param ZZ_DocStatus Document Status
	*/
	public void setZZ_DocStatus (String ZZ_DocStatus)
	{

		set_ValueNoCheck (COLUMNNAME_ZZ_DocStatus, ZZ_DocStatus);
	}

	/** Get Document Status.
		@return Document Status	  */
	public String getZZ_DocStatus()
	{
		return (String)get_Value(COLUMNNAME_ZZ_DocStatus);
	}

	/** Set ID No.
		@param ZZ_ID_Passport_No ID No
	*/
	public void setZZ_ID_Passport_No (String ZZ_ID_Passport_No)
	{
		set_ValueNoCheck (COLUMNNAME_ZZ_ID_Passport_No, ZZ_ID_Passport_No);
	}

	/** Get ID No.
		@return ID No	  */
	public String getZZ_ID_Passport_No()
	{
		return (String)get_Value(COLUMNNAME_ZZ_ID_Passport_No);
	}

	/** Set Met Requirements.
		@param met_requirements Met Requirements
	*/
	public void setmet_requirements (boolean met_requirements)
	{
		set_ValueNoCheck (COLUMNNAME_met_requirements, Boolean.valueOf(met_requirements));
	}

	/** Get Met Requirements.
		@return Met Requirements	  */
	public boolean ismet_requirements()
	{
		Object oo = get_Value(COLUMNNAME_met_requirements);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Minimum Required Credits.
		@param minimum_required_credits Minimum Required Credits
	*/
	public void setminimum_required_credits (BigDecimal minimum_required_credits)
	{
		set_ValueNoCheck (COLUMNNAME_minimum_required_credits, minimum_required_credits);
	}

	/** Get Minimum Required Credits.
		@return Minimum Required Credits	  */
	public BigDecimal getminimum_required_credits()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_minimum_required_credits);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Total Achieved Credits.
		@param total_achieved_credits Total Achieved Credits
	*/
	public void settotal_achieved_credits (BigDecimal total_achieved_credits)
	{
		set_ValueNoCheck (COLUMNNAME_total_achieved_credits, total_achieved_credits);
	}

	/** Get Total Achieved Credits.
		@return Total Achieved Credits	  */
	public BigDecimal gettotal_achieved_credits()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_total_achieved_credits);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}
}