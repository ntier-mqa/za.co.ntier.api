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

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Properties;
import org.compiere.model.*;
import org.compiere.util.Env;

/** Generated Model for ZZ_WSP_ATR_EXTENSION
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="ZZ_WSP_ATR_EXTENSION")
public class X_ZZ_WSP_ATR_EXTENSION extends PO implements I_ZZ_WSP_ATR_EXTENSION, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20260312L;

    /** Standard Constructor */
    public X_ZZ_WSP_ATR_EXTENSION (Properties ctx, int ZZ_WSP_ATR_EXTENSION_ID, String trxName)
    {
      super (ctx, ZZ_WSP_ATR_EXTENSION_ID, trxName);
      /** if (ZZ_WSP_ATR_EXTENSION_ID == 0)
        {
        } */
    }

    /** Standard Constructor */
    public X_ZZ_WSP_ATR_EXTENSION (Properties ctx, int ZZ_WSP_ATR_EXTENSION_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZ_WSP_ATR_EXTENSION_ID, trxName, virtualColumns);
      /** if (ZZ_WSP_ATR_EXTENSION_ID == 0)
        {
        } */
    }

    /** Standard Constructor */
    public X_ZZ_WSP_ATR_EXTENSION (Properties ctx, String ZZ_WSP_ATR_EXTENSION_UU, String trxName)
    {
      super (ctx, ZZ_WSP_ATR_EXTENSION_UU, trxName);
      /** if (ZZ_WSP_ATR_EXTENSION_UU == null)
        {
        } */
    }

    /** Standard Constructor */
    public X_ZZ_WSP_ATR_EXTENSION (Properties ctx, String ZZ_WSP_ATR_EXTENSION_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZ_WSP_ATR_EXTENSION_UU, trxName, virtualColumns);
      /** if (ZZ_WSP_ATR_EXTENSION_UU == null)
        {
        } */
    }

    /** Load Constructor */
    public X_ZZ_WSP_ATR_EXTENSION (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_ZZ_WSP_ATR_EXTENSION[")
        .append(get_ID()).append("]");
      return sb.toString();
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

	/** Set Designation.
		@param ZZ_Designation Designation
	*/
	public void setZZ_Designation (String ZZ_Designation)
	{
		set_Value (COLUMNNAME_ZZ_Designation, ZZ_Designation);
	}

	/** Get Designation.
		@return Designation	  */
	public String getZZ_Designation()
	{
		return (String)get_Value(COLUMNNAME_ZZ_Designation);
	}

	/** Set Number Of Employees.
		@param ZZ_Number_Of_Employees Number Of Employees
	*/
	public void setZZ_Number_Of_Employees (BigDecimal ZZ_Number_Of_Employees)
	{
		set_Value (COLUMNNAME_ZZ_Number_Of_Employees, ZZ_Number_Of_Employees);
	}

	/** Get Number Of Employees.
		@return Number Of Employees	  */
	public BigDecimal getZZ_Number_Of_Employees()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_ZZ_Number_Of_Employees);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Organisation Name.
		@param ZZ_Organisation_Name Organisation Name
	*/
	public void setZZ_Organisation_Name (String ZZ_Organisation_Name)
	{
		set_Value (COLUMNNAME_ZZ_Organisation_Name, ZZ_Organisation_Name);
	}

	/** Get Organisation Name.
		@return Organisation Name	  */
	public String getZZ_Organisation_Name()
	{
		return (String)get_Value(COLUMNNAME_ZZ_Organisation_Name);
	}

	/** Set Reason for WSP-ATR Extension Request.
		@param ZZ_Reason_For_Extension Reason for WSP-ATR Extension Request
	*/
	public void setZZ_Reason_For_Extension (String ZZ_Reason_For_Extension)
	{
		set_Value (COLUMNNAME_ZZ_Reason_For_Extension, ZZ_Reason_For_Extension);
	}

	/** Get Reason for WSP-ATR Extension Request.
		@return Reason for WSP-ATR Extension Request	  */
	public String getZZ_Reason_For_Extension()
	{
		return (String)get_Value(COLUMNNAME_ZZ_Reason_For_Extension);
	}

	/** Set Email Address.
		@param ZZ_SDF_EMAIL Email Address
	*/
	public void setZZ_SDF_EMAIL (String ZZ_SDF_EMAIL)
	{
		set_Value (COLUMNNAME_ZZ_SDF_EMAIL, ZZ_SDF_EMAIL);
	}

	/** Get Email Address.
		@return Email Address	  */
	public String getZZ_SDF_EMAIL()
	{
		return (String)get_Value(COLUMNNAME_ZZ_SDF_EMAIL);
	}

	/** Set First Name.
		@param ZZ_SDF_FirstName First Name
	*/
	public void setZZ_SDF_FirstName (String ZZ_SDF_FirstName)
	{
		set_Value (COLUMNNAME_ZZ_SDF_FirstName, ZZ_SDF_FirstName);
	}

	/** Get First Name.
		@return First Name	  */
	public String getZZ_SDF_FirstName()
	{
		return (String)get_Value(COLUMNNAME_ZZ_SDF_FirstName);
	}

	/** Set Contact No..
		@param ZZ_SDF_Phone Contact No.
	*/
	public void setZZ_SDF_Phone (String ZZ_SDF_Phone)
	{
		set_Value (COLUMNNAME_ZZ_SDF_Phone, ZZ_SDF_Phone);
	}

	/** Get Contact No..
		@return Contact No.	  */
	public String getZZ_SDF_Phone()
	{
		return (String)get_Value(COLUMNNAME_ZZ_SDF_Phone);
	}

	/** Set Surname.
		@param ZZ_SDF_Surname Surname
	*/
	public void setZZ_SDF_Surname (String ZZ_SDF_Surname)
	{
		set_Value (COLUMNNAME_ZZ_SDF_Surname, ZZ_SDF_Surname);
	}

	/** Get Surname.
		@return Surname	  */
	public String getZZ_SDF_Surname()
	{
		return (String)get_Value(COLUMNNAME_ZZ_SDF_Surname);
	}

	/** Set SDL Number.
		@param ZZ_SDL_No SDL Number
	*/
	public void setZZ_SDL_No (String ZZ_SDL_No)
	{
		set_Value (COLUMNNAME_ZZ_SDL_No, ZZ_SDL_No);
	}

	/** Get SDL Number.
		@return SDL Number	  */
	public String getZZ_SDL_No()
	{
		return (String)get_Value(COLUMNNAME_ZZ_SDL_No);
	}

	/** Set Email Address.
		@param ZZ_SOR_EMAIL Email Address
	*/
	public void setZZ_SOR_EMAIL (String ZZ_SOR_EMAIL)
	{
		set_Value (COLUMNNAME_ZZ_SOR_EMAIL, ZZ_SOR_EMAIL);
	}

	/** Get Email Address.
		@return Email Address	  */
	public String getZZ_SOR_EMAIL()
	{
		return (String)get_Value(COLUMNNAME_ZZ_SOR_EMAIL);
	}

	/** Set First Name.
		@param ZZ_SOR_FirstName First Name
	*/
	public void setZZ_SOR_FirstName (String ZZ_SOR_FirstName)
	{
		set_Value (COLUMNNAME_ZZ_SOR_FirstName, ZZ_SOR_FirstName);
	}

	/** Get First Name.
		@return First Name	  */
	public String getZZ_SOR_FirstName()
	{
		return (String)get_Value(COLUMNNAME_ZZ_SOR_FirstName);
	}

	/** Set Contact No..
		@param ZZ_SOR_Phone Contact No.
	*/
	public void setZZ_SOR_Phone (String ZZ_SOR_Phone)
	{
		set_Value (COLUMNNAME_ZZ_SOR_Phone, ZZ_SOR_Phone);
	}

	/** Get Contact No..
		@return Contact No.	  */
	public String getZZ_SOR_Phone()
	{
		return (String)get_Value(COLUMNNAME_ZZ_SOR_Phone);
	}

	/** Set Surname.
		@param ZZ_SOR_Surname Surname
	*/
	public void setZZ_SOR_Surname (String ZZ_SOR_Surname)
	{
		set_Value (COLUMNNAME_ZZ_SOR_Surname, ZZ_SOR_Surname);
	}

	/** Get Surname.
		@return Surname	  */
	public String getZZ_SOR_Surname()
	{
		return (String)get_Value(COLUMNNAME_ZZ_SOR_Surname);
	}

	/** Set Submission Date.
		@param ZZ_Submission_Date Submission Date
	*/
	public void setZZ_Submission_Date (Timestamp ZZ_Submission_Date)
	{
		set_Value (COLUMNNAME_ZZ_Submission_Date, ZZ_Submission_Date);
	}

	/** Get Submission Date.
		@return Submission Date	  */
	public Timestamp getZZ_Submission_Date()
	{
		return (Timestamp)get_Value(COLUMNNAME_ZZ_Submission_Date);
	}

	public I_ZZ_WSP_ATR_EXTENSION_BATCH getZZ_WSP_ATR_EXTENSION_BATCH() throws RuntimeException
	{
		return (I_ZZ_WSP_ATR_EXTENSION_BATCH)MTable.get(getCtx(), I_ZZ_WSP_ATR_EXTENSION_BATCH.Table_ID)
			.getPO(getZZ_WSP_ATR_EXTENSION_BATCH_ID(), get_TrxName());
	}

	/** Set ZZ_WSP_ATR_EXTENSION_BATCH_ID.
		@param ZZ_WSP_ATR_EXTENSION_BATCH_ID ZZ_WSP_ATR_EXTENSION_BATCH_ID
	*/
	public void setZZ_WSP_ATR_EXTENSION_BATCH_ID (int ZZ_WSP_ATR_EXTENSION_BATCH_ID)
	{
		if (ZZ_WSP_ATR_EXTENSION_BATCH_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZ_WSP_ATR_EXTENSION_BATCH_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZ_WSP_ATR_EXTENSION_BATCH_ID, Integer.valueOf(ZZ_WSP_ATR_EXTENSION_BATCH_ID));
	}

	/** Get ZZ_WSP_ATR_EXTENSION_BATCH_ID.
		@return ZZ_WSP_ATR_EXTENSION_BATCH_ID	  */
	public int getZZ_WSP_ATR_EXTENSION_BATCH_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZ_WSP_ATR_EXTENSION_BATCH_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Requests for Extension - WSP-ATR.
		@param ZZ_WSP_ATR_EXTENSION_ID Requests for Extension - WSP-ATR
	*/
	public void setZZ_WSP_ATR_EXTENSION_ID (int ZZ_WSP_ATR_EXTENSION_ID)
	{
		if (ZZ_WSP_ATR_EXTENSION_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZ_WSP_ATR_EXTENSION_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZ_WSP_ATR_EXTENSION_ID, Integer.valueOf(ZZ_WSP_ATR_EXTENSION_ID));
	}

	/** Get Requests for Extension - WSP-ATR.
		@return Requests for Extension - WSP-ATR	  */
	public int getZZ_WSP_ATR_EXTENSION_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZ_WSP_ATR_EXTENSION_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set ZZ_WSP_ATR_EXTENSION_UU.
		@param ZZ_WSP_ATR_EXTENSION_UU ZZ_WSP_ATR_EXTENSION_UU
	*/
	public void setZZ_WSP_ATR_EXTENSION_UU (String ZZ_WSP_ATR_EXTENSION_UU)
	{
		set_ValueNoCheck (COLUMNNAME_ZZ_WSP_ATR_EXTENSION_UU, ZZ_WSP_ATR_EXTENSION_UU);
	}

	/** Get ZZ_WSP_ATR_EXTENSION_UU.
		@return ZZ_WSP_ATR_EXTENSION_UU	  */
	public String getZZ_WSP_ATR_EXTENSION_UU()
	{
		return (String)get_Value(COLUMNNAME_ZZ_WSP_ATR_EXTENSION_UU);
	}

	public I_ZZ_WSP_ATR_Submitted getZZ_WSP_ATR_Submitted() throws RuntimeException
	{
		return (I_ZZ_WSP_ATR_Submitted)MTable.get(getCtx(), I_ZZ_WSP_ATR_Submitted.Table_ID)
			.getPO(getZZ_WSP_ATR_Submitted_ID(), get_TrxName());
	}

	/** Set WSP/ATR Submitted File.
		@param ZZ_WSP_ATR_Submitted_ID WSP/ATR Submitted File
	*/
	public void setZZ_WSP_ATR_Submitted_ID (int ZZ_WSP_ATR_Submitted_ID)
	{
		if (ZZ_WSP_ATR_Submitted_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZ_WSP_ATR_Submitted_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZ_WSP_ATR_Submitted_ID, Integer.valueOf(ZZ_WSP_ATR_Submitted_ID));
	}

	/** Get WSP/ATR Submitted File.
		@return WSP/ATR Submitted File
	  */
	public int getZZ_WSP_ATR_Submitted_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZ_WSP_ATR_Submitted_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}