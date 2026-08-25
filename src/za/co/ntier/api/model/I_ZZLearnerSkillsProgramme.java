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

/** Generated Interface for ZZLearnerSkillsProgramme
 *  @author iDempiere (generated) 
 *  @version Release 12
 */
@SuppressWarnings("all")
public interface I_ZZLearnerSkillsProgramme 
{

    /** TableName=ZZLearnerSkillsProgramme */
    public static final String Table_Name = "ZZLearnerSkillsProgramme";

    /** AD_Table_ID=1000373 */
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

    /** Column name ZZLearnerSkillsProgramme_ID */
    public static final String COLUMNNAME_ZZLearnerSkillsProgramme_ID = "ZZLearnerSkillsProgramme_ID";

	/** Set Learner Skills Programme	  */
	public void setZZLearnerSkillsProgramme_ID (int ZZLearnerSkillsProgramme_ID);

	/** Get Learner Skills Programme	  */
	public int getZZLearnerSkillsProgramme_ID();

    /** Column name ZZLearnerSkillsProgramme_UU */
    public static final String COLUMNNAME_ZZLearnerSkillsProgramme_UU = "ZZLearnerSkillsProgramme_UU";

	/** Set Learner Skills Programme UU	  */
	public void setZZLearnerSkillsProgramme_UU (String ZZLearnerSkillsProgramme_UU);

	/** Get Learner Skills Programme UU	  */
	public String getZZLearnerSkillsProgramme_UU();

    /** Column name ZZLearner_ID */
    public static final String COLUMNNAME_ZZLearner_ID = "ZZLearner_ID";

	/** Set Learner	  */
	public void setZZLearner_ID (int ZZLearner_ID);

	/** Get Learner	  */
	public int getZZLearner_ID();

	public I_ZZLearner getZZLearner() throws RuntimeException;

    /** Column name ZZSeta */
    public static final String COLUMNNAME_ZZSeta = "ZZSeta";

	/** Set SETA	  */
	public void setZZSeta (String ZZSeta);

	/** Get SETA	  */
	public String getZZSeta();

    /** Column name ZZSkillsProgramme_ID */
    public static final String COLUMNNAME_ZZSkillsProgramme_ID = "ZZSkillsProgramme_ID";

	/** Set Skills Programme	  */
	public void setZZSkillsProgramme_ID (int ZZSkillsProgramme_ID);

	/** Get Skills Programme	  */
	public int getZZSkillsProgramme_ID();

	public I_ZZSkillsProgramme getZZSkillsProgramme() throws RuntimeException;

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
