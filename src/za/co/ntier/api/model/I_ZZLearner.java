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

/** Generated Interface for ZZLearner
 *  @author iDempiere (generated) 
 *  @version Release 12
 */
@SuppressWarnings("all")
public interface I_ZZLearner 
{

    /** TableName=ZZLearner */
    public static final String Table_Name = "ZZLearner";

    /** AD_Table_ID=1000259 */
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

    /** Column name ZZLearner_ID */
    public static final String COLUMNNAME_ZZLearner_ID = "ZZLearner_ID";

	/** Set Learner	  */
	public void setZZLearner_ID (int ZZLearner_ID);

	/** Get Learner	  */
	public int getZZLearner_ID();

    /** Column name ZZLearner_UU */
    public static final String COLUMNNAME_ZZLearner_UU = "ZZLearner_UU";

	/** Set ZZLearner_UU	  */
	public void setZZLearner_UU (String ZZLearner_UU);

	/** Get ZZLearner_UU	  */
	public String getZZLearner_UU();

    /** Column name ZZMatriculatedLocation_ID */
    public static final String COLUMNNAME_ZZMatriculatedLocation_ID = "ZZMatriculatedLocation_ID";

	/** Set Matriculated Location	  */
	public void setZZMatriculatedLocation_ID (int ZZMatriculatedLocation_ID);

	/** Get Matriculated Location	  */
	public int getZZMatriculatedLocation_ID();

	public org.compiere.model.I_C_Location getZZMatriculatedLocation() throws RuntimeException;

    /** Column name ZZPerson_ID */
    public static final String COLUMNNAME_ZZPerson_ID = "ZZPerson_ID";

	/** Set Person	  */
	public void setZZPerson_ID (int ZZPerson_ID);

	/** Get Person	  */
	public int getZZPerson_ID();

	public I_ZZPerson getZZPerson() throws RuntimeException;

    /** Column name ZZ_ApprovedBy_ID */
    public static final String COLUMNNAME_ZZ_ApprovedBy_ID = "ZZ_ApprovedBy_ID";

	/** Set Approved By	  */
	public void setZZ_ApprovedBy_ID (int ZZ_ApprovedBy_ID);

	/** Get Approved By	  */
	public int getZZ_ApprovedBy_ID();

	public org.compiere.model.I_AD_User getZZ_ApprovedBy() throws RuntimeException;

    /** Column name ZZ_ApprovedDate */
    public static final String COLUMNNAME_ZZ_ApprovedDate = "ZZ_ApprovedDate";

	/** Set Approved Date	  */
	public void setZZ_ApprovedDate (Timestamp ZZ_ApprovedDate);

	/** Get Approved Date	  */
	public Timestamp getZZ_ApprovedDate();

    /** Column name ZZ_Date_Not_Approved */
    public static final String COLUMNNAME_ZZ_Date_Not_Approved = "ZZ_Date_Not_Approved";

	/** Set Date Not Approved	  */
	public void setZZ_Date_Not_Approved (Timestamp ZZ_Date_Not_Approved);

	/** Get Date Not Approved	  */
	public Timestamp getZZ_Date_Not_Approved();

    /** Column name ZZ_Date_Not_Recommended */
    public static final String COLUMNNAME_ZZ_Date_Not_Recommended = "ZZ_Date_Not_Recommended";

	/** Set Date Not Recommended	  */
	public void setZZ_Date_Not_Recommended (Timestamp ZZ_Date_Not_Recommended);

	/** Get Date Not Recommended	  */
	public Timestamp getZZ_Date_Not_Recommended();

    /** Column name ZZ_Date_Recommended */
    public static final String COLUMNNAME_ZZ_Date_Recommended = "ZZ_Date_Recommended";

	/** Set Date Recommended	  */
	public void setZZ_Date_Recommended (Timestamp ZZ_Date_Recommended);

	/** Get Date Recommended	  */
	public Timestamp getZZ_Date_Recommended();

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

    /** Column name ZZ_Recommender_ID */
    public static final String COLUMNNAME_ZZ_Recommender_ID = "ZZ_Recommender_ID";

	/** Set Recommender	  */
	public void setZZ_Recommender_ID (int ZZ_Recommender_ID);

	/** Get Recommender	  */
	public int getZZ_Recommender_ID();

	public org.compiere.model.I_AD_User getZZ_Recommender() throws RuntimeException;
}
