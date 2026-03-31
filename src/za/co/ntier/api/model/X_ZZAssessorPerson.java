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

/** Generated Model for ZZAssessorPerson
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="ZZAssessorPerson")
public class X_ZZAssessorPerson extends PO implements I_ZZAssessorPerson, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20260327L;

    /** Standard Constructor */
    public X_ZZAssessorPerson (Properties ctx, int ZZAssessorPerson_ID, String trxName)
    {
      super (ctx, ZZAssessorPerson_ID, trxName);
      /** if (ZZAssessorPerson_ID == 0)
        {
			setZZAssessorPerson_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZAssessorPerson (Properties ctx, int ZZAssessorPerson_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZAssessorPerson_ID, trxName, virtualColumns);
      /** if (ZZAssessorPerson_ID == 0)
        {
			setZZAssessorPerson_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZAssessorPerson (Properties ctx, String ZZAssessorPerson_UU, String trxName)
    {
      super (ctx, ZZAssessorPerson_UU, trxName);
      /** if (ZZAssessorPerson_UU == null)
        {
			setZZAssessorPerson_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZAssessorPerson (Properties ctx, String ZZAssessorPerson_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZAssessorPerson_UU, trxName, virtualColumns);
      /** if (ZZAssessorPerson_UU == null)
        {
			setZZAssessorPerson_ID (0);
        } */
    }

    /** Load Constructor */
    public X_ZZAssessorPerson (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_ZZAssessorPerson[")
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

	/** Set Assessor Person.
		@param ZZAssessorPerson_ID Assessor Person
	*/
	public void setZZAssessorPerson_ID (int ZZAssessorPerson_ID)
	{
		if (ZZAssessorPerson_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZAssessorPerson_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZAssessorPerson_ID, Integer.valueOf(ZZAssessorPerson_ID));
	}

	/** Get Assessor Person.
		@return Assessor Person	  */
	public int getZZAssessorPerson_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZAssessorPerson_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set ZZAssessorPerson_UU.
		@param ZZAssessorPerson_UU ZZAssessorPerson_UU
	*/
	public void setZZAssessorPerson_UU (String ZZAssessorPerson_UU)
	{
		set_Value (COLUMNNAME_ZZAssessorPerson_UU, ZZAssessorPerson_UU);
	}

	/** Get ZZAssessorPerson_UU.
		@return ZZAssessorPerson_UU	  */
	public String getZZAssessorPerson_UU()
	{
		return (String)get_Value(COLUMNNAME_ZZAssessorPerson_UU);
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

	/** A lot of difficulty = A lot of difficulty */
	public static final String ZZHEALTHCOMMUNICATING_ALotOfDifficulty = "A lot of difficulty";
	/** Cannot do at all = Cannot do at all */
	public static final String ZZHEALTHCOMMUNICATING_CannotDoAtAll = "Cannot do at all";
	/** Cannot yet be determind = Cannot yet be determind */
	public static final String ZZHEALTHCOMMUNICATING_CannotYetBeDetermind = "Cannot yet be determind";
	/** Former difficulty - none now = Former difficulty - none now */
	public static final String ZZHEALTHCOMMUNICATING_FormerDifficulty_NoneNow = "Former difficulty - none now";
	/** May be part of multiple difficultys (TBC) = May be part of multiple difficultys (TBC) */
	public static final String ZZHEALTHCOMMUNICATING_MayBePartOfMultipleDifficultysTBC = "May be part of multiple difficultys (TBC)";
	/** May have difficulty (TBC) = May have difficulty (TBC) */
	public static final String ZZHEALTHCOMMUNICATING_MayHaveDifficultyTBC = "May have difficulty (TBC)";
	/** No difficulty = No difficulty */
	public static final String ZZHEALTHCOMMUNICATING_NoDifficulty = "No difficulty";
	/** Some difficulty = Some difficulty */
	public static final String ZZHEALTHCOMMUNICATING_SomeDifficulty = "Some difficulty";
	/** Set Communicating.
		@param ZZHealthCommunicating Health Function Communicating
	*/
	public void setZZHealthCommunicating (String ZZHealthCommunicating)
	{

		set_Value (COLUMNNAME_ZZHealthCommunicating, ZZHealthCommunicating);
	}

	/** Get Communicating.
		@return Health Function Communicating
	  */
	public String getZZHealthCommunicating()
	{
		return (String)get_Value(COLUMNNAME_ZZHealthCommunicating);
	}

	/** A lot of difficulty = A lot of difficulty */
	public static final String ZZHEALTHHEARING_ALotOfDifficulty = "A lot of difficulty";
	/** Cannot do at all = Cannot do at all */
	public static final String ZZHEALTHHEARING_CannotDoAtAll = "Cannot do at all";
	/** Cannot yet be determind = Cannot yet be determind */
	public static final String ZZHEALTHHEARING_CannotYetBeDetermind = "Cannot yet be determind";
	/** Former difficulty - none now = Former difficulty - none now */
	public static final String ZZHEALTHHEARING_FormerDifficulty_NoneNow = "Former difficulty - none now";
	/** May be part of multiple difficultys (TBC) = May be part of multiple difficultys (TBC) */
	public static final String ZZHEALTHHEARING_MayBePartOfMultipleDifficultysTBC = "May be part of multiple difficultys (TBC)";
	/** May have difficulty (TBC) = May have difficulty (TBC) */
	public static final String ZZHEALTHHEARING_MayHaveDifficultyTBC = "May have difficulty (TBC)";
	/** No difficulty = No difficulty */
	public static final String ZZHEALTHHEARING_NoDifficulty = "No difficulty";
	/** Some difficulty = Some difficulty */
	public static final String ZZHEALTHHEARING_SomeDifficulty = "Some difficulty";
	/** Set Hearing.
		@param ZZHealthHearing Health Function Hearing
	*/
	public void setZZHealthHearing (String ZZHealthHearing)
	{

		set_Value (COLUMNNAME_ZZHealthHearing, ZZHealthHearing);
	}

	/** Get Hearing.
		@return Health Function Hearing
	  */
	public String getZZHealthHearing()
	{
		return (String)get_Value(COLUMNNAME_ZZHealthHearing);
	}

	/** A lot of difficulty = A lot of difficulty */
	public static final String ZZHEALTHREMEMBERING_ALotOfDifficulty = "A lot of difficulty";
	/** Cannot do at all = Cannot do at all */
	public static final String ZZHEALTHREMEMBERING_CannotDoAtAll = "Cannot do at all";
	/** Cannot yet be determind = Cannot yet be determind */
	public static final String ZZHEALTHREMEMBERING_CannotYetBeDetermind = "Cannot yet be determind";
	/** Former difficulty - none now = Former difficulty - none now */
	public static final String ZZHEALTHREMEMBERING_FormerDifficulty_NoneNow = "Former difficulty - none now";
	/** May be part of multiple difficultys (TBC) = May be part of multiple difficultys (TBC) */
	public static final String ZZHEALTHREMEMBERING_MayBePartOfMultipleDifficultysTBC = "May be part of multiple difficultys (TBC)";
	/** May have difficulty (TBC) = May have difficulty (TBC) */
	public static final String ZZHEALTHREMEMBERING_MayHaveDifficultyTBC = "May have difficulty (TBC)";
	/** No difficulty = No difficulty */
	public static final String ZZHEALTHREMEMBERING_NoDifficulty = "No difficulty";
	/** Some difficulty = Some difficulty */
	public static final String ZZHEALTHREMEMBERING_SomeDifficulty = "Some difficulty";
	/** Set Remembering.
		@param ZZHealthRemembering Health Function Remembering
	*/
	public void setZZHealthRemembering (String ZZHealthRemembering)
	{

		set_Value (COLUMNNAME_ZZHealthRemembering, ZZHealthRemembering);
	}

	/** Get Remembering.
		@return Health Function Remembering
	  */
	public String getZZHealthRemembering()
	{
		return (String)get_Value(COLUMNNAME_ZZHealthRemembering);
	}

	/** A lot of difficulty = A lot of difficulty */
	public static final String ZZHEALTHSEEING_ALotOfDifficulty = "A lot of difficulty";
	/** Cannot do at all = Cannot do at all */
	public static final String ZZHEALTHSEEING_CannotDoAtAll = "Cannot do at all";
	/** Cannot yet be determind = Cannot yet be determind */
	public static final String ZZHEALTHSEEING_CannotYetBeDetermind = "Cannot yet be determind";
	/** Former difficulty - none now = Former difficulty - none now */
	public static final String ZZHEALTHSEEING_FormerDifficulty_NoneNow = "Former difficulty - none now";
	/** May be part of multiple difficultys (TBC) = May be part of multiple difficultys (TBC) */
	public static final String ZZHEALTHSEEING_MayBePartOfMultipleDifficultysTBC = "May be part of multiple difficultys (TBC)";
	/** May have difficulty (TBC) = May have difficulty (TBC) */
	public static final String ZZHEALTHSEEING_MayHaveDifficultyTBC = "May have difficulty (TBC)";
	/** No difficulty = No difficulty */
	public static final String ZZHEALTHSEEING_NoDifficulty = "No difficulty";
	/** Some difficulty = Some difficulty */
	public static final String ZZHEALTHSEEING_SomeDifficulty = "Some difficulty";
	/** Set Seeing.
		@param ZZHealthSeeing Health Function Seeing
	*/
	public void setZZHealthSeeing (String ZZHealthSeeing)
	{

		set_Value (COLUMNNAME_ZZHealthSeeing, ZZHealthSeeing);
	}

	/** Get Seeing.
		@return Health Function Seeing
	  */
	public String getZZHealthSeeing()
	{
		return (String)get_Value(COLUMNNAME_ZZHealthSeeing);
	}

	/** A lot of difficulty = A lot of difficulty */
	public static final String ZZHEALTHSELFCARE_ALotOfDifficulty = "A lot of difficulty";
	/** Cannot do at all = Cannot do at all */
	public static final String ZZHEALTHSELFCARE_CannotDoAtAll = "Cannot do at all";
	/** Cannot yet be determind = Cannot yet be determind */
	public static final String ZZHEALTHSELFCARE_CannotYetBeDetermind = "Cannot yet be determind";
	/** Former difficulty - none now = Former difficulty - none now */
	public static final String ZZHEALTHSELFCARE_FormerDifficulty_NoneNow = "Former difficulty - none now";
	/** May be part of multiple difficultys (TBC) = May be part of multiple difficultys (TBC) */
	public static final String ZZHEALTHSELFCARE_MayBePartOfMultipleDifficultysTBC = "May be part of multiple difficultys (TBC)";
	/** May have difficulty (TBC) = May have difficulty (TBC) */
	public static final String ZZHEALTHSELFCARE_MayHaveDifficultyTBC = "May have difficulty (TBC)";
	/** No difficulty = No difficulty */
	public static final String ZZHEALTHSELFCARE_NoDifficulty = "No difficulty";
	/** Some difficulty = Some difficulty */
	public static final String ZZHEALTHSELFCARE_SomeDifficulty = "Some difficulty";
	/** Set Selfcare.
		@param ZZHealthSelfcare Health Function Selfcare
	*/
	public void setZZHealthSelfcare (String ZZHealthSelfcare)
	{

		set_Value (COLUMNNAME_ZZHealthSelfcare, ZZHealthSelfcare);
	}

	/** Get Selfcare.
		@return Health Function Selfcare
	  */
	public String getZZHealthSelfcare()
	{
		return (String)get_Value(COLUMNNAME_ZZHealthSelfcare);
	}

	/** A lot of difficulty = A lot of difficulty */
	public static final String ZZHEALTHWALKING_ALotOfDifficulty = "A lot of difficulty";
	/** Cannot do at all = Cannot do at all */
	public static final String ZZHEALTHWALKING_CannotDoAtAll = "Cannot do at all";
	/** Cannot yet be determind = Cannot yet be determind */
	public static final String ZZHEALTHWALKING_CannotYetBeDetermind = "Cannot yet be determind";
	/** Former difficulty - none now = Former difficulty - none now */
	public static final String ZZHEALTHWALKING_FormerDifficulty_NoneNow = "Former difficulty - none now";
	/** May be part of multiple difficultys (TBC) = May be part of multiple difficultys (TBC) */
	public static final String ZZHEALTHWALKING_MayBePartOfMultipleDifficultysTBC = "May be part of multiple difficultys (TBC)";
	/** May have difficulty (TBC) = May have difficulty (TBC) */
	public static final String ZZHEALTHWALKING_MayHaveDifficultyTBC = "May have difficulty (TBC)";
	/** No difficulty = No difficulty */
	public static final String ZZHEALTHWALKING_NoDifficulty = "No difficulty";
	/** Some difficulty = Some difficulty */
	public static final String ZZHEALTHWALKING_SomeDifficulty = "Some difficulty";
	/** Set Walking.
		@param ZZHealthWalking Health Function Walking
	*/
	public void setZZHealthWalking (String ZZHealthWalking)
	{

		set_Value (COLUMNNAME_ZZHealthWalking, ZZHealthWalking);
	}

	/** Get Walking.
		@return Health Function Walking
	  */
	public String getZZHealthWalking()
	{
		return (String)get_Value(COLUMNNAME_ZZHealthWalking);
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

	/** Set Middle Name.
		@param ZZMiddleName Middle Name
	*/
	public void setZZMiddleName (String ZZMiddleName)
	{
		set_ValueNoCheck (COLUMNNAME_ZZMiddleName, ZZMiddleName);
	}

	/** Get Middle Name.
		@return Middle Name	  */
	public String getZZMiddleName()
	{
		return (String)get_Value(COLUMNNAME_ZZMiddleName);
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
}