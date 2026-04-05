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

/** Generated Interface for ZZLinkAssessorSkillsProgramme
 *  @author iDempiere (generated) 
 *  @version Release 12
 */
@SuppressWarnings("all")
public interface I_ZZLinkAssessorSkillsProgramme 
{

    /** TableName=ZZLinkAssessorSkillsProgramme */
    public static final String Table_Name = "ZZLinkAssessorSkillsProgramme";

    /** AD_Table_ID=1000232 */
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

    /** Column name ZZAssessorPerson_ID */
    public static final String COLUMNNAME_ZZAssessorPerson_ID = "ZZAssessorPerson_ID";

	/** Set Assessor Person	  */
	public void setZZAssessorPerson_ID (int ZZAssessorPerson_ID);

	/** Get Assessor Person	  */
	public int getZZAssessorPerson_ID();

	public I_ZZAssessorPerson getZZAssessorPerson() throws RuntimeException;

    /** Column name ZZLinkAssessorSkillsProgramme_ID */
    public static final String COLUMNNAME_ZZLinkAssessorSkillsProgramme_ID = "ZZLinkAssessorSkillsProgramme_ID";

	/** Set Link Assessor Skills Programme.
	  * Link Assessor Skills Programme
	  */
	public void setZZLinkAssessorSkillsProgramme_ID (int ZZLinkAssessorSkillsProgramme_ID);

	/** Get Link Assessor Skills Programme.
	  * Link Assessor Skills Programme
	  */
	public int getZZLinkAssessorSkillsProgramme_ID();

    /** Column name ZZLinkAssessorSkillsProgramme_UU */
    public static final String COLUMNNAME_ZZLinkAssessorSkillsProgramme_UU = "ZZLinkAssessorSkillsProgramme_UU";

	/** Set ZZLinkAssessorSkillsProgramme_UU	  */
	public void setZZLinkAssessorSkillsProgramme_UU (String ZZLinkAssessorSkillsProgramme_UU);

	/** Get ZZLinkAssessorSkillsProgramme_UU	  */
	public String getZZLinkAssessorSkillsProgramme_UU();

    /** Column name ZZSkillsProgramme_ID */
    public static final String COLUMNNAME_ZZSkillsProgramme_ID = "ZZSkillsProgramme_ID";

	/** Set Skills Programme	  */
	public void setZZSkillsProgramme_ID (int ZZSkillsProgramme_ID);

	/** Get Skills Programme	  */
	public int getZZSkillsProgramme_ID();

	public I_ZZSkillsProgramme getZZSkillsProgramme() throws RuntimeException;
}
