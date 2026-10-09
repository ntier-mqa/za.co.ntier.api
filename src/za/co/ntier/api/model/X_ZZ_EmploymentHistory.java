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

/** Generated Model for ZZ_EmploymentHistory
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="ZZ_EmploymentHistory")
public class X_ZZ_EmploymentHistory extends PO implements I_ZZ_EmploymentHistory, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20261008L;

    /** Standard Constructor */
    public X_ZZ_EmploymentHistory (Properties ctx, int ZZ_EmploymentHistory_ID, String trxName)
    {
      super (ctx, ZZ_EmploymentHistory_ID, trxName);
      /** if (ZZ_EmploymentHistory_ID == 0)
        {
			setZZ_EmploymentHistory_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZ_EmploymentHistory (Properties ctx, int ZZ_EmploymentHistory_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZ_EmploymentHistory_ID, trxName, virtualColumns);
      /** if (ZZ_EmploymentHistory_ID == 0)
        {
			setZZ_EmploymentHistory_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZ_EmploymentHistory (Properties ctx, String ZZ_EmploymentHistory_UU, String trxName)
    {
      super (ctx, ZZ_EmploymentHistory_UU, trxName);
      /** if (ZZ_EmploymentHistory_UU == null)
        {
			setZZ_EmploymentHistory_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZ_EmploymentHistory (Properties ctx, String ZZ_EmploymentHistory_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZ_EmploymentHistory_UU, trxName, virtualColumns);
      /** if (ZZ_EmploymentHistory_UU == null)
        {
			setZZ_EmploymentHistory_ID (0);
        } */
    }

    /** Load Constructor */
    public X_ZZ_EmploymentHistory (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_ZZ_EmploymentHistory[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Company Code.
		@param CompanyCode Company Code
	*/
	public void setCompanyCode (String CompanyCode)
	{
		set_Value (COLUMNNAME_CompanyCode, CompanyCode);
	}

	/** Get Company Code.
		@return Company Code	  */
	public String getCompanyCode()
	{
		return (String)get_Value(COLUMNNAME_CompanyCode);
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

	/** Set Duration.
		@param Duration Normal Duration in Duration Unit
	*/
	public void setDuration (int Duration)
	{
		set_Value (COLUMNNAME_Duration, Integer.valueOf(Duration));
	}

	/** Get Duration.
		@return Normal Duration in Duration Unit
	  */
	public int getDuration()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Duration);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	public I_ZZLearner getZZLearner() throws RuntimeException
	{
		return (I_ZZLearner)MTable.get(getCtx(), I_ZZLearner.Table_ID)
			.getPO(getZZLearner_ID(), get_TrxName());
	}

	/** Set Learner.
		@param ZZLearner_ID Learner
	*/
	public void setZZLearner_ID (int ZZLearner_ID)
	{
		if (ZZLearner_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZLearner_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZLearner_ID, Integer.valueOf(ZZLearner_ID));
	}

	/** Get Learner.
		@return Learner	  */
	public int getZZLearner_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZLearner_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Employment History.
		@param ZZ_EmploymentHistory_ID Employment History
	*/
	public void setZZ_EmploymentHistory_ID (int ZZ_EmploymentHistory_ID)
	{
		if (ZZ_EmploymentHistory_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZ_EmploymentHistory_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZ_EmploymentHistory_ID, Integer.valueOf(ZZ_EmploymentHistory_ID));
	}

	/** Get Employment History.
		@return Employment History	  */
	public int getZZ_EmploymentHistory_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZ_EmploymentHistory_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set ZZ_EmploymentHistory_UU.
		@param ZZ_EmploymentHistory_UU ZZ_EmploymentHistory_UU
	*/
	public void setZZ_EmploymentHistory_UU (String ZZ_EmploymentHistory_UU)
	{
		set_Value (COLUMNNAME_ZZ_EmploymentHistory_UU, ZZ_EmploymentHistory_UU);
	}

	/** Get ZZ_EmploymentHistory_UU.
		@return ZZ_EmploymentHistory_UU	  */
	public String getZZ_EmploymentHistory_UU()
	{
		return (String)get_Value(COLUMNNAME_ZZ_EmploymentHistory_UU);
	}

	/** Set Location.
		@param ZZ_Location Location
	*/
	public void setZZ_Location (String ZZ_Location)
	{
		set_Value (COLUMNNAME_ZZ_Location, ZZ_Location);
	}

	/** Get Location.
		@return Location	  */
	public String getZZ_Location()
	{
		return (String)get_Value(COLUMNNAME_ZZ_Location);
	}

	/** Set Upload.
		@param ZZ_Upload Upload
	*/
	public void setZZ_Upload (String ZZ_Upload)
	{
		set_Value (COLUMNNAME_ZZ_Upload, ZZ_Upload);
	}

	/** Get Upload.
		@return Upload	  */
	public String getZZ_Upload()
	{
		return (String)get_Value(COLUMNNAME_ZZ_Upload);
	}
}