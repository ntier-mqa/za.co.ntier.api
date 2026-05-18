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

/** Generated Model for ZZAssessorPerson
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="ZZAssessorPerson")
public class X_ZZAssessorPerson extends PO implements I_ZZAssessorPerson, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20260518L;

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

	/** Set End Date.
		@param EndDate Last effective date (inclusive)
	*/
	public void setEndDate (Timestamp EndDate)
	{
		set_Value (COLUMNNAME_EndDate, EndDate);
	}

	/** Get End Date.
		@return Last effective date (inclusive)
	  */
	public Timestamp getEndDate()
	{
		return (Timestamp)get_Value(COLUMNNAME_EndDate);
	}

	/** Set Start Date.
		@param StartDate First effective day (inclusive)
	*/
	public void setStartDate (Timestamp StartDate)
	{
		set_Value (COLUMNNAME_StartDate, StartDate);
	}

	/** Get Start Date.
		@return First effective day (inclusive)
	  */
	public Timestamp getStartDate()
	{
		return (Timestamp)get_Value(COLUMNNAME_StartDate);
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

	/** Assessor = Assessor */
	public static final String ZZASSESSORROLE_Assessor = "Assessor";
	/** Moderator = Moderator */
	public static final String ZZASSESSORROLE_Moderator = "Moderator";
	/** Set Role.
		@param ZZAssessorRole Role
	*/
	public void setZZAssessorRole (String ZZAssessorRole)
	{

		set_Value (COLUMNNAME_ZZAssessorRole, ZZAssessorRole);
	}

	/** Get Role.
		@return Role	  */
	public String getZZAssessorRole()
	{
		return (String)get_Value(COLUMNNAME_ZZAssessorRole);
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

	/** Set Last School Year.
		@param ZZLastSchoolYear Last School Year
	*/
	public void setZZLastSchoolYear (int ZZLastSchoolYear)
	{
		set_Value (COLUMNNAME_ZZLastSchoolYear, Integer.valueOf(ZZLastSchoolYear));
	}

	/** Get Last School Year.
		@return Last School Year	  */
	public int getZZLastSchoolYear()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZLastSchoolYear);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_ZZLkpSchoolEmis getZZLkpSchoolEmis() throws RuntimeException
	{
		return (I_ZZLkpSchoolEmis)MTable.get(getCtx(), I_ZZLkpSchoolEmis.Table_ID)
			.getPO(getZZLkpSchoolEmis_ID(), get_TrxName());
	}

	/** Set School EMIS.
		@param ZZLkpSchoolEmis_ID School EMIS
	*/
	public void setZZLkpSchoolEmis_ID (int ZZLkpSchoolEmis_ID)
	{
		if (ZZLkpSchoolEmis_ID < 1)
			set_Value (COLUMNNAME_ZZLkpSchoolEmis_ID, null);
		else
			set_Value (COLUMNNAME_ZZLkpSchoolEmis_ID, Integer.valueOf(ZZLkpSchoolEmis_ID));
	}

	/** Get School EMIS.
		@return School EMIS	  */
	public int getZZLkpSchoolEmis_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZLkpSchoolEmis_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_ZZLkpStatssaAreaCode getZZLkpStatssaAreaCode() throws RuntimeException
	{
		return (I_ZZLkpStatssaAreaCode)MTable.get(getCtx(), I_ZZLkpStatssaAreaCode.Table_ID)
			.getPO(getZZLkpStatssaAreaCode_ID(), get_TrxName());
	}

	/** Set STATSSA Area Code.
		@param ZZLkpStatssaAreaCode_ID STATSSA Area Code
	*/
	public void setZZLkpStatssaAreaCode_ID (int ZZLkpStatssaAreaCode_ID)
	{
		if (ZZLkpStatssaAreaCode_ID < 1)
			set_Value (COLUMNNAME_ZZLkpStatssaAreaCode_ID, null);
		else
			set_Value (COLUMNNAME_ZZLkpStatssaAreaCode_ID, Integer.valueOf(ZZLkpStatssaAreaCode_ID));
	}

	/** Get STATSSA Area Code.
		@return STATSSA Area Code	  */
	public int getZZLkpStatssaAreaCode_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZLkpStatssaAreaCode_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_C_Location getZZPhysicalLocation() throws RuntimeException
	{
		return (I_C_Location)MTable.get(getCtx(), I_C_Location.Table_ID)
			.getPO(getZZPhysicalLocation_ID(), get_TrxName());
	}

	/** Set Physical Address.
		@param ZZPhysicalLocation_ID Physical Address
	*/
	public void setZZPhysicalLocation_ID (int ZZPhysicalLocation_ID)
	{
		if (ZZPhysicalLocation_ID < 1)
			set_Value (COLUMNNAME_ZZPhysicalLocation_ID, null);
		else
			set_Value (COLUMNNAME_ZZPhysicalLocation_ID, Integer.valueOf(ZZPhysicalLocation_ID));
	}

	/** Get Physical Address.
		@return Physical Address	  */
	public int getZZPhysicalLocation_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZPhysicalLocation_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Agree = Agree */
	public static final String ZZPOPIACTSTATUS_Agree = "Agree";
	/** disagree = disagree */
	public static final String ZZPOPIACTSTATUS_Disagree = "disagree";
	/** Set POPI Act Status.
		@param ZZPopiActStatus POPI Act Status
	*/
	public void setZZPopiActStatus (String ZZPopiActStatus)
	{

		set_Value (COLUMNNAME_ZZPopiActStatus, ZZPopiActStatus);
	}

	/** Get POPI Act Status.
		@return POPI Act Status	  */
	public String getZZPopiActStatus()
	{
		return (String)get_Value(COLUMNNAME_ZZPopiActStatus);
	}

	/** Set POPI Act Status Date.
		@param ZZPopiActStatusDate POPI Act Status Date
	*/
	public void setZZPopiActStatusDate (Timestamp ZZPopiActStatusDate)
	{
		set_Value (COLUMNNAME_ZZPopiActStatusDate, ZZPopiActStatusDate);
	}

	/** Get POPI Act Status Date.
		@return POPI Act Status Date	  */
	public Timestamp getZZPopiActStatusDate()
	{
		return (Timestamp)get_Value(COLUMNNAME_ZZPopiActStatusDate);
	}

	public I_C_Location getZZPostalLocation() throws RuntimeException
	{
		return (I_C_Location)MTable.get(getCtx(), I_C_Location.Table_ID)
			.getPO(getZZPostalLocation_ID(), get_TrxName());
	}

	/** Set Postal Address.
		@param ZZPostalLocation_ID Postal Address
	*/
	public void setZZPostalLocation_ID (int ZZPostalLocation_ID)
	{
		if (ZZPostalLocation_ID < 1)
			set_Value (COLUMNNAME_ZZPostalLocation_ID, null);
		else
			set_Value (COLUMNNAME_ZZPostalLocation_ID, Integer.valueOf(ZZPostalLocation_ID));
	}

	/** Get Postal Address.
		@return Postal Address	  */
	public int getZZPostalLocation_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZPostalLocation_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_AD_User getZZ_ApprovedBy() throws RuntimeException
	{
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_ID)
			.getPO(getZZ_ApprovedBy_ID(), get_TrxName());
	}

	/** Set Approved By.
		@param ZZ_ApprovedBy_ID Approved By
	*/
	public void setZZ_ApprovedBy_ID (int ZZ_ApprovedBy_ID)
	{
		if (ZZ_ApprovedBy_ID < 1)
			set_Value (COLUMNNAME_ZZ_ApprovedBy_ID, null);
		else
			set_Value (COLUMNNAME_ZZ_ApprovedBy_ID, Integer.valueOf(ZZ_ApprovedBy_ID));
	}

	/** Get Approved By.
		@return Approved By	  */
	public int getZZ_ApprovedBy_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZ_ApprovedBy_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Approved Date.
		@param ZZ_ApprovedDate Approved Date
	*/
	public void setZZ_ApprovedDate (Timestamp ZZ_ApprovedDate)
	{
		set_Value (COLUMNNAME_ZZ_ApprovedDate, ZZ_ApprovedDate);
	}

	/** Get Approved Date.
		@return Approved Date	  */
	public Timestamp getZZ_ApprovedDate()
	{
		return (Timestamp)get_Value(COLUMNNAME_ZZ_ApprovedDate);
	}

	/** Set Assessor.
		@param ZZ_Assessor Assessor number (Auto Generated)
	*/
	public void setZZ_Assessor (String ZZ_Assessor)
	{
		set_Value (COLUMNNAME_ZZ_Assessor, ZZ_Assessor);
	}

	/** Get Assessor.
		@return Assessor number (Auto Generated)
	  */
	public String getZZ_Assessor()
	{
		return (String)get_Value(COLUMNNAME_ZZ_Assessor);
	}

	/** Set Date Not Approved.
		@param ZZ_Date_Not_Approved Date Not Approved
	*/
	public void setZZ_Date_Not_Approved (Timestamp ZZ_Date_Not_Approved)
	{
		set_Value (COLUMNNAME_ZZ_Date_Not_Approved, ZZ_Date_Not_Approved);
	}

	/** Get Date Not Approved.
		@return Date Not Approved	  */
	public Timestamp getZZ_Date_Not_Approved()
	{
		return (Timestamp)get_Value(COLUMNNAME_ZZ_Date_Not_Approved);
	}

	/** Set Date Not Recommended.
		@param ZZ_Date_Not_Recommended Date Not Recommended
	*/
	public void setZZ_Date_Not_Recommended (Timestamp ZZ_Date_Not_Recommended)
	{
		set_Value (COLUMNNAME_ZZ_Date_Not_Recommended, ZZ_Date_Not_Recommended);
	}

	/** Get Date Not Recommended.
		@return Date Not Recommended	  */
	public Timestamp getZZ_Date_Not_Recommended()
	{
		return (Timestamp)get_Value(COLUMNNAME_ZZ_Date_Not_Recommended);
	}

	/** Set Date Recommended.
		@param ZZ_Date_Recommended Date Recommended
	*/
	public void setZZ_Date_Recommended (Timestamp ZZ_Date_Recommended)
	{
		set_Value (COLUMNNAME_ZZ_Date_Recommended, ZZ_Date_Recommended);
	}

	/** Get Date Recommended.
		@return Date Recommended	  */
	public Timestamp getZZ_Date_Recommended()
	{
		return (Timestamp)get_Value(COLUMNNAME_ZZ_Date_Recommended);
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
			set_Value (COLUMNNAME_ZZ_LI_CitizenResidentialStatus_ID, null);
		else
			set_Value (COLUMNNAME_ZZ_LI_CitizenResidentialStatus_ID, Integer.valueOf(ZZ_LI_CitizenResidentialStatus_ID));
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
			set_Value (COLUMNNAME_ZZ_LI_HomeLanguage_ID, null);
		else
			set_Value (COLUMNNAME_ZZ_LI_HomeLanguage_ID, Integer.valueOf(ZZ_LI_HomeLanguage_ID));
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
			set_Value (COLUMNNAME_ZZ_LI_SocioEconomicStatus_ID, null);
		else
			set_Value (COLUMNNAME_ZZ_LI_SocioEconomicStatus_ID, Integer.valueOf(ZZ_LI_SocioEconomicStatus_ID));
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

	/** Set Moderator.
		@param ZZ_Moderator Moderator number (Auto Generated)
	*/
	public void setZZ_Moderator (String ZZ_Moderator)
	{
		set_Value (COLUMNNAME_ZZ_Moderator, ZZ_Moderator);
	}

	/** Get Moderator.
		@return Moderator number (Auto Generated)
	  */
	public String getZZ_Moderator()
	{
		return (String)get_Value(COLUMNNAME_ZZ_Moderator);
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
			set_Value (COLUMNNAME_ZZ_Nationality_ID, null);
		else
			set_Value (COLUMNNAME_ZZ_Nationality_ID, Integer.valueOf(ZZ_Nationality_ID));
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

	public org.compiere.model.I_AD_User getZZ_Recommender() throws RuntimeException
	{
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_ID)
			.getPO(getZZ_Recommender_ID(), get_TrxName());
	}

	/** Set Recommender.
		@param ZZ_Recommender_ID Recommender
	*/
	public void setZZ_Recommender_ID (int ZZ_Recommender_ID)
	{
		if (ZZ_Recommender_ID < 1)
			set_Value (COLUMNNAME_ZZ_Recommender_ID, null);
		else
			set_Value (COLUMNNAME_ZZ_Recommender_ID, Integer.valueOf(ZZ_Recommender_ID));
	}

	/** Get Recommender.
		@return Recommender	  */
	public int getZZ_Recommender_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZ_Recommender_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}