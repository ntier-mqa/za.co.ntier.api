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

/** Generated Model for ZZ_EDP_Application
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="ZZ_EDP_Application")
public class X_ZZ_EDP_Application extends PO implements I_ZZ_EDP_Application, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20260129L;

    /** Standard Constructor */
    public X_ZZ_EDP_Application (Properties ctx, int ZZ_EDP_Application_ID, String trxName)
    {
      super (ctx, ZZ_EDP_Application_ID, trxName);
      /** if (ZZ_EDP_Application_ID == 0)
        {
			setisAspiringExecutive (false);
// N
			setisExecutive (false);
// N
        } */
    }

    /** Standard Constructor */
    public X_ZZ_EDP_Application (Properties ctx, int ZZ_EDP_Application_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZ_EDP_Application_ID, trxName, virtualColumns);
      /** if (ZZ_EDP_Application_ID == 0)
        {
			setisAspiringExecutive (false);
// N
			setisExecutive (false);
// N
        } */
    }

    /** Standard Constructor */
    public X_ZZ_EDP_Application (Properties ctx, String ZZ_EDP_Application_UU, String trxName)
    {
      super (ctx, ZZ_EDP_Application_UU, trxName);
      /** if (ZZ_EDP_Application_UU == null)
        {
			setisAspiringExecutive (false);
// N
			setisExecutive (false);
// N
        } */
    }

    /** Standard Constructor */
    public X_ZZ_EDP_Application (Properties ctx, String ZZ_EDP_Application_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZ_EDP_Application_UU, trxName, virtualColumns);
      /** if (ZZ_EDP_Application_UU == null)
        {
			setisAspiringExecutive (false);
// N
			setisExecutive (false);
// N
        } */
    }

    /** Load Constructor */
    public X_ZZ_EDP_Application (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_ZZ_EDP_Application[")
        .append(get_ID()).append(",Name=").append(getName()).append("]");
      return sb.toString();
    }

	/** Set Age.
		@param Age Age
	*/
	public void setAge (int Age)
	{
		set_Value (COLUMNNAME_Age, Integer.valueOf(Age));
	}

	/** Get Age.
		@return Age	  */
	public int getAge()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Age);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set AltCellphonenumber.
		@param AltCellphonenumber Alternate Cellphone number
	*/
	public void setAltCellphonenumber (String AltCellphonenumber)
	{
		set_Value (COLUMNNAME_AltCellphonenumber, AltCellphonenumber);
	}

	/** Get AltCellphonenumber.
		@return Alternate Cellphone number
	  */
	public String getAltCellphonenumber()
	{
		return (String)get_Value(COLUMNNAME_AltCellphonenumber);
	}

	/** Set Cellphonenumber.
		@param Cellphonenumber Cellphonenumber
	*/
	public void setCellphonenumber (String Cellphonenumber)
	{
		set_Value (COLUMNNAME_Cellphonenumber, Cellphonenumber);
	}

	/** Get Cellphonenumber.
		@return Cellphonenumber	  */
	public String getCellphonenumber()
	{
		return (String)get_Value(COLUMNNAME_Cellphonenumber);
	}

	/** Set EMail Address.
		@param EMail Electronic Mail Address
	*/
	public void setEMail (String EMail)
	{
		set_Value (COLUMNNAME_EMail, EMail);
	}

	/** Get EMail Address.
		@return Electronic Mail Address
	  */
	public String getEMail()
	{
		return (String)get_Value(COLUMNNAME_EMail);
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

	/** Set Position.
		@param Position Position
	*/
	public void setPosition (String Position)
	{
		set_Value (COLUMNNAME_Position, Position);
	}

	/** Get Position.
		@return Position	  */
	public String getPosition()
	{
		return (String)get_Value(COLUMNNAME_Position);
	}

	/** Set Surname.
		@param Surname Surname
	*/
	public void setSurname (String Surname)
	{
		set_Value (COLUMNNAME_Surname, Surname);
	}

	/** Get Surname.
		@return Surname	  */
	public String getSurname()
	{
		return (String)get_Value(COLUMNNAME_Surname);
	}

	/** Famale = F */
	public static final String ZZGENDER_Famale = "F";
	/** Male = M */
	public static final String ZZGENDER_Male = "M";
	/** Other = O */
	public static final String ZZGENDER_Other = "O";
	/** Set Gender.
		@param ZZGender Gender
	*/
	public void setZZGender (String ZZGender)
	{

		set_Value (COLUMNNAME_ZZGender, ZZGender);
	}

	/** Get Gender.
		@return Gender	  */
	public String getZZGender()
	{
		return (String)get_Value(COLUMNNAME_ZZGender);
	}

	public I_ZZ_Application_Form getZZ_Application_Form() throws RuntimeException
	{
		return (I_ZZ_Application_Form)MTable.get(getCtx(), I_ZZ_Application_Form.Table_ID)
			.getPO(getZZ_Application_Form_ID(), get_TrxName());
	}

	/** Set Application Form.
		@param ZZ_Application_Form_ID Application Form
	*/
	public void setZZ_Application_Form_ID (int ZZ_Application_Form_ID)
	{
		if (ZZ_Application_Form_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZ_Application_Form_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZ_Application_Form_ID, Integer.valueOf(ZZ_Application_Form_ID));
	}

	/** Get Application Form.
		@return Application Form	  */
	public int getZZ_Application_Form_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZ_Application_Form_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set ZZ_EDP_Application_ID.
		@param ZZ_EDP_Application_ID ZZ_EDP_Application_ID
	*/
	public void setZZ_EDP_Application_ID (int ZZ_EDP_Application_ID)
	{
		if (ZZ_EDP_Application_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZ_EDP_Application_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZ_EDP_Application_ID, Integer.valueOf(ZZ_EDP_Application_ID));
	}

	/** Get ZZ_EDP_Application_ID.
		@return ZZ_EDP_Application_ID	  */
	public int getZZ_EDP_Application_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZ_EDP_Application_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set ZZ_EDP_Application_UU.
		@param ZZ_EDP_Application_UU ZZ_EDP_Application_UU
	*/
	public void setZZ_EDP_Application_UU (String ZZ_EDP_Application_UU)
	{
		set_ValueNoCheck (COLUMNNAME_ZZ_EDP_Application_UU, ZZ_EDP_Application_UU);
	}

	/** Get ZZ_EDP_Application_UU.
		@return ZZ_EDP_Application_UU	  */
	public String getZZ_EDP_Application_UU()
	{
		return (String)get_Value(COLUMNNAME_ZZ_EDP_Application_UU);
	}

	/** Set ID/Passport No.
		@param ZZ_ID_Passport_No ID/Passport No
	*/
	public void setZZ_ID_Passport_No (String ZZ_ID_Passport_No)
	{
		set_Value (COLUMNNAME_ZZ_ID_Passport_No, ZZ_ID_Passport_No);
	}

	/** Get ID/Passport No.
		@return ID/Passport No	  */
	public String getZZ_ID_Passport_No()
	{
		return (String)get_Value(COLUMNNAME_ZZ_ID_Passport_No);
	}

	public I_ZZ_LI_HighestEducation getZZ_LI_HighestEducation() throws RuntimeException
	{
		return (I_ZZ_LI_HighestEducation)MTable.get(getCtx(), I_ZZ_LI_HighestEducation.Table_ID)
			.getPO(getZZ_LI_HighestEducation_ID(), get_TrxName());
	}

	/** Set Highest Education.
		@param ZZ_LI_HighestEducation_ID Highest Education
	*/
	public void setZZ_LI_HighestEducation_ID (int ZZ_LI_HighestEducation_ID)
	{
		if (ZZ_LI_HighestEducation_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZ_LI_HighestEducation_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZ_LI_HighestEducation_ID, Integer.valueOf(ZZ_LI_HighestEducation_ID));
	}

	/** Get Highest Education.
		@return Highest Education	  */
	public int getZZ_LI_HighestEducation_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZ_LI_HighestEducation_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Level 1 = 01 */
	public static final String ZZ_NQF_LEVEL_Level1 = "01";
	/** Level 2 = 02 */
	public static final String ZZ_NQF_LEVEL_Level2 = "02";
	/** Level 3 = 03 */
	public static final String ZZ_NQF_LEVEL_Level3 = "03";
	/** Level 4 = 04 */
	public static final String ZZ_NQF_LEVEL_Level4 = "04";
	/** Level 5 = 05 */
	public static final String ZZ_NQF_LEVEL_Level5 = "05";
	/** Level 6 = 06 */
	public static final String ZZ_NQF_LEVEL_Level6 = "06";
	/** Level 7 = 07 */
	public static final String ZZ_NQF_LEVEL_Level7 = "07";
	/** Level 8 = 08 */
	public static final String ZZ_NQF_LEVEL_Level8 = "08";
	/** Level 9 = 09 */
	public static final String ZZ_NQF_LEVEL_Level9 = "09";
	/** Level 10 = 10 */
	public static final String ZZ_NQF_LEVEL_Level10 = "10";
	/** Level1-3 = L3 */
	public static final String ZZ_NQF_LEVEL_Level1_3 = "L3";
	/** N1 - N3 = NN */
	public static final String ZZ_NQF_LEVEL_N1_N3 = "NN";
	/** Pre Basic = PB */
	public static final String ZZ_NQF_LEVEL_PreBasic = "PB";
	/** Set NQF Level.
		@param ZZ_NQF_Level NQF Level
	*/
	public void setZZ_NQF_Level (String ZZ_NQF_Level)
	{

		set_Value (COLUMNNAME_ZZ_NQF_Level, ZZ_NQF_Level);
	}

	/** Get NQF Level.
		@return NQF Level	  */
	public String getZZ_NQF_Level()
	{
		return (String)get_Value(COLUMNNAME_ZZ_NQF_Level);
	}

	/** Set isAspiringExecutive.
		@param isAspiringExecutive isAspiringExecutive
	*/
	public void setisAspiringExecutive (boolean isAspiringExecutive)
	{
		set_Value (COLUMNNAME_isAspiringExecutive, Boolean.valueOf(isAspiringExecutive));
	}

	/** Get isAspiringExecutive.
		@return isAspiringExecutive	  */
	public boolean isAspiringExecutive()
	{
		Object oo = get_Value(COLUMNNAME_isAspiringExecutive);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set isExecutive.
		@param isExecutive isExecutive
	*/
	public void setisExecutive (boolean isExecutive)
	{
		set_Value (COLUMNNAME_isExecutive, Boolean.valueOf(isExecutive));
	}

	/** Get isExecutive.
		@return isExecutive	  */
	public boolean isExecutive()
	{
		Object oo = get_Value(COLUMNNAME_isExecutive);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}
}