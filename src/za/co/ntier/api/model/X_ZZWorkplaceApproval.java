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

/** Generated Model for ZZWorkplaceApproval
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="ZZWorkplaceApproval")
public class X_ZZWorkplaceApproval extends PO implements I_ZZWorkplaceApproval, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20260702L;

    /** Standard Constructor */
    public X_ZZWorkplaceApproval (Properties ctx, int ZZWorkplaceApproval_ID, String trxName)
    {
      super (ctx, ZZWorkplaceApproval_ID, trxName);
      /** if (ZZWorkplaceApproval_ID == 0)
        {
			setZZWorkplaceApproval_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZWorkplaceApproval (Properties ctx, int ZZWorkplaceApproval_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZWorkplaceApproval_ID, trxName, virtualColumns);
      /** if (ZZWorkplaceApproval_ID == 0)
        {
			setZZWorkplaceApproval_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZWorkplaceApproval (Properties ctx, String ZZWorkplaceApproval_UU, String trxName)
    {
      super (ctx, ZZWorkplaceApproval_UU, trxName);
      /** if (ZZWorkplaceApproval_UU == null)
        {
			setZZWorkplaceApproval_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZWorkplaceApproval (Properties ctx, String ZZWorkplaceApproval_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZWorkplaceApproval_UU, trxName, virtualColumns);
      /** if (ZZWorkplaceApproval_UU == null)
        {
			setZZWorkplaceApproval_ID (0);
        } */
    }

    /** Load Constructor */
    public X_ZZWorkplaceApproval (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_ZZWorkplaceApproval[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Workplace Approval Number.
		@param ZZWorkplaceApprovalNumber Workplace Approval Number
	*/
	public void setZZWorkplaceApprovalNumber (String ZZWorkplaceApprovalNumber)
	{
		set_Value (COLUMNNAME_ZZWorkplaceApprovalNumber, ZZWorkplaceApprovalNumber);
	}

	/** Get Workplace Approval Number.
		@return Workplace Approval Number	  */
	public String getZZWorkplaceApprovalNumber()
	{
		return (String)get_Value(COLUMNNAME_ZZWorkplaceApprovalNumber);
	}

	/** Set Workplace Approval.
		@param ZZWorkplaceApproval_ID Workplace Approval
	*/
	public void setZZWorkplaceApproval_ID (int ZZWorkplaceApproval_ID)
	{
		if (ZZWorkplaceApproval_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZWorkplaceApproval_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZWorkplaceApproval_ID, Integer.valueOf(ZZWorkplaceApproval_ID));
	}

	/** Get Workplace Approval.
		@return Workplace Approval	  */
	public int getZZWorkplaceApproval_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZWorkplaceApproval_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set ZZWorkplaceApproval_UU.
		@param ZZWorkplaceApproval_UU ZZWorkplaceApproval_UU
	*/
	public void setZZWorkplaceApproval_UU (String ZZWorkplaceApproval_UU)
	{
		set_Value (COLUMNNAME_ZZWorkplaceApproval_UU, ZZWorkplaceApproval_UU);
	}

	/** Get ZZWorkplaceApproval_UU.
		@return ZZWorkplaceApproval_UU	  */
	public String getZZWorkplaceApproval_UU()
	{
		return (String)get_Value(COLUMNNAME_ZZWorkplaceApproval_UU);
	}
}