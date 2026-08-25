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

/** Generated Interface for ZZLearnerQCTOSkillsProgramme
 *  @author iDempiere (generated) 
 *  @version Release 12
 */
@SuppressWarnings("all")
public interface I_ZZLearnerQCTOSkillsProgramme 
{

    /** TableName=ZZLearnerQCTOSkillsProgramme */
    public static final String Table_Name = "ZZLearnerQCTOSkillsProgramme";

    /** AD_Table_ID=1000297 */
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

    /** Column name ZZAC_ID */
    public static final String COLUMNNAME_ZZAC_ID = "ZZAC_ID";

	/** Set Assessment Centre	  */
	public void setZZAC_ID (int ZZAC_ID);

	/** Get Assessment Centre	  */
	public int getZZAC_ID();

	public I_ZZAssessmentCentre getZZAC() throws RuntimeException;

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

    /** Column name ZZDateEndorsementCreated */
    public static final String COLUMNNAME_ZZDateEndorsementCreated = "ZZDateEndorsementCreated";

	/** Set Date Endorsement Created	  */
	public void setZZDateEndorsementCreated (Timestamp ZZDateEndorsementCreated);

	/** Get Date Endorsement Created	  */
	public Timestamp getZZDateEndorsementCreated();

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

    /** Column name ZZEndorsementCreatedBy */
    public static final String COLUMNNAME_ZZEndorsementCreatedBy = "ZZEndorsementCreatedBy";

	/** Set Endorsement CreatedBy	  */
	public void setZZEndorsementCreatedBy (int ZZEndorsementCreatedBy);

	/** Get Endorsement CreatedBy	  */
	public int getZZEndorsementCreatedBy();

	public org.compiere.model.I_AD_User getZZEndorsementCreate() throws RuntimeException;

    /** Column name ZZEndorsementNumber */
    public static final String COLUMNNAME_ZZEndorsementNumber = "ZZEndorsementNumber";

	/** Set Endorsement Number	  */
	public void setZZEndorsementNumber (String ZZEndorsementNumber);

	/** Get Endorsement Number	  */
	public String getZZEndorsementNumber();

    /** Column name ZZEndorsementPrintingErrorReason */
    public static final String COLUMNNAME_ZZEndorsementPrintingErrorReason = "ZZEndorsementPrintingErrorReason";

	/** Set Endorsement Printing Error Reason	  */
	public void setZZEndorsementPrintingErrorReason (String ZZEndorsementPrintingErrorReason);

	/** Get Endorsement Printing Error Reason	  */
	public String getZZEndorsementPrintingErrorReason();

    /** Column name ZZEndorsementReasonForReprint */
    public static final String COLUMNNAME_ZZEndorsementReasonForReprint = "ZZEndorsementReasonForReprint";

	/** Set Endorsement Reason For Reprint	  */
	public void setZZEndorsementReasonForReprint (String ZZEndorsementReasonForReprint);

	/** Get Endorsement Reason For Reprint	  */
	public String getZZEndorsementReasonForReprint();

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

    /** Column name ZZFinancialYear_ID */
    public static final String COLUMNNAME_ZZFinancialYear_ID = "ZZFinancialYear_ID";

	/** Set Financial Year	  */
	public void setZZFinancialYear_ID (int ZZFinancialYear_ID);

	/** Get Financial Year	  */
	public int getZZFinancialYear_ID();

	public org.compiere.model.I_C_Year getZZFinancialYear() throws RuntimeException;

    /** Column name ZZGrantType_ID */
    public static final String COLUMNNAME_ZZGrantType_ID = "ZZGrantType_ID";

	/** Set Grant Type	  */
	public void setZZGrantType_ID (int ZZGrantType_ID);

	/** Get Grant Type	  */
	public int getZZGrantType_ID();

	public I_ZZGrantType getZZGrantType() throws RuntimeException;

    /** Column name ZZLearnerLP */
    public static final String COLUMNNAME_ZZLearnerLP = "ZZLearnerLP";

	/** Set LearnerLP	  */
	public void setZZLearnerLP (String ZZLearnerLP);

	/** Get LearnerLP	  */
	public String getZZLearnerLP();

    /** Column name ZZLearnerQCTOSkillsProgramme_ID */
    public static final String COLUMNNAME_ZZLearnerQCTOSkillsProgramme_ID = "ZZLearnerQCTOSkillsProgramme_ID";

	/** Set Learner QCTOSkills Programme.
	  * Learner QCTOSkills Programme
	  */
	public void setZZLearnerQCTOSkillsProgramme_ID (int ZZLearnerQCTOSkillsProgramme_ID);

	/** Get Learner QCTOSkills Programme.
	  * Learner QCTOSkills Programme
	  */
	public int getZZLearnerQCTOSkillsProgramme_ID();

    /** Column name ZZLearnerQCTOSkillsProgramme_UU */
    public static final String COLUMNNAME_ZZLearnerQCTOSkillsProgramme_UU = "ZZLearnerQCTOSkillsProgramme_UU";

