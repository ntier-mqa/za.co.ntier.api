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

/** Generated Model for ZZLearnerTermination
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="ZZLearnerTermination")
public class X_ZZLearnerTermination extends PO implements I_ZZLearnerTermination, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20261103L;

    /** Standard Constructor */
    public X_ZZLearnerTermination (Properties ctx, int ZZLearnerTermination_ID, String trxName)
    {
      super (ctx, ZZLearnerTermination_ID, trxName);
      /** if (ZZLearnerTermination_ID == 0)
        {
			setZZLearnerTermination_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZLearnerTermination (Properties ctx, int ZZLearnerTermination_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZLearnerTermination_ID, trxName, virtualColumns);
      /** if (ZZLearnerTermination_ID == 0)
        {
			setZZLearnerTermination_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZLearnerTermination (Properties ctx, String ZZLearnerTermination_UU, String trxName)
    {
      super (ctx, ZZLearnerTermination_UU, trxName);
      /** if (ZZLearnerTermination_UU == null)
        {
			setZZLearnerTermination_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZLearnerTermination (Properties ctx, String ZZLearnerTermination_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZLearnerTermination_UU, trxName, virtualColumns);
      /** if (ZZLearnerTermination_UU == null)
        {
			setZZLearnerTermination_ID (0);
        } */
    }

    /** Load Constructor */
    public X_ZZLearnerTermination (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_ZZLearnerTermination[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Document Date.
		@param DateDoc Date of the Document
	*/
	public void setDateDoc (Timestamp DateDoc)
	{
		set_Value (COLUMNNAME_DateDoc, DateDoc);
	}

	/** Get Document Date.
		@return Date of the Document
	  */
	public Timestamp getDateDoc()
	{
		return (Timestamp)get_Value(COLUMNNAME_DateDoc);
	}

	/** Set Document No.
		@param DocumentNo Document sequence number of the document
	*/
	public void setDocumentNo (String DocumentNo)
	{
		set_Value (COLUMNNAME_DocumentNo, DocumentNo);
	}

	/** Get Document No.
		@return Document sequence number of the document
	  */
	public String getDocumentNo()
	{
		return (String)get_Value(COLUMNNAME_DocumentNo);
	}

	/** Set Learner Termination.
		@param ZZLearnerTermination_ID Learner Termination
	*/
	public void setZZLearnerTermination_ID (int ZZLearnerTermination_ID)
	{
		if (ZZLearnerTermination_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZLearnerTermination_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZLearnerTermination_ID, Integer.valueOf(ZZLearnerTermination_ID));
	}

	/** Get Learner Termination.
		@return Learner Termination	  */
	public int getZZLearnerTermination_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZLearnerTermination_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set ZZLearnerTermination_UU.
		@param ZZLearnerTermination_UU ZZLearnerTermination_UU
	*/
	public void setZZLearnerTermination_UU (String ZZLearnerTermination_UU)
	{
		set_Value (COLUMNNAME_ZZLearnerTermination_UU, ZZLearnerTermination_UU);
	}

	/** Get ZZLearnerTermination_UU.
		@return ZZLearnerTermination_UU	  */
	public String getZZLearnerTermination_UU()
	{
		return (String)get_Value(COLUMNNAME_ZZLearnerTermination_UU);
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

	/** Exec Approve = AE */
	public static final String ZZ_DOCACTION_ExecApprove = "AE";
	/** Approve/Do Not Approve = AP */
	public static final String ZZ_DOCACTION_ApproveDoNotApprove = "AP";
	/** Complete = CO */
	public static final String ZZ_DOCACTION_Complete = "CO";
	/** Evaluate = EV */
	public static final String ZZ_DOCACTION_Evaluate = "EV";
	/** Final Approval/Do not Approve = FA */
	public static final String ZZ_DOCACTION_FinalApprovalDoNotApprove = "FA";
	/** PrepareCEO = PC */
	public static final String ZZ_DOCACTION_PrepareCEO = "PC";
	/** Refer Back = RB */
	public static final String ZZ_DOCACTION_ReferBack = "RB";
	/** Recommend = RE */
	public static final String ZZ_DOCACTION_Recommend = "RE";
	/** Re-Submit = RS */
	public static final String ZZ_DOCACTION_Re_Submit = "RS";
	/** Submit = S1 */
	public static final String ZZ_DOCACTION_Submit = "S1";
	/** System Only (No manual action) = S2 */
	public static final String ZZ_DOCACTION_SystemOnlyNoManualAction = "S2";
	/** Submit to Manager Finance Consumables = SC */
	public static final String ZZ_DOCACTION_SubmitToManagerFinanceConsumables = "SC";
	/** Submit to SDL Finance Mgr = SD */
	public static final String ZZ_DOCACTION_SubmitToSDLFinanceMgr = "SD";
	/** Submit to Snr Mgr LP = SL */
	public static final String ZZ_DOCACTION_SubmitToSnrMgrLP = "SL";
	/** Submit to Snr Mgr Ops = SO */
	public static final String ZZ_DOCACTION_SubmitToSnrMgrOps = "SO";
	/** Submit to Snr Mgr Projects = SP */
	public static final String ZZ_DOCACTION_SubmitToSnrMgrProjects = "SP";
	/** Submit to Snr Mgr QA = SQ */
	public static final String ZZ_DOCACTION_SubmitToSnrMgrQA = "SQ";
	/** Submit to Recommender = SR */
	public static final String ZZ_DOCACTION_SubmitToRecommender = "SR";
	/** Submit to Snr Mgr SRU = SS */
	public static final String ZZ_DOCACTION_SubmitToSnrMgrSRU = "SS";
	/** Submit to Line Manager = SU */
	public static final String ZZ_DOCACTION_SubmitToLineManager = "SU";
	/** Update = UP */
	public static final String ZZ_DOCACTION_Update = "UP";
	/** Verify = VE */
	public static final String ZZ_DOCACTION_Verify = "VE";
	/** Set Document Action.
		@param ZZ_DocAction Document Action
	*/
	public void setZZ_DocAction (String ZZ_DocAction)
	{

		set_Value (COLUMNNAME_ZZ_DocAction, ZZ_DocAction);
	}

	/** Get Document Action.
		@return Document Action	  */
	public String getZZ_DocAction()
	{
		return (String)get_Value(COLUMNNAME_ZZ_DocAction);
	}

	/** Approved By Manager Finance Consumables = AC */
	public static final String ZZ_DOCSTATUS_ApprovedByManagerFinanceConsumables = "AC";
	/** Recommended &#8211; Admin = AD */
	public static final String ZZ_DOCSTATUS_RecommendedAdmin = "AD";
	/** Approved = AP */
	public static final String ZZ_DOCSTATUS_Approved = "AP";
	/** Prepared for CEO = CF */
	public static final String ZZ_DOCSTATUS_PreparedForCEO = "CF";
	/** Completed = CO */
	public static final String ZZ_DOCSTATUS_Completed = "CO";
	/** Created = CR */
	public static final String ZZ_DOCSTATUS_Created = "CR";
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
	/** Recommended By CRO = R8 */
	public static final String ZZ_DOCSTATUS_RecommendedByCRO = "R8";
	/** Recommended for Approval = RA */
	public static final String ZZ_DOCSTATUS_RecommendedForApproval = "RA";
	/** Recommended = RC */
	public static final String ZZ_DOCSTATUS_Recommended = "RC";
	/** Recommended By Senior Mgr SDR = RD */
	public static final String ZZ_DOCSTATUS_RecommendedBySeniorMgrSDR = "RD";
	/** Recommended for Evaluation = RE */
	public static final String ZZ_DOCSTATUS_RecommendedForEvaluation = "RE";
	/** Registered = RG */
	public static final String ZZ_DOCSTATUS_Registered = "RG";
	/** Recommended for Registration - Mgr - LP Ops = RR */
	public static final String ZZ_DOCSTATUS_RecommendedForRegistration_Mgr_LPOps = "RR";
	/** Recommended for Registration - Mgr - LP Strat = RS */
	public static final String ZZ_DOCSTATUS_RecommendedForRegistration_Mgr_LPStrat = "RS";
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

	/** Set Program Master Data.
		@param ZZ_Program_Master_Data_ID Program Master Data
	*/
	public void setZZ_Program_Master_Data_ID (int ZZ_Program_Master_Data_ID)
	{
		if (ZZ_Program_Master_Data_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZ_Program_Master_Data_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZ_Program_Master_Data_ID, Integer.valueOf(ZZ_Program_Master_Data_ID));
	}

	/** Get Program Master Data.
		@return Program Master Data	  */
	public int getZZ_Program_Master_Data_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZ_Program_Master_Data_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Reason.
		@param ZZ_Reason Reason
	*/
	public void setZZ_Reason (String ZZ_Reason)
	{
		set_Value (COLUMNNAME_ZZ_Reason, ZZ_Reason);
	}

	/** Get Reason.
		@return Reason	  */
	public String getZZ_Reason()
	{
		return (String)get_Value(COLUMNNAME_ZZ_Reason);
	}

	public org.compiere.model.I_AD_User getZZ_SubmittedBy() throws RuntimeException
	{
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_ID)
			.getPO(getZZ_SubmittedBy_ID(), get_TrxName());
	}

	/** Set Submitted By.
		@param ZZ_SubmittedBy_ID Submitted By
	*/
	public void setZZ_SubmittedBy_ID (int ZZ_SubmittedBy_ID)
	{
		if (ZZ_SubmittedBy_ID < 1)
			set_Value (COLUMNNAME_ZZ_SubmittedBy_ID, null);
		else
			set_Value (COLUMNNAME_ZZ_SubmittedBy_ID, Integer.valueOf(ZZ_SubmittedBy_ID));
	}

	/** Get Submitted By.
		@return Submitted By	  */
	public int getZZ_SubmittedBy_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZ_SubmittedBy_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}