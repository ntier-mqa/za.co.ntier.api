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

/** Generated Model for ZZAssessmentCentre
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="ZZAssessmentCentre")
public class X_ZZAssessmentCentre extends PO implements I_ZZAssessmentCentre, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20260702L;

    /** Standard Constructor */
    public X_ZZAssessmentCentre (Properties ctx, int ZZAssessmentCentre_ID, String trxName)
    {
      super (ctx, ZZAssessmentCentre_ID, trxName);
      /** if (ZZAssessmentCentre_ID == 0)
        {
			setZZAssessmentCentre_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZAssessmentCentre (Properties ctx, int ZZAssessmentCentre_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZAssessmentCentre_ID, trxName, virtualColumns);
      /** if (ZZAssessmentCentre_ID == 0)
        {
			setZZAssessmentCentre_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZAssessmentCentre (Properties ctx, String ZZAssessmentCentre_UU, String trxName)
    {
      super (ctx, ZZAssessmentCentre_UU, trxName);
      /** if (ZZAssessmentCentre_UU == null)
        {
			setZZAssessmentCentre_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZAssessmentCentre (Properties ctx, String ZZAssessmentCentre_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZAssessmentCentre_UU, trxName, virtualColumns);
      /** if (ZZAssessmentCentre_UU == null)
        {
			setZZAssessmentCentre_ID (0);
        } */
    }

    /** Load Constructor */
    public X_ZZAssessmentCentre (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_ZZAssessmentCentre[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Assessment Centre.
		@param ZZAssessmentCentre_ID Assessment Centre
	*/
	public void setZZAssessmentCentre_ID (int ZZAssessmentCentre_ID)
	{
		if (ZZAssessmentCentre_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZAssessmentCentre_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZAssessmentCentre_ID, Integer.valueOf(ZZAssessmentCentre_ID));
	}

	/** Get Assessment Centre.
		@return Assessment Centre	  */
	public int getZZAssessmentCentre_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZAssessmentCentre_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set ZZAssessmentCentre_UU.
		@param ZZAssessmentCentre_UU ZZAssessmentCentre_UU
	*/
	public void setZZAssessmentCentre_UU (String ZZAssessmentCentre_UU)
	{
		set_Value (COLUMNNAME_ZZAssessmentCentre_UU, ZZAssessmentCentre_UU);
	}

	/** Get ZZAssessmentCentre_UU.
		@return ZZAssessmentCentre_UU	  */
	public String getZZAssessmentCentre_UU()
	{
		return (String)get_Value(COLUMNNAME_ZZAssessmentCentre_UU);
	}

	/** Set QCTO Assessment Centre Number.
		@param ZZQctoAssessmentCentreNumber QCTO Assessment Centre Number
	*/
	public void setZZQctoAssessmentCentreNumber (String ZZQctoAssessmentCentreNumber)
	{
		set_Value (COLUMNNAME_ZZQctoAssessmentCentreNumber, ZZQctoAssessmentCentreNumber);
	}

	/** Get QCTO Assessment Centre Number.
		@return QCTO Assessment Centre Number	  */
	public String getZZQctoAssessmentCentreNumber()
	{
		return (String)get_Value(COLUMNNAME_ZZQctoAssessmentCentreNumber);
	}
}