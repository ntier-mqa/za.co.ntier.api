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

/** Generated Interface for zzlinkassessorskillsprogramme_v
 *  @author iDempiere (generated) 
 *  @version Release 12
 */
@SuppressWarnings("all")
public interface I_zzlinkassessorskillsprogramme_v 
{

    /** TableName=zzlinkassessorskillsprogramme_v */
    public static final String Table_Name = "zzlinkassessorskillsprogramme_v";

    /** AD_Table_ID=1000251 */
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

    /** Column name Comments */
    public static final String COLUMNNAME_Comments = "Comments";

	/** Set Comments.
	  * Comments or additional information
	  */
	public void setComments (String Comments);

	/** Get Comments.
	  * Comments or additional information
	  */
	public String getComments();

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

    /** Column name Registrationenddate */
    public static final String COLUMNNAME_Registrationenddate = "Registrationenddate";

	/** Set Registration End Date	  */
	public void setRegistrationenddate (Timestamp Registrationenddate);

	/** Get Registration End Date	  */
	public Timestamp getRegistrationenddate();

    /** Column name Registrationstartdate */
    public static final String COLUMNNAME_Registrationstartdate = "Registrationstartdate";

	/** Set Registration Start Date	  */
	public void setRegistrationstartdate (Timestamp Registrationstartdate);

	/** Get Registration Start Date	  */
	public Timestamp getRegistrationstartdate();

    /** Column name UpdateRecommendComment */
    public static final String COLUMNNAME_UpdateRecommendComment = "UpdateRecommendComment";

	/** Set Update Recommend or Comment	  */
	public void setUpdateRecommendComment (String UpdateRecommendComment);

	/** Get Update Recommend or Comment	  */
	public String getUpdateRecommendComment();

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

    /** Column name ZZAssessorPerson_ID */
    public static final String COLUMNNAME_ZZAssessorPerson_ID = "ZZAssessorPerson_ID";

	/** Set Assessor Person	  */
	public void setZZAssessorPerson_ID (int ZZAssessorPerson_ID);

	/** Get Assessor Person	  */
	public int getZZAssessorPerson_ID();

    /** Column name ZZCredits */
    public static final String COLUMNNAME_ZZCredits = "ZZCredits";

	/** Set Credits	  */
	public void setZZCredits (int ZZCredits);

	/** Get Credits	  */
	public int getZZCredits();

    /** Column name ZZLinkAssessorSkillsProgramme_ID */
    public static final String COLUMNNAME_ZZLinkAssessorSkillsProgramme_ID = "ZZLinkAssessorSkillsProgramme_ID";

	/** Set Link Assessor Skills Programme.
	  * Link Assessor Skills Programme
	  */
	public void setZZLinkAssessorSkillsProgramme_ID (int ZZLinkAssessorSkillsProgramme_ID);

	/** Get Link Assessor Skills Programme.
	  * Link Assessor Skills Programme
	  */
	public int getZZLinkAssessorSkillsProgramme_ID();

    /** Column name ZZLinkAssessorSkillsProgramme_v_ID */
    public static final String COLUMNNAME_ZZLinkAssessorSkillsProgramme_v_ID = "ZZLinkAssessorSkillsProgramme_v_ID";

	/** Set Link Assessor Skills Programme View.
	  * Link Assessor Skills Programme View
	  */
	public void setZZLinkAssessorSkillsProgramme_v_ID (int ZZLinkAssessorSkillsProgramme_v_ID);

	/** Get Link Assessor Skills Programme View.
	  * Link Assessor Skills Programme View
	  */
	public int getZZLinkAssessorSkillsProgramme_v_ID();

    /** Column name ZZLinkAssessorSkillsProgramme_v_UU */
    public static final String COLUMNNAME_ZZLinkAssessorSkillsProgramme_v_UU = "ZZLinkAssessorSkillsProgramme_v_UU";

	/** Set Link Assessor Skills Programme View UU	  */
	public void setZZLinkAssessorSkillsProgramme_v_UU (String ZZLinkAssessorSkillsProgramme_v_UU);

	/** Get Link Assessor Skills Programme View UU	  */
	public String getZZLinkAssessorSkillsProgramme_v_UU();

    /** Column name ZZQctoSkillsProgramme_ID */
    public static final String COLUMNNAME_ZZQctoSkillsProgramme_ID = "ZZQctoSkillsProgramme_ID";

	/** Set QCTO Skills Programme	  */
	public void setZZQctoSkillsProgramme_ID (int ZZQctoSkillsProgramme_ID);

	/** Get QCTO Skills Programme	  */
	public int getZZQctoSkillsProgramme_ID();

    /** Column name ZZSkillsProgrammeCode */
    public static final String COLUMNNAME_ZZSkillsProgrammeCode = "ZZSkillsProgrammeCode";

	/** Set SkillsProgramme Code	  */
	public void setZZSkillsProgrammeCode (String ZZSkillsProgrammeCode);

	/** Get SkillsProgramme Code	  */
	public String getZZSkillsProgrammeCode();

    /** Column name ZZSkillsProgrammeTitle */
    public static final String COLUMNNAME_ZZSkillsProgrammeTitle = "ZZSkillsProgrammeTitle";

	/** Set Skills Programme Title	  */
	public void setZZSkillsProgrammeTitle (String ZZSkillsProgrammeTitle);

	/** Get Skills Programme Title	  */
	public String getZZSkillsProgrammeTitle();

    /** Column name ZZSkillsProgramme_ID */
    public static final String COLUMNNAME_ZZSkillsProgramme_ID = "ZZSkillsProgramme_ID";

	/** Set Skills Programme	  */
	public void setZZSkillsProgramme_ID (int ZZSkillsProgramme_ID);

	/** Get Skills Programme	  */
	public int getZZSkillsProgramme_ID();

    /** Column name ZZ_isRecommended */
    public static final String COLUMNNAME_ZZ_isRecommended = "ZZ_isRecommended";

	/** Set Recommended	  */
	public void setZZ_isRecommended (String ZZ_isRecommended);

	/** Get Recommended	  */
	public String getZZ_isRecommended();
}
