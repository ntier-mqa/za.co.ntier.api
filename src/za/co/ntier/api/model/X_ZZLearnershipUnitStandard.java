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

/** Generated Model for ZZLearnershipUnitStandard
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="ZZLearnershipUnitStandard")
public class X_ZZLearnershipUnitStandard extends PO implements I_ZZLearnershipUnitStandard, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20260702L;

    /** Standard Constructor */
    public X_ZZLearnershipUnitStandard (Properties ctx, int ZZLearnershipUnitStandard_ID, String trxName)
    {
      super (ctx, ZZLearnershipUnitStandard_ID, trxName);
      /** if (ZZLearnershipUnitStandard_ID == 0)
        {
			setZZLearnershipUnitStandard_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZLearnershipUnitStandard (Properties ctx, int ZZLearnershipUnitStandard_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZLearnershipUnitStandard_ID, trxName, virtualColumns);
      /** if (ZZLearnershipUnitStandard_ID == 0)
        {
			setZZLearnershipUnitStandard_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZLearnershipUnitStandard (Properties ctx, String ZZLearnershipUnitStandard_UU, String trxName)
    {
      super (ctx, ZZLearnershipUnitStandard_UU, trxName);
      /** if (ZZLearnershipUnitStandard_UU == null)
        {
			setZZLearnershipUnitStandard_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZLearnershipUnitStandard (Properties ctx, String ZZLearnershipUnitStandard_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZLearnershipUnitStandard_UU, trxName, virtualColumns);
      /** if (ZZLearnershipUnitStandard_UU == null)
        {
			setZZLearnershipUnitStandard_ID (0);
        } */
    }

    /** Load Constructor */
    public X_ZZLearnershipUnitStandard (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_ZZLearnershipUnitStandard[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Learnership Unit Standard.
		@param ZZLearnershipUnitStandard_ID Learnership Unit Standard
	*/
	public void setZZLearnershipUnitStandard_ID (int ZZLearnershipUnitStandard_ID)
	{
		if (ZZLearnershipUnitStandard_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZLearnershipUnitStandard_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZLearnershipUnitStandard_ID, Integer.valueOf(ZZLearnershipUnitStandard_ID));
	}

	/** Get Learnership Unit Standard.
		@return Learnership Unit Standard	  */
	public int getZZLearnershipUnitStandard_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZLearnershipUnitStandard_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set ZZLearnershipUnitStandard_UU.
		@param ZZLearnershipUnitStandard_UU ZZLearnershipUnitStandard_UU
	*/
	public void setZZLearnershipUnitStandard_UU (String ZZLearnershipUnitStandard_UU)
	{
		set_Value (COLUMNNAME_ZZLearnershipUnitStandard_UU, ZZLearnershipUnitStandard_UU);
	}

	/** Get ZZLearnershipUnitStandard_UU.
		@return ZZLearnershipUnitStandard_UU	  */
	public String getZZLearnershipUnitStandard_UU()
	{
		return (String)get_Value(COLUMNNAME_ZZLearnershipUnitStandard_UU);
	}

	public I_ZZLearnership getZZLearnership() throws RuntimeException
	{
		return (I_ZZLearnership)MTable.get(getCtx(), I_ZZLearnership.Table_ID)
			.getPO(getZZLearnership_ID(), get_TrxName());
	}

	/** Set Learnership.
		@param ZZLearnership_ID Learnership
	*/
	public void setZZLearnership_ID (int ZZLearnership_ID)
	{
		if (ZZLearnership_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZLearnership_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZLearnership_ID, Integer.valueOf(ZZLearnership_ID));
	}

	/** Get Learnership.
		@return Learnership	  */
	public int getZZLearnership_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZLearnership_ID);
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

	/** Compulsory Elective = Compulsory Elective */
	public static final String ZZUNITSTANDARDTYPE_CompulsoryElective = "Compulsory Elective";
	/** Core = Core */
	public static final String ZZUNITSTANDARDTYPE_Core = "Core";
	/** Elective = Elective */
	public static final String ZZUNITSTANDARDTYPE_Elective = "Elective";
	/** Fundamental = Fundamental */
	public static final String ZZUNITSTANDARDTYPE_Fundamental = "Fundamental";
	/** Set Unit Standard Type.
		@param ZZUnitStandardType Unit Standard Type
	*/
	public void setZZUnitStandardType (String ZZUnitStandardType)
	{

		set_Value (COLUMNNAME_ZZUnitStandardType, ZZUnitStandardType);
	}

	/** Get Unit Standard Type.
		@return Unit Standard Type	  */
	public String getZZUnitStandardType()
	{
		return (String)get_Value(COLUMNNAME_ZZUnitStandardType);
	}

	public I_ZZUnitStandard getZZUnitStandard() throws RuntimeException
	{
		return (I_ZZUnitStandard)MTable.get(getCtx(), I_ZZUnitStandard.Table_ID)
			.getPO(getZZUnitStandard_ID(), get_TrxName());
	}

	/** Set Unit Standard.
		@param ZZUnitStandard_ID Unit Standard
	*/
	public void setZZUnitStandard_ID (int ZZUnitStandard_ID)
	{
		if (ZZUnitStandard_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZUnitStandard_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZUnitStandard_ID, Integer.valueOf(ZZUnitStandard_ID));
	}

	/** Get Unit Standard.
		@return Unit Standard	  */
	public int getZZUnitStandard_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZUnitStandard_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}