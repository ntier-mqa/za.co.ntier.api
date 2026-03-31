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

/** Generated Interface for ZZAssessorPerson
 *  @author iDempiere (generated) 
 *  @version Release 12
 */
@SuppressWarnings("all")
public interface I_ZZAssessorPerson 
{

    /** TableName=ZZAssessorPerson */
    public static final String Table_Name = "ZZAssessorPerson";

    /** AD_Table_ID=1000224 */
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

    /** Column name ZZAssessorPerson_ID */
    public static final String COLUMNNAME_ZZAssessorPerson_ID = "ZZAssessorPerson_ID";

	/** Set Assessor Person	  */
	public void setZZAssessorPerson_ID (int ZZAssessorPerson_ID);

	/** Get Assessor Person	  */
	public int getZZAssessorPerson_ID();

    /** Column name ZZAssessorPerson_UU */
    public static final String COLUMNNAME_ZZAssessorPerson_UU = "ZZAssessorPerson_UU";

	/** Set ZZAssessorPerson_UU	  */
	public void setZZAssessorPerson_UU (String ZZAssessorPerson_UU);

	/** Get ZZAssessorPerson_UU	  */
	public String getZZAssessorPerson_UU();

    /** Column name ZZEquity */
    public static final String COLUMNNAME_ZZEquity = "ZZEquity";

	/** Set Equity	  */
	public void setZZEquity (String ZZEquity);

	/** Get Equity	  */
	public String getZZEquity();

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

    /** Column name ZZSurname */
    public static final String COLUMNNAME_ZZSurname = "ZZSurname";

	/** Set Surname	  */
	public void setZZSurname (String ZZSurname);

	/** Get Surname	  */
	public String getZZSurname();

    /** Column name ZZ_DocStatus */
    public static final String COLUMNNAME_ZZ_DocStatus = "ZZ_DocStatus";

	/** Set Document Status	  */
	public void setZZ_DocStatus (String ZZ_DocStatus);

	/** Get Document Status	  */
	public String getZZ_DocStatus();

    /** Column name ZZ_LI_CitizenResidentialStatus_ID */
    public static final String COLUMNNAME_ZZ_LI_CitizenResidentialStatus_ID = "ZZ_LI_CitizenResidentialStatus_ID";

	/** Set Citizen Residential Status	  */
	public void setZZ_LI_CitizenResidentialStatus_ID (int ZZ_LI_CitizenResidentialStatus_ID);

	/** Get Citizen Residential Status	  */
	public int getZZ_LI_CitizenResidentialStatus_ID();

	public I_ZZ_LI_CitizenResidentialStatus getZZ_LI_CitizenResidentialStatus() throws RuntimeException;

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
