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

/** Generated Interface for ZZLearnerDGProgramme
 *  @author iDempiere (generated) 
 *  @version Release 12
 */
@SuppressWarnings("all")
public interface I_ZZLearnerDGProgramme 
{

    /** TableName=ZZLearnerDGProgramme */
    public static final String Table_Name = "ZZLearnerDGProgramme";

    /** AD_Table_ID=1000394 */
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

    /** Column name ReferenceNo */
    public static final String COLUMNNAME_ReferenceNo = "ReferenceNo";

	/** Set Reference No.
	  * Your customer or vendor number at the Business Partner&#039;
s site
	  */
	public void setReferenceNo (String ReferenceNo);

	/** Get Reference No.
	  * Your customer or vendor number at the Business Partner&#039;
s site
	  */
	public String getReferenceNo();

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

    /** Column name ZZFinancialYear_ID */
    public static final String COLUMNNAME_ZZFinancialYear_ID = "ZZFinancialYear_ID";

	/** Set Financial Year	  */
	public void setZZFinancialYear_ID (int ZZFinancialYear_ID);

	/** Get Financial Year	  */
	public int getZZFinancialYear_ID();

	public org.compiere.model.I_C_Year getZZFinancialYear() throws RuntimeException;

    /** Column name ZZFundingType */
    public static final String COLUMNNAME_ZZFundingType = "ZZFundingType";

	/** Set Funding Type	  */
	public void setZZFundingType (String ZZFundingType);

	/** Get Funding Type	  */
	public String getZZFundingType();

    /** Column name ZZLeadSDProviderContact_ID */
    public static final String COLUMNNAME_ZZLeadSDProviderContact_ID = "ZZLeadSDProviderContact_ID";

	/** Set Lead SDP Contact	  */
	public void setZZLeadSDProviderContact_ID (int ZZLeadSDProviderContact_ID);

	/** Get Lead SDP Contact	  */
	public int getZZLeadSDProviderContact_ID();

	public org.compiere.model.I_AD_User getZZLeadSDProviderContact() throws RuntimeException;

    /** Column name ZZLeadSDProviderLevy */
    public static final String COLUMNNAME_ZZLeadSDProviderLevy = "ZZLeadSDProviderLevy";

	/** Set Lead SDP Skills Levy	  */
	public void setZZLeadSDProviderLevy (String ZZLeadSDProviderLevy);

	/** Get Lead SDP Skills Levy	  */
	public String getZZLeadSDProviderLevy();

    /** Column name ZZLearnerDGProgramme_ID */
    public static final String COLUMNNAME_ZZLearnerDGProgramme_ID = "ZZLearnerDGProgramme_ID";

	/** Set DG Programme	  */
	public void setZZLearnerDGProgramme_ID (int ZZLearnerDGProgramme_ID);

	/** Get DG Programme	  */
	public int getZZLearnerDGProgramme_ID();

    /** Column name ZZLearnerDGProgramme_UU */
    public static final String COLUMNNAME_ZZLearnerDGProgramme_UU = "ZZLearnerDGProgramme_UU";

	/** Set ZZLearnerDGProgramme_UU	  */
	public void setZZLearnerDGProgramme_UU (String ZZLearnerDGProgramme_UU);

	/** Get ZZLearnerDGProgramme_UU	  */
	public String getZZLearnerDGProgramme_UU();

    /** Column name ZZLearner_ID */
    public static final String COLUMNNAME_ZZLearner_ID = "ZZLearner_ID";

	/** Set Learner	  */
	public void setZZLearner_ID (int ZZLearner_ID);

	/** Get Learner	  */
	public int getZZLearner_ID();

	public I_ZZLearner getZZLearner() throws RuntimeException;

    /** Column name ZZNotRegisteredBy */
    public static final String COLUMNNAME_ZZNotRegisteredBy = "ZZNotRegisteredBy";

	/** Set Not Registered By	  */
	public void setZZNotRegisteredBy (int ZZNotRegisteredBy);

	/** Get Not Registered By	  */
	public int getZZNotRegisteredBy();

