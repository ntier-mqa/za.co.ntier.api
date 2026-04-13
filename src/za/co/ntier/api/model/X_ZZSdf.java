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

/** Generated Model for ZZSdf
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="ZZSdf")
public class X_ZZSdf extends PO implements I_ZZSdf, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20260413L;

    /** Standard Constructor */
    public X_ZZSdf (Properties ctx, int ZZSdf_ID, String trxName)
    {
      super (ctx, ZZSdf_ID, trxName);
      /** if (ZZSdf_ID == 0)
        {
			setZZSdf_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZSdf (Properties ctx, int ZZSdf_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZSdf_ID, trxName, virtualColumns);
      /** if (ZZSdf_ID == 0)
        {
			setZZSdf_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZSdf (Properties ctx, String ZZSdf_UU, String trxName)
    {
      super (ctx, ZZSdf_UU, trxName);
      /** if (ZZSdf_UU == null)
        {
			setZZSdf_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZSdf (Properties ctx, String ZZSdf_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZSdf_UU, trxName, virtualColumns);
      /** if (ZZSdf_UU == null)
        {
			setZZSdf_ID (0);
        } */
    }

    /** Load Constructor */
    public X_ZZSdf (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_ZZSdf[")
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

	/** African = Afr */
	public static final String ZZEQUITY_African = "Afr";
	/** Coloured = Col */
	public static final String ZZEQUITY_Coloured = "Col";
	/** Indian = Ind */
	public static final String ZZEQUITY_Indian = "Ind";
	/** White = Wh */
	public static final String ZZEQUITY_White = "Wh";
	/** Set Equity.
		@param ZZEquity Equity
	*/
	public void setZZEquity (String ZZEquity)
	{

		set_Value (COLUMNNAME_ZZEquity, ZZEquity);
	}

	/** Get Equity.
		@return Equity	  */
	public String getZZEquity()
	{
		return (String)get_Value(COLUMNNAME_ZZEquity);
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

	/** Famale = F */
	public static final String ZZGENDER_Famale = "F";
	/** Male = M */
	public static final String ZZGENDER_Male = "M";
	/** Other = O */
	public static final String ZZGENDER_Other = "O";
	/** Set Gender.
		@param ZZGender Gender
	*/
	public void setZZGender (String ZZGender)
	{

		set_Value (COLUMNNAME_ZZGender, ZZGender);
	}

	/** Get Gender.
		@return Gender	  */
	public String getZZGender()
	{
		return (String)get_Value(COLUMNNAME_ZZGender);
	}

	/** Set General Comments.
		@param ZZGeneralComments General Comments
	*/
	public void setZZGeneralComments (String ZZGeneralComments)
	{
		set_Value (COLUMNNAME_ZZGeneralComments, ZZGeneralComments);
	}

	/** Get General Comments.
		@return General Comments	  */
	public String getZZGeneralComments()
	{
		return (String)get_Value(COLUMNNAME_ZZGeneralComments);
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

	/** Set Initials.
		@param ZZInitials Initials
	*/
	public void setZZInitials (String ZZInitials)
	{
		set_Value (COLUMNNAME_ZZInitials, ZZInitials);
	}

	/** Get Initials.
		@return Initials	  */
	public String getZZInitials()
	{
		return (String)get_Value(COLUMNNAME_ZZInitials);
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

	/** Set Sdf.
		@param ZZSdf_ID Sdf
	*/
	public void setZZSdf_ID (int ZZSdf_ID)
	{
		if (ZZSdf_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZSdf_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZSdf_ID, Integer.valueOf(ZZSdf_ID));
	}

	/** Get Sdf.
		@return Sdf	  */
	public int getZZSdf_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZSdf_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set ZZSdf_UU.
		@param ZZSdf_UU ZZSdf_UU
	*/
	public void setZZSdf_UU (String ZZSdf_UU)
	{
		set_Value (COLUMNNAME_ZZSdf_UU, ZZSdf_UU);
	}

	/** Get ZZSdf_UU.
		@return ZZSdf_UU	  */
	public String getZZSdf_UU()
	{
		return (String)get_Value(COLUMNNAME_ZZSdf_UU);
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
	/** Approved = AP */
	public static final String ZZ_DOCSTATUS_Approved = "AP";
	/** Prepared for CEO = CF */
	public static final String ZZ_DOCSTATUS_PreparedForCEO = "CF";
	/** Completed = CO */
	public static final String ZZ_DOCSTATUS_Completed = "CO";
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
	/** Recommended By CEO = R4 */
	public static final String ZZ_DOCSTATUS_RecommendedByCEO = "R4";
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

	/** Set ID No.
		@param ZZ_ID_Passport_No ID No
	*/
	public void setZZ_ID_Passport_No (String ZZ_ID_Passport_No)
	{
		throw new IllegalArgumentException ("ZZ_ID_Passport_No is virtual column");	}

	/** Get ID No.
		@return ID No	  */
	public String getZZ_ID_Passport_No()
	{
		return (String)get_Value(COLUMNNAME_ZZ_ID_Passport_No);
	}

	public I_ZZ_LI_CitizenResidentialStatus getZZ_LI_CitizenResidentialStatus() throws RuntimeException
	{
		return (I_ZZ_LI_CitizenResidentialStatus)MTable.get(getCtx(), I_ZZ_LI_CitizenResidentialStatus.Table_ID)
			.getPO(getZZ_LI_CitizenResidentialStatus_ID(), get_TrxName());
	}

	/** Set Citizen Residential Status.
		@param ZZ_LI_CitizenResidentialStatus_ID Citizen Residential Status
	*/
	public void setZZ_LI_CitizenResidentialStatus_ID (int ZZ_LI_CitizenResidentialStatus_ID)
	{
		if (ZZ_LI_CitizenResidentialStatus_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZ_LI_CitizenResidentialStatus_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZ_LI_CitizenResidentialStatus_ID, Integer.valueOf(ZZ_LI_CitizenResidentialStatus_ID));
	}

	/** Get Citizen Residential Status.
		@return Citizen Residential Status	  */
	public int getZZ_LI_CitizenResidentialStatus_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZ_LI_CitizenResidentialStatus_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_ZZ_No_Yes_Ref getZZ_LI_Disability() throws RuntimeException
	{
		return (I_ZZ_No_Yes_Ref)MTable.get(getCtx(), I_ZZ_No_Yes_Ref.Table_ID)
			.getPO(getZZ_LI_Disability_ID(), get_TrxName());
	}

	/** Set Disability.
		@param ZZ_LI_Disability_ID Disability
	*/
	public void setZZ_LI_Disability_ID (int ZZ_LI_Disability_ID)
	{
		if (ZZ_LI_Disability_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZ_LI_Disability_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZ_LI_Disability_ID, Integer.valueOf(ZZ_LI_Disability_ID));
	}

	/** Get Disability.
		@return Disability	  */
	public int getZZ_LI_Disability_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZ_LI_Disability_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	public I_ZZ_LI_HomeLanguage getZZ_LI_HomeLanguage() throws RuntimeException
	{
		return (I_ZZ_LI_HomeLanguage)MTable.get(getCtx(), I_ZZ_LI_HomeLanguage.Table_ID)
			.getPO(getZZ_LI_HomeLanguage_ID(), get_TrxName());
	}

	/** Set Home Language.
		@param ZZ_LI_HomeLanguage_ID Home Language
	*/
	public void setZZ_LI_HomeLanguage_ID (int ZZ_LI_HomeLanguage_ID)
	{
		if (ZZ_LI_HomeLanguage_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZ_LI_HomeLanguage_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZ_LI_HomeLanguage_ID, Integer.valueOf(ZZ_LI_HomeLanguage_ID));
	}

	/** Get Home Language.
		@return Home Language	  */
	public int getZZ_LI_HomeLanguage_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZ_LI_HomeLanguage_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_ZZ_LI_SocioEconomicStatus getZZ_LI_SocioEconomicStatus() throws RuntimeException
	{
		return (I_ZZ_LI_SocioEconomicStatus)MTable.get(getCtx(), I_ZZ_LI_SocioEconomicStatus.Table_ID)
			.getPO(getZZ_LI_SocioEconomicStatus_ID(), get_TrxName());
	}

	/** Set Socio Economic Status.
		@param ZZ_LI_SocioEconomicStatus_ID Socio Economic Status
	*/
	public void setZZ_LI_SocioEconomicStatus_ID (int ZZ_LI_SocioEconomicStatus_ID)
	{
		if (ZZ_LI_SocioEconomicStatus_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZ_LI_SocioEconomicStatus_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZ_LI_SocioEconomicStatus_ID, Integer.valueOf(ZZ_LI_SocioEconomicStatus_ID));
	}

	/** Get Socio Economic Status.
		@return Socio Economic Status	  */
	public int getZZ_LI_SocioEconomicStatus_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZ_LI_SocioEconomicStatus_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_ZZ_Nationality getZZ_Nationality() throws RuntimeException
	{
		return (I_ZZ_Nationality)MTable.get(getCtx(), I_ZZ_Nationality.Table_ID)
			.getPO(getZZ_Nationality_ID(), get_TrxName());
	}

	/** Set Nationality.
		@param ZZ_Nationality_ID Nationality
	*/
	public void setZZ_Nationality_ID (int ZZ_Nationality_ID)
	{
		if (ZZ_Nationality_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZ_Nationality_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZ_Nationality_ID, Integer.valueOf(ZZ_Nationality_ID));
	}

	/** Get Nationality.
		@return Nationality	  */
	public int getZZ_Nationality_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZ_Nationality_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Passport No.
		@param ZZ_Passport_No Passport No
	*/
	public void setZZ_Passport_No (String ZZ_Passport_No)
	{
		set_Value (COLUMNNAME_ZZ_Passport_No, ZZ_Passport_No);
	}

	/** Get Passport No.
		@return Passport No	  */
	public String getZZ_Passport_No()
	{
		return (String)get_Value(COLUMNNAME_ZZ_Passport_No);
	}
}