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

/** Generated Model for ZZLkpGrantCode
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="ZZLkpGrantCode")
public class X_ZZLkpGrantCode extends PO implements I_ZZLkpGrantCode, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20260702L;

    /** Standard Constructor */
    public X_ZZLkpGrantCode (Properties ctx, int ZZLkpGrantCode_ID, String trxName)
    {
      super (ctx, ZZLkpGrantCode_ID, trxName);
      /** if (ZZLkpGrantCode_ID == 0)
        {
			setZZLkpGrantCode_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZLkpGrantCode (Properties ctx, int ZZLkpGrantCode_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZLkpGrantCode_ID, trxName, virtualColumns);
      /** if (ZZLkpGrantCode_ID == 0)
        {
			setZZLkpGrantCode_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZLkpGrantCode (Properties ctx, String ZZLkpGrantCode_UU, String trxName)
    {
      super (ctx, ZZLkpGrantCode_UU, trxName);
      /** if (ZZLkpGrantCode_UU == null)
        {
			setZZLkpGrantCode_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZLkpGrantCode (Properties ctx, String ZZLkpGrantCode_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZLkpGrantCode_UU, trxName, virtualColumns);
      /** if (ZZLkpGrantCode_UU == null)
        {
			setZZLkpGrantCode_ID (0);
        } */
    }

    /** Load Constructor */
    public X_ZZLkpGrantCode (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_ZZLkpGrantCode[")
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

	/** Set Grant Code Description.
		@param ZZGrantCodeDescription Grant Code Description
	*/
	public void setZZGrantCodeDescription (String ZZGrantCodeDescription)
	{
		set_Value (COLUMNNAME_ZZGrantCodeDescription, ZZGrantCodeDescription);
	}

	/** Get Grant Code Description.
		@return Grant Code Description	  */
	public String getZZGrantCodeDescription()
	{
		return (String)get_Value(COLUMNNAME_ZZGrantCodeDescription);
	}

	/** ZZIsLevyBased AD_Reference_ID=319 */
	public static final int ZZISLEVYBASED_AD_Reference_ID=319;
	/** No = N */
	public static final String ZZISLEVYBASED_No = "N";
	/** Yes = Y */
	public static final String ZZISLEVYBASED_Yes = "Y";
	/** Set Levy Based.
		@param ZZIsLevyBased Levy Based
	*/
	public void setZZIsLevyBased (String ZZIsLevyBased)
	{

		set_Value (COLUMNNAME_ZZIsLevyBased, ZZIsLevyBased);
	}

	/** Get Levy Based.
		@return Levy Based	  */
	public String getZZIsLevyBased()
	{
		return (String)get_Value(COLUMNNAME_ZZIsLevyBased);
	}

	/** Set Grant Code.
		@param ZZLkpGrantCode_ID Grant Code
	*/
	public void setZZLkpGrantCode_ID (int ZZLkpGrantCode_ID)
	{
		if (ZZLkpGrantCode_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZLkpGrantCode_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZLkpGrantCode_ID, Integer.valueOf(ZZLkpGrantCode_ID));
	}

	/** Get Grant Code.
		@return Grant Code	  */
	public int getZZLkpGrantCode_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZLkpGrantCode_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set ZZLkpGrantCode_UU.
		@param ZZLkpGrantCode_UU ZZLkpGrantCode_UU
	*/
	public void setZZLkpGrantCode_UU (String ZZLkpGrantCode_UU)
	{
		set_Value (COLUMNNAME_ZZLkpGrantCode_UU, ZZLkpGrantCode_UU);
	}

	/** Get ZZLkpGrantCode_UU.
		@return ZZLkpGrantCode_UU	  */
	public String getZZLkpGrantCode_UU()
	{
		return (String)get_Value(COLUMNNAME_ZZLkpGrantCode_UU);
	}

	/** Set Migration Code.
		@param ZZMigrationCode Migration Code
	*/
	public void setZZMigrationCode (int ZZMigrationCode)
	{
		set_Value (COLUMNNAME_ZZMigrationCode, Integer.valueOf(ZZMigrationCode));
	}

	/** Get Migration Code.
		@return Migration Code	  */
	public int getZZMigrationCode()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZMigrationCode);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}