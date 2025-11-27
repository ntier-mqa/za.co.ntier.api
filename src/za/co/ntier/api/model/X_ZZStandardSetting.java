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

import org.compiere.model.I_Persistent;
import org.compiere.model.MTable;
import org.compiere.model.PO;
import org.compiere.model.POInfo;

/** Generated Model for ZZStandardSetting
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="ZZStandardSetting")
public class X_ZZStandardSetting extends PO implements I_ZZStandardSetting, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20250925L;

    /** Standard Constructor */
    public X_ZZStandardSetting (Properties ctx, int ZZStandardSetting_ID, String trxName)
    {
      super (ctx, ZZStandardSetting_ID, trxName);
      /** if (ZZStandardSetting_ID == 0)
        {
			setZZStandardSetting_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZStandardSetting (Properties ctx, int ZZStandardSetting_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZStandardSetting_ID, trxName, virtualColumns);
      /** if (ZZStandardSetting_ID == 0)
        {
			setZZStandardSetting_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZStandardSetting (Properties ctx, String ZZStandardSetting_UU, String trxName)
    {
      super (ctx, ZZStandardSetting_UU, trxName);
      /** if (ZZStandardSetting_UU == null)
        {
			setZZStandardSetting_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZStandardSetting (Properties ctx, String ZZStandardSetting_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZStandardSetting_UU, trxName, virtualColumns);
      /** if (ZZStandardSetting_UU == null)
        {
			setZZStandardSetting_ID (0);
        } */
    }

    /** Load Constructor */
    public X_ZZStandardSetting (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_ZZStandardSetting[")
        .append(get_ID()).append(",Name=").append(getName()).append("]");
      return sb.toString();
    }

	/** Set Data Type.
		@param DataType Type of data
	*/
	public void setDataType (String DataType)
	{
		set_Value (COLUMNNAME_DataType, DataType);
	}

	/** Get Data Type.
		@return Type of data
	  */
	public String getDataType()
	{
		return (String)get_Value(COLUMNNAME_DataType);
	}

	/** IsSelected AD_Reference_ID=319 */
	public static final int ISSELECTED_AD_Reference_ID=319;
	/** No = N */
	public static final String ISSELECTED_No = "N";
	/** Yes = Y */
	public static final String ISSELECTED_Yes = "Y";
	/** Set Selected.
		@param IsSelected Selected
	*/
	public void setIsSelected (String IsSelected)
	{

		set_ValueNoCheck (COLUMNNAME_IsSelected, IsSelected);
	}

	/** Get Selected.
		@return Selected	  */
	public String getIsSelected()
	{
		return (String)get_Value(COLUMNNAME_IsSelected);
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

	/** Set Standard Setting.
		@param ZZStandardSetting_ID Standard Setting
	*/
	public void setZZStandardSetting_ID (int ZZStandardSetting_ID)
	{
		if (ZZStandardSetting_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZStandardSetting_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZStandardSetting_ID, Integer.valueOf(ZZStandardSetting_ID));
	}

	/** Get Standard Setting.
		@return Standard Setting
	  */
	public int getZZStandardSetting_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZStandardSetting_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set ZZStandardSetting_UU.
		@param ZZStandardSetting_UU ZZStandardSetting_UU
	*/
	public void setZZStandardSetting_UU (String ZZStandardSetting_UU)
	{
		set_Value (COLUMNNAME_ZZStandardSetting_UU, ZZStandardSetting_UU);
	}

	/** Get ZZStandardSetting_UU.
		@return ZZStandardSetting_UU	  */
	public String getZZStandardSetting_UU()
	{
		return (String)get_Value(COLUMNNAME_ZZStandardSetting_UU);
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
}