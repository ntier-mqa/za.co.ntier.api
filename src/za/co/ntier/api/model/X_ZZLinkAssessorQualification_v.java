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

/** Generated Model for ZZLinkAssessorQualification_v
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="ZZLinkAssessorQualification_v")
public class X_ZZLinkAssessorQualification_v extends PO implements I_ZZLinkAssessorQualification_v, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20260709L;

    /** Standard Constructor */
    public X_ZZLinkAssessorQualification_v (Properties ctx, int ZZLinkAssessorQualification_v_ID, String trxName)
    {
      super (ctx, ZZLinkAssessorQualification_v_ID, trxName);
      /** if (ZZLinkAssessorQualification_v_ID == 0)
        {
			setZZ_isRecommended (null);
// Y
        } */
    }

    /** Standard Constructor */
    public X_ZZLinkAssessorQualification_v (Properties ctx, int ZZLinkAssessorQualification_v_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZLinkAssessorQualification_v_ID, trxName, virtualColumns);
      /** if (ZZLinkAssessorQualification_v_ID == 0)
        {
			setZZ_isRecommended (null);
// Y
        } */
    }

    /** Standard Constructor */
    public X_ZZLinkAssessorQualification_v (Properties ctx, String ZZLinkAssessorQualification_v_UU, String trxName)
    {
      super (ctx, ZZLinkAssessorQualification_v_UU, trxName);
      /** if (ZZLinkAssessorQualification_v_UU == null)
        {
			setZZ_isRecommended (null);
// Y
        } */
    }

    /** Standard Constructor */
    public X_ZZLinkAssessorQualification_v (Properties ctx, String ZZLinkAssessorQualification_v_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZLinkAssessorQualification_v_UU, trxName, virtualColumns);
      /** if (ZZLinkAssessorQualification_v_UU == null)
        {
			setZZ_isRecommended (null);
// Y
        } */
    }

    /** Load Constructor */
    public X_ZZLinkAssessorQualification_v (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_ZZLinkAssessorQualification_v[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Comments.
		@param Comments Comments or additional information
	*/
	public void setComments (String Comments)
	{
		set_Value (COLUMNNAME_Comments, Comments);
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

	/** Set Link Assessor Qualification.
		@param ZZLinkAssessorQualification_ID Link Assessor Qualification
	*/
	public void setZZLinkAssessorQualification_ID (int ZZLinkAssessorQualification_ID)
	{
		if (ZZLinkAssessorQualification_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZLinkAssessorQualification_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZLinkAssessorQualification_ID, Integer.valueOf(ZZLinkAssessorQualification_ID));
	}

	/** Get Link Assessor Qualification.
		@return Link Assessor Qualification	  */
	public int getZZLinkAssessorQualification_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZLinkAssessorQualification_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Link Assessor Qualification View.
		@param ZZLinkAssessorQualification_v_ID Link Assessor Qualification View
	*/
	public void setZZLinkAssessorQualification_v_ID (int ZZLinkAssessorQualification_v_ID)
	{
		if (ZZLinkAssessorQualification_v_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZLinkAssessorQualification_v_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZLinkAssessorQualification_v_ID, Integer.valueOf(ZZLinkAssessorQualification_v_ID));
	}

	/** Get Link Assessor Qualification View.
		@return Link Assessor Qualification View	  */
	public int getZZLinkAssessorQualification_v_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZLinkAssessorQualification_v_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set LinkAssessor Qualification Vew UU.
		@param ZZLinkAssessorQualification_v_UU LinkAssessor Qualification Vew UU
	*/
	public void setZZLinkAssessorQualification_v_UU (String ZZLinkAssessorQualification_v_UU)
	{
		set_ValueNoCheck (COLUMNNAME_ZZLinkAssessorQualification_v_UU, ZZLinkAssessorQualification_v_UU);
	}

	/** Get LinkAssessor Qualification Vew UU.
		@return LinkAssessor Qualification Vew UU	  */
	public String getZZLinkAssessorQualification_v_UU()
	{
		return (String)get_Value(COLUMNNAME_ZZLinkAssessorQualification_v_UU);
	}

	/** Set QCTO Qualification.
		@param ZZQctoQualification_ID QCTO Qualification
	*/
	public void setZZQctoQualification_ID (int ZZQctoQualification_ID)
	{
		if (ZZQctoQualification_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZQctoQualification_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZQctoQualification_ID, Integer.valueOf(ZZQctoQualification_ID));
	}

	/** Get QCTO Qualification.
		@return QCTO Qualification	  */
	public int getZZQctoQualification_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZQctoQualification_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Qualification Code.
		@param ZZQualificationCode Qualification Code
	*/
	public void setZZQualificationCode (String ZZQualificationCode)
	{
		set_Value (COLUMNNAME_ZZQualificationCode, ZZQualificationCode);
	}

	/** Get Qualification Code.
		@return Qualification Code	  */
	public String getZZQualificationCode()
	{
		return (String)get_Value(COLUMNNAME_ZZQualificationCode);
	}

	/** Set Qualification Title.
		@param ZZQualificationTitle Qualification Title
	*/
	public void setZZQualificationTitle (String ZZQualificationTitle)
	{
		set_Value (COLUMNNAME_ZZQualificationTitle, ZZQualificationTitle);
	}

	/** Get Qualification Title.
		@return Qualification Title	  */
	public String getZZQualificationTitle()
	{
		return (String)get_Value(COLUMNNAME_ZZQualificationTitle);
	}

	/** Set Qualification.
		@param ZZQualification_ID Qualification
	*/
	public void setZZQualification_ID (int ZZQualification_ID)
	{
		if (ZZQualification_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZQualification_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZQualification_ID, Integer.valueOf(ZZQualification_ID));
	}

	/** Get Qualification.
		@return Qualification	  */
	public int getZZQualification_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZQualification_ID);
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

		set_Value (COLUMNNAME_ZZ_isRecommended, ZZ_isRecommended);
	}

	/** Get Recommended.
		@return Recommended	  */
	public String getZZ_isRecommended()
	{
		return (String)get_Value(COLUMNNAME_ZZ_isRecommended);
	}
}