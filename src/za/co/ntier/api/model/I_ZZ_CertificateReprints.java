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

/** Generated Interface for ZZ_CertificateReprints
 *  @author iDempiere (generated) 
 *  @version Release 12
 */
@SuppressWarnings("all")
public interface I_ZZ_CertificateReprints 
{

    /** TableName=ZZ_CertificateReprints */
    public static final String Table_Name = "ZZ_CertificateReprints";

    /** AD_Table_ID=1000381 */
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

    /** Column name ZZLearnerLearnership_ID */
    public static final String COLUMNNAME_ZZLearnerLearnership_ID = "ZZLearnerLearnership_ID";

	/** Set Learnership	  */
	public void setZZLearnerLearnership_ID (int ZZLearnerLearnership_ID);

	/** Get Learnership	  */
	public int getZZLearnerLearnership_ID();

	public I_ZZLearnerLearnership getZZLearnerLearnership() throws RuntimeException;

    /** Column name ZZLearnerSkillsProgramme_ID */
    public static final String COLUMNNAME_ZZLearnerSkillsProgramme_ID = "ZZLearnerSkillsProgramme_ID";

	/** Set Skills Programme	  */
	public void setZZLearnerSkillsProgramme_ID (int ZZLearnerSkillsProgramme_ID);

	/** Get Skills Programme	  */
	public int getZZLearnerSkillsProgramme_ID();

	public I_ZZLearnerSkillsProgramme getZZLearnerSkillsProgramme() throws RuntimeException;

    /** Column name ZZReprintDate */
    public static final String COLUMNNAME_ZZReprintDate = "ZZReprintDate";

	/** Set Reprint Date	  */
	public void setZZReprintDate (Timestamp ZZReprintDate);

	/** Get Reprint Date	  */
	public Timestamp getZZReprintDate();

    /** Column name ZZReprintedBy */
    public static final String COLUMNNAME_ZZReprintedBy = "ZZReprintedBy";

	/** Set Reprinted By	  */
	public void setZZReprintedBy (int ZZReprintedBy);

	/** Get Reprinted By	  */
	public int getZZReprintedBy();

	public org.compiere.model.I_AD_User getZZReprinte() throws RuntimeException;

    /** Column name ZZ_CertificateReprints_ID */
    public static final String COLUMNNAME_ZZ_CertificateReprints_ID = "ZZ_CertificateReprints_ID";

	/** Set Certificates Reprints	  */
	public void setZZ_CertificateReprints_ID (int ZZ_CertificateReprints_ID);

	/** Get Certificates Reprints	  */
	public int getZZ_CertificateReprints_ID();

    /** Column name ZZ_CertificateReprints_UU */
    public static final String COLUMNNAME_ZZ_CertificateReprints_UU = "ZZ_CertificateReprints_UU";

	/** Set ZZ_CertificateReprints_UU	  */
	public void setZZ_CertificateReprints_UU (String ZZ_CertificateReprints_UU);

	/** Get ZZ_CertificateReprints_UU	  */
	public String getZZ_CertificateReprints_UU();
}
