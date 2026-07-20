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

/** Generated Model for ZZ_WPA_App_Qualifications
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="ZZ_WPA_App_Qualifications")
public class X_ZZ_WPA_App_Qualifications extends PO implements I_ZZ_WPA_App_Qualifications, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20260720L;

    /** Standard Constructor */
    public X_ZZ_WPA_App_Qualifications (Properties ctx, int ZZ_WPA_App_Qualifications_ID, String trxName)
    {
      super (ctx, ZZ_WPA_App_Qualifications_ID, trxName);
      /** if (ZZ_WPA_App_Qualifications_ID == 0)
        {
        } */
    }

    /** Standard Constructor */
    public X_ZZ_WPA_App_Qualifications (Properties ctx, int ZZ_WPA_App_Qualifications_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZ_WPA_App_Qualifications_ID, trxName, virtualColumns);
      /** if (ZZ_WPA_App_Qualifications_ID == 0)
        {
        } */
    }

    /** Standard Constructor */
    public X_ZZ_WPA_App_Qualifications (Properties ctx, String ZZ_WPA_App_Qualifications_UU, String trxName)
    {
      super (ctx, ZZ_WPA_App_Qualifications_UU, trxName);
      /** if (ZZ_WPA_App_Qualifications_UU == null)
        {
        } */
    }

    /** Standard Constructor */
    public X_ZZ_WPA_App_Qualifications (Properties ctx, String ZZ_WPA_App_Qualifications_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZ_WPA_App_Qualifications_UU, trxName, virtualColumns);
      /** if (ZZ_WPA_App_Qualifications_UU == null)
        {
        } */
    }

    /** Load Constructor */
    public X_ZZ_WPA_App_Qualifications (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_ZZ_WPA_App_Qualifications[")
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

	/** Set Programme Name.
		@param ZZProgrammeName Programme Name
	*/
	public void setZZProgrammeName (String ZZProgrammeName)
	{
		set_Value (COLUMNNAME_ZZProgrammeName, ZZProgrammeName);
	}

	/** Get Programme Name.
		@return Programme Name	  */
	public String getZZProgrammeName()
	{
		return (String)get_Value(COLUMNNAME_ZZProgrammeName);
	}

	/** Set Qualification.
		@param ZZQualification_ID Qualification
	*/
	public void setZZQualification_ID (int ZZQualification_ID)
	{
		if (ZZQualification_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZQualification_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZQualification_ID, Integer.valueOf(ZZQualification_ID));
	}

	/** Get Qualification.
		@return Qualification	  */
	public int getZZQualification_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZQualification_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set OCO Code.
		@param ZZ_OCO_Code OCO Code
	*/
	public void setZZ_OCO_Code (String ZZ_OCO_Code)
	{
		set_Value (COLUMNNAME_ZZ_OCO_Code, ZZ_OCO_Code);
	}

	/** Get OCO Code.
		@return OCO Code	  */
	public String getZZ_OCO_Code()
	{
		return (String)get_Value(COLUMNNAME_ZZ_OCO_Code);
	}

	/** Set Qualifications.
		@param ZZ_WPA_App_Qualifications_ID Qualifications
	*/
	public void setZZ_WPA_App_Qualifications_ID (int ZZ_WPA_App_Qualifications_ID)
	{
		if (ZZ_WPA_App_Qualifications_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZ_WPA_App_Qualifications_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZ_WPA_App_Qualifications_ID, Integer.valueOf(ZZ_WPA_App_Qualifications_ID));
	}

	/** Get Qualifications.
		@return Qualifications	  */
	public int getZZ_WPA_App_Qualifications_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZ_WPA_App_Qualifications_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set ZZ_WPA_App_Qualifications_UU.
		@param ZZ_WPA_App_Qualifications_UU ZZ_WPA_App_Qualifications_UU
	*/
	public void setZZ_WPA_App_Qualifications_UU (String ZZ_WPA_App_Qualifications_UU)
	{
		set_ValueNoCheck (COLUMNNAME_ZZ_WPA_App_Qualifications_UU, ZZ_WPA_App_Qualifications_UU);
	}

	/** Get ZZ_WPA_App_Qualifications_UU.
		@return ZZ_WPA_App_Qualifications_UU	  */
	public String getZZ_WPA_App_Qualifications_UU()
	{
		return (String)get_Value(COLUMNNAME_ZZ_WPA_App_Qualifications_UU);
	}

	public I_ZZ_WPA_Application getZZ_WPA_Application() throws RuntimeException
	{
		return (I_ZZ_WPA_Application)MTable.get(getCtx(), I_ZZ_WPA_Application.Table_ID)
			.getPO(getZZ_WPA_Application_ID(), get_TrxName());
	}

	/** Set WPA Application.
		@param ZZ_WPA_Application_ID WPA Application
	*/
	public void setZZ_WPA_Application_ID (int ZZ_WPA_Application_ID)
	{
		if (ZZ_WPA_Application_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZ_WPA_Application_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZ_WPA_Application_ID, Integer.valueOf(ZZ_WPA_Application_ID));
	}

	/** Get WPA Application.
		@return WPA Application	  */
	public int getZZ_WPA_Application_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZ_WPA_Application_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}