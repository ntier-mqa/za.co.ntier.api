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

/** Generated Model for ZZLkpOfoUnitGroup
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="ZZLkpOfoUnitGroup")
public class X_ZZLkpOfoUnitGroup extends PO implements I_ZZLkpOfoUnitGroup, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20260404L;

    /** Standard Constructor */
    public X_ZZLkpOfoUnitGroup (Properties ctx, int ZZLkpOfoUnitGroup_ID, String trxName)
    {
      super (ctx, ZZLkpOfoUnitGroup_ID, trxName);
      /** if (ZZLkpOfoUnitGroup_ID == 0)
        {
			setName (null);
			setZZLkpOfoUnitGroup_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZLkpOfoUnitGroup (Properties ctx, int ZZLkpOfoUnitGroup_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZLkpOfoUnitGroup_ID, trxName, virtualColumns);
      /** if (ZZLkpOfoUnitGroup_ID == 0)
        {
			setName (null);
			setZZLkpOfoUnitGroup_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZLkpOfoUnitGroup (Properties ctx, String ZZLkpOfoUnitGroup_UU, String trxName)
    {
      super (ctx, ZZLkpOfoUnitGroup_UU, trxName);
      /** if (ZZLkpOfoUnitGroup_UU == null)
        {
			setName (null);
			setZZLkpOfoUnitGroup_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZLkpOfoUnitGroup (Properties ctx, String ZZLkpOfoUnitGroup_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZLkpOfoUnitGroup_UU, trxName, virtualColumns);
      /** if (ZZLkpOfoUnitGroup_UU == null)
        {
			setName (null);
			setZZLkpOfoUnitGroup_ID (0);
        } */
    }

    /** Load Constructor */
    public X_ZZLkpOfoUnitGroup (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_ZZLkpOfoUnitGroup[")
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

	/** Set Search Key.
		@param Value Search key for the record in the format required - must be unique
	*/
	public void setValue (String Value)
	{
		set_Value (COLUMNNAME_Value, Value);
	}

	/** Get Search Key.
		@return Search key for the record in the format required - must be unique
	  */
	public String getValue()
	{
		return (String)get_Value(COLUMNNAME_Value);
	}

	/** Set OFO Unit Group.
		@param ZZLkpOfoUnitGroup_ID OFO Unit Group
	*/
	public void setZZLkpOfoUnitGroup_ID (int ZZLkpOfoUnitGroup_ID)
	{
		if (ZZLkpOfoUnitGroup_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZLkpOfoUnitGroup_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZLkpOfoUnitGroup_ID, Integer.valueOf(ZZLkpOfoUnitGroup_ID));
	}

	/** Get OFO Unit Group.
		@return OFO Unit Group
	  */
	public int getZZLkpOfoUnitGroup_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZLkpOfoUnitGroup_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set ZZLkpOfoUnitGroup_UU.
		@param ZZLkpOfoUnitGroup_UU ZZLkpOfoUnitGroup_UU
	*/
	public void setZZLkpOfoUnitGroup_UU (String ZZLkpOfoUnitGroup_UU)
	{
		set_Value (COLUMNNAME_ZZLkpOfoUnitGroup_UU, ZZLkpOfoUnitGroup_UU);
	}

	/** Get ZZLkpOfoUnitGroup_UU.
		@return ZZLkpOfoUnitGroup_UU	  */
	public String getZZLkpOfoUnitGroup_UU()
	{
		return (String)get_Value(COLUMNNAME_ZZLkpOfoUnitGroup_UU);
	}
}