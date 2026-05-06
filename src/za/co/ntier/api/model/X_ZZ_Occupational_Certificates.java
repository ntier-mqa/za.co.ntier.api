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

/** Generated Model for ZZ_Occupational_Certificates
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="ZZ_Occupational_Certificates")
public class X_ZZ_Occupational_Certificates extends PO implements I_ZZ_Occupational_Certificates, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20260506L;

    /** Standard Constructor */
    public X_ZZ_Occupational_Certificates (Properties ctx, int ZZ_Occupational_Certificates_ID, String trxName)
    {
      super (ctx, ZZ_Occupational_Certificates_ID, trxName);
      /** if (ZZ_Occupational_Certificates_ID == 0)
        {
        } */
    }

    /** Standard Constructor */
    public X_ZZ_Occupational_Certificates (Properties ctx, int ZZ_Occupational_Certificates_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZ_Occupational_Certificates_ID, trxName, virtualColumns);
      /** if (ZZ_Occupational_Certificates_ID == 0)
        {
        } */
    }

    /** Standard Constructor */
    public X_ZZ_Occupational_Certificates (Properties ctx, String ZZ_Occupational_Certificates_UU, String trxName)
    {
      super (ctx, ZZ_Occupational_Certificates_UU, trxName);
      /** if (ZZ_Occupational_Certificates_UU == null)
        {
        } */
    }

    /** Standard Constructor */
    public X_ZZ_Occupational_Certificates (Properties ctx, String ZZ_Occupational_Certificates_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZ_Occupational_Certificates_UU, trxName, virtualColumns);
      /** if (ZZ_Occupational_Certificates_UU == null)
        {
        } */
    }

    /** Load Constructor */
    public X_ZZ_Occupational_Certificates (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_ZZ_Occupational_Certificates[")
        .append(get_ID()).append(",Name=").append(getName()).append("]");
      return sb.toString();
    }

	public org.compiere.model.I_C_BPartner getC_BPartner() throws RuntimeException
	{
		return (org.compiere.model.I_C_BPartner)MTable.get(getCtx(), org.compiere.model.I_C_BPartner.Table_ID)
			.getPO(getC_BPartner_ID(), get_TrxName());
	}

	/** Set Business Partner.
		@param C_BPartner_ID Identifies a Business Partner
	*/
	public void setC_BPartner_ID (int C_BPartner_ID)
	{
		if (C_BPartner_ID < 1)
			set_ValueNoCheck (COLUMNNAME_C_BPartner_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_C_BPartner_ID, Integer.valueOf(C_BPartner_ID));
	}

	/** Get Business Partner.
		@return Identifies a Business Partner
	  */
	public int getC_BPartner_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartner_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	/** Set OFO Occupation.
		@param ZZLkpOfoOccupation_ID OFO Occupation
	*/
	public void setZZLkpOfoOccupation_ID (int ZZLkpOfoOccupation_ID)
	{
		if (ZZLkpOfoOccupation_ID < 1)
			set_Value (COLUMNNAME_ZZLkpOfoOccupation_ID, null);
		else
			set_Value (COLUMNNAME_ZZLkpOfoOccupation_ID, Integer.valueOf(ZZLkpOfoOccupation_ID));
	}

	/** Get OFO Occupation.
		@return OFO Occupation
	  */
	public int getZZLkpOfoOccupation_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZLkpOfoOccupation_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Below Level 01 = 0 */
	public static final String ZZNQFLEVEL_BelowLevel01 = "0";
	/** Level 01 = 1 */
	public static final String ZZNQFLEVEL_Level01 = "1";
	/** Level 10 = 10 */
	public static final String ZZNQFLEVEL_Level10 = "10";
	/** Level 11 = 11 */
	public static final String ZZNQFLEVEL_Level11 = "11";
	/** Level 02 = 2 */
	public static final String ZZNQFLEVEL_Level02 = "2";
	/** Level 03 = 3 */
	public static final String ZZNQFLEVEL_Level03 = "3";
	/** Level 04 = 4 */
	public static final String ZZNQFLEVEL_Level04 = "4";
	/** Level 05 = 5 */
	public static final String ZZNQFLEVEL_Level05 = "5";
	/** Level 06 = 6 */
	public static final String ZZNQFLEVEL_Level06 = "6";
	/** Level 07 = 7 */
	public static final String ZZNQFLEVEL_Level07 = "7";
	/** Level 08 = 8 */
	public static final String ZZNQFLEVEL_Level08 = "8";
	/** Level 09 = 9 */
	public static final String ZZNQFLEVEL_Level09 = "9";
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

	/** Set Occupational Certificates.
		@param ZZ_Occupational_Certificates_ID Occupational Certificates
	*/
	public void setZZ_Occupational_Certificates_ID (int ZZ_Occupational_Certificates_ID)
	{
		if (ZZ_Occupational_Certificates_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZ_Occupational_Certificates_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZ_Occupational_Certificates_ID, Integer.valueOf(ZZ_Occupational_Certificates_ID));
	}

	/** Get Occupational Certificates.
		@return Occupational Certificates	  */
	public int getZZ_Occupational_Certificates_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZ_Occupational_Certificates_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set ZZ_Occupational_Certificates_UU.
		@param ZZ_Occupational_Certificates_UU ZZ_Occupational_Certificates_UU
	*/
	public void setZZ_Occupational_Certificates_UU (String ZZ_Occupational_Certificates_UU)
	{
		set_ValueNoCheck (COLUMNNAME_ZZ_Occupational_Certificates_UU, ZZ_Occupational_Certificates_UU);
	}

	/** Get ZZ_Occupational_Certificates_UU.
		@return ZZ_Occupational_Certificates_UU	  */
	public String getZZ_Occupational_Certificates_UU()
	{
		return (String)get_Value(COLUMNNAME_ZZ_Occupational_Certificates_UU);
	}
}