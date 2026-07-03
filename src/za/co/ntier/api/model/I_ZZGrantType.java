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

/** Generated Interface for ZZGrantType
 *  @author iDempiere (generated) 
 *  @version Release 12
 */
@SuppressWarnings("all")
public interface I_ZZGrantType 
{

    /** TableName=ZZGrantType */
    public static final String Table_Name = "ZZGrantType";

    /** AD_Table_ID=1000309 */
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

    /** Column name C_Year_ID */
    public static final String COLUMNNAME_C_Year_ID = "C_Year_ID";

	/** Set Year.
	  * Calendar Year
	  */
	public void setC_Year_ID (int C_Year_ID);

	/** Get Year.
	  * Calendar Year
	  */
	public int getC_Year_ID();

	public org.compiere.model.I_C_Year getC_Year() throws RuntimeException;

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

    /** Column name ZZGrantDescription */
    public static final String COLUMNNAME_ZZGrantDescription = "ZZGrantDescription";

	/** Set Grant Description	  */
	public void setZZGrantDescription (String ZZGrantDescription);

	/** Get Grant Description	  */
	public String getZZGrantDescription();

    /** Column name ZZGrantName */
    public static final String COLUMNNAME_ZZGrantName = "ZZGrantName";

	/** Set Grant Name	  */
	public void setZZGrantName (String ZZGrantName);

	/** Get Grant Name	  */
	public String getZZGrantName();

    /** Column name ZZGrantPercentage */
    public static final String COLUMNNAME_ZZGrantPercentage = "ZZGrantPercentage";

	/** Set Grant Percentage	  */
	public void setZZGrantPercentage (BigDecimal ZZGrantPercentage);

	/** Get Grant Percentage	  */
	public BigDecimal getZZGrantPercentage();

    /** Column name ZZGrantType_ID */
    public static final String COLUMNNAME_ZZGrantType_ID = "ZZGrantType_ID";

	/** Set Grant Type	  */
	public void setZZGrantType_ID (int ZZGrantType_ID);

	/** Get Grant Type	  */
	public int getZZGrantType_ID();

    /** Column name ZZGrantType_UU */
    public static final String COLUMNNAME_ZZGrantType_UU = "ZZGrantType_UU";

	/** Set ZZGrantType_UU	  */
	public void setZZGrantType_UU (String ZZGrantType_UU);

	/** Get ZZGrantType_UU	  */
	public String getZZGrantType_UU();

    /** Column name ZZIsPayable */
    public static final String COLUMNNAME_ZZIsPayable = "ZZIsPayable";

	/** Set Payable	  */
	public void setZZIsPayable (String ZZIsPayable);

	/** Get Payable	  */
	public String getZZIsPayable();

    /** Column name ZZLkpGrantCode_ID */
    public static final String COLUMNNAME_ZZLkpGrantCode_ID = "ZZLkpGrantCode_ID";

	/** Set Grant Code	  */
	public void setZZLkpGrantCode_ID (int ZZLkpGrantCode_ID);

	/** Get Grant Code	  */
	public int getZZLkpGrantCode_ID();

	public I_ZZLkpGrantCode getZZLkpGrantCode() throws RuntimeException;

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

    /** Column name ZZMinimumAmount */
    public static final String COLUMNNAME_ZZMinimumAmount = "ZZMinimumAmount";

	/** Set Minimum Amount	  */
	public void setZZMinimumAmount (BigDecimal ZZMinimumAmount);

	/** Get Minimum Amount	  */
	public BigDecimal getZZMinimumAmount();
}
