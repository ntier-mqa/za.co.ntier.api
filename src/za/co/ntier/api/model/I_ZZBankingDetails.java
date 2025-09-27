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

/** Generated Interface for ZZBankingDetails
 *  @author iDempiere (generated) 
 *  @version Release 12
 */
@SuppressWarnings("all")
public interface I_ZZBankingDetails 
{

    /** TableName=ZZBankingDetails */
    public static final String Table_Name = "ZZBankingDetails";

    /** AD_Table_ID=1000065 */
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

    /** Column name AccountNo */
    public static final String COLUMNNAME_AccountNo = "AccountNo";

	/** Set Account No.
	  * Account Number
	  */
	public void setAccountNo (String AccountNo);

	/** Get Account No.
	  * Account Number
	  */
	public String getAccountNo();

    /** Column name BankName */
    public static final String COLUMNNAME_BankName = "BankName";

	/** Set Bank Name	  */
	public void setBankName (String BankName);

	/** Get Bank Name	  */
	public String getBankName();

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

    /** Column name ZZBankingDetails_ID */
    public static final String COLUMNNAME_ZZBankingDetails_ID = "ZZBankingDetails_ID";

	/** Set Banking Details	  */
	public void setZZBankingDetails_ID (int ZZBankingDetails_ID);

	/** Get Banking Details	  */
	public int getZZBankingDetails_ID();

    /** Column name ZZBankingDetails_UU */
    public static final String COLUMNNAME_ZZBankingDetails_UU = "ZZBankingDetails_UU";

	/** Set ZZBankingDetails_UU	  */
	public void setZZBankingDetails_UU (String ZZBankingDetails_UU);

	/** Get ZZBankingDetails_UU	  */
	public String getZZBankingDetails_UU();

    /** Column name ZZ_Application_Form_ID */
    public static final String COLUMNNAME_ZZ_Application_Form_ID = "ZZ_Application_Form_ID";

	/** Set Application Form	  */
	public void setZZ_Application_Form_ID (int ZZ_Application_Form_ID);

	/** Get Application Form	  */
	public int getZZ_Application_Form_ID();

	public I_ZZ_Application_Form getZZ_Application_Form() throws RuntimeException;

    /** Column name ZZ_Branch_Name */
    public static final String COLUMNNAME_ZZ_Branch_Name = "ZZ_Branch_Name";

	/** Set Branch Name	  */
	public void setZZ_Branch_Name (String ZZ_Branch_Name);

	/** Get Branch Name	  */
	public String getZZ_Branch_Name();

    /** Column name ZZ_Branch_Number */
    public static final String COLUMNNAME_ZZ_Branch_Number = "ZZ_Branch_Number";

	/** Set Branch Number	  */
	public void setZZ_Branch_Number (String ZZ_Branch_Number);

	/** Get Branch Number	  */
	public String getZZ_Branch_Number();
}
