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

/** Generated Model for Assessment_Status
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="Assessment_Status")
public class X_Assessment_Status extends PO implements I_Assessment_Status, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20260814L;

    /** Standard Constructor */
    public X_Assessment_Status (Properties ctx, int Assessment_Status_ID, String trxName)
    {
      super (ctx, Assessment_Status_ID, trxName);
      /** if (Assessment_Status_ID == 0)
        {
			setAssessment_Status_ID (0);
			setName (null);
        } */
    }

    /** Standard Constructor */
    public X_Assessment_Status (Properties ctx, int Assessment_Status_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, Assessment_Status_ID, trxName, virtualColumns);
      /** if (Assessment_Status_ID == 0)
        {
			setAssessment_Status_ID (0);
			setName (null);
        } */
    }

    /** Standard Constructor */
    public X_Assessment_Status (Properties ctx, String Assessment_Status_UU, String trxName)
    {
      super (ctx, Assessment_Status_UU, trxName);
      /** if (Assessment_Status_UU == null)
        {
			setAssessment_Status_ID (0);
			setName (null);
        } */
    }

    /** Standard Constructor */
    public X_Assessment_Status (Properties ctx, String Assessment_Status_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, Assessment_Status_UU, trxName, virtualColumns);
      /** if (Assessment_Status_UU == null)
        {
			setAssessment_Status_ID (0);
			setName (null);
        } */
    }

    /** Load Constructor */
    public X_Assessment_Status (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_Assessment_Status[")
        .append(get_ID()).append(",Name=").append(getName()).append("]");
      return sb.toString();
    }

	/** Set Assessment Status.
		@param Assessment_Status_ID Assessment Status
	*/
	public void setAssessment_Status_ID (int Assessment_Status_ID)
	{
		if (Assessment_Status_ID < 1)
			set_ValueNoCheck (COLUMNNAME_Assessment_Status_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_Assessment_Status_ID, Integer.valueOf(Assessment_Status_ID));
	}

	/** Get Assessment Status.
		@return Assessment Status	  */
	public int getAssessment_Status_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Assessment_Status_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Assessment_Status_UU.
		@param Assessment_Status_UU Assessment_Status_UU
	*/
	public void setAssessment_Status_UU (String Assessment_Status_UU)
	{
		set_Value (COLUMNNAME_Assessment_Status_UU, Assessment_Status_UU);
	}

	/** Get Assessment_Status_UU.
		@return Assessment_Status_UU	  */
	public String getAssessment_Status_UU()
	{
		return (String)get_Value(COLUMNNAME_Assessment_Status_UU);
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

	/** Set id.
		@param id id
	*/
	public void setid (int id)
	{
		set_Value (COLUMNNAME_id, Integer.valueOf(id));
	}

	/** Get id.
		@return id	  */
	public int getid()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_id);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}