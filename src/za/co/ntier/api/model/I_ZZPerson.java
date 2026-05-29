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

/** Generated Interface for ZZPerson
 *  @author iDempiere (generated) 
 *  @version Release 12
 */
@SuppressWarnings("all")
public interface I_ZZPerson 
{

    /** TableName=ZZPerson */
    public static final String Table_Name = "ZZPerson";

    /** AD_Table_ID=1000258 */
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

    /** Column name Birthday */
    public static final String COLUMNNAME_Birthday = "Birthday";

	/** Set Birthday.
	  * Birthday or Anniversary day
	  */
	public void setBirthday (Timestamp Birthday);

	/** Get Birthday.
	  * Birthday or Anniversary day
	  */
	public Timestamp getBirthday();

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

    /** Column name Fax */
    public static final String COLUMNNAME_Fax = "Fax";

	/** Set Fax.
	  * Facsimile number
	  */
	public void setFax (String Fax);

	/** Get Fax.
	  * Facsimile number
	  */
	public String getFax();

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

    /** Column name Surname */
    public static final String COLUMNNAME_Surname = "Surname";

	/** Set Surname	  */
	public void setSurname (String Surname);

	/** Get Surname	  */
	public String getSurname();

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

    /** Column name ZZCVFileName */
    public static final String COLUMNNAME_ZZCVFileName = "ZZCVFileName";

	/** Set CV File Name	  */
	public void setZZCVFileName (String ZZCVFileName);

	/** Get CV File Name	  */
	public String getZZCVFileName();

    /** Column name ZZCurrentOccupation */
    public static final String COLUMNNAME_ZZCurrentOccupation = "ZZCurrentOccupation";

	/** Set Current Occupation	  */
	public void setZZCurrentOccupation (String ZZCurrentOccupation);

	/** Get Current Occupation	  */
	public String getZZCurrentOccupation();

    /** Column name ZZEquity */
    public static final String COLUMNNAME_ZZEquity = "ZZEquity";

	/** Set Equity	  */
	public void setZZEquity (String ZZEquity);

	/** Get Equity	  */
	public String getZZEquity();

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

    /** Column name ZZGender */
    public static final String COLUMNNAME_ZZGender = "ZZGender";

	/** Set Gender	  */
	public void setZZGender (String ZZGender);

	/** Get Gender	  */
	public String getZZGender();

    /** Column name ZZHealthCommunicating */
    public static final String COLUMNNAME_ZZHealthCommunicating = "ZZHealthCommunicating";

	/** Set Communicating.
	  * Health Function Communicating
	  */
	public void setZZHealthCommunicating (String ZZHealthCommunicating);

	/** Get Communicating.
	  * Health Function Communicating
	  */
	public String getZZHealthCommunicating();

    /** Column name ZZHealthHearing */
    public static final String COLUMNNAME_ZZHealthHearing = "ZZHealthHearing";

	/** Set Hearing.
	  * Health Function Hearing
	  */
	public void setZZHealthHearing (String ZZHealthHearing);

	/** Get Hearing.
	  * Health Function Hearing
	  */
	public String getZZHealthHearing();

    /** Column name ZZHealthRemembering */
    public static final String COLUMNNAME_ZZHealthRemembering = "ZZHealthRemembering";

	/** Set Remembering.
	  * Health Function Remembering
	  */
	public void setZZHealthRemembering (String ZZHealthRemembering);

	/** Get Remembering.
	  * Health Function Remembering
	  */
	public String getZZHealthRemembering();

    /** Column name ZZHealthSeeing */
    public static final String COLUMNNAME_ZZHealthSeeing = "ZZHealthSeeing";

	/** Set Seeing.
	  * Health Function Seeing
	  */
	public void setZZHealthSeeing (String ZZHealthSeeing);

	/** Get Seeing.
	  * Health Function Seeing
	  */
	public String getZZHealthSeeing();

    /** Column name ZZHealthSelfcare */
    public static final String COLUMNNAME_ZZHealthSelfcare = "ZZHealthSelfcare";

	/** Set Selfcare.
	  * Health Function Selfcare
	  */
	public void setZZHealthSelfcare (String ZZHealthSelfcare);

	/** Get Selfcare.
	  * Health Function Selfcare
	  */
	public String getZZHealthSelfcare();

    /** Column name ZZHealthWalking */
    public static final String COLUMNNAME_ZZHealthWalking = "ZZHealthWalking";

	/** Set Walking.
	  * Health Function Walking
	  */
	public void setZZHealthWalking (String ZZHealthWalking);

	/** Get Walking.
	  * Health Function Walking
	  */
	public String getZZHealthWalking();

    /** Column name ZZInitials */
    public static final String COLUMNNAME_ZZInitials = "ZZInitials";

	/** Set Initials	  */
	public void setZZInitials (String ZZInitials);

