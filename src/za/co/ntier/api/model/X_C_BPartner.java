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
import org.compiere.util.KeyNamePair;

/** Generated Model for C_BPartner
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="C_BPartner")
public class X_C_BPartner extends PO implements I_C_BPartner, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20260413L;

    /** Standard Constructor */
    public X_C_BPartner (Properties ctx, int C_BPartner_ID, String trxName)
    {
      super (ctx, C_BPartner_ID, trxName);
      /** if (C_BPartner_ID == 0)
        {
			setC_BP_Group_ID (0);
			setC_BPartner_ID (0);
			setIs1099Vendor (false);
// N
			setIsCustomer (false);
			setIsEmployee (false);
			setIsOneTime (false);
			setIsPOTaxExempt (false);
// N
			setIsProspect (false);
// N
			setIsSalesRep (false);
			setIsSummary (false);
			setIsVendor (true);
// 'Y'
			setName (null);
			setSO_CreditLimit (Env.ZERO);
			setSO_CreditUsed (Env.ZERO);
			setSendEMail (false);
			setValue (null);
			setZZ_IsSDRUser (false);
// 'N'
			setZZ_Is_Employer (false);
// N
			setZZ_Is_MQA_Sector (false);
// N
        } */
    }

    /** Standard Constructor */
    public X_C_BPartner (Properties ctx, int C_BPartner_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, C_BPartner_ID, trxName, virtualColumns);
      /** if (C_BPartner_ID == 0)
        {
			setC_BP_Group_ID (0);
			setC_BPartner_ID (0);
			setIs1099Vendor (false);
// N
			setIsCustomer (false);
			setIsEmployee (false);
			setIsOneTime (false);
			setIsPOTaxExempt (false);
// N
			setIsProspect (false);
// N
			setIsSalesRep (false);
			setIsSummary (false);
			setIsVendor (true);
// 'Y'
			setName (null);
			setSO_CreditLimit (Env.ZERO);
			setSO_CreditUsed (Env.ZERO);
			setSendEMail (false);
			setValue (null);
			setZZ_IsSDRUser (false);
// 'N'
			setZZ_Is_Employer (false);
// N
			setZZ_Is_MQA_Sector (false);
// N
        } */
    }

    /** Standard Constructor */
    public X_C_BPartner (Properties ctx, String C_BPartner_UU, String trxName)
    {
      super (ctx, C_BPartner_UU, trxName);
      /** if (C_BPartner_UU == null)
        {
			setC_BP_Group_ID (0);
			setC_BPartner_ID (0);
			setIs1099Vendor (false);
// N
			setIsCustomer (false);
			setIsEmployee (false);
			setIsOneTime (false);
			setIsPOTaxExempt (false);
// N
			setIsProspect (false);
// N
			setIsSalesRep (false);
			setIsSummary (false);
			setIsVendor (true);
// 'Y'
			setName (null);
			setSO_CreditLimit (Env.ZERO);
			setSO_CreditUsed (Env.ZERO);
			setSendEMail (false);
			setValue (null);
			setZZ_IsSDRUser (false);
// 'N'
			setZZ_Is_Employer (false);
// N
			setZZ_Is_MQA_Sector (false);
// N
        } */
    }

    /** Standard Constructor */
    public X_C_BPartner (Properties ctx, String C_BPartner_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, C_BPartner_UU, trxName, virtualColumns);
      /** if (C_BPartner_UU == null)
        {
			setC_BP_Group_ID (0);
			setC_BPartner_ID (0);
			setIs1099Vendor (false);
// N
			setIsCustomer (false);
			setIsEmployee (false);
			setIsOneTime (false);
			setIsPOTaxExempt (false);
// N
			setIsProspect (false);
// N
			setIsSalesRep (false);
			setIsSummary (false);
			setIsVendor (true);
// 'Y'
			setName (null);
			setSO_CreditLimit (Env.ZERO);
			setSO_CreditUsed (Env.ZERO);
			setSendEMail (false);
			setValue (null);
			setZZ_IsSDRUser (false);
// 'N'
			setZZ_Is_Employer (false);
// N
			setZZ_Is_MQA_Sector (false);
// N
        } */
    }

    /** Load Constructor */
    public X_C_BPartner (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_C_BPartner[")
        .append(get_ID()).append(",Name=").append(getName()).append("]");
      return sb.toString();
    }

	/** AD_Language AD_Reference_ID=327 */
	public static final int AD_LANGUAGE_AD_Reference_ID=327;
	/** Set Language.
		@param AD_Language Language for this entity
	*/
	public void setAD_Language (String AD_Language)
	{

		set_Value (COLUMNNAME_AD_Language, AD_Language);
	}

	/** Get Language.
		@return Language for this entity
	  */
	public String getAD_Language()
	{
		return (String)get_Value(COLUMNNAME_AD_Language);
	}

	/** Set Linked Organization.
		@param AD_OrgBP_ID The Business Partner is another Organization for explicit Inter-Org transactions
	*/
	public void setAD_OrgBP_ID (int AD_OrgBP_ID)
	{
		if (AD_OrgBP_ID < 1)
			set_Value (COLUMNNAME_AD_OrgBP_ID, null);
		else
			set_Value (COLUMNNAME_AD_OrgBP_ID, Integer.valueOf(AD_OrgBP_ID));
	}

	/** Get Linked Organization.
		@return The Business Partner is another Organization for explicit Inter-Org transactions
	  */
	public int getAD_OrgBP_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_OrgBP_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Acquisition Cost.
		@param AcqusitionCost The cost of gaining the prospect as a customer
	*/
	public void setAcqusitionCost (BigDecimal AcqusitionCost)
	{
		set_Value (COLUMNNAME_AcqusitionCost, AcqusitionCost);
	}

	/** Get Acquisition Cost.
		@return The cost of gaining the prospect as a customer
	  */
	public BigDecimal getAcqusitionCost()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AcqusitionCost);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Actual Life Time Value.
		@param ActualLifeTimeValue Actual Life Time Revenue
	*/
	public void setActualLifeTimeValue (BigDecimal ActualLifeTimeValue)
	{
		set_Value (COLUMNNAME_ActualLifeTimeValue, ActualLifeTimeValue);
	}

	/** Get Actual Life Time Value.
		@return Actual Life Time Revenue
	  */
	public BigDecimal getActualLifeTimeValue()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_ActualLifeTimeValue);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Partner Parent.
		@param BPartner_Parent_ID Business Partner Parent
	*/
	public void setBPartner_Parent_ID (int BPartner_Parent_ID)
	{
		if (BPartner_Parent_ID < 1)
			set_Value (COLUMNNAME_BPartner_Parent_ID, null);
		else
			set_Value (COLUMNNAME_BPartner_Parent_ID, Integer.valueOf(BPartner_Parent_ID));
	}

	/** Get Partner Parent.
		@return Business Partner Parent
	  */
	public int getBPartner_Parent_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_BPartner_Parent_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_BP_Group getC_BP_Group() throws RuntimeException
	{
		return (org.compiere.model.I_C_BP_Group)MTable.get(getCtx(), org.compiere.model.I_C_BP_Group.Table_ID)
			.getPO(getC_BP_Group_ID(), get_TrxName());
	}

	/** Set Business Partner Group.
		@param C_BP_Group_ID Business Partner Group
	*/
	public void setC_BP_Group_ID (int C_BP_Group_ID)
	{
		if (C_BP_Group_ID < 1)
			set_Value (COLUMNNAME_C_BP_Group_ID, null);
		else
			set_Value (COLUMNNAME_C_BP_Group_ID, Integer.valueOf(C_BP_Group_ID));
	}

	/** Get Business Partner Group.
		@return Business Partner Group
	  */
	public int getC_BP_Group_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_BP_Group_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	/** Set C_BPartner_UU.
		@param C_BPartner_UU C_BPartner_UU
	*/
	public void setC_BPartner_UU (String C_BPartner_UU)
	{
		set_Value (COLUMNNAME_C_BPartner_UU, C_BPartner_UU);
	}

	/** Get C_BPartner_UU.
		@return C_BPartner_UU	  */
	public String getC_BPartner_UU()
	{
		return (String)get_Value(COLUMNNAME_C_BPartner_UU);
	}

	public org.compiere.model.I_C_Dunning getC_Dunning() throws RuntimeException
	{
		return (org.compiere.model.I_C_Dunning)MTable.get(getCtx(), org.compiere.model.I_C_Dunning.Table_ID)
			.getPO(getC_Dunning_ID(), get_TrxName());
	}

	/** Set Dunning.
		@param C_Dunning_ID Dunning Rules for overdue invoices
	*/
	public void setC_Dunning_ID (int C_Dunning_ID)
	{
		if (C_Dunning_ID < 1)
			set_Value (COLUMNNAME_C_Dunning_ID, null);
		else
			set_Value (COLUMNNAME_C_Dunning_ID, Integer.valueOf(C_Dunning_ID));
	}

	/** Get Dunning.
		@return Dunning Rules for overdue invoices
	  */
	public int getC_Dunning_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Dunning_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_Greeting getC_Greeting() throws RuntimeException
	{
		return (org.compiere.model.I_C_Greeting)MTable.get(getCtx(), org.compiere.model.I_C_Greeting.Table_ID)
			.getPO(getC_Greeting_ID(), get_TrxName());
	}

	/** Set Greeting.
		@param C_Greeting_ID Greeting to print on correspondence
	*/
	public void setC_Greeting_ID (int C_Greeting_ID)
	{
		if (C_Greeting_ID < 1)
			set_Value (COLUMNNAME_C_Greeting_ID, null);
		else
			set_Value (COLUMNNAME_C_Greeting_ID, Integer.valueOf(C_Greeting_ID));
	}

	/** Get Greeting.
		@return Greeting to print on correspondence
	  */
	public int getC_Greeting_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Greeting_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_InvoiceSchedule getC_InvoiceSchedule() throws RuntimeException
	{
		return (org.compiere.model.I_C_InvoiceSchedule)MTable.get(getCtx(), org.compiere.model.I_C_InvoiceSchedule.Table_ID)
			.getPO(getC_InvoiceSchedule_ID(), get_TrxName());
	}

	/** Set Invoice Schedule.
		@param C_InvoiceSchedule_ID Schedule for generating Invoices
	*/
	public void setC_InvoiceSchedule_ID (int C_InvoiceSchedule_ID)
	{
		if (C_InvoiceSchedule_ID < 1)
			set_Value (COLUMNNAME_C_InvoiceSchedule_ID, null);
		else
			set_Value (COLUMNNAME_C_InvoiceSchedule_ID, Integer.valueOf(C_InvoiceSchedule_ID));
	}

	/** Get Invoice Schedule.
		@return Schedule for generating Invoices
	  */
	public int getC_InvoiceSchedule_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_InvoiceSchedule_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_PaymentTerm getC_PaymentTerm() throws RuntimeException
	{
		return (org.compiere.model.I_C_PaymentTerm)MTable.get(getCtx(), org.compiere.model.I_C_PaymentTerm.Table_ID)
			.getPO(getC_PaymentTerm_ID(), get_TrxName());
	}

	/** Set Payment Term.
		@param C_PaymentTerm_ID The terms of Payment (timing, discount)
	*/
	public void setC_PaymentTerm_ID (int C_PaymentTerm_ID)
	{
		if (C_PaymentTerm_ID < 1)
			set_Value (COLUMNNAME_C_PaymentTerm_ID, null);
		else
			set_Value (COLUMNNAME_C_PaymentTerm_ID, Integer.valueOf(C_PaymentTerm_ID));
	}

	/** Get Payment Term.
		@return The terms of Payment (timing, discount)
	  */
	public int getC_PaymentTerm_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_PaymentTerm_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.eevolution.model.I_C_TaxGroup getC_TaxGroup() throws RuntimeException
	{
		return (org.eevolution.model.I_C_TaxGroup)MTable.get(getCtx(), org.eevolution.model.I_C_TaxGroup.Table_ID)
			.getPO(getC_TaxGroup_ID(), get_TrxName());
	}

	/** Set Tax Group.
		@param C_TaxGroup_ID Tax Group
	*/
	public void setC_TaxGroup_ID (int C_TaxGroup_ID)
	{
		if (C_TaxGroup_ID < 1)
			set_Value (COLUMNNAME_C_TaxGroup_ID, null);
		else
			set_Value (COLUMNNAME_C_TaxGroup_ID, Integer.valueOf(C_TaxGroup_ID));
	}

	/** Get Tax Group.
		@return Tax Group	  */
	public int getC_TaxGroup_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_TaxGroup_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Customer Profile ID.
		@param CustomerProfileID Customer Profile ID
	*/
	public void setCustomerProfileID (String CustomerProfileID)
	{
		set_Value (COLUMNNAME_CustomerProfileID, CustomerProfileID);
	}

	/** Get Customer Profile ID.
		@return Customer Profile ID	  */
	public String getCustomerProfileID()
	{
		return (String)get_Value(COLUMNNAME_CustomerProfileID);
	}

	/** Set D-U-N-S.
		@param DUNS Dun &amp; Bradstreet Number
	*/
	public void setDUNS (String DUNS)
	{
		set_Value (COLUMNNAME_DUNS, DUNS);
	}

	/** Get D-U-N-S.
		@return Dun &amp; Bradstreet Number
	  */
	public String getDUNS()
	{
		return (String)get_Value(COLUMNNAME_DUNS);
	}

	public org.compiere.model.I_C_1099Box getDefault1099Box() throws RuntimeException
	{
		return (org.compiere.model.I_C_1099Box)MTable.get(getCtx(), org.compiere.model.I_C_1099Box.Table_ID)
			.getPO(getDefault1099Box_ID(), get_TrxName());
	}

	/** Set Default 1099 Box.
		@param Default1099Box_ID Default 1099 Box
	*/
	public void setDefault1099Box_ID (int Default1099Box_ID)
	{
		if (Default1099Box_ID < 1)
			set_Value (COLUMNNAME_Default1099Box_ID, null);
		else
			set_Value (COLUMNNAME_Default1099Box_ID, Integer.valueOf(Default1099Box_ID));
	}

	/** Get Default 1099 Box.
		@return Default 1099 Box	  */
	public int getDefault1099Box_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Default1099Box_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** DeliveryRule AD_Reference_ID=151 */
	public static final int DELIVERYRULE_AD_Reference_ID=151;
	/** Availability = A */
	public static final String DELIVERYRULE_Availability = "A";
	/** Force = F */
	public static final String DELIVERYRULE_Force = "F";
	/** Complete Line = L */
	public static final String DELIVERYRULE_CompleteLine = "L";
	/** Manual = M */
	public static final String DELIVERYRULE_Manual = "M";
	/** Complete Order = O */
	public static final String DELIVERYRULE_CompleteOrder = "O";
	/** After Payment = R */
	public static final String DELIVERYRULE_AfterPayment = "R";
	/** Set Delivery Rule.
		@param DeliveryRule Defines the timing of Delivery
	*/
	public void setDeliveryRule (String DeliveryRule)
	{

		set_Value (COLUMNNAME_DeliveryRule, DeliveryRule);
	}

	/** Get Delivery Rule.
		@return Defines the timing of Delivery
	  */
	public String getDeliveryRule()
	{
		return (String)get_Value(COLUMNNAME_DeliveryRule);
	}

	/** DeliveryViaRule AD_Reference_ID=152 */
	public static final int DELIVERYVIARULE_AD_Reference_ID=152;
	/** Delivery = D */
	public static final String DELIVERYVIARULE_Delivery = "D";
	/** Pickup = P */
	public static final String DELIVERYVIARULE_Pickup = "P";
	/** Shipper = S */
	public static final String DELIVERYVIARULE_Shipper = "S";
	/** Set Delivery Via.
		@param DeliveryViaRule How the order will be delivered
	*/
	public void setDeliveryViaRule (String DeliveryViaRule)
	{

		set_Value (COLUMNNAME_DeliveryViaRule, DeliveryViaRule);
	}

	/** Get Delivery Via.
		@return How the order will be delivered
	  */
	public String getDeliveryViaRule()
	{
		return (String)get_Value(COLUMNNAME_DeliveryViaRule);
	}

	/** Set Description.
		@param Description Optional short description of the record
	*/
	public void setDescription (String Description)
	{
		set_Value (COLUMNNAME_Description, Description);
	}

	/** Get Description.
		@return Optional short description of the record
	  */
	public String getDescription()
	{
		return (String)get_Value(COLUMNNAME_Description);
	}

	/** Set Document Copies.
		@param DocumentCopies Number of copies to be printed
	*/
	public void setDocumentCopies (int DocumentCopies)
	{
		set_Value (COLUMNNAME_DocumentCopies, Integer.valueOf(DocumentCopies));
	}

	/** Get Document Copies.
		@return Number of copies to be printed
	  */
	public int getDocumentCopies()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_DocumentCopies);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Dunning Grace Date.
		@param DunningGrace Dunning Grace Date
	*/
	public void setDunningGrace (Timestamp DunningGrace)
	{
		set_Value (COLUMNNAME_DunningGrace, DunningGrace);
	}

	/** Get Dunning Grace Date.
		@return Dunning Grace Date	  */
	public Timestamp getDunningGrace()
	{
		return (Timestamp)get_Value(COLUMNNAME_DunningGrace);
	}

	/** Set First Sale.
		@param FirstSale Date of First Sale
	*/
	public void setFirstSale (Timestamp FirstSale)
	{
		set_Value (COLUMNNAME_FirstSale, FirstSale);
	}

	/** Get First Sale.
		@return Date of First Sale
	  */
	public Timestamp getFirstSale()
	{
		return (Timestamp)get_Value(COLUMNNAME_FirstSale);
	}

	/** Set Flat Discount %.
		@param FlatDiscount Flat discount percentage 
	*/
	public void setFlatDiscount (BigDecimal FlatDiscount)
	{
		set_Value (COLUMNNAME_FlatDiscount, FlatDiscount);
	}

	/** Get Flat Discount %.
		@return Flat discount percentage 
	  */
	public BigDecimal getFlatDiscount()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_FlatDiscount);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** FreightCostRule AD_Reference_ID=153 */
	public static final int FREIGHTCOSTRULE_AD_Reference_ID=153;
	/** Calculated = C */
	public static final String FREIGHTCOSTRULE_Calculated = "C";
	/** Fix price = F */
	public static final String FREIGHTCOSTRULE_FixPrice = "F";
	/** Freight included = I */
	public static final String FREIGHTCOSTRULE_FreightIncluded = "I";
	/** Line = L */
	public static final String FREIGHTCOSTRULE_Line = "L";
	/** Customer Account = U */
	public static final String FREIGHTCOSTRULE_CustomerAccount = "U";
	/** Set Freight Cost Rule.
		@param FreightCostRule Method for charging Freight
	*/
	public void setFreightCostRule (String FreightCostRule)
	{

		set_Value (COLUMNNAME_FreightCostRule, FreightCostRule);
	}

	/** Get Freight Cost Rule.
		@return Method for charging Freight
	  */
	public String getFreightCostRule()
	{
		return (String)get_Value(COLUMNNAME_FreightCostRule);
	}

	/** InvoiceRule AD_Reference_ID=150 */
	public static final int INVOICERULE_AD_Reference_ID=150;
	/** After Delivery = D */
	public static final String INVOICERULE_AfterDelivery = "D";
	/** Immediate = I */
	public static final String INVOICERULE_Immediate = "I";
	/** After Order delivered = O */
	public static final String INVOICERULE_AfterOrderDelivered = "O";
	/** Customer Schedule after Delivery = S */
	public static final String INVOICERULE_CustomerScheduleAfterDelivery = "S";
	/** Set Invoice Rule.
		@param InvoiceRule Frequency and method of invoicing 
	*/
	public void setInvoiceRule (String InvoiceRule)
	{

		set_Value (COLUMNNAME_InvoiceRule, InvoiceRule);
	}

	/** Get Invoice Rule.
		@return Frequency and method of invoicing 
	  */
	public String getInvoiceRule()
	{
		return (String)get_Value(COLUMNNAME_InvoiceRule);
	}

	public org.compiere.model.I_AD_PrintFormat getInvoice_PrintFormat() throws RuntimeException
	{
		return (org.compiere.model.I_AD_PrintFormat)MTable.get(getCtx(), org.compiere.model.I_AD_PrintFormat.Table_ID)
			.getPO(getInvoice_PrintFormat_ID(), get_TrxName());
	}

	/** Set Invoice Print Format.
		@param Invoice_PrintFormat_ID Print Format for printing Invoices
	*/
	public void setInvoice_PrintFormat_ID (int Invoice_PrintFormat_ID)
	{
		if (Invoice_PrintFormat_ID < 1)
			set_Value (COLUMNNAME_Invoice_PrintFormat_ID, null);
		else
			set_Value (COLUMNNAME_Invoice_PrintFormat_ID, Integer.valueOf(Invoice_PrintFormat_ID));
	}

	/** Get Invoice Print Format.
		@return Print Format for printing Invoices
	  */
	public int getInvoice_PrintFormat_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Invoice_PrintFormat_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set 1099 Vendor.
		@param Is1099Vendor 1099 Vendor
	*/
	public void setIs1099Vendor (boolean Is1099Vendor)
	{
		set_Value (COLUMNNAME_Is1099Vendor, Boolean.valueOf(Is1099Vendor));
	}

	/** Get 1099 Vendor.
		@return 1099 Vendor	  */
	public boolean is1099Vendor()
	{
		Object oo = get_Value(COLUMNNAME_Is1099Vendor);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Customer.
		@param IsCustomer Indicates if this Business Partner is a Customer
	*/
	public void setIsCustomer (boolean IsCustomer)
	{
		set_Value (COLUMNNAME_IsCustomer, Boolean.valueOf(IsCustomer));
	}

	/** Get Customer.
		@return Indicates if this Business Partner is a Customer
	  */
	public boolean isCustomer()
	{
		Object oo = get_Value(COLUMNNAME_IsCustomer);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Discount Printed.
		@param IsDiscountPrinted Print Discount on Invoice and Order
	*/
	public void setIsDiscountPrinted (boolean IsDiscountPrinted)
	{
		set_Value (COLUMNNAME_IsDiscountPrinted, Boolean.valueOf(IsDiscountPrinted));
	}

	/** Get Discount Printed.
		@return Print Discount on Invoice and Order
	  */
	public boolean isDiscountPrinted()
	{
		Object oo = get_Value(COLUMNNAME_IsDiscountPrinted);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Employee.
		@param IsEmployee Indicates if  this Business Partner is an employee
	*/
	public void setIsEmployee (boolean IsEmployee)
	{
		set_Value (COLUMNNAME_IsEmployee, Boolean.valueOf(IsEmployee));
	}

	/** Get Employee.
		@return Indicates if  this Business Partner is an employee
	  */
	public boolean isEmployee()
	{
		Object oo = get_Value(COLUMNNAME_IsEmployee);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Is Manufacturer.
		@param IsManufacturer Indicate role of this Business partner as Manufacturer
	*/
	public void setIsManufacturer (boolean IsManufacturer)
	{
		set_Value (COLUMNNAME_IsManufacturer, Boolean.valueOf(IsManufacturer));
	}

	/** Get Is Manufacturer.
		@return Indicate role of this Business partner as Manufacturer
	  */
	public boolean isManufacturer()
	{
		Object oo = get_Value(COLUMNNAME_IsManufacturer);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set One time transaction.
		@param IsOneTime One time transaction
	*/
	public void setIsOneTime (boolean IsOneTime)
	{
		set_Value (COLUMNNAME_IsOneTime, Boolean.valueOf(IsOneTime));
	}

	/** Get One time transaction.
		@return One time transaction	  */
	public boolean isOneTime()
	{
		Object oo = get_Value(COLUMNNAME_IsOneTime);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set PO Tax exempt.
		@param IsPOTaxExempt Business partner is exempt from tax on purchases
	*/
	public void setIsPOTaxExempt (boolean IsPOTaxExempt)
	{
		set_Value (COLUMNNAME_IsPOTaxExempt, Boolean.valueOf(IsPOTaxExempt));
	}

	/** Get PO Tax exempt.
		@return Business partner is exempt from tax on purchases
	  */
	public boolean isPOTaxExempt()
	{
		Object oo = get_Value(COLUMNNAME_IsPOTaxExempt);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Prospect.
		@param IsProspect Indicates this is a Prospect
	*/
	public void setIsProspect (boolean IsProspect)
	{
		set_Value (COLUMNNAME_IsProspect, Boolean.valueOf(IsProspect));
	}

	/** Get Prospect.
		@return Indicates this is a Prospect
	  */
	public boolean isProspect()
	{
		Object oo = get_Value(COLUMNNAME_IsProspect);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Sales Representative.
		@param IsSalesRep Indicates if  the business partner is a sales representative or company agent
	*/
	public void setIsSalesRep (boolean IsSalesRep)
	{
		set_Value (COLUMNNAME_IsSalesRep, Boolean.valueOf(IsSalesRep));
	}

	/** Get Sales Representative.
		@return Indicates if  the business partner is a sales representative or company agent
	  */
	public boolean isSalesRep()
	{
		Object oo = get_Value(COLUMNNAME_IsSalesRep);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Summary Level.
		@param IsSummary This is a summary entity
	*/
	public void setIsSummary (boolean IsSummary)
	{
		set_Value (COLUMNNAME_IsSummary, Boolean.valueOf(IsSummary));
	}

	/** Get Summary Level.
		@return This is a summary entity
	  */
	public boolean isSummary()
	{
		Object oo = get_Value(COLUMNNAME_IsSummary);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set SO Tax exempt.
		@param IsTaxExempt Business partner is exempt from tax on sales
	*/
	public void setIsTaxExempt (boolean IsTaxExempt)
	{
		set_Value (COLUMNNAME_IsTaxExempt, Boolean.valueOf(IsTaxExempt));
	}

	/** Get SO Tax exempt.
		@return Business partner is exempt from tax on sales
	  */
	public boolean isTaxExempt()
	{
		Object oo = get_Value(COLUMNNAME_IsTaxExempt);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Vendor.
		@param IsVendor Indicates if this Business Partner is a Vendor
	*/
	public void setIsVendor (boolean IsVendor)
	{
		set_Value (COLUMNNAME_IsVendor, Boolean.valueOf(IsVendor));
	}

	/** Get Vendor.
		@return Indicates if this Business Partner is a Vendor
	  */
	public boolean isVendor()
	{
		Object oo = get_Value(COLUMNNAME_IsVendor);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Logo.
		@param Logo_ID Logo
	*/
	public void setLogo_ID (int Logo_ID)
	{
		if (Logo_ID < 1)
			set_Value (COLUMNNAME_Logo_ID, null);
		else
			set_Value (COLUMNNAME_Logo_ID, Integer.valueOf(Logo_ID));
	}

	/** Get Logo.
		@return Logo	  */
	public int getLogo_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Logo_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_M_DiscountSchema getM_DiscountSchema() throws RuntimeException
	{
		return (org.compiere.model.I_M_DiscountSchema)MTable.get(getCtx(), org.compiere.model.I_M_DiscountSchema.Table_ID)
			.getPO(getM_DiscountSchema_ID(), get_TrxName());
	}

	/** Set Discount Schema.
		@param M_DiscountSchema_ID Schema to calculate the trade discount percentage
	*/
	public void setM_DiscountSchema_ID (int M_DiscountSchema_ID)
	{
		if (M_DiscountSchema_ID < 1)
			set_Value (COLUMNNAME_M_DiscountSchema_ID, null);
		else
			set_Value (COLUMNNAME_M_DiscountSchema_ID, Integer.valueOf(M_DiscountSchema_ID));
	}

	/** Get Discount Schema.
		@return Schema to calculate the trade discount percentage
	  */
	public int getM_DiscountSchema_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_M_DiscountSchema_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_M_PriceList getM_PriceList() throws RuntimeException
	{
		return (org.compiere.model.I_M_PriceList)MTable.get(getCtx(), org.compiere.model.I_M_PriceList.Table_ID)
			.getPO(getM_PriceList_ID(), get_TrxName());
	}

	/** Set Price List.
		@param M_PriceList_ID Unique identifier of a Price List
	*/
	public void setM_PriceList_ID (int M_PriceList_ID)
	{
		if (M_PriceList_ID < 1)
			set_Value (COLUMNNAME_M_PriceList_ID, null);
		else
			set_Value (COLUMNNAME_M_PriceList_ID, Integer.valueOf(M_PriceList_ID));
	}

	/** Get Price List.
		@return Unique identifier of a Price List
	  */
	public int getM_PriceList_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_M_PriceList_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set NAICS/SIC.
		@param NAICS Standard Industry Code or its successor NAIC - http://www.osha.gov/oshstats/sicser.html
	*/
	public void setNAICS (String NAICS)
	{
		set_Value (COLUMNNAME_NAICS, NAICS);
	}

	/** Get NAICS/SIC.
		@return Standard Industry Code or its successor NAIC - http://www.osha.gov/oshstats/sicser.html
	  */
	public String getNAICS()
	{
		return (String)get_Value(COLUMNNAME_NAICS);
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

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair()
    {
        return new KeyNamePair(get_ID(), getName());
    }

	/** Set Name 2.
		@param Name2 Additional Name
	*/
	public void setName2 (String Name2)
	{
		set_Value (COLUMNNAME_Name2, Name2);
	}

	/** Get Name 2.
		@return Additional Name
	  */
	public String getName2()
	{
		return (String)get_Value(COLUMNNAME_Name2);
	}

	/** Set Employees.
		@param NumberEmployees Number of employees
	*/
	public void setNumberEmployees (int NumberEmployees)
	{
		set_Value (COLUMNNAME_NumberEmployees, Integer.valueOf(NumberEmployees));
	}

	/** Get Employees.
		@return Number of employees
	  */
	public int getNumberEmployees()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_NumberEmployees);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Order Reference.
		@param POReference Transaction Reference Number (Sales Order, Purchase Order) of your Business Partner
	*/
	public void setPOReference (String POReference)
	{
		set_Value (COLUMNNAME_POReference, POReference);
	}

	/** Get Order Reference.
		@return Transaction Reference Number (Sales Order, Purchase Order) of your Business Partner
	  */
	public String getPOReference()
	{
		return (String)get_Value(COLUMNNAME_POReference);
	}

	public org.compiere.model.I_M_DiscountSchema getPO_DiscountSchema() throws RuntimeException
	{
		return (org.compiere.model.I_M_DiscountSchema)MTable.get(getCtx(), org.compiere.model.I_M_DiscountSchema.Table_ID)
			.getPO(getPO_DiscountSchema_ID(), get_TrxName());
	}

	/** Set PO Discount Schema.
		@param PO_DiscountSchema_ID Schema to calculate the purchase trade discount percentage
	*/
	public void setPO_DiscountSchema_ID (int PO_DiscountSchema_ID)
	{
		if (PO_DiscountSchema_ID < 1)
			set_Value (COLUMNNAME_PO_DiscountSchema_ID, null);
		else
			set_Value (COLUMNNAME_PO_DiscountSchema_ID, Integer.valueOf(PO_DiscountSchema_ID));
	}

	/** Get PO Discount Schema.
		@return Schema to calculate the purchase trade discount percentage
	  */
	public int getPO_DiscountSchema_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_PO_DiscountSchema_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_PaymentTerm getPO_PaymentTerm() throws RuntimeException
	{
		return (org.compiere.model.I_C_PaymentTerm)MTable.get(getCtx(), org.compiere.model.I_C_PaymentTerm.Table_ID)
			.getPO(getPO_PaymentTerm_ID(), get_TrxName());
	}

	/** Set PO Payment Term.
		@param PO_PaymentTerm_ID Payment rules for a purchase order
	*/
	public void setPO_PaymentTerm_ID (int PO_PaymentTerm_ID)
	{
		if (PO_PaymentTerm_ID < 1)
			set_Value (COLUMNNAME_PO_PaymentTerm_ID, null);
		else
			set_Value (COLUMNNAME_PO_PaymentTerm_ID, Integer.valueOf(PO_PaymentTerm_ID));
	}

	/** Get PO Payment Term.
		@return Payment rules for a purchase order
	  */
	public int getPO_PaymentTerm_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_PO_PaymentTerm_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_M_PriceList getPO_PriceList() throws RuntimeException
	{
		return (org.compiere.model.I_M_PriceList)MTable.get(getCtx(), org.compiere.model.I_M_PriceList.Table_ID)
			.getPO(getPO_PriceList_ID(), get_TrxName());
	}

	/** Set Purchase Price List.
		@param PO_PriceList_ID Price List used by this Business Partner
	*/
	public void setPO_PriceList_ID (int PO_PriceList_ID)
	{
		if (PO_PriceList_ID < 1)
			set_Value (COLUMNNAME_PO_PriceList_ID, null);
		else
			set_Value (COLUMNNAME_PO_PriceList_ID, Integer.valueOf(PO_PriceList_ID));
	}

	/** Get Purchase Price List.
		@return Price List used by this Business Partner
	  */
	public int getPO_PriceList_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_PO_PriceList_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Parent Key.
		@param ParentValue Key if the Parent
	*/
	public void setParentValue (String ParentValue)
	{
		throw new IllegalArgumentException ("ParentValue is virtual column");	}

	/** Get Parent Key.
		@return Key if the Parent
	  */
	public String getParentValue()
	{
		return (String)get_Value(COLUMNNAME_ParentValue);
	}

	/** PaymentRule AD_Reference_ID=195 */
	public static final int PAYMENTRULE_AD_Reference_ID=195;
	/** Cash = B */
	public static final String PAYMENTRULE_Cash = "B";
	/** Direct Debit = D */
	public static final String PAYMENTRULE_DirectDebit = "D";
	/** Credit Card = K */
	public static final String PAYMENTRULE_CreditCard = "K";
	/** Mixed POS Payment = M */
	public static final String PAYMENTRULE_MixedPOSPayment = "M";
	/** On Credit = P */
	public static final String PAYMENTRULE_OnCredit = "P";
	/** Check = S */
	public static final String PAYMENTRULE_Check = "S";
	/** Direct Deposit = T */
	public static final String PAYMENTRULE_DirectDeposit = "T";
	/** Set Payment Rule.
		@param PaymentRule How you pay the invoice
	*/
	public void setPaymentRule (String PaymentRule)
	{

		set_Value (COLUMNNAME_PaymentRule, PaymentRule);
	}

	/** Get Payment Rule.
		@return How you pay the invoice
	  */
	public String getPaymentRule()
	{
		return (String)get_Value(COLUMNNAME_PaymentRule);
	}

	/** PaymentRulePO AD_Reference_ID=195 */
	public static final int PAYMENTRULEPO_AD_Reference_ID=195;
	/** Cash = B */
	public static final String PAYMENTRULEPO_Cash = "B";
	/** Direct Debit = D */
	public static final String PAYMENTRULEPO_DirectDebit = "D";
	/** Credit Card = K */
	public static final String PAYMENTRULEPO_CreditCard = "K";
	/** Mixed POS Payment = M */
	public static final String PAYMENTRULEPO_MixedPOSPayment = "M";
	/** On Credit = P */
	public static final String PAYMENTRULEPO_OnCredit = "P";
	/** Check = S */
	public static final String PAYMENTRULEPO_Check = "S";
	/** Direct Deposit = T */
	public static final String PAYMENTRULEPO_DirectDeposit = "T";
	/** Set Payment Rule.
		@param PaymentRulePO Purchase payment option
	*/
	public void setPaymentRulePO (String PaymentRulePO)
	{

		set_Value (COLUMNNAME_PaymentRulePO, PaymentRulePO);
	}

	/** Get Payment Rule.
		@return Purchase payment option
	  */
	public String getPaymentRulePO()
	{
		return (String)get_Value(COLUMNNAME_PaymentRulePO);
	}

	/** Set Potential Life Time Value.
		@param PotentialLifeTimeValue Total Revenue expected
	*/
	public void setPotentialLifeTimeValue (BigDecimal PotentialLifeTimeValue)
	{
		set_Value (COLUMNNAME_PotentialLifeTimeValue, PotentialLifeTimeValue);
	}

	/** Get Potential Life Time Value.
		@return Total Revenue expected
	  */
	public BigDecimal getPotentialLifeTimeValue()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PotentialLifeTimeValue);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Rating.
		@param Rating Classification or Importance
	*/
	public void setRating (String Rating)
	{
		set_Value (COLUMNNAME_Rating, Rating);
	}

	/** Get Rating.
		@return Classification or Importance
	  */
	public String getRating()
	{
		return (String)get_Value(COLUMNNAME_Rating);
	}

	/** Set Reference No.
		@param ReferenceNo Your customer or vendor number at the Business Partner&#039;s site
	*/
	public void setReferenceNo (String ReferenceNo)
	{
		set_Value (COLUMNNAME_ReferenceNo, ReferenceNo);
	}

	/** Get Reference No.
		@return Your customer or vendor number at the Business Partner&#039;s site
	  */
	public String getReferenceNo()
	{
		return (String)get_Value(COLUMNNAME_ReferenceNo);
	}

	/** SOCreditStatus AD_Reference_ID=289 */
	public static final int SOCREDITSTATUS_AD_Reference_ID=289;
	/** Credit Hold = H */
	public static final String SOCREDITSTATUS_CreditHold = "H";
	/** Credit OK = O */
	public static final String SOCREDITSTATUS_CreditOK = "O";
	/** Credit Stop = S */
	public static final String SOCREDITSTATUS_CreditStop = "S";
	/** Credit Watch = W */
	public static final String SOCREDITSTATUS_CreditWatch = "W";
	/** No Credit Check = X */
	public static final String SOCREDITSTATUS_NoCreditCheck = "X";
	/** Set Credit Status.
		@param SOCreditStatus Business Partner Credit Status
	*/
	public void setSOCreditStatus (String SOCreditStatus)
	{

		set_Value (COLUMNNAME_SOCreditStatus, SOCreditStatus);
	}

	/** Get Credit Status.
		@return Business Partner Credit Status
	  */
	public String getSOCreditStatus()
	{
		return (String)get_Value(COLUMNNAME_SOCreditStatus);
	}

	/** Set Credit Limit.
		@param SO_CreditLimit Total outstanding invoice amounts allowed
	*/
	public void setSO_CreditLimit (BigDecimal SO_CreditLimit)
	{
		set_Value (COLUMNNAME_SO_CreditLimit, SO_CreditLimit);
	}

	/** Get Credit Limit.
		@return Total outstanding invoice amounts allowed
	  */
	public BigDecimal getSO_CreditLimit()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_SO_CreditLimit);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Credit Used.
		@param SO_CreditUsed Current open balance
	*/
	public void setSO_CreditUsed (BigDecimal SO_CreditUsed)
	{
		set_ValueNoCheck (COLUMNNAME_SO_CreditUsed, SO_CreditUsed);
	}

	/** Get Credit Used.
		@return Current open balance
	  */
	public BigDecimal getSO_CreditUsed()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_SO_CreditUsed);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Order Description.
		@param SO_Description Description to be used on orders
	*/
	public void setSO_Description (String SO_Description)
	{
		set_Value (COLUMNNAME_SO_Description, SO_Description);
	}

	/** Get Order Description.
		@return Description to be used on orders
	  */
	public String getSO_Description()
	{
		return (String)get_Value(COLUMNNAME_SO_Description);
	}

	public org.compiere.model.I_AD_User getSalesRep() throws RuntimeException
	{
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_ID)
			.getPO(getSalesRep_ID(), get_TrxName());
	}

	/** Set Sales Representative.
		@param SalesRep_ID Sales Representative or Company Agent
	*/
	public void setSalesRep_ID (int SalesRep_ID)
	{
		if (SalesRep_ID < 1)
			set_Value (COLUMNNAME_SalesRep_ID, null);
		else
			set_Value (COLUMNNAME_SalesRep_ID, Integer.valueOf(SalesRep_ID));
	}

	/** Get Sales Representative.
		@return Sales Representative or Company Agent
	  */
	public int getSalesRep_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_SalesRep_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Sales Volume in 1.000.
		@param SalesVolume Total Volume of Sales in Thousands of Currency
	*/
	public void setSalesVolume (int SalesVolume)
	{
		set_Value (COLUMNNAME_SalesVolume, Integer.valueOf(SalesVolume));
	}

	/** Get Sales Volume in 1.000.
		@return Total Volume of Sales in Thousands of Currency
	  */
	public int getSalesVolume()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_SalesVolume);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Send EMail.
		@param SendEMail Enable sending Document EMail
	*/
	public void setSendEMail (boolean SendEMail)
	{
		set_Value (COLUMNNAME_SendEMail, Boolean.valueOf(SendEMail));
	}

	/** Get Send EMail.
		@return Enable sending Document EMail
	  */
	public boolean isSendEMail()
	{
		Object oo = get_Value(COLUMNNAME_SendEMail);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Share.
		@param ShareOfCustomer Share of Customer&#039;s business as a percentage
	*/
	public void setShareOfCustomer (int ShareOfCustomer)
	{
		set_Value (COLUMNNAME_ShareOfCustomer, Integer.valueOf(ShareOfCustomer));
	}

	/** Get Share.
		@return Share of Customer&#039;s business as a percentage
	  */
	public int getShareOfCustomer()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ShareOfCustomer);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Min Shelf Life %.
		@param ShelfLifeMinPct Minimum Shelf Life in percent based on Product Instance Guarantee Date
	*/
	public void setShelfLifeMinPct (int ShelfLifeMinPct)
	{
		set_Value (COLUMNNAME_ShelfLifeMinPct, Integer.valueOf(ShelfLifeMinPct));
	}

	/** Get Min Shelf Life %.
		@return Minimum Shelf Life in percent based on Product Instance Guarantee Date
	  */
	public int getShelfLifeMinPct()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ShelfLifeMinPct);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Tax ID.
		@param TaxID Tax Identification
	*/
	public void setTaxID (String TaxID)
	{
		set_Value (COLUMNNAME_TaxID, TaxID);
	}

	/** Get Tax ID.
		@return Tax Identification
	  */
	public String getTaxID()
	{
		return (String)get_Value(COLUMNNAME_TaxID);
	}

	/** Set Open Balance.
		@param TotalOpenBalance Total Open Balance Amount in primary Accounting Currency
	*/
	public void setTotalOpenBalance (BigDecimal TotalOpenBalance)
	{
		set_Value (COLUMNNAME_TotalOpenBalance, TotalOpenBalance);
	}

	/** Get Open Balance.
		@return Total Open Balance Amount in primary Accounting Currency
	  */
	public BigDecimal getTotalOpenBalance()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_TotalOpenBalance);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set URL.
		@param URL Full URL address - e.g. http://www.idempiere.org
	*/
	public void setURL (String URL)
	{
		set_Value (COLUMNNAME_URL, URL);
	}

	/** Get URL.
		@return Full URL address - e.g. http://www.idempiere.org
	  */
	public String getURL()
	{
		return (String)get_Value(COLUMNNAME_URL);
	}

	/** Set Search Key.
		@param Value Search key for the record in the format required - must be unique
	*/
	public void setValue (String Value)
	{
		set_Value (COLUMNNAME_Value, Value);
	}

	/** Get Search Key.
		@return Search key for the record in the format required - must be unique
	  */
	public String getValue()
	{
		return (String)get_Value(COLUMNNAME_Value);
	}

	public org.compiere.model.I_C_BPartner getZZBPartner_Parent() throws RuntimeException
	{
		return (org.compiere.model.I_C_BPartner)MTable.get(getCtx(), org.compiere.model.I_C_BPartner.Table_ID)
			.getPO(getZZBPartner_Parent_ID(), get_TrxName());
	}

	/** Set Parent Organisation.
		@param ZZBPartner_Parent_ID Parent Organisation
	*/
	public void setZZBPartner_Parent_ID (int ZZBPartner_Parent_ID)
	{
		throw new IllegalArgumentException ("ZZBPartner_Parent_ID is virtual column");	}

	/** Get Parent Organisation.
		@return Parent Organisation	  */
	public int getZZBPartner_Parent_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZBPartner_Parent_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Gold = 71 */
	public static final String ZZCHAMBERCODE_Gold = "71";
	/** Diamond Mining = 72 */
	public static final String ZZCHAMBERCODE_DiamondMining = "72";
	/** Platinum Group Metals = 73 */
	public static final String ZZCHAMBERCODE_PlatinumGroupMetals = "73";
	/** Base Metals = 74 */
	public static final String ZZCHAMBERCODE_BaseMetals = "74";
	/** Industrial Minerals = 75 */
	public static final String ZZCHAMBERCODE_IndustrialMinerals = "75";
	/** Aggregates = 76 */
	public static final String ZZCHAMBERCODE_Aggregates = "76";
	/** Cement = 77 */
	public static final String ZZCHAMBERCODE_Cement = "77";
	/** Dimension Stone = 78 */
	public static final String ZZCHAMBERCODE_DimensionStone = "78";
	/** Jewellery Manufacturing = 79 */
	public static final String ZZCHAMBERCODE_JewelleryManufacturing = "79";
	/** Gemstone Processing = 80 */
	public static final String ZZCHAMBERCODE_GemstoneProcessing = "80";
	/** Coal = 81 */
	public static final String ZZCHAMBERCODE_Coal = "81";
	/** Other Mining = 82 */
	public static final String ZZCHAMBERCODE_OtherMining = "82";
	/** Other Minerals = 83 */
	public static final String ZZCHAMBERCODE_OtherMinerals = "83";
	/** Incidental Services = 84 */
	public static final String ZZCHAMBERCODE_IncidentalServices = "84";
	/** Petroleum Exploration = 85 */
	public static final String ZZCHAMBERCODE_PetroleumExploration = "85";
	/** Open Cast = 86 */
	public static final String ZZCHAMBERCODE_OpenCast = "86";
	/** Other SETAs = 97 */
	public static final String ZZCHAMBERCODE_OtherSETAs = "97";
	/** Not Applicable = 98 */
	public static final String ZZCHAMBERCODE_NotApplicable = "98";
	/** Unknown = 99 */
	public static final String ZZCHAMBERCODE_Unknown = "99";
	/** Set Chamber Code.
		@param ZZChamberCode Chamber Code
	*/
	public void setZZChamberCode (String ZZChamberCode)
	{

		set_Value (COLUMNNAME_ZZChamberCode, ZZChamberCode);
	}

	/** Get Chamber Code.
		@return Chamber Code	  */
	public String getZZChamberCode()
	{
		return (String)get_Value(COLUMNNAME_ZZChamberCode);
	}

	/** L Number = L Number */
	public static final String ZZLEVYNUMBERTYPE_LNumber = "L Number";
	/** Other - N number = Other - N number */
	public static final String ZZLEVYNUMBERTYPE_Other_NNumber = "Other - N number";
	/** Other &#8211; SRU Vendor ID = Other &#8211; SRU Vendor ID */
	public static final String ZZLEVYNUMBERTYPE_OtherSRUVendorID = "Other – SRU Vendor ID";
	/** T Number = T Number */
	public static final String ZZLEVYNUMBERTYPE_TNumber = "T Number";
	/** X Number = X Number */
	public static final String ZZLEVYNUMBERTYPE_XNumber = "X Number";
	/** Set SDL Number Type.
		@param ZZLevyNumberType SDL Number Type
	*/
	public void setZZLevyNumberType (String ZZLevyNumberType)
	{

		set_Value (COLUMNNAME_ZZLevyNumberType, ZZLevyNumberType);
	}

	/** Get SDL Number Type.
		@return SDL Number Type	  */
	public String getZZLevyNumberType()
	{
		return (String)get_Value(COLUMNNAME_ZZLevyNumberType);
	}

	/** ZZMaintainStatus AD_Reference_ID=319 */
	public static final int ZZMAINTAINSTATUS_AD_Reference_ID=319;
	/** No = N */
	public static final String ZZMAINTAINSTATUS_No = "N";
	/** Yes = Y */
	public static final String ZZMAINTAINSTATUS_Yes = "Y";
	/** Set Maintain Status.
		@param ZZMaintainStatus Maintain Status
	*/
	public void setZZMaintainStatus (String ZZMaintainStatus)
	{

		set_Value (COLUMNNAME_ZZMaintainStatus, ZZMaintainStatus);
	}

	/** Get Maintain Status.
		@return Maintain Status	  */
	public String getZZMaintainStatus()
	{
		return (String)get_Value(COLUMNNAME_ZZMaintainStatus);
	}

	/** Set Number Employees Profile.
		@param ZZNumberOfEmployeesProfile Number of Employees as per the SARS Profile
	*/
	public void setZZNumberOfEmployeesProfile (int ZZNumberOfEmployeesProfile)
	{
		set_Value (COLUMNNAME_ZZNumberOfEmployeesProfile, Integer.valueOf(ZZNumberOfEmployeesProfile));
	}

	/** Get Number Employees Profile.
		@return Number of Employees as per the SARS Profile
	  */
	public int getZZNumberOfEmployeesProfile()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZNumberOfEmployeesProfile);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Cipro = Cipro */
	public static final String ZZORGREGISTRATIONNUMBERTYPE_Cipro = "Cipro";
	/** Company Registration Number = Company Registration Number */
	public static final String ZZORGREGISTRATIONNUMBERTYPE_CompanyRegistrationNumber = "Company Registration Number";
	/** Set Organisation Registration Number Type.
		@param ZZOrgRegistrationNumberType Organisation Registration Number Type
	*/
	public void setZZOrgRegistrationNumberType (String ZZOrgRegistrationNumberType)
	{

		set_Value (COLUMNNAME_ZZOrgRegistrationNumberType, ZZOrgRegistrationNumberType);
	}

	/** Get Organisation Registration Number Type.
		@return Organisation Registration Number Type	  */
	public String getZZOrgRegistrationNumberType()
	{
		return (String)get_Value(COLUMNNAME_ZZOrgRegistrationNumberType);
	}

	/** Child = Child */
	public static final String ZZORGANISATIONTYPE_Child = "Child";
	/** Independent = Independent */
	public static final String ZZORGANISATIONTYPE_Independent = "Independent";
	/** Parent = Parent */
	public static final String ZZORGANISATIONTYPE_Parent = "Parent";
	/** Set Organisation Type.
		@param ZZOrganisationType Organisation Type
	*/
	public void setZZOrganisationType (String ZZOrganisationType)
	{

		set_Value (COLUMNNAME_ZZOrganisationType, ZZOrganisationType);
	}

	/** Get Organisation Type.
		@return Organisation Type	  */
	public String getZZOrganisationType()
	{
		return (String)get_Value(COLUMNNAME_ZZOrganisationType);
	}

	/** Set SARS Number.
		@param ZZSarsNumber SARS Number
	*/
	public void setZZSarsNumber (String ZZSarsNumber)
	{
		set_Value (COLUMNNAME_ZZSarsNumber, ZZSarsNumber);
	}

	/** Get SARS Number.
		@return SARS Number	  */
	public String getZZSarsNumber()
	{
		return (String)get_Value(COLUMNNAME_ZZSarsNumber);
	}

	/** Mining of Coal and Lignite = 21000 */
	public static final String ZZSICCODE_MiningOfCoalAndLignite = "21000";
	/** Extraction of crude petroleum and natural gas; service activ = 22100 */
	public static final String ZZSICCODE_ExtractionOfCrudePetroleumAndNaturalGasServiceActiv = "22100";
	/** Extraction of crude petroleum and natural gas = 22110 */
	public static final String ZZSICCODE_ExtractionOfCrudePetroleumAndNaturalGas = "22110";
	/** Service activities incidental to oil and gas extraction, exc = 22120 */
	public static final String ZZSICCODE_ServiceActivitiesIncidentalToOilAndGasExtractionExc = "22120";
	/** Mining of gold and uranium ore = 23000 */
	public static final String ZZSICCODE_MiningOfGoldAndUraniumOre = "23000";
	/** Thin tabular operations = 23001 */
	public static final String ZZSICCODE_ThinTabularOperations = "23001";
	/** Thick tabular operations = 23002 */
	public static final String ZZSICCODE_ThickTabularOperations = "23002";
	/** Massive mining operations = 23003 */
	public static final String ZZSICCODE_MassiveMiningOperations = "23003";
	/** Mining of metal ores, except gold and uranium = 24000 */
	public static final String ZZSICCODE_MiningOfMetalOresExceptGoldAndUranium = "24000";
	/** Mining of iron ore = 24100 */
	public static final String ZZSICCODE_MiningOfIronOre = "24100";
	/** Mining of non-ferrous metal ores, except gold and uranium = 24200 */
	public static final String ZZSICCODE_MiningOfNon_FerrousMetalOresExceptGoldAndUranium = "24200";
	/** Mining of chrome = 24210 */
	public static final String ZZSICCODE_MiningOfChrome = "24210";
	/** Mining of copper = 24220 */
	public static final String ZZSICCODE_MiningOfCopper = "24220";
	/** Mining of manganese = 24230 */
	public static final String ZZSICCODE_MiningOfManganese = "24230";
	/** Mining of platinum group metals = 24240 */
	public static final String ZZSICCODE_MiningOfPlatinumGroupMetals = "24240";
	/** Other metal ore mining, except gold and uranium = 24290 */
	public static final String ZZSICCODE_OtherMetalOreMiningExceptGoldAndUranium = "24290";
	/** Other mining and quarrying = 25000 */
	public static final String ZZSICCODE_OtherMiningAndQuarrying = "25000";
	/** Stone quarrying, clay and sandpits = 25100 */
	public static final String ZZSICCODE_StoneQuarryingClayAndSandpits = "25100";
	/** Quarrying/dimension stone operations = 25101 */
	public static final String ZZSICCODE_QuarryingDimensionStoneOperations = "25101";
	/** Open cast/strip mining operations = 25102 */
	public static final String ZZSICCODE_OpenCastStripMiningOperations = "25102";
	/** Open pit operations = 25103 */
	public static final String ZZSICCODE_OpenPitOperations = "25103";
	/** Dimension stone (granite, marble and slate) = 25110 */
	public static final String ZZSICCODE_DimensionStoneGraniteMarbleAndSlate = "25110";
	/** Limestone and lime works = 25120 */
	public static final String ZZSICCODE_LimestoneAndLimeWorks = "25120";
	/** Other stone quarrying, inclding stone crushing and clay and  = 25190 */
	public static final String ZZSICCODE_OtherStoneQuarryingIncldingStoneCrushingAndClayAnd = "25190";
	/** Mining of diamonds (including alluvial diamonds) = 25200 */
	public static final String ZZSICCODE_MiningOfDiamondsIncludingAlluvialDiamonds = "25200";
	/** Marine and quarrying = 25201 */
	public static final String ZZSICCODE_MarineAndQuarrying = "25201";
	/** Coastal mining operations = 25202 */
	public static final String ZZSICCODE_CoastalMiningOperations = "25202";
	/** Mining and quarrying = 25300 */
	public static final String ZZSICCODE_MiningAndQuarrying = "25300";
	/** Mining of chemical and fertilizer minerals = 25310 */
	public static final String ZZSICCODE_MiningOfChemicalAndFertilizerMinerals = "25310";
	/** Phosphates = 25311 */
	public static final String ZZSICCODE_Phosphates = "25311";
	/** Other chemical and fertilizer mineral mining = 25319 */
	public static final String ZZSICCODE_OtherChemicalAndFertilizerMineralMining = "25319";
	/** Extraction and evaporation of salt = 25320 */
	public static final String ZZSICCODE_ExtractionAndEvaporationOfSalt = "25320";
	/** Mining of precious and semi-precious stones except diamonds = 25391 */
	public static final String ZZSICCODE_MiningOfPreciousAndSemi_PreciousStonesExceptDiamonds = "25391";
	/** Asbestos = 25392 */
	public static final String ZZSICCODE_Asbestos = "25392";
	/** Other minerals and materials = 25399 */
	public static final String ZZSICCODE_OtherMineralsAndMaterials = "25399";
	/** Service activities incidental to mining of minerals = 29000 */
	public static final String ZZSICCODE_ServiceActivitiesIncidentalToMiningOfMinerals = "29000";
	/** Manufacture of cement, lime and plaster = 34240 */
	public static final String ZZSICCODE_ManufactureOfCementLimeAndPlaster = "34240";
	/** Manufacture of jewellery and related articles = 39210 */
	public static final String ZZSICCODE_ManufactureOfJewelleryAndRelatedArticles = "39210";
	/** Jewellery and related articles composed of precious metals,  = 39211 */
	public static final String ZZSICCODE_JewelleryAndRelatedArticlesComposedOfPreciousMetals = "39211";
	/** Diamond Cutting and Polishing = 39212 */
	public static final String ZZSICCODE_DiamondCuttingAndPolishing = "39212";
	/** Other precious and semi-precious stone cutting and polishing = 39219 */
	public static final String ZZSICCODE_OtherPreciousAndSemi_PreciousStoneCuttingAndPolishing = "39219";
	/** None = 99916 */
	public static final String ZZSICCODE_None = "99916";
	/** Not Applicable = 99998 */
	public static final String ZZSICCODE_NotApplicable = "99998";
	/** Unknown = 99999 */
	public static final String ZZSICCODE_Unknown = "99999";
	/** Set SIC Code.
		@param ZZSicCode SIC Code
	*/
	public void setZZSicCode (String ZZSicCode)
	{

		set_Value (COLUMNNAME_ZZSicCode, ZZSicCode);
	}

	/** Get SIC Code.
		@return SIC Code	  */
	public String getZZSicCode()
	{
		return (String)get_Value(COLUMNNAME_ZZSicCode);
	}

	/** Coal mining = 1 */
	public static final String ZZSUBSECTOR_CoalMining = "1";
	/** Gold mining = 2 */
	public static final String ZZSUBSECTOR_GoldMining = "2";
	/** PGM mining = 3 */
	public static final String ZZSUBSECTOR_PGMMining = "3";
	/** Diamond mining = 4 */
	public static final String ZZSUBSECTOR_DiamondMining = "4";
	/** Other mining = 5 */
	public static final String ZZSUBSECTOR_OtherMining = "5";
	/** Cement, Lime, Aggregates and Sand (CLAS) = 6 */
	public static final String ZZSUBSECTOR_CementLimeAggregatesAndSandCLAS = "6";
	/** Services Incidental to Mining = 7 */
	public static final String ZZSUBSECTOR_ServicesIncidentalToMining = "7";
	/** Diamond Processing = 8 */
	public static final String ZZSUBSECTOR_DiamondProcessing = "8";
	/** Jewellery Manufacturing = 9 */
	public static final String ZZSUBSECTOR_JewelleryManufacturing = "9";
	/** Set Sub Sector.
		@param ZZSubSector Sub Sector
	*/
	public void setZZSubSector (String ZZSubSector)
	{

		set_Value (COLUMNNAME_ZZSubSector, ZZSubSector);
	}

	/** Get Sub Sector.
		@return Sub Sector	  */
	public String getZZSubSector()
	{
		return (String)get_Value(COLUMNNAME_ZZSubSector);
	}

	/** Set Terminated Employees.
		@param ZZTerminatedEmployees Terminated Employees
	*/
	public void setZZTerminatedEmployees (int ZZTerminatedEmployees)
	{
		set_Value (COLUMNNAME_ZZTerminatedEmployees, Integer.valueOf(ZZTerminatedEmployees));
	}

	/** Get Terminated Employees.
		@return Terminated Employees	  */
	public int getZZTerminatedEmployees()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZTerminatedEmployees);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** ZZUnionised AD_Reference_ID=319 */
	public static final int ZZUNIONISED_AD_Reference_ID=319;
	/** No = N */
	public static final String ZZUNIONISED_No = "N";
	/** Yes = Y */
	public static final String ZZUNIONISED_Yes = "Y";
	/** Set Unionised.
		@param ZZUnionised Unionised
	*/
	public void setZZUnionised (String ZZUnionised)
	{

		set_Value (COLUMNNAME_ZZUnionised, ZZUnionised);
	}

	/** Get Unionised.
		@return Unionised	  */
	public String getZZUnionised()
	{
		return (String)get_Value(COLUMNNAME_ZZUnionised);
	}

	/** Set Business Registration No.
		@param ZZ_Business_Reg_No Business Registration No
	*/
	public void setZZ_Business_Reg_No (String ZZ_Business_Reg_No)
	{
		set_Value (COLUMNNAME_ZZ_Business_Reg_No, ZZ_Business_Reg_No);
	}

	/** Get Business Registration No.
		@return Business Registration No	  */
	public String getZZ_Business_Reg_No()
	{
		return (String)get_Value(COLUMNNAME_ZZ_Business_Reg_No);
	}

	/** Set IsSDRUser.
		@param ZZ_IsSDRUser IsSDRUser
	*/
	public void setZZ_IsSDRUser (boolean ZZ_IsSDRUser)
	{
		set_Value (COLUMNNAME_ZZ_IsSDRUser, Boolean.valueOf(ZZ_IsSDRUser));
	}

	/** Get IsSDRUser.
		@return IsSDRUser	  */
	public boolean isZZ_IsSDRUser()
	{
		Object oo = get_Value(COLUMNNAME_ZZ_IsSDRUser);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Is Employer.
		@param ZZ_Is_Employer Is Employer
	*/
	public void setZZ_Is_Employer (boolean ZZ_Is_Employer)
	{
		set_Value (COLUMNNAME_ZZ_Is_Employer, Boolean.valueOf(ZZ_Is_Employer));
	}

	/** Get Is Employer.
		@return Is Employer	  */
	public boolean isZZ_Is_Employer()
	{
		Object oo = get_Value(COLUMNNAME_ZZ_Is_Employer);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set MQA Sector.
		@param ZZ_Is_MQA_Sector MQA Sector
	*/
	public void setZZ_Is_MQA_Sector (boolean ZZ_Is_MQA_Sector)
	{
		set_Value (COLUMNNAME_ZZ_Is_MQA_Sector, Boolean.valueOf(ZZ_Is_MQA_Sector));
	}

	/** Get MQA Sector.
		@return MQA Sector	  */
	public boolean isZZ_Is_MQA_Sector()
	{
		Object oo = get_Value(COLUMNNAME_ZZ_Is_MQA_Sector);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Municipality/District.
		@param ZZ_Municipality_District Municipality/District
	*/
	public void setZZ_Municipality_District (String ZZ_Municipality_District)
	{
		set_Value (COLUMNNAME_ZZ_Municipality_District, ZZ_Municipality_District);
	}

	/** Get Municipality/District.
		@return Municipality/District	  */
	public String getZZ_Municipality_District()
	{
		return (String)get_Value(COLUMNNAME_ZZ_Municipality_District);
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

	/** Set T Number.
		@param ZZ_T_Number T Number
	*/
	public void setZZ_T_Number (String ZZ_T_Number)
	{
		set_Value (COLUMNNAME_ZZ_T_Number, ZZ_T_Number);
	}

	/** Get T Number.
		@return T Number	  */
	public String getZZ_T_Number()
	{
		return (String)get_Value(COLUMNNAME_ZZ_T_Number);
	}
}