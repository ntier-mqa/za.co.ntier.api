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

/** Generated Model for ZZ_Allocation_Offer
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="ZZ_Allocation_Offer")
public class X_ZZ_Allocation_Offer extends PO implements I_ZZ_Allocation_Offer, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20261020L;

    /** Standard Constructor */
    public X_ZZ_Allocation_Offer (Properties ctx, int ZZ_Allocation_Offer_ID, String trxName)
    {
      super (ctx, ZZ_Allocation_Offer_ID, trxName);
      /** if (ZZ_Allocation_Offer_ID == 0)
        {
			setZZ_Allocation_Offer_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZ_Allocation_Offer (Properties ctx, int ZZ_Allocation_Offer_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZ_Allocation_Offer_ID, trxName, virtualColumns);
      /** if (ZZ_Allocation_Offer_ID == 0)
        {
			setZZ_Allocation_Offer_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZ_Allocation_Offer (Properties ctx, String ZZ_Allocation_Offer_UU, String trxName)
    {
      super (ctx, ZZ_Allocation_Offer_UU, trxName);
      /** if (ZZ_Allocation_Offer_UU == null)
        {
			setZZ_Allocation_Offer_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZ_Allocation_Offer (Properties ctx, String ZZ_Allocation_Offer_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZ_Allocation_Offer_UU, trxName, virtualColumns);
      /** if (ZZ_Allocation_Offer_UU == null)
        {
			setZZ_Allocation_Offer_ID (0);
        } */
    }

    /** Load Constructor */
    public X_ZZ_Allocation_Offer (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_ZZ_Allocation_Offer[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public org.compiere.model.I_AD_User getAD_User() throws RuntimeException
	{
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_ID)
			.getPO(getAD_User_ID(), get_TrxName());
	}

	/** Set Submitting User.
		@param AD_User_ID Submitting User
	*/
	public void setAD_User_ID (int AD_User_ID)
	{
		if (AD_User_ID < 1)
			set_Value (COLUMNNAME_AD_User_ID, null);
		else
			set_Value (COLUMNNAME_AD_User_ID, Integer.valueOf(AD_User_ID));
	}

	/** Get Submitting User.
		@return Submitting User
	  */
	public int getAD_User_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_User_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_BPartner getC_BPartner() throws RuntimeException
	{
		return (org.compiere.model.I_C_BPartner)MTable.get(getCtx(), org.compiere.model.I_C_BPartner.Table_ID)
			.getPO(getC_BPartner_ID(), get_TrxName());
	}

	/** Set Organisation.
		@param C_BPartner_ID Organisation
	*/
	public void setC_BPartner_ID (int C_BPartner_ID)
	{
		if (C_BPartner_ID < 1)
			set_Value (COLUMNNAME_C_BPartner_ID, null);
		else
			set_Value (COLUMNNAME_C_BPartner_ID, Integer.valueOf(C_BPartner_ID));
	}

	/** Get Organisation.
		@return Organisation
	  */
	public int getC_BPartner_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartner_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Document Date.
		@param DateDoc Document Date
	*/
	public void setDateDoc (Timestamp DateDoc)
	{
		set_Value (COLUMNNAME_DateDoc, DateDoc);
	}

	/** Get Document Date.
		@return Document Date
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
		set_ValueNoCheck (COLUMNNAME_DocumentNo, DocumentNo);
	}

	/** Get Document No.
		@return Document sequence number of the document
	  */
	public String getDocumentNo()
	{
		return (String)get_Value(COLUMNNAME_DocumentNo);
	}

	/** Set Accepted Learners.
		@param ZZAcceptedLearners Accepted Learners
	*/
	public void setZZAcceptedLearners (int ZZAcceptedLearners)
	{
		set_Value (COLUMNNAME_ZZAcceptedLearners, Integer.valueOf(ZZAcceptedLearners));
	}

	/** Get Accepted Learners.
		@return Accepted Learners
	  */
	public int getZZAcceptedLearners()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZAcceptedLearners);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Allocated Learners.
		@param ZZAllocatedLearners Allocated Learners
	*/
	public void setZZAllocatedLearners (int ZZAllocatedLearners)
	{
		set_Value (COLUMNNAME_ZZAllocatedLearners, Integer.valueOf(ZZAllocatedLearners));
	}

	/** Get Allocated Learners.
		@return Allocated Learners
	  */
	public int getZZAllocatedLearners()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZAllocatedLearners);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Accept = A */
	public static final String ZZOFFERDECISION_Accept = "A";
	/** Declined = D */
	public static final String ZZOFFERDECISION_Declined = "D";
	/** Set Offer Decision.
		@param ZZOfferDecision Offer Decision
	*/
	public void setZZOfferDecision (String ZZOfferDecision)
	{

		set_Value (COLUMNNAME_ZZOfferDecision, ZZOfferDecision);
	}

	/** Get Offer Decision.
		@return Offer Decision
	  */
	public String getZZOfferDecision()
	{
		return (String)get_Value(COLUMNNAME_ZZOfferDecision);
	}

	/** Set Allocation Offer.
		@param ZZ_Allocation_Offer_ID Allocation Offer
	*/
	public void setZZ_Allocation_Offer_ID (int ZZ_Allocation_Offer_ID)
	{
		if (ZZ_Allocation_Offer_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZ_Allocation_Offer_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZ_Allocation_Offer_ID, Integer.valueOf(ZZ_Allocation_Offer_ID));
	}

	/** Get Allocation Offer.
		@return Allocation Offer
	  */
	public int getZZ_Allocation_Offer_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZ_Allocation_Offer_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set UUID.
		@param ZZ_Allocation_Offer_UU UUID
	*/
	public void setZZ_Allocation_Offer_UU (String ZZ_Allocation_Offer_UU)
	{
		set_Value (COLUMNNAME_ZZ_Allocation_Offer_UU, ZZ_Allocation_Offer_UU);
	}

	/** Get UUID.
		@return UUID
	  */
	public String getZZ_Allocation_Offer_UU()
	{
		return (String)get_Value(COLUMNNAME_ZZ_Allocation_Offer_UU);
	}

	/** Set Application Form.
		@param ZZ_Application_Form_ID Application Form
	*/
	public void setZZ_Application_Form_ID (int ZZ_Application_Form_ID)
	{
		if (ZZ_Application_Form_ID < 1)
			set_Value (COLUMNNAME_ZZ_Application_Form_ID, null);
		else
			set_Value (COLUMNNAME_ZZ_Application_Form_ID, Integer.valueOf(ZZ_Application_Form_ID));
	}

	/** Get Application Form.
		@return Application Form
	  */
	public int getZZ_Application_Form_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZ_Application_Form_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	/** Set Programme.
		@param ZZ_Program_Master_Data_ID Programme
	*/
	public void setZZ_Program_Master_Data_ID (int ZZ_Program_Master_Data_ID)
	{
		if (ZZ_Program_Master_Data_ID < 1)
			set_Value (COLUMNNAME_ZZ_Program_Master_Data_ID, null);
		else
			set_Value (COLUMNNAME_ZZ_Program_Master_Data_ID, Integer.valueOf(ZZ_Program_Master_Data_ID));
	}

	/** Get Programme.
		@return Programme
	  */
	public int getZZ_Program_Master_Data_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZ_Program_Master_Data_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Reason.
		@param ZZ_Reason Decline / Query Reason
	*/
	public void setZZ_Reason (String ZZ_Reason)
	{
		set_Value (COLUMNNAME_ZZ_Reason, ZZ_Reason);
	}

	/** Get Reason.
		@return Decline / Query Reason
	  */
	public String getZZ_Reason()
	{
		return (String)get_Value(COLUMNNAME_ZZ_Reason);
	}
}