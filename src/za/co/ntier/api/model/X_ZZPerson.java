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

/** Generated Model for ZZPerson
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="ZZPerson")
public class X_ZZPerson extends PO implements I_ZZPerson, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20260529L;

    /** Standard Constructor */
    public X_ZZPerson (Properties ctx, int ZZPerson_ID, String trxName)
    {
      super (ctx, ZZPerson_ID, trxName);
      /** if (ZZPerson_ID == 0)
        {
			setZZPerson_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZPerson (Properties ctx, int ZZPerson_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZPerson_ID, trxName, virtualColumns);
      /** if (ZZPerson_ID == 0)
        {
			setZZPerson_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZPerson (Properties ctx, String ZZPerson_UU, String trxName)
    {
      super (ctx, ZZPerson_UU, trxName);
      /** if (ZZPerson_UU == null)
        {
			setZZPerson_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZPerson (Properties ctx, String ZZPerson_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZPerson_UU, trxName, virtualColumns);
      /** if (ZZPerson_UU == null)
        {
			setZZPerson_ID (0);
        } */
    }

    /** Load Constructor */
    public X_ZZPerson (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_ZZPerson[")
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

	/** Set Birthday.
		@param Birthday Birthday or Anniversary day
	*/
	public void setBirthday (Timestamp Birthday)
	{
		set_Value (COLUMNNAME_Birthday, Birthday);
	}

	/** Get Birthday.
		@return Birthday or Anniversary day
	  */
	public Timestamp getBirthday()
	{
		return (Timestamp)get_Value(COLUMNNAME_Birthday);
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

	/** Set Fax.
		@param Fax Facsimile number
	*/
	public void setFax (String Fax)
	{
		set_Value (COLUMNNAME_Fax, Fax);
	}

	/** Get Fax.
		@return Facsimile number
	  */
	public String getFax()
	{
		return (String)get_Value(COLUMNNAME_Fax);
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

	/** Set Surname.
		@param Surname Surname
	*/
	public void setSurname (String Surname)
	{
		set_Value (COLUMNNAME_Surname, Surname);
	}

	/** Get Surname.
		@return Surname	  */
	public String getSurname()
	{
		return (String)get_Value(COLUMNNAME_Surname);
	}

	/** Set CV File Name.
		@param ZZCVFileName CV File Name
	*/
	public void setZZCVFileName (String ZZCVFileName)
	{
		set_Value (COLUMNNAME_ZZCVFileName, ZZCVFileName);
	}

	/** Get CV File Name.
		@return CV File Name	  */
	public String getZZCVFileName()
	{
		return (String)get_Value(COLUMNNAME_ZZCVFileName);
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

	/** Set School EMIS.
		@param ZZLkpSchoolEmis_ID School EMIS
	*/
	public void setZZLkpSchoolEmis_ID (int ZZLkpSchoolEmis_ID)
	{
		if (ZZLkpSchoolEmis_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZLkpSchoolEmis_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZLkpSchoolEmis_ID, Integer.valueOf(ZZLkpSchoolEmis_ID));
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

	/** Set STATSSA Area Code.
		@param ZZLkpStatssaAreaCode_ID STATSSA Area Code
	*/
	public void setZZLkpStatssaAreaCode_ID (int ZZLkpStatssaAreaCode_ID)
	{
		if (ZZLkpStatssaAreaCode_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZLkpStatssaAreaCode_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZLkpStatssaAreaCode_ID, Integer.valueOf(ZZLkpStatssaAreaCode_ID));
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
		set_Value (COLUMNNAME_ZZMiddleName, ZZMiddleName);
	}

	/** Get Middle Name.
		@return Middle Name	  */
	public String getZZMiddleName()
	{
		return (String)get_Value(COLUMNNAME_ZZMiddleName);
	}

	/** Set Migration Code.
		@param ZZMigrationCode Migration Code
	*/
	public void setZZMigrationCode (int ZZMigrationCode)
	{
		set_Value (COLUMNNAME_ZZMigrationCode, Integer.valueOf(ZZMigrationCode));
	}

	/** Get Migration Code.
		@return Migration Code	  */
	public int getZZMigrationCode()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZMigrationCode);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Other ID No.
		@param ZZOtherIDNo RSA Id store at ZZ_ID_Passport_No remain tyoe of id store at ZZOtherIDNo
	*/
	public void setZZOtherIDNo (String ZZOtherIDNo)
	{
		set_Value (COLUMNNAME_ZZOtherIDNo, ZZOtherIDNo);
	}

	/** Get Other ID No.
		@return RSA Id store at ZZ_ID_Passport_No remain tyoe of id store at ZZOtherIDNo
	  */
	public String getZZOtherIDNo()
	{
		return (String)get_Value(COLUMNNAME_ZZOtherIDNo);
	}

	/** Set Person.
		@param ZZPerson_ID Person
	*/
	public void setZZPerson_ID (int ZZPerson_ID)
	{
		if (ZZPerson_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZPerson_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZPerson_ID, Integer.valueOf(ZZPerson_ID));
	}

	/** Get Person.
		@return Person	  */
	public int getZZPerson_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZPerson_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set ZZPerson_UU.
		@param ZZPerson_UU ZZPerson_UU
	*/
	public void setZZPerson_UU (String ZZPerson_UU)
	{
		set_Value (COLUMNNAME_ZZPerson_UU, ZZPerson_UU);
	}

	/** Get ZZPerson_UU.
		@return ZZPerson_UU	  */
	public String getZZPerson_UU()
	{
		return (String)get_Value(COLUMNNAME_ZZPerson_UU);
	}

	/** Set Photograph File Name.
		@param ZZPhotographFileName Photograph File Name
	*/
	public void setZZPhotographFileName (String ZZPhotographFileName)
	{
		set_Value (COLUMNNAME_ZZPhotographFileName, ZZPhotographFileName);
	}

	/** Get Photograph File Name.
		@return Photograph File Name	  */
	public String getZZPhotographFileName()
	{
		return (String)get_Value(COLUMNNAME_ZZPhotographFileName);
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

	/** Set Years In Occupation.
		@param ZZYearsInOccupation Years In Occupation
	*/
	public void setZZYearsInOccupation (int ZZYearsInOccupation)
	{
		set_ValueNoCheck (COLUMNNAME_ZZYearsInOccupation, Integer.valueOf(ZZYearsInOccupation));
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

	public I_ZZ_AlternateIDType getZZ_AlternateIDType() throws RuntimeException
	{
		return (I_ZZ_AlternateIDType)MTable.get(getCtx(), I_ZZ_AlternateIDType.Table_ID)
			.getPO(getZZ_AlternateIDType_ID(), get_TrxName());
	}

	/** Set ID Type.
		@param ZZ_AlternateIDType_ID ID Type
	*/
	public void setZZ_AlternateIDType_ID (int ZZ_AlternateIDType_ID)
	{
		if (ZZ_AlternateIDType_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZ_AlternateIDType_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZ_AlternateIDType_ID, Integer.valueOf(ZZ_AlternateIDType_ID));
	}

	/** Get ID Type.
		@return ID Type	  */
	public int getZZ_AlternateIDType_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZ_AlternateIDType_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	public I_ZZ_LI_Disability getZZ_LI_Disability() throws RuntimeException
	{
		return (I_ZZ_LI_Disability)MTable.get(getCtx(), I_ZZ_LI_Disability.Table_ID)
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
}