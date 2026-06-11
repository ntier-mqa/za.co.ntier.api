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

/** Generated Model for ZZLkpOfoOccupationTree
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="ZZLkpOfoOccupationTree")
public class X_ZZLkpOfoOccupationTree extends PO implements I_ZZLkpOfoOccupationTree, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20260611L;

    /** Standard Constructor */
    public X_ZZLkpOfoOccupationTree (Properties ctx, int ZZLkpOfoOccupationTree_ID, String trxName)
    {
      super (ctx, ZZLkpOfoOccupationTree_ID, trxName);
      /** if (ZZLkpOfoOccupationTree_ID == 0)
        {
			setIsSummary (false);
// N
			setZZLkpOfoOccupationTree_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZLkpOfoOccupationTree (Properties ctx, int ZZLkpOfoOccupationTree_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZLkpOfoOccupationTree_ID, trxName, virtualColumns);
      /** if (ZZLkpOfoOccupationTree_ID == 0)
        {
			setIsSummary (false);
// N
			setZZLkpOfoOccupationTree_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZLkpOfoOccupationTree (Properties ctx, String ZZLkpOfoOccupationTree_UU, String trxName)
    {
      super (ctx, ZZLkpOfoOccupationTree_UU, trxName);
      /** if (ZZLkpOfoOccupationTree_UU == null)
        {
			setIsSummary (false);
// N
			setZZLkpOfoOccupationTree_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZLkpOfoOccupationTree (Properties ctx, String ZZLkpOfoOccupationTree_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZLkpOfoOccupationTree_UU, trxName, virtualColumns);
      /** if (ZZLkpOfoOccupationTree_UU == null)
        {
			setIsSummary (false);
// N
			setZZLkpOfoOccupationTree_ID (0);
        } */
    }

    /** Load Constructor */
    public X_ZZLkpOfoOccupationTree (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 2 - Client
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
      StringBuilder sb = new StringBuilder ("X_ZZLkpOfoOccupationTree[")
        .append(get_ID()).append(",Name=").append(getName()).append("]");
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

	/** Set Summary Level.
		@param IsSummary This is a summary entity
	*/
	public void setIsSummary (boolean IsSummary)
	{
		set_Value (COLUMNNAME_IsSummary, Boolean.valueOf(IsSummary));
	}

	/** Get Summary Level.
		@return This is a summary entity
	  */
	public boolean isSummary()
	{
		Object oo = get_Value(COLUMNNAME_IsSummary);
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

	/** Set Search Key.
		@param Value Search key for the record in the format required - must be unique
	*/
	public void setValue (String Value)
	{
		set_Value (COLUMNNAME_Value, Value);
	}

	/** Get Search Key.
		@return Search key for the record in the format required - must be unique
	  */
	public String getValue()
	{
		return (String)get_Value(COLUMNNAME_Value);
	}

	/** Set Ofo Occupation.
		@param ZZLkpOfoOccupationTree_ID Ofo Occupation
	*/
	public void setZZLkpOfoOccupationTree_ID (int ZZLkpOfoOccupationTree_ID)
	{
		if (ZZLkpOfoOccupationTree_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZLkpOfoOccupationTree_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZLkpOfoOccupationTree_ID, Integer.valueOf(ZZLkpOfoOccupationTree_ID));
	}

	/** Get Ofo Occupation.
		@return Ofo Occupation	  */
	public int getZZLkpOfoOccupationTree_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZLkpOfoOccupationTree_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set ZZLkpOfoOccupationTree_UU.
		@param ZZLkpOfoOccupationTree_UU ZZLkpOfoOccupationTree_UU
	*/
	public void setZZLkpOfoOccupationTree_UU (String ZZLkpOfoOccupationTree_UU)
	{
		set_Value (COLUMNNAME_ZZLkpOfoOccupationTree_UU, ZZLkpOfoOccupationTree_UU);
	}

	/** Get ZZLkpOfoOccupationTree_UU.
		@return ZZLkpOfoOccupationTree_UU	  */
	public String getZZLkpOfoOccupationTree_UU()
	{
		return (String)get_Value(COLUMNNAME_ZZLkpOfoOccupationTree_UU);
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

	/** Major Group = Major Group */
	public static final String ZZOFOLEVELTYPE_MajorGroup = "Major Group";
	/** Sub Major Group = Sub Major Group */
	public static final String ZZOFOLEVELTYPE_SubMajorGroup = "Sub Major Group";
	/** Unit Group = Unit Group */
	public static final String ZZOFOLEVELTYPE_UnitGroup = "Unit Group";
	/** Set OFO Level Type.
		@param ZZOfoLevelType OFO Level Type
	*/
	public void setZZOfoLevelType (String ZZOfoLevelType)
	{

		set_Value (COLUMNNAME_ZZOfoLevelType, ZZOfoLevelType);
	}

	/** Get OFO Level Type.
		@return OFO Level Type	  */
	public String getZZOfoLevelType()
	{
		return (String)get_Value(COLUMNNAME_ZZOfoLevelType);
	}

	public I_ZZOfoYear getZZOfoYear() throws RuntimeException
	{
		return (I_ZZOfoYear)MTable.get(getCtx(), I_ZZOfoYear.Table_ID)
			.getPO(getZZOfoYear_ID(), get_TrxName());
	}

	/** Set OFO Year.
		@param ZZOfoYear_ID OFO Year
	*/
	public void setZZOfoYear_ID (int ZZOfoYear_ID)
	{
		if (ZZOfoYear_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZOfoYear_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZOfoYear_ID, Integer.valueOf(ZZOfoYear_ID));
	}

	/** Get OFO Year.
		@return OFO Year	  */
	public int getZZOfoYear_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZOfoYear_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}