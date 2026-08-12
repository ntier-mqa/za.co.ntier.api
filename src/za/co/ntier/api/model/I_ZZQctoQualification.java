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

/** Generated Interface for ZZQctoQualification
 *  @author iDempiere (generated) 
 *  @version Release 12
 */
@SuppressWarnings("all")
public interface I_ZZQctoQualification 
{

    /** TableName=ZZQctoQualification */
    public static final String Table_Name = "ZZQctoQualification";

    /** AD_Table_ID=1000256 */
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

    /** Column name Registrationenddate */
    public static final String COLUMNNAME_Registrationenddate = "Registrationenddate";

	/** Set Registration End Date	  */
	public void setRegistrationenddate (Timestamp Registrationenddate);

	/** Get Registration End Date	  */
	public Timestamp getRegistrationenddate();

    /** Column name Registrationstartdate */
    public static final String COLUMNNAME_Registrationstartdate = "Registrationstartdate";

	/** Set Registration Start Date	  */
	public void setRegistrationstartdate (Timestamp Registrationstartdate);

	/** Get Registration Start Date	  */
	public Timestamp getRegistrationstartdate();

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

    /** Column name ZZArtisanQualification */
    public static final String COLUMNNAME_ZZArtisanQualification = "ZZArtisanQualification";

	/** Set Artisan Qualification	  */
	public void setZZArtisanQualification (String ZZArtisanQualification);

	/** Get Artisan Qualification	  */
	public String getZZArtisanQualification();

    /** Column name ZZCredits */
    public static final String COLUMNNAME_ZZCredits = "ZZCredits";

	/** Set Credits	  */
	public void setZZCredits (int ZZCredits);

	/** Get Credits	  */
	public int getZZCredits();

    /** Column name ZZIsReplacement */
    public static final String COLUMNNAME_ZZIsReplacement = "ZZIsReplacement";

	/** Set Is Replacement	  */
	public void setZZIsReplacement (String ZZIsReplacement);

	/** Get Is Replacement	  */
	public String getZZIsReplacement();

    /** Column name ZZIsReregistered */
    public static final String COLUMNNAME_ZZIsReregistered = "ZZIsReregistered";

	/** Set Is Reregistered	  */
	public void setZZIsReregistered (String ZZIsReregistered);

	/** Get Is Reregistered	  */
	public String getZZIsReregistered();

    /** Column name ZZLastAchievementDate */
    public static final String COLUMNNAME_ZZLastAchievementDate = "ZZLastAchievementDate";

	/** Set Last Achievement Date	  */
	public void setZZLastAchievementDate (Timestamp ZZLastAchievementDate);

	/** Get Last Achievement Date	  */
	public Timestamp getZZLastAchievementDate();

    /** Column name ZZLastEnrolmentDate */
    public static final String COLUMNNAME_ZZLastEnrolmentDate = "ZZLastEnrolmentDate";

	/** Set Last Enrolment Date	  */
	public void setZZLastEnrolmentDate (Timestamp ZZLastEnrolmentDate);

	/** Get Last Enrolment Date	  */
	public Timestamp getZZLastEnrolmentDate();

    /** Column name ZZLkpOfoOccupationTree_ID */
    public static final String COLUMNNAME_ZZLkpOfoOccupationTree_ID = "ZZLkpOfoOccupationTree_ID";

	/** Set Ofo Occupation	  */
	public void setZZLkpOfoOccupationTree_ID (int ZZLkpOfoOccupationTree_ID);

	/** Get Ofo Occupation	  */
	public int getZZLkpOfoOccupationTree_ID();

	public I_ZZLkpOfoOccupationTree getZZLkpOfoOccupationTree() throws RuntimeException;

    /** Column name ZZMigrateValues */
    public static final String COLUMNNAME_ZZMigrateValues = "ZZMigrateValues";

	/** Set Migrate Values	  */
	public void setZZMigrateValues (String ZZMigrateValues);

	/** Get Migrate Values	  */
	public String getZZMigrateValues();

    /** Column name ZZMigrationCode */
    public static final String COLUMNNAME_ZZMigrationCode = "ZZMigrationCode";

	/** Set Migration Code	  */
	public void setZZMigrationCode (int ZZMigrationCode);

	/** Get Migration Code	  */
	public int getZZMigrationCode();

    /** Column name ZZMinimumElectiveCredits */
    public static final String COLUMNNAME_ZZMinimumElectiveCredits = "ZZMinimumElectiveCredits";

	/** Set Minimum Elective Credits	  */
	public void setZZMinimumElectiveCredits (int ZZMinimumElectiveCredits);

	/** Get Minimum Elective Credits	  */
	public int getZZMinimumElectiveCredits();

    /** Column name ZZNewLastAchievementDate */
    public static final String COLUMNNAME_ZZNewLastAchievementDate = "ZZNewLastAchievementDate";

	/** Set New Last Achievement Date	  */
	public void setZZNewLastAchievementDate (Timestamp ZZNewLastAchievementDate);

	/** Get New Last Achievement Date	  */
	public Timestamp getZZNewLastAchievementDate();

    /** Column name ZZNewLastEnrolmentDate */
    public static final String COLUMNNAME_ZZNewLastEnrolmentDate = "ZZNewLastEnrolmentDate";

