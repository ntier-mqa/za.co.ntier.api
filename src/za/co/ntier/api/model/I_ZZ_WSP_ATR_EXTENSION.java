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

/** Generated Interface for ZZ_WSP_ATR_EXTENSION
 *  @author iDempiere (generated) 
 *  @version Release 12
 */
@SuppressWarnings("all")
public interface I_ZZ_WSP_ATR_EXTENSION 
{

    /** TableName=ZZ_WSP_ATR_EXTENSION */
    public static final String Table_Name = "ZZ_WSP_ATR_EXTENSION";

    /** AD_Table_ID=1000196 */
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

    /** Column name DocumentNo */
    public static final String COLUMNNAME_DocumentNo = "DocumentNo";

	/** Set Document No.
	  * Document sequence number of the document
	  */
	public void setDocumentNo (String DocumentNo);

	/** Get Document No.
	  * Document sequence number of the document
	  */
	public String getDocumentNo();

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

    /** Column name ZZ_Designation */
    public static final String COLUMNNAME_ZZ_Designation = "ZZ_Designation";

	/** Set Designation	  */
	public void setZZ_Designation (String ZZ_Designation);

	/** Get Designation	  */
	public String getZZ_Designation();

    /** Column name ZZ_Number_Of_Employees */
    public static final String COLUMNNAME_ZZ_Number_Of_Employees = "ZZ_Number_Of_Employees";

	/** Set Number Of Employees	  */
	public void setZZ_Number_Of_Employees (BigDecimal ZZ_Number_Of_Employees);

	/** Get Number Of Employees	  */
	public BigDecimal getZZ_Number_Of_Employees();

    /** Column name ZZ_Organisation_Name */
    public static final String COLUMNNAME_ZZ_Organisation_Name = "ZZ_Organisation_Name";

	/** Set Organisation Name	  */
	public void setZZ_Organisation_Name (String ZZ_Organisation_Name);

	/** Get Organisation Name	  */
	public String getZZ_Organisation_Name();

    /** Column name ZZ_Reason_For_Extension */
    public static final String COLUMNNAME_ZZ_Reason_For_Extension = "ZZ_Reason_For_Extension";

	/** Set Reason for WSP-ATR Extension Request	  */
	public void setZZ_Reason_For_Extension (String ZZ_Reason_For_Extension);

	/** Get Reason for WSP-ATR Extension Request	  */
	public String getZZ_Reason_For_Extension();

    /** Column name ZZ_SDF_EMAIL */
    public static final String COLUMNNAME_ZZ_SDF_EMAIL = "ZZ_SDF_EMAIL";

	/** Set Email Address	  */
	public void setZZ_SDF_EMAIL (String ZZ_SDF_EMAIL);

	/** Get Email Address	  */
	public String getZZ_SDF_EMAIL();

    /** Column name ZZ_SDF_FirstName */
    public static final String COLUMNNAME_ZZ_SDF_FirstName = "ZZ_SDF_FirstName";

	/** Set First Name	  */
	public void setZZ_SDF_FirstName (String ZZ_SDF_FirstName);

	/** Get First Name	  */
	public String getZZ_SDF_FirstName();

    /** Column name ZZ_SDF_Phone */
    public static final String COLUMNNAME_ZZ_SDF_Phone = "ZZ_SDF_Phone";

	/** Set Contact No.	  */
	public void setZZ_SDF_Phone (String ZZ_SDF_Phone);

	/** Get Contact No.	  */
	public String getZZ_SDF_Phone();

    /** Column name ZZ_SDF_Surname */
    public static final String COLUMNNAME_ZZ_SDF_Surname = "ZZ_SDF_Surname";

	/** Set Surname	  */
	public void setZZ_SDF_Surname (String ZZ_SDF_Surname);

	/** Get Surname	  */
	public String getZZ_SDF_Surname();

    /** Column name ZZ_SDL_No */
    public static final String COLUMNNAME_ZZ_SDL_No = "ZZ_SDL_No";

	/** Set SDL Number	  */
	public void setZZ_SDL_No (String ZZ_SDL_No);

	/** Get SDL Number	  */
	public String getZZ_SDL_No();

    /** Column name ZZ_SOR_EMAIL */
    public static final String COLUMNNAME_ZZ_SOR_EMAIL = "ZZ_SOR_EMAIL";

