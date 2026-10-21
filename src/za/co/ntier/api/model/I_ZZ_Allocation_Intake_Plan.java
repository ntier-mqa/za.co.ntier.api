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

/** Generated Interface for ZZ_Allocation_Intake_Plan
 *  @author iDempiere (generated) 
 *  @version Release 12
 */
@SuppressWarnings("all")
public interface I_ZZ_Allocation_Intake_Plan 
{

    /** TableName=ZZ_Allocation_Intake_Plan */
    public static final String Table_Name = "ZZ_Allocation_Intake_Plan";

    /** AD_Table_ID=1000390 */
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
	  * Active
	  */
	public void setIsActive (boolean IsActive);

	/** Get Active.
	  * Active
	  */
	public boolean isActive();

    /** Column name LineNo */
    public static final String COLUMNNAME_LineNo = "LineNo";

	/** Set Line No.
	  * Line No
	  */
	public void setLineNo (int LineNo);

	/** Get Line No.
	  * Line No
	  */
	public int getLineNo();

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

    /** Column name ZZIntakeDate */
    public static final String COLUMNNAME_ZZIntakeDate = "ZZIntakeDate";

	/** Set Intake Date.
	  * Intake Date
	  */
	public void setZZIntakeDate (Timestamp ZZIntakeDate);

	/** Get Intake Date.
	  * Intake Date
	  */
	public Timestamp getZZIntakeDate();

    /** Column name ZZNoLearners */
    public static final String COLUMNNAME_ZZNoLearners = "ZZNoLearners";

	/** Set No Learners.
	  * Number of Learners
	  */
	public void setZZNoLearners (int ZZNoLearners);

	/** Get No Learners.
	  * Number of Learners
	  */
	public int getZZNoLearners();

    /** Column name ZZQualification_ID */
    public static final String COLUMNNAME_ZZQualification_ID = "ZZQualification_ID";

	/** Set Qualification.
	  * Qualification
	  */
	public void setZZQualification_ID (int ZZQualification_ID);

	/** Get Qualification.
	  * Qualification
	  */
	public int getZZQualification_ID();

    /** Column name ZZTradeName */
    public static final String COLUMNNAME_ZZTradeName = "ZZTradeName";

	/** Set Trade Name.
	  * Trade / Qualification Name
	  */
	public void setZZTradeName (String ZZTradeName);

	/** Get Trade Name.
	  * Trade / Qualification Name
	  */
	public String getZZTradeName();

    /** Column name ZZ_Allocation_Intake_Plan_ID */
    public static final String COLUMNNAME_ZZ_Allocation_Intake_Plan_ID = "ZZ_Allocation_Intake_Plan_ID";

	/** Set Intake Plan Line.
	  * Intake Plan Line
	  */
	public void setZZ_Allocation_Intake_Plan_ID (int ZZ_Allocation_Intake_Plan_ID);

	/** Get Intake Plan Line.
	  * Intake Plan Line
	  */
	public int getZZ_Allocation_Intake_Plan_ID();

    /** Column name ZZ_Allocation_Intake_Plan_UU */
    public static final String COLUMNNAME_ZZ_Allocation_Intake_Plan_UU = "ZZ_Allocation_Intake_Plan_UU";

	/** Set UUID.
	  * UUID
	  */
	public void setZZ_Allocation_Intake_Plan_UU (String ZZ_Allocation_Intake_Plan_UU);

	/** Get UUID.
	  * UUID
	  */
	public String getZZ_Allocation_Intake_Plan_UU();

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

	public I_ZZ_Allocation_Offer getZZ_Allocation_Offer() throws RuntimeException;

    /** Column name ZZ_Trade_ID */
    public static final String COLUMNNAME_ZZ_Trade_ID = "ZZ_Trade_ID";

	/** Set Trade.
	  * Trade
	  */
	public void setZZ_Trade_ID (int ZZ_Trade_ID);

	/** Get Trade.
	  * Trade
	  */
	public int getZZ_Trade_ID();

	public I_ZZ_Trade getZZ_Trade() throws RuntimeException;
}
