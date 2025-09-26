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

/** Generated Interface for ZZDetailSmallBusinesse
 *  @author iDempiere (generated) 
 *  @version Release 12
 */
@SuppressWarnings("all")
public interface I_ZZDetailSmallBusinesse 
{

    /** TableName=ZZDetailSmallBusinesse */
    public static final String Table_Name = "ZZDetailSmallBusinesse";

    /** AD_Table_ID=1000063 */
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

    /** Column name ZZBusinessesName */
    public static final String COLUMNNAME_ZZBusinessesName = "ZZBusinessesName";

	/** Set Businesses Name.
	  * Name of business/cooperative/NPO/NGO/CBO to be supported
	  */
	public void setZZBusinessesName (String ZZBusinessesName);

	/** Get Businesses Name.
	  * Name of business/cooperative/NPO/NGO/CBO to be supported
	  */
	public String getZZBusinessesName();

    /** Column name ZZDetailSmallBusinesse_ID */
    public static final String COLUMNNAME_ZZDetailSmallBusinesse_ID = "ZZDetailSmallBusinesse_ID";

	/** Set Detail Small Businesse.
	  * LIST OF BUSINESSES/COOPERATIVES/NPO/NGO/CBO TO BE SUPPORTED AND TRAINING PROGRAMMES
	  */
	public void setZZDetailSmallBusinesse_ID (int ZZDetailSmallBusinesse_ID);

	/** Get Detail Small Businesse.
	  * LIST OF BUSINESSES/COOPERATIVES/NPO/NGO/CBO TO BE SUPPORTED AND TRAINING PROGRAMMES
	  */
	public int getZZDetailSmallBusinesse_ID();

    /** Column name ZZDetailSmallBusinesse_UU */
    public static final String COLUMNNAME_ZZDetailSmallBusinesse_UU = "ZZDetailSmallBusinesse_UU";

	/** Set ZZDetailSmallBusinesse_UU	  */
	public void setZZDetailSmallBusinesse_UU (String ZZDetailSmallBusinesse_UU);

	/** Get ZZDetailSmallBusinesse_UU	  */
	public String getZZDetailSmallBusinesse_UU();

    /** Column name ZZNoCreditOffered */
    public static final String COLUMNNAME_ZZNoCreditOffered = "ZZNoCreditOffered";

	/** Set No Of Credit Offered	  */
	public void setZZNoCreditOffered (int ZZNoCreditOffered);

	/** Get No Of Credit Offered	  */
	public int getZZNoCreditOffered();

    /** Column name ZZNoTrainees */
    public static final String COLUMNNAME_ZZNoTrainees = "ZZNoTrainees";

	/** Set No Trainees	  */
	public void setZZNoTrainees (int ZZNoTrainees);

	/** Get No Trainees	  */
	public int getZZNoTrainees();

    /** Column name ZZNoTrainingDay */
    public static final String COLUMNNAME_ZZNoTrainingDay = "ZZNoTrainingDay";

	/** Set Duration Training Day.
	  * Duration Of Training In Day
	  */
	public void setZZNoTrainingDay (int ZZNoTrainingDay);

	/** Get Duration Training Day.
	  * Duration Of Training In Day
	  */
	public int getZZNoTrainingDay();

    /** Column name ZZProgrammeName */
    public static final String COLUMNNAME_ZZProgrammeName = "ZZProgrammeName";

	/** Set Programme Name	  */
	public void setZZProgrammeName (String ZZProgrammeName);

	/** Get Programme Name	  */
	public String getZZProgrammeName();

    /** Column name ZZ_Application_Form_ID */
    public static final String COLUMNNAME_ZZ_Application_Form_ID = "ZZ_Application_Form_ID";

	/** Set Application Form	  */
	public void setZZ_Application_Form_ID (int ZZ_Application_Form_ID);

	/** Get Application Form	  */
	public int getZZ_Application_Form_ID();

	public I_ZZ_Application_Form getZZ_Application_Form() throws RuntimeException;
}