	public org.compiere.model.I_AD_User getZZNotRegistere() throws RuntimeException;

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

    /** Column name ZZSecondarySDProviderContact_ID */
    public static final String COLUMNNAME_ZZSecondarySDProviderContact_ID = "ZZSecondarySDProviderContact_ID";

	/** Set Secondary SDP Contact	  */
	public void setZZSecondarySDProviderContact_ID (int ZZSecondarySDProviderContact_ID);

	/** Get Secondary SDP Contact	  */
	public int getZZSecondarySDProviderContact_ID();

    /** Column name ZZSecondarySDProviderLevy */
    public static final String COLUMNNAME_ZZSecondarySDProviderLevy = "ZZSecondarySDProviderLevy";

	/** Set Secondary SDP Skills Levy	  */
	public void setZZSecondarySDProviderLevy (String ZZSecondarySDProviderLevy);

	/** Get Secondary SDP Skills Levy	  */
	public String getZZSecondarySDProviderLevy();

    /** Column name ZZSecondarySDProvider_ID */
    public static final String COLUMNNAME_ZZSecondarySDProvider_ID = "ZZSecondarySDProvider_ID";

	/** Set Secondary Skills Development Provider	  */
	public void setZZSecondarySDProvider_ID (int ZZSecondarySDProvider_ID);

	/** Get Secondary Skills Development Provider	  */
	public int getZZSecondarySDProvider_ID();

	public org.compiere.model.I_C_BPartner getZZSecondarySDProvider() throws RuntimeException;

    /** Column name ZZSecondaryWAContact_ID */
    public static final String COLUMNNAME_ZZSecondaryWAContact_ID = "ZZSecondaryWAContact_ID";

	/** Set Secondary Workplace Approval Contact	  */
	public void setZZSecondaryWAContact_ID (int ZZSecondaryWAContact_ID);

	/** Get Secondary Workplace Approval Contact	  */
	public int getZZSecondaryWAContact_ID();

    /** Column name ZZSecondaryWALevy */
    public static final String COLUMNNAME_ZZSecondaryWALevy = "ZZSecondaryWALevy";

	/** Set Secondary Workplace Approval Skills Levy	  */
	public void setZZSecondaryWALevy (String ZZSecondaryWALevy);

	/** Get Secondary Workplace Approval Skills Levy	  */
	public String getZZSecondaryWALevy();

    /** Column name ZZSecondaryWA_ID */
    public static final String COLUMNNAME_ZZSecondaryWA_ID = "ZZSecondaryWA_ID";

	/** Set Secondary Workplace Approval	  */
	public void setZZSecondaryWA_ID (int ZZSecondaryWA_ID);

	/** Get Secondary Workplace Approval	  */
	public int getZZSecondaryWA_ID();

	public org.compiere.model.I_C_BPartner getZZSecondaryWA() throws RuntimeException;

    /** Column name ZZSocioEconomicStatus */
    public static final String COLUMNNAME_ZZSocioEconomicStatus = "ZZSocioEconomicStatus";

	/** Set Socio Economic Status	  */
	public void setZZSocioEconomicStatus (String ZZSocioEconomicStatus);

	/** Get Socio Economic Status	  */
	public String getZZSocioEconomicStatus();

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

    /** Column name ZZWAContact_ID */
    public static final String COLUMNNAME_ZZWAContact_ID = "ZZWAContact_ID";

	/** Set Lead Workplace Approval Contact	  */
	public void setZZWAContact_ID (int ZZWAContact_ID);

	/** Get Lead Workplace Approval Contact	  */
	public int getZZWAContact_ID();

	public org.compiere.model.I_AD_User getZZWAContact() throws RuntimeException;

    /** Column name ZZWALevy */
    public static final String COLUMNNAME_ZZWALevy = "ZZWALevy";

	/** Set Lead Workplace Approval Skills Levy	  */
	public void setZZWALevy (String ZZWALevy);

	/** Get Lead Workplace Approval Skills Levy	  */
	public String getZZWALevy();

