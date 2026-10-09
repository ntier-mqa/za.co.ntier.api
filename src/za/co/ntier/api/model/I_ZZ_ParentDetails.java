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

/** Generated Interface for ZZ_ParentDetails
 *  @author iDempiere (generated) 
 *  @version Release 12
 */
@SuppressWarnings("all")
public interface I_ZZ_ParentDetails 
{

    /** TableName=ZZ_ParentDetails */
    public static final String Table_Name = "ZZ_ParentDetails";

    /** AD_Table_ID=1000648 */
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

    /** Column name Surname */
    public static final String COLUMNNAME_Surname = "Surname";

	/** Set Surname	  */
	public void setSurname (String Surname);

	/** Get Surname	  */
	public String getSurname();

    /** Column name Title */
    public static final String COLUMNNAME_Title = "Title";

	/** Set Title.
	  * Name this entity is referred to as
	  */
	public void setTitle (String Title);

	/** Get Title.
	  * Name this entity is referred to as
	  */
	public String getTitle();

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

    /** Column name ZZFirstName */
    public static final String COLUMNNAME_ZZFirstName = "ZZFirstName";

	/** Set First Name	  */
	public void setZZFirstName (String ZZFirstName);

	/** Get First Name	  */
	public String getZZFirstName();

    /** Column name ZZLearner_ID */
    public static final String COLUMNNAME_ZZLearner_ID = "ZZLearner_ID";

	/** Set Learner	  */
	public void setZZLearner_ID (int ZZLearner_ID);

	/** Get Learner	  */
	public int getZZLearner_ID();

	public I_ZZLearner getZZLearner() throws RuntimeException;

    /** Column name ZZMiddleName */
    public static final String COLUMNNAME_ZZMiddleName = "ZZMiddleName";

	/** Set Middle Name	  */
	public void setZZMiddleName (String ZZMiddleName);

	/** Get Middle Name	  */
	public String getZZMiddleName();

    /** Column name ZZParentPerson_ID */
    public static final String COLUMNNAME_ZZParentPerson_ID = "ZZParentPerson_ID";

	/** Set Parent Person	  */
	public void setZZParentPerson_ID (int ZZParentPerson_ID);

	/** Get Parent Person	  */
	public int getZZParentPerson_ID();

	public I_ZZPerson getZZParentPerson() throws RuntimeException;

    /** Column name ZZ_ParentDetails_ID */
    public static final String COLUMNNAME_ZZ_ParentDetails_ID = "ZZ_ParentDetails_ID";

	/** Set Parent/Guardian Details	  */
	public void setZZ_ParentDetails_ID (int ZZ_ParentDetails_ID);

	/** Get Parent/Guardian Details	  */
	public int getZZ_ParentDetails_ID();

    /** Column name ZZ_ParentDetails_UU */
    public static final String COLUMNNAME_ZZ_ParentDetails_UU = "ZZ_ParentDetails_UU";

	/** Set ZZ_ParentDetails_UU	  */
	public void setZZ_ParentDetails_UU (String ZZ_ParentDetails_UU);

	/** Get ZZ_ParentDetails_UU	  */
	public String getZZ_ParentDetails_UU();
}
