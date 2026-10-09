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

/** Generated Model for ZZ_PostSchoolEducation_Details
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="ZZ_PostSchoolEducation_Details")
public class X_ZZ_PostSchoolEducation_Details extends PO implements I_ZZ_PostSchoolEducation_Details, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20261008L;

    /** Standard Constructor */
    public X_ZZ_PostSchoolEducation_Details (Properties ctx, int ZZ_PostSchoolEducation_Details_ID, String trxName)
    {
      super (ctx, ZZ_PostSchoolEducation_Details_ID, trxName);
      /** if (ZZ_PostSchoolEducation_Details_ID == 0)
        {
			setZZ_PostSchoolEducation_Details_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZ_PostSchoolEducation_Details (Properties ctx, int ZZ_PostSchoolEducation_Details_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZ_PostSchoolEducation_Details_ID, trxName, virtualColumns);
      /** if (ZZ_PostSchoolEducation_Details_ID == 0)
        {
			setZZ_PostSchoolEducation_Details_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZ_PostSchoolEducation_Details (Properties ctx, String ZZ_PostSchoolEducation_Details_UU, String trxName)
    {
      super (ctx, ZZ_PostSchoolEducation_Details_UU, trxName);
      /** if (ZZ_PostSchoolEducation_Details_UU == null)
        {
			setZZ_PostSchoolEducation_Details_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZ_PostSchoolEducation_Details (Properties ctx, String ZZ_PostSchoolEducation_Details_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZ_PostSchoolEducation_Details_UU, trxName, virtualColumns);
      /** if (ZZ_PostSchoolEducation_Details_UU == null)
        {
			setZZ_PostSchoolEducation_Details_ID (0);
        } */
    }

    /** Load Constructor */
    public X_ZZ_PostSchoolEducation_Details (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_ZZ_PostSchoolEducation_Details[")
        .append(get_ID()).append(",Name=").append(getName()).append("]");
      return sb.toString();
    }

	/** Set Description.
		@param Description Optional short description of the record
	*/
	public void setDescription (String Description)
	{
		set_Value (COLUMNNAME_Description, Description);
	}

	/** Get Description.
		@return Optional short description of the record
	  */
	public String getDescription()
	{
		return (String)get_Value(COLUMNNAME_Description);
	}

	/** Set Name.
		@param Name Alphanumeric identifier of the entity
	*/
	public void setName (String Name)
	{
		set_Value (COLUMNNAME_Name, Name);
	}

	/** Get Name.
		@return Alphanumeric identifier of the entity
	  */
	public String getName()
	{
		return (String)get_Value(COLUMNNAME_Name);
	}

	/** Set OFO Occupation.
		@param OFO_Occupation_ID OFO Occupation
	*/
	public void setOFO_Occupation_ID (int OFO_Occupation_ID)
	{
		if (OFO_Occupation_ID < 1)
			set_Value (COLUMNNAME_OFO_Occupation_ID, null);
		else
			set_Value (COLUMNNAME_OFO_Occupation_ID, Integer.valueOf(OFO_Occupation_ID));
	}

	/** Get OFO Occupation.
		@return OFO Occupation	  */
	public int getOFO_Occupation_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_OFO_Occupation_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Qualification.
		@param Qualification Qualification
	*/
	public void setQualification (String Qualification)
	{
		set_Value (COLUMNNAME_Qualification, Qualification);
	}

	/** Get Qualification.
		@return Qualification	  */
	public String getQualification()
	{
		return (String)get_Value(COLUMNNAME_Qualification);
	}

	public I_ZZLearner getZZLearner() throws RuntimeException
	{
		return (I_ZZLearner)MTable.get(getCtx(), I_ZZLearner.Table_ID)
			.getPO(getZZLearner_ID(), get_TrxName());
	}

	/** Set Learner.
		@param ZZLearner_ID Learner
	*/
	public void setZZLearner_ID (int ZZLearner_ID)
	{
		if (ZZLearner_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZLearner_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZLearner_ID, Integer.valueOf(ZZLearner_ID));
	}

	/** Get Learner.
		@return Learner	  */
	public int getZZLearner_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZLearner_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Date Achieved.
		@param ZZ_DateAchieved Date Achieved
	*/
	public void setZZ_DateAchieved (Timestamp ZZ_DateAchieved)
	{
		set_Value (COLUMNNAME_ZZ_DateAchieved, ZZ_DateAchieved);
	}

	/** Get Date Achieved.
		@return Date Achieved	  */
	public Timestamp getZZ_DateAchieved()
	{
		return (Timestamp)get_Value(COLUMNNAME_ZZ_DateAchieved);
	}

	/** Set Post School Educational Details.
		@param ZZ_PostSchoolEducation_Details_ID Post School Educational Details
	*/
	public void setZZ_PostSchoolEducation_Details_ID (int ZZ_PostSchoolEducation_Details_ID)
	{
		if (ZZ_PostSchoolEducation_Details_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZ_PostSchoolEducation_Details_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZ_PostSchoolEducation_Details_ID, Integer.valueOf(ZZ_PostSchoolEducation_Details_ID));
	}

	/** Get Post School Educational Details.
		@return Post School Educational Details	  */
	public int getZZ_PostSchoolEducation_Details_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZ_PostSchoolEducation_Details_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set ZZ_PostSchoolEducation_Details_UU.
		@param ZZ_PostSchoolEducation_Details_UU ZZ_PostSchoolEducation_Details_UU
	*/
	public void setZZ_PostSchoolEducation_Details_UU (String ZZ_PostSchoolEducation_Details_UU)
	{
		set_Value (COLUMNNAME_ZZ_PostSchoolEducation_Details_UU, ZZ_PostSchoolEducation_Details_UU);
	}

	/** Get ZZ_PostSchoolEducation_Details_UU.
		@return ZZ_PostSchoolEducation_Details_UU	  */
	public String getZZ_PostSchoolEducation_Details_UU()
	{
		return (String)get_Value(COLUMNNAME_ZZ_PostSchoolEducation_Details_UU);
	}
}