    /** Column name ZZ_AdminLPOps_DateNotRecommended */
    public static final String COLUMNNAME_ZZ_AdminLPOps_DateNotRecommended = "ZZ_AdminLPOps_DateNotRecommended";

	/** Set Admin - LP Ops Date Not Recommended	  */
	public void setZZ_AdminLPOps_DateNotRecommended (Timestamp ZZ_AdminLPOps_DateNotRecommended);

	/** Get Admin - LP Ops Date Not Recommended	  */
	public Timestamp getZZ_AdminLPOps_DateNotRecommended();

    /** Column name ZZ_AdminLPOps_DateRecommended */
    public static final String COLUMNNAME_ZZ_AdminLPOps_DateRecommended = "ZZ_AdminLPOps_DateRecommended";

	/** Set Admin - LP Ops Date Recommended	  */
	public void setZZ_AdminLPOps_DateRecommended (Timestamp ZZ_AdminLPOps_DateRecommended);

	/** Get Admin - LP Ops Date Recommended	  */
	public Timestamp getZZ_AdminLPOps_DateRecommended();

    /** Column name ZZ_AdminLPOps_NotRecommendedBy_ID */
    public static final String COLUMNNAME_ZZ_AdminLPOps_NotRecommendedBy_ID = "ZZ_AdminLPOps_NotRecommendedBy_ID";

	/** Set Admin - LP Ops Not Recommended By	  */
	public void setZZ_AdminLPOps_NotRecommendedBy_ID (int ZZ_AdminLPOps_NotRecommendedBy_ID);

	/** Get Admin - LP Ops Not Recommended By	  */
	public int getZZ_AdminLPOps_NotRecommendedBy_ID();

	public org.compiere.model.I_AD_User getZZ_AdminLPOps_NotRecommendedBy() throws RuntimeException;

    /** Column name ZZ_AdminLPOps_RecommendedBy_ID */
    public static final String COLUMNNAME_ZZ_AdminLPOps_RecommendedBy_ID = "ZZ_AdminLPOps_RecommendedBy_ID";

	/** Set Admin - LP Ops Recommended By	  */
	public void setZZ_AdminLPOps_RecommendedBy_ID (int ZZ_AdminLPOps_RecommendedBy_ID);

	/** Get Admin - LP Ops Recommended By	  */
	public int getZZ_AdminLPOps_RecommendedBy_ID();

	public org.compiere.model.I_AD_User getZZ_AdminLPOps_RecommendedBy() throws RuntimeException;

    /** Column name ZZ_DateNotRegistered */
    public static final String COLUMNNAME_ZZ_DateNotRegistered = "ZZ_DateNotRegistered";

	/** Set Date Not Registered	  */
	public void setZZ_DateNotRegistered (Timestamp ZZ_DateNotRegistered);

	/** Get Date Not Registered	  */
	public Timestamp getZZ_DateNotRegistered();

    /** Column name ZZ_DateRegistered */
    public static final String COLUMNNAME_ZZ_DateRegistered = "ZZ_DateRegistered";

	/** Set Date Registered	  */
	public void setZZ_DateRegistered (Timestamp ZZ_DateRegistered);

	/** Get Date Registered	  */
	public Timestamp getZZ_DateRegistered();

    /** Column name ZZ_DocAction */
    public static final String COLUMNNAME_ZZ_DocAction = "ZZ_DocAction";

	/** Set Document Action	  */
	public void setZZ_DocAction (String ZZ_DocAction);

	/** Get Document Action	  */
	public String getZZ_DocAction();

    /** Column name ZZ_DocStatus */
    public static final String COLUMNNAME_ZZ_DocStatus = "ZZ_DocStatus";

	/** Set Document Status	  */
	public void setZZ_DocStatus (String ZZ_DocStatus);

	/** Get Document Status	  */
	public String getZZ_DocStatus();

    /** Column name ZZ_Employer_ID */
    public static final String COLUMNNAME_ZZ_Employer_ID = "ZZ_Employer_ID";

