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
import java.util.Properties;
import org.compiere.model.*;

/** Generated Model for ZZ_ParentDetails
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="ZZ_ParentDetails")
public class X_ZZ_ParentDetails extends PO implements I_ZZ_ParentDetails, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20261008L;

    /** Standard Constructor */
    public X_ZZ_ParentDetails (Properties ctx, int ZZ_ParentDetails_ID, String trxName)
    {
      super (ctx, ZZ_ParentDetails_ID, trxName);
      /** if (ZZ_ParentDetails_ID == 0)
        {
			setZZ_ParentDetails_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZ_ParentDetails (Properties ctx, int ZZ_ParentDetails_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZ_ParentDetails_ID, trxName, virtualColumns);
      /** if (ZZ_ParentDetails_ID == 0)
        {
			setZZ_ParentDetails_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZ_ParentDetails (Properties ctx, String ZZ_ParentDetails_UU, String trxName)
    {
      super (ctx, ZZ_ParentDetails_UU, trxName);
      /** if (ZZ_ParentDetails_UU == null)
        {
			setZZ_ParentDetails_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZ_ParentDetails (Properties ctx, String ZZ_ParentDetails_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZ_ParentDetails_UU, trxName, virtualColumns);
      /** if (ZZ_ParentDetails_UU == null)
        {
			setZZ_ParentDetails_ID (0);
        } */
    }

    /** Load Constructor */
    public X_ZZ_ParentDetails (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_ZZ_ParentDetails[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Surname.
		@param Surname Surname
	*/
	public void setSurname (String Surname)
	{
		set_Value (COLUMNNAME_Surname, Surname);
	}

	/** Get Surname.
		@return Surname	  */
	public String getSurname()
	{
		return (String)get_Value(COLUMNNAME_Surname);
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

	/** Set First Name.
		@param ZZFirstName First Name
	*/
	public void setZZFirstName (String ZZFirstName)
	{
		set_Value (COLUMNNAME_ZZFirstName, ZZFirstName);
	}

	/** Get First Name.
		@return First Name	  */
	public String getZZFirstName()
	{
		return (String)get_Value(COLUMNNAME_ZZFirstName);
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

	/** Set Middle Name.
		@param ZZMiddleName Middle Name
	*/
	public void setZZMiddleName (String ZZMiddleName)
	{
		set_ValueNoCheck (COLUMNNAME_ZZMiddleName, ZZMiddleName);
	}

	/** Get Middle Name.
		@return Middle Name	  */
	public String getZZMiddleName()
	{
		return (String)get_Value(COLUMNNAME_ZZMiddleName);
	}

	public I_ZZPerson getZZParentPerson() throws RuntimeException
	{
		return (I_ZZPerson)MTable.get(getCtx(), I_ZZPerson.Table_ID)
			.getPO(getZZParentPerson_ID(), get_TrxName());
	}

	/** Set Parent Person.
		@param ZZParentPerson_ID Parent Person
	*/
	public void setZZParentPerson_ID (int ZZParentPerson_ID)
	{
		if (ZZParentPerson_ID < 1)
			set_Value (COLUMNNAME_ZZParentPerson_ID, null);
		else
			set_Value (COLUMNNAME_ZZParentPerson_ID, Integer.valueOf(ZZParentPerson_ID));
	}

	/** Get Parent Person.
		@return Parent Person	  */
	public int getZZParentPerson_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZParentPerson_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Parent/Guardian Details.
		@param ZZ_ParentDetails_ID Parent/Guardian Details
	*/
	public void setZZ_ParentDetails_ID (int ZZ_ParentDetails_ID)
	{
		if (ZZ_ParentDetails_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZ_ParentDetails_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZ_ParentDetails_ID, Integer.valueOf(ZZ_ParentDetails_ID));
	}

	/** Get Parent/Guardian Details.
		@return Parent/Guardian Details	  */
	public int getZZ_ParentDetails_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZ_ParentDetails_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set ZZ_ParentDetails_UU.
		@param ZZ_ParentDetails_UU ZZ_ParentDetails_UU
	*/
	public void setZZ_ParentDetails_UU (String ZZ_ParentDetails_UU)
	{
		set_Value (COLUMNNAME_ZZ_ParentDetails_UU, ZZ_ParentDetails_UU);
	}

	/** Get ZZ_ParentDetails_UU.
		@return ZZ_ParentDetails_UU	  */
	public String getZZ_ParentDetails_UU()
	{
		return (String)get_Value(COLUMNNAME_ZZ_ParentDetails_UU);
	}
}