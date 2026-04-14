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

/** Generated Model for ZZ_QAAudit
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="ZZ_QAAudit")
public class X_ZZ_QAAudit extends PO implements I_ZZ_QAAudit, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20260414L;

    /** Standard Constructor */
    public X_ZZ_QAAudit (Properties ctx, int ZZ_QAAudit_ID, String trxName)
    {
      super (ctx, ZZ_QAAudit_ID, trxName);
      /** if (ZZ_QAAudit_ID == 0)
        {
        } */
    }

    /** Standard Constructor */
    public X_ZZ_QAAudit (Properties ctx, int ZZ_QAAudit_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZ_QAAudit_ID, trxName, virtualColumns);
      /** if (ZZ_QAAudit_ID == 0)
        {
        } */
    }

    /** Standard Constructor */
    public X_ZZ_QAAudit (Properties ctx, String ZZ_QAAudit_UU, String trxName)
    {
      super (ctx, ZZ_QAAudit_UU, trxName);
      /** if (ZZ_QAAudit_UU == null)
        {
        } */
    }

    /** Standard Constructor */
    public X_ZZ_QAAudit (Properties ctx, String ZZ_QAAudit_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZ_QAAudit_UU, trxName, virtualColumns);
      /** if (ZZ_QAAudit_UU == null)
        {
        } */
    }

    /** Load Constructor */
    public X_ZZ_QAAudit (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_ZZ_QAAudit[")
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

	public org.compiere.model.I_AD_User getZZ_AuditLead() throws RuntimeException
	{
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_ID)
			.getPO(getZZ_AuditLead_ID(), get_TrxName());
	}

	/** Set ZZ_AuditLead_ID.
		@param ZZ_AuditLead_ID ZZ_AuditLead_ID
	*/
	public void setZZ_AuditLead_ID (int ZZ_AuditLead_ID)
	{
		if (ZZ_AuditLead_ID < 1)
			set_Value (COLUMNNAME_ZZ_AuditLead_ID, null);
		else
			set_Value (COLUMNNAME_ZZ_AuditLead_ID, Integer.valueOf(ZZ_AuditLead_ID));
	}

	/** Get ZZ_AuditLead_ID.
		@return ZZ_AuditLead_ID	  */
	public int getZZ_AuditLead_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZ_AuditLead_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Date of Onsite Assessment.
		@param ZZ_OnsiteAssessmentDate Date of Onsite Assessment
	*/
	public void setZZ_OnsiteAssessmentDate (Timestamp ZZ_OnsiteAssessmentDate)
	{
		set_Value (COLUMNNAME_ZZ_OnsiteAssessmentDate, ZZ_OnsiteAssessmentDate);
	}

	/** Get Date of Onsite Assessment.
		@return Date of Onsite Assessment	  */
	public Timestamp getZZ_OnsiteAssessmentDate()
	{
		return (Timestamp)get_Value(COLUMNNAME_ZZ_OnsiteAssessmentDate);
	}

	public I_ZZ_Organization getZZ_Organization() throws RuntimeException
	{
		return (I_ZZ_Organization)MTable.get(getCtx(), I_ZZ_Organization.Table_ID)
			.getPO(getZZ_Organization_ID(), get_TrxName());
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

	/** Set QA Audit.
		@param ZZ_QAAudit_ID QA Audit
	*/
	public void setZZ_QAAudit_ID (int ZZ_QAAudit_ID)
	{
		if (ZZ_QAAudit_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZ_QAAudit_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZ_QAAudit_ID, Integer.valueOf(ZZ_QAAudit_ID));
	}

	/** Get QA Audit.
		@return QA Audit	  */
	public int getZZ_QAAudit_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZ_QAAudit_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set ZZ_QAAudit_UU.
		@param ZZ_QAAudit_UU ZZ_QAAudit_UU
	*/
	public void setZZ_QAAudit_UU (String ZZ_QAAudit_UU)
	{
		set_ValueNoCheck (COLUMNNAME_ZZ_QAAudit_UU, ZZ_QAAudit_UU);
	}

	/** Get ZZ_QAAudit_UU.
		@return ZZ_QAAudit_UU	  */
	public String getZZ_QAAudit_UU()
	{
		return (String)get_Value(COLUMNNAME_ZZ_QAAudit_UU);
	}
}