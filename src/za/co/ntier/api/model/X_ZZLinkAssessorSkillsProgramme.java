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

/** Generated Model for ZZLinkAssessorSkillsProgramme
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="ZZLinkAssessorSkillsProgramme")
public class X_ZZLinkAssessorSkillsProgramme extends PO implements I_ZZLinkAssessorSkillsProgramme, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20260406L;

    /** Standard Constructor */
    public X_ZZLinkAssessorSkillsProgramme (Properties ctx, int ZZLinkAssessorSkillsProgramme_ID, String trxName)
    {
      super (ctx, ZZLinkAssessorSkillsProgramme_ID, trxName);
      /** if (ZZLinkAssessorSkillsProgramme_ID == 0)
        {
			setZZLinkAssessorSkillsProgramme_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZLinkAssessorSkillsProgramme (Properties ctx, int ZZLinkAssessorSkillsProgramme_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZLinkAssessorSkillsProgramme_ID, trxName, virtualColumns);
      /** if (ZZLinkAssessorSkillsProgramme_ID == 0)
        {
			setZZLinkAssessorSkillsProgramme_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZLinkAssessorSkillsProgramme (Properties ctx, String ZZLinkAssessorSkillsProgramme_UU, String trxName)
    {
      super (ctx, ZZLinkAssessorSkillsProgramme_UU, trxName);
      /** if (ZZLinkAssessorSkillsProgramme_UU == null)
        {
			setZZLinkAssessorSkillsProgramme_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZLinkAssessorSkillsProgramme (Properties ctx, String ZZLinkAssessorSkillsProgramme_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZLinkAssessorSkillsProgramme_UU, trxName, virtualColumns);
      /** if (ZZLinkAssessorSkillsProgramme_UU == null)
        {
			setZZLinkAssessorSkillsProgramme_ID (0);
        } */
    }

    /** Load Constructor */
    public X_ZZLinkAssessorSkillsProgramme (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_ZZLinkAssessorSkillsProgramme[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public I_ZZAssessorPerson getZZAssessorPerson() throws RuntimeException
	{
		return (I_ZZAssessorPerson)MTable.get(getCtx(), I_ZZAssessorPerson.Table_ID)
			.getPO(getZZAssessorPerson_ID(), get_TrxName());
	}

	/** Set Assessor Person.
		@param ZZAssessorPerson_ID Assessor Person
	*/
	public void setZZAssessorPerson_ID (int ZZAssessorPerson_ID)
	{
		if (ZZAssessorPerson_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZAssessorPerson_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZAssessorPerson_ID, Integer.valueOf(ZZAssessorPerson_ID));
	}

	/** Get Assessor Person.
		@return Assessor Person	  */
	public int getZZAssessorPerson_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZAssessorPerson_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Link Assessor Skills Programme.
		@param ZZLinkAssessorSkillsProgramme_ID Link Assessor Skills Programme
	*/
	public void setZZLinkAssessorSkillsProgramme_ID (int ZZLinkAssessorSkillsProgramme_ID)
	{
		if (ZZLinkAssessorSkillsProgramme_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZLinkAssessorSkillsProgramme_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZLinkAssessorSkillsProgramme_ID, Integer.valueOf(ZZLinkAssessorSkillsProgramme_ID));
	}

	/** Get Link Assessor Skills Programme.
		@return Link Assessor Skills Programme
	  */
	public int getZZLinkAssessorSkillsProgramme_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZLinkAssessorSkillsProgramme_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set ZZLinkAssessorSkillsProgramme_UU.
		@param ZZLinkAssessorSkillsProgramme_UU ZZLinkAssessorSkillsProgramme_UU
	*/
	public void setZZLinkAssessorSkillsProgramme_UU (String ZZLinkAssessorSkillsProgramme_UU)
	{
		set_Value (COLUMNNAME_ZZLinkAssessorSkillsProgramme_UU, ZZLinkAssessorSkillsProgramme_UU);
	}

	/** Get ZZLinkAssessorSkillsProgramme_UU.
		@return ZZLinkAssessorSkillsProgramme_UU	  */
	public String getZZLinkAssessorSkillsProgramme_UU()
	{
		return (String)get_Value(COLUMNNAME_ZZLinkAssessorSkillsProgramme_UU);
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
}