	/** Get Initials	  */
	public String getZZInitials();

    /** Column name ZZLastSchoolYear */
    public static final String COLUMNNAME_ZZLastSchoolYear = "ZZLastSchoolYear";

	/** Set Last School Year	  */
	public void setZZLastSchoolYear (int ZZLastSchoolYear);

	/** Get Last School Year	  */
	public int getZZLastSchoolYear();

    /** Column name ZZLkpSchoolEmis_ID */
    public static final String COLUMNNAME_ZZLkpSchoolEmis_ID = "ZZLkpSchoolEmis_ID";

	/** Set School EMIS	  */
	public void setZZLkpSchoolEmis_ID (int ZZLkpSchoolEmis_ID);

	/** Get School EMIS	  */
	public int getZZLkpSchoolEmis_ID();

    /** Column name ZZLkpStatssaAreaCode_ID */
    public static final String COLUMNNAME_ZZLkpStatssaAreaCode_ID = "ZZLkpStatssaAreaCode_ID";

	/** Set STATSSA Area Code	  */
	public void setZZLkpStatssaAreaCode_ID (int ZZLkpStatssaAreaCode_ID);

	/** Get STATSSA Area Code	  */
	public int getZZLkpStatssaAreaCode_ID();

    /** Column name ZZLkpTitle */
    public static final String COLUMNNAME_ZZLkpTitle = "ZZLkpTitle";

	/** Set Title.
	  * Lkp Title
	  */
	public void setZZLkpTitle (String ZZLkpTitle);

	/** Get Title.
	  * Lkp Title
	  */
	public String getZZLkpTitle();

    /** Column name ZZMiddleName */
    public static final String COLUMNNAME_ZZMiddleName = "ZZMiddleName";

	/** Set Middle Name	  */
	public void setZZMiddleName (String ZZMiddleName);

	/** Get Middle Name	  */
	public String getZZMiddleName();

    /** Column name ZZMigrationCode */
    public static final String COLUMNNAME_ZZMigrationCode = "ZZMigrationCode";

	/** Set Migration Code	  */
	public void setZZMigrationCode (int ZZMigrationCode);

	/** Get Migration Code	  */
	public int getZZMigrationCode();

    /** Column name ZZOtherIDNo */
    public static final String COLUMNNAME_ZZOtherIDNo = "ZZOtherIDNo";

	/** Set Other ID No.
	  * RSA Id store at ZZ_ID_Passport_No remain tyoe of id store at ZZOtherIDNo
	  */
	public void setZZOtherIDNo (String ZZOtherIDNo);

	/** Get Other ID No.
	  * RSA Id store at ZZ_ID_Passport_No remain tyoe of id store at ZZOtherIDNo
	  */
	public String getZZOtherIDNo();

    /** Column name ZZPerson_ID */
    public static final String COLUMNNAME_ZZPerson_ID = "ZZPerson_ID";

	/** Set Person	  */
	public void setZZPerson_ID (int ZZPerson_ID);

	/** Get Person	  */
	public int getZZPerson_ID();

    /** Column name ZZPerson_UU */
    public static final String COLUMNNAME_ZZPerson_UU = "ZZPerson_UU";

	/** Set ZZPerson_UU	  */
	public void setZZPerson_UU (String ZZPerson_UU);

	/** Get ZZPerson_UU	  */
	public String getZZPerson_UU();

    /** Column name ZZPhotographFileName */
    public static final String COLUMNNAME_ZZPhotographFileName = "ZZPhotographFileName";

	/** Set Photograph File Name	  */
	public void setZZPhotographFileName (String ZZPhotographFileName);

	/** Get Photograph File Name	  */
	public String getZZPhotographFileName();

    /** Column name ZZPhysicalLocation_ID */
    public static final String COLUMNNAME_ZZPhysicalLocation_ID = "ZZPhysicalLocation_ID";

	/** Set Physical Address	  */
	public void setZZPhysicalLocation_ID (int ZZPhysicalLocation_ID);

	/** Get Physical Address	  */
	public int getZZPhysicalLocation_ID();

	public I_C_Location getZZPhysicalLocation() throws RuntimeException;

    /** Column name ZZPopiActStatus */
    public static final String COLUMNNAME_ZZPopiActStatus = "ZZPopiActStatus";

	/** Set POPI Act Status	  */
	public void setZZPopiActStatus (String ZZPopiActStatus);

	/** Get POPI Act Status	  */
	public String getZZPopiActStatus();

    /** Column name ZZPopiActStatusDate */
    public static final String COLUMNNAME_ZZPopiActStatusDate = "ZZPopiActStatusDate";

	/** Set POPI Act Status Date	  */
	public void setZZPopiActStatusDate (Timestamp ZZPopiActStatusDate);

	/** Get POPI Act Status Date	  */
	public Timestamp getZZPopiActStatusDate();