	/** Set Email Address	  */
	public void setZZ_SOR_EMAIL (String ZZ_SOR_EMAIL);

	/** Get Email Address	  */
	public String getZZ_SOR_EMAIL();

    /** Column name ZZ_SOR_FirstName */
    public static final String COLUMNNAME_ZZ_SOR_FirstName = "ZZ_SOR_FirstName";

	/** Set First Name	  */
	public void setZZ_SOR_FirstName (String ZZ_SOR_FirstName);

	/** Get First Name	  */
	public String getZZ_SOR_FirstName();

    /** Column name ZZ_SOR_Phone */
    public static final String COLUMNNAME_ZZ_SOR_Phone = "ZZ_SOR_Phone";

	/** Set Contact No.	  */
	public void setZZ_SOR_Phone (String ZZ_SOR_Phone);

	/** Get Contact No.	  */
	public String getZZ_SOR_Phone();

    /** Column name ZZ_SOR_Surname */
    public static final String COLUMNNAME_ZZ_SOR_Surname = "ZZ_SOR_Surname";

	/** Set Surname	  */
	public void setZZ_SOR_Surname (String ZZ_SOR_Surname);

	/** Get Surname	  */
	public String getZZ_SOR_Surname();

    /** Column name ZZ_Submission_Date */
    public static final String COLUMNNAME_ZZ_Submission_Date = "ZZ_Submission_Date";

	/** Set Submission Date	  */
	public void setZZ_Submission_Date (Timestamp ZZ_Submission_Date);

	/** Get Submission Date	  */
	public Timestamp getZZ_Submission_Date();

    /** Column name ZZ_WSP_ATR_EXTENSION_BATCH_ID */
    public static final String COLUMNNAME_ZZ_WSP_ATR_EXTENSION_BATCH_ID = "ZZ_WSP_ATR_EXTENSION_BATCH_ID";

	/** Set ZZ_WSP_ATR_EXTENSION_BATCH_ID	  */
	public void setZZ_WSP_ATR_EXTENSION_BATCH_ID (int ZZ_WSP_ATR_EXTENSION_BATCH_ID);

	/** Get ZZ_WSP_ATR_EXTENSION_BATCH_ID	  */
	public int getZZ_WSP_ATR_EXTENSION_BATCH_ID();

	public I_ZZ_WSP_ATR_EXTENSION_BATCH getZZ_WSP_ATR_EXTENSION_BATCH() throws RuntimeException;

    /** Column name ZZ_WSP_ATR_EXTENSION_ID */
    public static final String COLUMNNAME_ZZ_WSP_ATR_EXTENSION_ID = "ZZ_WSP_ATR_EXTENSION_ID";

	/** Set Requests for Extension - WSP-ATR	  */
	public void setZZ_WSP_ATR_EXTENSION_ID (int ZZ_WSP_ATR_EXTENSION_ID);

	/** Get Requests for Extension - WSP-ATR	  */
	public int getZZ_WSP_ATR_EXTENSION_ID();

    /** Column name ZZ_WSP_ATR_EXTENSION_UU */
    public static final String COLUMNNAME_ZZ_WSP_ATR_EXTENSION_UU = "ZZ_WSP_ATR_EXTENSION_UU";

	/** Set ZZ_WSP_ATR_EXTENSION_UU	  */
	public void setZZ_WSP_ATR_EXTENSION_UU (String ZZ_WSP_ATR_EXTENSION_UU);

	/** Get ZZ_WSP_ATR_EXTENSION_UU	  */
	public String getZZ_WSP_ATR_EXTENSION_UU();

    /** Column name ZZ_WSP_ATR_Submitted_ID */
    public static final String COLUMNNAME_ZZ_WSP_ATR_Submitted_ID = "ZZ_WSP_ATR_Submitted_ID";

	/** Set WSP/ATR Submitted File.
	  * WSP/ATR Submitted File
	  */
	public void setZZ_WSP_ATR_Submitted_ID (int ZZ_WSP_ATR_Submitted_ID);

	/** Get WSP/ATR Submitted File.
	  * WSP/ATR Submitted File
	  */
	public int getZZ_WSP_ATR_Submitted_ID();

	public I_ZZ_WSP_ATR_Submitted getZZ_WSP_ATR_Submitted() throws RuntimeException;
}
