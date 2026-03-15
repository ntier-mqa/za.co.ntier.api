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

/** Generated Model for ZZOrgTrainingCommittee
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="ZZOrgTrainingCommittee")
public class X_ZZOrgTrainingCommittee extends PO implements I_ZZOrgTrainingCommittee, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20260314L;

    /** Standard Constructor */
    public X_ZZOrgTrainingCommittee (Properties ctx, int ZZOrgTrainingCommittee_ID, String trxName)
    {
      super (ctx, ZZOrgTrainingCommittee_ID, trxName);
      /** if (ZZOrgTrainingCommittee_ID == 0)
        {
			setZZOrgTrainingCommittee_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZOrgTrainingCommittee (Properties ctx, int ZZOrgTrainingCommittee_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZOrgTrainingCommittee_ID, trxName, virtualColumns);
      /** if (ZZOrgTrainingCommittee_ID == 0)
        {
			setZZOrgTrainingCommittee_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZOrgTrainingCommittee (Properties ctx, String ZZOrgTrainingCommittee_UU, String trxName)
    {
      super (ctx, ZZOrgTrainingCommittee_UU, trxName);
      /** if (ZZOrgTrainingCommittee_UU == null)
        {
			setZZOrgTrainingCommittee_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZOrgTrainingCommittee (Properties ctx, String ZZOrgTrainingCommittee_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZOrgTrainingCommittee_UU, trxName, virtualColumns);
      /** if (ZZOrgTrainingCommittee_UU == null)
        {
			setZZOrgTrainingCommittee_ID (0);
        } */
    }

    /** Load Constructor */
    public X_ZZOrgTrainingCommittee (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_ZZOrgTrainingCommittee[")
        .append(get_ID()).append("]");
      return sb.toString();
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

	/** Set 2nd Phone.
		@param Phone2 Identifies an alternate telephone number.
	*/
	public void setPhone2 (String Phone2)
	{
		set_Value (COLUMNNAME_Phone2, Phone2);
	}

	/** Get 2nd Phone.
		@return Identifies an alternate telephone number.
	  */
	public String getPhone2()
	{
		return (String)get_Value(COLUMNNAME_Phone2);
	}

	/** Set First Name.
		@param ZZFirstName First Name
	*/
	public void setZZFirstName (String ZZFirstName)
	{
		set_Value (COLUMNNAME_ZZFirstName, ZZFirstName);
	}

	/** Get First Name.
		@return First Name	  */
	public String getZZFirstName()
	{
		return (String)get_Value(COLUMNNAME_ZZFirstName);
	}

	/** Adv = Adv */
	public static final String ZZLKPTITLE_Adv = "Adv";
	/** Dr = Dr */
	public static final String ZZLKPTITLE_Dr = "Dr";
	/** Me = Me */
	public static final String ZZLKPTITLE_Me = "Me";
	/** Miss = Miss */
	public static final String ZZLKPTITLE_Miss = "Miss";
	/** Mr = Mr */
	public static final String ZZLKPTITLE_Mr = "Mr";
	/** Mrs = Mrs */
	public static final String ZZLKPTITLE_Mrs = "Mrs";
	/** Ms = Ms */
	public static final String ZZLKPTITLE_Ms = "Ms";
	/** Other = Other */
	public static final String ZZLKPTITLE_Other = "Other";
	/** Prof = Prof */
	public static final String ZZLKPTITLE_Prof = "Prof";
	/** Set Title.
		@param ZZLkpTitle Lkp Title
	*/
	public void setZZLkpTitle (String ZZLkpTitle)
	{

		set_Value (COLUMNNAME_ZZLkpTitle, ZZLkpTitle);
	}

	/** Get Title.
		@return Lkp Title
	  */
	public String getZZLkpTitle()
	{
		return (String)get_Value(COLUMNNAME_ZZLkpTitle);
	}

	/** Set Name Of Union.
		@param ZZNameOfUnion Name Of Union
	*/
	public void setZZNameOfUnion (String ZZNameOfUnion)
	{
		set_Value (COLUMNNAME_ZZNameOfUnion, ZZNameOfUnion);
	}

	/** Get Name Of Union.
		@return Name Of Union	  */
	public String getZZNameOfUnion()
	{
		return (String)get_Value(COLUMNNAME_ZZNameOfUnion);
	}

	/** Set Organisation Training Committee.
		@param ZZOrgTrainingCommittee_ID Organisation Training Committee
	*/
	public void setZZOrgTrainingCommittee_ID (int ZZOrgTrainingCommittee_ID)
	{
		if (ZZOrgTrainingCommittee_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZOrgTrainingCommittee_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZOrgTrainingCommittee_ID, Integer.valueOf(ZZOrgTrainingCommittee_ID));
	}

	/** Get Organisation Training Committee.
		@return Organisation Training Committee	  */
	public int getZZOrgTrainingCommittee_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZOrgTrainingCommittee_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set ZZOrgTrainingCommittee_UU.
		@param ZZOrgTrainingCommittee_UU ZZOrgTrainingCommittee_UU
	*/
	public void setZZOrgTrainingCommittee_UU (String ZZOrgTrainingCommittee_UU)
	{
		set_Value (COLUMNNAME_ZZOrgTrainingCommittee_UU, ZZOrgTrainingCommittee_UU);
	}

	/** Get ZZOrgTrainingCommittee_UU.
		@return ZZOrgTrainingCommittee_UU	  */
	public String getZZOrgTrainingCommittee_UU()
	{
		return (String)get_Value(COLUMNNAME_ZZOrgTrainingCommittee_UU);
	}

	/** Set Position In Union.
		@param ZZPositionInUnion Position In Union
	*/
	public void setZZPositionInUnion (String ZZPositionInUnion)
	{
		set_Value (COLUMNNAME_ZZPositionInUnion, ZZPositionInUnion);
	}

	/** Get Position In Union.
		@return Position In Union	  */
	public String getZZPositionInUnion()
	{
		return (String)get_Value(COLUMNNAME_ZZPositionInUnion);
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

	/** CEO = CEO */
	public static final String ZZ_DESIGNATION_CEO = "CEO";
	/** COO = COO */
	public static final String ZZ_DESIGNATION_COO = "COO";
	/** Financial Manager = Financial Manager */
	public static final String ZZ_DESIGNATION_FinancialManager = "Financial Manager";
	/** HR Manager = HR Manager */
	public static final String ZZ_DESIGNATION_HRManager = "HR Manager";
	/** Other = Other */
	public static final String ZZ_DESIGNATION_Other = "Other";
	/** Training Manager = Training Manager */
	public static final String ZZ_DESIGNATION_TrainingManager = "Training Manager";
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

	/** Set ID No.
		@param ZZ_ID_Passport_No ID No
	*/
	public void setZZ_ID_Passport_No (String ZZ_ID_Passport_No)
	{
		set_Value (COLUMNNAME_ZZ_ID_Passport_No, ZZ_ID_Passport_No);
	}

	/** Get ID No.
		@return ID No	  */
	public String getZZ_ID_Passport_No()
	{
		return (String)get_Value(COLUMNNAME_ZZ_ID_Passport_No);
	}
}