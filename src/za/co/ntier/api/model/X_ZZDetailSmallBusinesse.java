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

/** Generated Model for ZZDetailSmallBusinesse
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="ZZDetailSmallBusinesse")
public class X_ZZDetailSmallBusinesse extends PO implements I_ZZDetailSmallBusinesse, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20250925L;

    /** Standard Constructor */
    public X_ZZDetailSmallBusinesse (Properties ctx, int ZZDetailSmallBusinesse_ID, String trxName)
    {
      super (ctx, ZZDetailSmallBusinesse_ID, trxName);
      /** if (ZZDetailSmallBusinesse_ID == 0)
        {
			setZZDetailSmallBusinesse_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZDetailSmallBusinesse (Properties ctx, int ZZDetailSmallBusinesse_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZDetailSmallBusinesse_ID, trxName, virtualColumns);
      /** if (ZZDetailSmallBusinesse_ID == 0)
        {
			setZZDetailSmallBusinesse_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZDetailSmallBusinesse (Properties ctx, String ZZDetailSmallBusinesse_UU, String trxName)
    {
      super (ctx, ZZDetailSmallBusinesse_UU, trxName);
      /** if (ZZDetailSmallBusinesse_UU == null)
        {
			setZZDetailSmallBusinesse_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZDetailSmallBusinesse (Properties ctx, String ZZDetailSmallBusinesse_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZDetailSmallBusinesse_UU, trxName, virtualColumns);
      /** if (ZZDetailSmallBusinesse_UU == null)
        {
			setZZDetailSmallBusinesse_ID (0);
        } */
    }

    /** Load Constructor */
    public X_ZZDetailSmallBusinesse (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_ZZDetailSmallBusinesse[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Businesses Name.
		@param ZZBusinessesName Name of business/cooperative/NPO/NGO/CBO to be supported
	*/
	public void setZZBusinessesName (String ZZBusinessesName)
	{
		set_Value (COLUMNNAME_ZZBusinessesName, ZZBusinessesName);
	}

	/** Get Businesses Name.
		@return Name of business/cooperative/NPO/NGO/CBO to be supported
	  */
	public String getZZBusinessesName()
	{
		return (String)get_Value(COLUMNNAME_ZZBusinessesName);
	}

	/** Set Detail Small Businesse.
		@param ZZDetailSmallBusinesse_ID LIST OF BUSINESSES/COOPERATIVES/NPO/NGO/CBO TO BE SUPPORTED AND TRAINING PROGRAMMES
	*/
	public void setZZDetailSmallBusinesse_ID (int ZZDetailSmallBusinesse_ID)
	{
		if (ZZDetailSmallBusinesse_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZDetailSmallBusinesse_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZDetailSmallBusinesse_ID, Integer.valueOf(ZZDetailSmallBusinesse_ID));
	}

	/** Get Detail Small Businesse.
		@return LIST OF BUSINESSES/COOPERATIVES/NPO/NGO/CBO TO BE SUPPORTED AND TRAINING PROGRAMMES
	  */
	public int getZZDetailSmallBusinesse_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZDetailSmallBusinesse_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set ZZDetailSmallBusinesse_UU.
		@param ZZDetailSmallBusinesse_UU ZZDetailSmallBusinesse_UU
	*/
	public void setZZDetailSmallBusinesse_UU (String ZZDetailSmallBusinesse_UU)
	{
		set_Value (COLUMNNAME_ZZDetailSmallBusinesse_UU, ZZDetailSmallBusinesse_UU);
	}

	/** Get ZZDetailSmallBusinesse_UU.
		@return ZZDetailSmallBusinesse_UU	  */
	public String getZZDetailSmallBusinesse_UU()
	{
		return (String)get_Value(COLUMNNAME_ZZDetailSmallBusinesse_UU);
	}

	/** Set No Of Credit Offered.
		@param ZZNoCreditOffered No Of Credit Offered
	*/
	public void setZZNoCreditOffered (int ZZNoCreditOffered)
	{
		set_Value (COLUMNNAME_ZZNoCreditOffered, Integer.valueOf(ZZNoCreditOffered));
	}

	/** Get No Of Credit Offered.
		@return No Of Credit Offered	  */
	public int getZZNoCreditOffered()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZNoCreditOffered);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set No Trainees.
		@param ZZNoTrainees No Trainees
	*/
	public void setZZNoTrainees (int ZZNoTrainees)
	{
		set_Value (COLUMNNAME_ZZNoTrainees, Integer.valueOf(ZZNoTrainees));
	}

	/** Get No Trainees.
		@return No Trainees	  */
	public int getZZNoTrainees()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZNoTrainees);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Duration Training Day.
		@param ZZNoTrainingDay Duration Of Training In Day
	*/
	public void setZZNoTrainingDay (int ZZNoTrainingDay)
	{
		set_Value (COLUMNNAME_ZZNoTrainingDay, Integer.valueOf(ZZNoTrainingDay));
	}

	/** Get Duration Training Day.
		@return Duration Of Training In Day
	  */
	public int getZZNoTrainingDay()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZNoTrainingDay);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Programme Name.
		@param ZZProgrammeName Programme Name
	*/
	public void setZZProgrammeName (String ZZProgrammeName)
	{
		set_Value (COLUMNNAME_ZZProgrammeName, ZZProgrammeName);
	}

	/** Get Programme Name.
		@return Programme Name	  */
	public String getZZProgrammeName()
	{
		return (String)get_Value(COLUMNNAME_ZZProgrammeName);
	}

	public I_ZZ_Application_Form getZZ_Application_Form() throws RuntimeException
	{
		return (I_ZZ_Application_Form)MTable.get(getCtx(), I_ZZ_Application_Form.Table_ID)
			.getPO(getZZ_Application_Form_ID(), get_TrxName());
	}

	/** Set Application Form.
		@param ZZ_Application_Form_ID Application Form
	*/
	public void setZZ_Application_Form_ID (int ZZ_Application_Form_ID)
	{
		if (ZZ_Application_Form_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZ_Application_Form_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZ_Application_Form_ID, Integer.valueOf(ZZ_Application_Form_ID));
	}

	/** Get Application Form.
		@return Application Form	  */
	public int getZZ_Application_Form_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZ_Application_Form_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}