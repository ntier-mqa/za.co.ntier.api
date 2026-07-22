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

/** Generated Model for ZZSkillsProgrammeUnitStandard
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="ZZSkillsProgrammeUnitStandard")
public class X_ZZSkillsProgrammeUnitStandard extends PO implements I_ZZSkillsProgrammeUnitStandard, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20260722L;

    /** Standard Constructor */
    public X_ZZSkillsProgrammeUnitStandard (Properties ctx, int ZZSkillsProgrammeUnitStandard_ID, String trxName)
    {
      super (ctx, ZZSkillsProgrammeUnitStandard_ID, trxName);
      /** if (ZZSkillsProgrammeUnitStandard_ID == 0)
        {
			setZZSkillsProgrammeUnitStandard_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZSkillsProgrammeUnitStandard (Properties ctx, int ZZSkillsProgrammeUnitStandard_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZSkillsProgrammeUnitStandard_ID, trxName, virtualColumns);
      /** if (ZZSkillsProgrammeUnitStandard_ID == 0)
        {
			setZZSkillsProgrammeUnitStandard_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZSkillsProgrammeUnitStandard (Properties ctx, String ZZSkillsProgrammeUnitStandard_UU, String trxName)
    {
      super (ctx, ZZSkillsProgrammeUnitStandard_UU, trxName);
      /** if (ZZSkillsProgrammeUnitStandard_UU == null)
        {
			setZZSkillsProgrammeUnitStandard_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZSkillsProgrammeUnitStandard (Properties ctx, String ZZSkillsProgrammeUnitStandard_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZSkillsProgrammeUnitStandard_UU, trxName, virtualColumns);
      /** if (ZZSkillsProgrammeUnitStandard_UU == null)
        {
			setZZSkillsProgrammeUnitStandard_ID (0);
        } */
    }

    /** Load Constructor */
    public X_ZZSkillsProgrammeUnitStandard (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_ZZSkillsProgrammeUnitStandard[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Credits.
		@param ZZCredits Credits
	*/
	public void setZZCredits (int ZZCredits)
	{
		set_Value (COLUMNNAME_ZZCredits, Integer.valueOf(ZZCredits));
	}

	/** Get Credits.
		@return Credits	  */
	public int getZZCredits()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZCredits);
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

	/** Below Level 01 = Below Level 01 */
	public static final String ZZNQFLEVEL_BelowLevel01 = "Below Level 01";
	/** Level 01 = Level 01 */
	public static final String ZZNQFLEVEL_Level01 = "Level 01";
	/** Level 02 = Level 02 */
	public static final String ZZNQFLEVEL_Level02 = "Level 02";
	/** Level 03 = Level 03 */
	public static final String ZZNQFLEVEL_Level03 = "Level 03";
	/** Level 04 = Level 04 */
	public static final String ZZNQFLEVEL_Level04 = "Level 04";
	/** Level 05 = Level 05 */
	public static final String ZZNQFLEVEL_Level05 = "Level 05";
	/** Level 06 = Level 06 */
	public static final String ZZNQFLEVEL_Level06 = "Level 06";
	/** Level 07 = Level 07 */
	public static final String ZZNQFLEVEL_Level07 = "Level 07";
	/** Level 08 = Level 08 */
	public static final String ZZNQFLEVEL_Level08 = "Level 08";
	/** Level 09 = Level 09 */
	public static final String ZZNQFLEVEL_Level09 = "Level 09";
	/** Level 10 = Level 10 */
	public static final String ZZNQFLEVEL_Level10 = "Level 10";
	/** Level 11 = Level 11 */
	public static final String ZZNQFLEVEL_Level11 = "Level 11";
	/** Set NQF Level.
		@param ZZNqfLevel NQF Level
	*/
	public void setZZNqfLevel (String ZZNqfLevel)
	{

		set_Value (COLUMNNAME_ZZNqfLevel, ZZNqfLevel);
	}

	/** Get NQF Level.
		@return NQF Level	  */
	public String getZZNqfLevel()
	{
		return (String)get_Value(COLUMNNAME_ZZNqfLevel);
	}

	/** Set SAQA Unit Standard Code.
		@param ZZSaqaUnitStandardCode SAQA Unit Standard Code
	*/
	public void setZZSaqaUnitStandardCode (String ZZSaqaUnitStandardCode)
	{
		set_Value (COLUMNNAME_ZZSaqaUnitStandardCode, ZZSaqaUnitStandardCode);
	}

	/** Get SAQA Unit Standard Code.
		@return SAQA Unit Standard Code	  */
	public String getZZSaqaUnitStandardCode()
	{
		return (String)get_Value(COLUMNNAME_ZZSaqaUnitStandardCode);
	}

	/** Set Skills Programme Unit Standard.
		@param ZZSkillsProgrammeUnitStandard_ID Skills Programme Unit Standard
	*/
	public void setZZSkillsProgrammeUnitStandard_ID (int ZZSkillsProgrammeUnitStandard_ID)
	{
		if (ZZSkillsProgrammeUnitStandard_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZSkillsProgrammeUnitStandard_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZSkillsProgrammeUnitStandard_ID, Integer.valueOf(ZZSkillsProgrammeUnitStandard_ID));
	}

	/** Get Skills Programme Unit Standard.
		@return Skills Programme Unit Standard	  */
	public int getZZSkillsProgrammeUnitStandard_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZSkillsProgrammeUnitStandard_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set ZZSkillsProgrammeUnitStandard_UU.
		@param ZZSkillsProgrammeUnitStandard_UU ZZSkillsProgrammeUnitStandard_UU
	*/
	public void setZZSkillsProgrammeUnitStandard_UU (String ZZSkillsProgrammeUnitStandard_UU)
	{
		set_Value (COLUMNNAME_ZZSkillsProgrammeUnitStandard_UU, ZZSkillsProgrammeUnitStandard_UU);
	}

	/** Get ZZSkillsProgrammeUnitStandard_UU.
		@return ZZSkillsProgrammeUnitStandard_UU	  */
	public String getZZSkillsProgrammeUnitStandard_UU()
	{
		return (String)get_Value(COLUMNNAME_ZZSkillsProgrammeUnitStandard_UU);
	}

	public I_ZZSkillsProgramme getZZSkillsProgramme() throws RuntimeException
	{
		return (I_ZZSkillsProgramme)MTable.get(getCtx(), I_ZZSkillsProgramme.Table_ID)
			.getPO(getZZSkillsProgramme_ID(), get_TrxName());
	}

	/** Set Skills Programme.
		@param ZZSkillsProgramme_ID Skills Programme
	*/
	public void setZZSkillsProgramme_ID (int ZZSkillsProgramme_ID)
	{
		if (ZZSkillsProgramme_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZSkillsProgramme_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZSkillsProgramme_ID, Integer.valueOf(ZZSkillsProgramme_ID));
	}

	/** Get Skills Programme.
		@return Skills Programme	  */
	public int getZZSkillsProgramme_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZSkillsProgramme_ID);
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