	/** Set Employer.
	  * Lead Workplace Approval
	  */
	public void setZZ_Employer_ID (int ZZ_Employer_ID);

	/** Get Employer.
	  * Lead Workplace Approval
	  */
	public int getZZ_Employer_ID();

	public org.compiere.model.I_C_BPartner getZZ_Employer() throws RuntimeException;

    /** Column name ZZ_MgrLPOps_DateNotRecommended */
    public static final String COLUMNNAME_ZZ_MgrLPOps_DateNotRecommended = "ZZ_MgrLPOps_DateNotRecommended";

	/** Set Mgr - LP Ops Date Not Recommended	  */
	public void setZZ_MgrLPOps_DateNotRecommended (Timestamp ZZ_MgrLPOps_DateNotRecommended);

	/** Get Mgr - LP Ops Date Not Recommended	  */
	public Timestamp getZZ_MgrLPOps_DateNotRecommended();

    /** Column name ZZ_MgrLPOps_DateRecommended */
    public static final String COLUMNNAME_ZZ_MgrLPOps_DateRecommended = "ZZ_MgrLPOps_DateRecommended";

	/** Set Mgr - LP Ops Date Recommended	  */
	public void setZZ_MgrLPOps_DateRecommended (Timestamp ZZ_MgrLPOps_DateRecommended);

	/** Get Mgr - LP Ops Date Recommended	  */
	public Timestamp getZZ_MgrLPOps_DateRecommended();

    /** Column name ZZ_MgrLPOps_NotRecommendedBy_ID */
    public static final String COLUMNNAME_ZZ_MgrLPOps_NotRecommendedBy_ID = "ZZ_MgrLPOps_NotRecommendedBy_ID";

	/** Set Mgr - LP Ops Not Recommended By	  */
	public void setZZ_MgrLPOps_NotRecommendedBy_ID (int ZZ_MgrLPOps_NotRecommendedBy_ID);

	/** Get Mgr - LP Ops Not Recommended By	  */
	public int getZZ_MgrLPOps_NotRecommendedBy_ID();

	public org.compiere.model.I_AD_User getZZ_MgrLPOps_NotRecommendedBy() throws RuntimeException;

    /** Column name ZZ_MgrLPOps_RecommendedBy_ID */
    public static final String COLUMNNAME_ZZ_MgrLPOps_RecommendedBy_ID = "ZZ_MgrLPOps_RecommendedBy_ID";

	/** Set Mgr - LP Ops Recommended By	  */
	public void setZZ_MgrLPOps_RecommendedBy_ID (int ZZ_MgrLPOps_RecommendedBy_ID);

	/** Get Mgr - LP Ops Recommended By	  */
	public int getZZ_MgrLPOps_RecommendedBy_ID();

	public org.compiere.model.I_AD_User getZZ_MgrLPOps_RecommendedBy() throws RuntimeException;

    /** Column name ZZ_Program_Master_Data_ID */
    public static final String COLUMNNAME_ZZ_Program_Master_Data_ID = "ZZ_Program_Master_Data_ID";

	/** Set Program Master Data	  */
	public void setZZ_Program_Master_Data_ID (int ZZ_Program_Master_Data_ID);

	/** Get Program Master Data	  */
	public int getZZ_Program_Master_Data_ID();

    /** Column name ZZ_Reason */
    public static final String COLUMNNAME_ZZ_Reason = "ZZ_Reason";

	/** Set Reason	  */
	public void setZZ_Reason (String ZZ_Reason);

	/** Get Reason	  */
	public String getZZ_Reason();

    /** Column name ZZ_SDP_ID */
    public static final String COLUMNNAME_ZZ_SDP_ID = "ZZ_SDP_ID";

	/** Set SDP.
	  * Lead Skills Development Provider
	  */
	public void setZZ_SDP_ID (int ZZ_SDP_ID);

	/** Get SDP.
	  * Lead Skills Development Provider
	  */
	public int getZZ_SDP_ID();

	public org.compiere.model.I_C_BPartner getZZ_SDP() throws RuntimeException;
}
