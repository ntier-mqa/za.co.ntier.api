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

/** Generated Model for ZZ_Institution_Qualifications
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="ZZ_Institution_Qualifications")
public class X_ZZ_Institution_Qualifications extends PO implements I_ZZ_Institution_Qualifications, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20261119L;

    /** Standard Constructor */
    public X_ZZ_Institution_Qualifications (Properties ctx, int ZZ_Institution_Qualifications_ID, String trxName)
    {
      super (ctx, ZZ_Institution_Qualifications_ID, trxName);
      /** if (ZZ_Institution_Qualifications_ID == 0)
        {
			setName (null);
			setZZ_Institution_Qualifications_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZ_Institution_Qualifications (Properties ctx, int ZZ_Institution_Qualifications_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZ_Institution_Qualifications_ID, trxName, virtualColumns);
      /** if (ZZ_Institution_Qualifications_ID == 0)
        {
			setName (null);
			setZZ_Institution_Qualifications_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZ_Institution_Qualifications (Properties ctx, String ZZ_Institution_Qualifications_UU, String trxName)
    {
      super (ctx, ZZ_Institution_Qualifications_UU, trxName);
      /** if (ZZ_Institution_Qualifications_UU == null)
        {
			setName (null);
			setZZ_Institution_Qualifications_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZ_Institution_Qualifications (Properties ctx, String ZZ_Institution_Qualifications_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZ_Institution_Qualifications_UU, trxName, virtualColumns);
      /** if (ZZ_Institution_Qualifications_UU == null)
        {
			setName (null);
			setZZ_Institution_Qualifications_ID (0);
        } */
    }

    /** Load Constructor */
    public X_ZZ_Institution_Qualifications (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_ZZ_Institution_Qualifications[")
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

	/** Set Saqa Code.
		@param Saqa_Code ms_skillsdevelopmentprovider.saqacode
	*/
	public void setSaqa_Code (String Saqa_Code)
	{
		set_Value (COLUMNNAME_Saqa_Code, Saqa_Code);
	}

	/** Get Saqa Code.
		@return ms_skillsdevelopmentprovider.saqacode
	  */
	public String getSaqa_Code()
	{
		return (String)get_Value(COLUMNNAME_Saqa_Code);
	}

	/** Set Institution Qualifications.
		@param ZZ_Institution_Qualifications_ID Institution Qualifications
	*/
	public void setZZ_Institution_Qualifications_ID (int ZZ_Institution_Qualifications_ID)
	{
		if (ZZ_Institution_Qualifications_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZ_Institution_Qualifications_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZ_Institution_Qualifications_ID, Integer.valueOf(ZZ_Institution_Qualifications_ID));
	}

	/** Get Institution Qualifications.
		@return Institution Qualifications
	  */
	public int getZZ_Institution_Qualifications_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZ_Institution_Qualifications_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set ZZ_Institution_Qualifications_UU.
		@param ZZ_Institution_Qualifications_UU ZZ_Institution_Qualifications_UU
	*/
	public void setZZ_Institution_Qualifications_UU (String ZZ_Institution_Qualifications_UU)
	{
		set_Value (COLUMNNAME_ZZ_Institution_Qualifications_UU, ZZ_Institution_Qualifications_UU);
	}

	/** Get ZZ_Institution_Qualifications_UU.
		@return ZZ_Institution_Qualifications_UU	  */
	public String getZZ_Institution_Qualifications_UU()
	{
		return (String)get_Value(COLUMNNAME_ZZ_Institution_Qualifications_UU);
	}
}