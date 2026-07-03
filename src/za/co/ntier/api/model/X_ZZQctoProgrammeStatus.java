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

/** Generated Model for ZZQctoProgrammeStatus
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="ZZQctoProgrammeStatus")
public class X_ZZQctoProgrammeStatus extends PO implements I_ZZQctoProgrammeStatus, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20260702L;

    /** Standard Constructor */
    public X_ZZQctoProgrammeStatus (Properties ctx, int ZZQctoProgrammeStatus_ID, String trxName)
    {
      super (ctx, ZZQctoProgrammeStatus_ID, trxName);
      /** if (ZZQctoProgrammeStatus_ID == 0)
        {
			setZZQctoProgrammeStatus_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZQctoProgrammeStatus (Properties ctx, int ZZQctoProgrammeStatus_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZQctoProgrammeStatus_ID, trxName, virtualColumns);
      /** if (ZZQctoProgrammeStatus_ID == 0)
        {
			setZZQctoProgrammeStatus_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZQctoProgrammeStatus (Properties ctx, String ZZQctoProgrammeStatus_UU, String trxName)
    {
      super (ctx, ZZQctoProgrammeStatus_UU, trxName);
      /** if (ZZQctoProgrammeStatus_UU == null)
        {
			setZZQctoProgrammeStatus_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZQctoProgrammeStatus (Properties ctx, String ZZQctoProgrammeStatus_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZQctoProgrammeStatus_UU, trxName, virtualColumns);
      /** if (ZZQctoProgrammeStatus_UU == null)
        {
			setZZQctoProgrammeStatus_ID (0);
        } */
    }

    /** Load Constructor */
    public X_ZZQctoProgrammeStatus (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_ZZQctoProgrammeStatus[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** ZZCanAssociateGrants AD_Reference_ID=319 */
	public static final int ZZCANASSOCIATEGRANTS_AD_Reference_ID=319;
	/** No = N */
	public static final String ZZCANASSOCIATEGRANTS_No = "N";
	/** Yes = Y */
	public static final String ZZCANASSOCIATEGRANTS_Yes = "Y";
	/** Set Can Associate Grants.
		@param ZZCanAssociateGrants Can Associate Grants
	*/
	public void setZZCanAssociateGrants (String ZZCanAssociateGrants)
	{

		set_Value (COLUMNNAME_ZZCanAssociateGrants, ZZCanAssociateGrants);
	}

	/** Get Can Associate Grants.
		@return Can Associate Grants	  */
	public String getZZCanAssociateGrants()
	{
		return (String)get_Value(COLUMNNAME_ZZCanAssociateGrants);
	}

	/** Set Migrate Values.
		@param ZZMigrateValues Migrate Values
	*/
	public void setZZMigrateValues (String ZZMigrateValues)
	{
		set_Value (COLUMNNAME_ZZMigrateValues, ZZMigrateValues);
	}

	/** Get Migrate Values.
		@return Migrate Values	  */
	public String getZZMigrateValues()
	{
		return (String)get_Value(COLUMNNAME_ZZMigrateValues);
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

	/** Set QCTO Programme Status.
		@param ZZQctoProgrammeStatus_ID QCTO Programme Status
	*/
	public void setZZQctoProgrammeStatus_ID (int ZZQctoProgrammeStatus_ID)
	{
		if (ZZQctoProgrammeStatus_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZQctoProgrammeStatus_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZQctoProgrammeStatus_ID, Integer.valueOf(ZZQctoProgrammeStatus_ID));
	}

	/** Get QCTO Programme Status.
		@return QCTO Programme Status	  */
	public int getZZQctoProgrammeStatus_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZQctoProgrammeStatus_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set ZZQctoProgrammeStatus_UU.
		@param ZZQctoProgrammeStatus_UU ZZQctoProgrammeStatus_UU
	*/
	public void setZZQctoProgrammeStatus_UU (String ZZQctoProgrammeStatus_UU)
	{
		set_Value (COLUMNNAME_ZZQctoProgrammeStatus_UU, ZZQctoProgrammeStatus_UU);
	}

	/** Get ZZQctoProgrammeStatus_UU.
		@return ZZQctoProgrammeStatus_UU	  */
	public String getZZQctoProgrammeStatus_UU()
	{
		return (String)get_Value(COLUMNNAME_ZZQctoProgrammeStatus_UU);
	}

	/** Set SAQA Code.
		@param ZZSaqaCode SAQA Code
	*/
	public void setZZSaqaCode (String ZZSaqaCode)
	{
		set_Value (COLUMNNAME_ZZSaqaCode, ZZSaqaCode);
	}

	/** Get SAQA Code.
		@return SAQA Code	  */
	public String getZZSaqaCode()
	{
		return (String)get_Value(COLUMNNAME_ZZSaqaCode);
	}

	/** Set Title.
		@param ZZTitle Title
	*/
	public void setZZTitle (String ZZTitle)
	{
		set_Value (COLUMNNAME_ZZTitle, ZZTitle);
	}

	/** Get Title.
		@return Title	  */
	public String getZZTitle()
	{
		return (String)get_Value(COLUMNNAME_ZZTitle);
	}
}