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

/** Generated Model for ZZ_AllocationSchedule
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="ZZ_AllocationSchedule")
public class X_ZZ_AllocationSchedule extends PO implements I_ZZ_AllocationSchedule, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20260403L;

    /** Standard Constructor */
    public X_ZZ_AllocationSchedule (Properties ctx, int ZZ_AllocationSchedule_ID, String trxName)
    {
      super (ctx, ZZ_AllocationSchedule_ID, trxName);
      /** if (ZZ_AllocationSchedule_ID == 0)
        {
			setZZ_AllocationSchedule_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZ_AllocationSchedule (Properties ctx, int ZZ_AllocationSchedule_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZ_AllocationSchedule_ID, trxName, virtualColumns);
      /** if (ZZ_AllocationSchedule_ID == 0)
        {
			setZZ_AllocationSchedule_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZ_AllocationSchedule (Properties ctx, String ZZ_AllocationSchedule_UU, String trxName)
    {
      super (ctx, ZZ_AllocationSchedule_UU, trxName);
      /** if (ZZ_AllocationSchedule_UU == null)
        {
			setZZ_AllocationSchedule_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZ_AllocationSchedule (Properties ctx, String ZZ_AllocationSchedule_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZ_AllocationSchedule_UU, trxName, virtualColumns);
      /** if (ZZ_AllocationSchedule_UU == null)
        {
			setZZ_AllocationSchedule_ID (0);
        } */
    }

    /** Load Constructor */
    public X_ZZ_AllocationSchedule (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_ZZ_AllocationSchedule[")
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

	/** Set ZZ_AllocationSchedule_ID.
		@param ZZ_AllocationSchedule_ID ZZ_AllocationSchedule_ID
	*/
	public void setZZ_AllocationSchedule_ID (int ZZ_AllocationSchedule_ID)
	{
		if (ZZ_AllocationSchedule_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZ_AllocationSchedule_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZ_AllocationSchedule_ID, Integer.valueOf(ZZ_AllocationSchedule_ID));
	}

	/** Get ZZ_AllocationSchedule_ID.
		@return ZZ_AllocationSchedule_ID	  */
	public int getZZ_AllocationSchedule_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZ_AllocationSchedule_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set ZZ_AllocationSchedule_UU.
		@param ZZ_AllocationSchedule_UU ZZ_AllocationSchedule_UU
	*/
	public void setZZ_AllocationSchedule_UU (String ZZ_AllocationSchedule_UU)
	{
		set_ValueNoCheck (COLUMNNAME_ZZ_AllocationSchedule_UU, ZZ_AllocationSchedule_UU);
	}

	/** Get ZZ_AllocationSchedule_UU.
		@return ZZ_AllocationSchedule_UU	  */
	public String getZZ_AllocationSchedule_UU()
	{
		return (String)get_Value(COLUMNNAME_ZZ_AllocationSchedule_UU);
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

	/** Approved = AP */
	public static final String ZZ_DOCSTATUS_Approved = "AP";
	/** Awaiting QCTO Recommendation = AW */
	public static final String ZZ_DOCSTATUS_AwaitingQCTORecommendation = "AW";
	/** Draft = DR */
	public static final String ZZ_DOCSTATUS_Draft = "DR";
	/** Not Approved = NA */
	public static final String ZZ_DOCSTATUS_NotApproved = "NA";
	/** Not Recommended = NR */
	public static final String ZZ_DOCSTATUS_NotRecommended = "NR";
	/** Recommended = RC */
	public static final String ZZ_DOCSTATUS_Recommended = "RC";
	/** Received from QCTO = RF */
	public static final String ZZ_DOCSTATUS_ReceivedFromQCTO = "RF";
	/** Audit Notification Sent = ST */
	public static final String ZZ_DOCSTATUS_AuditNotificationSent = "ST";
	/** Site Visit Notification Sent = SV */
	public static final String ZZ_DOCSTATUS_SiteVisitNotificationSent = "SV";
	/** Site Visit Date Confirmed = VC */
	public static final String ZZ_DOCSTATUS_SiteVisitDateConfirmed = "VC";
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