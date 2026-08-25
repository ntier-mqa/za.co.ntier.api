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

/** Generated Interface for ZZLearnerQCTOLearnership
 *  @author iDempiere (generated) 
 *  @version Release 12
 */
@SuppressWarnings("all")
public interface I_ZZLearnerQCTOLearnership 
{

    /** TableName=ZZLearnerQCTOLearnership */
    public static final String Table_Name = "ZZLearnerQCTOLearnership";

    /** AD_Table_ID=1000300 */
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

    /** Column name Approved_By */
    public static final String COLUMNNAME_Approved_By = "Approved_By";

	/** Set Approved By.
	  * ms_learnerqctoartisans.approvedby (0 of 1230 staged rows populated as of 2026-07-16, added anyway)
	  */
	public void setApproved_By (int Approved_By);

	/** Get Approved By.
	  * ms_learnerqctoartisans.approvedby (0 of 1230 staged rows populated as of 2026-07-16, added anyway)
	  */
	public int getApproved_By();

	public org.compiere.model.I_AD_User getApproved() throws RuntimeException;

    /** Column name Ass_Partner */
    public static final String COLUMNNAME_Ass_Partner = "Ass_Partner";

	/** Set Ass Partner.
	  * ms_learnerqctoartisans.asspartner (free text, e.g. &quot;
MQA&quot;
)
	  */
	public void setAss_Partner (String Ass_Partner);

	/** Get Ass Partner.
	  * ms_learnerqctoartisans.asspartner (free text, e.g. &quot;
MQA&quot;
)
	  */
	public String getAss_Partner();

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

    /** Column name Cur_Reg_Number */
    public static final String COLUMNNAME_Cur_Reg_Number = "Cur_Reg_Number";

	/** Set Cur Reg Number.
	  * ms_learnerqctoartisans.curregnumber (free text registration number)
	  */
	public void setCur_Reg_Number (String Cur_Reg_Number);

	/** Get Cur Reg Number.
	  * ms_learnerqctoartisans.curregnumber (free text registration number)
	  */
	public String getCur_Reg_Number();

    /** Column name Date_Approved */
    public static final String COLUMNNAME_Date_Approved = "Date_Approved";

	/** Set Date Approved.
	  * ms_learnerqctoartisans.dateapproved
	  */
	public void setDate_Approved (Timestamp Date_Approved);

	/** Get Date Approved.
	  * ms_learnerqctoartisans.dateapproved
	  */
	public Timestamp getDate_Approved();

    /** Column name Emp_Contract */
    public static final String COLUMNNAME_Emp_Contract = "Emp_Contract";

	/** Set Emp Contract.
	  * ms_learnerqctoartisans.empcontract (confirmed only 1/2/null across staged data)
	  */
	public void setEmp_Contract (boolean Emp_Contract);

	/** Get Emp Contract.
	  * ms_learnerqctoartisans.empcontract (confirmed only 1/2/null across staged data)
	  */
	public boolean isEmp_Contract();

    /** Column name Emp_Contract_Copy */
    public static final String COLUMNNAME_Emp_Contract_Copy = "Emp_Contract_Copy";

	/** Set Emp Contract Copy.
	  * ms_learnerqctoartisans.empcontractcopy (confirmed only 1/2/null across staged data)
	  */
	public void setEmp_Contract_Copy (boolean Emp_Contract_Copy);

	/** Get Emp Contract Copy.
	  * ms_learnerqctoartisans.empcontractcopy (confirmed only 1/2/null across staged data)
	  */
	public boolean isEmp_Contract_Copy();

    /** Column name Employer_ID */
    public static final String COLUMNNAME_Employer_ID = "Employer_ID";

	/** Set Employer ID.
	  * ms_learnerqctoartisans.employerid, resolved via ms_organisation.sdlnumber = c_bpartner.zz_sdl_no (same as organisationid elsewhere)
	  */
	public void setEmployer_ID (int Employer_ID);

