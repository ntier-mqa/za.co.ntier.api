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
import java.sql.Timestamp;
import java.util.Properties;
import org.compiere.model.*;

/** Generated Model for ZZ_Allocation_Intake_Plan
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="ZZ_Allocation_Intake_Plan")
public class X_ZZ_Allocation_Intake_Plan extends PO implements I_ZZ_Allocation_Intake_Plan, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20261020L;

    /** Standard Constructor */
    public X_ZZ_Allocation_Intake_Plan (Properties ctx, int ZZ_Allocation_Intake_Plan_ID, String trxName)
    {
      super (ctx, ZZ_Allocation_Intake_Plan_ID, trxName);
      /** if (ZZ_Allocation_Intake_Plan_ID == 0)
        {
			setLineNo (0);
			setZZNoLearners (0);
			setZZ_Allocation_Intake_Plan_ID (0);
			setZZ_Allocation_Offer_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZ_Allocation_Intake_Plan (Properties ctx, int ZZ_Allocation_Intake_Plan_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZ_Allocation_Intake_Plan_ID, trxName, virtualColumns);
      /** if (ZZ_Allocation_Intake_Plan_ID == 0)
        {
			setLineNo (0);
			setZZNoLearners (0);
			setZZ_Allocation_Intake_Plan_ID (0);
			setZZ_Allocation_Offer_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZ_Allocation_Intake_Plan (Properties ctx, String ZZ_Allocation_Intake_Plan_UU, String trxName)
    {
      super (ctx, ZZ_Allocation_Intake_Plan_UU, trxName);
      /** if (ZZ_Allocation_Intake_Plan_UU == null)
        {
			setLineNo (0);
			setZZNoLearners (0);
			setZZ_Allocation_Intake_Plan_ID (0);
			setZZ_Allocation_Offer_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZ_Allocation_Intake_Plan (Properties ctx, String ZZ_Allocation_Intake_Plan_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZ_Allocation_Intake_Plan_UU, trxName, virtualColumns);
      /** if (ZZ_Allocation_Intake_Plan_UU == null)
        {
			setLineNo (0);
			setZZNoLearners (0);
			setZZ_Allocation_Intake_Plan_ID (0);
			setZZ_Allocation_Offer_ID (0);
        } */
    }

    /** Load Constructor */
    public X_ZZ_Allocation_Intake_Plan (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_ZZ_Allocation_Intake_Plan[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Line No.
		@param LineNo Line No
	*/
	public void setLineNo (int LineNo)
	{
		set_Value (COLUMNNAME_LineNo, Integer.valueOf(LineNo));
	}

	/** Get Line No.
		@return Line No
	  */
	public int getLineNo()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_LineNo);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Intake Date.
		@param ZZIntakeDate Intake Date
	*/
	public void setZZIntakeDate (Timestamp ZZIntakeDate)
	{
		set_Value (COLUMNNAME_ZZIntakeDate, ZZIntakeDate);
	}

	/** Get Intake Date.
		@return Intake Date
	  */
	public Timestamp getZZIntakeDate()
	{
		return (Timestamp)get_Value(COLUMNNAME_ZZIntakeDate);
	}

	/** Set No Learners.
		@param ZZNoLearners Number of Learners
	*/
	public void setZZNoLearners (int ZZNoLearners)
	{
		set_Value (COLUMNNAME_ZZNoLearners, Integer.valueOf(ZZNoLearners));
	}

	/** Get No Learners.
		@return Number of Learners
	  */
	public int getZZNoLearners()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZNoLearners);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Qualification.
		@param ZZQualification_ID Qualification
	*/
	public void setZZQualification_ID (int ZZQualification_ID)
	{
		if (ZZQualification_ID < 1)
			set_Value (COLUMNNAME_ZZQualification_ID, null);
		else
			set_Value (COLUMNNAME_ZZQualification_ID, Integer.valueOf(ZZQualification_ID));
	}

	/** Get Qualification.
		@return Qualification
	  */
	public int getZZQualification_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZQualification_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Trade Name.
		@param ZZTradeName Trade / Qualification Name
	*/
	public void setZZTradeName (String ZZTradeName)
	{
		set_Value (COLUMNNAME_ZZTradeName, ZZTradeName);
	}

	/** Get Trade Name.
		@return Trade / Qualification Name
	  */
	public String getZZTradeName()
	{
		return (String)get_Value(COLUMNNAME_ZZTradeName);
	}

	/** Set Intake Plan Line.
		@param ZZ_Allocation_Intake_Plan_ID Intake Plan Line
	*/
	public void setZZ_Allocation_Intake_Plan_ID (int ZZ_Allocation_Intake_Plan_ID)
	{
		if (ZZ_Allocation_Intake_Plan_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZ_Allocation_Intake_Plan_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZ_Allocation_Intake_Plan_ID, Integer.valueOf(ZZ_Allocation_Intake_Plan_ID));
	}

	/** Get Intake Plan Line.
		@return Intake Plan Line
	  */
	public int getZZ_Allocation_Intake_Plan_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZ_Allocation_Intake_Plan_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set UUID.
		@param ZZ_Allocation_Intake_Plan_UU UUID
	*/
	public void setZZ_Allocation_Intake_Plan_UU (String ZZ_Allocation_Intake_Plan_UU)
	{
		set_Value (COLUMNNAME_ZZ_Allocation_Intake_Plan_UU, ZZ_Allocation_Intake_Plan_UU);
	}

	/** Get UUID.
		@return UUID
	  */
	public String getZZ_Allocation_Intake_Plan_UU()
	{
		return (String)get_Value(COLUMNNAME_ZZ_Allocation_Intake_Plan_UU);
	}

	public I_ZZ_Allocation_Offer getZZ_Allocation_Offer() throws RuntimeException
	{
		return (I_ZZ_Allocation_Offer)MTable.get(getCtx(), I_ZZ_Allocation_Offer.Table_ID)
			.getPO(getZZ_Allocation_Offer_ID(), get_TrxName());
	}

	/** Set Allocation Offer.
		@param ZZ_Allocation_Offer_ID Allocation Offer
	*/
	public void setZZ_Allocation_Offer_ID (int ZZ_Allocation_Offer_ID)
	{
		if (ZZ_Allocation_Offer_ID < 1)
			set_Value (COLUMNNAME_ZZ_Allocation_Offer_ID, null);
		else
			set_Value (COLUMNNAME_ZZ_Allocation_Offer_ID, Integer.valueOf(ZZ_Allocation_Offer_ID));
	}

	/** Get Allocation Offer.
		@return Allocation Offer
	  */
	public int getZZ_Allocation_Offer_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZ_Allocation_Offer_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_ZZ_Trade getZZ_Trade() throws RuntimeException
	{
		return (I_ZZ_Trade)MTable.get(getCtx(), I_ZZ_Trade.Table_ID)
			.getPO(getZZ_Trade_ID(), get_TrxName());
	}

	/** Set Trade.
		@param ZZ_Trade_ID Trade
	*/
	public void setZZ_Trade_ID (int ZZ_Trade_ID)
	{
		if (ZZ_Trade_ID < 1)
			set_Value (COLUMNNAME_ZZ_Trade_ID, null);
		else
			set_Value (COLUMNNAME_ZZ_Trade_ID, Integer.valueOf(ZZ_Trade_ID));
	}

	/** Get Trade.
		@return Trade
	  */
	public int getZZ_Trade_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZ_Trade_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}