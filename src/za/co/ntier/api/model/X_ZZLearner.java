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

/** Generated Model for ZZLearner
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="ZZLearner")
public class X_ZZLearner extends PO implements I_ZZLearner, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20261012L;

    /** Standard Constructor */
    public X_ZZLearner (Properties ctx, int ZZLearner_ID, String trxName)
    {
      super (ctx, ZZLearner_ID, trxName);
      /** if (ZZLearner_ID == 0)
        {
			setZZLearner_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZLearner (Properties ctx, int ZZLearner_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZLearner_ID, trxName, virtualColumns);
      /** if (ZZLearner_ID == 0)
        {
			setZZLearner_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZLearner (Properties ctx, String ZZLearner_UU, String trxName)
    {
      super (ctx, ZZLearner_UU, trxName);
      /** if (ZZLearner_UU == null)
        {
			setZZLearner_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZLearner (Properties ctx, String ZZLearner_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZLearner_UU, trxName, virtualColumns);
      /** if (ZZLearner_UU == null)
        {
			setZZLearner_ID (0);
        } */
    }

    /** Load Constructor */
    public X_ZZLearner (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_ZZLearner[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Reference No.
		@param ReferenceNo Reference No
	*/
	public void setReferenceNo (String ReferenceNo)
	{
		set_ValueNoCheck (COLUMNNAME_ReferenceNo, ReferenceNo);
	}

	/** Get Reference No.
		@return Reference No	  */
	public String getReferenceNo()
	{
		return (String)get_Value(COLUMNNAME_ReferenceNo);
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

	/** Set ZZLearner_UU.
		@param ZZLearner_UU ZZLearner_UU
	*/
	public void setZZLearner_UU (String ZZLearner_UU)
	{
		set_Value (COLUMNNAME_ZZLearner_UU, ZZLearner_UU);
	}

	/** Get ZZLearner_UU.
		@return ZZLearner_UU	  */
	public String getZZLearner_UU()
	{
		return (String)get_Value(COLUMNNAME_ZZLearner_UU);
	}

	public org.compiere.model.I_C_Location getZZMatriculatedLocation() throws RuntimeException
	{
		return (org.compiere.model.I_C_Location)MTable.get(getCtx(), org.compiere.model.I_C_Location.Table_ID)
			.getPO(getZZMatriculatedLocation_ID(), get_TrxName());
	}

	/** Set Matriculated Location.
		@param ZZMatriculatedLocation_ID Matriculated Location
	*/
	public void setZZMatriculatedLocation_ID (int ZZMatriculatedLocation_ID)
	{
		if (ZZMatriculatedLocation_ID < 1)
			set_Value (COLUMNNAME_ZZMatriculatedLocation_ID, null);
		else
			set_Value (COLUMNNAME_ZZMatriculatedLocation_ID, Integer.valueOf(ZZMatriculatedLocation_ID));
	}

	/** Get Matriculated Location.
		@return Matriculated Location	  */
	public int getZZMatriculatedLocation_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZMatriculatedLocation_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_AD_User getZZNotRegistere() throws RuntimeException
	{
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_ID)
			.getPO(getZZNotRegisteredBy(), get_TrxName());
	}

	/** Set Not Registered By.
		@param ZZNotRegisteredBy Not Registered By
	*/
	public void setZZNotRegisteredBy (int ZZNotRegisteredBy)
	{
		set_Value (COLUMNNAME_ZZNotRegisteredBy, Integer.valueOf(ZZNotRegisteredBy));
	}

	/** Get Not Registered By.
		@return Not Registered By	  */
	public int getZZNotRegisteredBy()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZNotRegisteredBy);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_ZZPerson getZZPerson() throws RuntimeException
	{
		return (I_ZZPerson)MTable.get(getCtx(), I_ZZPerson.Table_ID)
			.getPO(getZZPerson_ID(), get_TrxName());
	}

	/** Set Person.
		@param ZZPerson_ID Person
	*/
	public void setZZPerson_ID (int ZZPerson_ID)
	{
		if (ZZPerson_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZPerson_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZPerson_ID, Integer.valueOf(ZZPerson_ID));
	}

	/** Get Person.
		@return Person	  */
	public int getZZPerson_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZPerson_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_AD_User getZZRegistere() throws RuntimeException
	{
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_ID)
			.getPO(getZZRegisteredBy(), get_TrxName());
	}

	/** Set RegisteredBy.
		@param ZZRegisteredBy RegisteredBy
	*/
	public void setZZRegisteredBy (int ZZRegisteredBy)
	{
		set_Value (COLUMNNAME_ZZRegisteredBy, Integer.valueOf(ZZRegisteredBy));
	}

	/** Get RegisteredBy.
		@return RegisteredBy	  */
	public int getZZRegisteredBy()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZRegisteredBy);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Admin - LP Ops Date Not Recommended.
		@param ZZ_AdminLPOps_DateNotRecommended Admin - LP Ops Date Not Recommended
	*/
	public void setZZ_AdminLPOps_DateNotRecommended (Timestamp ZZ_AdminLPOps_DateNotRecommended)
	{
		set_Value (COLUMNNAME_ZZ_AdminLPOps_DateNotRecommended, ZZ_AdminLPOps_DateNotRecommended);
	}

	/** Get Admin - LP Ops Date Not Recommended.
		@return Admin - LP Ops Date Not Recommended	  */
	public Timestamp getZZ_AdminLPOps_DateNotRecommended()
	{
		return (Timestamp)get_Value(COLUMNNAME_ZZ_AdminLPOps_DateNotRecommended);
	}

	/** Set Admin - LP Ops Date Recommended.
		@param ZZ_AdminLPOps_DateRecommended Admin - LP Ops Date Recommended
	*/
	public void setZZ_AdminLPOps_DateRecommended (Timestamp ZZ_AdminLPOps_DateRecommended)
	{
		set_Value (COLUMNNAME_ZZ_AdminLPOps_DateRecommended, ZZ_AdminLPOps_DateRecommended);
	}

	/** Get Admin - LP Ops Date Recommended.
		@return Admin - LP Ops Date Recommended	  */
	public Timestamp getZZ_AdminLPOps_DateRecommended()
	{
		return (Timestamp)get_Value(COLUMNNAME_ZZ_AdminLPOps_DateRecommended);
	}

	public org.compiere.model.I_AD_User getZZ_AdminLPOps_NotRecommendedBy() throws RuntimeException
	{
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_ID)
			.getPO(getZZ_AdminLPOps_NotRecommendedBy_ID(), get_TrxName());
	}

	/** Set Admin - LP Ops Not Recommended By.
		@param ZZ_AdminLPOps_NotRecommendedBy_ID Admin - LP Ops Not Recommended By
	*/
	public void setZZ_AdminLPOps_NotRecommendedBy_ID (int ZZ_AdminLPOps_NotRecommendedBy_ID)
	{
		if (ZZ_AdminLPOps_NotRecommendedBy_ID < 1)
			set_Value (COLUMNNAME_ZZ_AdminLPOps_NotRecommendedBy_ID, null);
		else
			set_Value (COLUMNNAME_ZZ_AdminLPOps_NotRecommendedBy_ID, Integer.valueOf(ZZ_AdminLPOps_NotRecommendedBy_ID));
	}

	/** Get Admin - LP Ops Not Recommended By.
		@return Admin - LP Ops Not Recommended By	  */
	public int getZZ_AdminLPOps_NotRecommendedBy_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZ_AdminLPOps_NotRecommendedBy_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_AD_User getZZ_AdminLPOps_RecommendedBy() throws RuntimeException
	{
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_ID)
			.getPO(getZZ_AdminLPOps_RecommendedBy_ID(), get_TrxName());
	}

	/** Set Admin - LP Ops Recommended By.
		@param ZZ_AdminLPOps_RecommendedBy_ID Admin - LP Ops Recommended By
	*/
	public void setZZ_AdminLPOps_RecommendedBy_ID (int ZZ_AdminLPOps_RecommendedBy_ID)
	{
		if (ZZ_AdminLPOps_RecommendedBy_ID < 1)
			set_Value (COLUMNNAME_ZZ_AdminLPOps_RecommendedBy_ID, null);
		else
			set_Value (COLUMNNAME_ZZ_AdminLPOps_RecommendedBy_ID, Integer.valueOf(ZZ_AdminLPOps_RecommendedBy_ID));
	}

	/** Get Admin - LP Ops Recommended By.
		@return Admin - LP Ops Recommended By	  */
	public int getZZ_AdminLPOps_RecommendedBy_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZ_AdminLPOps_RecommendedBy_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_AD_User getZZ_ApprovedBy() throws RuntimeException
	{
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_ID)
			.getPO(getZZ_ApprovedBy_ID(), get_TrxName());
	}

	/** Set Approved By.
		@param ZZ_ApprovedBy_ID Approved By
	*/
	public void setZZ_ApprovedBy_ID (int ZZ_ApprovedBy_ID)
	{
		if (ZZ_ApprovedBy_ID < 1)
			set_Value (COLUMNNAME_ZZ_ApprovedBy_ID, null);
		else
			set_Value (COLUMNNAME_ZZ_ApprovedBy_ID, Integer.valueOf(ZZ_ApprovedBy_ID));
	}

	/** Get Approved By.
		@return Approved By	  */
	public int getZZ_ApprovedBy_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZ_ApprovedBy_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Approved Date.
		@param ZZ_ApprovedDate Approved Date
	*/
	public void setZZ_ApprovedDate (Timestamp ZZ_ApprovedDate)
	{
		set_Value (COLUMNNAME_ZZ_ApprovedDate, ZZ_ApprovedDate);
	}

	/** Get Approved Date.
		@return Approved Date	  */
	public Timestamp getZZ_ApprovedDate()
	{
		return (Timestamp)get_Value(COLUMNNAME_ZZ_ApprovedDate);
	}

	/** Set Date Not Registered.
		@param ZZ_DateNotRegistered Date Not Registered
	*/
	public void setZZ_DateNotRegistered (Timestamp ZZ_DateNotRegistered)
	{
		set_Value (COLUMNNAME_ZZ_DateNotRegistered, ZZ_DateNotRegistered);
	}

	/** Get Date Not Registered.
		@return Date Not Registered	  */
	public Timestamp getZZ_DateNotRegistered()
	{
		return (Timestamp)get_Value(COLUMNNAME_ZZ_DateNotRegistered);
	}

	/** Set Date Registered.
		@param ZZ_DateRegistered Date Registered
	*/
	public void setZZ_DateRegistered (Timestamp ZZ_DateRegistered)
	{
		set_Value (COLUMNNAME_ZZ_DateRegistered, ZZ_DateRegistered);
	}

	/** Get Date Registered.
		@return Date Registered	  */
	public Timestamp getZZ_DateRegistered()
	{
		return (Timestamp)get_Value(COLUMNNAME_ZZ_DateRegistered);
	}

	/** Set Date Not Approved.
		@param ZZ_Date_Not_Approved Date Not Approved
	*/
	public void setZZ_Date_Not_Approved (Timestamp ZZ_Date_Not_Approved)
	{
		set_Value (COLUMNNAME_ZZ_Date_Not_Approved, ZZ_Date_Not_Approved);
	}

	/** Get Date Not Approved.
		@return Date Not Approved	  */
	public Timestamp getZZ_Date_Not_Approved()
	{
		return (Timestamp)get_Value(COLUMNNAME_ZZ_Date_Not_Approved);
	}

	/** Set Date Not Recommended.
		@param ZZ_Date_Not_Recommended Date Not Recommended
	*/
	public void setZZ_Date_Not_Recommended (Timestamp ZZ_Date_Not_Recommended)
	{
		set_Value (COLUMNNAME_ZZ_Date_Not_Recommended, ZZ_Date_Not_Recommended);
	}

	/** Get Date Not Recommended.
		@return Date Not Recommended	  */
	public Timestamp getZZ_Date_Not_Recommended()
	{
		return (Timestamp)get_Value(COLUMNNAME_ZZ_Date_Not_Recommended);
	}

	/** Set Date Recommended.
		@param ZZ_Date_Recommended Date Recommended
	*/
	public void setZZ_Date_Recommended (Timestamp ZZ_Date_Recommended)
	{
		set_Value (COLUMNNAME_ZZ_Date_Recommended, ZZ_Date_Recommended);
	}

	/** Get Date Recommended.
		@return Date Recommended	  */
	public Timestamp getZZ_Date_Recommended()
	{
		return (Timestamp)get_Value(COLUMNNAME_ZZ_Date_Recommended);
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

	/** Set ID No.
		@param ZZ_ID_Passport_No ID No
	*/
	public void setZZ_ID_Passport_No (String ZZ_ID_Passport_No)
	{
		throw new IllegalArgumentException ("ZZ_ID_Passport_No is virtual column");	}

	/** Get ID No.
		@return ID No	  */
	public String getZZ_ID_Passport_No()
	{
		return (String)get_Value(COLUMNNAME_ZZ_ID_Passport_No);
	}

	/** Set Mgr - LP Ops Date Not Recommended.
		@param ZZ_MgrLPOps_DateNotRecommended Mgr - LP Ops Date Not Recommended
	*/
	public void setZZ_MgrLPOps_DateNotRecommended (Timestamp ZZ_MgrLPOps_DateNotRecommended)
	{
		set_Value (COLUMNNAME_ZZ_MgrLPOps_DateNotRecommended, ZZ_MgrLPOps_DateNotRecommended);
	}

	/** Get Mgr - LP Ops Date Not Recommended.
		@return Mgr - LP Ops Date Not Recommended	  */
	public Timestamp getZZ_MgrLPOps_DateNotRecommended()
	{
		return (Timestamp)get_Value(COLUMNNAME_ZZ_MgrLPOps_DateNotRecommended);
	}

	/** Set Mgr - LP Ops Date Recommended.
		@param ZZ_MgrLPOps_DateRecommended Mgr - LP Ops Date Recommended
	*/
	public void setZZ_MgrLPOps_DateRecommended (Timestamp ZZ_MgrLPOps_DateRecommended)
	{
		set_Value (COLUMNNAME_ZZ_MgrLPOps_DateRecommended, ZZ_MgrLPOps_DateRecommended);
	}

	/** Get Mgr - LP Ops Date Recommended.
		@return Mgr - LP Ops Date Recommended	  */
	public Timestamp getZZ_MgrLPOps_DateRecommended()
	{
		return (Timestamp)get_Value(COLUMNNAME_ZZ_MgrLPOps_DateRecommended);
	}

	public org.compiere.model.I_AD_User getZZ_MgrLPOps_NotRecommendedBy() throws RuntimeException
	{
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_ID)
			.getPO(getZZ_MgrLPOps_NotRecommendedBy_ID(), get_TrxName());
	}

	/** Set Mgr - LP Ops Not Recommended By.
		@param ZZ_MgrLPOps_NotRecommendedBy_ID Mgr - LP Ops Not Recommended By
	*/
	public void setZZ_MgrLPOps_NotRecommendedBy_ID (int ZZ_MgrLPOps_NotRecommendedBy_ID)
	{
		if (ZZ_MgrLPOps_NotRecommendedBy_ID < 1)
			set_Value (COLUMNNAME_ZZ_MgrLPOps_NotRecommendedBy_ID, null);
		else
			set_Value (COLUMNNAME_ZZ_MgrLPOps_NotRecommendedBy_ID, Integer.valueOf(ZZ_MgrLPOps_NotRecommendedBy_ID));
	}

	/** Get Mgr - LP Ops Not Recommended By.
		@return Mgr - LP Ops Not Recommended By	  */
	public int getZZ_MgrLPOps_NotRecommendedBy_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZ_MgrLPOps_NotRecommendedBy_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_AD_User getZZ_MgrLPOps_RecommendedBy() throws RuntimeException
	{
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_ID)
			.getPO(getZZ_MgrLPOps_RecommendedBy_ID(), get_TrxName());
	}

	/** Set Mgr - LP Ops Recommended By.
		@param ZZ_MgrLPOps_RecommendedBy_ID Mgr - LP Ops Recommended By
	*/
	public void setZZ_MgrLPOps_RecommendedBy_ID (int ZZ_MgrLPOps_RecommendedBy_ID)
	{
		if (ZZ_MgrLPOps_RecommendedBy_ID < 1)
			set_Value (COLUMNNAME_ZZ_MgrLPOps_RecommendedBy_ID, null);
		else
			set_Value (COLUMNNAME_ZZ_MgrLPOps_RecommendedBy_ID, Integer.valueOf(ZZ_MgrLPOps_RecommendedBy_ID));
	}

	/** Get Mgr - LP Ops Recommended By.
		@return Mgr - LP Ops Recommended By	  */
	public int getZZ_MgrLPOps_RecommendedBy_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZ_MgrLPOps_RecommendedBy_ID);
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

	public org.compiere.model.I_AD_User getZZ_Recommender() throws RuntimeException
	{
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_ID)
			.getPO(getZZ_Recommender_ID(), get_TrxName());
	}

	/** Set Recommender.
		@param ZZ_Recommender_ID Recommender
	*/
	public void setZZ_Recommender_ID (int ZZ_Recommender_ID)
	{
		if (ZZ_Recommender_ID < 1)
			set_Value (COLUMNNAME_ZZ_Recommender_ID, null);
		else
			set_Value (COLUMNNAME_ZZ_Recommender_ID, Integer.valueOf(ZZ_Recommender_ID));
	}

	/** Get Recommender.
		@return Recommender	  */
	public int getZZ_Recommender_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZ_Recommender_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_AD_User getZZ_SDPAdmin() throws RuntimeException
	{
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_ID)
			.getPO(getZZ_SDPAdmin_ID(), get_TrxName());
	}

	/** Set SDP Admin.
		@param ZZ_SDPAdmin_ID SDP Admin
	*/
	public void setZZ_SDPAdmin_ID (int ZZ_SDPAdmin_ID)
	{
		if (ZZ_SDPAdmin_ID < 1)
			set_Value (COLUMNNAME_ZZ_SDPAdmin_ID, null);
		else
			set_Value (COLUMNNAME_ZZ_SDPAdmin_ID, Integer.valueOf(ZZ_SDPAdmin_ID));
	}

	/** Get SDP Admin.
		@return SDP Admin	  */
	public int getZZ_SDPAdmin_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZ_SDPAdmin_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}