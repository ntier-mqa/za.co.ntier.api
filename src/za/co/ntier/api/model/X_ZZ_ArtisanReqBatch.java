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
import java.util.Properties;
import org.compiere.model.*;

/** Generated Model for ZZ_ArtisanReqBatch
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="ZZ_ArtisanReqBatch")
public class X_ZZ_ArtisanReqBatch extends PO implements I_ZZ_ArtisanReqBatch, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20261005L;

    /** Standard Constructor */
    public X_ZZ_ArtisanReqBatch (Properties ctx, int ZZ_ArtisanReqBatch_ID, String trxName)
    {
      super (ctx, ZZ_ArtisanReqBatch_ID, trxName);
      /** if (ZZ_ArtisanReqBatch_ID == 0)
        {
			setDocStatus (null);
// DR
			setZZ_ArtisanReqBatch_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZ_ArtisanReqBatch (Properties ctx, int ZZ_ArtisanReqBatch_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZ_ArtisanReqBatch_ID, trxName, virtualColumns);
      /** if (ZZ_ArtisanReqBatch_ID == 0)
        {
			setDocStatus (null);
// DR
			setZZ_ArtisanReqBatch_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZ_ArtisanReqBatch (Properties ctx, String ZZ_ArtisanReqBatch_UU, String trxName)
    {
      super (ctx, ZZ_ArtisanReqBatch_UU, trxName);
      /** if (ZZ_ArtisanReqBatch_UU == null)
        {
			setDocStatus (null);
// DR
			setZZ_ArtisanReqBatch_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZ_ArtisanReqBatch (Properties ctx, String ZZ_ArtisanReqBatch_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZ_ArtisanReqBatch_UU, trxName, virtualColumns);
      /** if (ZZ_ArtisanReqBatch_UU == null)
        {
			setDocStatus (null);
// DR
			setZZ_ArtisanReqBatch_ID (0);
        } */
    }

    /** Load Constructor */
    public X_ZZ_ArtisanReqBatch (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_ZZ_ArtisanReqBatch[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Approved By Manager Finance Consumables = AC */
	public static final String DOCSTATUS_ApprovedByManagerFinanceConsumables = "AC";
	/** Approved = AP */
	public static final String DOCSTATUS_Approved = "AP";
	/** Prepared for CEO = CF */
	public static final String DOCSTATUS_PreparedForCEO = "CF";
	/** Completed = CO */
	public static final String DOCSTATUS_Completed = "CO";
	/** Draft = DR */
	public static final String DOCSTATUS_Draft = "DR";
	/** Error Importing = EE */
	public static final String DOCSTATUS_ErrorImporting = "EE";
	/** Validation Error = ER */
	public static final String DOCSTATUS_ValidationError = "ER";
	/** Evaluated = EV */
	public static final String DOCSTATUS_Evaluated = "EV";
	/** Importing = IG */
	public static final String DOCSTATUS_Importing = "IG";
	/** Imported = IM */
	public static final String DOCSTATUS_Imported = "IM";
	/** In Progress = IP */
	public static final String DOCSTATUS_InProgress = "IP";
	/** Not Recommended By Senior Mgr SDR = N1 */
	public static final String DOCSTATUS_NotRecommendedBySeniorMgrSDR = "N1";
	/** Not Recommended By Senior Mgr Finance = N2 */
	public static final String DOCSTATUS_NotRecommendedBySeniorMgrFinance = "N2";
	/** Not Recommended By COO = N3 */
	public static final String DOCSTATUS_NotRecommendedByCOO = "N3";
	/** Not Recommended By CFO = N4 */
	public static final String DOCSTATUS_NotRecommendedByCFO = "N4";
	/** Not Recommended By CEO = N5 */
	public static final String DOCSTATUS_NotRecommendedByCEO = "N5";
	/** Not Approved by Snr Manager = NA */
	public static final String DOCSTATUS_NotApprovedBySnrManager = "NA";
	/** Not Approved By Manager Finance Consumables = NC */
	public static final String DOCSTATUS_NotApprovedByManagerFinanceConsumables = "NC";
	/** Not Approved By SDL Finance Mgr = ND */
	public static final String DOCSTATUS_NotApprovedBySDLFinanceMgr = "ND";
	/** Not Approved By IT Manager = NI */
	public static final String DOCSTATUS_NotApprovedByITManager = "NI";
	/** Not Approved by LM = NL */
	public static final String DOCSTATUS_NotApprovedByLM = "NL";
	/** Not Approved = NP */
	public static final String DOCSTATUS_NotApproved = "NP";
	/** Not Recommended = NR */
	public static final String DOCSTATUS_NotRecommended = "NR";
	/** Not Approved by Snr Admin Finance = NS */
	public static final String DOCSTATUS_NotApprovedBySnrAdminFinance = "NS";
	/** Not Verified = NV */
	public static final String DOCSTATUS_NotVerified = "NV";
	/** Pending = PE */
	public static final String DOCSTATUS_Pending = "PE";
	/** Query = QR */
	public static final String DOCSTATUS_Query = "QR";
	/** Recommended By Senior Mgr Finance = R1 */
	public static final String DOCSTATUS_RecommendedBySeniorMgrFinance = "R1";
	/** Recommended By COO = R2 */
	public static final String DOCSTATUS_RecommendedByCOO = "R2";
	/** Recommended By CFO = R3 */
	public static final String DOCSTATUS_RecommendedByCFO = "R3";
	/** Recommended By CEO = R4 */
	public static final String DOCSTATUS_RecommendedByCEO = "R4";
	/** Recommended By Officer - QA Accreditation = R5 */
	public static final String DOCSTATUS_RecommendedByOfficer_QAAccreditation = "R5";
	/** Recommended By Mgr - QA Accreditation = R6 */
	public static final String DOCSTATUS_RecommendedByMgr_QAAccreditation = "R6";
	/** Recommended By Snr Mgr QA = R7 */
	public static final String DOCSTATUS_RecommendedBySnrMgrQA = "R7";
	/** Recommended By CRO = R8 */
	public static final String DOCSTATUS_RecommendedByCRO = "R8";
	/** Recommended for Approval = RA */
	public static final String DOCSTATUS_RecommendedForApproval = "RA";
	/** Recommended = RC */
	public static final String DOCSTATUS_Recommended = "RC";
	/** Recommended By Senior Mgr SDR = RD */
	public static final String DOCSTATUS_RecommendedBySeniorMgrSDR = "RD";
	/** Recommended for Evaluation = RE */
	public static final String DOCSTATUS_RecommendedForEvaluation = "RE";
	/** Submitted to Snr Admin Finance = SA */
	public static final String DOCSTATUS_SubmittedToSnrAdminFinance = "SA";
	/** Submitted to Manager Finance Consumables = SC */
	public static final String DOCSTATUS_SubmittedToManagerFinanceConsumables = "SC";
	/** Submitted To SDL Finance Mgr = SD */
	public static final String DOCSTATUS_SubmittedToSDLFinanceMgr = "SD";
	/** Submitted To IT Manager = SI */
	public static final String DOCSTATUS_SubmittedToITManager = "SI";
	/** Submitted To IT Admin = ST */
	public static final String DOCSTATUS_SubmittedToITAdmin = "ST";
	/** Submitted = SU */
	public static final String DOCSTATUS_Submitted = "SU";
	/** Transfer Out = TO */
	public static final String DOCSTATUS_TransferOut = "TO";
	/** Updated by SDR Admin = UA */
	public static final String DOCSTATUS_UpdatedBySDRAdmin = "UA";
	/** Uploaded = UP */
	public static final String DOCSTATUS_Uploaded = "UP";
	/** Delinked = UnSdfOrg */
	public static final String DOCSTATUS_Delinked = "UnSdfOrg";
	/** Validating = VA */
	public static final String DOCSTATUS_Validating = "VA";
	/** Verified = VE */
	public static final String DOCSTATUS_Verified = "VE";
	/** Set Document Status.
		@param DocStatus The current status of the document
	*/
	public void setDocStatus (String DocStatus)
	{

		set_Value (COLUMNNAME_DocStatus, DocStatus);
	}

	/** Get Document Status.
		@return The current status of the document
	  */
	public String getDocStatus()
	{
		return (String)get_Value(COLUMNNAME_DocStatus);
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

	/** Set Artisan Serial Number Request Batch.
		@param ZZ_ArtisanReqBatch_ID Artisan Serial Number Request Batch
	*/
	public void setZZ_ArtisanReqBatch_ID (int ZZ_ArtisanReqBatch_ID)
	{
		if (ZZ_ArtisanReqBatch_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZ_ArtisanReqBatch_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZ_ArtisanReqBatch_ID, Integer.valueOf(ZZ_ArtisanReqBatch_ID));
	}

	/** Get Artisan Serial Number Request Batch.
		@return Artisan Serial Number Request Batch	  */
	public int getZZ_ArtisanReqBatch_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZ_ArtisanReqBatch_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set ZZ_ArtisanReqBatch_UU.
		@param ZZ_ArtisanReqBatch_UU ZZ_ArtisanReqBatch_UU
	*/
	public void setZZ_ArtisanReqBatch_UU (String ZZ_ArtisanReqBatch_UU)
	{
		set_Value (COLUMNNAME_ZZ_ArtisanReqBatch_UU, ZZ_ArtisanReqBatch_UU);
	}

	/** Get ZZ_ArtisanReqBatch_UU.
		@return ZZ_ArtisanReqBatch_UU	  */
	public String getZZ_ArtisanReqBatch_UU()
	{
		return (String)get_Value(COLUMNNAME_ZZ_ArtisanReqBatch_UU);
	}

	public org.compiere.model.I_C_BPartner getZZ_SDP() throws RuntimeException
	{
		return (org.compiere.model.I_C_BPartner)MTable.get(getCtx(), org.compiere.model.I_C_BPartner.Table_ID)
			.getPO(getZZ_SDP_ID(), get_TrxName());
	}

	/** Set SDP.
		@param ZZ_SDP_ID Lead Skills Development Provider
	*/
	public void setZZ_SDP_ID (int ZZ_SDP_ID)
	{
		if (ZZ_SDP_ID < 1)
			set_Value (COLUMNNAME_ZZ_SDP_ID, null);
		else
			set_Value (COLUMNNAME_ZZ_SDP_ID, Integer.valueOf(ZZ_SDP_ID));
	}

	/** Get SDP.
		@return Lead Skills Development Provider
	  */
	public int getZZ_SDP_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZ_SDP_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
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