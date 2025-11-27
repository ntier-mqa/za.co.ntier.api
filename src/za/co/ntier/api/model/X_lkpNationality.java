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

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Properties;

import org.compiere.model.I_Persistent;
import org.compiere.model.PO;
import org.compiere.model.POInfo;
import org.compiere.util.Env;

/** Generated Model for lkpNationality
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="lkpNationality")
public class X_lkpNationality extends PO implements I_lkpNationality, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20251021L;

    /** Standard Constructor */
    public X_lkpNationality (Properties ctx, int lkpNationality_ID, String trxName)
    {
      super (ctx, lkpNationality_ID, trxName);
      /** if (lkpNationality_ID == 0)
        {
			setDescription (null);
			setSAQACode (null);
			setdatecreated (new Timestamp( System.currentTimeMillis() ));
			setdateupdated (new Timestamp( System.currentTimeMillis() ));
			setid (null);
			setisdeleted (Env.ZERO);
			setlkpNationality_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_lkpNationality (Properties ctx, int lkpNationality_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, lkpNationality_ID, trxName, virtualColumns);
      /** if (lkpNationality_ID == 0)
        {
			setDescription (null);
			setSAQACode (null);
			setdatecreated (new Timestamp( System.currentTimeMillis() ));
			setdateupdated (new Timestamp( System.currentTimeMillis() ));
			setid (null);
			setisdeleted (Env.ZERO);
			setlkpNationality_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_lkpNationality (Properties ctx, String lkpNationality_UU, String trxName)
    {
      super (ctx, lkpNationality_UU, trxName);
      /** if (lkpNationality_UU == null)
        {
			setDescription (null);
			setSAQACode (null);
			setdatecreated (new Timestamp( System.currentTimeMillis() ));
			setdateupdated (new Timestamp( System.currentTimeMillis() ));
			setid (null);
			setisdeleted (Env.ZERO);
			setlkpNationality_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_lkpNationality (Properties ctx, String lkpNationality_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, lkpNationality_UU, trxName, virtualColumns);
      /** if (lkpNationality_UU == null)
        {
			setDescription (null);
			setSAQACode (null);
			setdatecreated (new Timestamp( System.currentTimeMillis() ));
			setdateupdated (new Timestamp( System.currentTimeMillis() ));
			setid (null);
			setisdeleted (Env.ZERO);
			setlkpNationality_ID (0);
        } */
    }

    /** Load Constructor */
    public X_lkpNationality (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_lkpNationality[")
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

	/** Set SAQACode.
		@param SAQACode SAQACode
	*/
	public void setSAQACode (String SAQACode)
	{
		set_Value (COLUMNNAME_SAQACode, SAQACode);
	}

	/** Get SAQACode.
		@return SAQACode	  */
	public String getSAQACode()
	{
		return (String)get_Value(COLUMNNAME_SAQACode);
	}

	/** Set datecreated.
		@param datecreated datecreated
	*/
	public void setdatecreated (Timestamp datecreated)
	{
		set_Value (COLUMNNAME_datecreated, datecreated);
	}

	/** Get datecreated.
		@return datecreated	  */
	public Timestamp getdatecreated()
	{
		return (Timestamp)get_Value(COLUMNNAME_datecreated);
	}

	/** Set dateupdated.
		@param dateupdated dateupdated
	*/
	public void setdateupdated (Timestamp dateupdated)
	{
		set_Value (COLUMNNAME_dateupdated, dateupdated);
	}

	/** Get dateupdated.
		@return dateupdated	  */
	public Timestamp getdateupdated()
	{
		return (Timestamp)get_Value(COLUMNNAME_dateupdated);
	}

	/** Set id.
		@param id id
	*/
	public void setid (String id)
	{
		set_Value (COLUMNNAME_id, id);
	}

	/** Get id.
		@return id	  */
	public String getid()
	{
		return (String)get_Value(COLUMNNAME_id);
	}

	/** Set isdeleted.
		@param isdeleted isdeleted
	*/
	public void setisdeleted (BigDecimal isdeleted)
	{
		set_Value (COLUMNNAME_isdeleted, isdeleted);
	}

	/** Get isdeleted.
		@return isdeleted	  */
	public BigDecimal getisdeleted()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_isdeleted);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Nationality.
		@param lkpNationality_ID Nationality
	*/
	public void setlkpNationality_ID (int lkpNationality_ID)
	{
		if (lkpNationality_ID < 1)
			set_ValueNoCheck (COLUMNNAME_lkpNationality_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_lkpNationality_ID, Integer.valueOf(lkpNationality_ID));
	}

	/** Get Nationality.
		@return Nationality	  */
	public int getlkpNationality_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_lkpNationality_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set lkpNationality_UU.
		@param lkpNationality_UU lkpNationality_UU
	*/
	public void setlkpNationality_UU (String lkpNationality_UU)
	{
		set_Value (COLUMNNAME_lkpNationality_UU, lkpNationality_UU);
	}

	/** Get lkpNationality_UU.
		@return lkpNationality_UU	  */
	public String getlkpNationality_UU()
	{
		return (String)get_Value(COLUMNNAME_lkpNationality_UU);
	}

	/** Set sysendtime.
		@param sysendtime sysendtime
	*/
	public void setsysendtime (Timestamp sysendtime)
	{
		set_Value (COLUMNNAME_sysendtime, sysendtime);
	}

	/** Get sysendtime.
		@return sysendtime	  */
	public Timestamp getsysendtime()
	{
		return (Timestamp)get_Value(COLUMNNAME_sysendtime);
	}

	/** Set sysstarttime.
		@param sysstarttime sysstarttime
	*/
	public void setsysstarttime (Timestamp sysstarttime)
	{
		set_Value (COLUMNNAME_sysstarttime, sysstarttime);
	}

	/** Get sysstarttime.
		@return sysstarttime	  */
	public Timestamp getsysstarttime()
	{
		return (Timestamp)get_Value(COLUMNNAME_sysstarttime);
	}
}