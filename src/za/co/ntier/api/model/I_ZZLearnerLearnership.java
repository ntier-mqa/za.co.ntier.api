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
package za.co.ntier.api.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.compiere.model.*;
import org.compiere.util.KeyNamePair;

/** Generated Interface for ZZLearnerLearnership
 *  @author iDempiere (generated) 
 *  @version Release 12
 */
@SuppressWarnings("all")
public interface I_ZZLearnerLearnership 
{

    /** TableName=ZZLearnerLearnership */
    public static final String Table_Name = "ZZLearnerLearnership";

    /** AD_Table_ID=1000277 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 3 - Client - Org 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /** Column name AD_Client_ID */
    public static final String COLUMNNAME_AD_Client_ID = "AD_Client_ID";

	/** Get Tenant.
	  * Tenant for this installation.
	  */
	public int getAD_Client_ID();

    /** Column name AD_Org_ID */
    public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

	/** Set Unit.
	  * Organizational entity within tenant
	  */
	public void setAD_Org_ID (int AD_Org_ID);

	/** Get Unit.
	  * Organizational entity within tenant
	  */
	public int getAD_Org_ID();

    /** Column name Created */
    public static final String COLUMNNAME_Created = "Created";

	/** Get Created.
	  * Date this record was created
	  */
	public Timestamp getCreated();

    /** Column name CreatedBy */
    public static final String COLUMNNAME_CreatedBy = "CreatedBy";

	/** Get Created By.
	  * User who created this records
	  */
	public int getCreatedBy();

    /** Column name IsActive */
    public static final String COLUMNNAME_IsActive = "IsActive";

	/** Set Active.
	  * The record is active in the system
	  */
	public void setIsActive (boolean IsActive);

	/** Get Active.
	  * The record is active in the system
	  */
	public boolean isActive();

    /** Column name Updated */
    public static final String COLUMNNAME_Updated = "Updated";

	/** Get Updated.
	  * Date this record was updated
	  */
	public Timestamp getUpdated();

    /** Column name UpdatedBy */
    public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

	/** Get Updated By.
	  * User who updated this records
	  */
	public int getUpdatedBy();

    /** Column name ZZAgreementReferenceNumber */
    public static final String COLUMNNAME_ZZAgreementReferenceNumber = "ZZAgreementReferenceNumber";

	/** Set Agreement Reference Number	  */
	public void setZZAgreementReferenceNumber (String ZZAgreementReferenceNumber);

	/** Get Agreement Reference Number	  */
	public String getZZAgreementReferenceNumber();

    /** Column name ZZAmountSpend */
    public static final String COLUMNNAME_ZZAmountSpend = "ZZAmountSpend";

	/** Set Amount Spend	  */
	public void setZZAmountSpend (String ZZAmountSpend);

	/** Get Amount Spend	  */
	public String getZZAmountSpend();

    /** Column name ZZApprovalDate */
    public static final String COLUMNNAME_ZZApprovalDate = "ZZApprovalDate";

	/** Set ZZApprovalDate.
	  * ms_learnerlearnership.approvaldate (separate from dateapproved - source has two distinct approval-tracking column pairs, both kept rather than guessing which is authoritative)
	  */
	public void setZZApprovalDate (Timestamp ZZApprovalDate);

	/** Get ZZApprovalDate.
	  * ms_learnerlearnership.approvaldate (separate from dateapproved - source has two distinct approval-tracking column pairs, both kept rather than guessing which is authoritative)
	  */
	public Timestamp getZZApprovalDate();

    /** Column name ZZApprovedBy */
    public static final String COLUMNNAME_ZZApprovedBy = "ZZApprovedBy";

	/** Set ZZApprovedBy.
	  * ms_learnerlearnership.approvedby (ms_user email match)
	  */
	public void setZZApprovedBy (int ZZApprovedBy);

	/** Get ZZApprovedBy.
	  * ms_learnerlearnership.approvedby (ms_user email match)
	  */
	public int getZZApprovedBy();

	public org.compiere.model.I_AD_User getZZApprove() throws RuntimeException;

    /** Column name ZZBelongToFasset */
    public static final String COLUMNNAME_ZZBelongToFasset = "ZZBelongToFasset";

	/** Set Belong To Fasset	  */
	public void setZZBelongToFasset (String ZZBelongToFasset);

	/** Get Belong To Fasset	  */
	public String getZZBelongToFasset();

    /** Column name ZZCertificateCreatedBy */
    public static final String COLUMNNAME_ZZCertificateCreatedBy = "ZZCertificateCreatedBy";

