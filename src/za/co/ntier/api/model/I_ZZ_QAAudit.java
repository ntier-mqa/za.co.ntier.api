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

/** Generated Interface for ZZ_QAAudit
 *  @author iDempiere (generated) 
 *  @version Release 12
 */
@SuppressWarnings("all")
public interface I_ZZ_QAAudit 
{

    /** TableName=ZZ_QAAudit */
    public static final String Table_Name = "ZZ_QAAudit";

    /** AD_Table_ID=1000238 */
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

    /** Column name DateFrom */
    public static final String COLUMNNAME_DateFrom = "DateFrom";

	/** Set Date From.
	  * Starting date for a range
	  */
	public void setDateFrom (Timestamp DateFrom);

	/** Get Date From.
	  * Starting date for a range
	  */
	public Timestamp getDateFrom();

    /** Column name DateTo */
    public static final String COLUMNNAME_DateTo = "DateTo";

	/** Set Date To.
	  * End date of a date range
	  */
	public void setDateTo (Timestamp DateTo);

	/** Get Date To.
	  * End date of a date range
	  */
	public Timestamp getDateTo();

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

    /** Column name Note */
    public static final String COLUMNNAME_Note = "Note";

	/** Set Note.
	  * Optional additional user defined information
	  */
	public void setNote (String Note);

	/** Get Note.
	  * Optional additional user defined information
	  */
	public String getNote();

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

    /** Column name ZZLegalName */
    public static final String COLUMNNAME_ZZLegalName = "ZZLegalName";

	/** Set Legal Name	  */
	public void setZZLegalName (String ZZLegalName);

	/** Get Legal Name	  */
	public String getZZLegalName();

    /** Column name ZZ_AuditLead_ID */
    public static final String COLUMNNAME_ZZ_AuditLead_ID = "ZZ_AuditLead_ID";

	/** Set ZZ_AuditLead_ID	  */
	public void setZZ_AuditLead_ID (int ZZ_AuditLead_ID);

	/** Get ZZ_AuditLead_ID	  */
	public int getZZ_AuditLead_ID();

	public org.compiere.model.I_AD_User getZZ_AuditLead() throws RuntimeException;

    /** Column name ZZ_OnsiteAssessmentDate */
    public static final String COLUMNNAME_ZZ_OnsiteAssessmentDate = "ZZ_OnsiteAssessmentDate";

	/** Set Date of Onsite Assessment	  */
	public void setZZ_OnsiteAssessmentDate (Timestamp ZZ_OnsiteAssessmentDate);

	/** Get Date of Onsite Assessment	  */
	public Timestamp getZZ_OnsiteAssessmentDate();

    /** Column name ZZ_Organization_ID */
    public static final String COLUMNNAME_ZZ_Organization_ID = "ZZ_Organization_ID";

	/** Set Organization	  */
	public void setZZ_Organization_ID (int ZZ_Organization_ID);

	/** Get Organization	  */
	public int getZZ_Organization_ID();

	public I_ZZ_Organization getZZ_Organization() throws RuntimeException;

    /** Column name ZZ_QAAudit_ID */
    public static final String COLUMNNAME_ZZ_QAAudit_ID = "ZZ_QAAudit_ID";

	/** Set QA Audit	  */
	public void setZZ_QAAudit_ID (int ZZ_QAAudit_ID);

	/** Get QA Audit	  */
	public int getZZ_QAAudit_ID();

    /** Column name ZZ_QAAudit_UU */
    public static final String COLUMNNAME_ZZ_QAAudit_UU = "ZZ_QAAudit_UU";

	/** Set ZZ_QAAudit_UU	  */
	public void setZZ_QAAudit_UU (String ZZ_QAAudit_UU);

	/** Get ZZ_QAAudit_UU	  */
	public String getZZ_QAAudit_UU();

    /** Column name ZZ_isSentToQCTONAMB */
    public static final String COLUMNNAME_ZZ_isSentToQCTONAMB = "ZZ_isSentToQCTONAMB";

	/** Set Sent to QCTO/NAMB	  */
	public void setZZ_isSentToQCTONAMB (boolean ZZ_isSentToQCTONAMB);

	/** Get Sent to QCTO/NAMB	  */
	public boolean isZZ_isSentToQCTONAMB();
}
