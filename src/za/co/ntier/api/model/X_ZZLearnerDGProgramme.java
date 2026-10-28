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

/** Generated Model for ZZLearnerDGProgramme
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="ZZLearnerDGProgramme")
public class X_ZZLearnerDGProgramme extends PO implements I_ZZLearnerDGProgramme, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20261028L;

    /** Standard Constructor */
    public X_ZZLearnerDGProgramme (Properties ctx, int ZZLearnerDGProgramme_ID, String trxName)
    {
      super (ctx, ZZLearnerDGProgramme_ID, trxName);
      /** if (ZZLearnerDGProgramme_ID == 0)
        {
			setZZLearnerDGProgramme_ID (0);
			setZZ_IsDisability (false);
// N
        } */
    }

    /** Standard Constructor */
    public X_ZZLearnerDGProgramme (Properties ctx, int ZZLearnerDGProgramme_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZLearnerDGProgramme_ID, trxName, virtualColumns);
      /** if (ZZLearnerDGProgramme_ID == 0)
        {
			setZZLearnerDGProgramme_ID (0);
			setZZ_IsDisability (false);
// N
        } */
    }

    /** Standard Constructor */
    public X_ZZLearnerDGProgramme (Properties ctx, String ZZLearnerDGProgramme_UU, String trxName)
    {
      super (ctx, ZZLearnerDGProgramme_UU, trxName);
      /** if (ZZLearnerDGProgramme_UU == null)
        {
			setZZLearnerDGProgramme_ID (0);
			setZZ_IsDisability (false);
// N
        } */
    }

    /** Standard Constructor */
    public X_ZZLearnerDGProgramme (Properties ctx, String ZZLearnerDGProgramme_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZLearnerDGProgramme_UU, trxName, virtualColumns);
      /** if (ZZLearnerDGProgramme_UU == null)
        {
			setZZLearnerDGProgramme_ID (0);
			setZZ_IsDisability (false);
// N
        } */
    }

    /** Load Constructor */
    public X_ZZLearnerDGProgramme (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_ZZLearnerDGProgramme[")
        .append(get_ID()).append("]");
      return sb.toString();
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

	/** Set Agreement Reference Number.
		@param ZZAgreementReferenceNumber Agreement Reference Number
	*/
	public void setZZAgreementReferenceNumber (String ZZAgreementReferenceNumber)
	{
		set_Value (COLUMNNAME_ZZAgreementReferenceNumber, ZZAgreementReferenceNumber);
	}

	/** Get Agreement Reference Number.
		@return Agreement Reference Number	  */
	public String getZZAgreementReferenceNumber()
	{
		return (String)get_Value(COLUMNNAME_ZZAgreementReferenceNumber);
	}

	/** Set Commencement Date.
		@param ZZCommencementDate Commencement Date
	*/
	public void setZZCommencementDate (Timestamp ZZCommencementDate)
	{
		set_Value (COLUMNNAME_ZZCommencementDate, ZZCommencementDate);
	}

	/** Get Commencement Date.
		@return Commencement Date	  */
	public Timestamp getZZCommencementDate()
	{
		return (Timestamp)get_Value(COLUMNNAME_ZZCommencementDate);
	}

	/** Set Estimate Completion Date.
		@param ZZCompletionDate Estimate Completion Date
	*/
	public void setZZCompletionDate (Timestamp ZZCompletionDate)
	{
		set_Value (COLUMNNAME_ZZCompletionDate, ZZCompletionDate);
	}

	/** Get Estimate Completion Date.
		@return Estimate Completion Date	  */
	public Timestamp getZZCompletionDate()
	{
		return (Timestamp)get_Value(COLUMNNAME_ZZCompletionDate);
	}

	/** Set Contract Number.
		@param ZZContractNumber Contract Number
	*/
	public void setZZContractNumber (String ZZContractNumber)
	{
		set_Value (COLUMNNAME_ZZContractNumber, ZZContractNumber);
	}

	/** Get Contract Number.
		@return Contract Number	  */
	public String getZZContractNumber()
	{
		return (String)get_Value(COLUMNNAME_ZZContractNumber);
	}

	public org.compiere.model.I_C_Year getZZFinancialYear() throws RuntimeException
	{
		return (org.compiere.model.I_C_Year)MTable.get(getCtx(), org.compiere.model.I_C_Year.Table_ID)
			.getPO(getZZFinancialYear_ID(), get_TrxName());
	}

	/** Set Financial Year.
		@param ZZFinancialYear_ID Financial Year
	*/
	public void setZZFinancialYear_ID (int ZZFinancialYear_ID)
	{
		if (ZZFinancialYear_ID < 1)
			set_Value (COLUMNNAME_ZZFinancialYear_ID, null);
		else
			set_Value (COLUMNNAME_ZZFinancialYear_ID, Integer.valueOf(ZZFinancialYear_ID));
	}

	/** Get Financial Year.
		@return Financial Year	  */
	public int getZZFinancialYear_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZFinancialYear_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Industry Funded = IF */
	public static final String ZZFUNDINGTYPE_IndustryFunded = "IF";
	/** SETA Funded = SF */
	public static final String ZZFUNDINGTYPE_SETAFunded = "SF";
	/** Set Funding Type.
		@param ZZFundingType Funding Type
	*/
	public void setZZFundingType (String ZZFundingType)
	{

		set_ValueNoCheck (COLUMNNAME_ZZFundingType, ZZFundingType);
	}

	/** Get Funding Type.
		@return Funding Type	  */
	public String getZZFundingType()
	{
		return (String)get_Value(COLUMNNAME_ZZFundingType);
	}

	public org.compiere.model.I_AD_User getZZLeadSDProviderContact() throws RuntimeException
	{
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_ID)
			.getPO(getZZLeadSDProviderContact_ID(), get_TrxName());
	}

	/** Set Lead SDP Contact.
		@param ZZLeadSDProviderContact_ID Lead SDP Contact
	*/
	public void setZZLeadSDProviderContact_ID (int ZZLeadSDProviderContact_ID)
	{
		if (ZZLeadSDProviderContact_ID < 1)
			set_Value (COLUMNNAME_ZZLeadSDProviderContact_ID, null);
		else
			set_Value (COLUMNNAME_ZZLeadSDProviderContact_ID, Integer.valueOf(ZZLeadSDProviderContact_ID));
	}

	/** Get Lead SDP Contact.
		@return Lead SDP Contact	  */
	public int getZZLeadSDProviderContact_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZLeadSDProviderContact_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** ZZLeadSDProviderLevy AD_Reference_ID=319 */
	public static final int ZZLEADSDPROVIDERLEVY_AD_Reference_ID=319;
	/** No = N */
	public static final String ZZLEADSDPROVIDERLEVY_No = "N";
	/** Yes = Y */
	public static final String ZZLEADSDPROVIDERLEVY_Yes = "Y";
	/** Set Lead SDP Skills Levy.
		@param ZZLeadSDProviderLevy Lead SDP Skills Levy
	*/
	public void setZZLeadSDProviderLevy (String ZZLeadSDProviderLevy)
	{

		set_Value (COLUMNNAME_ZZLeadSDProviderLevy, ZZLeadSDProviderLevy);
	}

	/** Get Lead SDP Skills Levy.
		@return Lead SDP Skills Levy	  */
	public String getZZLeadSDProviderLevy()
	{
		return (String)get_Value(COLUMNNAME_ZZLeadSDProviderLevy);
	}

	/** Set DG Programme.
		@param ZZLearnerDGProgramme_ID DG Programme
	*/
	public void setZZLearnerDGProgramme_ID (int ZZLearnerDGProgramme_ID)
	{
		if (ZZLearnerDGProgramme_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZLearnerDGProgramme_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZLearnerDGProgramme_ID, Integer.valueOf(ZZLearnerDGProgramme_ID));
	}

	/** Get DG Programme.
		@return DG Programme	  */
	public int getZZLearnerDGProgramme_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZLearnerDGProgramme_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set ZZLearnerDGProgramme_UU.
		@param ZZLearnerDGProgramme_UU ZZLearnerDGProgramme_UU
	*/
	public void setZZLearnerDGProgramme_UU (String ZZLearnerDGProgramme_UU)
	{
		set_Value (COLUMNNAME_ZZLearnerDGProgramme_UU, ZZLearnerDGProgramme_UU);
	}

	/** Get ZZLearnerDGProgramme_UU.
		@return ZZLearnerDGProgramme_UU	  */
	public String getZZLearnerDGProgramme_UU()
	{
		return (String)get_Value(COLUMNNAME_ZZLearnerDGProgramme_UU);
	}

	public I_ZZLearner getZZLearner() throws RuntimeException
	{
		return (I_ZZLearner)MTable.get(getCtx(), I_ZZLearner.Table_ID)
			.getPO(getZZLearner_ID(), get_TrxName());
	}

	/** Set Learner.
		@param ZZLearner_ID Learner
	*/
	public void setZZLearner_ID (int ZZLearner_ID)
	{
		if (ZZLearner_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZLearner_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZLearner_ID, Integer.valueOf(ZZLearner_ID));
	}

	/** Get Learner.
		@return Learner	  */
	public int getZZLearner_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZLearner_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_AD_User getZZNotRegistere() throws RuntimeException
	{
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_ID)
			.getPO(getZZNotRegisteredBy(), get_TrxName());
	}

	/** Set Not Registered By.
		@param ZZNotRegisteredBy Not Registered By
	*/
	public void setZZNotRegisteredBy (int ZZNotRegisteredBy)
	{
		set_Value (COLUMNNAME_ZZNotRegisteredBy, Integer.valueOf(ZZNotRegisteredBy));
	}

	/** Get Not Registered By.
		@return Not Registered By	  */
	public int getZZNotRegisteredBy()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZNotRegisteredBy);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_AD_User getZZRegistere() throws RuntimeException
	{
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_ID)
			.getPO(getZZRegisteredBy(), get_TrxName());
	}

	/** Set RegisteredBy.
		@param ZZRegisteredBy RegisteredBy
	*/
	public void setZZRegisteredBy (int ZZRegisteredBy)
	{
		set_Value (COLUMNNAME_ZZRegisteredBy, Integer.valueOf(ZZRegisteredBy));
	}

	/** Get RegisteredBy.
		@return RegisteredBy	  */
	public int getZZRegisteredBy()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZRegisteredBy);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Registration Date.
		@param ZZRegistrationDate Registration Date
	*/
	public void setZZRegistrationDate (Timestamp ZZRegistrationDate)
	{
		set_Value (COLUMNNAME_ZZRegistrationDate, ZZRegistrationDate);
	}

	/** Get Registration Date.
		@return Registration Date	  */
	public Timestamp getZZRegistrationDate()
	{
		return (Timestamp)get_Value(COLUMNNAME_ZZRegistrationDate);
	}

	public org.compiere.model.I_AD_User getZZSecondarySDProviderContact() throws RuntimeException
	{
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_ID)
			.getPO(getZZSecondarySDProviderContact_ID(), get_TrxName());
	}

	/** Set Secondary SDP Contact.
		@param ZZSecondarySDProviderContact_ID Secondary SDP Contact
	*/
	public void setZZSecondarySDProviderContact_ID (int ZZSecondarySDProviderContact_ID)
	{
		if (ZZSecondarySDProviderContact_ID < 1)
			set_Value (COLUMNNAME_ZZSecondarySDProviderContact_ID, null);
		else
			set_Value (COLUMNNAME_ZZSecondarySDProviderContact_ID, Integer.valueOf(ZZSecondarySDProviderContact_ID));
	}

	/** Get Secondary SDP Contact.
		@return Secondary SDP Contact	  */
	public int getZZSecondarySDProviderContact_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZSecondarySDProviderContact_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** ZZSecondarySDProviderLevy AD_Reference_ID=319 */
	public static final int ZZSECONDARYSDPROVIDERLEVY_AD_Reference_ID=319;
	/** No = N */
	public static final String ZZSECONDARYSDPROVIDERLEVY_No = "N";
	/** Yes = Y */
	public static final String ZZSECONDARYSDPROVIDERLEVY_Yes = "Y";
	/** Set Secondary SDP Skills Levy.
		@param ZZSecondarySDProviderLevy Secondary SDP Skills Levy
	*/
	public void setZZSecondarySDProviderLevy (String ZZSecondarySDProviderLevy)
	{

		set_Value (COLUMNNAME_ZZSecondarySDProviderLevy, ZZSecondarySDProviderLevy);
	}

	/** Get Secondary SDP Skills Levy.
		@return Secondary SDP Skills Levy	  */
	public String getZZSecondarySDProviderLevy()
	{
		return (String)get_Value(COLUMNNAME_ZZSecondarySDProviderLevy);
	}

	public org.compiere.model.I_C_BPartner getZZSecondarySDProvider() throws RuntimeException
	{
		return (org.compiere.model.I_C_BPartner)MTable.get(getCtx(), org.compiere.model.I_C_BPartner.Table_ID)
			.getPO(getZZSecondarySDProvider_ID(), get_TrxName());
	}

	/** Set Secondary Skills Development Provider.
		@param ZZSecondarySDProvider_ID Secondary Skills Development Provider
	*/
	public void setZZSecondarySDProvider_ID (int ZZSecondarySDProvider_ID)
	{
		if (ZZSecondarySDProvider_ID < 1)
			set_Value (COLUMNNAME_ZZSecondarySDProvider_ID, null);
		else
			set_Value (COLUMNNAME_ZZSecondarySDProvider_ID, Integer.valueOf(ZZSecondarySDProvider_ID));
	}

	/** Get Secondary Skills Development Provider.
		@return Secondary Skills Development Provider	  */
	public int getZZSecondarySDProvider_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZSecondarySDProvider_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Secondary Workplace Approval Contact.
		@param ZZSecondaryWAContact_ID Secondary Workplace Approval Contact
	*/
	public void setZZSecondaryWAContact_ID (int ZZSecondaryWAContact_ID)
	{
		if (ZZSecondaryWAContact_ID < 1)
			set_Value (COLUMNNAME_ZZSecondaryWAContact_ID, null);
		else
			set_Value (COLUMNNAME_ZZSecondaryWAContact_ID, Integer.valueOf(ZZSecondaryWAContact_ID));
	}

	/** Get Secondary Workplace Approval Contact.
		@return Secondary Workplace Approval Contact	  */
	public int getZZSecondaryWAContact_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZSecondaryWAContact_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** ZZSecondaryWALevy AD_Reference_ID=319 */
	public static final int ZZSECONDARYWALEVY_AD_Reference_ID=319;
	/** No = N */
	public static final String ZZSECONDARYWALEVY_No = "N";
	/** Yes = Y */
	public static final String ZZSECONDARYWALEVY_Yes = "Y";
	/** Set Secondary Workplace Approval Skills Levy.
		@param ZZSecondaryWALevy Secondary Workplace Approval Skills Levy
	*/
	public void setZZSecondaryWALevy (String ZZSecondaryWALevy)
	{

		set_Value (COLUMNNAME_ZZSecondaryWALevy, ZZSecondaryWALevy);
	}

	/** Get Secondary Workplace Approval Skills Levy.
		@return Secondary Workplace Approval Skills Levy	  */
	public String getZZSecondaryWALevy()
	{
		return (String)get_Value(COLUMNNAME_ZZSecondaryWALevy);
	}

	public org.compiere.model.I_C_BPartner getZZSecondaryWA() throws RuntimeException
	{
		return (org.compiere.model.I_C_BPartner)MTable.get(getCtx(), org.compiere.model.I_C_BPartner.Table_ID)
			.getPO(getZZSecondaryWA_ID(), get_TrxName());
	}

	/** Set Secondary Workplace Approval.
		@param ZZSecondaryWA_ID Secondary Workplace Approval
	*/
	public void setZZSecondaryWA_ID (int ZZSecondaryWA_ID)
	{
		if (ZZSecondaryWA_ID < 1)
			set_Value (COLUMNNAME_ZZSecondaryWA_ID, null);
		else
			set_Value (COLUMNNAME_ZZSecondaryWA_ID, Integer.valueOf(ZZSecondaryWA_ID));
	}

	/** Get Secondary Workplace Approval.
		@return Secondary Workplace Approval	  */
	public int getZZSecondaryWA_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZSecondaryWA_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Employed = 01 */
	public static final String ZZSOCIOECONOMICSTATUS_Employed = "01";
	/** Unemployed = 02 */
	public static final String ZZSOCIOECONOMICSTATUS_Unemployed = "02";
	/** Set Socio Economic Status.
		@param ZZSocioEconomicStatus Socio Economic Status
	*/
	public void setZZSocioEconomicStatus (String ZZSocioEconomicStatus)
	{

		set_Value (COLUMNNAME_ZZSocioEconomicStatus, ZZSocioEconomicStatus);
	}

	/** Get Socio Economic Status.
		@return Socio Economic Status	  */
	public String getZZSocioEconomicStatus()
	{
		return (String)get_Value(COLUMNNAME_ZZSocioEconomicStatus);
	}

	/** Set Status Effective Date.
		@param ZZStatusEffectiveDate Status Effective Date
	*/
	public void setZZStatusEffectiveDate (Timestamp ZZStatusEffectiveDate)
	{
		set_Value (COLUMNNAME_ZZStatusEffectiveDate, ZZStatusEffectiveDate);
	}

	/** Get Status Effective Date.
		@return Status Effective Date	  */
	public Timestamp getZZStatusEffectiveDate()
	{
		return (Timestamp)get_Value(COLUMNNAME_ZZStatusEffectiveDate);
	}

	/** Set Student Number.
		@param ZZStudentNumber Student Number
	*/
	public void setZZStudentNumber (String ZZStudentNumber)
	{
		set_Value (COLUMNNAME_ZZStudentNumber, ZZStudentNumber);
	}

	/** Get Student Number.
		@return Student Number	  */
	public String getZZStudentNumber()
	{
		return (String)get_Value(COLUMNNAME_ZZStudentNumber);
	}

	public org.compiere.model.I_AD_User getZZWAContact() throws RuntimeException
	{
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_ID)
			.getPO(getZZWAContact_ID(), get_TrxName());
	}

	/** Set Lead Workplace Approval Contact.
		@param ZZWAContact_ID Lead Workplace Approval Contact
	*/
	public void setZZWAContact_ID (int ZZWAContact_ID)
	{
		if (ZZWAContact_ID < 1)
			set_Value (COLUMNNAME_ZZWAContact_ID, null);
		else
			set_Value (COLUMNNAME_ZZWAContact_ID, Integer.valueOf(ZZWAContact_ID));
	}

	/** Get Lead Workplace Approval Contact.
		@return Lead Workplace Approval Contact	  */
	public int getZZWAContact_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZWAContact_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** ZZWALevy AD_Reference_ID=319 */
	public static final int ZZWALEVY_AD_Reference_ID=319;
	/** No = N */
	public static final String ZZWALEVY_No = "N";
	/** Yes = Y */
	public static final String ZZWALEVY_Yes = "Y";
	/** Set Lead Workplace Approval Skills Levy.
		@param ZZWALevy Lead Workplace Approval Skills Levy
	*/
	public void setZZWALevy (String ZZWALevy)
	{

		set_Value (COLUMNNAME_ZZWALevy, ZZWALevy);
	}

	/** Get Lead Workplace Approval Skills Levy.
		@return Lead Workplace Approval Skills Levy	  */
	public String getZZWALevy()
	{
		return (String)get_Value(COLUMNNAME_ZZWALevy);
	}

	/** Set Admin - LP Ops Date Not Recommended.
		@param ZZ_AdminLPOps_DateNotRecommended Admin - LP Ops Date Not Recommended
	*/
	public void setZZ_AdminLPOps_DateNotRecommended (Timestamp ZZ_AdminLPOps_DateNotRecommended)
	{
		set_Value (COLUMNNAME_ZZ_AdminLPOps_DateNotRecommended, ZZ_AdminLPOps_DateNotRecommended);
	}

	/** Get Admin - LP Ops Date Not Recommended.
		@return Admin - LP Ops Date Not Recommended	  */
	public Timestamp getZZ_AdminLPOps_DateNotRecommended()
	{
		return (Timestamp)get_Value(COLUMNNAME_ZZ_AdminLPOps_DateNotRecommended);
	}

	/** Set Admin - LP Ops Date Recommended.
		@param ZZ_AdminLPOps_DateRecommended Admin - LP Ops Date Recommended
	*/
	public void setZZ_AdminLPOps_DateRecommended (Timestamp ZZ_AdminLPOps_DateRecommended)
	{
		set_Value (COLUMNNAME_ZZ_AdminLPOps_DateRecommended, ZZ_AdminLPOps_DateRecommended);
	}

	/** Get Admin - LP Ops Date Recommended.
		@return Admin - LP Ops Date Recommended	  */
	public Timestamp getZZ_AdminLPOps_DateRecommended()
	{
		return (Timestamp)get_Value(COLUMNNAME_ZZ_AdminLPOps_DateRecommended);
	}

	public org.compiere.model.I_AD_User getZZ_AdminLPOps_NotRecommendedBy() throws RuntimeException
	{
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_ID)
			.getPO(getZZ_AdminLPOps_NotRecommendedBy_ID(), get_TrxName());
	}

	/** Set Admin - LP Ops Not Recommended By.
		@param ZZ_AdminLPOps_NotRecommendedBy_ID Admin - LP Ops Not Recommended By
	*/
	public void setZZ_AdminLPOps_NotRecommendedBy_ID (int ZZ_AdminLPOps_NotRecommendedBy_ID)
	{
		if (ZZ_AdminLPOps_NotRecommendedBy_ID < 1)
			set_Value (COLUMNNAME_ZZ_AdminLPOps_NotRecommendedBy_ID, null);
		else
			set_Value (COLUMNNAME_ZZ_AdminLPOps_NotRecommendedBy_ID, Integer.valueOf(ZZ_AdminLPOps_NotRecommendedBy_ID));
	}

	/** Get Admin - LP Ops Not Recommended By.
		@return Admin - LP Ops Not Recommended By	  */
	public int getZZ_AdminLPOps_NotRecommendedBy_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZ_AdminLPOps_NotRecommendedBy_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_AD_User getZZ_AdminLPOps_RecommendedBy() throws RuntimeException
	{
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_ID)
			.getPO(getZZ_AdminLPOps_RecommendedBy_ID(), get_TrxName());
	}

	/** Set Admin - LP Ops Recommended By.
		@param ZZ_AdminLPOps_RecommendedBy_ID Admin - LP Ops Recommended By
	*/
	public void setZZ_AdminLPOps_RecommendedBy_ID (int ZZ_AdminLPOps_RecommendedBy_ID)
	{
		if (ZZ_AdminLPOps_RecommendedBy_ID < 1)
			set_Value (COLUMNNAME_ZZ_AdminLPOps_RecommendedBy_ID, null);
		else
			set_Value (COLUMNNAME_ZZ_AdminLPOps_RecommendedBy_ID, Integer.valueOf(ZZ_AdminLPOps_RecommendedBy_ID));
	}

	/** Get Admin - LP Ops Recommended By.
		@return Admin - LP Ops Recommended By	  */
	public int getZZ_AdminLPOps_RecommendedBy_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZ_AdminLPOps_RecommendedBy_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Date Not Registered.
		@param ZZ_DateNotRegistered Date Not Registered
	*/
	public void setZZ_DateNotRegistered (Timestamp ZZ_DateNotRegistered)
	{
		set_Value (COLUMNNAME_ZZ_DateNotRegistered, ZZ_DateNotRegistered);
	}

	/** Get Date Not Registered.
		@return Date Not Registered	  */
	public Timestamp getZZ_DateNotRegistered()
	{
		return (Timestamp)get_Value(COLUMNNAME_ZZ_DateNotRegistered);
	}

	/** Set Date Registered.
		@param ZZ_DateRegistered Date Registered
	*/
	public void setZZ_DateRegistered (Timestamp ZZ_DateRegistered)
	{
		set_Value (COLUMNNAME_ZZ_DateRegistered, ZZ_DateRegistered);
	}

	/** Get Date Registered.
		@return Date Registered	  */
	public Timestamp getZZ_DateRegistered()
	{
		return (Timestamp)get_Value(COLUMNNAME_ZZ_DateRegistered);
	}

	/** Exec Approve = AE */
	public static final String ZZ_DOCACTION_ExecApprove = "AE";
	/** Approve/Do Not Approve = AP */
	public static final String ZZ_DOCACTION_ApproveDoNotApprove = "AP";
	/** Complete = CO */
	public static final String ZZ_DOCACTION_Complete = "CO";
	/** Evaluate = EV */
	public static final String ZZ_DOCACTION_Evaluate = "EV";
	/** Final Approval/Do not Approve = FA */
	public static final String ZZ_DOCACTION_FinalApprovalDoNotApprove = "FA";
	/** PrepareCEO = PC */
	public static final String ZZ_DOCACTION_PrepareCEO = "PC";
	/** Refer Back = RB */
	public static final String ZZ_DOCACTION_ReferBack = "RB";
	/** Recommend = RE */
	public static final String ZZ_DOCACTION_Recommend = "RE";
	/** Re-Submit = RS */
	public static final String ZZ_DOCACTION_Re_Submit = "RS";
	/** Submit = S1 */
	public static final String ZZ_DOCACTION_Submit = "S1";
	/** System Only (No manual action) = S2 */
	public static final String ZZ_DOCACTION_SystemOnlyNoManualAction = "S2";
	/** Submit to Manager Finance Consumables = SC */
	public static final String ZZ_DOCACTION_SubmitToManagerFinanceConsumables = "SC";
	/** Submit to SDL Finance Mgr = SD */
	public static final String ZZ_DOCACTION_SubmitToSDLFinanceMgr = "SD";
	/** Submit to Snr Mgr LP = SL */
	public static final String ZZ_DOCACTION_SubmitToSnrMgrLP = "SL";
	/** Submit to Snr Mgr Ops = SO */
	public static final String ZZ_DOCACTION_SubmitToSnrMgrOps = "SO";
	/** Submit to Snr Mgr Projects = SP */
	public static final String ZZ_DOCACTION_SubmitToSnrMgrProjects = "SP";
	/** Submit to Snr Mgr QA = SQ */
	public static final String ZZ_DOCACTION_SubmitToSnrMgrQA = "SQ";
	/** Submit to Recommender = SR */
	public static final String ZZ_DOCACTION_SubmitToRecommender = "SR";
	/** Submit to Snr Mgr SRU = SS */
	public static final String ZZ_DOCACTION_SubmitToSnrMgrSRU = "SS";
	/** Submit to Line Manager = SU */
	public static final String ZZ_DOCACTION_SubmitToLineManager = "SU";
	/** Update = UP */
	public static final String ZZ_DOCACTION_Update = "UP";
	/** Verify = VE */
	public static final String ZZ_DOCACTION_Verify = "VE";
	/** Set Document Action.
		@param ZZ_DocAction Document Action
	*/
	public void setZZ_DocAction (String ZZ_DocAction)
	{

		set_Value (COLUMNNAME_ZZ_DocAction, ZZ_DocAction);
	}

	/** Get Document Action.
		@return Document Action	  */
	public String getZZ_DocAction()
	{
		return (String)get_Value(COLUMNNAME_ZZ_DocAction);
	}

	/** Approved By Manager Finance Consumables = AC */
	public static final String ZZ_DOCSTATUS_ApprovedByManagerFinanceConsumables = "AC";
	/** Recommended &#8211; Admin = AD */
	public static final String ZZ_DOCSTATUS_RecommendedAdmin = "AD";
	/** Approved = AP */
	public static final String ZZ_DOCSTATUS_Approved = "AP";
	/** Prepared for CEO = CF */
	public static final String ZZ_DOCSTATUS_PreparedForCEO = "CF";
	/** Completed = CO */
	public static final String ZZ_DOCSTATUS_Completed = "CO";
	/** Created = CR */
	public static final String ZZ_DOCSTATUS_Created = "CR";
	/** Draft = DR */
	public static final String ZZ_DOCSTATUS_Draft = "DR";
	/** Error Importing = EE */
	public static final String ZZ_DOCSTATUS_ErrorImporting = "EE";
	/** Validation Error = ER */
	public static final String ZZ_DOCSTATUS_ValidationError = "ER";
	/** Evaluated = EV */
	public static final String ZZ_DOCSTATUS_Evaluated = "EV";
	/** Importing = IG */
	public static final String ZZ_DOCSTATUS_Importing = "IG";
	/** Imported = IM */
	public static final String ZZ_DOCSTATUS_Imported = "IM";
	/** In Progress = IP */
	public static final String ZZ_DOCSTATUS_InProgress = "IP";
	/** Not Recommended By Senior Mgr SDR = N1 */
	public static final String ZZ_DOCSTATUS_NotRecommendedBySeniorMgrSDR = "N1";
	/** Not Recommended By Senior Mgr Finance = N2 */
	public static final String ZZ_DOCSTATUS_NotRecommendedBySeniorMgrFinance = "N2";
	/** Not Recommended By COO = N3 */
	public static final String ZZ_DOCSTATUS_NotRecommendedByCOO = "N3";
	/** Not Recommended By CFO = N4 */
	public static final String ZZ_DOCSTATUS_NotRecommendedByCFO = "N4";
	/** Not Recommended By CEO = N5 */
	public static final String ZZ_DOCSTATUS_NotRecommendedByCEO = "N5";
	/** Not Approved by Snr Manager = NA */
	public static final String ZZ_DOCSTATUS_NotApprovedBySnrManager = "NA";
	/** Not Approved By Manager Finance Consumables = NC */
	public static final String ZZ_DOCSTATUS_NotApprovedByManagerFinanceConsumables = "NC";
	/** Not Approved By SDL Finance Mgr = ND */
	public static final String ZZ_DOCSTATUS_NotApprovedBySDLFinanceMgr = "ND";
	/** Not Approved By IT Manager = NI */
	public static final String ZZ_DOCSTATUS_NotApprovedByITManager = "NI";
	/** Not Approved by LM = NL */
	public static final String ZZ_DOCSTATUS_NotApprovedByLM = "NL";
	/** Not Approved = NP */
	public static final String ZZ_DOCSTATUS_NotApproved = "NP";
	/** Not Recommended = NR */
	public static final String ZZ_DOCSTATUS_NotRecommended = "NR";
	/** Not Approved by Snr Admin Finance = NS */
	public static final String ZZ_DOCSTATUS_NotApprovedBySnrAdminFinance = "NS";
	/** Not Verified = NV */
	public static final String ZZ_DOCSTATUS_NotVerified = "NV";
	/** Pending = PE */
	public static final String ZZ_DOCSTATUS_Pending = "PE";
	/** Query = QR */
	public static final String ZZ_DOCSTATUS_Query = "QR";
	/** Recommended By Senior Mgr Finance = R1 */
	public static final String ZZ_DOCSTATUS_RecommendedBySeniorMgrFinance = "R1";
	/** Recommended By COO = R2 */
	public static final String ZZ_DOCSTATUS_RecommendedByCOO = "R2";
	/** Recommended By CFO = R3 */
	public static final String ZZ_DOCSTATUS_RecommendedByCFO = "R3";
	/** Recommended By CEO = R4 */
	public static final String ZZ_DOCSTATUS_RecommendedByCEO = "R4";
	/** Recommended By Officer - QA Accreditation = R5 */
	public static final String ZZ_DOCSTATUS_RecommendedByOfficer_QAAccreditation = "R5";
	/** Recommended By Mgr - QA Accreditation = R6 */
	public static final String ZZ_DOCSTATUS_RecommendedByMgr_QAAccreditation = "R6";
	/** Recommended By Snr Mgr QA = R7 */
	public static final String ZZ_DOCSTATUS_RecommendedBySnrMgrQA = "R7";
	/** Recommended By CRO = R8 */
	public static final String ZZ_DOCSTATUS_RecommendedByCRO = "R8";
	/** Recommended for Approval = RA */
	public static final String ZZ_DOCSTATUS_RecommendedForApproval = "RA";
	/** Recommended = RC */
	public static final String ZZ_DOCSTATUS_Recommended = "RC";
	/** Recommended By Senior Mgr SDR = RD */
	public static final String ZZ_DOCSTATUS_RecommendedBySeniorMgrSDR = "RD";
	/** Recommended for Evaluation = RE */
	public static final String ZZ_DOCSTATUS_RecommendedForEvaluation = "RE";
	/** Registered = RG */
	public static final String ZZ_DOCSTATUS_Registered = "RG";
	/** Recommended for Registration - Mgr - LP Ops = RR */
	public static final String ZZ_DOCSTATUS_RecommendedForRegistration_Mgr_LPOps = "RR";
	/** Submitted to Manager Finance Consumables = SC */
	public static final String ZZ_DOCSTATUS_SubmittedToManagerFinanceConsumables = "SC";
	/** Submitted To SDL Finance Mgr = SD */
	public static final String ZZ_DOCSTATUS_SubmittedToSDLFinanceMgr = "SD";
	/** Submitted To IT Manager = SI */
	public static final String ZZ_DOCSTATUS_SubmittedToITManager = "SI";
	/** Submitted To IT Admin = ST */
	public static final String ZZ_DOCSTATUS_SubmittedToITAdmin = "ST";
	/** Submitted = SU */
	public static final String ZZ_DOCSTATUS_Submitted = "SU";
	/** Transfer Out = TO */
	public static final String ZZ_DOCSTATUS_TransferOut = "TO";
	/** Updated by SDR Admin = UA */
	public static final String ZZ_DOCSTATUS_UpdatedBySDRAdmin = "UA";
	/** Uploaded = UP */
	public static final String ZZ_DOCSTATUS_Uploaded = "UP";
	/** Delinked = UnSdfOrg */
	public static final String ZZ_DOCSTATUS_Delinked = "UnSdfOrg";
	/** Validating = VA */
	public static final String ZZ_DOCSTATUS_Validating = "VA";
	/** Verified = VE */
	public static final String ZZ_DOCSTATUS_Verified = "VE";
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

	public org.compiere.model.I_C_BPartner getZZ_Employer() throws RuntimeException
	{
		return (org.compiere.model.I_C_BPartner)MTable.get(getCtx(), org.compiere.model.I_C_BPartner.Table_ID)
			.getPO(getZZ_Employer_ID(), get_TrxName());
	}

	/** Set Employer.
		@param ZZ_Employer_ID Lead Workplace Approval
	*/
	public void setZZ_Employer_ID (int ZZ_Employer_ID)
	{
		if (ZZ_Employer_ID < 1)
			set_Value (COLUMNNAME_ZZ_Employer_ID, null);
		else
			set_Value (COLUMNNAME_ZZ_Employer_ID, Integer.valueOf(ZZ_Employer_ID));
	}

	/** Get Employer.
		@return Lead Workplace Approval
	  */
	public int getZZ_Employer_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZ_Employer_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Disability.
		@param ZZ_IsDisability Disability
	*/
	public void setZZ_IsDisability (boolean ZZ_IsDisability)
	{
		set_Value (COLUMNNAME_ZZ_IsDisability, Boolean.valueOf(ZZ_IsDisability));
	}

	/** Get Disability.
		@return Disability	  */
	public boolean isZZ_IsDisability()
	{
		Object oo = get_Value(COLUMNNAME_ZZ_IsDisability);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Mgr - LP Ops Date Not Recommended.
		@param ZZ_MgrLPOps_DateNotRecommended Mgr - LP Ops Date Not Recommended
	*/
	public void setZZ_MgrLPOps_DateNotRecommended (Timestamp ZZ_MgrLPOps_DateNotRecommended)
	{
		set_Value (COLUMNNAME_ZZ_MgrLPOps_DateNotRecommended, ZZ_MgrLPOps_DateNotRecommended);
	}

	/** Get Mgr - LP Ops Date Not Recommended.
		@return Mgr - LP Ops Date Not Recommended	  */
	public Timestamp getZZ_MgrLPOps_DateNotRecommended()
	{
		return (Timestamp)get_Value(COLUMNNAME_ZZ_MgrLPOps_DateNotRecommended);
	}

	/** Set Mgr - LP Ops Date Recommended.
		@param ZZ_MgrLPOps_DateRecommended Mgr - LP Ops Date Recommended
	*/
	public void setZZ_MgrLPOps_DateRecommended (Timestamp ZZ_MgrLPOps_DateRecommended)
	{
		set_Value (COLUMNNAME_ZZ_MgrLPOps_DateRecommended, ZZ_MgrLPOps_DateRecommended);
	}

	/** Get Mgr - LP Ops Date Recommended.
		@return Mgr - LP Ops Date Recommended	  */
	public Timestamp getZZ_MgrLPOps_DateRecommended()
	{
		return (Timestamp)get_Value(COLUMNNAME_ZZ_MgrLPOps_DateRecommended);
	}

	public org.compiere.model.I_AD_User getZZ_MgrLPOps_NotRecommendedBy() throws RuntimeException
	{
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_ID)
			.getPO(getZZ_MgrLPOps_NotRecommendedBy_ID(), get_TrxName());
	}

	/** Set Mgr - LP Ops Not Recommended By.
		@param ZZ_MgrLPOps_NotRecommendedBy_ID Mgr - LP Ops Not Recommended By
	*/
	public void setZZ_MgrLPOps_NotRecommendedBy_ID (int ZZ_MgrLPOps_NotRecommendedBy_ID)
	{
		if (ZZ_MgrLPOps_NotRecommendedBy_ID < 1)
			set_Value (COLUMNNAME_ZZ_MgrLPOps_NotRecommendedBy_ID, null);
		else
			set_Value (COLUMNNAME_ZZ_MgrLPOps_NotRecommendedBy_ID, Integer.valueOf(ZZ_MgrLPOps_NotRecommendedBy_ID));
	}

	/** Get Mgr - LP Ops Not Recommended By.
		@return Mgr - LP Ops Not Recommended By	  */
	public int getZZ_MgrLPOps_NotRecommendedBy_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZ_MgrLPOps_NotRecommendedBy_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_AD_User getZZ_MgrLPOps_RecommendedBy() throws RuntimeException
	{
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_ID)
			.getPO(getZZ_MgrLPOps_RecommendedBy_ID(), get_TrxName());
	}

	/** Set Mgr - LP Ops Recommended By.
		@param ZZ_MgrLPOps_RecommendedBy_ID Mgr - LP Ops Recommended By
	*/
	public void setZZ_MgrLPOps_RecommendedBy_ID (int ZZ_MgrLPOps_RecommendedBy_ID)
	{
		if (ZZ_MgrLPOps_RecommendedBy_ID < 1)
			set_Value (COLUMNNAME_ZZ_MgrLPOps_RecommendedBy_ID, null);
		else
			set_Value (COLUMNNAME_ZZ_MgrLPOps_RecommendedBy_ID, Integer.valueOf(ZZ_MgrLPOps_RecommendedBy_ID));
	}

	/** Get Mgr - LP Ops Recommended By.
		@return Mgr - LP Ops Recommended By	  */
	public int getZZ_MgrLPOps_RecommendedBy_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZ_MgrLPOps_RecommendedBy_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Program Master Data.
		@param ZZ_Program_Master_Data_ID Program Master Data
	*/
	public void setZZ_Program_Master_Data_ID (int ZZ_Program_Master_Data_ID)
	{
		if (ZZ_Program_Master_Data_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZ_Program_Master_Data_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZ_Program_Master_Data_ID, Integer.valueOf(ZZ_Program_Master_Data_ID));
	}

	/** Get Program Master Data.
		@return Program Master Data	  */
	public int getZZ_Program_Master_Data_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZ_Program_Master_Data_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Reason.
		@param ZZ_Reason Reason
	*/
	public void setZZ_Reason (String ZZ_Reason)
	{
		set_Value (COLUMNNAME_ZZ_Reason, ZZ_Reason);
	}

	/** Get Reason.
		@return Reason	  */
	public String getZZ_Reason()
	{
		return (String)get_Value(COLUMNNAME_ZZ_Reason);
	}

	public org.compiere.model.I_C_BPartner getZZ_SDP() throws RuntimeException
	{
		return (org.compiere.model.I_C_BPartner)MTable.get(getCtx(), org.compiere.model.I_C_BPartner.Table_ID)
			.getPO(getZZ_SDP_ID(), get_TrxName());
	}

	/** Set SDP.
		@param ZZ_SDP_ID Lead Skills Development Provider
	*/
	public void setZZ_SDP_ID (int ZZ_SDP_ID)
	{
		if (ZZ_SDP_ID < 1)
			set_Value (COLUMNNAME_ZZ_SDP_ID, null);
		else
			set_Value (COLUMNNAME_ZZ_SDP_ID, Integer.valueOf(ZZ_SDP_ID));
	}

	/** Get SDP.
		@return Lead Skills Development Provider
	  */
	public int getZZ_SDP_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZ_SDP_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}