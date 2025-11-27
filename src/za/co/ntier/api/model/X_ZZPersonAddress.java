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

/** Generated Model for ZZPersonAddress
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="ZZPersonAddress")
public class X_ZZPersonAddress extends PO implements I_ZZPersonAddress, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20251103L;

    /** Standard Constructor */
    public X_ZZPersonAddress (Properties ctx, int ZZPersonAddress_ID, String trxName)
    {
      super (ctx, ZZPersonAddress_ID, trxName);
      /** if (ZZPersonAddress_ID == 0)
        {
			setZZPersonAddress_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZPersonAddress (Properties ctx, int ZZPersonAddress_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZPersonAddress_ID, trxName, virtualColumns);
      /** if (ZZPersonAddress_ID == 0)
        {
			setZZPersonAddress_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZPersonAddress (Properties ctx, String ZZPersonAddress_UU, String trxName)
    {
      super (ctx, ZZPersonAddress_UU, trxName);
      /** if (ZZPersonAddress_UU == null)
        {
			setZZPersonAddress_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZPersonAddress (Properties ctx, String ZZPersonAddress_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZPersonAddress_UU, trxName, virtualColumns);
      /** if (ZZPersonAddress_UU == null)
        {
			setZZPersonAddress_ID (0);
        } */
    }

    /** Load Constructor */
    public X_ZZPersonAddress (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_ZZPersonAddress[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public org.compiere.model.I_AD_User getAD_User() throws RuntimeException
	{
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_ID)
			.getPO(getAD_User_ID(), get_TrxName());
	}

	/** Set User/Contact.
		@param AD_User_ID User within the system - Internal or Business Partner Contact
	*/
	public void setAD_User_ID (int AD_User_ID)
	{
		if (AD_User_ID < 1)
			set_ValueNoCheck (COLUMNNAME_AD_User_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_AD_User_ID, Integer.valueOf(AD_User_ID));
	}

	/** Get User/Contact.
		@return User within the system - Internal or Business Partner Contact
	  */
	public int getAD_User_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_User_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Address 1.
		@param Address1 Address line 1 for this location
	*/
	public void setAddress1 (String Address1)
	{
		set_ValueNoCheck (COLUMNNAME_Address1, Address1);
	}

	/** Get Address 1.
		@return Address line 1 for this location
	  */
	public String getAddress1()
	{
		return (String)get_Value(COLUMNNAME_Address1);
	}

	/** Set Address 2.
		@param Address2 Address line 2 for this location
	*/
	public void setAddress2 (String Address2)
	{
		set_ValueNoCheck (COLUMNNAME_Address2, Address2);
	}

	/** Get Address 2.
		@return Address line 2 for this location
	  */
	public String getAddress2()
	{
		return (String)get_Value(COLUMNNAME_Address2);
	}

	/** Set Address 3.
		@param Address3 Address Line 3 for the location
	*/
	public void setAddress3 (String Address3)
	{
		set_ValueNoCheck (COLUMNNAME_Address3, Address3);
	}

	/** Get Address 3.
		@return Address Line 3 for the location
	  */
	public String getAddress3()
	{
		return (String)get_Value(COLUMNNAME_Address3);
	}

	/** Set ZIP.
		@param Postal Postal code
	*/
	public void setPostal (String Postal)
	{
		set_Value (COLUMNNAME_Postal, Postal);
	}

	/** Get ZIP.
		@return Postal code
	  */
	public String getPostal()
	{
		return (String)get_Value(COLUMNNAME_Postal);
	}

	/** Set Address Type.
		@param ZZAddressType Address Type
	*/
	public void setZZAddressType (String ZZAddressType)
	{
		set_Value (COLUMNNAME_ZZAddressType, ZZAddressType);
	}

	/** Get Address Type.
		@return Address Type	  */
	public String getZZAddressType()
	{
		return (String)get_Value(COLUMNNAME_ZZAddressType);
	}

	/** Set Person Address.
		@param ZZPersonAddress_ID Person Address
	*/
	public void setZZPersonAddress_ID (int ZZPersonAddress_ID)
	{
		if (ZZPersonAddress_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZPersonAddress_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZPersonAddress_ID, Integer.valueOf(ZZPersonAddress_ID));
	}

	/** Get Person Address.
		@return Person Address	  */
	public int getZZPersonAddress_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZPersonAddress_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set ZZPersonAddress_UU.
		@param ZZPersonAddress_UU ZZPersonAddress_UU
	*/
	public void setZZPersonAddress_UU (String ZZPersonAddress_UU)
	{
		set_Value (COLUMNNAME_ZZPersonAddress_UU, ZZPersonAddress_UU);
	}

	/** Get ZZPersonAddress_UU.
		@return ZZPersonAddress_UU	  */
	public String getZZPersonAddress_UU()
	{
		return (String)get_Value(COLUMNNAME_ZZPersonAddress_UU);
	}

	/** Set Province.
		@param ZZProvince Province
	*/
	public void setZZProvince (String ZZProvince)
	{
		set_Value (COLUMNNAME_ZZProvince, ZZProvince);
	}

	/** Get Province.
		@return Province	  */
	public String getZZProvince()
	{
		return (String)get_Value(COLUMNNAME_ZZProvince);
	}

	public I_ZZSdf getZZSdf() throws RuntimeException
	{
		return (I_ZZSdf)MTable.get(getCtx(), I_ZZSdf.Table_ID)
			.getPO(getZZSdf_ID(), get_TrxName());
	}

	/** Set Sdf.
		@param ZZSdf_ID Sdf
	*/
	public void setZZSdf_ID (int ZZSdf_ID)
	{
		if (ZZSdf_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZSdf_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZSdf_ID, Integer.valueOf(ZZSdf_ID));
	}

	/** Get Sdf.
		@return Sdf	  */
	public int getZZSdf_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZSdf_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}