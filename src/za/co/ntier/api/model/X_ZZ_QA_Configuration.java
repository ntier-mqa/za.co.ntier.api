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

/** Generated Model for ZZ_QA_Configuration
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="ZZ_QA_Configuration")
public class X_ZZ_QA_Configuration extends PO implements I_ZZ_QA_Configuration, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20260403L;

    /** Standard Constructor */
    public X_ZZ_QA_Configuration (Properties ctx, int ZZ_QA_Configuration_ID, String trxName)
    {
      super (ctx, ZZ_QA_Configuration_ID, trxName);
      /** if (ZZ_QA_Configuration_ID == 0)
        {
			setZZ_QA_Configuration_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZ_QA_Configuration (Properties ctx, int ZZ_QA_Configuration_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZ_QA_Configuration_ID, trxName, virtualColumns);
      /** if (ZZ_QA_Configuration_ID == 0)
        {
			setZZ_QA_Configuration_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZ_QA_Configuration (Properties ctx, String ZZ_QA_Configuration_UU, String trxName)
    {
      super (ctx, ZZ_QA_Configuration_UU, trxName);
      /** if (ZZ_QA_Configuration_UU == null)
        {
			setZZ_QA_Configuration_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZ_QA_Configuration (Properties ctx, String ZZ_QA_Configuration_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZ_QA_Configuration_UU, trxName, virtualColumns);
      /** if (ZZ_QA_Configuration_UU == null)
        {
			setZZ_QA_Configuration_ID (0);
        } */
    }

    /** Load Constructor */
    public X_ZZ_QA_Configuration (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_ZZ_QA_Configuration[")
        .append(get_ID()).append("]");
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

	/** Set ZZ_QA_Configuration_ID.
		@param ZZ_QA_Configuration_ID ZZ_QA_Configuration_ID
	*/
	public void setZZ_QA_Configuration_ID (int ZZ_QA_Configuration_ID)
	{
		if (ZZ_QA_Configuration_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZ_QA_Configuration_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZ_QA_Configuration_ID, Integer.valueOf(ZZ_QA_Configuration_ID));
	}

	/** Get ZZ_QA_Configuration_ID.
		@return ZZ_QA_Configuration_ID	  */
	public int getZZ_QA_Configuration_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZ_QA_Configuration_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set ZZ_QA_Configuration_UU.
		@param ZZ_QA_Configuration_UU ZZ_QA_Configuration_UU
	*/
	public void setZZ_QA_Configuration_UU (String ZZ_QA_Configuration_UU)
	{
		set_ValueNoCheck (COLUMNNAME_ZZ_QA_Configuration_UU, ZZ_QA_Configuration_UU);
	}

	/** Get ZZ_QA_Configuration_UU.
		@return ZZ_QA_Configuration_UU	  */
	public String getZZ_QA_Configuration_UU()
	{
		return (String)get_Value(COLUMNNAME_ZZ_QA_Configuration_UU);
	}
}