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

/** Generated Model for ZZSdfOrganisation_v
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="ZZSdfOrganisation_v")
public class X_ZZSdfOrganisation_v extends PO implements I_ZZSdfOrganisation_v, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20260226L;

    /** Standard Constructor */
    public X_ZZSdfOrganisation_v (Properties ctx, int ZZSdfOrganisation_v_ID, String trxName)
    {
      super (ctx, ZZSdfOrganisation_v_ID, trxName);
      /** if (ZZSdfOrganisation_v_ID == 0)
        {
			setZZActingForEmployer (false);
// N
        } */
    }

    /** Standard Constructor */
    public X_ZZSdfOrganisation_v (Properties ctx, int ZZSdfOrganisation_v_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZSdfOrganisation_v_ID, trxName, virtualColumns);
      /** if (ZZSdfOrganisation_v_ID == 0)
        {
			setZZActingForEmployer (false);
// N
        } */
    }

    /** Standard Constructor */
    public X_ZZSdfOrganisation_v (Properties ctx, String ZZSdfOrganisation_v_UU, String trxName)
    {
      super (ctx, ZZSdfOrganisation_v_UU, trxName);
      /** if (ZZSdfOrganisation_v_UU == null)
        {
			setZZActingForEmployer (false);
// N
        } */
    }

    /** Standard Constructor */
    public X_ZZSdfOrganisation_v (Properties ctx, String ZZSdfOrganisation_v_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZSdfOrganisation_v_UU, trxName, virtualColumns);
      /** if (ZZSdfOrganisation_v_UU == null)
        {
			setZZActingForEmployer (false);
// N
        } */
    }

    /** Load Constructor */
    public X_ZZSdfOrganisation_v (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_ZZSdfOrganisation_v[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public org.compiere.model.I_AD_User getAD_User() throws RuntimeException
	{
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_ID)
			.getPO(getAD_User_ID(), get_TrxName());
	}

	/** Set User/Contact.
		@param AD_User_ID User within the system - Internal or Business Partner Contact
	*/
	public void setAD_User_ID (int AD_User_ID)
	{
		if (AD_User_ID < 1)
			set_ValueNoCheck (COLUMNNAME_AD_User_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_AD_User_ID, Integer.valueOf(AD_User_ID));
	}

	/** Get User/Contact.
		@return User within the system - Internal or Business Partner Contact
	  */
	public int getAD_User_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_User_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	/** Set Organization Name.
		@param OrgName Name of the Organization
	*/
	public void setOrgName (String OrgName)
	{
		set_ValueNoCheck (COLUMNNAME_OrgName, OrgName);
	}

	/** Get Organization Name.
		@return Name of the Organization
	  */
	public String getOrgName()
	{
		return (String)get_Value(COLUMNNAME_OrgName);
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

	/** Set Accredited Training Provider.
		@param ZZAccreditedTrainingProvider Accredited Training Provider
	*/
	public void setZZAccreditedTrainingProvider (String ZZAccreditedTrainingProvider)
	{
		set_Value (COLUMNNAME_ZZAccreditedTrainingProvider, ZZAccreditedTrainingProvider);
	}

	/** Get Accredited Training Provider.
		@return Accredited Training Provider	  */
	public String getZZAccreditedTrainingProvider()
	{
		return (String)get_Value(COLUMNNAME_ZZAccreditedTrainingProvider);
	}

	/** Set Acting For Employer.
		@param ZZActingForEmployer Consultant acting for Employer?
	*/
	public void setZZActingForEmployer (boolean ZZActingForEmployer)
	{
		set_Value (COLUMNNAME_ZZActingForEmployer, Boolean.valueOf(ZZActingForEmployer));
	}

	/** Get Acting For Employer.
		@return Consultant acting for Employer?
	  */
	public boolean isZZActingForEmployer()
	{
		Object oo = get_Value(COLUMNNAME_ZZActingForEmployer);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Nominated by employees = Employees */
	public static final String ZZAPPOINTMENTPROCEDURE_NominatedByEmployees = "Employees";
	/** Appointed by employer = Employer */
	public static final String ZZAPPOINTMENTPROCEDURE_AppointedByEmployer = "Employer";
	/** Other, If other please specify = Other */
	public static final String ZZAPPOINTMENTPROCEDURE_OtherIfOtherPleaseSpecify = "Other";
	/** Self-appointed = Self */
	public static final String ZZAPPOINTMENTPROCEDURE_Self_Appointed = "Self";
	/** Set Appointment Procedure.
		@param ZZAppointmentProcedure Please indicate method of appointment to SDF position
	*/
	public void setZZAppointmentProcedure (String ZZAppointmentProcedure)
	{

		set_Value (COLUMNNAME_ZZAppointmentProcedure, ZZAppointmentProcedure);
	}

	/** Get Appointment Procedure.
		@return Please indicate method of appointment to SDF position
	  */
	public String getZZAppointmentProcedure()
	{
		return (String)get_Value(COLUMNNAME_ZZAppointmentProcedure);
	}

	/** Set Current Occupation.
		@param ZZCurrentOccupation Current Occupation
	*/
	public void setZZCurrentOccupation (String ZZCurrentOccupation)
	{
		set_Value (COLUMNNAME_ZZCurrentOccupation, ZZCurrentOccupation);
	}

	/** Get Current Occupation.
		@return Current Occupation	  */
	public String getZZCurrentOccupation()
	{
		return (String)get_Value(COLUMNNAME_ZZCurrentOccupation);
	}

	/** Set Experience (Years).
		@param ZZExperience Experience (Years)
	*/
	public void setZZExperience (int ZZExperience)
	{
		set_Value (COLUMNNAME_ZZExperience, Integer.valueOf(ZZExperience));
	}

	/** Get Experience (Years).
		@return Experience (Years)	  */
	public int getZZExperience()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZExperience);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	/** Set Highest Education Description.
		@param ZZHighestEducationDesc Highest Education Description
	*/
	public void setZZHighestEducationDesc (String ZZHighestEducationDesc)
	{
		set_Value (COLUMNNAME_ZZHighestEducationDesc, ZZHighestEducationDesc);
	}

	/** Get Highest Education Description.
		@return Highest Education Description	  */
	public String getZZHighestEducationDesc()
	{
		return (String)get_Value(COLUMNNAME_ZZHighestEducationDesc);
	}

	/** Set Middle Name.
		@param ZZMiddleName Middle Name
	*/
	public void setZZMiddleName (String ZZMiddleName)
	{
		set_Value (COLUMNNAME_ZZMiddleName, ZZMiddleName);
	}

	/** Get Middle Name.
		@return Middle Name	  */
	public String getZZMiddleName()
	{
		return (String)get_Value(COLUMNNAME_ZZMiddleName);
	}

	/** Group of organisations = Group */
	public static final String ZZSDFFUNCTION_GroupOfOrganisations = "Group";
	/** Multiple organisations = Multiple */
	public static final String ZZSDFFUNCTION_MultipleOrganisations = "Multiple";
	/** Multiple branch of an organisation = Multiple branch */
	public static final String ZZSDFFUNCTION_MultipleBranchOfAnOrganisation = "Multiple branch";
	/** Single establishment = Single */
	public static final String ZZSDFFUNCTION_SingleEstablishment = "Single";
	/** Single branch of an organisation = Single branch */
	public static final String ZZSDFFUNCTION_SingleBranchOfAnOrganisation = "Single branch";
	/** Set Sdf Function.
		@param ZZSdfFunction Will you perform your SDF function in respect of
	*/
	public void setZZSdfFunction (String ZZSdfFunction)
	{

		set_Value (COLUMNNAME_ZZSdfFunction, ZZSdfFunction);
	}

	/** Get Sdf Function.
		@return Will you perform your SDF function in respect of
	  */
	public String getZZSdfFunction()
	{
		return (String)get_Value(COLUMNNAME_ZZSdfFunction);
	}

	public I_ZZSdfOrganisation getZZSdfOrganisation() throws RuntimeException
	{
		return (I_ZZSdfOrganisation)MTable.get(getCtx(), I_ZZSdfOrganisation.Table_ID)
			.getPO(getZZSdfOrganisation_ID(), get_TrxName());
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

	/** Set Sdf Organisation View.
		@param ZZSdfOrganisation_v_ID Sdf Organisation View
	*/
	public void setZZSdfOrganisation_v_ID (int ZZSdfOrganisation_v_ID)
	{
		if (ZZSdfOrganisation_v_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZSdfOrganisation_v_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZSdfOrganisation_v_ID, Integer.valueOf(ZZSdfOrganisation_v_ID));
	}

	/** Get Sdf Organisation View.
		@return Sdf Organisation View	  */
	public int getZZSdfOrganisation_v_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZSdfOrganisation_v_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Sdf Organisation View UU.
		@param ZZSdfOrganisation_v_UU Sdf Organisation View UU
	*/
	public void setZZSdfOrganisation_v_UU (String ZZSdfOrganisation_v_UU)
	{
		set_ValueNoCheck (COLUMNNAME_ZZSdfOrganisation_v_UU, ZZSdfOrganisation_v_UU);
	}

	/** Get Sdf Organisation View UU.
		@return Sdf Organisation View UU	  */
	public String getZZSdfOrganisation_v_UU()
	{
		return (String)get_Value(COLUMNNAME_ZZSdfOrganisation_v_UU);
	}

	/** Primary = Primary */
	public static final String ZZSDFROLETYPE_Primary = "Primary";
	/** Secondary = Secondary */
	public static final String ZZSDFROLETYPE_Secondary = "Secondary";
	/** Set Sdf Role Type.
		@param ZZSdfRoleType Sdf Role Type
	*/
	public void setZZSdfRoleType (String ZZSdfRoleType)
	{

		set_Value (COLUMNNAME_ZZSdfRoleType, ZZSdfRoleType);
	}

	/** Get Sdf Role Type.
		@return Sdf Role Type	  */
	public String getZZSdfRoleType()
	{
		return (String)get_Value(COLUMNNAME_ZZSdfRoleType);
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

	/** Set Years In Occupation.
		@param ZZYearsInOccupation Years In Occupation
	*/
	public void setZZYearsInOccupation (int ZZYearsInOccupation)
	{
		set_Value (COLUMNNAME_ZZYearsInOccupation, Integer.valueOf(ZZYearsInOccupation));
	}

	/** Get Years In Occupation.
		@return Years In Occupation	  */
	public int getZZYearsInOccupation()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZYearsInOccupation);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_AD_User getZZ_Approved() throws RuntimeException
	{
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_ID)
			.getPO(getZZ_Approved_ID(), get_TrxName());
	}

	/** Set Approved By.
		@param ZZ_Approved_ID Approved By
	*/
	public void setZZ_Approved_ID (int ZZ_Approved_ID)
	{
		if (ZZ_Approved_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZ_Approved_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZ_Approved_ID, Integer.valueOf(ZZ_Approved_ID));
	}

	/** Get Approved By.
		@return Approved By	  */
	public int getZZ_Approved_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZ_Approved_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Date Approved.
		@param ZZ_Date_Approved Date Approved
	*/
	public void setZZ_Date_Approved (Timestamp ZZ_Date_Approved)
	{
		set_ValueNoCheck (COLUMNNAME_ZZ_Date_Approved, ZZ_Date_Approved);
	}

	/** Get Date Approved.
		@return Date Approved	  */
	public Timestamp getZZ_Date_Approved()
	{
		return (Timestamp)get_Value(COLUMNNAME_ZZ_Date_Approved);
	}

	/** Set Date Rejected.
		@param ZZ_Date_Rejected Date Rejected
	*/
	public void setZZ_Date_Rejected (Timestamp ZZ_Date_Rejected)
	{
		set_ValueNoCheck (COLUMNNAME_ZZ_Date_Rejected, ZZ_Date_Rejected);
	}

	/** Get Date Rejected.
		@return Date Rejected	  */
	public Timestamp getZZ_Date_Rejected()
	{
		return (Timestamp)get_Value(COLUMNNAME_ZZ_Date_Rejected);
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
	/** Approved = AP */
	public static final String ZZ_DOCSTATUS_Approved = "AP";
	/** Completed = CO */
	public static final String ZZ_DOCSTATUS_Completed = "CO";
	/** Draft = DR */
	public static final String ZZ_DOCSTATUS_Draft = "DR";
	/** Evaluated = EV */
	public static final String ZZ_DOCSTATUS_Evaluated = "EV";
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
	/** Not Recommended = NR */
	public static final String ZZ_DOCSTATUS_NotRecommended = "NR";
	/** Not Approved by Snr Admin Finance = NS */
	public static final String ZZ_DOCSTATUS_NotApprovedBySnrAdminFinance = "NS";
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
	/** Recommended for Approval = RA */
	public static final String ZZ_DOCSTATUS_RecommendedForApproval = "RA";
	/** Recommended = RC */
	public static final String ZZ_DOCSTATUS_Recommended = "RC";
	/** Recommended By Senior Mgr SDR = RD */
	public static final String ZZ_DOCSTATUS_RecommendedBySeniorMgrSDR = "RD";
	/** Recommended for Evaluation = RE */
	public static final String ZZ_DOCSTATUS_RecommendedForEvaluation = "RE";
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
	/** Delinked = UnSdfOrg */
	public static final String ZZ_DOCSTATUS_Delinked = "UnSdfOrg";
	/** Set Document Status.
		@param ZZ_DocStatus Document Status
	*/
	public void setZZ_DocStatus (String ZZ_DocStatus)
	{

		set_ValueNoCheck (COLUMNNAME_ZZ_DocStatus, ZZ_DocStatus);
	}

	/** Get Document Status.
		@return Document Status	  */
	public String getZZ_DocStatus()
	{
		return (String)get_Value(COLUMNNAME_ZZ_DocStatus);
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

	public I_ZZ_LI_HighestEducation getZZ_LI_HighestEducation() throws RuntimeException
	{
		return (I_ZZ_LI_HighestEducation)MTable.get(getCtx(), I_ZZ_LI_HighestEducation.Table_ID)
			.getPO(getZZ_LI_HighestEducation_ID(), get_TrxName());
	}

	/** Set Highest Education.
		@param ZZ_LI_HighestEducation_ID Highest Education
	*/
	public void setZZ_LI_HighestEducation_ID (int ZZ_LI_HighestEducation_ID)
	{
		if (ZZ_LI_HighestEducation_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZ_LI_HighestEducation_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZ_LI_HighestEducation_ID, Integer.valueOf(ZZ_LI_HighestEducation_ID));
	}

	/** Get Highest Education.
		@return Highest Education	  */
	public int getZZ_LI_HighestEducation_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZ_LI_HighestEducation_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_AD_User getZZ_Rejected() throws RuntimeException
	{
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_ID)
			.getPO(getZZ_Rejected_ID(), get_TrxName());
	}

	/** Set Rejected ID.
		@param ZZ_Rejected_ID Rejected ID
	*/
	public void setZZ_Rejected_ID (int ZZ_Rejected_ID)
	{
		if (ZZ_Rejected_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZ_Rejected_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZ_Rejected_ID, Integer.valueOf(ZZ_Rejected_ID));
	}

	/** Get Rejected ID.
		@return Rejected ID	  */
	public int getZZ_Rejected_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZ_Rejected_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
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
}