	/** Set New Last Enrolment Date	  */
	public void setZZNewLastEnrolmentDate (Timestamp ZZNewLastEnrolmentDate);

	/** Get New Last Enrolment Date	  */
	public Timestamp getZZNewLastEnrolmentDate();

    /** Column name ZZNewRegistrationEndDate */
    public static final String COLUMNNAME_ZZNewRegistrationEndDate = "ZZNewRegistrationEndDate";

	/** Set New Registration End Date	  */
	public void setZZNewRegistrationEndDate (Timestamp ZZNewRegistrationEndDate);

	/** Get New Registration End Date	  */
	public Timestamp getZZNewRegistrationEndDate();

    /** Column name ZZNewRegistrationStartDate */
    public static final String COLUMNNAME_ZZNewRegistrationStartDate = "ZZNewRegistrationStartDate";

	/** Set New Registration Start Date	  */
	public void setZZNewRegistrationStartDate (Timestamp ZZNewRegistrationStartDate);

	/** Get New Registration Start Date	  */
	public Timestamp getZZNewRegistrationStartDate();

    /** Column name ZZNqfLevel */
    public static final String COLUMNNAME_ZZNqfLevel = "ZZNqfLevel";

	/** Set NQF Level	  */
	public void setZZNqfLevel (String ZZNqfLevel);

	/** Get NQF Level	  */
	public String getZZNqfLevel();

    /** Column name ZZQctoQualification2_ID */
    public static final String COLUMNNAME_ZZQctoQualification2_ID = "ZZQctoQualification2_ID";

	/** Set QCTO Qualification	  */
	public void setZZQctoQualification2_ID (int ZZQctoQualification2_ID);

	/** Get QCTO Qualification	  */
	public int getZZQctoQualification2_ID();

	public I_ZZQctoQualification getZZQctoQualification2() throws RuntimeException;

    /** Column name ZZQctoQualificationType */
    public static final String COLUMNNAME_ZZQctoQualificationType = "ZZQctoQualificationType";

	/** Set QCTO Qualification Type	  */
	public void setZZQctoQualificationType (String ZZQctoQualificationType);

	/** Get QCTO Qualification Type	  */
	public String getZZQctoQualificationType();

    /** Column name ZZQctoQualification_ID */
    public static final String COLUMNNAME_ZZQctoQualification_ID = "ZZQctoQualification_ID";

	/** Set QCTO Qualification	  */
	public void setZZQctoQualification_ID (int ZZQctoQualification_ID);

	/** Get QCTO Qualification	  */
	public int getZZQctoQualification_ID();

    /** Column name ZZQctoQualification_UU */
    public static final String COLUMNNAME_ZZQctoQualification_UU = "ZZQctoQualification_UU";

	/** Set ZZQctoQualification_UU	  */
	public void setZZQctoQualification_UU (String ZZQctoQualification_UU);

	/** Get ZZQctoQualification_UU	  */
	public String getZZQctoQualification_UU();

    /** Column name ZZQualification_ID */
    public static final String COLUMNNAME_ZZQualification_ID = "ZZQualification_ID";

	/** Set Qualification	  */
	public void setZZQualification_ID (int ZZQualification_ID);

	/** Get Qualification	  */
	public int getZZQualification_ID();

	public I_ZZQualification getZZQualification() throws RuntimeException;

    /** Column name ZZReplacementQualification_ID */
    public static final String COLUMNNAME_ZZReplacementQualification_ID = "ZZReplacementQualification_ID";

	/** Set Replacement Qualification	  */
	public void setZZReplacementQualification_ID (int ZZReplacementQualification_ID);

	/** Get Replacement Qualification	  */
	public int getZZReplacementQualification_ID();

	public I_ZZQctoQualification getZZReplacementQualification() throws RuntimeException;

    /** Column name ZZSaqaQualificationCode */
    public static final String COLUMNNAME_ZZSaqaQualificationCode = "ZZSaqaQualificationCode";

	/** Set SAQA Qualification Code	  */
	public void setZZSaqaQualificationCode (String ZZSaqaQualificationCode);

	/** Get SAQA Qualification Code	  */
	public String getZZSaqaQualificationCode();

    /** Column name ZZSaqaQualificationTitle */
    public static final String COLUMNNAME_ZZSaqaQualificationTitle = "ZZSaqaQualificationTitle";

	/** Set SAQA Qualification Title	  */
	public void setZZSaqaQualificationTitle (String ZZSaqaQualificationTitle);

	/** Get SAQA Qualification Title	  */
	public String getZZSaqaQualificationTitle();

    /** Column name ZZ_QCTOQualsCodeAndTitle */
    public static final String COLUMNNAME_ZZ_QCTOQualsCodeAndTitle = "ZZ_QCTOQualsCodeAndTitle";

	/** Set QCTO Qualification Code and Title.
	  * A column sql for the displaying code and title for the QCTO Qualification
	  */
	public void setZZ_QCTOQualsCodeAndTitle (String ZZ_QCTOQualsCodeAndTitle);

	/** Get QCTO Qualification Code and Title.
	  * A column sql for the displaying code and title for the QCTO Qualification
	  */
	public String getZZ_QCTOQualsCodeAndTitle();
}