	/** Set Certificate CreatedBy	  */
	public void setZZCertificateCreatedBy (int ZZCertificateCreatedBy);

	/** Get Certificate CreatedBy	  */
	public int getZZCertificateCreatedBy();

	public org.compiere.model.I_AD_User getZZCertificateCreate() throws RuntimeException;

    /** Column name ZZCertificateNumber */
    public static final String COLUMNNAME_ZZCertificateNumber = "ZZCertificateNumber";

	/** Set Certificate Number	  */
	public void setZZCertificateNumber (String ZZCertificateNumber);

	/** Get Certificate Number	  */
	public String getZZCertificateNumber();

    /** Column name ZZCertificatePrintingErrorReason */
    public static final String COLUMNNAME_ZZCertificatePrintingErrorReason = "ZZCertificatePrintingErrorReason";

	/** Set Certificate Printing Error Reason	  */
	public void setZZCertificatePrintingErrorReason (String ZZCertificatePrintingErrorReason);

	/** Get Certificate Printing Error Reason	  */
	public String getZZCertificatePrintingErrorReason();

    /** Column name ZZCertificateReasonForReprint */
    public static final String COLUMNNAME_ZZCertificateReasonForReprint = "ZZCertificateReasonForReprint";

	/** Set Certificate Reason For Reprint	  */
	public void setZZCertificateReasonForReprint (String ZZCertificateReasonForReprint);

	/** Get Certificate Reason For Reprint	  */
	public String getZZCertificateReasonForReprint();

    /** Column name ZZCommencementDate */
    public static final String COLUMNNAME_ZZCommencementDate = "ZZCommencementDate";

	/** Set Commencement Date	  */
	public void setZZCommencementDate (Timestamp ZZCommencementDate);

	/** Get Commencement Date	  */
	public Timestamp getZZCommencementDate();

    /** Column name ZZCompletionDate */
    public static final String COLUMNNAME_ZZCompletionDate = "ZZCompletionDate";

	/** Set Estimate Completion Date	  */
	public void setZZCompletionDate (Timestamp ZZCompletionDate);

	/** Get Estimate Completion Date	  */
	public Timestamp getZZCompletionDate();

    /** Column name ZZContractNumber */
    public static final String COLUMNNAME_ZZContractNumber = "ZZContractNumber";

	/** Set Contract Number	  */
	public void setZZContractNumber (String ZZContractNumber);

	/** Get Contract Number	  */
	public String getZZContractNumber();

    /** Column name ZZDateApproved */
    public static final String COLUMNNAME_ZZDateApproved = "ZZDateApproved";

	/** Set ZZDateApproved.
	  * ms_learnerlearnership.dateapproved
	  */
	public void setZZDateApproved (Timestamp ZZDateApproved);

	/** Get ZZDateApproved.
	  * ms_learnerlearnership.dateapproved
	  */
	public Timestamp getZZDateApproved();

    /** Column name ZZDateCertificateCreated */
    public static final String COLUMNNAME_ZZDateCertificateCreated = "ZZDateCertificateCreated";

	/** Set Certificate Created	  */
	public void setZZDateCertificateCreated (Timestamp ZZDateCertificateCreated);

	/** Get Certificate Created	  */
	public Timestamp getZZDateCertificateCreated();

    /** Column name ZZDateEndorsed */
    public static final String COLUMNNAME_ZZDateEndorsed = "ZZDateEndorsed";

	/** Set Date Endorsed	  */
	public void setZZDateEndorsed (Timestamp ZZDateEndorsed);

	/** Get Date Endorsed	  */
	public Timestamp getZZDateEndorsed();

    /** Column name ZZDateExtensionCaptured */
    public static final String COLUMNNAME_ZZDateExtensionCaptured = "ZZDateExtensionCaptured";

	/** Set Date Extension Captured	  */
	public void setZZDateExtensionCaptured (Timestamp ZZDateExtensionCaptured);

	/** Get Date Extension Captured	  */
	public Timestamp getZZDateExtensionCaptured();

    /** Column name ZZDateTerminationCaptured */
    public static final String COLUMNNAME_ZZDateTerminationCaptured = "ZZDateTerminationCaptured";

	/** Set Date Termination Captured	  */
	public void setZZDateTerminationCaptured (Timestamp ZZDateTerminationCaptured);

	/** Get Date Termination Captured	  */
	public Timestamp getZZDateTerminationCaptured();

