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

/** Generated Model for ZZProvider
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="ZZProvider")
public class X_ZZProvider extends PO implements I_ZZProvider, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20260702L;

    /** Standard Constructor */
    public X_ZZProvider (Properties ctx, int ZZProvider_ID, String trxName)
    {
      super (ctx, ZZProvider_ID, trxName);
      /** if (ZZProvider_ID == 0)
        {
			setZZProvider_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZProvider (Properties ctx, int ZZProvider_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZProvider_ID, trxName, virtualColumns);
      /** if (ZZProvider_ID == 0)
        {
			setZZProvider_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZProvider (Properties ctx, String ZZProvider_UU, String trxName)
    {
      super (ctx, ZZProvider_UU, trxName);
      /** if (ZZProvider_UU == null)
        {
			setZZProvider_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZProvider (Properties ctx, String ZZProvider_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZProvider_UU, trxName, virtualColumns);
      /** if (ZZProvider_UU == null)
        {
			setZZProvider_ID (0);
        } */
    }

    /** Load Constructor */
    public X_ZZProvider (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_ZZProvider[")
        .append(get_ID()).append(",Name=").append(getName()).append("]");
      return sb.toString();
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

	/** Set Provider Code.
		@param ZZProviderCode Provider Code
	*/
	public void setZZProviderCode (String ZZProviderCode)
	{
		set_ValueNoCheck (COLUMNNAME_ZZProviderCode, ZZProviderCode);
	}

	/** Get Provider Code.
		@return Provider Code	  */
	public String getZZProviderCode()
	{
		return (String)get_Value(COLUMNNAME_ZZProviderCode);
	}

	/** Set Provider.
		@param ZZProvider_ID Provider
	*/
	public void setZZProvider_ID (int ZZProvider_ID)
	{
		if (ZZProvider_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZProvider_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZProvider_ID, Integer.valueOf(ZZProvider_ID));
	}

	/** Get Provider.
		@return Provider	  */
	public int getZZProvider_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZProvider_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set ZZProvider_UU.
		@param ZZProvider_UU ZZProvider_UU
	*/
	public void setZZProvider_UU (String ZZProvider_UU)
	{
		set_Value (COLUMNNAME_ZZProvider_UU, ZZProvider_UU);
	}

	/** Get ZZProvider_UU.
		@return ZZProvider_UU	  */
	public String getZZProvider_UU()
	{
		return (String)get_Value(COLUMNNAME_ZZProvider_UU);
	}
}