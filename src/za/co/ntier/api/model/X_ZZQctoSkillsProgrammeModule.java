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

/** Generated Model for ZZQctoSkillsProgrammeModule
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="ZZQctoSkillsProgrammeModule")
public class X_ZZQctoSkillsProgrammeModule extends PO implements I_ZZQctoSkillsProgrammeModule, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20260702L;

    /** Standard Constructor */
    public X_ZZQctoSkillsProgrammeModule (Properties ctx, String ZZQctoSkillsProgrammeModule_UU, String trxName)
    {
      super (ctx, ZZQctoSkillsProgrammeModule_UU, trxName);
      /** if (ZZQctoSkillsProgrammeModule_UU == null)
        {
        } */
    }

    /** Standard Constructor */
    public X_ZZQctoSkillsProgrammeModule (Properties ctx, String ZZQctoSkillsProgrammeModule_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZQctoSkillsProgrammeModule_UU, trxName, virtualColumns);
      /** if (ZZQctoSkillsProgrammeModule_UU == null)
        {
        } */
    }

    /** Load Constructor */
    public X_ZZQctoSkillsProgrammeModule (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_ZZQctoSkillsProgrammeModule[")
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

	/** Set ZZQctoSkillsProgrammeModule_UU.
		@param ZZQctoSkillsProgrammeModule_UU ZZQctoSkillsProgrammeModule_UU
	*/
	public void setZZQctoSkillsProgrammeModule_UU (String ZZQctoSkillsProgrammeModule_UU)
	{
		set_Value (COLUMNNAME_ZZQctoSkillsProgrammeModule_UU, ZZQctoSkillsProgrammeModule_UU);
	}

	/** Get ZZQctoSkillsProgrammeModule_UU.
		@return ZZQctoSkillsProgrammeModule_UU	  */
	public String getZZQctoSkillsProgrammeModule_UU()
	{
		return (String)get_Value(COLUMNNAME_ZZQctoSkillsProgrammeModule_UU);
	}

	public I_ZZQctoSkillsProgramme getZZQctoSkillsProgramme() throws RuntimeException
	{
		return (I_ZZQctoSkillsProgramme)MTable.get(getCtx(), I_ZZQctoSkillsProgramme.Table_ID)
			.getPO(getZZQctoSkillsProgramme_ID(), get_TrxName());
	}

	/** Set QCTO Skills Programme.
		@param ZZQctoSkillsProgramme_ID QCTO Skills Programme
	*/
	public void setZZQctoSkillsProgramme_ID (int ZZQctoSkillsProgramme_ID)
	{
		if (ZZQctoSkillsProgramme_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZQctoSkillsProgramme_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZQctoSkillsProgramme_ID, Integer.valueOf(ZZQctoSkillsProgramme_ID));
	}

	/** Get QCTO Skills Programme.
		@return QCTO Skills Programme	  */
	public int getZZQctoSkillsProgramme_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZQctoSkillsProgramme_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}