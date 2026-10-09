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

/** Generated Model for ZZ_ExperientialLearning
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="ZZ_ExperientialLearning")
public class X_ZZ_ExperientialLearning extends PO implements I_ZZ_ExperientialLearning, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20261008L;

    /** Standard Constructor */
    public X_ZZ_ExperientialLearning (Properties ctx, int ZZ_ExperientialLearning_ID, String trxName)
    {
      super (ctx, ZZ_ExperientialLearning_ID, trxName);
      /** if (ZZ_ExperientialLearning_ID == 0)
        {
			setName (null);
			setZZ_ExperientialLearning_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZ_ExperientialLearning (Properties ctx, int ZZ_ExperientialLearning_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZ_ExperientialLearning_ID, trxName, virtualColumns);
      /** if (ZZ_ExperientialLearning_ID == 0)
        {
			setName (null);
			setZZ_ExperientialLearning_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZ_ExperientialLearning (Properties ctx, String ZZ_ExperientialLearning_UU, String trxName)
    {
      super (ctx, ZZ_ExperientialLearning_UU, trxName);
      /** if (ZZ_ExperientialLearning_UU == null)
        {
			setName (null);
			setZZ_ExperientialLearning_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZ_ExperientialLearning (Properties ctx, String ZZ_ExperientialLearning_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZ_ExperientialLearning_UU, trxName, virtualColumns);
      /** if (ZZ_ExperientialLearning_UU == null)
        {
			setName (null);
			setZZ_ExperientialLearning_ID (0);
        } */
    }

    /** Load Constructor */
    public X_ZZ_ExperientialLearning (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_ZZ_ExperientialLearning[")
        .append(get_ID()).append(",Name=").append(getName()).append("]");
      return sb.toString();
    }

	/** Set Date From.
		@param DateFrom Starting date for a range
	*/
	public void setDateFrom (Timestamp DateFrom)
	{
		set_Value (COLUMNNAME_DateFrom, DateFrom);
	}

	/** Get Date From.
		@return Starting date for a range
	  */
	public Timestamp getDateFrom()
	{
		return (Timestamp)get_Value(COLUMNNAME_DateFrom);
	}

	/** Set Date To.
		@param DateTo End date of a date range
	*/
	public void setDateTo (Timestamp DateTo)
	{
		set_Value (COLUMNNAME_DateTo, DateTo);
	}

	/** Get Date To.
		@return End date of a date range
	  */
	public Timestamp getDateTo()
	{
		return (Timestamp)get_Value(COLUMNNAME_DateTo);
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

	/** Set Title.
		@param Title Name this entity is referred to as
	*/
	public void setTitle (String Title)
	{
		set_ValueNoCheck (COLUMNNAME_Title, Title);
	}

	/** Get Title.
		@return Name this entity is referred to as
	  */
	public String getTitle()
	{
		return (String)get_Value(COLUMNNAME_Title);
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

	/** Set Experiance Work.
		@param ZZ_ExperianceWork Experiance Work
	*/
	public void setZZ_ExperianceWork (String ZZ_ExperianceWork)
	{
		set_Value (COLUMNNAME_ZZ_ExperianceWork, ZZ_ExperianceWork);
	}

	/** Get Experiance Work.
		@return Experiance Work	  */
	public String getZZ_ExperianceWork()
	{
		return (String)get_Value(COLUMNNAME_ZZ_ExperianceWork);
	}

	/** Set Experiential Learning.
		@param ZZ_ExperientialLearning_ID Experiential Learning
	*/
	public void setZZ_ExperientialLearning_ID (int ZZ_ExperientialLearning_ID)
	{
		if (ZZ_ExperientialLearning_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZ_ExperientialLearning_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZ_ExperientialLearning_ID, Integer.valueOf(ZZ_ExperientialLearning_ID));
	}

	/** Get Experiential Learning.
		@return Experiential Learning	  */
	public int getZZ_ExperientialLearning_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZ_ExperientialLearning_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set ZZ_ExperientialLearning_UU.
		@param ZZ_ExperientialLearning_UU ZZ_ExperientialLearning_UU
	*/
	public void setZZ_ExperientialLearning_UU (String ZZ_ExperientialLearning_UU)
	{
		set_Value (COLUMNNAME_ZZ_ExperientialLearning_UU, ZZ_ExperientialLearning_UU);
	}

	/** Get ZZ_ExperientialLearning_UU.
		@return ZZ_ExperientialLearning_UU	  */
	public String getZZ_ExperientialLearning_UU()
	{
		return (String)get_Value(COLUMNNAME_ZZ_ExperientialLearning_UU);
	}

	/** Set Name Of Work.
		@param ZZ_NameWork Name Of Work
	*/
	public void setZZ_NameWork (String ZZ_NameWork)
	{
		set_Value (COLUMNNAME_ZZ_NameWork, ZZ_NameWork);
	}

	/** Get Name Of Work.
		@return Name Of Work	  */
	public String getZZ_NameWork()
	{
		return (String)get_Value(COLUMNNAME_ZZ_NameWork);
	}
}