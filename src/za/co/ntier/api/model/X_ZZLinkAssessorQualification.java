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

/** Generated Model for ZZLinkAssessorQualification
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="ZZLinkAssessorQualification")
public class X_ZZLinkAssessorQualification extends PO implements I_ZZLinkAssessorQualification, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20260406L;

    /** Standard Constructor */
    public X_ZZLinkAssessorQualification (Properties ctx, int ZZLinkAssessorQualification_ID, String trxName)
    {
      super (ctx, ZZLinkAssessorQualification_ID, trxName);
      /** if (ZZLinkAssessorQualification_ID == 0)
        {
			setZZLinkAssessorQualification_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZLinkAssessorQualification (Properties ctx, int ZZLinkAssessorQualification_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZLinkAssessorQualification_ID, trxName, virtualColumns);
      /** if (ZZLinkAssessorQualification_ID == 0)
        {
			setZZLinkAssessorQualification_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZLinkAssessorQualification (Properties ctx, String ZZLinkAssessorQualification_UU, String trxName)
    {
      super (ctx, ZZLinkAssessorQualification_UU, trxName);
      /** if (ZZLinkAssessorQualification_UU == null)
        {
			setZZLinkAssessorQualification_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZLinkAssessorQualification (Properties ctx, String ZZLinkAssessorQualification_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZLinkAssessorQualification_UU, trxName, virtualColumns);
      /** if (ZZLinkAssessorQualification_UU == null)
        {
			setZZLinkAssessorQualification_ID (0);
        } */
    }

    /** Load Constructor */
    public X_ZZLinkAssessorQualification (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_ZZLinkAssessorQualification[")
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

	/** Set Link Assessor Qualification.
		@param ZZLinkAssessorQualification_ID Link Assessor Qualification
	*/
	public void setZZLinkAssessorQualification_ID (int ZZLinkAssessorQualification_ID)
	{
		if (ZZLinkAssessorQualification_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZLinkAssessorQualification_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZLinkAssessorQualification_ID, Integer.valueOf(ZZLinkAssessorQualification_ID));
	}

	/** Get Link Assessor Qualification.
		@return Link Assessor Qualification	  */
	public int getZZLinkAssessorQualification_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZLinkAssessorQualification_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set ZZLinkAssessorQualification_UU.
		@param ZZLinkAssessorQualification_UU ZZLinkAssessorQualification_UU
	*/
	public void setZZLinkAssessorQualification_UU (String ZZLinkAssessorQualification_UU)
	{
		set_Value (COLUMNNAME_ZZLinkAssessorQualification_UU, ZZLinkAssessorQualification_UU);
	}

	/** Get ZZLinkAssessorQualification_UU.
		@return ZZLinkAssessorQualification_UU	  */
	public String getZZLinkAssessorQualification_UU()
	{
		return (String)get_Value(COLUMNNAME_ZZLinkAssessorQualification_UU);
	}

	public I_ZZQualification getZZQualification() throws RuntimeException
	{
		return (I_ZZQualification)MTable.get(getCtx(), I_ZZQualification.Table_ID)
			.getPO(getZZQualification_ID(), get_TrxName());
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
}