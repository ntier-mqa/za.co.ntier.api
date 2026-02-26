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

/** Generated Interface for ZZSdfOrganisation_v
 *  @author iDempiere (generated) 
 *  @version Release 12
 */
@SuppressWarnings("all")
public interface I_ZZSdfOrganisation_v 
{

    /** TableName=ZZSdfOrganisation_v */
    public static final String Table_Name = "ZZSdfOrganisation_v";

    /** AD_Table_ID=1000154 */
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

    /** Column name AD_User_ID */
    public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";

	/** Set User/Contact.
	  * User within the system - Internal or Business Partner Contact
	  */
	public void setAD_User_ID (int AD_User_ID);

	/** Get User/Contact.
	  * User within the system - Internal or Business Partner Contact
	  */
	public int getAD_User_ID();

	public org.compiere.model.I_AD_User getAD_User() throws RuntimeException;

    /** Column name C_BPartner_ID */
    public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";

	/** Set Business Partner.
	  * Identifies a Business Partner
	  */
	public void setC_BPartner_ID (int C_BPartner_ID);

	/** Get Business Partner.
	  * Identifies a Business Partner
	  */
	public int getC_BPartner_ID();

	public org.compiere.model.I_C_BPartner getC_BPartner() throws RuntimeException;

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

    /** Column name DocumentNo */
    public static final String COLUMNNAME_DocumentNo = "DocumentNo";

	/** Set Document No.
	  * Document sequence number of the document
	  */
	public void setDocumentNo (String DocumentNo);

	/** Get Document No.
	  * Document sequence number of the document
	  */
	public String getDocumentNo();

    /** Column name EMail */
    public static final String COLUMNNAME_EMail = "EMail";

	/** Set EMail Address.
	  * Electronic Mail Address
	  */
	public void setEMail (String EMail);

	/** Get EMail Address.
	  * Electronic Mail Address
	  */
	public String getEMail();

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

    /** Column name OrgName */
    public static final String COLUMNNAME_OrgName = "OrgName";

	/** Set Organization Name.
	  * Name of the Organization
	  */
	public void setOrgName (String OrgName);

	/** Get Organization Name.
	  * Name of the Organization
	  */
	public String getOrgName();

    /** Column name Phone */
    public static final String COLUMNNAME_Phone = "Phone";

	/** Set Phone.
	  * Identifies a telephone number
	  */
	public void setPhone (String Phone);

	/** Get Phone.
	  * Identifies a telephone number
	  */
	public String getPhone();

    /** Column name Phone2 */
    public static final String COLUMNNAME_Phone2 = "Phone2";

	/** Set 2nd Phone.
	  * Identifies an alternate telephone number.
	  */
	public void setPhone2 (String Phone2);

	/** Get 2nd Phone.
	  * Identifies an alternate telephone number.
	  */
	public String getPhone2();

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

    /** Column name ZZAccreditedTrainingProvider */
    public static final String COLUMNNAME_ZZAccreditedTrainingProvider = "ZZAccreditedTrainingProvider";

	/** Set Accredited Training Provider	  */
	public void setZZAccreditedTrainingProvider (String ZZAccreditedTrainingProvider);

	/** Get Accredited Training Provider	  */
	public String getZZAccreditedTrainingProvider();

    /** Column name ZZActingForEmployer */
    public static final String COLUMNNAME_ZZActingForEmployer = "ZZActingForEmployer";

	/** Set Acting For Employer.
	  * Consultant acting for Employer?
	  */
	public void setZZActingForEmployer (boolean ZZActingForEmployer);

	/** Get Acting For Employer.
	  * Consultant acting for Employer?
	  */
	public boolean isZZActingForEmployer();

    /** Column name ZZAppointmentProcedure */
    public static final String COLUMNNAME_ZZAppointmentProcedure = "ZZAppointmentProcedure";

	/** Set Appointment Procedure.
	  * Please indicate method of appointment to SDF position
	  */
	public void setZZAppointmentProcedure (String ZZAppointmentProcedure);

	/** Get Appointment Procedure.
	  * Please indicate method of appointment to SDF position
	  */
	public String getZZAppointmentProcedure();

    /** Column name ZZCurrentOccupation */
    public static final String COLUMNNAME_ZZCurrentOccupation = "ZZCurrentOccupation";

	/** Set Current Occupation	  */
	public void setZZCurrentOccupation (String ZZCurrentOccupation);

	/** Get Current Occupation	  */
	public String getZZCurrentOccupation();

    /** Column name ZZExperience */
    public static final String COLUMNNAME_ZZExperience = "ZZExperience";

	/** Set Experience (Years)	  */
	public void setZZExperience (int ZZExperience);

	/** Get Experience (Years)	  */
	public int getZZExperience();

    /** Column name ZZFirstName */
    public static final String COLUMNNAME_ZZFirstName = "ZZFirstName";

	/** Set First Name	  */
	public void setZZFirstName (String ZZFirstName);

	/** Get First Name	  */
	public String getZZFirstName();

    /** Column name ZZHighestEducationDesc */
    public static final String COLUMNNAME_ZZHighestEducationDesc = "ZZHighestEducationDesc";

	/** Set Highest Education Description	  */
	public void setZZHighestEducationDesc (String ZZHighestEducationDesc);

	/** Get Highest Education Description	  */
	public String getZZHighestEducationDesc();

    /** Column name ZZMiddleName */
    public static final String COLUMNNAME_ZZMiddleName = "ZZMiddleName";

	/** Set Middle Name	  */
	public void setZZMiddleName (String ZZMiddleName);

