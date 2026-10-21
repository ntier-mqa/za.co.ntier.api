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

/** Generated Interface for ZZ_Allocation_Offer
 *  @author iDempiere (generated) 
 *  @version Release 12
 */
@SuppressWarnings("all")
public interface I_ZZ_Allocation_Offer 
{

    /** TableName=ZZ_Allocation_Offer */
    public static final String Table_Name = "ZZ_Allocation_Offer";

    /** AD_Table_ID=1000389 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 3 - Client - Org 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /** Column name AD_Client_ID */
    public static final String COLUMNNAME_AD_Client_ID = "AD_Client_ID";

	/** Get Tenant.
	  * Tenant
	  */
	public int getAD_Client_ID();

    /** Column name AD_Org_ID */
    public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

	/** Set Unit.
	  * Unit
	  */
	public void setAD_Org_ID (int AD_Org_ID);

	/** Get Unit.
	  * Unit
	  */
	public int getAD_Org_ID();

    /** Column name AD_User_ID */
    public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";

	/** Set Submitting User.
	  * Submitting User
	  */
	public void setAD_User_ID (int AD_User_ID);

	/** Get Submitting User.
	  * Submitting User
	  */
	public int getAD_User_ID();

	public org.compiere.model.I_AD_User getAD_User() throws RuntimeException;

    /** Column name C_BPartner_ID */
    public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";

	/** Set Organisation.
	  * Organisation
	  */
	public void setC_BPartner_ID (int C_BPartner_ID);

	/** Get Organisation.
	  * Organisation
	  */
	public int getC_BPartner_ID();

	public org.compiere.model.I_C_BPartner getC_BPartner() throws RuntimeException;

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

    /** Column name DateDoc */
    public static final String COLUMNNAME_DateDoc = "DateDoc";

	/** Set Document Date.
	  * Document Date
	  */
	public void setDateDoc (Timestamp DateDoc);

	/** Get Document Date.
	  * Document Date
	  */
	public Timestamp getDateDoc();

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
	  * Active
	  */
	public void setIsActive (boolean IsActive);

	/** Get Active.
	  * Active
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

    /** Column name ZZAcceptedLearners */
    public static final String COLUMNNAME_ZZAcceptedLearners = "ZZAcceptedLearners";

	/** Set Accepted Learners.
	  * Accepted Learners
	  */
	public void setZZAcceptedLearners (int ZZAcceptedLearners);

	/** Get Accepted Learners.
	  * Accepted Learners
	  */
	public int getZZAcceptedLearners();

    /** Column name ZZAllocatedLearners */
    public static final String COLUMNNAME_ZZAllocatedLearners = "ZZAllocatedLearners";

	/** Set Allocated Learners.
	  * Allocated Learners
	  */
	public void setZZAllocatedLearners (int ZZAllocatedLearners);

	/** Get Allocated Learners.
	  * Allocated Learners
	  */
	public int getZZAllocatedLearners();

    /** Column name ZZOfferDecision */
    public static final String COLUMNNAME_ZZOfferDecision = "ZZOfferDecision";

	/** Set Offer Decision.
	  * Offer Decision
	  */
	public void setZZOfferDecision (String ZZOfferDecision);

	/** Get Offer Decision.
	  * Offer Decision
	  */
	public String getZZOfferDecision();

    /** Column name ZZ_Allocation_Offer_ID */
    public static final String COLUMNNAME_ZZ_Allocation_Offer_ID = "ZZ_Allocation_Offer_ID";

	/** Set Allocation Offer.
	  * Allocation Offer
	  */
	public void setZZ_Allocation_Offer_ID (int ZZ_Allocation_Offer_ID);

	/** Get Allocation Offer.
	  * Allocation Offer
	  */
	public int getZZ_Allocation_Offer_ID();

    /** Column name ZZ_Allocation_Offer_UU */
    public static final String COLUMNNAME_ZZ_Allocation_Offer_UU = "ZZ_Allocation_Offer_UU";

	/** Set UUID.
	  * UUID
	  */
	public void setZZ_Allocation_Offer_UU (String ZZ_Allocation_Offer_UU);

	/** Get UUID.
	  * UUID
	  */
	public String getZZ_Allocation_Offer_UU();

    /** Column name ZZ_Application_Form_ID */
    public static final String COLUMNNAME_ZZ_Application_Form_ID = "ZZ_Application_Form_ID";

	/** Set Application Form.
	  * Application Form
	  */
	public void setZZ_Application_Form_ID (int ZZ_Application_Form_ID);

	/** Get Application Form.
	  * Application Form
	  */
	public int getZZ_Application_Form_ID();

    /** Column name ZZ_DocStatus */
    public static final String COLUMNNAME_ZZ_DocStatus = "ZZ_DocStatus";

	/** Set Document Status	  */
	public void setZZ_DocStatus (String ZZ_DocStatus);

	/** Get Document Status	  */
	public String getZZ_DocStatus();

    /** Column name ZZ_Program_Master_Data_ID */
    public static final String COLUMNNAME_ZZ_Program_Master_Data_ID = "ZZ_Program_Master_Data_ID";

	/** Set Programme.
	  * Programme
	  */
	public void setZZ_Program_Master_Data_ID (int ZZ_Program_Master_Data_ID);

	/** Get Programme.
	  * Programme
	  */
	public int getZZ_Program_Master_Data_ID();

    /** Column name ZZ_Reason */
    public static final String COLUMNNAME_ZZ_Reason = "ZZ_Reason";

	/** Set Reason.
	  * Decline / Query Reason
	  */
	public void setZZ_Reason (String ZZ_Reason);

	/** Get Reason.
	  * Decline / Query Reason
	  */
	public String getZZ_Reason();
}
