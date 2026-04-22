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

/** Generated Model for ZZ_NAMB_Alloc_TTC
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="ZZ_NAMB_Alloc_TTC")
public class X_ZZ_NAMB_Alloc_TTC extends PO implements I_ZZ_NAMB_Alloc_TTC, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20260422L;

    /** Standard Constructor */
    public X_ZZ_NAMB_Alloc_TTC (Properties ctx, int ZZ_NAMB_Alloc_TTC_ID, String trxName)
    {
      super (ctx, ZZ_NAMB_Alloc_TTC_ID, trxName);
      /** if (ZZ_NAMB_Alloc_TTC_ID == 0)
        {
			setIsOpenSchedule (false);
// N
        } */
    }

    /** Standard Constructor */
    public X_ZZ_NAMB_Alloc_TTC (Properties ctx, int ZZ_NAMB_Alloc_TTC_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZ_NAMB_Alloc_TTC_ID, trxName, virtualColumns);
      /** if (ZZ_NAMB_Alloc_TTC_ID == 0)
        {
			setIsOpenSchedule (false);
// N
        } */
    }

    /** Standard Constructor */
    public X_ZZ_NAMB_Alloc_TTC (Properties ctx, String ZZ_NAMB_Alloc_TTC_UU, String trxName)
    {
      super (ctx, ZZ_NAMB_Alloc_TTC_UU, trxName);
      /** if (ZZ_NAMB_Alloc_TTC_UU == null)
        {
			setIsOpenSchedule (false);
// N
        } */
    }

    /** Standard Constructor */
    public X_ZZ_NAMB_Alloc_TTC (Properties ctx, String ZZ_NAMB_Alloc_TTC_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZ_NAMB_Alloc_TTC_UU, trxName, virtualColumns);
      /** if (ZZ_NAMB_Alloc_TTC_UU == null)
        {
			setIsOpenSchedule (false);
// N
        } */
    }

    /** Load Constructor */
    public X_ZZ_NAMB_Alloc_TTC (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_ZZ_NAMB_Alloc_TTC[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Address.
		@param Address Address
	*/
	public void setAddress (String Address)
	{
		set_ValueNoCheck (COLUMNNAME_Address, Address);
	}

	/** Get Address.
		@return Address	  */
	public String getAddress()
	{
		return (String)get_Value(COLUMNNAME_Address);
	}

	/** Set City.
		@param City Identifies a City
	*/
	public void setCity (String City)
	{
		set_ValueNoCheck (COLUMNNAME_City, City);
	}

	/** Get City.
		@return Identifies a City
	  */
	public String getCity()
	{
		return (String)get_Value(COLUMNNAME_City);
	}

	/** Set Contact Name.
		@param ContactName Business Partner Contact Name
	*/
	public void setContactName (String ContactName)
	{
		set_ValueNoCheck (COLUMNNAME_ContactName, ContactName);
	}

	/** Get Contact Name.
		@return Business Partner Contact Name
	  */
	public String getContactName()
	{
		return (String)get_Value(COLUMNNAME_ContactName);
	}

	/** Set Date Received.
		@param DateReceived Date a product was received
	*/
	public void setDateReceived (Timestamp DateReceived)
	{
		set_Value (COLUMNNAME_DateReceived, DateReceived);
	}

	/** Get Date Received.
		@return Date a product was received
	  */
	public Timestamp getDateReceived()
	{
		return (Timestamp)get_Value(COLUMNNAME_DateReceived);
	}

	/** Set Document No.
		@param DocumentNo Document sequence number of the document
	*/
	public void setDocumentNo (String DocumentNo)
	{
		set_ValueNoCheck (COLUMNNAME_DocumentNo, DocumentNo);
	}

	/** Get Document No.
		@return Document sequence number of the document
	  */
	public String getDocumentNo()
	{
		return (String)get_Value(COLUMNNAME_DocumentNo);
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

	/** Set IsOpenSchedule.
		@param IsOpenSchedule IsOpenSchedule
	*/
	public void setIsOpenSchedule (boolean IsOpenSchedule)
	{
		set_ValueNoCheck (COLUMNNAME_IsOpenSchedule, Boolean.valueOf(IsOpenSchedule));
	}

	/** Get IsOpenSchedule.
		@return IsOpenSchedule	  */
	public boolean isOpenSchedule()
	{
		Object oo = get_Value(COLUMNNAME_IsOpenSchedule);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Phone.
		@param Phone Identifies a telephone number
	*/
	public void setPhone (String Phone)
	{
		set_ValueNoCheck (COLUMNNAME_Phone, Phone);
	}

	/** Get Phone.
		@return Identifies a telephone number
	  */
	public String getPhone()
	{
		return (String)get_Value(COLUMNNAME_Phone);
	}

	/** Set Region.
		@param Region Region
	*/
	public void setRegion (String Region)
	{
		set_ValueNoCheck (COLUMNNAME_Region, Region);
	}

	/** Get Region.
		@return Region	  */
	public String getRegion()
	{
		return (String)get_Value(COLUMNNAME_Region);
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

	/** Set Allocated.
		@param ZZ_Allocated Allocated
	*/
	public void setZZ_Allocated (String ZZ_Allocated)
	{
		set_Value (COLUMNNAME_ZZ_Allocated, ZZ_Allocated);
	}

	/** Get Allocated.
		@return Allocated	  */
	public String getZZ_Allocated()
	{
		return (String)get_Value(COLUMNNAME_ZZ_Allocated);
	}

	/** Set Allocation Month.
		@param ZZ_AllocationMonth Allocation Month
	*/
	public void setZZ_AllocationMonth (String ZZ_AllocationMonth)
	{
		set_Value (COLUMNNAME_ZZ_AllocationMonth, ZZ_AllocationMonth);
	}

	/** Get Allocation Month.
		@return Allocation Month
	  */
	public String getZZ_AllocationMonth()
	{
		return (String)get_Value(COLUMNNAME_ZZ_AllocationMonth);
	}

	/** Set Allocation No.
		@param ZZ_AllocationNo Allocation No
	*/
	public void setZZ_AllocationNo (String ZZ_AllocationNo)
	{
		set_Value (COLUMNNAME_ZZ_AllocationNo, ZZ_AllocationNo);
	}

	/** Get Allocation No.
		@return Allocation No	  */
	public String getZZ_AllocationNo()
	{
		return (String)get_Value(COLUMNNAME_ZZ_AllocationNo);
	}

	/** Audit Confirmed = AC */
	public static final String ZZ_DOCSTATUS_AuditConfirmed = "AC";
	/** Approved = AP */
	public static final String ZZ_DOCSTATUS_Approved = "AP";
	/** Awaiting QCTO Recommendation = AW */
	public static final String ZZ_DOCSTATUS_AwaitingQCTORecommendation = "AW";
	/** Audit Cancelled = AX */
	public static final String ZZ_DOCSTATUS_AuditCancelled = "AX";
	/** Draft = DR */
	public static final String ZZ_DOCSTATUS_Draft = "DR";
	/** Not Approved = NA */
	public static final String ZZ_DOCSTATUS_NotApproved = "NA";
	/** Not Recommended = NR */
	public static final String ZZ_DOCSTATUS_NotRecommended = "NR";
	/** Recommended = RC */
	public static final String ZZ_DOCSTATUS_Recommended = "RC";
	/** Received from QCTO = RF */
	public static final String ZZ_DOCSTATUS_ReceivedFromQCTO = "RF";
	/** Audit Notification Sent = ST */
	public static final String ZZ_DOCSTATUS_AuditNotificationSent = "ST";
	/** Site Visit Notification Sent = SV */
	public static final String ZZ_DOCSTATUS_SiteVisitNotificationSent = "SV";
	/** Site Visit Date Confirmed = VC */
	public static final String ZZ_DOCSTATUS_SiteVisitDateConfirmed = "VC";
	/** Set Document Status.
		@param ZZ_DocStatus Document Status
	*/
	public void setZZ_DocStatus (String ZZ_DocStatus)
	{

		set_Value (COLUMNNAME_ZZ_DocStatus, ZZ_DocStatus);
	}

	/** Get Document Status.
		@return Document Status	  */
	public String getZZ_DocStatus()
	{
		return (String)get_Value(COLUMNNAME_ZZ_DocStatus);
	}

	/** Set TTC.
		@param ZZ_NAMB_Alloc_TTC_ID TTC
	*/
	public void setZZ_NAMB_Alloc_TTC_ID (int ZZ_NAMB_Alloc_TTC_ID)
	{
		if (ZZ_NAMB_Alloc_TTC_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZ_NAMB_Alloc_TTC_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZ_NAMB_Alloc_TTC_ID, Integer.valueOf(ZZ_NAMB_Alloc_TTC_ID));
	}

	/** Get TTC.
		@return TTC	  */
	public int getZZ_NAMB_Alloc_TTC_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZ_NAMB_Alloc_TTC_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set ZZ_NAMB_Alloc_TTC_UU.
		@param ZZ_NAMB_Alloc_TTC_UU ZZ_NAMB_Alloc_TTC_UU
	*/
	public void setZZ_NAMB_Alloc_TTC_UU (String ZZ_NAMB_Alloc_TTC_UU)
	{
		set_ValueNoCheck (COLUMNNAME_ZZ_NAMB_Alloc_TTC_UU, ZZ_NAMB_Alloc_TTC_UU);
	}

	/** Get ZZ_NAMB_Alloc_TTC_UU.
		@return ZZ_NAMB_Alloc_TTC_UU	  */
	public String getZZ_NAMB_Alloc_TTC_UU()
	{
		return (String)get_Value(COLUMNNAME_ZZ_NAMB_Alloc_TTC_UU);
	}

	public I_ZZ_NAMB_Allocations getZZ_NAMB_Allocations() throws RuntimeException
	{
		return (I_ZZ_NAMB_Allocations)MTable.get(getCtx(), I_ZZ_NAMB_Allocations.Table_ID)
			.getPO(getZZ_NAMB_Allocations_ID(), get_TrxName());
	}

	/** Set NAMB Allocations.
		@param ZZ_NAMB_Allocations_ID NAMB Allocations
	*/
	public void setZZ_NAMB_Allocations_ID (int ZZ_NAMB_Allocations_ID)
	{
		if (ZZ_NAMB_Allocations_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZ_NAMB_Allocations_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZ_NAMB_Allocations_ID, Integer.valueOf(ZZ_NAMB_Allocations_ID));
	}

	/** Get NAMB Allocations.
		@return NAMB Allocations	  */
	public int getZZ_NAMB_Allocations_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZ_NAMB_Allocations_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Scope of Trades.
		@param ZZ_ScopeOfTrades Scope of Trades
	*/
	public void setZZ_ScopeOfTrades (String ZZ_ScopeOfTrades)
	{
		set_Value (COLUMNNAME_ZZ_ScopeOfTrades, ZZ_ScopeOfTrades);
	}

	/** Get Scope of Trades.
		@return Scope of Trades
	  */
	public String getZZ_ScopeOfTrades()
	{
		return (String)get_Value(COLUMNNAME_ZZ_ScopeOfTrades);
	}
}