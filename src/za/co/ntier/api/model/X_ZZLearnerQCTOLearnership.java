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

/** Generated Model for ZZLearnerQCTOLearnership
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="ZZLearnerQCTOLearnership")
public class X_ZZLearnerQCTOLearnership extends PO implements I_ZZLearnerQCTOLearnership, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20260702L;

    /** Standard Constructor */
    public X_ZZLearnerQCTOLearnership (Properties ctx, int ZZLearnerQCTOLearnership_ID, String trxName)
    {
      super (ctx, ZZLearnerQCTOLearnership_ID, trxName);
      /** if (ZZLearnerQCTOLearnership_ID == 0)
        {
			setZZLearnerQCTOLearnership_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZLearnerQCTOLearnership (Properties ctx, int ZZLearnerQCTOLearnership_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZLearnerQCTOLearnership_ID, trxName, virtualColumns);
      /** if (ZZLearnerQCTOLearnership_ID == 0)
        {
			setZZLearnerQCTOLearnership_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZLearnerQCTOLearnership (Properties ctx, String ZZLearnerQCTOLearnership_UU, String trxName)
    {
      super (ctx, ZZLearnerQCTOLearnership_UU, trxName);
      /** if (ZZLearnerQCTOLearnership_UU == null)
        {
			setZZLearnerQCTOLearnership_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZLearnerQCTOLearnership (Properties ctx, String ZZLearnerQCTOLearnership_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZLearnerQCTOLearnership_UU, trxName, virtualColumns);
      /** if (ZZLearnerQCTOLearnership_UU == null)
        {
			setZZLearnerQCTOLearnership_ID (0);
        } */
    }

    /** Load Constructor */
    public X_ZZLearnerQCTOLearnership (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_ZZLearnerQCTOLearnership[")
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

	public org.compiere.model.I_C_Year getZZFinancialYear() throws RuntimeException
	{
		return (org.compiere.model.I_C_Year)MTable.get(getCtx(), org.compiere.model.I_C_Year.Table_ID)
			.getPO(getZZFinancialYear_ID(), get_TrxName());
	}

	/** Set Financial Year.
		@param ZZFinancialYear_ID Financial Year
	*/
	public void setZZFinancialYear_ID (int ZZFinancialYear_ID)
	{
		if (ZZFinancialYear_ID < 1)
			set_Value (COLUMNNAME_ZZFinancialYear_ID, null);
		else
			set_Value (COLUMNNAME_ZZFinancialYear_ID, Integer.valueOf(ZZFinancialYear_ID));
	}

	/** Get Financial Year.
		@return Financial Year	  */
	public int getZZFinancialYear_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZFinancialYear_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
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
			set_ValueNoCheck (COLUMNNAME_ZZGrantType_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZGrantType_ID, Integer.valueOf(ZZGrantType_ID));
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

	/** Beneficiation Learnership = Beneficiation Learnership */
	public static final String ZZLEARNERQCTOLEARNERSHIPTYPE_BeneficiationLearnership = "Beneficiation Learnership";
	/** Learnership = Learnership */
	public static final String ZZLEARNERQCTOLEARNERSHIPTYPE_Learnership = "Learnership";
	/** QCTO Learnership - 1 = QCTO Learnership - 1 */
	public static final String ZZLEARNERQCTOLEARNERSHIPTYPE_QCTOLearnership_1 = "QCTO Learnership - 1";
	/** RPL = RPL */
	public static final String ZZLEARNERQCTOLEARNERSHIPTYPE_RPL = "RPL";
	/** Set Learner QCTOLearnership Type.
		@param ZZLearnerQCTOLearnershipType Learner QCTOLearnership Type
	*/
	public void setZZLearnerQCTOLearnershipType (String ZZLearnerQCTOLearnershipType)
	{

		set_Value (COLUMNNAME_ZZLearnerQCTOLearnershipType, ZZLearnerQCTOLearnershipType);
	}

	/** Get Learner QCTOLearnership Type.
		@return Learner QCTOLearnership Type	  */
	public String getZZLearnerQCTOLearnershipType()
	{
		return (String)get_Value(COLUMNNAME_ZZLearnerQCTOLearnershipType);
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

	/** Set ZZLearnerQCTOLearnership_UU.
		@param ZZLearnerQCTOLearnership_UU ZZLearnerQCTOLearnership_UU
	*/
	public void setZZLearnerQCTOLearnership_UU (String ZZLearnerQCTOLearnership_UU)
	{
		set_Value (COLUMNNAME_ZZLearnerQCTOLearnership_UU, ZZLearnerQCTOLearnership_UU);
	}

	/** Get ZZLearnerQCTOLearnership_UU.
		@return ZZLearnerQCTOLearnership_UU	  */
	public String getZZLearnerQCTOLearnership_UU()
	{
		return (String)get_Value(COLUMNNAME_ZZLearnerQCTOLearnership_UU);
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

	public I_ZZQctoLearnership getZZPreviousQctoLearnership() throws RuntimeException
	{
		return (I_ZZQctoLearnership)MTable.get(getCtx(), I_ZZQctoLearnership.Table_ID)
			.getPO(getZZPreviousQctoLearnership_ID(), get_TrxName());
	}

	/** Set Previous QCTOLearnership.
		@param ZZPreviousQctoLearnership_ID Previous QCTOLearnership
	*/
	public void setZZPreviousQctoLearnership_ID (int ZZPreviousQctoLearnership_ID)
	{
		if (ZZPreviousQctoLearnership_ID < 1)
			set_Value (COLUMNNAME_ZZPreviousQctoLearnership_ID, null);
		else
			set_Value (COLUMNNAME_ZZPreviousQctoLearnership_ID, Integer.valueOf(ZZPreviousQctoLearnership_ID));
	}

	/** Get Previous QCTOLearnership.
		@return Previous QCTOLearnership	  */
	public int getZZPreviousQctoLearnership_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZPreviousQctoLearnership_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	public I_ZZQctoLearnership getZZQctoLearnership() throws RuntimeException
	{
		return (I_ZZQctoLearnership)MTable.get(getCtx(), I_ZZQctoLearnership.Table_ID)
			.getPO(getZZQctoLearnership_ID(), get_TrxName());
	}

	/** Set QCTO Learnership.
		@param ZZQctoLearnership_ID QCTO Learnership
	*/
	public void setZZQctoLearnership_ID (int ZZQctoLearnership_ID)
	{
		if (ZZQctoLearnership_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZQctoLearnership_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZQctoLearnership_ID, Integer.valueOf(ZZQctoLearnership_ID));
	}

	/** Get QCTO Learnership.
		@return QCTO Learnership	  */
	public int getZZQctoLearnership_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZQctoLearnership_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_ZZQctoProgrammeStatus getZZQctoProgrammeStatus() throws RuntimeException
	{
		return (I_ZZQctoProgrammeStatus)MTable.get(getCtx(), I_ZZQctoProgrammeStatus.Table_ID)
			.getPO(getZZQctoProgrammeStatus_ID(), get_TrxName());
	}

	/** Set QCTO Programme Status.
		@param ZZQctoProgrammeStatus_ID QCTO Programme Status
	*/
	public void setZZQctoProgrammeStatus_ID (int ZZQctoProgrammeStatus_ID)
	{
		if (ZZQctoProgrammeStatus_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZQctoProgrammeStatus_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZQctoProgrammeStatus_ID, Integer.valueOf(ZZQctoProgrammeStatus_ID));
	}

	/** Get QCTO Programme Status.
		@return QCTO Programme Status	  */
	public int getZZQctoProgrammeStatus_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZQctoProgrammeStatus_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Met entry requirements = Met entry requirements */
	public static final String ZZQUALIFICATIONREQUIREMENTS_MetEntryRequirements = "Met entry requirements";
	/** Other = Other */
	public static final String ZZQUALIFICATIONREQUIREMENTS_Other = "Other";
	/** RPL -skills experience = RPL -skills experience */
	public static final String ZZQUALIFICATIONREQUIREMENTS_RPL_SkillsExperience = "RPL -skills experience";
	/** RPL with qualification at lower level than required = RPL with qualification at lower level than required */
	public static final String ZZQUALIFICATIONREQUIREMENTS_RPLWithQualificationAtLowerLevelThanRequired = "RPL with qualification at lower level than required";
	/** Set Qualification Entry Requirements.
		@param ZZQualificationRequirements Qualification Entry Requirements
	*/
	public void setZZQualificationRequirements (String ZZQualificationRequirements)
	{

		set_Value (COLUMNNAME_ZZQualificationRequirements, ZZQualificationRequirements);
	}

	/** Get Qualification Entry Requirements.
		@return Qualification Entry Requirements	  */
	public String getZZQualificationRequirements()
	{
		return (String)get_Value(COLUMNNAME_ZZQualificationRequirements);
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

	/** Set Termination Date.
		@param ZZTerminationDate Termination Date
	*/
	public void setZZTerminationDate (Timestamp ZZTerminationDate)
	{
		set_Value (COLUMNNAME_ZZTerminationDate, ZZTerminationDate);
	}

	/** Get Termination Date.
		@return Termination Date	  */
	public Timestamp getZZTerminationDate()
	{
		return (Timestamp)get_Value(COLUMNNAME_ZZTerminationDate);
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
	/** Learner to continue with full time studies/went back to school = Learner to continue with full time studies/went back to school */
	public static final String ZZTERMINATIONREASON_LearnerToContinueWithFullTimeStudiesWentBackToSchool = "Learner to continue with full time studies/went back to school";
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

	/** Set Termination Reason.
		@param ZZTerminationReasonText Termination Reason
	*/
	public void setZZTerminationReasonText (String ZZTerminationReasonText)
	{
		set_Value (COLUMNNAME_ZZTerminationReasonText, ZZTerminationReasonText);
	}

	/** Get Termination Reason.
		@return Termination Reason	  */
	public String getZZTerminationReasonText()
	{
		return (String)get_Value(COLUMNNAME_ZZTerminationReasonText);
	}
}