    /** Column name ZZPostalLocation_ID */
    public static final String COLUMNNAME_ZZPostalLocation_ID = "ZZPostalLocation_ID";

	/** Set Postal Address	  */
	public void setZZPostalLocation_ID (int ZZPostalLocation_ID);

	/** Get Postal Address	  */
	public int getZZPostalLocation_ID();

	public I_C_Location getZZPostalLocation() throws RuntimeException;

    /** Column name ZZYearsInOccupation */
    public static final String COLUMNNAME_ZZYearsInOccupation = "ZZYearsInOccupation";

	/** Set Years In Occupation	  */
	public void setZZYearsInOccupation (int ZZYearsInOccupation);

	/** Get Years In Occupation	  */
	public int getZZYearsInOccupation();

    /** Column name ZZ_AlternateIDType_ID */
    public static final String COLUMNNAME_ZZ_AlternateIDType_ID = "ZZ_AlternateIDType_ID";

	/** Set ID Type	  */
	public void setZZ_AlternateIDType_ID (int ZZ_AlternateIDType_ID);

	/** Get ID Type	  */
	public int getZZ_AlternateIDType_ID();

	public I_ZZ_AlternateIDType getZZ_AlternateIDType() throws RuntimeException;

    /** Column name ZZ_ID_Passport_No */
    public static final String COLUMNNAME_ZZ_ID_Passport_No = "ZZ_ID_Passport_No";

	/** Set ID No	  */
	public void setZZ_ID_Passport_No (String ZZ_ID_Passport_No);

	/** Get ID No	  */
	public String getZZ_ID_Passport_No();

    /** Column name ZZ_LI_CitizenResidentialStatus_ID */
    public static final String COLUMNNAME_ZZ_LI_CitizenResidentialStatus_ID = "ZZ_LI_CitizenResidentialStatus_ID";

	/** Set Citizen Residential Status	  */
	public void setZZ_LI_CitizenResidentialStatus_ID (int ZZ_LI_CitizenResidentialStatus_ID);

	/** Get Citizen Residential Status	  */
	public int getZZ_LI_CitizenResidentialStatus_ID();

	public I_ZZ_LI_CitizenResidentialStatus getZZ_LI_CitizenResidentialStatus() throws RuntimeException;

    /** Column name ZZ_LI_Disability_ID */
    public static final String COLUMNNAME_ZZ_LI_Disability_ID = "ZZ_LI_Disability_ID";

	/** Set Disability	  */
	public void setZZ_LI_Disability_ID (int ZZ_LI_Disability_ID);

	/** Get Disability	  */
	public int getZZ_LI_Disability_ID();

	public I_ZZ_LI_Disability getZZ_LI_Disability() throws RuntimeException;

    /** Column name ZZ_LI_HighestEducation_ID */
    public static final String COLUMNNAME_ZZ_LI_HighestEducation_ID = "ZZ_LI_HighestEducation_ID";

	/** Set Highest Education	  */
	public void setZZ_LI_HighestEducation_ID (int ZZ_LI_HighestEducation_ID);

	/** Get Highest Education	  */
	public int getZZ_LI_HighestEducation_ID();

	public I_ZZ_LI_HighestEducation getZZ_LI_HighestEducation() throws RuntimeException;

    /** Column name ZZ_LI_HomeLanguage_ID */
    public static final String COLUMNNAME_ZZ_LI_HomeLanguage_ID = "ZZ_LI_HomeLanguage_ID";

	/** Set Home Language	  */
	public void setZZ_LI_HomeLanguage_ID (int ZZ_LI_HomeLanguage_ID);

	/** Get Home Language	  */
	public int getZZ_LI_HomeLanguage_ID();

	public I_ZZ_LI_HomeLanguage getZZ_LI_HomeLanguage() throws RuntimeException;

    /** Column name ZZ_LI_SocioEconomicStatus_ID */
    public static final String COLUMNNAME_ZZ_LI_SocioEconomicStatus_ID = "ZZ_LI_SocioEconomicStatus_ID";

	/** Set Socio Economic Status	  */
	public void setZZ_LI_SocioEconomicStatus_ID (int ZZ_LI_SocioEconomicStatus_ID);

	/** Get Socio Economic Status	  */
	public int getZZ_LI_SocioEconomicStatus_ID();

	public I_ZZ_LI_SocioEconomicStatus getZZ_LI_SocioEconomicStatus() throws RuntimeException;

    /** Column name ZZ_Nationality_ID */
    public static final String COLUMNNAME_ZZ_Nationality_ID = "ZZ_Nationality_ID";

	/** Set Nationality	  */
	public void setZZ_Nationality_ID (int ZZ_Nationality_ID);

	/** Get Nationality	  */
	public int getZZ_Nationality_ID();

	public I_ZZ_Nationality getZZ_Nationality() throws RuntimeException;
}
