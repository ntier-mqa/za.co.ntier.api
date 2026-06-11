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

/** Generated Model for ZZOfoYear
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="ZZOfoYear")
public class X_ZZOfoYear extends PO implements I_ZZOfoYear, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20260611L;

    /** Standard Constructor */
    public X_ZZOfoYear (Properties ctx, int ZZOfoYear_ID, String trxName)
    {
      super (ctx, ZZOfoYear_ID, trxName);
      /** if (ZZOfoYear_ID == 0)
        {
			setZZOfoYear_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZOfoYear (Properties ctx, int ZZOfoYear_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZOfoYear_ID, trxName, virtualColumns);
      /** if (ZZOfoYear_ID == 0)
        {
			setZZOfoYear_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZOfoYear (Properties ctx, String ZZOfoYear_UU, String trxName)
    {
      super (ctx, ZZOfoYear_UU, trxName);
      /** if (ZZOfoYear_UU == null)
        {
			setZZOfoYear_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZOfoYear (Properties ctx, String ZZOfoYear_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZOfoYear_UU, trxName, virtualColumns);
      /** if (ZZOfoYear_UU == null)
        {
			setZZOfoYear_ID (0);
        } */
    }

    /** Load Constructor */
    public X_ZZOfoYear (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 2 - Client
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
      StringBuilder sb = new StringBuilder ("X_ZZOfoYear[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set OFO Year.
		@param ZZOfoYear OFO Year
	*/
	public void setZZOfoYear (String ZZOfoYear)
	{
		set_Value (COLUMNNAME_ZZOfoYear, ZZOfoYear);
	}

	/** Get OFO Year.
		@return OFO Year	  */
	public String getZZOfoYear()
	{
		return (String)get_Value(COLUMNNAME_ZZOfoYear);
	}

	/** Set OFO Year.
		@param ZZOfoYear_ID OFO Year
	*/
	public void setZZOfoYear_ID (int ZZOfoYear_ID)
	{
		if (ZZOfoYear_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZOfoYear_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZOfoYear_ID, Integer.valueOf(ZZOfoYear_ID));
	}

	/** Get OFO Year.
		@return OFO Year	  */
	public int getZZOfoYear_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZOfoYear_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set ZZOfoYear_UU.
		@param ZZOfoYear_UU ZZOfoYear_UU
	*/
	public void setZZOfoYear_UU (String ZZOfoYear_UU)
	{
		set_Value (COLUMNNAME_ZZOfoYear_UU, ZZOfoYear_UU);
	}

	/** Get ZZOfoYear_UU.
		@return ZZOfoYear_UU	  */
	public String getZZOfoYear_UU()
	{
		return (String)get_Value(COLUMNNAME_ZZOfoYear_UU);
	}
}