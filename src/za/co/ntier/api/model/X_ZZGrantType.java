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
import java.util.Properties;
import org.compiere.model.*;
import org.compiere.util.Env;

/** Generated Model for ZZGrantType
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="ZZGrantType")
public class X_ZZGrantType extends PO implements I_ZZGrantType, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20260702L;

    /** Standard Constructor */
    public X_ZZGrantType (Properties ctx, int ZZGrantType_ID, String trxName)
    {
      super (ctx, ZZGrantType_ID, trxName);
      /** if (ZZGrantType_ID == 0)
        {
			setZZGrantType_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZGrantType (Properties ctx, int ZZGrantType_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZGrantType_ID, trxName, virtualColumns);
      /** if (ZZGrantType_ID == 0)
        {
			setZZGrantType_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZGrantType (Properties ctx, String ZZGrantType_UU, String trxName)
    {
      super (ctx, ZZGrantType_UU, trxName);
      /** if (ZZGrantType_UU == null)
        {
			setZZGrantType_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZGrantType (Properties ctx, String ZZGrantType_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZGrantType_UU, trxName, virtualColumns);
      /** if (ZZGrantType_UU == null)
        {
			setZZGrantType_ID (0);
        } */
    }

    /** Load Constructor */
    public X_ZZGrantType (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_ZZGrantType[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public org.compiere.model.I_C_Year getC_Year() throws RuntimeException
	{
		return (org.compiere.model.I_C_Year)MTable.get(getCtx(), org.compiere.model.I_C_Year.Table_ID)
			.getPO(getC_Year_ID(), get_TrxName());
	}

	/** Set Year.
		@param C_Year_ID Calendar Year
	*/
	public void setC_Year_ID (int C_Year_ID)
	{
		if (C_Year_ID < 1)
			set_ValueNoCheck (COLUMNNAME_C_Year_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_C_Year_ID, Integer.valueOf(C_Year_ID));
	}

	/** Get Year.
		@return Calendar Year
	  */
	public int getC_Year_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Year_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Grant Description.
		@param ZZGrantDescription Grant Description
	*/
	public void setZZGrantDescription (String ZZGrantDescription)
	{
		set_Value (COLUMNNAME_ZZGrantDescription, ZZGrantDescription);
	}

	/** Get Grant Description.
		@return Grant Description	  */
	public String getZZGrantDescription()
	{
		return (String)get_Value(COLUMNNAME_ZZGrantDescription);
	}

	/** Set Grant Name.
		@param ZZGrantName Grant Name
	*/
	public void setZZGrantName (String ZZGrantName)
	{
		set_Value (COLUMNNAME_ZZGrantName, ZZGrantName);
	}

	/** Get Grant Name.
		@return Grant Name	  */
	public String getZZGrantName()
	{
		return (String)get_Value(COLUMNNAME_ZZGrantName);
	}

	/** Set Grant Percentage.
		@param ZZGrantPercentage Grant Percentage
	*/
	public void setZZGrantPercentage (BigDecimal ZZGrantPercentage)
	{
		set_Value (COLUMNNAME_ZZGrantPercentage, ZZGrantPercentage);
	}

	/** Get Grant Percentage.
		@return Grant Percentage	  */
	public BigDecimal getZZGrantPercentage()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_ZZGrantPercentage);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Grant Type.
		@param ZZGrantType_ID Grant Type
	*/
	public void setZZGrantType_ID (int ZZGrantType_ID)
	{
		if (ZZGrantType_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZGrantType_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZGrantType_ID, Integer.valueOf(ZZGrantType_ID));
	}

	/** Get Grant Type.
		@return Grant Type	  */
	public int getZZGrantType_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZGrantType_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set ZZGrantType_UU.
		@param ZZGrantType_UU ZZGrantType_UU
	*/
	public void setZZGrantType_UU (String ZZGrantType_UU)
	{
		set_Value (COLUMNNAME_ZZGrantType_UU, ZZGrantType_UU);
	}

	/** Get ZZGrantType_UU.
		@return ZZGrantType_UU	  */
	public String getZZGrantType_UU()
	{
		return (String)get_Value(COLUMNNAME_ZZGrantType_UU);
	}

	/** ZZIsPayable AD_Reference_ID=319 */
	public static final int ZZISPAYABLE_AD_Reference_ID=319;
	/** No = N */
	public static final String ZZISPAYABLE_No = "N";
	/** Yes = Y */
	public static final String ZZISPAYABLE_Yes = "Y";
	/** Set Payable.
		@param ZZIsPayable Payable
	*/
	public void setZZIsPayable (String ZZIsPayable)
	{

		set_Value (COLUMNNAME_ZZIsPayable, ZZIsPayable);
	}

	/** Get Payable.
		@return Payable	  */
	public String getZZIsPayable()
	{
		return (String)get_Value(COLUMNNAME_ZZIsPayable);
	}

	public I_ZZLkpGrantCode getZZLkpGrantCode() throws RuntimeException
	{
		return (I_ZZLkpGrantCode)MTable.get(getCtx(), I_ZZLkpGrantCode.Table_ID)
			.getPO(getZZLkpGrantCode_ID(), get_TrxName());
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

	/** Set Minimum Amount.
		@param ZZMinimumAmount Minimum Amount
	*/
	public void setZZMinimumAmount (BigDecimal ZZMinimumAmount)
	{
		set_Value (COLUMNNAME_ZZMinimumAmount, ZZMinimumAmount);
	}

	/** Get Minimum Amount.
		@return Minimum Amount	  */
	public BigDecimal getZZMinimumAmount()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_ZZMinimumAmount);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}
}