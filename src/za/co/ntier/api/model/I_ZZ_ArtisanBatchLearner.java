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

/** Generated Interface for ZZ_ArtisanBatchLearner
 *  @author iDempiere (generated) 
 *  @version Release 12
 */
@SuppressWarnings("all")
public interface I_ZZ_ArtisanBatchLearner 
{

    /** TableName=ZZ_ArtisanBatchLearner */
    public static final String Table_Name = "ZZ_ArtisanBatchLearner";

    /** AD_Table_ID=1000647 */
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

    /** Column name DocAction */
    public static final String COLUMNNAME_DocAction = "DocAction";

	/** Set Document Action.
	  * The targeted status of the document
	  */
	public void setDocAction (String DocAction);

	/** Get Document Action.
	  * The targeted status of the document
	  */
	public String getDocAction();

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

    /** Column name ZZLearnerQCTOArtisans_ID */
    public static final String COLUMNNAME_ZZLearnerQCTOArtisans_ID = "ZZLearnerQCTOArtisans_ID";

	/** Set Learner QCTO Artisans	  */
	public void setZZLearnerQCTOArtisans_ID (int ZZLearnerQCTOArtisans_ID);

	/** Get Learner QCTO Artisans	  */
	public int getZZLearnerQCTOArtisans_ID();

	public I_ZZLearnerQCTOArtisans getZZLearnerQCTOArtisans() throws RuntimeException;

    /** Column name ZZLearner_ID */
    public static final String COLUMNNAME_ZZLearner_ID = "ZZLearner_ID";

	/** Set Learner	  */
	public void setZZLearner_ID (int ZZLearner_ID);

	/** Get Learner	  */
	public int getZZLearner_ID();

	public I_ZZLearner_v getZZLearner() throws RuntimeException;

    /** Column name ZZ_ArtisanBatchLearner_ID */
    public static final String COLUMNNAME_ZZ_ArtisanBatchLearner_ID = "ZZ_ArtisanBatchLearner_ID";

	/** Set Learner	  */
	public void setZZ_ArtisanBatchLearner_ID (int ZZ_ArtisanBatchLearner_ID);

	/** Get Learner	  */
	public int getZZ_ArtisanBatchLearner_ID();

    /** Column name ZZ_ArtisanBatchLearner_UU */
    public static final String COLUMNNAME_ZZ_ArtisanBatchLearner_UU = "ZZ_ArtisanBatchLearner_UU";

	/** Set ZZ_ArtisanBatchLearner_UU	  */
	public void setZZ_ArtisanBatchLearner_UU (String ZZ_ArtisanBatchLearner_UU);

	/** Get ZZ_ArtisanBatchLearner_UU	  */
	public String getZZ_ArtisanBatchLearner_UU();

    /** Column name ZZ_ArtisanReqBatch_ID */
    public static final String COLUMNNAME_ZZ_ArtisanReqBatch_ID = "ZZ_ArtisanReqBatch_ID";

	/** Set Artisan Serial Number Request Batch	  */
	public void setZZ_ArtisanReqBatch_ID (int ZZ_ArtisanReqBatch_ID);

	/** Get Artisan Serial Number Request Batch	  */
	public int getZZ_ArtisanReqBatch_ID();

	public I_ZZ_ArtisanReqBatch getZZ_ArtisanReqBatch() throws RuntimeException;

    /** Column name ZZ_NotVerifiedBy_ID */
    public static final String COLUMNNAME_ZZ_NotVerifiedBy_ID = "ZZ_NotVerifiedBy_ID";

	/** Set Not Verified By	  */
	public void setZZ_NotVerifiedBy_ID (int ZZ_NotVerifiedBy_ID);

	/** Get Not Verified By	  */
	public int getZZ_NotVerifiedBy_ID();

	public org.compiere.model.I_AD_User getZZ_NotVerifiedBy() throws RuntimeException;

    /** Column name ZZ_SerialNumber */
    public static final String COLUMNNAME_ZZ_SerialNumber = "ZZ_SerialNumber";

	/** Set Serial Number	  */
	public void setZZ_SerialNumber (String ZZ_SerialNumber);

	/** Get Serial Number	  */
	public String getZZ_SerialNumber();

    /** Column name ZZ_VerifiedBy_ID */
    public static final String COLUMNNAME_ZZ_VerifiedBy_ID = "ZZ_VerifiedBy_ID";

	/** Set Verified By	  */
	public void setZZ_VerifiedBy_ID (int ZZ_VerifiedBy_ID);

	/** Get Verified By	  */
	public int getZZ_VerifiedBy_ID();

	public org.compiere.model.I_AD_User getZZ_VerifiedBy() throws RuntimeException;
}