    /** Column name ZZDurationLearnerEmployed */
    public static final String COLUMNNAME_ZZDurationLearnerEmployed = "ZZDurationLearnerEmployed";

	/** Set Duration Learner Employed	  */
	public void setZZDurationLearnerEmployed (String ZZDurationLearnerEmployed);

	/** Get Duration Learner Employed	  */
	public String getZZDurationLearnerEmployed();

    /** Column name ZZEmpContract */
    public static final String COLUMNNAME_ZZEmpContract = "ZZEmpContract";

	/** Set ZZEmpContract.
	  * ms_learnerlearnership.empcontract -&gt;
 MigrationSupport.yesNoIdToFlag()
	  */
	public void setZZEmpContract (boolean ZZEmpContract);

	/** Get ZZEmpContract.
	  * ms_learnerlearnership.empcontract -&gt;
 MigrationSupport.yesNoIdToFlag()
	  */
	public boolean isZZEmpContract();

    /** Column name ZZEmpContractCopy */
    public static final String COLUMNNAME_ZZEmpContractCopy = "ZZEmpContractCopy";

	/** Set ZZEmpContractCopy.
	  * ms_learnerlearnership.empcontractcopy -&gt;
 MigrationSupport.yesNoIdToFlag()
	  */
	public void setZZEmpContractCopy (boolean ZZEmpContractCopy);

	/** Get ZZEmpContractCopy.
	  * ms_learnerlearnership.empcontractcopy -&gt;
 MigrationSupport.yesNoIdToFlag()
	  */
	public boolean isZZEmpContractCopy();

    /** Column name ZZEmploymentStartDate */
    public static final String COLUMNNAME_ZZEmploymentStartDate = "ZZEmploymentStartDate";

	/** Set Employment Start Date	  */
	public void setZZEmploymentStartDate (Timestamp ZZEmploymentStartDate);

	/** Get Employment Start Date	  */
	public Timestamp getZZEmploymentStartDate();

    /** Column name ZZEndorsed */
    public static final String COLUMNNAME_ZZEndorsed = "ZZEndorsed";

	/** Set Endorsed	  */
	public void setZZEndorsed (String ZZEndorsed);

	/** Get Endorsed	  */
	public String getZZEndorsed();

    /** Column name ZZEndorsedBy */
    public static final String COLUMNNAME_ZZEndorsedBy = "ZZEndorsedBy";

	/** Set EndorsedBy	  */
	public void setZZEndorsedBy (int ZZEndorsedBy);

	/** Get EndorsedBy	  */
	public int getZZEndorsedBy();

	public org.compiere.model.I_AD_User getZZEndorse() throws RuntimeException;

    /** Column name ZZEnrolmentStatusReason */
    public static final String COLUMNNAME_ZZEnrolmentStatusReason = "ZZEnrolmentStatusReason";

	/** Set Enrolment Status Reason	  */
	public void setZZEnrolmentStatusReason (String ZZEnrolmentStatusReason);

	/** Get Enrolment Status Reason	  */
	public String getZZEnrolmentStatusReason();

    /** Column name ZZEstimateCompletionDate */
    public static final String COLUMNNAME_ZZEstimateCompletionDate = "ZZEstimateCompletionDate";

	/** Set Estimate Completion Date	  */
	public void setZZEstimateCompletionDate (Timestamp ZZEstimateCompletionDate);

	/** Get Estimate Completion Date	  */
	public Timestamp getZZEstimateCompletionDate();

    /** Column name ZZExtensionCapturedBy */
    public static final String COLUMNNAME_ZZExtensionCapturedBy = "ZZExtensionCapturedBy";

	/** Set Extension CapturedBy	  */
	public void setZZExtensionCapturedBy (int ZZExtensionCapturedBy);

	/** Get Extension CapturedBy	  */
	public int getZZExtensionCapturedBy();

	public org.compiere.model.I_AD_User getZZExtensionCapture() throws RuntimeException;

    /** Column name ZZExtensionDate */
    public static final String COLUMNNAME_ZZExtensionDate = "ZZExtensionDate";

	/** Set Extension Date	  */
	public void setZZExtensionDate (Timestamp ZZExtensionDate);

	/** Get Extension Date	  */
	public Timestamp getZZExtensionDate();

    /** Column name ZZExtensionReason */
    public static final String COLUMNNAME_ZZExtensionReason = "ZZExtensionReason";

	/** Set Extension Reason	  */
	public void setZZExtensionReason (String ZZExtensionReason);

	/** Get Extension Reason	  */
	public String getZZExtensionReason();