	/** Get Middle Name	  */
	public String getZZMiddleName();

    /** Column name ZZSdfFunction */
    public static final String COLUMNNAME_ZZSdfFunction = "ZZSdfFunction";

	/** Set Sdf Function.
	  * Will you perform your SDF function in respect of
	  */
	public void setZZSdfFunction (String ZZSdfFunction);

	/** Get Sdf Function.
	  * Will you perform your SDF function in respect of
	  */
	public String getZZSdfFunction();

    /** Column name ZZSdfOrganisation_ID */
    public static final String COLUMNNAME_ZZSdfOrganisation_ID = "ZZSdfOrganisation_ID";

	/** Set SDF Organisation.
	  * Link Organisation And SDF
	  */
	public void setZZSdfOrganisation_ID (int ZZSdfOrganisation_ID);

	/** Get SDF Organisation.
	  * Link Organisation And SDF
	  */
	public int getZZSdfOrganisation_ID();

	public I_ZZSdfOrganisation getZZSdfOrganisation() throws RuntimeException;

    /** Column name ZZSdfOrganisation_v_ID */
    public static final String COLUMNNAME_ZZSdfOrganisation_v_ID = "ZZSdfOrganisation_v_ID";

	/** Set Sdf Organisation View	  */
	public void setZZSdfOrganisation_v_ID (int ZZSdfOrganisation_v_ID);

	/** Get Sdf Organisation View	  */
	public int getZZSdfOrganisation_v_ID();

    /** Column name ZZSdfOrganisation_v_UU */
    public static final String COLUMNNAME_ZZSdfOrganisation_v_UU = "ZZSdfOrganisation_v_UU";

	/** Set Sdf Organisation View UU	  */
	public void setZZSdfOrganisation_v_UU (String ZZSdfOrganisation_v_UU);

	/** Get Sdf Organisation View UU	  */
	public String getZZSdfOrganisation_v_UU();

    /** Column name ZZSdfRoleType */
    public static final String COLUMNNAME_ZZSdfRoleType = "ZZSdfRoleType";

	/** Set Sdf Role Type	  */
	public void setZZSdfRoleType (String ZZSdfRoleType);

	/** Get Sdf Role Type	  */
	public String getZZSdfRoleType();

    /** Column name ZZSurname */
    public static final String COLUMNNAME_ZZSurname = "ZZSurname";

	/** Set Surname	  */
	public void setZZSurname (String ZZSurname);

	/** Get Surname	  */
	public String getZZSurname();

    /** Column name ZZYearsInOccupation */
    public static final String COLUMNNAME_ZZYearsInOccupation = "ZZYearsInOccupation";

	/** Set Years In Occupation	  */
	public void setZZYearsInOccupation (int ZZYearsInOccupation);

	/** Get Years In Occupation	  */
	public int getZZYearsInOccupation();

    /** Column name ZZ_Approved_ID */
    public static final String COLUMNNAME_ZZ_Approved_ID = "ZZ_Approved_ID";

	/** Set Approved By	  */
	public void setZZ_Approved_ID (int ZZ_Approved_ID);

	/** Get Approved By	  */
	public int getZZ_Approved_ID();

	public org.compiere.model.I_AD_User getZZ_Approved() throws RuntimeException;

    /** Column name ZZ_Date_Approved */
    public static final String COLUMNNAME_ZZ_Date_Approved = "ZZ_Date_Approved";

	/** Set Date Approved	  */
	public void setZZ_Date_Approved (Timestamp ZZ_Date_Approved);

	/** Get Date Approved	  */
	public Timestamp getZZ_Date_Approved();

    /** Column name ZZ_Date_Rejected */
    public static final String COLUMNNAME_ZZ_Date_Rejected = "ZZ_Date_Rejected";

	/** Set Date Rejected	  */
	public void setZZ_Date_Rejected (Timestamp ZZ_Date_Rejected);

	/** Get Date Rejected	  */
	public Timestamp getZZ_Date_Rejected();

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

    /** Column name ZZ_ID_Passport_No */
    public static final String COLUMNNAME_ZZ_ID_Passport_No = "ZZ_ID_Passport_No";

	/** Set ID No	  */
	public void setZZ_ID_Passport_No (String ZZ_ID_Passport_No);

	/** Get ID No	  */
	public String getZZ_ID_Passport_No();

    /** Column name ZZ_LI_HighestEducation_ID */
    public static final String COLUMNNAME_ZZ_LI_HighestEducation_ID = "ZZ_LI_HighestEducation_ID";

	/** Set Highest Education	  */
	public void setZZ_LI_HighestEducation_ID (int ZZ_LI_HighestEducation_ID);

	/** Get Highest Education	  */
	public int getZZ_LI_HighestEducation_ID();

	public I_ZZ_LI_HighestEducation getZZ_LI_HighestEducation() throws RuntimeException;

    /** Column name ZZ_Rejected_ID */
    public static final String COLUMNNAME_ZZ_Rejected_ID = "ZZ_Rejected_ID";

	/** Set Rejected ID	  */
	public void setZZ_Rejected_ID (int ZZ_Rejected_ID);

	/** Get Rejected ID	  */
	public int getZZ_Rejected_ID();

	public org.compiere.model.I_AD_User getZZ_Rejected() throws RuntimeException;

    /** Column name ZZ_SDL_No */
    public static final String COLUMNNAME_ZZ_SDL_No = "ZZ_SDL_No";

	/** Set SDL Number	  */
	public void setZZ_SDL_No (String ZZ_SDL_No);

	/** Get SDL Number	  */
	public String getZZ_SDL_No();
}
