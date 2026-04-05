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

/** Generated Model for ZZLkpOfoOccupation
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="ZZLkpOfoOccupation")
public class X_ZZLkpOfoOccupation extends PO implements I_ZZLkpOfoOccupation, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20260404L;

    /** Standard Constructor */
    public X_ZZLkpOfoOccupation (Properties ctx, int ZZLkpOfoOccupation_ID, String trxName)
    {
      super (ctx, ZZLkpOfoOccupation_ID, trxName);
      /** if (ZZLkpOfoOccupation_ID == 0)
        {
			setName (null);
			setZZLkpOfoOccupation_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZLkpOfoOccupation (Properties ctx, int ZZLkpOfoOccupation_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZLkpOfoOccupation_ID, trxName, virtualColumns);
      /** if (ZZLkpOfoOccupation_ID == 0)
        {
			setName (null);
			setZZLkpOfoOccupation_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZLkpOfoOccupation (Properties ctx, String ZZLkpOfoOccupation_UU, String trxName)
    {
      super (ctx, ZZLkpOfoOccupation_UU, trxName);
      /** if (ZZLkpOfoOccupation_UU == null)
        {
			setName (null);
			setZZLkpOfoOccupation_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZLkpOfoOccupation (Properties ctx, String ZZLkpOfoOccupation_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZLkpOfoOccupation_UU, trxName, virtualColumns);
      /** if (ZZLkpOfoOccupation_UU == null)
        {
			setName (null);
			setZZLkpOfoOccupation_ID (0);
        } */
    }

    /** Load Constructor */
    public X_ZZLkpOfoOccupation (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_ZZLkpOfoOccupation[")
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

	/** Set OFO Occupation.
		@param ZZLkpOfoOccupation_ID OFO Occupation
	*/
	public void setZZLkpOfoOccupation_ID (int ZZLkpOfoOccupation_ID)
	{
		if (ZZLkpOfoOccupation_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZLkpOfoOccupation_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZLkpOfoOccupation_ID, Integer.valueOf(ZZLkpOfoOccupation_ID));
	}

	/** Get OFO Occupation.
		@return OFO Occupation
	  */
	public int getZZLkpOfoOccupation_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZLkpOfoOccupation_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set ZZLkpOfoOccupation_UU.
		@param ZZLkpOfoOccupation_UU ZZLkpOfoOccupation_UU
	*/
	public void setZZLkpOfoOccupation_UU (String ZZLkpOfoOccupation_UU)
	{
		set_Value (COLUMNNAME_ZZLkpOfoOccupation_UU, ZZLkpOfoOccupation_UU);
	}

	/** Get ZZLkpOfoOccupation_UU.
		@return ZZLkpOfoOccupation_UU	  */
	public String getZZLkpOfoOccupation_UU()
	{
		return (String)get_Value(COLUMNNAME_ZZLkpOfoOccupation_UU);
	}
}