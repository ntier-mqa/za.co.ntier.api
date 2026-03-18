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

/** Generated Model for ZZ_QCTO_Alloc_AC
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="ZZ_QCTO_Alloc_AC")
public class X_ZZ_QCTO_Alloc_AC extends PO implements I_ZZ_QCTO_Alloc_AC, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20260318L;

    /** Standard Constructor */
    public X_ZZ_QCTO_Alloc_AC (Properties ctx, int ZZ_QCTO_Alloc_AC_ID, String trxName)
    {
      super (ctx, ZZ_QCTO_Alloc_AC_ID, trxName);
      /** if (ZZ_QCTO_Alloc_AC_ID == 0)
        {
        } */
    }

    /** Standard Constructor */
    public X_ZZ_QCTO_Alloc_AC (Properties ctx, int ZZ_QCTO_Alloc_AC_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZ_QCTO_Alloc_AC_ID, trxName, virtualColumns);
      /** if (ZZ_QCTO_Alloc_AC_ID == 0)
        {
        } */
    }

    /** Standard Constructor */
    public X_ZZ_QCTO_Alloc_AC (Properties ctx, String ZZ_QCTO_Alloc_AC_UU, String trxName)
    {
      super (ctx, ZZ_QCTO_Alloc_AC_UU, trxName);
      /** if (ZZ_QCTO_Alloc_AC_UU == null)
        {
        } */
    }

    /** Standard Constructor */
    public X_ZZ_QCTO_Alloc_AC (Properties ctx, String ZZ_QCTO_Alloc_AC_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZ_QCTO_Alloc_AC_UU, trxName, virtualColumns);
      /** if (ZZ_QCTO_Alloc_AC_UU == null)
        {
        } */
    }

    /** Load Constructor */
    public X_ZZ_QCTO_Alloc_AC (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_ZZ_QCTO_Alloc_AC[")
        .append(get_ID()).append(",Name=").append(getName()).append("]");
      return sb.toString();
    }

	/** Set Address 1.
		@param Address1 Address line 1 for this location
	*/
	public void setAddress1 (String Address1)
	{
		set_ValueNoCheck (COLUMNNAME_Address1, Address1);
	}

	/** Get Address 1.
		@return Address line 1 for this location
	  */
	public String getAddress1()
	{
		return (String)get_Value(COLUMNNAME_Address1);
	}

	/** Set Address 2.
		@param Address2 Address line 2 for this location
	*/
	public void setAddress2 (String Address2)
	{
		set_ValueNoCheck (COLUMNNAME_Address2, Address2);
	}

	/** Get Address 2.
		@return Address line 2 for this location
	  */
	public String getAddress2()
	{
		return (String)get_Value(COLUMNNAME_Address2);
	}

	public org.compiere.model.I_C_BPartner getC_BPartner() throws RuntimeException
	{
		return (org.compiere.model.I_C_BPartner)MTable.get(getCtx(), org.compiere.model.I_C_BPartner.Table_ID)
			.getPO(getC_BPartner_ID(), get_TrxName());
	}

	/** Set Business Partner.
		@param C_BPartner_ID Identifies a Business Partner
	*/
	public void setC_BPartner_ID (int C_BPartner_ID)
	{
		if (C_BPartner_ID < 1)
			set_ValueNoCheck (COLUMNNAME_C_BPartner_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_C_BPartner_ID, Integer.valueOf(C_BPartner_ID));
	}

	/** Get Business Partner.
		@return Identifies a Business Partner
	  */
	public int getC_BPartner_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartner_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	/** Set Line.
		@param LineNo Line No
	*/
	public void setLineNo (int LineNo)
	{
		set_Value (COLUMNNAME_LineNo, Integer.valueOf(LineNo));
	}

	/** Get Line.
		@return Line No
	  */
	public int getLineNo()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_LineNo);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	/** Set Postalcode.
		@param Postalcode Postalcode
	*/
	public void setPostalcode (String Postalcode)
	{
		set_Value (COLUMNNAME_Postalcode, Postalcode);
	}

	/** Get Postalcode.
		@return Postalcode	  */
	public String getPostalcode()
	{
		return (String)get_Value(COLUMNNAME_Postalcode);
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

	/** Set Surname.
		@param ZZSurname Surname
	*/
	public void setZZSurname (String ZZSurname)
	{
		set_Value (COLUMNNAME_ZZSurname, ZZSurname);
	}

	/** Get Surname.
		@return Surname	  */
	public String getZZSurname()
	{
		return (String)get_Value(COLUMNNAME_ZZSurname);
	}

	/** Set ZZ_AllocationMonth.
		@param ZZ_AllocationMonth Allocation Month
	*/
	public void setZZ_AllocationMonth (String ZZ_AllocationMonth)
	{
		set_Value (COLUMNNAME_ZZ_AllocationMonth, ZZ_AllocationMonth);
	}

	/** Get ZZ_AllocationMonth.
		@return Allocation Month
	  */
	public String getZZ_AllocationMonth()
	{
		return (String)get_Value(COLUMNNAME_ZZ_AllocationMonth);
	}

	/** Set ZZ_AllocationNo.
		@param ZZ_AllocationNo ZZ_AllocationNo
	*/
	public void setZZ_AllocationNo (String ZZ_AllocationNo)
	{
		set_Value (COLUMNNAME_ZZ_AllocationNo, ZZ_AllocationNo);
	}

	/** Get ZZ_AllocationNo.
		@return ZZ_AllocationNo	  */
	public String getZZ_AllocationNo()
	{
		return (String)get_Value(COLUMNNAME_ZZ_AllocationNo);
	}

	/** Set ZZ_AltContactEmail.
		@param ZZ_AltContactEmail Email of Alt Contact
	*/
	public void setZZ_AltContactEmail (String ZZ_AltContactEmail)
	{
		set_Value (COLUMNNAME_ZZ_AltContactEmail, ZZ_AltContactEmail);
	}

	/** Get ZZ_AltContactEmail.
		@return Email of Alt Contact
	  */
	public String getZZ_AltContactEmail()
	{
		return (String)get_Value(COLUMNNAME_ZZ_AltContactEmail);
	}

	/** Set ZZ_AltContactName.
		@param ZZ_AltContactName Full Name(s) of Additional Contact Person
	*/
	public void setZZ_AltContactName (String ZZ_AltContactName)
	{
		set_Value (COLUMNNAME_ZZ_AltContactName, ZZ_AltContactName);
	}

	/** Get ZZ_AltContactName.
		@return Full Name(s) of Additional Contact Person
	  */
	public String getZZ_AltContactName()
	{
		return (String)get_Value(COLUMNNAME_ZZ_AltContactName);
	}

	/** Set ZZ_AltContactSurname.
		@param ZZ_AltContactSurname Surname of Alt Contact
	*/
	public void setZZ_AltContactSurname (String ZZ_AltContactSurname)
	{
		set_Value (COLUMNNAME_ZZ_AltContactSurname, ZZ_AltContactSurname);
	}

	/** Get ZZ_AltContactSurname.
		@return Surname of Alt Contact
	  */
	public String getZZ_AltContactSurname()
	{
		return (String)get_Value(COLUMNNAME_ZZ_AltContactSurname);
	}

	/** Set ZZ_AltContactTitle.
		@param ZZ_AltContactTitle Title of Additional Contact Person
	*/
	public void setZZ_AltContactTitle (String ZZ_AltContactTitle)
	{
		set_Value (COLUMNNAME_ZZ_AltContactTitle, ZZ_AltContactTitle);
	}

	/** Get ZZ_AltContactTitle.
		@return Title of Additional Contact Person
	  */
	public String getZZ_AltContactTitle()
	{
		return (String)get_Value(COLUMNNAME_ZZ_AltContactTitle);
	}

	/** Set ZZ_CIPCNumber.
		@param ZZ_CIPCNumber CIPC Registration
	*/
	public void setZZ_CIPCNumber (String ZZ_CIPCNumber)
	{
		set_Value (COLUMNNAME_ZZ_CIPCNumber, ZZ_CIPCNumber);
	}

	/** Get ZZ_CIPCNumber.
		@return CIPC Registration
	  */
	public String getZZ_CIPCNumber()
	{
		return (String)get_Value(COLUMNNAME_ZZ_CIPCNumber);
	}

	/** Set ZZ_ContactTitle.
		@param ZZ_ContactTitle Title of Contact Person
	*/
	public void setZZ_ContactTitle (String ZZ_ContactTitle)
	{
		set_Value (COLUMNNAME_ZZ_ContactTitle, ZZ_ContactTitle);
	}

	/** Get ZZ_ContactTitle.
		@return Title of Contact Person
	  */
	public String getZZ_ContactTitle()
	{
		return (String)get_Value(COLUMNNAME_ZZ_ContactTitle);
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

	/** Level 1 = 01 */
	public static final String ZZ_NQF_LEVEL_Level1 = "01";
	/** Level 2 = 02 */
	public static final String ZZ_NQF_LEVEL_Level2 = "02";
	/** Level 3 = 03 */
	public static final String ZZ_NQF_LEVEL_Level3 = "03";
	/** Level 4 = 04 */
	public static final String ZZ_NQF_LEVEL_Level4 = "04";
	/** Level 5 = 05 */
	public static final String ZZ_NQF_LEVEL_Level5 = "05";
	/** Level 6 = 06 */
	public static final String ZZ_NQF_LEVEL_Level6 = "06";
	/** Level 7 = 07 */
	public static final String ZZ_NQF_LEVEL_Level7 = "07";
	/** Level 8 = 08 */
	public static final String ZZ_NQF_LEVEL_Level8 = "08";
	/** Level 9 = 09 */
	public static final String ZZ_NQF_LEVEL_Level9 = "09";
	/** Level 10 = 10 */
	public static final String ZZ_NQF_LEVEL_Level10 = "10";
	/** Level1-3 = L3 */
	public static final String ZZ_NQF_LEVEL_Level1_3 = "L3";
	/** N1 - N3 = NN */
	public static final String ZZ_NQF_LEVEL_N1_N3 = "NN";
	/** Pre Basic = PB */
	public static final String ZZ_NQF_LEVEL_PreBasic = "PB";
	/** Set NQF Level.
		@param ZZ_NQF_Level NQF Level
	*/
	public void setZZ_NQF_Level (String ZZ_NQF_Level)
	{

		set_Value (COLUMNNAME_ZZ_NQF_Level, ZZ_NQF_Level);
	}

	/** Get NQF Level.
		@return NQF Level	  */
	public String getZZ_NQF_Level()
	{
		return (String)get_Value(COLUMNNAME_ZZ_NQF_Level);
	}

	/** Set ZZ_QCTO_Alloc_AC.
		@param ZZ_QCTO_Alloc_AC_ID ZZ_QCTO_Alloc_AC
	*/
	public void setZZ_QCTO_Alloc_AC_ID (int ZZ_QCTO_Alloc_AC_ID)
	{
		if (ZZ_QCTO_Alloc_AC_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZ_QCTO_Alloc_AC_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZ_QCTO_Alloc_AC_ID, Integer.valueOf(ZZ_QCTO_Alloc_AC_ID));
	}

	/** Get ZZ_QCTO_Alloc_AC.
		@return ZZ_QCTO_Alloc_AC	  */
	public int getZZ_QCTO_Alloc_AC_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZ_QCTO_Alloc_AC_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set ZZ_QCTO_Alloc_AC_UU.
		@param ZZ_QCTO_Alloc_AC_UU ZZ_QCTO_Alloc_AC_UU
	*/
	public void setZZ_QCTO_Alloc_AC_UU (String ZZ_QCTO_Alloc_AC_UU)
	{
		set_ValueNoCheck (COLUMNNAME_ZZ_QCTO_Alloc_AC_UU, ZZ_QCTO_Alloc_AC_UU);
	}

	/** Get ZZ_QCTO_Alloc_AC_UU.
		@return ZZ_QCTO_Alloc_AC_UU	  */
	public String getZZ_QCTO_Alloc_AC_UU()
	{
		return (String)get_Value(COLUMNNAME_ZZ_QCTO_Alloc_AC_UU);
	}

	public I_ZZ_QCTO_Allocation getZZ_QCTO_Allocation() throws RuntimeException
	{
		return (I_ZZ_QCTO_Allocation)MTable.get(getCtx(), I_ZZ_QCTO_Allocation.Table_ID)
			.getPO(getZZ_QCTO_Allocation_ID(), get_TrxName());
	}

	/** Set ZZ_QCTO_Allocation_ID.
		@param ZZ_QCTO_Allocation_ID ZZ_QCTO_Allocation_ID
	*/
	public void setZZ_QCTO_Allocation_ID (int ZZ_QCTO_Allocation_ID)
	{
		if (ZZ_QCTO_Allocation_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZ_QCTO_Allocation_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZ_QCTO_Allocation_ID, Integer.valueOf(ZZ_QCTO_Allocation_ID));
	}

	/** Get ZZ_QCTO_Allocation_ID.
		@return ZZ_QCTO_Allocation_ID	  */
	public int getZZ_QCTO_Allocation_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZ_QCTO_Allocation_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Qualification.
		@param ZZ_Qualification Qualification
	*/
	public void setZZ_Qualification (String ZZ_Qualification)
	{
		set_Value (COLUMNNAME_ZZ_Qualification, ZZ_Qualification);
	}

	/** Get Qualification.
		@return Qualification	  */
	public String getZZ_Qualification()
	{
		return (String)get_Value(COLUMNNAME_ZZ_Qualification);
	}

	/** Set ZZ_QualityPartner.
		@param ZZ_QualityPartner Quality Partner
	*/
	public void setZZ_QualityPartner (String ZZ_QualityPartner)
	{
		set_Value (COLUMNNAME_ZZ_QualityPartner, ZZ_QualityPartner);
	}

	/** Get ZZ_QualityPartner.
		@return Quality Partner
	  */
	public String getZZ_QualityPartner()
	{
		return (String)get_Value(COLUMNNAME_ZZ_QualityPartner);
	}

	/** Set ZZ_SAQAIDOrSPID.
		@param ZZ_SAQAIDOrSPID SAQA ID Number
	*/
	public void setZZ_SAQAIDOrSPID (String ZZ_SAQAIDOrSPID)
	{
		set_Value (COLUMNNAME_ZZ_SAQAIDOrSPID, ZZ_SAQAIDOrSPID);
	}

	/** Get ZZ_SAQAIDOrSPID.
		@return SAQA ID Number
	  */
	public String getZZ_SAQAIDOrSPID()
	{
		return (String)get_Value(COLUMNNAME_ZZ_SAQAIDOrSPID);
	}

	/** Set ZZ_SiteVisitDate.
		@param ZZ_SiteVisitDate Site Visit Date
	*/
	public void setZZ_SiteVisitDate (Timestamp ZZ_SiteVisitDate)
	{
		set_Value (COLUMNNAME_ZZ_SiteVisitDate, ZZ_SiteVisitDate);
	}

	/** Get ZZ_SiteVisitDate.
		@return Site Visit Date
	  */
	public Timestamp getZZ_SiteVisitDate()
	{
		return (Timestamp)get_Value(COLUMNNAME_ZZ_SiteVisitDate);
	}
}