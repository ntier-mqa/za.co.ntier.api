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
	private static final long serialVersionUID = 20260212L;

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

	/** Exec Approve = AE */
	public static final String ZZ_DOCACTION_ExecApprove = "AE";
	/** Approve/Do Not Approve = AP */
	public static final String ZZ_DOCACTION_ApproveDoNotApprove = "AP";
	/** Complete = CO */
	public static final String ZZ_DOCACTION_Complete = "CO";
	/** Final Approval/Do not Approve = FA */
	public static final String ZZ_DOCACTION_FinalApprovalDoNotApprove = "FA";
	/** Recommend = RE */
	public static final String ZZ_DOCACTION_Recommend = "RE";
	/** Submit = S1 */
	public static final String ZZ_DOCACTION_Submit = "S1";
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
	/** Completed = CO */
	public static final String ZZ_DOCSTATUS_Completed = "CO";
	/** Draft = DR */
	public static final String ZZ_DOCSTATUS_Draft = "DR";
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
	/** Recommended By Senior Mgr Finance = R1 */
	public static final String ZZ_DOCSTATUS_RecommendedBySeniorMgrFinance = "R1";
	/** Recommended By COO = R2 */
	public static final String ZZ_DOCSTATUS_RecommendedByCOO = "R2";
	/** Recommended By CFO = R3 */
	public static final String ZZ_DOCSTATUS_RecommendedByCFO = "R3";
	/** Recommended = RC */
	public static final String ZZ_DOCSTATUS_Recommended = "RC";
	/** Recommended By Senior Mgr SDR = RD */
	public static final String ZZ_DOCSTATUS_RecommendedBySeniorMgrSDR = "RD";
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