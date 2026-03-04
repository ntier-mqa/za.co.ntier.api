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

/** Generated Model for ZZOrganisationLinkage
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="ZZOrganisationLinkage")
public class X_ZZOrganisationLinkage extends PO implements I_ZZOrganisationLinkage, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20260304L;

    /** Standard Constructor */
    public X_ZZOrganisationLinkage (Properties ctx, int ZZOrganisationLinkage_ID, String trxName)
    {
      super (ctx, ZZOrganisationLinkage_ID, trxName);
      /** if (ZZOrganisationLinkage_ID == 0)
        {
			setZZOrganisationLinkage_ID (0);
			setZZ_Parent_Uploads (null);
// N
        } */
    }

    /** Standard Constructor */
    public X_ZZOrganisationLinkage (Properties ctx, int ZZOrganisationLinkage_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZOrganisationLinkage_ID, trxName, virtualColumns);
      /** if (ZZOrganisationLinkage_ID == 0)
        {
			setZZOrganisationLinkage_ID (0);
			setZZ_Parent_Uploads (null);
// N
        } */
    }

    /** Standard Constructor */
    public X_ZZOrganisationLinkage (Properties ctx, String ZZOrganisationLinkage_UU, String trxName)
    {
      super (ctx, ZZOrganisationLinkage_UU, trxName);
      /** if (ZZOrganisationLinkage_UU == null)
        {
			setZZOrganisationLinkage_ID (0);
			setZZ_Parent_Uploads (null);
// N
        } */
    }

    /** Standard Constructor */
    public X_ZZOrganisationLinkage (Properties ctx, String ZZOrganisationLinkage_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZOrganisationLinkage_UU, trxName, virtualColumns);
      /** if (ZZOrganisationLinkage_UU == null)
        {
			setZZOrganisationLinkage_ID (0);
			setZZ_Parent_Uploads (null);
// N
        } */
    }

    /** Load Constructor */
    public X_ZZOrganisationLinkage (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_ZZOrganisationLinkage[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Partner Parent.
		@param BPartner_Parent_ID Business Partner Parent
	*/
	public void setBPartner_Parent_ID (int BPartner_Parent_ID)
	{
		if (BPartner_Parent_ID < 1)
			set_Value (COLUMNNAME_BPartner_Parent_ID, null);
		else
			set_Value (COLUMNNAME_BPartner_Parent_ID, Integer.valueOf(BPartner_Parent_ID));
	}

	/** Get Partner Parent.
		@return Business Partner Parent
	  */
	public int getBPartner_Parent_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_BPartner_Parent_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	/** Set Link End (Financial Year).
		@param ZZLinkEndYear Link End (Financial Year)
	*/
	public void setZZLinkEndYear (int ZZLinkEndYear)
	{
		set_Value (COLUMNNAME_ZZLinkEndYear, Integer.valueOf(ZZLinkEndYear));
	}

	/** Get Link End (Financial Year).
		@return Link End (Financial Year)	  */
	public int getZZLinkEndYear()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZLinkEndYear);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Link Start (Financial Year).
		@param ZZLinkStartYear Link Start (Financial Year)
	*/
	public void setZZLinkStartYear (int ZZLinkStartYear)
	{
		set_Value (COLUMNNAME_ZZLinkStartYear, Integer.valueOf(ZZLinkStartYear));
	}

	/** Get Link Start (Financial Year).
		@return Link Start (Financial Year)	  */
	public int getZZLinkStartYear()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZLinkStartYear);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Organisation Linkage.
		@param ZZOrganisationLinkage_ID Organisation Linkage
	*/
	public void setZZOrganisationLinkage_ID (int ZZOrganisationLinkage_ID)
	{
		if (ZZOrganisationLinkage_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZOrganisationLinkage_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZOrganisationLinkage_ID, Integer.valueOf(ZZOrganisationLinkage_ID));
	}

	/** Get Organisation Linkage.
		@return Organisation Linkage	  */
	public int getZZOrganisationLinkage_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZOrganisationLinkage_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set ZZOrganisationLinkage_UU.
		@param ZZOrganisationLinkage_UU ZZOrganisationLinkage_UU
	*/
	public void setZZOrganisationLinkage_UU (String ZZOrganisationLinkage_UU)
	{
		set_Value (COLUMNNAME_ZZOrganisationLinkage_UU, ZZOrganisationLinkage_UU);
	}

	/** Get ZZOrganisationLinkage_UU.
		@return ZZOrganisationLinkage_UU	  */
	public String getZZOrganisationLinkage_UU()
	{
		return (String)get_Value(COLUMNNAME_ZZOrganisationLinkage_UU);
	}

	/** ZZ_Parent_Uploads AD_Reference_ID=319 */
	public static final int ZZ_PARENT_UPLOADS_AD_Reference_ID=319;
	/** No = N */
	public static final String ZZ_PARENT_UPLOADS_No = "N";
	/** Yes = Y */
	public static final String ZZ_PARENT_UPLOADS_Yes = "Y";
	/** Set Parent Uploads.
		@param ZZ_Parent_Uploads Parent Uploads
	*/
	public void setZZ_Parent_Uploads (String ZZ_Parent_Uploads)
	{

		set_Value (COLUMNNAME_ZZ_Parent_Uploads, ZZ_Parent_Uploads);
	}

	/** Get Parent Uploads.
		@return Parent Uploads	  */
	public String getZZ_Parent_Uploads()
	{
		return (String)get_Value(COLUMNNAME_ZZ_Parent_Uploads);
	}

	/** Set SDL Number.
		@param ZZ_SDL_No SDL Number
	*/
	public void setZZ_SDL_No (String ZZ_SDL_No)
	{
		set_Value (COLUMNNAME_ZZ_SDL_No, ZZ_SDL_No);
	}

	/** Get SDL Number.
		@return SDL Number	  */
	public String getZZ_SDL_No()
	{
		return (String)get_Value(COLUMNNAME_ZZ_SDL_No);
	}
}