	/** Get Employer ID.
	  * ms_learnerqctoartisans.employerid, resolved via ms_organisation.sdlnumber = c_bpartner.zz_sdl_no (same as organisationid elsewhere)
	  */
	public int getEmployer_ID();

	public org.compiere.model.I_C_BPartner getEmployer() throws RuntimeException;

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

    /** Column name Is_Approved */
    public static final String COLUMNNAME_Is_Approved = "Is_Approved";

	/** Set Is Approved.
	  * ms_learnerqctoartisans.isapproved (0 of 1230 staged rows populated as of 2026-07-16, added anyway)
	  */
	public void setIs_Approved (boolean Is_Approved);

	/** Get Is Approved.
	  * ms_learnerqctoartisans.isapproved (0 of 1230 staged rows populated as of 2026-07-16, added anyway)
	  */
	public boolean is_Approved();

    /** Column name Is_Terms_Employment */
    public static final String COLUMNNAME_Is_Terms_Employment = "Is_Terms_Employment";

	/** Set Is Terms Employment.
	  * ms_learnerqctoartisans.istermsemployment (confirmed only 1/2/null across staged data)
	  */
	public void setIs_Terms_Employment (boolean Is_Terms_Employment);

	/** Get Is Terms Employment.
	  * ms_learnerqctoartisans.istermsemployment (confirmed only 1/2/null across staged data)
	  */
	public boolean is_Terms_Employment();

    /** Column name Learner_Employed */
    public static final String COLUMNNAME_Learner_Employed = "Learner_Employed";

	/** Set Learner Employed.
	  * ms_learnerqctoartisans.learneremployed (free text - mixed dates/numbers/&quot;
never worked&quot;
)
	  */
	public void setLearner_Employed (String Learner_Employed);

	/** Get Learner Employed.
	  * ms_learnerqctoartisans.learneremployed (free text - mixed dates/numbers/&quot;
never worked&quot;
)
	  */
	public String getLearner_Employed();

    /** Column name Namb_Confirmation */
    public static final String COLUMNNAME_Namb_Confirmation = "Namb_Confirmation";

	/** Set Namb Confirmation.
	  * ms_learnerqctoartisans.nambconfirmation (only 1 of 1230 staged rows populated as of 2026-07-16, added anyway)
	  */
	public void setNamb_Confirmation (boolean Namb_Confirmation);

	/** Get Namb Confirmation.
	  * ms_learnerqctoartisans.nambconfirmation (only 1 of 1230 staged rows populated as of 2026-07-16, added anyway)
	  */
	public boolean isNamb_Confirmation();

    /** Column name Namb_Confirmation_Date */
    public static final String COLUMNNAME_Namb_Confirmation_Date = "Namb_Confirmation_Date";

	/** Set Namb Confirmation Date.
	  * ms_learnerqctoartisans.nambconfirmationdate (only 1 of 1230 staged rows populated as of 2026-07-16, added anyway)
	  */
	public void setNamb_Confirmation_Date (Timestamp Namb_Confirmation_Date);

	/** Get Namb Confirmation Date.
	  * ms_learnerqctoartisans.nambconfirmationdate (only 1 of 1230 staged rows populated as of 2026-07-16, added anyway)
	  */
	public Timestamp getNamb_Confirmation_Date();

    /** Column name Namb_Confirmation_User */
    public static final String COLUMNNAME_Namb_Confirmation_User = "Namb_Confirmation_User";

	/** Set Namb Confirmation User.
	  * ms_learnerqctoartisans.nambconfirmationuser (0 of 1230 staged rows populated as of 2026-07-16, added anyway)
	  */
	public void setNamb_Confirmation_User (int Namb_Confirmation_User);

	/** Get Namb Confirmation User.
	  * ms_learnerqctoartisans.nambconfirmationuser (0 of 1230 staged rows populated as of 2026-07-16, added anyway)
	  */
	public int getNamb_Confirmation_User();

