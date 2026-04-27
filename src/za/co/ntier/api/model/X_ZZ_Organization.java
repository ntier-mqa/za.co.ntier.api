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

/** Generated Model for ZZ_Organization
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="ZZ_Organization")
public class X_ZZ_Organization extends PO implements I_ZZ_Organization, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20260427L;

    /** Standard Constructor */
    public X_ZZ_Organization (Properties ctx, int ZZ_Organization_ID, String trxName)
    {
      super (ctx, ZZ_Organization_ID, trxName);
      /** if (ZZ_Organization_ID == 0)
        {
			setZZ_IsAuditResultsEntered (false);
// N
        } */
    }

    /** Standard Constructor */
    public X_ZZ_Organization (Properties ctx, int ZZ_Organization_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZ_Organization_ID, trxName, virtualColumns);
      /** if (ZZ_Organization_ID == 0)
        {
			setZZ_IsAuditResultsEntered (false);
// N
        } */
    }

    /** Standard Constructor */
    public X_ZZ_Organization (Properties ctx, String ZZ_Organization_UU, String trxName)
    {
      super (ctx, ZZ_Organization_UU, trxName);
      /** if (ZZ_Organization_UU == null)
        {
			setZZ_IsAuditResultsEntered (false);
// N
        } */
    }

    /** Standard Constructor */
    public X_ZZ_Organization (Properties ctx, String ZZ_Organization_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZ_Organization_UU, trxName, virtualColumns);
      /** if (ZZ_Organization_UU == null)
        {
			setZZ_IsAuditResultsEntered (false);
// N
        } */
    }

    /** Load Constructor */
    public X_ZZ_Organization (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_ZZ_Organization[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Date From.
		@param DateFrom Starting date for a range
	*/
	public void setDateFrom (Timestamp DateFrom)
	{
		set_Value (COLUMNNAME_DateFrom, DateFrom);
	}

	/** Get Date From.
		@return Starting date for a range
	  */
	public Timestamp getDateFrom()
	{
		return (Timestamp)get_Value(COLUMNNAME_DateFrom);
	}

	/** Set Date To.
		@param DateTo End date of a date range
	*/
	public void setDateTo (Timestamp DateTo)
	{
		set_Value (COLUMNNAME_DateTo, DateTo);
	}

	/** Get Date To.
		@return End date of a date range
	  */
	public Timestamp getDateTo()
	{
		return (Timestamp)get_Value(COLUMNNAME_DateTo);
	}

	/** Set Note.
		@param Note Optional additional user defined information
	*/
	public void setNote (String Note)
	{
		set_Value (COLUMNNAME_Note, Note);
	}

	/** Get Note.
		@return Optional additional user defined information
	  */
	public String getNote()
	{
		return (String)get_Value(COLUMNNAME_Note);
	}

	/** Set Legal Name.
		@param ZZLegalName Legal Name
	*/
	public void setZZLegalName (String ZZLegalName)
	{
		set_Value (COLUMNNAME_ZZLegalName, ZZLegalName);
	}

	/** Get Legal Name.
		@return Legal Name	  */
	public String getZZLegalName()
	{
		return (String)get_Value(COLUMNNAME_ZZLegalName);
	}

	public I_ZZ_AllocationSchedule getZZ_AllocationSchedule() throws RuntimeException
	{
		return (I_ZZ_AllocationSchedule)MTable.get(getCtx(), I_ZZ_AllocationSchedule.Table_ID)
			.getPO(getZZ_AllocationSchedule_ID(), get_TrxName());
	}

	/** Set ZZ_AllocationSchedule_ID.
		@param ZZ_AllocationSchedule_ID ZZ_AllocationSchedule_ID
	*/
	public void setZZ_AllocationSchedule_ID (int ZZ_AllocationSchedule_ID)
	{
		if (ZZ_AllocationSchedule_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZ_AllocationSchedule_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZ_AllocationSchedule_ID, Integer.valueOf(ZZ_AllocationSchedule_ID));
	}

	/** Get ZZ_AllocationSchedule_ID.
		@return ZZ_AllocationSchedule_ID	  */
	public int getZZ_AllocationSchedule_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZ_AllocationSchedule_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Cancelled = CA */
	public static final String ZZ_AUDITCONFIRMATION_Cancelled = "CA";
	/** Confirmed = CO */
	public static final String ZZ_AUDITCONFIRMATION_Confirmed = "CO";
	/** Set Audit Confirmation.
		@param ZZ_AuditConfirmation Audit Confirmation
	*/
	public void setZZ_AuditConfirmation (String ZZ_AuditConfirmation)
	{

		set_Value (COLUMNNAME_ZZ_AuditConfirmation, ZZ_AuditConfirmation);
	}

	/** Get Audit Confirmation.
		@return Audit Confirmation	  */
	public String getZZ_AuditConfirmation()
	{
		return (String)get_Value(COLUMNNAME_ZZ_AuditConfirmation);
	}

	/** Set ZZ_AuditLead_IDs.
		@param ZZ_AuditLead_IDs ZZ_AuditLead_IDs
	*/
	public void setZZ_AuditLead_IDs (String ZZ_AuditLead_IDs)
	{

		set_Value (COLUMNNAME_ZZ_AuditLead_IDs, ZZ_AuditLead_IDs);
	}

	/** Get ZZ_AuditLead_IDs.
		@return ZZ_AuditLead_IDs	  */
	public String getZZ_AuditLead_IDs()
	{
		return (String)get_Value(COLUMNNAME_ZZ_AuditLead_IDs);
	}

	/** Set Audit Results Entered.
		@param ZZ_IsAuditResultsEntered Audit Results Entered
	*/
	public void setZZ_IsAuditResultsEntered (boolean ZZ_IsAuditResultsEntered)
	{
		set_Value (COLUMNNAME_ZZ_IsAuditResultsEntered, Boolean.valueOf(ZZ_IsAuditResultsEntered));
	}

	/** Get Audit Results Entered.
		@return Audit Results Entered	  */
	public boolean isZZ_IsAuditResultsEntered()
	{
		Object oo = get_Value(COLUMNNAME_ZZ_IsAuditResultsEntered);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Organization.
		@param ZZ_Organization_ID Organization
	*/
	public void setZZ_Organization_ID (int ZZ_Organization_ID)
	{
		if (ZZ_Organization_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZ_Organization_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZ_Organization_ID, Integer.valueOf(ZZ_Organization_ID));
	}

	/** Get Organization.
		@return Organization	  */
	public int getZZ_Organization_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZ_Organization_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set ZZ_Organization_UU.
		@param ZZ_Organization_UU ZZ_Organization_UU
	*/
	public void setZZ_Organization_UU (String ZZ_Organization_UU)
	{
		set_ValueNoCheck (COLUMNNAME_ZZ_Organization_UU, ZZ_Organization_UU);
	}

	/** Get ZZ_Organization_UU.
		@return ZZ_Organization_UU	  */
	public String getZZ_Organization_UU()
	{
		return (String)get_Value(COLUMNNAME_ZZ_Organization_UU);
	}
}