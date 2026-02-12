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

/** Generated Interface for ZZ_EDP_Application
 *  @author iDempiere (generated) 
 *  @version Release 12
 */
@SuppressWarnings("all")
public interface I_ZZ_EDP_Application 
{

    /** TableName=ZZ_EDP_Application */
    public static final String Table_Name = "ZZ_EDP_Application";

    /** AD_Table_ID=1000181 */
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

    /** Column name Age */
    public static final String COLUMNNAME_Age = "Age";

	/** Set Age	  */
	public void setAge (int Age);

	/** Get Age	  */
	public int getAge();

    /** Column name AltCellphonenumber */
    public static final String COLUMNNAME_AltCellphonenumber = "AltCellphonenumber";

	/** Set AltCellphonenumber.
	  * Alternate Cellphone number
	  */
	public void setAltCellphonenumber (String AltCellphonenumber);

	/** Get AltCellphonenumber.
	  * Alternate Cellphone number
	  */
	public String getAltCellphonenumber();

    /** Column name Cellphonenumber */
    public static final String COLUMNNAME_Cellphonenumber = "Cellphonenumber";

	/** Set Cellphonenumber	  */
	public void setCellphonenumber (String Cellphonenumber);

	/** Get Cellphonenumber	  */
	public String getCellphonenumber();

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

    /** Column name Position */
    public static final String COLUMNNAME_Position = "Position";

	/** Set Position	  */
	public void setPosition (String Position);

	/** Get Position	  */
	public String getPosition();

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

    /** Column name ZZExecutiveStatus */
    public static final String COLUMNNAME_ZZExecutiveStatus = "ZZExecutiveStatus";

	/** Set Executive Status	  */
	public void setZZExecutiveStatus (String ZZExecutiveStatus);

	/** Get Executive Status	  */
	public String getZZExecutiveStatus();

    /** Column name ZZGender */
    public static final String COLUMNNAME_ZZGender = "ZZGender";

	/** Set Gender	  */
	public void setZZGender (String ZZGender);

	/** Get Gender	  */
	public String getZZGender();

    /** Column name ZZ_Application_Form_ID */
    public static final String COLUMNNAME_ZZ_Application_Form_ID = "ZZ_Application_Form_ID";

	/** Set Application Form	  */
	public void setZZ_Application_Form_ID (int ZZ_Application_Form_ID);

	/** Get Application Form	  */
	public int getZZ_Application_Form_ID();

	public I_ZZ_Application_Form getZZ_Application_Form() throws RuntimeException;

    /** Column name ZZ_EDP_Application_ID */
    public static final String COLUMNNAME_ZZ_EDP_Application_ID = "ZZ_EDP_Application_ID";

	/** Set ZZ_EDP_Application_ID	  */
	public void setZZ_EDP_Application_ID (int ZZ_EDP_Application_ID);

	/** Get ZZ_EDP_Application_ID	  */
	public int getZZ_EDP_Application_ID();

    /** Column name ZZ_EDP_Application_UU */
    public static final String COLUMNNAME_ZZ_EDP_Application_UU = "ZZ_EDP_Application_UU";

	/** Set ZZ_EDP_Application_UU	  */
	public void setZZ_EDP_Application_UU (String ZZ_EDP_Application_UU);

	/** Get ZZ_EDP_Application_UU	  */
	public String getZZ_EDP_Application_UU();

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

    /** Column name ZZ_NQF_Level */
    public static final String COLUMNNAME_ZZ_NQF_Level = "ZZ_NQF_Level";

	/** Set NQF Level	  */
	public void setZZ_NQF_Level (String ZZ_NQF_Level);

	/** Get NQF Level	  */
	public String getZZ_NQF_Level();

    /** Column name isAspiringExecutive */
    public static final String COLUMNNAME_isAspiringExecutive = "isAspiringExecutive";

	/** Set isAspiringExecutive	  */
	public void setisAspiringExecutive (boolean isAspiringExecutive);

	/** Get isAspiringExecutive	  */
	public boolean isAspiringExecutive();

    /** Column name isExecutive */
    public static final String COLUMNNAME_isExecutive = "isExecutive";

	/** Set isExecutive	  */
	public void setisExecutive (boolean isExecutive);

	/** Get isExecutive	  */
	public boolean isExecutive();
}
