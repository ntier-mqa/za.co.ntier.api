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

/** Generated Interface for ZZ_ArtisanReqBatch
 *  @author iDempiere (generated) 
 *  @version Release 12
 */
@SuppressWarnings("all")
public interface I_ZZ_ArtisanReqBatch 
{

    /** TableName=ZZ_ArtisanReqBatch */
    public static final String Table_Name = "ZZ_ArtisanReqBatch";

    /** AD_Table_ID=1000646 */
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

    /** Column name DocStatus */
    public static final String COLUMNNAME_DocStatus = "DocStatus";

	/** Set Document Status.
	  * The current status of the document
	  */
	public void setDocStatus (String DocStatus);

	/** Get Document Status.
	  * The current status of the document
	  */
	public String getDocStatus();

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

    /** Column name ZZ_ArtisanReqBatch_ID */
    public static final String COLUMNNAME_ZZ_ArtisanReqBatch_ID = "ZZ_ArtisanReqBatch_ID";

	/** Set Artisan Serial Number Request Batch	  */
	public void setZZ_ArtisanReqBatch_ID (int ZZ_ArtisanReqBatch_ID);

	/** Get Artisan Serial Number Request Batch	  */
	public int getZZ_ArtisanReqBatch_ID();

    /** Column name ZZ_ArtisanReqBatch_UU */
    public static final String COLUMNNAME_ZZ_ArtisanReqBatch_UU = "ZZ_ArtisanReqBatch_UU";

	/** Set ZZ_ArtisanReqBatch_UU	  */
	public void setZZ_ArtisanReqBatch_UU (String ZZ_ArtisanReqBatch_UU);

	/** Get ZZ_ArtisanReqBatch_UU	  */
	public String getZZ_ArtisanReqBatch_UU();

    /** Column name ZZ_SDP_ID */
    public static final String COLUMNNAME_ZZ_SDP_ID = "ZZ_SDP_ID";

	/** Set SDP.
	  * Lead Skills Development Provider
	  */
	public void setZZ_SDP_ID (int ZZ_SDP_ID);

	/** Get SDP.
	  * Lead Skills Development Provider
	  */
	public int getZZ_SDP_ID();

	public org.compiere.model.I_C_BPartner getZZ_SDP() throws RuntimeException;

    /** Column name ZZ_SubmittedBy_ID */
    public static final String COLUMNNAME_ZZ_SubmittedBy_ID = "ZZ_SubmittedBy_ID";

	/** Set Submitted By	  */
	public void setZZ_SubmittedBy_ID (int ZZ_SubmittedBy_ID);

	/** Get Submitted By	  */
	public int getZZ_SubmittedBy_ID();

	public org.compiere.model.I_AD_User getZZ_SubmittedBy() throws RuntimeException;
}
