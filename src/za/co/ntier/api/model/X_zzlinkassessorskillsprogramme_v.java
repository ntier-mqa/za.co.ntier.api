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
/** Generated Model - DO NOT CHANGE */
package za.co.ntier.api.model;

import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Properties;
import org.compiere.model.*;

/** Generated Model for zzlinkassessorskillsprogramme_v
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="zzlinkassessorskillsprogramme_v")
public class X_zzlinkassessorskillsprogramme_v extends PO implements I_zzlinkassessorskillsprogramme_v, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20260709L;

    /** Standard Constructor */
    public X_zzlinkassessorskillsprogramme_v (Properties ctx, int zzlinkassessorskillsprogramme_v_ID, String trxName)
    {
      super (ctx, zzlinkassessorskillsprogramme_v_ID, trxName);
      /** if (zzlinkassessorskillsprogramme_v_ID == 0)
        {
        } */
    }

    /** Standard Constructor */
    public X_zzlinkassessorskillsprogramme_v (Properties ctx, int zzlinkassessorskillsprogramme_v_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, zzlinkassessorskillsprogramme_v_ID, trxName, virtualColumns);
      /** if (zzlinkassessorskillsprogramme_v_ID == 0)
        {
        } */
    }

    /** Standard Constructor */
    public X_zzlinkassessorskillsprogramme_v (Properties ctx, String zzlinkassessorskillsprogramme_v_UU, String trxName)
    {
      super (ctx, zzlinkassessorskillsprogramme_v_UU, trxName);
      /** if (zzlinkassessorskillsprogramme_v_UU == null)
        {
        } */
    }

    /** Standard Constructor */
    public X_zzlinkassessorskillsprogramme_v (Properties ctx, String zzlinkassessorskillsprogramme_v_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, zzlinkassessorskillsprogramme_v_UU, trxName, virtualColumns);
      /** if (zzlinkassessorskillsprogramme_v_UU == null)
        {
        } */
    }

    /** Load Constructor */
    public X_zzlinkassessorskillsprogramme_v (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 3 - Client - Org
      */
    protected int get_AccessLevel()
    {
      return accessLevel.intValue();
    }

    /** Load Meta Data */
    protected POInfo initPO (Properties ctx)
    {
      POInfo poi = POInfo.getPOInfo (ctx, Table_ID, get_TrxName());
      return poi;
    }

    public String toString()
    {
      StringBuilder sb = new StringBuilder ("X_zzlinkassessorskillsprogramme_v[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Comments.
		@param Comments Comments or additional information
	*/
	public void setComments (String Comments)
	{
		set_ValueNoCheck (COLUMNNAME_Comments, Comments);
	}

	/** Get Comments.
		@return Comments or additional information
	  */
	public String getComments()
	{
		return (String)get_Value(COLUMNNAME_Comments);
	}

	/** Set Registration End Date.
		@param Registrationenddate Registration End Date
	*/
	public void setRegistrationenddate (Timestamp Registrationenddate)
	{
		set_Value (COLUMNNAME_Registrationenddate, Registrationenddate);
	}

	/** Get Registration End Date.
		@return Registration End Date	  */
	public Timestamp getRegistrationenddate()
	{
		return (Timestamp)get_Value(COLUMNNAME_Registrationenddate);
	}

	/** Set Registration Start Date.
		@param Registrationstartdate Registration Start Date
	*/
	public void setRegistrationstartdate (Timestamp Registrationstartdate)
	{
		set_Value (COLUMNNAME_Registrationstartdate, Registrationstartdate);
	}

	/** Get Registration Start Date.
		@return Registration Start Date	  */
	public Timestamp getRegistrationstartdate()
	{
		return (Timestamp)get_Value(COLUMNNAME_Registrationstartdate);
	}

	/** Set Update Recommend or Comment.
		@param UpdateRecommendComment Update Recommend or Comment
	*/
	public void setUpdateRecommendComment (String UpdateRecommendComment)
	{
		set_Value (COLUMNNAME_UpdateRecommendComment, UpdateRecommendComment);
	}

	/** Get Update Recommend or Comment.
		@return Update Recommend or Comment	  */
	public String getUpdateRecommendComment()
	{
		return (String)get_Value(COLUMNNAME_UpdateRecommendComment);
	}

	/** Set Assessor Person.
		@param ZZAssessorPerson_ID Assessor Person
	*/
	public void setZZAssessorPerson_ID (int ZZAssessorPerson_ID)
	{
		if (ZZAssessorPerson_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZAssessorPerson_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZAssessorPerson_ID, Integer.valueOf(ZZAssessorPerson_ID));
	}

	/** Get Assessor Person.
		@return Assessor Person	  */
	public int getZZAssessorPerson_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZAssessorPerson_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Credits.
		@param ZZCredits Credits
	*/
	public void setZZCredits (int ZZCredits)
	{
		set_Value (COLUMNNAME_ZZCredits, Integer.valueOf(ZZCredits));
	}

	/** Get Credits.
		@return Credits	  */
	public int getZZCredits()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZCredits);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Link Assessor Skills Programme.
		@param ZZLinkAssessorSkillsProgramme_ID Link Assessor Skills Programme
	*/
	public void setZZLinkAssessorSkillsProgramme_ID (int ZZLinkAssessorSkillsProgramme_ID)
	{
		if (ZZLinkAssessorSkillsProgramme_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZLinkAssessorSkillsProgramme_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZLinkAssessorSkillsProgramme_ID, Integer.valueOf(ZZLinkAssessorSkillsProgramme_ID));
	}

	/** Get Link Assessor Skills Programme.
		@return Link Assessor Skills Programme
	  */
	public int getZZLinkAssessorSkillsProgramme_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZLinkAssessorSkillsProgramme_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Link Assessor Skills Programme View.
		@param ZZLinkAssessorSkillsProgramme_v_ID Link Assessor Skills Programme View
	*/
	public void setZZLinkAssessorSkillsProgramme_v_ID (int ZZLinkAssessorSkillsProgramme_v_ID)
	{
		if (ZZLinkAssessorSkillsProgramme_v_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZLinkAssessorSkillsProgramme_v_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZLinkAssessorSkillsProgramme_v_ID, Integer.valueOf(ZZLinkAssessorSkillsProgramme_v_ID));
	}

	/** Get Link Assessor Skills Programme View.
		@return Link Assessor Skills Programme View
	  */
	public int getZZLinkAssessorSkillsProgramme_v_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZLinkAssessorSkillsProgramme_v_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Link Assessor Skills Programme View UU.
		@param ZZLinkAssessorSkillsProgramme_v_UU Link Assessor Skills Programme View UU
	*/
	public void setZZLinkAssessorSkillsProgramme_v_UU (String ZZLinkAssessorSkillsProgramme_v_UU)
	{
		set_Value (COLUMNNAME_ZZLinkAssessorSkillsProgramme_v_UU, ZZLinkAssessorSkillsProgramme_v_UU);
	}

	/** Get Link Assessor Skills Programme View UU.
		@return Link Assessor Skills Programme View UU	  */
	public String getZZLinkAssessorSkillsProgramme_v_UU()
	{
		return (String)get_Value(COLUMNNAME_ZZLinkAssessorSkillsProgramme_v_UU);
	}

	/** Set QCTO Skills Programme.
		@param ZZQctoSkillsProgramme_ID QCTO Skills Programme
	*/
	public void setZZQctoSkillsProgramme_ID (int ZZQctoSkillsProgramme_ID)
	{
		if (ZZQctoSkillsProgramme_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZQctoSkillsProgramme_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZQctoSkillsProgramme_ID, Integer.valueOf(ZZQctoSkillsProgramme_ID));
	}

	/** Get QCTO Skills Programme.
		@return QCTO Skills Programme	  */
	public int getZZQctoSkillsProgramme_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZQctoSkillsProgramme_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set SkillsProgramme Code.
		@param ZZSkillsProgrammeCode SkillsProgramme Code
	*/
	public void setZZSkillsProgrammeCode (String ZZSkillsProgrammeCode)
	{
		set_Value (COLUMNNAME_ZZSkillsProgrammeCode, ZZSkillsProgrammeCode);
	}

	/** Get SkillsProgramme Code.
		@return SkillsProgramme Code	  */
	public String getZZSkillsProgrammeCode()
	{
		return (String)get_Value(COLUMNNAME_ZZSkillsProgrammeCode);
	}

	/** Set Skills Programme Title.
		@param ZZSkillsProgrammeTitle Skills Programme Title
	*/
	public void setZZSkillsProgrammeTitle (String ZZSkillsProgrammeTitle)
	{
		set_Value (COLUMNNAME_ZZSkillsProgrammeTitle, ZZSkillsProgrammeTitle);
	}

	/** Get Skills Programme Title.
		@return Skills Programme Title	  */
	public String getZZSkillsProgrammeTitle()
	{
		return (String)get_Value(COLUMNNAME_ZZSkillsProgrammeTitle);
	}

	/** Set Skills Programme.
		@param ZZSkillsProgramme_ID Skills Programme
	*/
	public void setZZSkillsProgramme_ID (int ZZSkillsProgramme_ID)
	{
		if (ZZSkillsProgramme_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZSkillsProgramme_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZSkillsProgramme_ID, Integer.valueOf(ZZSkillsProgramme_ID));
	}

	/** Get Skills Programme.
		@return Skills Programme	  */
	public int getZZSkillsProgramme_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZSkillsProgramme_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** No = N */
	public static final String ZZ_ISRECOMMENDED_No = "N";
	/** Yes = Y */
	public static final String ZZ_ISRECOMMENDED_Yes = "Y";
	/** Set Recommended.
		@param ZZ_isRecommended Recommended
	*/
	public void setZZ_isRecommended (String ZZ_isRecommended)
	{

		set_ValueNoCheck (COLUMNNAME_ZZ_isRecommended, ZZ_isRecommended);
	}

	/** Get Recommended.
		@return Recommended	  */
	public String getZZ_isRecommended()
	{
		return (String)get_Value(COLUMNNAME_ZZ_isRecommended);
	}
}