    /** Column name ZZGrantType_ID */
    public static final String COLUMNNAME_ZZGrantType_ID = "ZZGrantType_ID";

	/** Set Grant Type	  */
	public void setZZGrantType_ID (int ZZGrantType_ID);

	/** Get Grant Type	  */
	public int getZZGrantType_ID();

	public I_ZZGrantType getZZGrantType() throws RuntimeException;

    /** Column name ZZIsApproved */
    public static final String COLUMNNAME_ZZIsApproved = "ZZIsApproved";

	/** Set ZZIsApproved.
	  * ms_learnerlearnership.isapproved
	  */
	public void setZZIsApproved (boolean ZZIsApproved);

	/** Get ZZIsApproved.
	  * ms_learnerlearnership.isapproved
	  */
	public boolean isZZIsApproved();

    /** Column name ZZIsTermsEmployment */
    public static final String COLUMNNAME_ZZIsTermsEmployment = "ZZIsTermsEmployment";

	/** Set ZZIsTermsEmployment.
	  * ms_learnerlearnership.istermsemployment -&gt;
 ms_lkpyesnonotapplicable (same 1/2-only value pattern as levyyesnoid)
	  */
	public void setZZIsTermsEmployment (String ZZIsTermsEmployment);

	/** Get ZZIsTermsEmployment.
	  * ms_learnerlearnership.istermsemployment -&gt;
 ms_lkpyesnonotapplicable (same 1/2-only value pattern as levyyesnoid)
	  */
	public String getZZIsTermsEmployment();

    /** Column name ZZLearnerEmployed */
    public static final String COLUMNNAME_ZZLearnerEmployed = "ZZLearnerEmployed";

	/** Set Learner Employed	  */
	public void setZZLearnerEmployed (String ZZLearnerEmployed);

	/** Get Learner Employed	  */
	public String getZZLearnerEmployed();

    /** Column name ZZLearnerLearnershipType */
    public static final String COLUMNNAME_ZZLearnerLearnershipType = "ZZLearnerLearnershipType";

	/** Set Learner Learnership Type	  */
	public void setZZLearnerLearnershipType (String ZZLearnerLearnershipType);

	/** Get Learner Learnership Type	  */
	public String getZZLearnerLearnershipType();

    /** Column name ZZLearnerLearnership_ID */
    public static final String COLUMNNAME_ZZLearnerLearnership_ID = "ZZLearnerLearnership_ID";

	/** Set Learner Learnership	  */
	public void setZZLearnerLearnership_ID (int ZZLearnerLearnership_ID);

	/** Get Learner Learnership	  */
	public int getZZLearnerLearnership_ID();

    /** Column name ZZLearnerLearnership_UU */
    public static final String COLUMNNAME_ZZLearnerLearnership_UU = "ZZLearnerLearnership_UU";

	/** Set ZZLearnerLearnership_UU	  */
	public void setZZLearnerLearnership_UU (String ZZLearnerLearnership_UU);

	/** Get ZZLearnerLearnership_UU	  */
	public String getZZLearnerLearnership_UU();

    /** Column name ZZLearner_ID */
    public static final String COLUMNNAME_ZZLearner_ID = "ZZLearner_ID";

	/** Set Learner	  */
	public void setZZLearner_ID (int ZZLearner_ID);

	/** Get Learner	  */
	public int getZZLearner_ID();

	public I_ZZLearner getZZLearner() throws RuntimeException;

    /** Column name ZZLearnership_ID */
    public static final String COLUMNNAME_ZZLearnership_ID = "ZZLearnership_ID";

	/** Set Learnership	  */
	public void setZZLearnership_ID (int ZZLearnership_ID);

	/** Get Learnership	  */
	public int getZZLearnership_ID();

	public I_ZZLearnership getZZLearnership() throws RuntimeException;

    /** Column name ZZMostRecentRegistrationDate */
    public static final String COLUMNNAME_ZZMostRecentRegistrationDate = "ZZMostRecentRegistrationDate";

	/** Set Most Recent Registration Date	  */
	public void setZZMostRecentRegistrationDate (Timestamp ZZMostRecentRegistrationDate);

	/** Get Most Recent Registration Date	  */
	public Timestamp getZZMostRecentRegistrationDate();

    /** Column name ZZNonFundedReason */
    public static final String COLUMNNAME_ZZNonFundedReason = "ZZNonFundedReason";