	public org.compiere.model.I_AD_User getNamb_Confirmation_U() throws RuntimeException;

    /** Column name Occupation */
    public static final String COLUMNNAME_Occupation = "Occupation";

	/** Set Occupation.
	  * ms_learnerqctoartisans.occupation (OFO-code-looking free text, e.g. &quot;
651302&quot;
 - does NOT match zzlkpofooccupation.Value&#039;
s format, kept as plain text)
	  */
	public void setOccupation (String Occupation);

	/** Get Occupation.
	  * ms_learnerqctoartisans.occupation (OFO-code-looking free text, e.g. &quot;
651302&quot;
 - does NOT match zzlkpofooccupation.Value&#039;
s format, kept as plain text)
	  */
	public String getOccupation();

    /** Column name Previous_Employed */
    public static final String COLUMNNAME_Previous_Employed = "Previous_Employed";

	/** Set Previous Employed.
	  * ms_learnerqctoartisans.previousemployed (confirmed only 1/2/null across staged data)
	  */
	public void setPrevious_Employed (boolean Previous_Employed);

	/** Get Previous Employed.
	  * ms_learnerqctoartisans.previousemployed (confirmed only 1/2/null across staged data)
	  */
	public boolean isPrevious_Employed();

    /** Column name Qcto */
    public static final String COLUMNNAME_Qcto = "Qcto";

	/** Set Qcto.
	  * ms_learnerqctoartisans.qcto (free text, e.g. &quot;
NAMB&quot;
/&quot;
MQA&quot;
)
	  */
	public void setQcto (String Qcto);

	/** Get Qcto.
	  * ms_learnerqctoartisans.qcto (free text, e.g. &quot;
NAMB&quot;
/&quot;
MQA&quot;
)
	  */
	public String getQcto();

    /** Column name Reg_Saqa */
    public static final String COLUMNNAME_Reg_Saqa = "Reg_Saqa";

	/** Set Reg Saqa.
	  * ms_learnerqctoartisans.regsaqa (free text, e.g. &quot;
MQA&quot;
)
	  */
	public void setReg_Saqa (String Reg_Saqa);

	/** Get Reg Saqa.
	  * ms_learnerqctoartisans.regsaqa (free text, e.g. &quot;
MQA&quot;
)
	  */
	public String getReg_Saqa();

    /** Column name Responsible_Seta */
    public static final String COLUMNNAME_Responsible_Seta = "Responsible_Seta";

	/** Set Responsible Seta.
	  * ms_learnerqctoartisans.responsibleseta (free text, e.g. &quot;
MQA&quot;
)
	  */
	public void setResponsible_Seta (String Responsible_Seta);

	/** Get Responsible Seta.
	  * ms_learnerqctoartisans.responsibleseta (free text, e.g. &quot;
MQA&quot;
)
	  */
	public String getResponsible_Seta();

    /** Column name Terms_Employment */
    public static final String COLUMNNAME_Terms_Employment = "Terms_Employment";

	/** Set Terms Employment.
	  * ms_learnerqctoartisans.termsemployment (free text, e.g. &quot;
Contract&quot;
)
	  */
	public void setTerms_Employment (String Terms_Employment);

	/** Get Terms Employment.
	  * ms_learnerqctoartisans.termsemployment (free text, e.g. &quot;
Contract&quot;
)
	  */
	public String getTerms_Employment();

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

    /** Column name WP_Agreement */
    public static final String COLUMNNAME_WP_Agreement = "WP_Agreement";

	/** Set WP Agreement.
	  * ms_learnerqctoartisans.wpagreement (confirmed only 1/2/null across staged data)
	  */
	public void setWP_Agreement (boolean WP_Agreement);

	/** Get WP Agreement.
	  * ms_learnerqctoartisans.wpagreement (confirmed only 1/2/null across staged data)
	  */
	public boolean isWP_Agreement();

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

