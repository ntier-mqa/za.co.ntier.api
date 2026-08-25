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

import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Properties;
import org.compiere.model.*;

/** Generated Model for ZZLearnerSkillsProgramme
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="ZZLearnerSkillsProgramme")
public class X_ZZLearnerSkillsProgramme extends PO implements I_ZZLearnerSkillsProgramme, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20260825L;

    /** Standard Constructor */
    public X_ZZLearnerSkillsProgramme (Properties ctx, int ZZLearnerSkillsProgramme_ID, String trxName)
    {
      super (ctx, ZZLearnerSkillsProgramme_ID, trxName);
      /** if (ZZLearnerSkillsProgramme_ID == 0)
        {
        } */
    }

    /** Standard Constructor */
    public X_ZZLearnerSkillsProgramme (Properties ctx, int ZZLearnerSkillsProgramme_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZLearnerSkillsProgramme_ID, trxName, virtualColumns);
      /** if (ZZLearnerSkillsProgramme_ID == 0)
        {
        } */
    }

    /** Standard Constructor */
    public X_ZZLearnerSkillsProgramme (Properties ctx, String ZZLearnerSkillsProgramme_UU, String trxName)
    {
      super (ctx, ZZLearnerSkillsProgramme_UU, trxName);
      /** if (ZZLearnerSkillsProgramme_UU == null)
        {
        } */
    }

    /** Standard Constructor */
    public X_ZZLearnerSkillsProgramme (Properties ctx, String ZZLearnerSkillsProgramme_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZLearnerSkillsProgramme_UU, trxName, virtualColumns);
      /** if (ZZLearnerSkillsProgramme_UU == null)
        {
        } */
    }

    /** Load Constructor */
    public X_ZZLearnerSkillsProgramme (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_ZZLearnerSkillsProgramme[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public I_ZZAssessmentCentre getZZAC() throws RuntimeException
	{
		return (I_ZZAssessmentCentre)MTable.get(getCtx(), I_ZZAssessmentCentre.Table_ID)
			.getPO(getZZAC_ID(), get_TrxName());
	}

	/** Set Assessment Centre.
		@param ZZAC_ID Assessment Centre
	*/
	public void setZZAC_ID (int ZZAC_ID)
	{
		if (ZZAC_ID < 1)
			set_Value (COLUMNNAME_ZZAC_ID, null);
		else
			set_Value (COLUMNNAME_ZZAC_ID, Integer.valueOf(ZZAC_ID));
	}

	/** Get Assessment Centre.
		@return Assessment Centre	  */
	public int getZZAC_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZAC_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Agreement Reference Number.
		@param ZZAgreementReferenceNumber Agreement Reference Number
	*/
	public void setZZAgreementReferenceNumber (String ZZAgreementReferenceNumber)
	{
		set_Value (COLUMNNAME_ZZAgreementReferenceNumber, ZZAgreementReferenceNumber);
	}

	/** Get Agreement Reference Number.
		@return Agreement Reference Number	  */
	public String getZZAgreementReferenceNumber()
	{
		return (String)get_Value(COLUMNNAME_ZZAgreementReferenceNumber);
	}

	/** Set Commencement Date.
		@param ZZCommencementDate Commencement Date
	*/
	public void setZZCommencementDate (Timestamp ZZCommencementDate)
	{
		set_Value (COLUMNNAME_ZZCommencementDate, ZZCommencementDate);
	}

	/** Get Commencement Date.
		@return Commencement Date	  */
	public Timestamp getZZCommencementDate()
	{
		return (Timestamp)get_Value(COLUMNNAME_ZZCommencementDate);
	}

	/** Set Estimate Completion Date.
		@param ZZCompletionDate Estimate Completion Date
	*/
	public void setZZCompletionDate (Timestamp ZZCompletionDate)
	{
		set_Value (COLUMNNAME_ZZCompletionDate, ZZCompletionDate);
	}

	/** Get Estimate Completion Date.
		@return Estimate Completion Date	  */
	public Timestamp getZZCompletionDate()
	{
		return (Timestamp)get_Value(COLUMNNAME_ZZCompletionDate);
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

	/** Set Learner Skills Programme UU.
		@param ZZLearnerSkillsProgramme_UU Learner Skills Programme UU
	*/
	public void setZZLearnerSkillsProgramme_UU (String ZZLearnerSkillsProgramme_UU)
	{
		set_ValueNoCheck (COLUMNNAME_ZZLearnerSkillsProgramme_UU, ZZLearnerSkillsProgramme_UU);
	}

	/** Get Learner Skills Programme UU.
		@return Learner Skills Programme UU	  */
	public String getZZLearnerSkillsProgramme_UU()
	{
		return (String)get_Value(COLUMNNAME_ZZLearnerSkillsProgramme_UU);
	}

	public I_ZZLearner getZZLearner() throws RuntimeException
	{
		return (I_ZZLearner)MTable.get(getCtx(), I_ZZLearner.Table_ID)
			.getPO(getZZLearner_ID(), get_TrxName());
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

	/** Set SETA.
		@param ZZSeta SETA
	*/
	public void setZZSeta (String ZZSeta)
	{

		set_Value (COLUMNNAME_ZZSeta, ZZSeta);
	}

	/** Get SETA.
		@return SETA	  */
	public String getZZSeta()
	{
		return (String)get_Value(COLUMNNAME_ZZSeta);
	}

	public I_ZZSkillsProgramme getZZSkillsProgramme() throws RuntimeException
	{
		return (I_ZZSkillsProgramme)MTable.get(getCtx(), I_ZZSkillsProgramme.Table_ID)
			.getPO(getZZSkillsProgramme_ID(), get_TrxName());
	}

	/** Set Skills Programme.
		@param ZZSkillsProgramme_ID Skills Programme
	*/
	public void setZZSkillsProgramme_ID (int ZZSkillsProgramme_ID)
	{
		if (ZZSkillsProgramme_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZSkillsProgramme_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZSkillsProgramme_ID, Integer.valueOf(ZZSkillsProgramme_ID));
	}

	/** Get Skills Programme.
		@return Skills Programme	  */
	public int getZZSkillsProgramme_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZSkillsProgramme_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Employed = 01 */
	public static final String ZZSOCIOECONOMICSTATUS_Employed = "01";
	/** Unemployed = 02 */
	public static final String ZZSOCIOECONOMICSTATUS_Unemployed = "02";
	/** Set Socio Economic Status.
		@param ZZSocioEconomicStatus Socio Economic Status
	*/
	public void setZZSocioEconomicStatus (String ZZSocioEconomicStatus)
	{

		set_Value (COLUMNNAME_ZZSocioEconomicStatus, ZZSocioEconomicStatus);
	}

	/** Get Socio Economic Status.
		@return Socio Economic Status	  */
	public String getZZSocioEconomicStatus()
	{
		return (String)get_Value(COLUMNNAME_ZZSocioEconomicStatus);
	}

	/** Set Status Effective Date.
		@param ZZStatusEffectiveDate Status Effective Date
	*/
	public void setZZStatusEffectiveDate (Timestamp ZZStatusEffectiveDate)
	{
		set_Value (COLUMNNAME_ZZStatusEffectiveDate, ZZStatusEffectiveDate);
	}

	/** Get Status Effective Date.
		@return Status Effective Date	  */
	public Timestamp getZZStatusEffectiveDate()
	{
		return (Timestamp)get_Value(COLUMNNAME_ZZStatusEffectiveDate);
	}

	/** Set Student Number.
		@param ZZStudentNumber Student Number
	*/
	public void setZZStudentNumber (String ZZStudentNumber)
	{
		set_Value (COLUMNNAME_ZZStudentNumber, ZZStudentNumber);
	}

	/** Get Student Number.
		@return Student Number	  */
	public String getZZStudentNumber()
	{
		return (String)get_Value(COLUMNNAME_ZZStudentNumber);
	}

	public I_ZZWorkplaceApproval getZZWA() throws RuntimeException
	{
		return (I_ZZWorkplaceApproval)MTable.get(getCtx(), I_ZZWorkplaceApproval.Table_ID)
			.getPO(getZZWA_ID(), get_TrxName());
	}

	/** Set Lead Workplace Approval .
		@param ZZWA_ID Lead Workplace Approval 
	*/
	public void setZZWA_ID (int ZZWA_ID)
	{
		if (ZZWA_ID < 1)
			set_Value (COLUMNNAME_ZZWA_ID, null);
		else
			set_Value (COLUMNNAME_ZZWA_ID, Integer.valueOf(ZZWA_ID));
	}

	/** Get Lead Workplace Approval .
		@return Lead Workplace Approval 	  */
	public int getZZWA_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZWA_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

		set_Value (COLUMNNAME_ZZ_DocStatus, ZZ_DocStatus);
	}

	/** Get Document Status.
		@return Document Status	  */
	public String getZZ_DocStatus()
	{
		return (String)get_Value(COLUMNNAME_ZZ_DocStatus);
	}
}