	/** Set ZZLearnerQCTOSkillsProgramme_UU	  */
	public void setZZLearnerQCTOSkillsProgramme_UU (String ZZLearnerQCTOSkillsProgramme_UU);

	/** Get ZZLearnerQCTOSkillsProgramme_UU	  */
	public String getZZLearnerQCTOSkillsProgramme_UU();

    /** Column name ZZLearner_ID */
    public static final String COLUMNNAME_ZZLearner_ID = "ZZLearner_ID";

	/** Set Learner	  */
	public void setZZLearner_ID (int ZZLearner_ID);

	/** Get Learner	  */
	public int getZZLearner_ID();

	public I_ZZLearner getZZLearner() throws RuntimeException;

    /** Column name ZZMostRecentRegistrationDate */
    public static final String COLUMNNAME_ZZMostRecentRegistrationDate = "ZZMostRecentRegistrationDate";

	/** Set Most Recent Registration Date	  */
	public void setZZMostRecentRegistrationDate (Timestamp ZZMostRecentRegistrationDate);

	/** Get Most Recent Registration Date	  */
	public Timestamp getZZMostRecentRegistrationDate();

    /** Column name ZZProject */
    public static final String COLUMNNAME_ZZProject = "ZZProject";

	/** Set Project	  */
	public void setZZProject (String ZZProject);

	/** Get Project	  */
	public String getZZProject();

    /** Column name ZZQctoProgrammeStatus_ID */
    public static final String COLUMNNAME_ZZQctoProgrammeStatus_ID = "ZZQctoProgrammeStatus_ID";

	/** Set QCTO Programme Status	  */
	public void setZZQctoProgrammeStatus_ID (int ZZQctoProgrammeStatus_ID);

	/** Get QCTO Programme Status	  */
	public int getZZQctoProgrammeStatus_ID();

	public I_ZZQctoProgrammeStatus getZZQctoProgrammeStatus() throws RuntimeException;

    /** Column name ZZQctoSkillsProgrammeReferenceNumber */
    public static final String COLUMNNAME_ZZQctoSkillsProgrammeReferenceNumber = "ZZQctoSkillsProgrammeReferenceNumber";

	/** Set Skills Programme Reference Number	  */
	public void setZZQctoSkillsProgrammeReferenceNumber (String ZZQctoSkillsProgrammeReferenceNumber);

	/** Get Skills Programme Reference Number	  */
	public String getZZQctoSkillsProgrammeReferenceNumber();

    /** Column name ZZQctoSkillsProgramme_ID */
    public static final String COLUMNNAME_ZZQctoSkillsProgramme_ID = "ZZQctoSkillsProgramme_ID";

	/** Set QCTO Skills Programme	  */
	public void setZZQctoSkillsProgramme_ID (int ZZQctoSkillsProgramme_ID);

	/** Get QCTO Skills Programme	  */
	public int getZZQctoSkillsProgramme_ID();

	public I_ZZQctoSkillsProgramme getZZQctoSkillsProgramme() throws RuntimeException;

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

    /** Column name ZZSDProvider_ID */
    public static final String COLUMNNAME_ZZSDProvider_ID = "ZZSDProvider_ID";

	/** Set SDProvider	  */
	public void setZZSDProvider_ID (int ZZSDProvider_ID);

	/** Get SDProvider	  */
	public int getZZSDProvider_ID();

	public I_ZZProvider getZZSDProvider() throws RuntimeException;

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

    /** Column name ZZTerminationDate */
    public static final String COLUMNNAME_ZZTerminationDate = "ZZTerminationDate";

	/** Set Termination Date	  */
	public void setZZTerminationDate (Timestamp ZZTerminationDate);

	/** Get Termination Date	  */
	public Timestamp getZZTerminationDate();

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

    /** Column name ZZTerminationReasonText */
    public static final String COLUMNNAME_ZZTerminationReasonText = "ZZTerminationReasonText";

	/** Set Termination Reason	  */
	public void setZZTerminationReasonText (String ZZTerminationReasonText);

	/** Get Termination Reason	  */
	public String getZZTerminationReasonText();

    /** Column name ZZWA_ID */
    public static final String COLUMNNAME_ZZWA_ID = "ZZWA_ID";

	/** Set Lead Workplace Approval 	  */
	public void setZZWA_ID (int ZZWA_ID);

	/** Get Lead Workplace Approval 	  */
	public int getZZWA_ID();

	public I_ZZWorkplaceApproval getZZWA() throws RuntimeException;

    /** Column name ZZ_DocStatus */
    public static final String COLUMNNAME_ZZ_DocStatus = "ZZ_DocStatus";

	/** Set Document Status	  */
	public void setZZ_DocStatus (String ZZ_DocStatus);

	/** Get Document Status	  */
	public String getZZ_DocStatus();
}
