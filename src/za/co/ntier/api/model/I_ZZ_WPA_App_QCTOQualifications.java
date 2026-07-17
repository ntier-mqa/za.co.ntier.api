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

/** Generated Interface for ZZ_WPA_App_QCTOQualifications
 *  @author iDempiere (generated) 
 *  @version Release 12
 */
@SuppressWarnings("all")
public interface I_ZZ_WPA_App_QCTOQualifications 
{

    /** TableName=ZZ_WPA_App_QCTOQualifications */
    public static final String Table_Name = "ZZ_WPA_App_QCTOQualifications";

    /** AD_Table_ID=1000322 */
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

    /** Column name ZZCredits */
    public static final String COLUMNNAME_ZZCredits = "ZZCredits";

	/** Set Credits	  */
	public void setZZCredits (int ZZCredits);

	/** Get Credits	  */
	public int getZZCredits();

    /** Column name ZZProgrammeName */
    public static final String COLUMNNAME_ZZProgrammeName = "ZZProgrammeName";

	/** Set Programme Name	  */
	public void setZZProgrammeName (String ZZProgrammeName);

	/** Get Programme Name	  */
	public String getZZProgrammeName();

    /** Column name ZZQctoQualification_ID */
    public static final String COLUMNNAME_ZZQctoQualification_ID = "ZZQctoQualification_ID";

	/** Set QCTO Qualification	  */
	public void setZZQctoQualification_ID (int ZZQctoQualification_ID);

	/** Get QCTO Qualification	  */
	public int getZZQctoQualification_ID();

    /** Column name ZZ_NQF_Level */
    public static final String COLUMNNAME_ZZ_NQF_Level = "ZZ_NQF_Level";

	/** Set NQF Level	  */
	public void setZZ_NQF_Level (String ZZ_NQF_Level);

	/** Get NQF Level	  */
	public String getZZ_NQF_Level();

    /** Column name ZZ_OCO_Code */
    public static final String COLUMNNAME_ZZ_OCO_Code = "ZZ_OCO_Code";

	/** Set OCO Code	  */
	public void setZZ_OCO_Code (String ZZ_OCO_Code);

	/** Get OCO Code	  */
	public String getZZ_OCO_Code();

    /** Column name ZZ_WPA_App_QCTOQualifications_ID */
    public static final String COLUMNNAME_ZZ_WPA_App_QCTOQualifications_ID = "ZZ_WPA_App_QCTOQualifications_ID";

	/** Set QCTO Qualifications	  */
	public void setZZ_WPA_App_QCTOQualifications_ID (int ZZ_WPA_App_QCTOQualifications_ID);

	/** Get QCTO Qualifications	  */
	public int getZZ_WPA_App_QCTOQualifications_ID();

    /** Column name ZZ_WPA_App_QCTOQualifications_UU */
    public static final String COLUMNNAME_ZZ_WPA_App_QCTOQualifications_UU = "ZZ_WPA_App_QCTOQualifications_UU";

	/** Set ZZ_WPA_App_QCTOQualifications_UU	  */
	public void setZZ_WPA_App_QCTOQualifications_UU (String ZZ_WPA_App_QCTOQualifications_UU);

	/** Get ZZ_WPA_App_QCTOQualifications_UU	  */
	public String getZZ_WPA_App_QCTOQualifications_UU();

    /** Column name ZZ_WPA_Application_ID */
    public static final String COLUMNNAME_ZZ_WPA_Application_ID = "ZZ_WPA_Application_ID";

	/** Set WPA Application	  */
	public void setZZ_WPA_Application_ID (int ZZ_WPA_Application_ID);

	/** Get WPA Application	  */
	public int getZZ_WPA_Application_ID();

	public I_ZZ_WPA_Application getZZ_WPA_Application() throws RuntimeException;
}
