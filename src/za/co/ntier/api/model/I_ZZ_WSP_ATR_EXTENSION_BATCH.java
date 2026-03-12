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

    /** AD_Table_ID=1000195 */
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

    /** Column name ZZ_CEO_ID */
    public static final String COLUMNNAME_ZZ_CEO_ID = "ZZ_CEO_ID";

	/** Set CEO	  */
	public void setZZ_CEO_ID (int ZZ_CEO_ID);

	/** Get CEO	  */
	public int getZZ_CEO_ID();

	public org.compiere.model.I_AD_User getZZ_CEO() throws RuntimeException;

    /** Column name ZZ_COO_ID */
    public static final String COLUMNNAME_ZZ_COO_ID = "ZZ_COO_ID";

	/** Set COO	  */
	public void setZZ_COO_ID (int ZZ_COO_ID);

	/** Get COO	  */
	public int getZZ_COO_ID();

	public org.compiere.model.I_AD_User getZZ_COO() throws RuntimeException;

    /** Column name ZZ_Date_Not_Recom_CEO */
    public static final String COLUMNNAME_ZZ_Date_Not_Recom_CEO = "ZZ_Date_Not_Recom_CEO";

	/** Set Date Not Approved By CEO	  */
	public void setZZ_Date_Not_Recom_CEO (Timestamp ZZ_Date_Not_Recom_CEO);

	/** Get Date Not Approved By CEO	  */
	public Timestamp getZZ_Date_Not_Recom_CEO();

    /** Column name ZZ_Date_Not_Recom_COO */
    public static final String COLUMNNAME_ZZ_Date_Not_Recom_COO = "ZZ_Date_Not_Recom_COO";

	/** Set Date Not Recommended By COO	  */
	public void setZZ_Date_Not_Recom_COO (Timestamp ZZ_Date_Not_Recom_COO);

	/** Get Date Not Recommended By COO	  */
	public Timestamp getZZ_Date_Not_Recom_COO();

    /** Column name ZZ_Date_Not_Recom_MQA_Board */
    public static final String COLUMNNAME_ZZ_Date_Not_Recom_MQA_Board = "ZZ_Date_Not_Recom_MQA_Board";

	/** Set Date Not Approved By MQA Board	  */
	public void setZZ_Date_Not_Recom_MQA_Board (Timestamp ZZ_Date_Not_Recom_MQA_Board);

	/** Get Date Not Approved By MQA Board	  */
	public Timestamp getZZ_Date_Not_Recom_MQA_Board();

    /** Column name ZZ_Date_Not_Recom_Snr_Mgr_SDR */
    public static final String COLUMNNAME_ZZ_Date_Not_Recom_Snr_Mgr_SDR = "ZZ_Date_Not_Recom_Snr_Mgr_SDR";

	/** Set Date Not Recommended By Snr Mgr SDR	  */
	public void setZZ_Date_Not_Recom_Snr_Mgr_SDR (Timestamp ZZ_Date_Not_Recom_Snr_Mgr_SDR);

	/** Get Date Not Recommended By Snr Mgr SDR	  */
	public Timestamp getZZ_Date_Not_Recom_Snr_Mgr_SDR();

    /** Column name ZZ_Date_Recom_Snr_Mgr_SDR */
    public static final String COLUMNNAME_ZZ_Date_Recom_Snr_Mgr_SDR = "ZZ_Date_Recom_Snr_Mgr_SDR";

	/** Set Date Recommended By Snr Mgr SDR	  */
	public void setZZ_Date_Recom_Snr_Mgr_SDR (Timestamp ZZ_Date_Recom_Snr_Mgr_SDR);

	/** Get Date Recommended By Snr Mgr SDR	  */
	public Timestamp getZZ_Date_Recom_Snr_Mgr_SDR();

    /** Column name ZZ_Date_Recomm_CEO */
    public static final String COLUMNNAME_ZZ_Date_Recomm_CEO = "ZZ_Date_Recomm_CEO";

	/** Set Date Recommended By CEO	  */
	public void setZZ_Date_Recomm_CEO (Timestamp ZZ_Date_Recomm_CEO);

	/** Get Date Recommended By CEO	  */
	public Timestamp getZZ_Date_Recomm_CEO();

    /** Column name ZZ_Date_Recomm_COO */
    public static final String COLUMNNAME_ZZ_Date_Recomm_COO = "ZZ_Date_Recomm_COO";

	/** Set Date Recommended By COO	  */
	public void setZZ_Date_Recomm_COO (Timestamp ZZ_Date_Recomm_COO);

	/** Get Date Recommended By COO	  */
	public Timestamp getZZ_Date_Recomm_COO();

    /** Column name ZZ_Date_Recomm_MQA_Board */
    public static final String COLUMNNAME_ZZ_Date_Recomm_MQA_Board = "ZZ_Date_Recomm_MQA_Board";

	/** Set Date Recommended By MQA Board	  */
	public void setZZ_Date_Recomm_MQA_Board (Timestamp ZZ_Date_Recomm_MQA_Board);

	/** Get Date Recommended By MQA Board	  */
	public Timestamp getZZ_Date_Recomm_MQA_Board();

    /** Column name ZZ_Date_Submitted */
    public static final String COLUMNNAME_ZZ_Date_Submitted = "ZZ_Date_Submitted";

	/** Set Date Submitted	  */
	public void setZZ_Date_Submitted (Timestamp ZZ_Date_Submitted);

	/** Get Date Submitted	  */
	public Timestamp getZZ_Date_Submitted();

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

    /** Column name ZZ_MQA_BOARD_ID */
    public static final String COLUMNNAME_ZZ_MQA_BOARD_ID = "ZZ_MQA_BOARD_ID";

	/** Set MQA Board	  */
	public void setZZ_MQA_BOARD_ID (int ZZ_MQA_BOARD_ID);

	/** Get MQA Board	  */
	public int getZZ_MQA_BOARD_ID();

	public org.compiere.model.I_AD_User getZZ_MQA_BOARD() throws RuntimeException;

    /** Column name ZZ_Recommender_ID */
    public static final String COLUMNNAME_ZZ_Recommender_ID = "ZZ_Recommender_ID";

	/** Set Recommender	  */
	public void setZZ_Recommender_ID (int ZZ_Recommender_ID);

	/** Get Recommender	  */
	public int getZZ_Recommender_ID();

	public org.compiere.model.I_AD_User getZZ_Recommender() throws RuntimeException;

    /** Column name ZZ_Submitter_ID */
    public static final String COLUMNNAME_ZZ_Submitter_ID = "ZZ_Submitter_ID";

	/** Set Submitted By	  */
	public void setZZ_Submitter_ID (int ZZ_Submitter_ID);

	/** Get Submitted By	  */
	public int getZZ_Submitter_ID();

	public org.compiere.model.I_AD_User getZZ_Submitter() throws RuntimeException;

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
