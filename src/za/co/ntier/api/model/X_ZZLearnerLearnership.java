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

/** Generated Model for ZZLearnerLearnership
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="ZZLearnerLearnership")
public class X_ZZLearnerLearnership extends PO implements I_ZZLearnerLearnership, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20260814L;

    /** Standard Constructor */
    public X_ZZLearnerLearnership (Properties ctx, int ZZLearnerLearnership_ID, String trxName)
    {
      super (ctx, ZZLearnerLearnership_ID, trxName);
      /** if (ZZLearnerLearnership_ID == 0)
        {
			setZZEmpContract (false);
// N
			setZZEmpContractCopy (false);
// N
			setZZIsApproved (false);
// N
			setZZLearnerLearnership_ID (0);
			setZZWPAgreement (false);
// N
        } */
    }

    /** Standard Constructor */
    public X_ZZLearnerLearnership (Properties ctx, int ZZLearnerLearnership_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZLearnerLearnership_ID, trxName, virtualColumns);
      /** if (ZZLearnerLearnership_ID == 0)
        {
			setZZEmpContract (false);
// N
			setZZEmpContractCopy (false);
// N
			setZZIsApproved (false);
// N
			setZZLearnerLearnership_ID (0);
			setZZWPAgreement (false);
// N
        } */
    }

    /** Standard Constructor */
    public X_ZZLearnerLearnership (Properties ctx, String ZZLearnerLearnership_UU, String trxName)
    {
      super (ctx, ZZLearnerLearnership_UU, trxName);
      /** if (ZZLearnerLearnership_UU == null)
        {
			setZZEmpContract (false);
// N
			setZZEmpContractCopy (false);
// N
			setZZIsApproved (false);
// N
			setZZLearnerLearnership_ID (0);
			setZZWPAgreement (false);
// N
        } */
    }

    /** Standard Constructor */
    public X_ZZLearnerLearnership (Properties ctx, String ZZLearnerLearnership_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZLearnerLearnership_UU, trxName, virtualColumns);
      /** if (ZZLearnerLearnership_UU == null)
        {
			setZZEmpContract (false);
// N
			setZZEmpContractCopy (false);
// N
			setZZIsApproved (false);
// N
			setZZLearnerLearnership_ID (0);
			setZZWPAgreement (false);
// N
        } */
    }

    /** Load Constructor */
    public X_ZZLearnerLearnership (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_ZZLearnerLearnership[")
        .append(get_ID()).append("]");
      return sb.toString();
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

	/** Set Amount Spend.
		@param ZZAmountSpend Amount Spend
	*/
	public void setZZAmountSpend (String ZZAmountSpend)
	{
		set_Value (COLUMNNAME_ZZAmountSpend, ZZAmountSpend);
	}

	/** Get Amount Spend.
		@return Amount Spend	  */
	public String getZZAmountSpend()
	{
		return (String)get_Value(COLUMNNAME_ZZAmountSpend);
	}

	/** Set ZZApprovalDate.
		@param ZZApprovalDate ms_learnerlearnership.approvaldate (separate from dateapproved - source has two distinct approval-tracking column pairs, both kept rather than guessing which is authoritative)
	*/
	public void setZZApprovalDate (Timestamp ZZApprovalDate)
	{
		set_Value (COLUMNNAME_ZZApprovalDate, ZZApprovalDate);
	}

	/** Get ZZApprovalDate.
		@return ms_learnerlearnership.approvaldate (separate from dateapproved - source has two distinct approval-tracking column pairs, both kept rather than guessing which is authoritative)
	  */
	public Timestamp getZZApprovalDate()
	{
		return (Timestamp)get_Value(COLUMNNAME_ZZApprovalDate);
	}

	public org.compiere.model.I_AD_User getZZApprove() throws RuntimeException
	{
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_ID)
			.getPO(getZZApprovedBy(), get_TrxName());
	}

	/** Set ZZApprovedBy.
		@param ZZApprovedBy ms_learnerlearnership.approvedby (ms_user email match)
	*/
	public void setZZApprovedBy (int ZZApprovedBy)
	{
		set_Value (COLUMNNAME_ZZApprovedBy, Integer.valueOf(ZZApprovedBy));
	}

	/** Get ZZApprovedBy.
		@return ms_learnerlearnership.approvedby (ms_user email match)
	  */
	public int getZZApprovedBy()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZApprovedBy);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** ZZBelongToFasset AD_Reference_ID=319 */
	public static final int ZZBELONGTOFASSET_AD_Reference_ID=319;
	/** No = N */
	public static final String ZZBELONGTOFASSET_No = "N";
	/** Yes = Y */
	public static final String ZZBELONGTOFASSET_Yes = "Y";
	/** Set Belong To Fasset.
		@param ZZBelongToFasset Belong To Fasset
	*/
	public void setZZBelongToFasset (String ZZBelongToFasset)
	{

		set_Value (COLUMNNAME_ZZBelongToFasset, ZZBelongToFasset);
	}

	/** Get Belong To Fasset.
		@return Belong To Fasset	  */
	public String getZZBelongToFasset()
	{
		return (String)get_Value(COLUMNNAME_ZZBelongToFasset);
	}

	public org.compiere.model.I_AD_User getZZCertificateCreate() throws RuntimeException
	{
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_ID)
			.getPO(getZZCertificateCreatedBy(), get_TrxName());
	}

	/** Set Certificate CreatedBy.
		@param ZZCertificateCreatedBy Certificate CreatedBy
	*/
	public void setZZCertificateCreatedBy (int ZZCertificateCreatedBy)
	{
		set_Value (COLUMNNAME_ZZCertificateCreatedBy, Integer.valueOf(ZZCertificateCreatedBy));
	}

	/** Get Certificate CreatedBy.
		@return Certificate CreatedBy	  */
	public int getZZCertificateCreatedBy()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZCertificateCreatedBy);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Certificate Number.
		@param ZZCertificateNumber Certificate Number
	*/
	public void setZZCertificateNumber (String ZZCertificateNumber)
	{
		set_Value (COLUMNNAME_ZZCertificateNumber, ZZCertificateNumber);
	}

	/** Get Certificate Number.
		@return Certificate Number	  */
	public String getZZCertificateNumber()
	{
		return (String)get_Value(COLUMNNAME_ZZCertificateNumber);
	}

	/** Set Certificate Printing Error Reason.
		@param ZZCertificatePrintingErrorReason Certificate Printing Error Reason
	*/
	public void setZZCertificatePrintingErrorReason (String ZZCertificatePrintingErrorReason)
	{
		set_Value (COLUMNNAME_ZZCertificatePrintingErrorReason, ZZCertificatePrintingErrorReason);
	}

	/** Get Certificate Printing Error Reason.
		@return Certificate Printing Error Reason	  */
	public String getZZCertificatePrintingErrorReason()
	{
		return (String)get_Value(COLUMNNAME_ZZCertificatePrintingErrorReason);
	}

	/** Set Certificate Reason For Reprint.
		@param ZZCertificateReasonForReprint Certificate Reason For Reprint
	*/
	public void setZZCertificateReasonForReprint (String ZZCertificateReasonForReprint)
	{

		set_Value (COLUMNNAME_ZZCertificateReasonForReprint, ZZCertificateReasonForReprint);
	}

	/** Get Certificate Reason For Reprint.
		@return Certificate Reason For Reprint	  */
	public String getZZCertificateReasonForReprint()
	{
		return (String)get_Value(COLUMNNAME_ZZCertificateReasonForReprint);
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

	/** Set Contract Number.
		@param ZZContractNumber Contract Number
	*/
	public void setZZContractNumber (String ZZContractNumber)
	{
		set_Value (COLUMNNAME_ZZContractNumber, ZZContractNumber);
	}

	/** Get Contract Number.
		@return Contract Number	  */
	public String getZZContractNumber()
	{
		return (String)get_Value(COLUMNNAME_ZZContractNumber);
	}

	/** Set ZZDateApproved.
		@param ZZDateApproved ms_learnerlearnership.dateapproved
	*/
	public void setZZDateApproved (Timestamp ZZDateApproved)
	{
		set_Value (COLUMNNAME_ZZDateApproved, ZZDateApproved);
	}

	/** Get ZZDateApproved.
		@return ms_learnerlearnership.dateapproved
	  */
	public Timestamp getZZDateApproved()
	{
		return (Timestamp)get_Value(COLUMNNAME_ZZDateApproved);
	}

	/** Set Certificate Created.
		@param ZZDateCertificateCreated Certificate Created
	*/
	public void setZZDateCertificateCreated (Timestamp ZZDateCertificateCreated)
	{
		set_Value (COLUMNNAME_ZZDateCertificateCreated, ZZDateCertificateCreated);
	}

	/** Get Certificate Created.
		@return Certificate Created	  */
	public Timestamp getZZDateCertificateCreated()
	{
		return (Timestamp)get_Value(COLUMNNAME_ZZDateCertificateCreated);
	}

	/** Set Date Endorsed.
		@param ZZDateEndorsed Date Endorsed
	*/
	public void setZZDateEndorsed (Timestamp ZZDateEndorsed)
	{
		set_Value (COLUMNNAME_ZZDateEndorsed, ZZDateEndorsed);
	}

	/** Get Date Endorsed.
		@return Date Endorsed	  */
	public Timestamp getZZDateEndorsed()
	{
		return (Timestamp)get_Value(COLUMNNAME_ZZDateEndorsed);
	}

	/** Set Date Extension Captured.
		@param ZZDateExtensionCaptured Date Extension Captured
	*/
	public void setZZDateExtensionCaptured (Timestamp ZZDateExtensionCaptured)
	{
		set_Value (COLUMNNAME_ZZDateExtensionCaptured, ZZDateExtensionCaptured);
	}

	/** Get Date Extension Captured.
		@return Date Extension Captured	  */
	public Timestamp getZZDateExtensionCaptured()
	{
		return (Timestamp)get_Value(COLUMNNAME_ZZDateExtensionCaptured);
	}

	/** Set Date Termination Captured.
		@param ZZDateTerminationCaptured Date Termination Captured
	*/
	public void setZZDateTerminationCaptured (Timestamp ZZDateTerminationCaptured)
	{
		set_Value (COLUMNNAME_ZZDateTerminationCaptured, ZZDateTerminationCaptured);
	}

	/** Get Date Termination Captured.
		@return Date Termination Captured	  */
	public Timestamp getZZDateTerminationCaptured()
	{
		return (Timestamp)get_Value(COLUMNNAME_ZZDateTerminationCaptured);
	}

	/** Set Duration Learner Employed.
		@param ZZDurationLearnerEmployed Duration Learner Employed
	*/
	public void setZZDurationLearnerEmployed (String ZZDurationLearnerEmployed)
	{
		set_Value (COLUMNNAME_ZZDurationLearnerEmployed, ZZDurationLearnerEmployed);
	}

	/** Get Duration Learner Employed.
		@return Duration Learner Employed	  */
	public String getZZDurationLearnerEmployed()
	{
		return (String)get_Value(COLUMNNAME_ZZDurationLearnerEmployed);
	}

	/** Set ZZEmpContract.
		@param ZZEmpContract ms_learnerlearnership.empcontract -&gt; MigrationSupport.yesNoIdToFlag()
	*/
	public void setZZEmpContract (boolean ZZEmpContract)
	{
		set_Value (COLUMNNAME_ZZEmpContract, Boolean.valueOf(ZZEmpContract));
	}

	/** Get ZZEmpContract.
		@return ms_learnerlearnership.empcontract -&gt; MigrationSupport.yesNoIdToFlag()
	  */
	public boolean isZZEmpContract()
	{
		Object oo = get_Value(COLUMNNAME_ZZEmpContract);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set ZZEmpContractCopy.
		@param ZZEmpContractCopy ms_learnerlearnership.empcontractcopy -&gt; MigrationSupport.yesNoIdToFlag()
	*/
	public void setZZEmpContractCopy (boolean ZZEmpContractCopy)
	{
		set_Value (COLUMNNAME_ZZEmpContractCopy, Boolean.valueOf(ZZEmpContractCopy));
	}

	/** Get ZZEmpContractCopy.
		@return ms_learnerlearnership.empcontractcopy -&gt; MigrationSupport.yesNoIdToFlag()
	  */
	public boolean isZZEmpContractCopy()
	{
		Object oo = get_Value(COLUMNNAME_ZZEmpContractCopy);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Employment Start Date.
		@param ZZEmploymentStartDate Employment Start Date
	*/
	public void setZZEmploymentStartDate (Timestamp ZZEmploymentStartDate)
	{
		set_Value (COLUMNNAME_ZZEmploymentStartDate, ZZEmploymentStartDate);
	}

	/** Get Employment Start Date.
		@return Employment Start Date	  */
	public Timestamp getZZEmploymentStartDate()
	{
		return (Timestamp)get_Value(COLUMNNAME_ZZEmploymentStartDate);
	}

	/** ZZEndorsed AD_Reference_ID=319 */
	public static final int ZZENDORSED_AD_Reference_ID=319;
	/** No = N */
	public static final String ZZENDORSED_No = "N";
	/** Yes = Y */
	public static final String ZZENDORSED_Yes = "Y";
	/** Set Endorsed.
		@param ZZEndorsed Endorsed
	*/
	public void setZZEndorsed (String ZZEndorsed)
	{

		set_Value (COLUMNNAME_ZZEndorsed, ZZEndorsed);
	}

	/** Get Endorsed.
		@return Endorsed	  */
	public String getZZEndorsed()
	{
		return (String)get_Value(COLUMNNAME_ZZEndorsed);
	}

	public org.compiere.model.I_AD_User getZZEndorse() throws RuntimeException
	{
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_ID)
			.getPO(getZZEndorsedBy(), get_TrxName());
	}

	/** Set EndorsedBy.
		@param ZZEndorsedBy EndorsedBy
	*/
	public void setZZEndorsedBy (int ZZEndorsedBy)
	{
		set_Value (COLUMNNAME_ZZEndorsedBy, Integer.valueOf(ZZEndorsedBy));
	}

	/** Get EndorsedBy.
		@return EndorsedBy	  */
	public int getZZEndorsedBy()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZEndorsedBy);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Financial reasons = 10 */
	public static final String ZZENROLMENTSTATUSREASON_FinancialReasons = "10";
	/** Medical reasons = 15 */
	public static final String ZZENROLMENTSTATUSREASON_MedicalReasons = "15";
	/** None given = 16 */
	public static final String ZZENROLMENTSTATUSREASON_NoneGiven = "16";
	/** Other = 17 */
	public static final String ZZENROLMENTSTATUSREASON_Other = "17";
	/** Social reasons = 27 */
	public static final String ZZENROLMENTSTATUSREASON_SocialReasons = "27";
	/** Study permit not approved = 28 */
	public static final String ZZENROLMENTSTATUSREASON_StudyPermitNotApproved = "28";
	/** Suspension = 29 */
	public static final String ZZENROLMENTSTATUSREASON_Suspension = "29";
	/** Changed priorities = 3 */
	public static final String ZZENROLMENTSTATUSREASON_ChangedPriorities = "3";
	/** Deceased = 4 */
	public static final String ZZENROLMENTSTATUSREASON_Deceased = "4";
	/** Dismissal = 5 */
	public static final String ZZENROLMENTSTATUSREASON_Dismissal = "5";
	/** Employment = 7 */
	public static final String ZZENROLMENTSTATUSREASON_Employment = "7";
	/** Exam enrolment rejected = 8 */
	public static final String ZZENROLMENTSTATUSREASON_ExamEnrolmentRejected = "8";
	/** Exchange student = 9 */
	public static final String ZZENROLMENTSTATUSREASON_ExchangeStudent = "9";
	/** Absconded = Absconded */
	public static final String ZZENROLMENTSTATUSREASON_Absconded = "Absconded";
	/** By Committee = By Committee */
	public static final String ZZENROLMENTSTATUSREASON_ByCommittee = "By Committee";
	/** Met Requirements = Met Requirements */
	public static final String ZZENROLMENTSTATUSREASON_MetRequirements = "Met Requirements";
	/** Withdrawal = Withdrawal */
	public static final String ZZENROLMENTSTATUSREASON_Withdrawal = "Withdrawal";
	/** Set Enrolment Status Reason.
		@param ZZEnrolmentStatusReason Enrolment Status Reason
	*/
	public void setZZEnrolmentStatusReason (String ZZEnrolmentStatusReason)
	{

		set_Value (COLUMNNAME_ZZEnrolmentStatusReason, ZZEnrolmentStatusReason);
	}

	/** Get Enrolment Status Reason.
		@return Enrolment Status Reason	  */
	public String getZZEnrolmentStatusReason()
	{
		return (String)get_Value(COLUMNNAME_ZZEnrolmentStatusReason);
	}

	/** Set Estimate Completion Date.
		@param ZZEstimateCompletionDate Estimate Completion Date
	*/
	public void setZZEstimateCompletionDate (Timestamp ZZEstimateCompletionDate)
	{
		set_Value (COLUMNNAME_ZZEstimateCompletionDate, ZZEstimateCompletionDate);
	}

	/** Get Estimate Completion Date.
		@return Estimate Completion Date	  */
	public Timestamp getZZEstimateCompletionDate()
	{
		return (Timestamp)get_Value(COLUMNNAME_ZZEstimateCompletionDate);
	}

	public org.compiere.model.I_AD_User getZZExtensionCapture() throws RuntimeException
	{
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_ID)
			.getPO(getZZExtensionCapturedBy(), get_TrxName());
	}

	/** Set Extension CapturedBy.
		@param ZZExtensionCapturedBy Extension CapturedBy
	*/
	public void setZZExtensionCapturedBy (int ZZExtensionCapturedBy)
	{
		set_Value (COLUMNNAME_ZZExtensionCapturedBy, Integer.valueOf(ZZExtensionCapturedBy));
	}

	/** Get Extension CapturedBy.
		@return Extension CapturedBy	  */
	public int getZZExtensionCapturedBy()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZExtensionCapturedBy);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Extension Date.
		@param ZZExtensionDate Extension Date
	*/
	public void setZZExtensionDate (Timestamp ZZExtensionDate)
	{
		set_Value (COLUMNNAME_ZZExtensionDate, ZZExtensionDate);
	}

	/** Get Extension Date.
		@return Extension Date	  */
	public Timestamp getZZExtensionDate()
	{
		return (Timestamp)get_Value(COLUMNNAME_ZZExtensionDate);
	}

	/** Set Extension Reason.
		@param ZZExtensionReason Extension Reason
	*/
	public void setZZExtensionReason (String ZZExtensionReason)
	{
		set_Value (COLUMNNAME_ZZExtensionReason, ZZExtensionReason);
	}

	/** Get Extension Reason.
		@return Extension Reason	  */
	public String getZZExtensionReason()
	{
		return (String)get_Value(COLUMNNAME_ZZExtensionReason);
	}

	public I_ZZGrantType getZZGrantType() throws RuntimeException
	{
		return (I_ZZGrantType)MTable.get(getCtx(), I_ZZGrantType.Table_ID)
			.getPO(getZZGrantType_ID(), get_TrxName());
	}

	/** Set Grant Type.
		@param ZZGrantType_ID Grant Type
	*/
	public void setZZGrantType_ID (int ZZGrantType_ID)
	{
		if (ZZGrantType_ID < 1)
			set_Value (COLUMNNAME_ZZGrantType_ID, null);
		else
			set_Value (COLUMNNAME_ZZGrantType_ID, Integer.valueOf(ZZGrantType_ID));
	}

	/** Get Grant Type.
		@return Grant Type	  */
	public int getZZGrantType_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZGrantType_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set ZZIsApproved.
		@param ZZIsApproved ms_learnerlearnership.isapproved
	*/
	public void setZZIsApproved (boolean ZZIsApproved)
	{
		set_Value (COLUMNNAME_ZZIsApproved, Boolean.valueOf(ZZIsApproved));
	}

	/** Get ZZIsApproved.
		@return ms_learnerlearnership.isapproved
	  */
	public boolean isZZIsApproved()
	{
		Object oo = get_Value(COLUMNNAME_ZZIsApproved);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** No = No */
	public static final String ZZISTERMSEMPLOYMENT_No = "No";
	/** Not Applicable = Not Applicable */
	public static final String ZZISTERMSEMPLOYMENT_NotApplicable = "Not Applicable";
	/** Yes = Yes */
	public static final String ZZISTERMSEMPLOYMENT_Yes = "Yes";
	/** Set ZZIsTermsEmployment.
		@param ZZIsTermsEmployment ms_learnerlearnership.istermsemployment -&gt; ms_lkpyesnonotapplicable (same 1/2-only value pattern as levyyesnoid)
	*/
	public void setZZIsTermsEmployment (String ZZIsTermsEmployment)
	{

		set_Value (COLUMNNAME_ZZIsTermsEmployment, ZZIsTermsEmployment);
	}

	/** Get ZZIsTermsEmployment.
		@return ms_learnerlearnership.istermsemployment -&gt; ms_lkpyesnonotapplicable (same 1/2-only value pattern as levyyesnoid)
	  */
	public String getZZIsTermsEmployment()
	{
		return (String)get_Value(COLUMNNAME_ZZIsTermsEmployment);
	}

	/** Set Learner Employed.
		@param ZZLearnerEmployed Learner Employed
	*/
	public void setZZLearnerEmployed (String ZZLearnerEmployed)
	{
		set_Value (COLUMNNAME_ZZLearnerEmployed, ZZLearnerEmployed);
	}

	/** Get Learner Employed.
		@return Learner Employed	  */
	public String getZZLearnerEmployed()
	{
		return (String)get_Value(COLUMNNAME_ZZLearnerEmployed);
	}

	/** Beneficiation Learnership = Beneficiation Learnership */
	public static final String ZZLEARNERLEARNERSHIPTYPE_BeneficiationLearnership = "Beneficiation Learnership";
	/** Learnership = Learnership */
	public static final String ZZLEARNERLEARNERSHIPTYPE_Learnership = "Learnership";
	/** Non MQA Learnership = Non MQA Learnership */
	public static final String ZZLEARNERLEARNERSHIPTYPE_NonMQALearnership = "Non MQA Learnership";
	/** RPL = RPL */
	public static final String ZZLEARNERLEARNERSHIPTYPE_RPL = "RPL";
	/** Set Learner Learnership Type.
		@param ZZLearnerLearnershipType Learner Learnership Type
	*/
	public void setZZLearnerLearnershipType (String ZZLearnerLearnershipType)
	{

		set_Value (COLUMNNAME_ZZLearnerLearnershipType, ZZLearnerLearnershipType);
	}

	/** Get Learner Learnership Type.
		@return Learner Learnership Type	  */
	public String getZZLearnerLearnershipType()
	{
		return (String)get_Value(COLUMNNAME_ZZLearnerLearnershipType);
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

	/** Set ZZLearnerLearnership_UU.
		@param ZZLearnerLearnership_UU ZZLearnerLearnership_UU
	*/
	public void setZZLearnerLearnership_UU (String ZZLearnerLearnership_UU)
	{
		set_Value (COLUMNNAME_ZZLearnerLearnership_UU, ZZLearnerLearnership_UU);
	}

	/** Get ZZLearnerLearnership_UU.
		@return ZZLearnerLearnership_UU	  */
	public String getZZLearnerLearnership_UU()
	{
		return (String)get_Value(COLUMNNAME_ZZLearnerLearnership_UU);
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

	public I_ZZLearnership getZZLearnership() throws RuntimeException
	{
		return (I_ZZLearnership)MTable.get(getCtx(), I_ZZLearnership.Table_ID)
			.getPO(getZZLearnership_ID(), get_TrxName());
	}

	/** Set Learnership.
		@param ZZLearnership_ID Learnership
	*/
	public void setZZLearnership_ID (int ZZLearnership_ID)
	{
		if (ZZLearnership_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZLearnership_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZLearnership_ID, Integer.valueOf(ZZLearnership_ID));
	}

	/** Get Learnership.
		@return Learnership	  */
	public int getZZLearnership_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZLearnership_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Most Recent Registration Date.
		@param ZZMostRecentRegistrationDate Most Recent Registration Date
	*/
	public void setZZMostRecentRegistrationDate (Timestamp ZZMostRecentRegistrationDate)
	{
		set_Value (COLUMNNAME_ZZMostRecentRegistrationDate, ZZMostRecentRegistrationDate);
	}

	/** Get Most Recent Registration Date.
		@return Most Recent Registration Date	  */
	public Timestamp getZZMostRecentRegistrationDate()
	{
		return (Timestamp)get_Value(COLUMNNAME_ZZMostRecentRegistrationDate);
	}

	/** Set ZZNonFundedReason.
		@param ZZNonFundedReason ms_learnerlearnership.nonfundedreason
	*/
	public void setZZNonFundedReason (String ZZNonFundedReason)
	{
		set_Value (COLUMNNAME_ZZNonFundedReason, ZZNonFundedReason);
	}

	/** Get ZZNonFundedReason.
		@return ms_learnerlearnership.nonfundedreason
	  */
	public String getZZNonFundedReason()
	{
		return (String)get_Value(COLUMNNAME_ZZNonFundedReason);
	}

	/** Set ZZOccupation.
		@param ZZOccupation ms_learnerlearnership.occupation
	*/
	public void setZZOccupation (String ZZOccupation)
	{
		set_Value (COLUMNNAME_ZZOccupation, ZZOccupation);
	}

	/** Get ZZOccupation.
		@return ms_learnerlearnership.occupation
	  */
	public String getZZOccupation()
	{
		return (String)get_Value(COLUMNNAME_ZZOccupation);
	}

	/** Set Other Seta.
		@param ZZOtherSeta Other Seta
	*/
	public void setZZOtherSeta (String ZZOtherSeta)
	{

		set_Value (COLUMNNAME_ZZOtherSeta, ZZOtherSeta);
	}

	/** Get Other Seta.
		@return Other Seta	  */
	public String getZZOtherSeta()
	{
		return (String)get_Value(COLUMNNAME_ZZOtherSeta);
	}

	public I_C_Location getZZPhysicalLocation() throws RuntimeException
	{
		return (I_C_Location)MTable.get(getCtx(), I_C_Location.Table_ID)
			.getPO(getZZPhysicalLocation_ID(), get_TrxName());
	}

	/** Set Physical Address.
		@param ZZPhysicalLocation_ID Physical Address
	*/
	public void setZZPhysicalLocation_ID (int ZZPhysicalLocation_ID)
	{
		if (ZZPhysicalLocation_ID < 1)
			set_Value (COLUMNNAME_ZZPhysicalLocation_ID, null);
		else
			set_Value (COLUMNNAME_ZZPhysicalLocation_ID, Integer.valueOf(ZZPhysicalLocation_ID));
	}

	/** Get Physical Address.
		@return Physical Address	  */
	public int getZZPhysicalLocation_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZPhysicalLocation_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** ZZPreviousEmployed AD_Reference_ID=319 */
	public static final int ZZPREVIOUSEMPLOYED_AD_Reference_ID=319;
	/** No = N */
	public static final String ZZPREVIOUSEMPLOYED_No = "N";
	/** Yes = Y */
	public static final String ZZPREVIOUSEMPLOYED_Yes = "Y";
	/** Set Previous Employed.
		@param ZZPreviousEmployed Previous Employed
	*/
	public void setZZPreviousEmployed (String ZZPreviousEmployed)
	{

		set_Value (COLUMNNAME_ZZPreviousEmployed, ZZPreviousEmployed);
	}

	/** Get Previous Employed.
		@return Previous Employed	  */
	public String getZZPreviousEmployed()
	{
		return (String)get_Value(COLUMNNAME_ZZPreviousEmployed);
	}

	public I_ZZLearnership getZZPreviousLearnership() throws RuntimeException
	{
		return (I_ZZLearnership)MTable.get(getCtx(), I_ZZLearnership.Table_ID)
			.getPO(getZZPreviousLearnership_ID(), get_TrxName());
	}

	/** Set Previous Learnership.
		@param ZZPreviousLearnership_ID Previous Learnership
	*/
	public void setZZPreviousLearnership_ID (int ZZPreviousLearnership_ID)
	{
		if (ZZPreviousLearnership_ID < 1)
			set_Value (COLUMNNAME_ZZPreviousLearnership_ID, null);
		else
			set_Value (COLUMNNAME_ZZPreviousLearnership_ID, Integer.valueOf(ZZPreviousLearnership_ID));
	}

	/** Get Previous Learnership.
		@return Previous Learnership	  */
	public int getZZPreviousLearnership_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZPreviousLearnership_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Programme Status.
		@param ZZProgrammeStatus Programme Status
	*/
	public void setZZProgrammeStatus (String ZZProgrammeStatus)
	{

		set_Value (COLUMNNAME_ZZProgrammeStatus, ZZProgrammeStatus);
	}

	/** Get Programme Status.
		@return Programme Status	  */
	public String getZZProgrammeStatus()
	{
		return (String)get_Value(COLUMNNAME_ZZProgrammeStatus);
	}

	/** Set Project.
		@param ZZProject Project
	*/
	public void setZZProject (String ZZProject)
	{

		set_Value (COLUMNNAME_ZZProject, ZZProject);
	}

	/** Get Project.
		@return Project	  */
	public String getZZProject()
	{
		return (String)get_Value(COLUMNNAME_ZZProject);
	}

	/** Set ZZQCTO.
		@param ZZQCTO ms_learnerlearnership.qcto (source data is messy free text - no crosswalk attempted)
	*/
	public void setZZQCTO (String ZZQCTO)
	{
		set_Value (COLUMNNAME_ZZQCTO, ZZQCTO);
	}

	/** Get ZZQCTO.
		@return ms_learnerlearnership.qcto (source data is messy free text - no crosswalk attempted)
	  */
	public String getZZQCTO()
	{
		return (String)get_Value(COLUMNNAME_ZZQCTO);
	}

	/** ZZRPL AD_Reference_ID=319 */
	public static final int ZZRPL_AD_Reference_ID=319;
	/** No = N */
	public static final String ZZRPL_No = "N";
	/** Yes = Y */
	public static final String ZZRPL_Yes = "Y";
	/** Set RPL.
		@param ZZRPL RPL
	*/
	public void setZZRPL (String ZZRPL)
	{

		set_Value (COLUMNNAME_ZZRPL, ZZRPL);
	}

	/** Get RPL.
		@return RPL	  */
	public String getZZRPL()
	{
		return (String)get_Value(COLUMNNAME_ZZRPL);
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

	/** Set Registration Date.
		@param ZZRegistrationDate Registration Date
	*/
	public void setZZRegistrationDate (Timestamp ZZRegistrationDate)
	{
		set_Value (COLUMNNAME_ZZRegistrationDate, ZZRegistrationDate);
	}

	/** Get Registration Date.
		@return Registration Date	  */
	public Timestamp getZZRegistrationDate()
	{
		return (Timestamp)get_Value(COLUMNNAME_ZZRegistrationDate);
	}

	/** Set Registration Number.
		@param ZZRegistrationNumber Registration Number
	*/
	public void setZZRegistrationNumber (String ZZRegistrationNumber)
	{
		set_Value (COLUMNNAME_ZZRegistrationNumber, ZZRegistrationNumber);
	}

	/** Get Registration Number.
		@return Registration Number	  */
	public String getZZRegistrationNumber()
	{
		return (String)get_Value(COLUMNNAME_ZZRegistrationNumber);
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

	/** SETA Funded = 1 */
	public static final String ZZSPONSORSHIP_SETAFunded = "1";
	/** Industry Funded = 2 */
	public static final String ZZSPONSORSHIP_IndustryFunded = "2";
	/** Set Sponsorship.
		@param ZZSponsorship Sponsorship
	*/
	public void setZZSponsorship (String ZZSponsorship)
	{

		set_Value (COLUMNNAME_ZZSponsorship, ZZSponsorship);
	}

	/** Get Sponsorship.
		@return Sponsorship	  */
	public String getZZSponsorship()
	{
		return (String)get_Value(COLUMNNAME_ZZSponsorship);
	}

	/** Set Status Comments.
		@param ZZStatusComments Status Comments
	*/
	public void setZZStatusComments (String ZZStatusComments)
	{
		set_Value (COLUMNNAME_ZZStatusComments, ZZStatusComments);
	}

	/** Get Status Comments.
		@return Status Comments	  */
	public String getZZStatusComments()
	{
		return (String)get_Value(COLUMNNAME_ZZStatusComments);
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

	public org.compiere.model.I_AD_User getZZTerminatedCapture() throws RuntimeException
	{
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_ID)
			.getPO(getZZTerminatedCapturedBy(), get_TrxName());
	}

	/** Set Terminated CapturedBy.
		@param ZZTerminatedCapturedBy Terminated CapturedBy
	*/
	public void setZZTerminatedCapturedBy (int ZZTerminatedCapturedBy)
	{
		set_Value (COLUMNNAME_ZZTerminatedCapturedBy, Integer.valueOf(ZZTerminatedCapturedBy));
	}

	/** Get Terminated CapturedBy.
		@return Terminated CapturedBy	  */
	public int getZZTerminatedCapturedBy()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZTerminatedCapturedBy);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Learner absconded = Learner absconded */
	public static final String ZZTERMINATIONREASON_LearnerAbsconded = "Learner absconded";
	/** Learner got permanent employment somewhere else = Learner got permanent employment somewhere else */
	public static final String ZZTERMINATIONREASON_LearnerGotPermanentEmploymentSomewhereElse = "Learner got permanent employment somewhere else";
	/** Learner no longer working for the company = Learner no longer working for the company */
	public static final String ZZTERMINATIONREASON_LearnerNoLongerWorkingForTheCompany = "Learner no longer working for the company";
	/** Learner passed away = Learner passed away */
	public static final String ZZTERMINATIONREASON_LearnerPassedAway = "Learner passed away";
	/** Learner resigned = Learner resigned */
	public static final String ZZTERMINATIONREASON_LearnerResigned = "Learner resigned";
	/** Learner to continue with full time studies/went back to school = Learner to continue with full time studies/went back to scho */
	public static final String ZZTERMINATIONREASON_LearnerToContinueWithFullTimeStudiesWentBackToSchool = "Learner to continue with full time studies/went back to scho";
	/** Learner went AWOL = Learner went AWOL */
	public static final String ZZTERMINATIONREASON_LearnerWentAWOL = "Learner went AWOL";
	/** Other = Other */
	public static final String ZZTERMINATIONREASON_Other = "Other";
	/** Set Termination Reason.
		@param ZZTerminationReason Map to TerminationReasonID on old database
	*/
	public void setZZTerminationReason (String ZZTerminationReason)
	{

		set_Value (COLUMNNAME_ZZTerminationReason, ZZTerminationReason);
	}

	/** Get Termination Reason.
		@return Map to TerminationReasonID on old database
	  */
	public String getZZTerminationReason()
	{
		return (String)get_Value(COLUMNNAME_ZZTerminationReason);
	}

	/** Set ZZTermsEmployment.
		@param ZZTermsEmployment ms_learnerlearnership.termsemployment
	*/
	public void setZZTermsEmployment (String ZZTermsEmployment)
	{
		set_Value (COLUMNNAME_ZZTermsEmployment, ZZTermsEmployment);
	}

	/** Get ZZTermsEmployment.
		@return ms_learnerlearnership.termsemployment
	  */
	public String getZZTermsEmployment()
	{
		return (String)get_Value(COLUMNNAME_ZZTermsEmployment);
	}

	/** Set ZZWPAgreement.
		@param ZZWPAgreement ms_learnerlearnership.wpagreement -&gt; MigrationSupport.yesNoIdToFlag()
	*/
	public void setZZWPAgreement (boolean ZZWPAgreement)
	{
		set_Value (COLUMNNAME_ZZWPAgreement, Boolean.valueOf(ZZWPAgreement));
	}

	/** Get ZZWPAgreement.
		@return ms_learnerlearnership.wpagreement -&gt; MigrationSupport.yesNoIdToFlag()
	  */
	public boolean isZZWPAgreement()
	{
		Object oo = get_Value(COLUMNNAME_ZZWPAgreement);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	public org.compiere.model.I_C_Year getZZ_FinYear() throws RuntimeException
	{
		return (org.compiere.model.I_C_Year)MTable.get(getCtx(), org.compiere.model.I_C_Year.Table_ID)
			.getPO(getZZ_FinYear_ID(), get_TrxName());
	}

	/** Set Fin Year.
		@param ZZ_FinYear_ID Fin Year
	*/
	public void setZZ_FinYear_ID (int ZZ_FinYear_ID)
	{
		if (ZZ_FinYear_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZ_FinYear_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZ_FinYear_ID, Integer.valueOf(ZZ_FinYear_ID));
	}

	/** Get Fin Year.
		@return Fin Year	  */
	public int getZZ_FinYear_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZ_FinYear_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set id.
		@param id id
	*/
	public void setid (int id)
	{
		set_Value (COLUMNNAME_id, Integer.valueOf(id));
	}

	/** Get id.
		@return id	  */
	public int getid()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_id);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}