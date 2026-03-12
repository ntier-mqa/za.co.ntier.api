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

/** Generated Model for ZZ_WSP_ATR_EXTENSION_BATCH
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="ZZ_WSP_ATR_EXTENSION_BATCH")
public class X_ZZ_WSP_ATR_EXTENSION_BATCH extends PO implements I_ZZ_WSP_ATR_EXTENSION_BATCH, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20260312L;

    /** Standard Constructor */
    public X_ZZ_WSP_ATR_EXTENSION_BATCH (Properties ctx, int ZZ_WSP_ATR_EXTENSION_BATCH_ID, String trxName)
    {
      super (ctx, ZZ_WSP_ATR_EXTENSION_BATCH_ID, trxName);
      /** if (ZZ_WSP_ATR_EXTENSION_BATCH_ID == 0)
        {
			setProcessed (false);
// N
        } */
    }

    /** Standard Constructor */
    public X_ZZ_WSP_ATR_EXTENSION_BATCH (Properties ctx, int ZZ_WSP_ATR_EXTENSION_BATCH_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZ_WSP_ATR_EXTENSION_BATCH_ID, trxName, virtualColumns);
      /** if (ZZ_WSP_ATR_EXTENSION_BATCH_ID == 0)
        {
			setProcessed (false);
// N
        } */
    }

    /** Standard Constructor */
    public X_ZZ_WSP_ATR_EXTENSION_BATCH (Properties ctx, String ZZ_WSP_ATR_EXTENSION_BATCH_UU, String trxName)
    {
      super (ctx, ZZ_WSP_ATR_EXTENSION_BATCH_UU, trxName);
      /** if (ZZ_WSP_ATR_EXTENSION_BATCH_UU == null)
        {
			setProcessed (false);
// N
        } */
    }

    /** Standard Constructor */
    public X_ZZ_WSP_ATR_EXTENSION_BATCH (Properties ctx, String ZZ_WSP_ATR_EXTENSION_BATCH_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZ_WSP_ATR_EXTENSION_BATCH_UU, trxName, virtualColumns);
      /** if (ZZ_WSP_ATR_EXTENSION_BATCH_UU == null)
        {
			setProcessed (false);
// N
        } */
    }

    /** Load Constructor */
    public X_ZZ_WSP_ATR_EXTENSION_BATCH (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_ZZ_WSP_ATR_EXTENSION_BATCH[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Document No.
		@param DocumentNo Document sequence number of the document
	*/
	public void setDocumentNo (String DocumentNo)
	{
		set_ValueNoCheck (COLUMNNAME_DocumentNo, DocumentNo);
	}

	/** Get Document No.
		@return Document sequence number of the document
	  */
	public String getDocumentNo()
	{
		return (String)get_Value(COLUMNNAME_DocumentNo);
	}

	/** Set Processed.
		@param Processed The document has been processed
	*/
	public void setProcessed (boolean Processed)
	{
		set_Value (COLUMNNAME_Processed, Boolean.valueOf(Processed));
	}

	/** Get Processed.
		@return The document has been processed
	  */
	public boolean isProcessed()
	{
		Object oo = get_Value(COLUMNNAME_Processed);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	public org.compiere.model.I_AD_User getZZ_CEO() throws RuntimeException
	{
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_ID)
			.getPO(getZZ_CEO_ID(), get_TrxName());
	}

	/** Set CEO.
		@param ZZ_CEO_ID CEO
	*/
	public void setZZ_CEO_ID (int ZZ_CEO_ID)
	{
		if (ZZ_CEO_ID < 1)
			set_Value (COLUMNNAME_ZZ_CEO_ID, null);
		else
			set_Value (COLUMNNAME_ZZ_CEO_ID, Integer.valueOf(ZZ_CEO_ID));
	}

	/** Get CEO.
		@return CEO	  */
	public int getZZ_CEO_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZ_CEO_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_AD_User getZZ_COO() throws RuntimeException
	{
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_ID)
			.getPO(getZZ_COO_ID(), get_TrxName());
	}

	/** Set COO.
		@param ZZ_COO_ID COO
	*/
	public void setZZ_COO_ID (int ZZ_COO_ID)
	{
		if (ZZ_COO_ID < 1)
			set_Value (COLUMNNAME_ZZ_COO_ID, null);
		else
			set_Value (COLUMNNAME_ZZ_COO_ID, Integer.valueOf(ZZ_COO_ID));
	}

	/** Get COO.
		@return COO	  */
	public int getZZ_COO_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZ_COO_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Date Not Approved By CEO.
		@param ZZ_Date_Not_Recom_CEO Date Not Approved By CEO
	*/
	public void setZZ_Date_Not_Recom_CEO (Timestamp ZZ_Date_Not_Recom_CEO)
	{
		set_Value (COLUMNNAME_ZZ_Date_Not_Recom_CEO, ZZ_Date_Not_Recom_CEO);
	}

	/** Get Date Not Approved By CEO.
		@return Date Not Approved By CEO	  */
	public Timestamp getZZ_Date_Not_Recom_CEO()
	{
		return (Timestamp)get_Value(COLUMNNAME_ZZ_Date_Not_Recom_CEO);
	}

	/** Set Date Not Recommended By COO.
		@param ZZ_Date_Not_Recom_COO Date Not Recommended By COO
	*/
	public void setZZ_Date_Not_Recom_COO (Timestamp ZZ_Date_Not_Recom_COO)
	{
		set_Value (COLUMNNAME_ZZ_Date_Not_Recom_COO, ZZ_Date_Not_Recom_COO);
	}

	/** Get Date Not Recommended By COO.
		@return Date Not Recommended By COO	  */
	public Timestamp getZZ_Date_Not_Recom_COO()
	{
		return (Timestamp)get_Value(COLUMNNAME_ZZ_Date_Not_Recom_COO);
	}

	/** Set Date Not Approved By MQA Board.
		@param ZZ_Date_Not_Recom_MQA_Board Date Not Approved By MQA Board
	*/
	public void setZZ_Date_Not_Recom_MQA_Board (Timestamp ZZ_Date_Not_Recom_MQA_Board)
	{
		set_Value (COLUMNNAME_ZZ_Date_Not_Recom_MQA_Board, ZZ_Date_Not_Recom_MQA_Board);
	}

	/** Get Date Not Approved By MQA Board.
		@return Date Not Approved By MQA Board	  */
	public Timestamp getZZ_Date_Not_Recom_MQA_Board()
	{
		return (Timestamp)get_Value(COLUMNNAME_ZZ_Date_Not_Recom_MQA_Board);
	}

	/** Set Date Not Recommended By Snr Mgr SDR.
		@param ZZ_Date_Not_Recom_Snr_Mgr_SDR Date Not Recommended By Snr Mgr SDR
	*/
	public void setZZ_Date_Not_Recom_Snr_Mgr_SDR (Timestamp ZZ_Date_Not_Recom_Snr_Mgr_SDR)
	{
		set_Value (COLUMNNAME_ZZ_Date_Not_Recom_Snr_Mgr_SDR, ZZ_Date_Not_Recom_Snr_Mgr_SDR);
	}

	/** Get Date Not Recommended By Snr Mgr SDR.
		@return Date Not Recommended By Snr Mgr SDR	  */
	public Timestamp getZZ_Date_Not_Recom_Snr_Mgr_SDR()
	{
		return (Timestamp)get_Value(COLUMNNAME_ZZ_Date_Not_Recom_Snr_Mgr_SDR);
	}

	/** Set Date Recommended By Snr Mgr SDR.
		@param ZZ_Date_Recom_Snr_Mgr_SDR Date Recommended By Snr Mgr SDR
	*/
	public void setZZ_Date_Recom_Snr_Mgr_SDR (Timestamp ZZ_Date_Recom_Snr_Mgr_SDR)
	{
		set_Value (COLUMNNAME_ZZ_Date_Recom_Snr_Mgr_SDR, ZZ_Date_Recom_Snr_Mgr_SDR);
	}

	/** Get Date Recommended By Snr Mgr SDR.
		@return Date Recommended By Snr Mgr SDR	  */
	public Timestamp getZZ_Date_Recom_Snr_Mgr_SDR()
	{
		return (Timestamp)get_Value(COLUMNNAME_ZZ_Date_Recom_Snr_Mgr_SDR);
	}

	/** Set Date Recommended By CEO.
		@param ZZ_Date_Recomm_CEO Date Recommended By CEO
	*/
	public void setZZ_Date_Recomm_CEO (Timestamp ZZ_Date_Recomm_CEO)
	{
		set_Value (COLUMNNAME_ZZ_Date_Recomm_CEO, ZZ_Date_Recomm_CEO);
	}

	/** Get Date Recommended By CEO.
		@return Date Recommended By CEO	  */
	public Timestamp getZZ_Date_Recomm_CEO()
	{
		return (Timestamp)get_Value(COLUMNNAME_ZZ_Date_Recomm_CEO);
	}

	/** Set Date Recommended By COO.
		@param ZZ_Date_Recomm_COO Date Recommended By COO
	*/
	public void setZZ_Date_Recomm_COO (Timestamp ZZ_Date_Recomm_COO)
	{
		set_Value (COLUMNNAME_ZZ_Date_Recomm_COO, ZZ_Date_Recomm_COO);
	}

	/** Get Date Recommended By COO.
		@return Date Recommended By COO	  */
	public Timestamp getZZ_Date_Recomm_COO()
	{
		return (Timestamp)get_Value(COLUMNNAME_ZZ_Date_Recomm_COO);
	}

	/** Set Date Recommended By MQA Board.
		@param ZZ_Date_Recomm_MQA_Board Date Recommended By MQA Board
	*/
	public void setZZ_Date_Recomm_MQA_Board (Timestamp ZZ_Date_Recomm_MQA_Board)
	{
		set_Value (COLUMNNAME_ZZ_Date_Recomm_MQA_Board, ZZ_Date_Recomm_MQA_Board);
	}

	/** Get Date Recommended By MQA Board.
		@return Date Recommended By MQA Board	  */
	public Timestamp getZZ_Date_Recomm_MQA_Board()
	{
		return (Timestamp)get_Value(COLUMNNAME_ZZ_Date_Recomm_MQA_Board);
	}

	/** Set Date Submitted.
		@param ZZ_Date_Submitted Date Submitted
	*/
	public void setZZ_Date_Submitted (Timestamp ZZ_Date_Submitted)
	{
		set_Value (COLUMNNAME_ZZ_Date_Submitted, ZZ_Date_Submitted);
	}

	/** Get Date Submitted.
		@return Date Submitted	  */
	public Timestamp getZZ_Date_Submitted()
	{
		return (Timestamp)get_Value(COLUMNNAME_ZZ_Date_Submitted);
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
	/** Not Recommended = NR */
	public static final String ZZ_DOCSTATUS_NotRecommended = "NR";
	/** Not Approved by Snr Admin Finance = NS */
	public static final String ZZ_DOCSTATUS_NotApprovedBySnrAdminFinance = "NS";
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

	public org.compiere.model.I_AD_User getZZ_MQA_BOARD() throws RuntimeException
	{
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_ID)
			.getPO(getZZ_MQA_BOARD_ID(), get_TrxName());
	}

	/** Set MQA Board.
		@param ZZ_MQA_BOARD_ID MQA Board
	*/
	public void setZZ_MQA_BOARD_ID (int ZZ_MQA_BOARD_ID)
	{
		if (ZZ_MQA_BOARD_ID < 1)
			set_Value (COLUMNNAME_ZZ_MQA_BOARD_ID, null);
		else
			set_Value (COLUMNNAME_ZZ_MQA_BOARD_ID, Integer.valueOf(ZZ_MQA_BOARD_ID));
	}

	/** Get MQA Board.
		@return MQA Board	  */
	public int getZZ_MQA_BOARD_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZ_MQA_BOARD_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	public org.compiere.model.I_AD_User getZZ_Submitter() throws RuntimeException
	{
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_ID)
			.getPO(getZZ_Submitter_ID(), get_TrxName());
	}

	/** Set Submitted By.
		@param ZZ_Submitter_ID Submitted By
	*/
	public void setZZ_Submitter_ID (int ZZ_Submitter_ID)
	{
		if (ZZ_Submitter_ID < 1)
			set_Value (COLUMNNAME_ZZ_Submitter_ID, null);
		else
			set_Value (COLUMNNAME_ZZ_Submitter_ID, Integer.valueOf(ZZ_Submitter_ID));
	}

	/** Get Submitted By.
		@return Submitted By	  */
	public int getZZ_Submitter_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZ_Submitter_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set ZZ_WSP_ATR_EXTENSION_BATCH_ID.
		@param ZZ_WSP_ATR_EXTENSION_BATCH_ID ZZ_WSP_ATR_EXTENSION_BATCH_ID
	*/
	public void setZZ_WSP_ATR_EXTENSION_BATCH_ID (int ZZ_WSP_ATR_EXTENSION_BATCH_ID)
	{
		if (ZZ_WSP_ATR_EXTENSION_BATCH_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZ_WSP_ATR_EXTENSION_BATCH_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZ_WSP_ATR_EXTENSION_BATCH_ID, Integer.valueOf(ZZ_WSP_ATR_EXTENSION_BATCH_ID));
	}

	/** Get ZZ_WSP_ATR_EXTENSION_BATCH_ID.
		@return ZZ_WSP_ATR_EXTENSION_BATCH_ID	  */
	public int getZZ_WSP_ATR_EXTENSION_BATCH_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZ_WSP_ATR_EXTENSION_BATCH_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set ZZ_WSP_ATR_EXTENSION_BATCH_UU.
		@param ZZ_WSP_ATR_EXTENSION_BATCH_UU ZZ_WSP_ATR_EXTENSION_BATCH_UU
	*/
	public void setZZ_WSP_ATR_EXTENSION_BATCH_UU (String ZZ_WSP_ATR_EXTENSION_BATCH_UU)
	{
		set_ValueNoCheck (COLUMNNAME_ZZ_WSP_ATR_EXTENSION_BATCH_UU, ZZ_WSP_ATR_EXTENSION_BATCH_UU);
	}

	/** Get ZZ_WSP_ATR_EXTENSION_BATCH_UU.
		@return ZZ_WSP_ATR_EXTENSION_BATCH_UU	  */
	public String getZZ_WSP_ATR_EXTENSION_BATCH_UU()
	{
		return (String)get_Value(COLUMNNAME_ZZ_WSP_ATR_EXTENSION_BATCH_UU);
	}

	/** Set WSP-ATR Extension End Date.
		@param ZZ_WSP_ATR_Ext_End_Date WSP-ATR Extension End Date
	*/
	public void setZZ_WSP_ATR_Ext_End_Date (Timestamp ZZ_WSP_ATR_Ext_End_Date)
	{
		set_Value (COLUMNNAME_ZZ_WSP_ATR_Ext_End_Date, ZZ_WSP_ATR_Ext_End_Date);
	}

	/** Get WSP-ATR Extension End Date.
		@return WSP-ATR Extension End Date	  */
	public Timestamp getZZ_WSP_ATR_Ext_End_Date()
	{
		return (Timestamp)get_Value(COLUMNNAME_ZZ_WSP_ATR_Ext_End_Date);
	}

	/** Set WSP-ATR Extension Start Date.
		@param ZZ_WSP_ATR_Ext_Start_Date WSP-ATR Extension Start Date
	*/
	public void setZZ_WSP_ATR_Ext_Start_Date (Timestamp ZZ_WSP_ATR_Ext_Start_Date)
	{
		set_Value (COLUMNNAME_ZZ_WSP_ATR_Ext_Start_Date, ZZ_WSP_ATR_Ext_Start_Date);
	}

	/** Get WSP-ATR Extension Start Date.
		@return WSP-ATR Extension Start Date	  */
	public Timestamp getZZ_WSP_ATR_Ext_Start_Date()
	{
		return (Timestamp)get_Value(COLUMNNAME_ZZ_WSP_ATR_Ext_Start_Date);
	}
}