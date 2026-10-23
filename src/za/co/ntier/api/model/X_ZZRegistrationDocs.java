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

/** Generated Model for ZZRegistrationDocs
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="ZZRegistrationDocs")
public class X_ZZRegistrationDocs extends PO implements I_ZZRegistrationDocs, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20261023L;

    /** Standard Constructor */
    public X_ZZRegistrationDocs (Properties ctx, int ZZRegistrationDocs_ID, String trxName)
    {
      super (ctx, ZZRegistrationDocs_ID, trxName);
      /** if (ZZRegistrationDocs_ID == 0)
        {
			setIsMandatory (false);
// N
			setZZRegistrationDocs_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZRegistrationDocs (Properties ctx, int ZZRegistrationDocs_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZRegistrationDocs_ID, trxName, virtualColumns);
      /** if (ZZRegistrationDocs_ID == 0)
        {
			setIsMandatory (false);
// N
			setZZRegistrationDocs_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZRegistrationDocs (Properties ctx, String ZZRegistrationDocs_UU, String trxName)
    {
      super (ctx, ZZRegistrationDocs_UU, trxName);
      /** if (ZZRegistrationDocs_UU == null)
        {
			setIsMandatory (false);
// N
			setZZRegistrationDocs_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZRegistrationDocs (Properties ctx, String ZZRegistrationDocs_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZRegistrationDocs_UU, trxName, virtualColumns);
      /** if (ZZRegistrationDocs_UU == null)
        {
			setIsMandatory (false);
// N
			setZZRegistrationDocs_ID (0);
        } */
    }

    /** Load Constructor */
    public X_ZZRegistrationDocs (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_ZZRegistrationDocs[")
        .append(get_ID()).append(",Name=").append(getName()).append("]");
      return sb.toString();
    }

	/** Set Mandatory.
		@param IsMandatory Data entry is required in this column
	*/
	public void setIsMandatory (boolean IsMandatory)
	{
		set_Value (COLUMNNAME_IsMandatory, Boolean.valueOf(IsMandatory));
	}

	/** Get Mandatory.
		@return Data entry is required in this column
	  */
	public boolean isMandatory()
	{
		Object oo = get_Value(COLUMNNAME_IsMandatory);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
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

	/** Set Registration Docs.
		@param ZZRegistrationDocs_ID Registration Docs
	*/
	public void setZZRegistrationDocs_ID (int ZZRegistrationDocs_ID)
	{
		if (ZZRegistrationDocs_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZRegistrationDocs_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZRegistrationDocs_ID, Integer.valueOf(ZZRegistrationDocs_ID));
	}

	/** Get Registration Docs.
		@return Registration Docs	  */
	public int getZZRegistrationDocs_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZRegistrationDocs_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set ZZRegistrationDocs_UU.
		@param ZZRegistrationDocs_UU ZZRegistrationDocs_UU
	*/
	public void setZZRegistrationDocs_UU (String ZZRegistrationDocs_UU)
	{
		set_Value (COLUMNNAME_ZZRegistrationDocs_UU, ZZRegistrationDocs_UU);
	}

	/** Get ZZRegistrationDocs_UU.
		@return ZZRegistrationDocs_UU	  */
	public String getZZRegistrationDocs_UU()
	{
		return (String)get_Value(COLUMNNAME_ZZRegistrationDocs_UU);
	}

	/** Set Program Master Data.
		@param ZZ_Program_Master_Data_ID Program Master Data
	*/
	public void setZZ_Program_Master_Data_ID (int ZZ_Program_Master_Data_ID)
	{
		if (ZZ_Program_Master_Data_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZ_Program_Master_Data_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZ_Program_Master_Data_ID, Integer.valueOf(ZZ_Program_Master_Data_ID));
	}

	/** Get Program Master Data.
		@return Program Master Data	  */
	public int getZZ_Program_Master_Data_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZ_Program_Master_Data_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}