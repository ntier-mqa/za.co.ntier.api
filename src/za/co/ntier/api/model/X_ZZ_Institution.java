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

/** Generated Model for ZZ_Institution
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="ZZ_Institution")
public class X_ZZ_Institution extends PO implements I_ZZ_Institution, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20261120L;

    /** Standard Constructor */
    public X_ZZ_Institution (Properties ctx, int ZZ_Institution_ID, String trxName)
    {
      super (ctx, ZZ_Institution_ID, trxName);
      /** if (ZZ_Institution_ID == 0)
        {
			setName (null);
			setZZ_Institution_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZ_Institution (Properties ctx, int ZZ_Institution_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZ_Institution_ID, trxName, virtualColumns);
      /** if (ZZ_Institution_ID == 0)
        {
			setName (null);
			setZZ_Institution_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZ_Institution (Properties ctx, String ZZ_Institution_UU, String trxName)
    {
      super (ctx, ZZ_Institution_UU, trxName);
      /** if (ZZ_Institution_UU == null)
        {
			setName (null);
			setZZ_Institution_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZ_Institution (Properties ctx, String ZZ_Institution_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZ_Institution_UU, trxName, virtualColumns);
      /** if (ZZ_Institution_UU == null)
        {
			setName (null);
			setZZ_Institution_ID (0);
        } */
    }

    /** Load Constructor */
    public X_ZZ_Institution (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_ZZ_Institution[")
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

	/** Set Institution.
		@param ZZ_Institution_ID Institution
	*/
	public void setZZ_Institution_ID (int ZZ_Institution_ID)
	{
		if (ZZ_Institution_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZ_Institution_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZ_Institution_ID, Integer.valueOf(ZZ_Institution_ID));
	}

	/** Get Institution.
		@return Institution	  */
	public int getZZ_Institution_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZ_Institution_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set ZZ_Institution_UU.
		@param ZZ_Institution_UU ZZ_Institution_UU
	*/
	public void setZZ_Institution_UU (String ZZ_Institution_UU)
	{
		set_Value (COLUMNNAME_ZZ_Institution_UU, ZZ_Institution_UU);
	}

	/** Get ZZ_Institution_UU.
		@return ZZ_Institution_UU	  */
	public String getZZ_Institution_UU()
	{
		return (String)get_Value(COLUMNNAME_ZZ_Institution_UU);
	}

	/** Set id.
		@param id id
	*/
	public void setid (int id)
	{
		set_Value (COLUMNNAME_id, Integer.valueOf(id));
	}

	/** Get id.
		@return id	  */
	public int getid()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_id);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}