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

/** Generated Interface for ZZ_WSP_ATR_EXTENSION_BATCH
 *  @author iDempiere (generated) 
 *  @version Release 12
 */
@SuppressWarnings("all")
public interface I_ZZ_WSP_ATR_EXTENSION_BATCH 
{

    /** TableName=ZZ_WSP_ATR_EXTENSION_BATCH */
    public static final String Table_Name = "ZZ_WSP_ATR_EXTENSION_BATCH";

    /** AD_Table_ID=1000182 */
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

    /** Column name Processed */
    public static final String COLUMNNAME_Processed = "Processed";

	/** Set Processed.
	  * The document has been processed
	  */
	public void setProcessed (boolean Processed);

	/** Get Processed.
	  * The document has been processed
	  */
	public boolean isProcessed();

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

    /** Column name ZZ_DocAction */
    public static final String COLUMNNAME_ZZ_DocAction = "ZZ_DocAction";

	/** Set Document Action	  */
	public void setZZ_DocAction (String ZZ_DocAction);

	/** Get Document Action	  */
	public String getZZ_DocAction();

    /** Column name ZZ_DocStatus */
    public static final String COLUMNNAME_ZZ_DocStatus = "ZZ_DocStatus";

	/** Set Document Status	  */
	public void setZZ_DocStatus (String ZZ_DocStatus);

	/** Get Document Status	  */
	public String getZZ_DocStatus();

    /** Column name ZZ_WSP_ATR_EXTENSION_BATCH_ID */
    public static final String COLUMNNAME_ZZ_WSP_ATR_EXTENSION_BATCH_ID = "ZZ_WSP_ATR_EXTENSION_BATCH_ID";

	/** Set ZZ_WSP_ATR_EXTENSION_BATCH_ID	  */
	public void setZZ_WSP_ATR_EXTENSION_BATCH_ID (int ZZ_WSP_ATR_EXTENSION_BATCH_ID);

	/** Get ZZ_WSP_ATR_EXTENSION_BATCH_ID	  */
	public int getZZ_WSP_ATR_EXTENSION_BATCH_ID();

    /** Column name ZZ_WSP_ATR_EXTENSION_BATCH_UU */
    public static final String COLUMNNAME_ZZ_WSP_ATR_EXTENSION_BATCH_UU = "ZZ_WSP_ATR_EXTENSION_BATCH_UU";

	/** Set ZZ_WSP_ATR_EXTENSION_BATCH_UU	  */
	public void setZZ_WSP_ATR_EXTENSION_BATCH_UU (String ZZ_WSP_ATR_EXTENSION_BATCH_UU);

	/** Get ZZ_WSP_ATR_EXTENSION_BATCH_UU	  */
	public String getZZ_WSP_ATR_EXTENSION_BATCH_UU();

    /** Column name ZZ_WSP_ATR_Ext_End_Date */
    public static final String COLUMNNAME_ZZ_WSP_ATR_Ext_End_Date = "ZZ_WSP_ATR_Ext_End_Date";

	/** Set WSP-ATR Extension End Date	  */
	public void setZZ_WSP_ATR_Ext_End_Date (Timestamp ZZ_WSP_ATR_Ext_End_Date);

	/** Get WSP-ATR Extension End Date	  */
	public Timestamp getZZ_WSP_ATR_Ext_End_Date();

    /** Column name ZZ_WSP_ATR_Ext_Start_Date */
    public static final String COLUMNNAME_ZZ_WSP_ATR_Ext_Start_Date = "ZZ_WSP_ATR_Ext_Start_Date";

	/** Set WSP-ATR Extension Start Date	  */
	public void setZZ_WSP_ATR_Ext_Start_Date (Timestamp ZZ_WSP_ATR_Ext_Start_Date);

	/** Get WSP-ATR Extension Start Date	  */
	public Timestamp getZZ_WSP_ATR_Ext_Start_Date();
}
