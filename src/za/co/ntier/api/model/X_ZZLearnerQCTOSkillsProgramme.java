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

/** Generated Model for ZZLearnerQCTOSkillsProgramme
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="ZZLearnerQCTOSkillsProgramme")
public class X_ZZLearnerQCTOSkillsProgramme extends PO implements I_ZZLearnerQCTOSkillsProgramme, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20260825L;

    /** Standard Constructor */
    public X_ZZLearnerQCTOSkillsProgramme (Properties ctx, int ZZLearnerQCTOSkillsProgramme_ID, String trxName)
    {
      super (ctx, ZZLearnerQCTOSkillsProgramme_ID, trxName);
      /** if (ZZLearnerQCTOSkillsProgramme_ID == 0)
        {
			setZZLearnerQCTOSkillsProgramme_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZLearnerQCTOSkillsProgramme (Properties ctx, int ZZLearnerQCTOSkillsProgramme_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZLearnerQCTOSkillsProgramme_ID, trxName, virtualColumns);
      /** if (ZZLearnerQCTOSkillsProgramme_ID == 0)
        {
			setZZLearnerQCTOSkillsProgramme_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZLearnerQCTOSkillsProgramme (Properties ctx, String ZZLearnerQCTOSkillsProgramme_UU, String trxName)
    {
      super (ctx, ZZLearnerQCTOSkillsProgramme_UU, trxName);
      /** if (ZZLearnerQCTOSkillsProgramme_UU == null)
        {
			setZZLearnerQCTOSkillsProgramme_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZLearnerQCTOSkillsProgramme (Properties ctx, String ZZLearnerQCTOSkillsProgramme_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZLearnerQCTOSkillsProgramme_UU, trxName, virtualColumns);
      /** if (ZZLearnerQCTOSkillsProgramme_UU == null)
        {
			setZZLearnerQCTOSkillsProgramme_ID (0);
        } */
    }

    /** Load Constructor */
    public X_ZZLearnerQCTOSkillsProgramme (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_ZZLearnerQCTOSkillsProgramme[")
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

	/** Set Date Endorsement Created.
		@param ZZDateEndorsementCreated Date Endorsement Created
	*/
	public void setZZDateEndorsementCreated (Timestamp ZZDateEndorsementCreated)
	{
		set_Value (COLUMNNAME_ZZDateEndorsementCreated, ZZDateEndorsementCreated);
	}

	/** Get Date Endorsement Created.
		@return Date Endorsement Created	  */
	public Timestamp getZZDateEndorsementCreated()
	{
		return (Timestamp)get_Value(COLUMNNAME_ZZDateEndorsementCreated);
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

	public org.compiere.model.I_AD_User getZZEndorsementCreate() throws RuntimeException
	{
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_ID)
			.getPO(getZZEndorsementCreatedBy(), get_TrxName());
	}

	/** Set Endorsement CreatedBy.
		@param ZZEndorsementCreatedBy Endorsement CreatedBy
	*/
	public void setZZEndorsementCreatedBy (int ZZEndorsementCreatedBy)
	{
		set_Value (COLUMNNAME_ZZEndorsementCreatedBy, Integer.valueOf(ZZEndorsementCreatedBy));
	}

	/** Get Endorsement CreatedBy.
		@return Endorsement CreatedBy	  */
	public int getZZEndorsementCreatedBy()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZEndorsementCreatedBy);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Endorsement Number.
		@param ZZEndorsementNumber Endorsement Number
	*/
	public void setZZEndorsementNumber (String ZZEndorsementNumber)
	{
		set_Value (COLUMNNAME_ZZEndorsementNumber, ZZEndorsementNumber);
	}

	/** Get Endorsement Number.
		@return Endorsement Number	  */
	public String getZZEndorsementNumber()
	{
		return (String)get_Value(COLUMNNAME_ZZEndorsementNumber);
	}

	/** Set Endorsement Printing Error Reason.
		@param ZZEndorsementPrintingErrorReason Endorsement Printing Error Reason
	*/
	public void setZZEndorsementPrintingErrorReason (String ZZEndorsementPrintingErrorReason)
	{
		set_Value (COLUMNNAME_ZZEndorsementPrintingErrorReason, ZZEndorsementPrintingErrorReason);
	}

	/** Get Endorsement Printing Error Reason.
		@return Endorsement Printing Error Reason	  */
	public String getZZEndorsementPrintingErrorReason()
	{
		return (String)get_Value(COLUMNNAME_ZZEndorsementPrintingErrorReason);
	}

	/** Set Endorsement Reason For Reprint.
		@param ZZEndorsementReasonForReprint Endorsement Reason For Reprint
	*/
	public void setZZEndorsementReasonForReprint (String ZZEndorsementReasonForReprint)
	{

		set_Value (COLUMNNAME_ZZEndorsementReasonForReprint, ZZEndorsementReasonForReprint);
	}

	/** Get Endorsement Reason For Reprint.
		@return Endorsement Reason For Reprint	  */
	public String getZZEndorsementReasonForReprint()
	{
		return (String)get_Value(COLUMNNAME_ZZEndorsementReasonForReprint);
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

	/** ZZLearnerLP AD_Reference_ID=319 */
	public static final int ZZLEARNERLP_AD_Reference_ID=319;
	/** No = N */
	public static final String ZZLEARNERLP_No = "N";
	/** Yes = Y */
	public static final String ZZLEARNERLP_Yes = "Y";
	/** Set LearnerLP.
		@param ZZLearnerLP LearnerLP
	*/
	public void setZZLearnerLP (String ZZLearnerLP)
	{

		set_Value (COLUMNNAME_ZZLearnerLP, ZZLearnerLP);
	}

	/** Get LearnerLP.
		@return LearnerLP	  */
	public String getZZLearnerLP()
	{
		return (String)get_Value(COLUMNNAME_ZZLearnerLP);
	}

	/** Set Learner QCTOSkills Programme.
		@param ZZLearnerQCTOSkillsProgramme_ID Learner QCTOSkills Programme
	*/
	public void setZZLearnerQCTOSkillsProgramme_ID (int ZZLearnerQCTOSkillsProgramme_ID)
	{
		if (ZZLearnerQCTOSkillsProgramme_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZLearnerQCTOSkillsProgramme_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZLearnerQCTOSkillsProgramme_ID, Integer.valueOf(ZZLearnerQCTOSkillsProgramme_ID));
	}

	/** Get Learner QCTOSkills Programme.
		@return Learner QCTOSkills Programme
	  */
	public int getZZLearnerQCTOSkillsProgramme_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZLearnerQCTOSkillsProgramme_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set ZZLearnerQCTOSkillsProgramme_UU.
		@param ZZLearnerQCTOSkillsProgramme_UU ZZLearnerQCTOSkillsProgramme_UU
	*/
	public void setZZLearnerQCTOSkillsProgramme_UU (String ZZLearnerQCTOSkillsProgramme_UU)
	{
		set_Value (COLUMNNAME_ZZLearnerQCTOSkillsProgramme_UU, ZZLearnerQCTOSkillsProgramme_UU);
	}

	/** Get ZZLearnerQCTOSkillsProgramme_UU.
		@return ZZLearnerQCTOSkillsProgramme_UU	  */
	public String getZZLearnerQCTOSkillsProgramme_UU()
	{
		return (String)get_Value(COLUMNNAME_ZZLearnerQCTOSkillsProgramme_UU);
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

	/** Set Skills Programme Reference Number.
		@param ZZQctoSkillsProgrammeReferenceNumber Skills Programme Reference Number
	*/
	public void setZZQctoSkillsProgrammeReferenceNumber (String ZZQctoSkillsProgrammeReferenceNumber)
	{
		set_Value (COLUMNNAME_ZZQctoSkillsProgrammeReferenceNumber, ZZQctoSkillsProgrammeReferenceNumber);
	}

	/** Get Skills Programme Reference Number.
		@return Skills Programme Reference Number	  */
	public String getZZQctoSkillsProgrammeReferenceNumber()
	{
		return (String)get_Value(COLUMNNAME_ZZQctoSkillsProgrammeReferenceNumber);
	}

	public I_ZZQctoSkillsProgramme getZZQctoSkillsProgramme() throws RuntimeException
	{
		return (I_ZZQctoSkillsProgramme)MTable.get(getCtx(), I_ZZQctoSkillsProgramme.Table_ID)
			.getPO(getZZQctoSkillsProgramme_ID(), get_TrxName());
	}

	/** Set QCTO Skills Programme.
		@param ZZQctoSkillsProgramme_ID QCTO Skills Programme
	*/
	public void setZZQctoSkillsProgramme_ID (int ZZQctoSkillsProgramme_ID)
	{
		if (ZZQctoSkillsProgramme_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZQctoSkillsProgramme_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZQctoSkillsProgramme_ID, Integer.valueOf(ZZQctoSkillsProgramme_ID));
	}

	/** Get QCTO Skills Programme.
		@return QCTO Skills Programme	  */
	public int getZZQctoSkillsProgramme_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZQctoSkillsProgramme_ID);
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

	public I_ZZProvider getZZSDProvider() throws RuntimeException
	{
		return (I_ZZProvider)MTable.get(getCtx(), I_ZZProvider.Table_ID)
			.getPO(getZZSDProvider_ID(), get_TrxName());
	}

	/** Set SDProvider.
		@param ZZSDProvider_ID SDProvider
	*/
	public void setZZSDProvider_ID (int ZZSDProvider_ID)
	{
		if (ZZSDProvider_ID < 1)
			set_Value (COLUMNNAME_ZZSDProvider_ID, null);
		else
			set_Value (COLUMNNAME_ZZSDProvider_ID, Integer.valueOf(ZZSDProvider_ID));
	}

	/** Get SDProvider.
		@return SDProvider	  */
	public int getZZSDProvider_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZSDProvider_ID);
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