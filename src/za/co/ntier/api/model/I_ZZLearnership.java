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

/** Generated Interface for ZZLearnership
 *  @author iDempiere (generated) 
 *  @version Release 12
 */
@SuppressWarnings("all")
public interface I_ZZLearnership 
{

    /** TableName=ZZLearnership */
    public static final String Table_Name = "ZZLearnership";

    /** AD_Table_ID=1000257 */
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

    /** Column name Name */
    public static final String COLUMNNAME_Name = "Name";

	/** Set Name.
	  * Alphanumeric identifier of the entity
	  */
	public void setName (String Name);

	/** Get Name.
	  * Alphanumeric identifier of the entity
	  */
	public String getName();

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

    /** Column name Value */
    public static final String COLUMNNAME_Value = "Value";

	/** Set Search Key.
	  * Search key for the record in the format required - must be unique
	  */
	public void setValue (String Value);

	/** Get Search Key.
	  * Search key for the record in the format required - must be unique
	  */
	public String getValue();

    /** Column name ZZCredits */
    public static final String COLUMNNAME_ZZCredits = "ZZCredits";

	/** Set Credits	  */
	public void setZZCredits (int ZZCredits);

	/** Get Credits	  */
	public int getZZCredits();

    /** Column name ZZLastEnrolmentDate */
    public static final String COLUMNNAME_ZZLastEnrolmentDate = "ZZLastEnrolmentDate";

	/** Set Last Enrolment Date	  */
	public void setZZLastEnrolmentDate (Timestamp ZZLastEnrolmentDate);

	/** Get Last Enrolment Date	  */
	public Timestamp getZZLastEnrolmentDate();

    /** Column name ZZLearnershipCode */
    public static final String COLUMNNAME_ZZLearnershipCode = "ZZLearnershipCode";

	/** Set Learnership Code	  */
	public void setZZLearnershipCode (String ZZLearnershipCode);

	/** Get Learnership Code	  */
	public String getZZLearnershipCode();

    /** Column name ZZLearnershipTitle */
    public static final String COLUMNNAME_ZZLearnershipTitle = "ZZLearnershipTitle";

	/** Set Learnership Title	  */
	public void setZZLearnershipTitle (String ZZLearnershipTitle);

	/** Get Learnership Title	  */
	public String getZZLearnershipTitle();

    /** Column name ZZLearnershipType */
    public static final String COLUMNNAME_ZZLearnershipType = "ZZLearnershipType";

	/** Set Learnership Type	  */
	public void setZZLearnershipType (String ZZLearnershipType);

	/** Get Learnership Type	  */
	public String getZZLearnershipType();

    /** Column name ZZLearnership_ID */
    public static final String COLUMNNAME_ZZLearnership_ID = "ZZLearnership_ID";

	/** Set Learnership	  */
	public void setZZLearnership_ID (int ZZLearnership_ID);

	/** Get Learnership	  */
	public int getZZLearnership_ID();

    /** Column name ZZLearnership_UU */
    public static final String COLUMNNAME_ZZLearnership_UU = "ZZLearnership_UU";

	/** Set ZZLearnership_UU	  */
	public void setZZLearnership_UU (String ZZLearnership_UU);

	/** Get ZZLearnership_UU	  */
	public String getZZLearnership_UU();

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

    /** Column name ZZNqfLevel */
    public static final String COLUMNNAME_ZZNqfLevel = "ZZNqfLevel";

	/** Set NQF Level	  */
	public void setZZNqfLevel (String ZZNqfLevel);

	/** Get NQF Level	  */
	public String getZZNqfLevel();

    /** Column name ZZQualification_ID */
    public static final String COLUMNNAME_ZZQualification_ID = "ZZQualification_ID";

	/** Set Qualification	  */
	public void setZZQualification_ID (int ZZQualification_ID);

	/** Get Qualification	  */
	public int getZZQualification_ID();

	public I_ZZQualification getZZQualification() throws RuntimeException;

    /** Column name ZZQualityAssuranceBody */
    public static final String COLUMNNAME_ZZQualityAssuranceBody = "ZZQualityAssuranceBody";

	/** Set Quality Assurance Body	  */
	public void setZZQualityAssuranceBody (String ZZQualityAssuranceBody);

	/** Get Quality Assurance Body	  */
	public String getZZQualityAssuranceBody();
}