	/** Set ZZNonFundedReason.
	  * ms_learnerlearnership.nonfundedreason
	  */
	public void setZZNonFundedReason (String ZZNonFundedReason);

	/** Get ZZNonFundedReason.
	  * ms_learnerlearnership.nonfundedreason
	  */
	public String getZZNonFundedReason();

    /** Column name ZZOccupation */
    public static final String COLUMNNAME_ZZOccupation = "ZZOccupation";

	/** Set ZZOccupation.
	  * ms_learnerlearnership.occupation
	  */
	public void setZZOccupation (String ZZOccupation);

	/** Get ZZOccupation.
	  * ms_learnerlearnership.occupation
	  */
	public String getZZOccupation();

    /** Column name ZZOtherSeta */
    public static final String COLUMNNAME_ZZOtherSeta = "ZZOtherSeta";

	/** Set Other Seta	  */
	public void setZZOtherSeta (String ZZOtherSeta);

	/** Get Other Seta	  */
	public String getZZOtherSeta();

    /** Column name ZZPhysicalLocation_ID */
    public static final String COLUMNNAME_ZZPhysicalLocation_ID = "ZZPhysicalLocation_ID";

	/** Set Physical Address	  */
	public void setZZPhysicalLocation_ID (int ZZPhysicalLocation_ID);

	/** Get Physical Address	  */
	public int getZZPhysicalLocation_ID();

	public I_C_Location getZZPhysicalLocation() throws RuntimeException;

    /** Column name ZZPreviousEmployed */
    public static final String COLUMNNAME_ZZPreviousEmployed = "ZZPreviousEmployed";

	/** Set Previous Employed	  */
	public void setZZPreviousEmployed (String ZZPreviousEmployed);

	/** Get Previous Employed	  */
	public String getZZPreviousEmployed();

    /** Column name ZZPreviousLearnership_ID */
    public static final String COLUMNNAME_ZZPreviousLearnership_ID = "ZZPreviousLearnership_ID";

	/** Set Previous Learnership	  */
	public void setZZPreviousLearnership_ID (int ZZPreviousLearnership_ID);

	/** Get Previous Learnership	  */
	public int getZZPreviousLearnership_ID();

	public I_ZZLearnership getZZPreviousLearnership() throws RuntimeException;

    /** Column name ZZProgrammeStatus */
    public static final String COLUMNNAME_ZZProgrammeStatus = "ZZProgrammeStatus";

	/** Set Programme Status	  */
	public void setZZProgrammeStatus (String ZZProgrammeStatus);

	/** Get Programme Status	  */
	public String getZZProgrammeStatus();

    /** Column name ZZProject */
    public static final String COLUMNNAME_ZZProject = "ZZProject";

	/** Set Project	  */
	public void setZZProject (String ZZProject);

	/** Get Project	  */
	public String getZZProject();

    /** Column name ZZQCTO */
    public static final String COLUMNNAME_ZZQCTO = "ZZQCTO";

	/** Set ZZQCTO.
	  * ms_learnerlearnership.qcto (source data is messy free text - no crosswalk attempted)
	  */
	public void setZZQCTO (String ZZQCTO);

	/** Get ZZQCTO.
	  * ms_learnerlearnership.qcto (source data is messy free text - no crosswalk attempted)
	  */
	public String getZZQCTO();

    /** Column name ZZRPL */
    public static final String COLUMNNAME_ZZRPL = "ZZRPL";

	/** Set RPL	  */
	public void setZZRPL (String ZZRPL);

	/** Get RPL	  */
	public String getZZRPL();

    /** Column name ZZRegisteredBy */
    public static final String COLUMNNAME_ZZRegisteredBy = "ZZRegisteredBy";

	/** Set RegisteredBy	  */
	public void setZZRegisteredBy (int ZZRegisteredBy);

	/** Get RegisteredBy	  */
	public int getZZRegisteredBy();

	public org.compiere.model.I_AD_User getZZRegistere() throws RuntimeException;

    /** Column name ZZRegistrationDate */
    public static final String COLUMNNAME_ZZRegistrationDate = "ZZRegistrationDate";

	/** Set Registration Date	  */
	public void setZZRegistrationDate (Timestamp ZZRegistrationDate);

	/** Get Registration Date	  */
	public Timestamp getZZRegistrationDate();

    /** Column name ZZRegistrationNumber */
    public static final String COLUMNNAME_ZZRegistrationNumber = "ZZRegistrationNumber";

	/** Set Registration Number	  */
	public void setZZRegistrationNumber (String ZZRegistrationNumber);

