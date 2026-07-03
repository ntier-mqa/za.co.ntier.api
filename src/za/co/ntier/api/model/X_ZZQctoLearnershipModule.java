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

/** Generated Model for ZZQctoLearnershipModule
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="ZZQctoLearnershipModule")
public class X_ZZQctoLearnershipModule extends PO implements I_ZZQctoLearnershipModule, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20260702L;

    /** Standard Constructor */
    public X_ZZQctoLearnershipModule (Properties ctx, String ZZQctoLearnershipModule_UU, String trxName)
    {
      super (ctx, ZZQctoLearnershipModule_UU, trxName);
      /** if (ZZQctoLearnershipModule_UU == null)
        {
        } */
    }

    /** Standard Constructor */
    public X_ZZQctoLearnershipModule (Properties ctx, String ZZQctoLearnershipModule_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZQctoLearnershipModule_UU, trxName, virtualColumns);
      /** if (ZZQctoLearnershipModule_UU == null)
        {
        } */
    }

    /** Load Constructor */
    public X_ZZQctoLearnershipModule (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_ZZQctoLearnershipModule[")
        .append(get_UUID()).append("]");
      return sb.toString();
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

	/** Core = Core */
	public static final String ZZMODULETYPE_Core = "Core";
	/** Elective = Elective */
	public static final String ZZMODULETYPE_Elective = "Elective";
	/** Set Module Type.
		@param ZZModuleType Module Type
	*/
	public void setZZModuleType (String ZZModuleType)
	{

		set_Value (COLUMNNAME_ZZModuleType, ZZModuleType);
	}

	/** Get Module Type.
		@return Module Type	  */
	public String getZZModuleType()
	{
		return (String)get_Value(COLUMNNAME_ZZModuleType);
	}

	/** Set ZZQctoLearnershipModule_UU.
		@param ZZQctoLearnershipModule_UU ZZQctoLearnershipModule_UU
	*/
	public void setZZQctoLearnershipModule_UU (String ZZQctoLearnershipModule_UU)
	{
		set_Value (COLUMNNAME_ZZQctoLearnershipModule_UU, ZZQctoLearnershipModule_UU);
	}

	/** Get ZZQctoLearnershipModule_UU.
		@return ZZQctoLearnershipModule_UU	  */
	public String getZZQctoLearnershipModule_UU()
	{
		return (String)get_Value(COLUMNNAME_ZZQctoLearnershipModule_UU);
	}

	public I_ZZQctoLearnership getZZQctoLearnership() throws RuntimeException
	{
		return (I_ZZQctoLearnership)MTable.get(getCtx(), I_ZZQctoLearnership.Table_ID)
			.getPO(getZZQctoLearnership_ID(), get_TrxName());
	}

	/** Set QCTO Learnership.
		@param ZZQctoLearnership_ID QCTO Learnership
	*/
	public void setZZQctoLearnership_ID (int ZZQctoLearnership_ID)
	{
		if (ZZQctoLearnership_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZQctoLearnership_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZQctoLearnership_ID, Integer.valueOf(ZZQctoLearnership_ID));
	}

	/** Get QCTO Learnership.
		@return QCTO Learnership	  */
	public int getZZQctoLearnership_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZQctoLearnership_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_ZZQctoModule getZZQctoModule() throws RuntimeException
	{
		return (I_ZZQctoModule)MTable.get(getCtx(), I_ZZQctoModule.Table_ID)
			.getPO(getZZQctoModule_ID(), get_TrxName());
	}

	/** Set QCTO Module.
		@param ZZQctoModule_ID QCTO Module
	*/
	public void setZZQctoModule_ID (int ZZQctoModule_ID)
	{
		if (ZZQctoModule_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZQctoModule_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZQctoModule_ID, Integer.valueOf(ZZQctoModule_ID));
	}

	/** Get QCTO Module.
		@return QCTO Module	  */
	public int getZZQctoModule_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZQctoModule_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}