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

/** Generated Model for ZZBankingDetails
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="ZZBankingDetails")
public class X_ZZBankingDetails extends PO implements I_ZZBankingDetails, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20251122L;

    /** Standard Constructor */
    public X_ZZBankingDetails (Properties ctx, int ZZBankingDetails_ID, String trxName)
    {
      super (ctx, ZZBankingDetails_ID, trxName);
      /** if (ZZBankingDetails_ID == 0)
        {
			setZZBankingDetails_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZBankingDetails (Properties ctx, int ZZBankingDetails_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZBankingDetails_ID, trxName, virtualColumns);
      /** if (ZZBankingDetails_ID == 0)
        {
			setZZBankingDetails_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZBankingDetails (Properties ctx, String ZZBankingDetails_UU, String trxName)
    {
      super (ctx, ZZBankingDetails_UU, trxName);
      /** if (ZZBankingDetails_UU == null)
        {
			setZZBankingDetails_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZBankingDetails (Properties ctx, String ZZBankingDetails_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZBankingDetails_UU, trxName, virtualColumns);
      /** if (ZZBankingDetails_UU == null)
        {
			setZZBankingDetails_ID (0);
        } */
    }

    /** Load Constructor */
    public X_ZZBankingDetails (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_ZZBankingDetails[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Account No.
		@param AccountNo Account Number
	*/
	public void setAccountNo (String AccountNo)
	{
		set_Value (COLUMNNAME_AccountNo, AccountNo);
	}

	/** Get Account No.
		@return Account Number
	  */
	public String getAccountNo()
	{
		return (String)get_Value(COLUMNNAME_AccountNo);
	}

	/** Corporate Cashman Account = Corporate Cashman Account */
	public static final String ACCOUNTTYPE_CorporateCashmanAccount = "Corporate Cashman Account";
	/** Credit = Credit */
	public static final String ACCOUNTTYPE_Credit = "Credit";
	/** Current = Current */
	public static final String ACCOUNTTYPE_Current = "Current";
	/** Savings = Savings */
	public static final String ACCOUNTTYPE_Savings = "Savings";
	/** Transmission = Transmission */
	public static final String ACCOUNTTYPE_Transmission = "Transmission";
	/** Set Account Type.
		@param AccountType Indicates the type of account
	*/
	public void setAccountType (String AccountType)
	{

		set_ValueNoCheck (COLUMNNAME_AccountType, AccountType);
	}

	/** Get Account Type.
		@return Indicates the type of account
	  */
	public String getAccountType()
	{
		return (String)get_Value(COLUMNNAME_AccountType);
	}

	/** Set Bank Name.
		@param BankName Bank Name
	*/
	public void setBankName (String BankName)
	{
		set_Value (COLUMNNAME_BankName, BankName);
	}

	/** Get Bank Name.
		@return Bank Name	  */
	public String getBankName()
	{
		return (String)get_Value(COLUMNNAME_BankName);
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

	public org.compiere.model.I_C_Bank getC_Bank() throws RuntimeException
	{
		return (org.compiere.model.I_C_Bank)MTable.get(getCtx(), org.compiere.model.I_C_Bank.Table_ID)
			.getPO(getC_Bank_ID(), get_TrxName());
	}

	/** Set Bank Name.
		@param C_Bank_ID Bank Name
	*/
	public void setC_Bank_ID (int C_Bank_ID)
	{
		if (C_Bank_ID < 1)
			set_ValueNoCheck (COLUMNNAME_C_Bank_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_C_Bank_ID, Integer.valueOf(C_Bank_ID));
	}

	/** Get Bank Name.
		@return Bank Name
	  */
	public int getC_Bank_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Bank_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Account Holder.
		@param ZZAccountHolder Account Holder
	*/
	public void setZZAccountHolder (String ZZAccountHolder)
	{
		set_Value (COLUMNNAME_ZZAccountHolder, ZZAccountHolder);
	}

	/** Get Account Holder.
		@return Account Holder	  */
	public String getZZAccountHolder()
	{
		return (String)get_Value(COLUMNNAME_ZZAccountHolder);
	}

	/** ZZAdminDetailsCorrect AD_Reference_ID=319 */
	public static final int ZZADMINDETAILSCORRECT_AD_Reference_ID=319;
	/** No = N */
	public static final String ZZADMINDETAILSCORRECT_No = "N";
	/** Yes = Y */
	public static final String ZZADMINDETAILSCORRECT_Yes = "Y";
	/** Set Admin Details Correct.
		@param ZZAdminDetailsCorrect The Administrative Details Given Abvove Are Correct
	*/
	public void setZZAdminDetailsCorrect (String ZZAdminDetailsCorrect)
	{

		set_Value (COLUMNNAME_ZZAdminDetailsCorrect, ZZAdminDetailsCorrect);
	}

	/** Get Admin Details Correct.
		@return The Administrative Details Given Abvove Are Correct
	  */
	public String getZZAdminDetailsCorrect()
	{
		return (String)get_Value(COLUMNNAME_ZZAdminDetailsCorrect);
	}

	/** ZZBankDetailsChanged AD_Reference_ID=319 */
	public static final int ZZBANKDETAILSCHANGED_AD_Reference_ID=319;
	/** No = N */
	public static final String ZZBANKDETAILSCHANGED_No = "N";
	/** Yes = Y */
	public static final String ZZBANKDETAILSCHANGED_Yes = "Y";
	/** Set Bank Details Changed.
		@param ZZBankDetailsChanged The Banking Details Given Abvove Have Changed
	*/
	public void setZZBankDetailsChanged (String ZZBankDetailsChanged)
	{

		set_Value (COLUMNNAME_ZZBankDetailsChanged, ZZBankDetailsChanged);
	}

	/** Get Bank Details Changed.
		@return The Banking Details Given Abvove Have Changed
	  */
	public String getZZBankDetailsChanged()
	{
		return (String)get_Value(COLUMNNAME_ZZBankDetailsChanged);
	}

	/** ZZBankDetailsCorrect AD_Reference_ID=319 */
	public static final int ZZBANKDETAILSCORRECT_AD_Reference_ID=319;
	/** No = N */
	public static final String ZZBANKDETAILSCORRECT_No = "N";
	/** Yes = Y */
	public static final String ZZBANKDETAILSCORRECT_Yes = "Y";
	/** Set Bank Details Correct.
		@param ZZBankDetailsCorrect The Banking Details Given Abvove Are Correct
	*/
	public void setZZBankDetailsCorrect (String ZZBankDetailsCorrect)
	{

		set_Value (COLUMNNAME_ZZBankDetailsCorrect, ZZBankDetailsCorrect);
	}

	/** Get Bank Details Correct.
		@return The Banking Details Given Abvove Are Correct
	  */
	public String getZZBankDetailsCorrect()
	{
		return (String)get_Value(COLUMNNAME_ZZBankDetailsCorrect);
	}

	/** Set Banking Details.
		@param ZZBankingDetails_ID Banking Details
	*/
	public void setZZBankingDetails_ID (int ZZBankingDetails_ID)
	{
		if (ZZBankingDetails_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZBankingDetails_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZBankingDetails_ID, Integer.valueOf(ZZBankingDetails_ID));
	}

	/** Get Banking Details.
		@return Banking Details	  */
	public int getZZBankingDetails_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZBankingDetails_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set ZZBankingDetails_UU.
		@param ZZBankingDetails_UU ZZBankingDetails_UU
	*/
	public void setZZBankingDetails_UU (String ZZBankingDetails_UU)
	{
		set_Value (COLUMNNAME_ZZBankingDetails_UU, ZZBankingDetails_UU);
	}

	/** Get ZZBankingDetails_UU.
		@return ZZBankingDetails_UU	  */
	public String getZZBankingDetails_UU()
	{
		return (String)get_Value(COLUMNNAME_ZZBankingDetails_UU);
	}

	/** Set SDF Organisation.
		@param ZZSdfOrganisation_ID Link Organisation And SDF
	*/
	public void setZZSdfOrganisation_ID (int ZZSdfOrganisation_ID)
	{
		if (ZZSdfOrganisation_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZSdfOrganisation_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZSdfOrganisation_ID, Integer.valueOf(ZZSdfOrganisation_ID));
	}

	/** Get SDF Organisation.
		@return Link Organisation And SDF
	  */
	public int getZZSdfOrganisation_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZSdfOrganisation_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	/** Set Branch Name.
		@param ZZ_Branch_Name Branch Name
	*/
	public void setZZ_Branch_Name (String ZZ_Branch_Name)
	{
		set_Value (COLUMNNAME_ZZ_Branch_Name, ZZ_Branch_Name);
	}

	/** Get Branch Name.
		@return Branch Name	  */
	public String getZZ_Branch_Name()
	{
		return (String)get_Value(COLUMNNAME_ZZ_Branch_Name);
	}

	/** Set Branch Number.
		@param ZZ_Branch_Number Branch Number
	*/
	public void setZZ_Branch_Number (String ZZ_Branch_Number)
	{
		set_Value (COLUMNNAME_ZZ_Branch_Number, ZZ_Branch_Number);
	}

	/** Get Branch Number.
		@return Branch Number	  */
	public String getZZ_Branch_Number()
	{
		return (String)get_Value(COLUMNNAME_ZZ_Branch_Number);
	}
}