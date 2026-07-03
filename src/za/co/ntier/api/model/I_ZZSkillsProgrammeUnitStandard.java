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

/** Generated Interface for ZZSkillsProgrammeUnitStandard
 *  @author iDempiere (generated) 
 *  @version Release 12
 */
@SuppressWarnings("all")
public interface I_ZZSkillsProgrammeUnitStandard 
{

    /** TableName=ZZSkillsProgrammeUnitStandard */
    public static final String Table_Name = "ZZSkillsProgrammeUnitStandard";

    /** AD_Table_ID=1000270 */
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

    /** Column name ZZSkillsProgrammeUnitStandard_ID */
    public static final String COLUMNNAME_ZZSkillsProgrammeUnitStandard_ID = "ZZSkillsProgrammeUnitStandard_ID";

	/** Set Skills Programme Unit Standard	  */
	public void setZZSkillsProgrammeUnitStandard_ID (int ZZSkillsProgrammeUnitStandard_ID);

	/** Get Skills Programme Unit Standard	  */
	public int getZZSkillsProgrammeUnitStandard_ID();

    /** Column name ZZSkillsProgrammeUnitStandard_UU */
    public static final String COLUMNNAME_ZZSkillsProgrammeUnitStandard_UU = "ZZSkillsProgrammeUnitStandard_UU";

	/** Set ZZSkillsProgrammeUnitStandard_UU	  */
	public void setZZSkillsProgrammeUnitStandard_UU (String ZZSkillsProgrammeUnitStandard_UU);

	/** Get ZZSkillsProgrammeUnitStandard_UU	  */
	public String getZZSkillsProgrammeUnitStandard_UU();

    /** Column name ZZSkillsProgramme_ID */
    public static final String COLUMNNAME_ZZSkillsProgramme_ID = "ZZSkillsProgramme_ID";

	/** Set Skills Programme	  */
	public void setZZSkillsProgramme_ID (int ZZSkillsProgramme_ID);

	/** Get Skills Programme	  */
	public int getZZSkillsProgramme_ID();

	public I_ZZSkillsProgramme getZZSkillsProgramme() throws RuntimeException;

    /** Column name ZZUnitStandardType */
    public static final String COLUMNNAME_ZZUnitStandardType = "ZZUnitStandardType";

	/** Set Unit Standard Type	  */
	public void setZZUnitStandardType (String ZZUnitStandardType);

	/** Get Unit Standard Type	  */
	public String getZZUnitStandardType();

    /** Column name ZZUnitStandard_ID */
    public static final String COLUMNNAME_ZZUnitStandard_ID = "ZZUnitStandard_ID";

	/** Set Unit Standard	  */
	public void setZZUnitStandard_ID (int ZZUnitStandard_ID);

	/** Get Unit Standard	  */
	public int getZZUnitStandard_ID();

	public I_ZZUnitStandard getZZUnitStandard() throws RuntimeException;
}