	/** Get Registration Number	  */
	public String getZZRegistrationNumber();

    /** Column name ZZSeta */
    public static final String COLUMNNAME_ZZSeta = "ZZSeta";

	/** Set SETA	  */
	public void setZZSeta (String ZZSeta);

	/** Get SETA	  */
	public String getZZSeta();

    /** Column name ZZSocioEconomicStatus */
    public static final String COLUMNNAME_ZZSocioEconomicStatus = "ZZSocioEconomicStatus";

	/** Set Socio Economic Status	  */
	public void setZZSocioEconomicStatus (String ZZSocioEconomicStatus);

	/** Get Socio Economic Status	  */
	public String getZZSocioEconomicStatus();

    /** Column name ZZSponsorship */
    public static final String COLUMNNAME_ZZSponsorship = "ZZSponsorship";

	/** Set Sponsorship	  */
	public void setZZSponsorship (String ZZSponsorship);

	/** Get Sponsorship	  */
	public String getZZSponsorship();

    /** Column name ZZStatusComments */
    public static final String COLUMNNAME_ZZStatusComments = "ZZStatusComments";

	/** Set Status Comments	  */
	public void setZZStatusComments (String ZZStatusComments);

	/** Get Status Comments	  */
	public String getZZStatusComments();

    /** Column name ZZStatusEffectiveDate */
    public static final String COLUMNNAME_ZZStatusEffectiveDate = "ZZStatusEffectiveDate";

	/** Set Status Effective Date	  */
	public void setZZStatusEffectiveDate (Timestamp ZZStatusEffectiveDate);

	/** Get Status Effective Date	  */
	public Timestamp getZZStatusEffectiveDate();

    /** Column name ZZStudentNumber */
    public static final String COLUMNNAME_ZZStudentNumber = "ZZStudentNumber";

	/** Set Student Number	  */
	public void setZZStudentNumber (String ZZStudentNumber);

	/** Get Student Number	  */
	public String getZZStudentNumber();

    /** Column name ZZTerminatedCapturedBy */
    public static final String COLUMNNAME_ZZTerminatedCapturedBy = "ZZTerminatedCapturedBy";

	/** Set Terminated CapturedBy	  */
	public void setZZTerminatedCapturedBy (int ZZTerminatedCapturedBy);

	/** Get Terminated CapturedBy	  */
	public int getZZTerminatedCapturedBy();

	public org.compiere.model.I_AD_User getZZTerminatedCapture() throws RuntimeException;

    /** Column name ZZTerminationReason */
    public static final String COLUMNNAME_ZZTerminationReason = "ZZTerminationReason";

	/** Set Termination Reason.
	  * Map to TerminationReasonID on old database
	  */
	public void setZZTerminationReason (String ZZTerminationReason);

	/** Get Termination Reason.
	  * Map to TerminationReasonID on old database
	  */
	public String getZZTerminationReason();

    /** Column name ZZTermsEmployment */
    public static final String COLUMNNAME_ZZTermsEmployment = "ZZTermsEmployment";

	/** Set ZZTermsEmployment.
	  * ms_learnerlearnership.termsemployment
	  */
	public void setZZTermsEmployment (String ZZTermsEmployment);

	/** Get ZZTermsEmployment.
	  * ms_learnerlearnership.termsemployment
	  */
	public String getZZTermsEmployment();

    /** Column name ZZWPAgreement */
    public static final String COLUMNNAME_ZZWPAgreement = "ZZWPAgreement";

	/** Set ZZWPAgreement.
	  * ms_learnerlearnership.wpagreement -&gt;
 MigrationSupport.yesNoIdToFlag()
	  */
	public void setZZWPAgreement (boolean ZZWPAgreement);

	/** Get ZZWPAgreement.
	  * ms_learnerlearnership.wpagreement -&gt;
 MigrationSupport.yesNoIdToFlag()
	  */
	public boolean isZZWPAgreement();

    /** Column name ZZ_FinYear_ID */
    public static final String COLUMNNAME_ZZ_FinYear_ID = "ZZ_FinYear_ID";

	/** Set Fin Year	  */
	public void setZZ_FinYear_ID (int ZZ_FinYear_ID);

	/** Get Fin Year	  */
	public int getZZ_FinYear_ID();

	public org.compiere.model.I_C_Year getZZ_FinYear() throws RuntimeException;

    /** Column name id */
    public static final String COLUMNNAME_id = "id";

	/** Set id	  */
	public void setid (int id);

	/** Get id	  */
	public int getid();
}