    /** Column name ZZLearnerQCTOLearnershipType */
    public static final String COLUMNNAME_ZZLearnerQCTOLearnershipType = "ZZLearnerQCTOLearnershipType";

	/** Set Learner QCTOLearnership Type	  */
	public void setZZLearnerQCTOLearnershipType (String ZZLearnerQCTOLearnershipType);

	/** Get Learner QCTOLearnership Type	  */
	public String getZZLearnerQCTOLearnershipType();

    /** Column name ZZLearnerQCTOLearnership_ID */
    public static final String COLUMNNAME_ZZLearnerQCTOLearnership_ID = "ZZLearnerQCTOLearnership_ID";

	/** Set Learner QCTOLearnership.
	  * Learner QCTOLearnership
	  */
	public void setZZLearnerQCTOLearnership_ID (int ZZLearnerQCTOLearnership_ID);

	/** Get Learner QCTOLearnership.
	  * Learner QCTOLearnership
	  */
	public int getZZLearnerQCTOLearnership_ID();

    /** Column name ZZLearnerQCTOLearnership_UU */
    public static final String COLUMNNAME_ZZLearnerQCTOLearnership_UU = "ZZLearnerQCTOLearnership_UU";

	/** Set ZZLearnerQCTOLearnership_UU	  */
	public void setZZLearnerQCTOLearnership_UU (String ZZLearnerQCTOLearnership_UU);

	/** Get ZZLearnerQCTOLearnership_UU	  */
	public String getZZLearnerQCTOLearnership_UU();

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

    /** Column name ZZPreviousQctoLearnership_ID */
    public static final String COLUMNNAME_ZZPreviousQctoLearnership_ID = "ZZPreviousQctoLearnership_ID";

	/** Set Previous QCTOLearnership	  */
	public void setZZPreviousQctoLearnership_ID (int ZZPreviousQctoLearnership_ID);

	/** Get Previous QCTOLearnership	  */
	public int getZZPreviousQctoLearnership_ID();

	public I_ZZQctoLearnership getZZPreviousQctoLearnership() throws RuntimeException;

    /** Column name ZZProject */
    public static final String COLUMNNAME_ZZProject = "ZZProject";

	/** Set Project	  */
	public void setZZProject (String ZZProject);

	/** Get Project	  */
	public String getZZProject();

    /** Column name ZZQctoLearnership_ID */
    public static final String COLUMNNAME_ZZQctoLearnership_ID = "ZZQctoLearnership_ID";

	/** Set QCTO Learnership	  */
	public void setZZQctoLearnership_ID (int ZZQctoLearnership_ID);

	/** Get QCTO Learnership	  */
	public int getZZQctoLearnership_ID();

	public I_ZZQctoLearnership getZZQctoLearnership() throws RuntimeException;

    /** Column name ZZQctoProgrammeStatus_ID */
    public static final String COLUMNNAME_ZZQctoProgrammeStatus_ID = "ZZQctoProgrammeStatus_ID";

	/** Set QCTO Programme Status	  */
	public void setZZQctoProgrammeStatus_ID (int ZZQctoProgrammeStatus_ID);

	/** Get QCTO Programme Status	  */
	public int getZZQctoProgrammeStatus_ID();

	public I_ZZQctoProgrammeStatus getZZQctoProgrammeStatus() throws RuntimeException;

    /** Column name ZZQualificationRequirements */
    public static final String COLUMNNAME_ZZQualificationRequirements = "ZZQualificationRequirements";

	/** Set Qualification Entry Requirements	  */
	public void setZZQualificationRequirements (String ZZQualificationRequirements);

	/** Get Qualification Entry Requirements	  */
	public String getZZQualificationRequirements();

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

    /** Column name ZZ_DocStatus */
    public static final String COLUMNNAME_ZZ_DocStatus = "ZZ_DocStatus";

	/** Set Document Status	  */
	public void setZZ_DocStatus (String ZZ_DocStatus);

	/** Get Document Status	  */
	public String getZZ_DocStatus();
}
