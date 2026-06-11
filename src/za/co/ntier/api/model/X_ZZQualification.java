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
import org.compiere.util.KeyNamePair;

/** Generated Model for ZZQualification
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="ZZQualification")
public class X_ZZQualification extends PO implements I_ZZQualification, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20260611L;

    /** Standard Constructor */
    public X_ZZQualification (Properties ctx, int ZZQualification_ID, String trxName)
    {
      super (ctx, ZZQualification_ID, trxName);
      /** if (ZZQualification_ID == 0)
        {
			setZZQualification_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZQualification (Properties ctx, int ZZQualification_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZQualification_ID, trxName, virtualColumns);
      /** if (ZZQualification_ID == 0)
        {
			setZZQualification_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZQualification (Properties ctx, String ZZQualification_UU, String trxName)
    {
      super (ctx, ZZQualification_UU, trxName);
      /** if (ZZQualification_UU == null)
        {
			setZZQualification_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZQualification (Properties ctx, String ZZQualification_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZQualification_UU, trxName, virtualColumns);
      /** if (ZZQualification_UU == null)
        {
			setZZQualification_ID (0);
        } */
    }

    /** Load Constructor */
    public X_ZZQualification (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_ZZQualification[")
        .append(get_ID()).append(",Name=").append(getName()).append("]");
      return sb.toString();
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

	/** Set Registration End Date.
		@param Registrationenddate Registration End Date
	*/
	public void setRegistrationenddate (Timestamp Registrationenddate)
	{
		set_Value (COLUMNNAME_Registrationenddate, Registrationenddate);
	}

	/** Get Registration End Date.
		@return Registration End Date	  */
	public Timestamp getRegistrationenddate()
	{
		return (Timestamp)get_Value(COLUMNNAME_Registrationenddate);
	}

	/** Set Registration Start Date.
		@param Registrationstartdate Registration Start Date
	*/
	public void setRegistrationstartdate (Timestamp Registrationstartdate)
	{
		set_Value (COLUMNNAME_Registrationstartdate, Registrationstartdate);
	}

	/** Get Registration Start Date.
		@return Registration Start Date	  */
	public Timestamp getRegistrationstartdate()
	{
		return (Timestamp)get_Value(COLUMNNAME_Registrationstartdate);
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

	/** Set Credits.
		@param ZZCredits Credits
	*/
	public void setZZCredits (int ZZCredits)
	{
		set_Value (COLUMNNAME_ZZCredits, Integer.valueOf(ZZCredits));
	}

	/** Get Credits.
		@return Credits	  */
	public int getZZCredits()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZCredits);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** ZZIsReplacement AD_Reference_ID=319 */
	public static final int ZZISREPLACEMENT_AD_Reference_ID=319;
	/** No = N */
	public static final String ZZISREPLACEMENT_No = "N";
	/** Yes = Y */
	public static final String ZZISREPLACEMENT_Yes = "Y";
	/** Set Is Replacement.
		@param ZZIsReplacement Is Replacement
	*/
	public void setZZIsReplacement (String ZZIsReplacement)
	{

		set_Value (COLUMNNAME_ZZIsReplacement, ZZIsReplacement);
	}

	/** Get Is Replacement.
		@return Is Replacement	  */
	public String getZZIsReplacement()
	{
		return (String)get_Value(COLUMNNAME_ZZIsReplacement);
	}

	/** ZZIsReregistered AD_Reference_ID=319 */
	public static final int ZZISREREGISTERED_AD_Reference_ID=319;
	/** No = N */
	public static final String ZZISREREGISTERED_No = "N";
	/** Yes = Y */
	public static final String ZZISREREGISTERED_Yes = "Y";
	/** Set Is Reregistered.
		@param ZZIsReregistered Is Reregistered
	*/
	public void setZZIsReregistered (String ZZIsReregistered)
	{

		set_Value (COLUMNNAME_ZZIsReregistered, ZZIsReregistered);
	}

	/** Get Is Reregistered.
		@return Is Reregistered	  */
	public String getZZIsReregistered()
	{
		return (String)get_Value(COLUMNNAME_ZZIsReregistered);
	}

	/** Set Last Achievement Date.
		@param ZZLastAchievementDate Last Achievement Date
	*/
	public void setZZLastAchievementDate (Timestamp ZZLastAchievementDate)
	{
		set_Value (COLUMNNAME_ZZLastAchievementDate, ZZLastAchievementDate);
	}

	/** Get Last Achievement Date.
		@return Last Achievement Date	  */
	public Timestamp getZZLastAchievementDate()
	{
		return (Timestamp)get_Value(COLUMNNAME_ZZLastAchievementDate);
	}

	/** Set Last Enrolment Date.
		@param ZZLastEnrolmentDate Last Enrolment Date
	*/
	public void setZZLastEnrolmentDate (Timestamp ZZLastEnrolmentDate)
	{
		set_Value (COLUMNNAME_ZZLastEnrolmentDate, ZZLastEnrolmentDate);
	}

	/** Get Last Enrolment Date.
		@return Last Enrolment Date	  */
	public Timestamp getZZLastEnrolmentDate()
	{
		return (Timestamp)get_Value(COLUMNNAME_ZZLastEnrolmentDate);
	}

	public I_ZZLkpOfoOccupationTree getZZLkpOfoOccupationTree() throws RuntimeException
	{
		return (I_ZZLkpOfoOccupationTree)MTable.get(getCtx(), I_ZZLkpOfoOccupationTree.Table_ID)
			.getPO(getZZLkpOfoOccupationTree_ID(), get_TrxName());
	}

	/** Set Ofo Occupation.
		@param ZZLkpOfoOccupationTree_ID Ofo Occupation
	*/
	public void setZZLkpOfoOccupationTree_ID (int ZZLkpOfoOccupationTree_ID)
	{
		if (ZZLkpOfoOccupationTree_ID < 1)
			set_Value (COLUMNNAME_ZZLkpOfoOccupationTree_ID, null);
		else
			set_Value (COLUMNNAME_ZZLkpOfoOccupationTree_ID, Integer.valueOf(ZZLkpOfoOccupationTree_ID));
	}

	/** Get Ofo Occupation.
		@return Ofo Occupation	  */
	public int getZZLkpOfoOccupationTree_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZLkpOfoOccupationTree_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Migrate Values.
		@param ZZMigrateValues Migrate Values
	*/
	public void setZZMigrateValues (String ZZMigrateValues)
	{
		set_Value (COLUMNNAME_ZZMigrateValues, ZZMigrateValues);
	}

	/** Get Migrate Values.
		@return Migrate Values	  */
	public String getZZMigrateValues()
	{
		return (String)get_Value(COLUMNNAME_ZZMigrateValues);
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

	/** Set Minimum Elective Credits.
		@param ZZMinimumElectiveCredits Minimum Elective Credits
	*/
	public void setZZMinimumElectiveCredits (int ZZMinimumElectiveCredits)
	{
		set_Value (COLUMNNAME_ZZMinimumElectiveCredits, Integer.valueOf(ZZMinimumElectiveCredits));
	}

	/** Get Minimum Elective Credits.
		@return Minimum Elective Credits	  */
	public int getZZMinimumElectiveCredits()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZMinimumElectiveCredits);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set New Last Achievement Date.
		@param ZZNewLastAchievementDate New Last Achievement Date
	*/
	public void setZZNewLastAchievementDate (Timestamp ZZNewLastAchievementDate)
	{
		set_Value (COLUMNNAME_ZZNewLastAchievementDate, ZZNewLastAchievementDate);
	}

	/** Get New Last Achievement Date.
		@return New Last Achievement Date	  */
	public Timestamp getZZNewLastAchievementDate()
	{
		return (Timestamp)get_Value(COLUMNNAME_ZZNewLastAchievementDate);
	}

	/** Set New Last Enrolment Date.
		@param ZZNewLastEnrolmentDate New Last Enrolment Date
	*/
	public void setZZNewLastEnrolmentDate (Timestamp ZZNewLastEnrolmentDate)
	{
		set_Value (COLUMNNAME_ZZNewLastEnrolmentDate, ZZNewLastEnrolmentDate);
	}

	/** Get New Last Enrolment Date.
		@return New Last Enrolment Date	  */
	public Timestamp getZZNewLastEnrolmentDate()
	{
		return (Timestamp)get_Value(COLUMNNAME_ZZNewLastEnrolmentDate);
	}

	/** Set New Registration End Date.
		@param ZZNewRegistrationEndDate New Registration End Date
	*/
	public void setZZNewRegistrationEndDate (Timestamp ZZNewRegistrationEndDate)
	{
		set_Value (COLUMNNAME_ZZNewRegistrationEndDate, ZZNewRegistrationEndDate);
	}

	/** Get New Registration End Date.
		@return New Registration End Date	  */
	public Timestamp getZZNewRegistrationEndDate()
	{
		return (Timestamp)get_Value(COLUMNNAME_ZZNewRegistrationEndDate);
	}

	/** Set New Registration Start Date.
		@param ZZNewRegistrationStartDate New Registration Start Date
	*/
	public void setZZNewRegistrationStartDate (Timestamp ZZNewRegistrationStartDate)
	{
		set_Value (COLUMNNAME_ZZNewRegistrationStartDate, ZZNewRegistrationStartDate);
	}

	/** Get New Registration Start Date.
		@return New Registration Start Date	  */
	public Timestamp getZZNewRegistrationStartDate()
	{
		return (Timestamp)get_Value(COLUMNNAME_ZZNewRegistrationStartDate);
	}

	/** Below Level 01 = Below Level 01 */
	public static final String ZZNQFLEVEL_BelowLevel01 = "Below Level 01";
	/** Level 01 = Level 01 */
	public static final String ZZNQFLEVEL_Level01 = "Level 01";
	/** Level 02 = Level 02 */
	public static final String ZZNQFLEVEL_Level02 = "Level 02";
	/** Level 03 = Level 03 */
	public static final String ZZNQFLEVEL_Level03 = "Level 03";
	/** Level 04 = Level 04 */
	public static final String ZZNQFLEVEL_Level04 = "Level 04";
	/** Level 05 = Level 05 */
	public static final String ZZNQFLEVEL_Level05 = "Level 05";
	/** Level 06 = Level 06 */
	public static final String ZZNQFLEVEL_Level06 = "Level 06";
	/** Level 07 = Level 07 */
	public static final String ZZNQFLEVEL_Level07 = "Level 07";
	/** Level 08 = Level 08 */
	public static final String ZZNQFLEVEL_Level08 = "Level 08";
	/** Level 09 = Level 09 */
	public static final String ZZNQFLEVEL_Level09 = "Level 09";
	/** Level 10 = Level 10 */
	public static final String ZZNQFLEVEL_Level10 = "Level 10";
	/** Level 11 = Level 11 */
	public static final String ZZNQFLEVEL_Level11 = "Level 11";
	/** Set NQF Level.
		@param ZZNqfLevel NQF Level
	*/
	public void setZZNqfLevel (String ZZNqfLevel)
	{

		set_Value (COLUMNNAME_ZZNqfLevel, ZZNqfLevel);
	}

	/** Get NQF Level.
		@return NQF Level	  */
	public String getZZNqfLevel()
	{
		return (String)get_Value(COLUMNNAME_ZZNqfLevel);
	}

	/** Non Unit Standard Based = Non Unit Standard Based */
	public static final String ZZQUALIFICATIONTYPE_NonUnitStandardBased = "Non Unit Standard Based";
	/** Unit Standard Based = Unit Standard Based */
	public static final String ZZQUALIFICATIONTYPE_UnitStandardBased = "Unit Standard Based";
	/** Set Qualification Type.
		@param ZZQualificationType Qualification Type
	*/
	public void setZZQualificationType (String ZZQualificationType)
	{

		set_Value (COLUMNNAME_ZZQualificationType, ZZQualificationType);
	}

	/** Get Qualification Type.
		@return Qualification Type	  */
	public String getZZQualificationType()
	{
		return (String)get_Value(COLUMNNAME_ZZQualificationType);
	}

	/** Set Qualification.
		@param ZZQualification_ID Qualification
	*/
	public void setZZQualification_ID (int ZZQualification_ID)
	{
		if (ZZQualification_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZQualification_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZQualification_ID, Integer.valueOf(ZZQualification_ID));
	}

	/** Get Qualification.
		@return Qualification	  */
	public int getZZQualification_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZQualification_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set ZZQualification_UU.
		@param ZZQualification_UU ZZQualification_UU
	*/
	public void setZZQualification_UU (String ZZQualification_UU)
	{
		set_Value (COLUMNNAME_ZZQualification_UU, ZZQualification_UU);
	}

	/** Get ZZQualification_UU.
		@return ZZQualification_UU	  */
	public String getZZQualification_UU()
	{
		return (String)get_Value(COLUMNNAME_ZZQualification_UU);
	}

	/** IEB = 14 */
	public static final String ZZQUALITYASSURANCEBODY_IEB = "14";
	/** DHET = 48 */
	public static final String ZZQUALITYASSURANCEBODY_DHET = "48";
	/** DHET SETA-support = 49 */
	public static final String ZZQUALITYASSURANCEBODY_DHETSETA_Support = "49";
	/** DIDTETA = 50 */
	public static final String ZZQUALITYASSURANCEBODY_DIDTETA = "50";
	/** EWSETA = 53 */
	public static final String ZZQUALITYASSURANCEBODY_EWSETA = "53";
	/** Indlela NAMB = 54 */
	public static final String ZZQUALITYASSURANCEBODY_IndlelaNAMB = "54";
	/** UMALUSI = 541 */
	public static final String ZZQUALITYASSURANCEBODY_UMALUSI = "541";
	/** BANKSETA = 557 */
	public static final String ZZQUALITYASSURANCEBODY_BANKSETA = "557";
	/** CHIETA = 559 */
	public static final String ZZQUALITYASSURANCEBODY_CHIETA = "559";
	/** CTFL = 561 */
	public static final String ZZQUALITYASSURANCEBODY_CTFL = "561";
	/** CETA = 577 */
	public static final String ZZQUALITYASSURANCEBODY_CETA = "577";
	/** ETDP = 581 */
	public static final String ZZQUALITYASSURANCEBODY_ETDP = "581";
	/** ESETA = 583 */
	public static final String ZZQUALITYASSURANCEBODY_ESETA = "583";
	/** FASSET = 585 */
	public static final String ZZQUALITYASSURANCEBODY_FASSET = "585";
	/** FOODBEV = 587 */
	public static final String ZZQUALITYASSURANCEBODY_FOODBEV = "587";
	/** FIETA = 589 */
	public static final String ZZQUALITYASSURANCEBODY_FIETA = "589";
	/** HWSETA = 591 */
	public static final String ZZQUALITYASSURANCEBODY_HWSETA = "591";
	/** ISETT = 593 */
	public static final String ZZQUALITYASSURANCEBODY_ISETT = "593";
	/** INSETA = 595 */
	public static final String ZZQUALITYASSURANCEBODY_INSETA = "595";
	/** LGSETA = 597 */
	public static final String ZZQUALITYASSURANCEBODY_LGSETA = "597";
	/** MERSETA = 599 */
	public static final String ZZQUALITYASSURANCEBODY_MERSETA = "599";
	/** QCTO = 60 */
	public static final String ZZQUALITYASSURANCEBODY_QCTO = "60";
	/** MAPPP-SETA = 601 */
	public static final String ZZQUALITYASSURANCEBODY_MAPPP_SETA = "601";
	/** PSETA = 607 */
	public static final String ZZQUALITYASSURANCEBODY_PSETA = "607";
	/** SERVICES SETA = 611 */
	public static final String ZZQUALITYASSURANCEBODY_SERVICESSETA = "611";
	/** THETA = 613 */
	public static final String ZZQUALITYASSURANCEBODY_THETA = "613";
	/** TETA = 615 */
	public static final String ZZQUALITYASSURANCEBODY_TETA = "615";
	/** W&amp;RSETA = 617 */
	public static final String ZZQUALITYASSURANCEBODY_WRSETA = "617";
	/** CHE = 621 */
	public static final String ZZQUALITYASSURANCEBODY_CHE = "621";
	/** MQA = 629 */
	public static final String ZZQUALITYASSURANCEBODY_MQA = "629";
	/** SAPC = 631 */
	public static final String ZZQUALITYASSURANCEBODY_SAPC = "631";
	/** PAB = 637 */
	public static final String ZZQUALITYASSURANCEBODY_PAB = "637";
	/** SABPP = 639 */
	public static final String ZZQUALITYASSURANCEBODY_SABPP = "639";
	/** SAICA = 651 */
	public static final String ZZQUALITYASSURANCEBODY_SAICA = "651";
	/** SANC = 657 */
	public static final String ZZQUALITYASSURANCEBODY_SANC = "657";
	/** HPCSA = 692 */
	public static final String ZZQUALITYASSURANCEBODY_HPCSA = "692";
	/** AgriSETA = 694 */
	public static final String ZZQUALITYASSURANCEBODY_AgriSETA = "694";
	/** SASSETA = 695 */
	public static final String ZZQUALITYASSURANCEBODY_SASSETA = "695";
	/** FPMSETA = 754 */
	public static final String ZZQUALITYASSURANCEBODY_FPMSETA = "754";
	/** CATHSSETA = 755 */
	public static final String ZZQUALITYASSURANCEBODY_CATHSSETA = "755";
	/** MICT = 756 */
	public static final String ZZQUALITYASSURANCEBODY_MICT = "756";
	/** FETMIS = 9 */
	public static final String ZZQUALITYASSURANCEBODY_FETMIS = "9";
	/** Set Quality Assurance Body.
		@param ZZQualityAssuranceBody Quality Assurance Body
	*/
	public void setZZQualityAssuranceBody (String ZZQualityAssuranceBody)
	{

		set_Value (COLUMNNAME_ZZQualityAssuranceBody, ZZQualityAssuranceBody);
	}

	/** Get Quality Assurance Body.
		@return Quality Assurance Body	  */
	public String getZZQualityAssuranceBody()
	{
		return (String)get_Value(COLUMNNAME_ZZQualityAssuranceBody);
	}

	public I_ZZQualification getZZReplacementQualification() throws RuntimeException
	{
		return (I_ZZQualification)MTable.get(getCtx(), I_ZZQualification.Table_ID)
			.getPO(getZZReplacementQualification_ID(), get_TrxName());
	}

	/** Set Replacement Qualification.
		@param ZZReplacementQualification_ID Replacement Qualification
	*/
	public void setZZReplacementQualification_ID (int ZZReplacementQualification_ID)
	{
		if (ZZReplacementQualification_ID < 1)
			set_Value (COLUMNNAME_ZZReplacementQualification_ID, null);
		else
			set_Value (COLUMNNAME_ZZReplacementQualification_ID, Integer.valueOf(ZZReplacementQualification_ID));
	}

	/** Get Replacement Qualification.
		@return Replacement Qualification	  */
	public int getZZReplacementQualification_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZReplacementQualification_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set SAQA Qualification Code.
		@param ZZSaqaQualificationCode SAQA Qualification Code
	*/
	public void setZZSaqaQualificationCode (String ZZSaqaQualificationCode)
	{
		set_Value (COLUMNNAME_ZZSaqaQualificationCode, ZZSaqaQualificationCode);
	}

	/** Get SAQA Qualification Code.
		@return SAQA Qualification Code	  */
	public String getZZSaqaQualificationCode()
	{
		return (String)get_Value(COLUMNNAME_ZZSaqaQualificationCode);
	}

	/** Set SAQA Qualification Title.
		@param ZZSaqaQualificationTitle SAQA Qualification Title
	*/
	public void setZZSaqaQualificationTitle (String ZZSaqaQualificationTitle)
	{
		set_Value (COLUMNNAME_ZZSaqaQualificationTitle, ZZSaqaQualificationTitle);
	}

	/** Get SAQA Qualification Title.
		@return SAQA Qualification Title	  */
	public String getZZSaqaQualificationTitle()
	{
		return (String)get_Value(COLUMNNAME_ZZSaqaQualificationTitle);
	}

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair()
    {
        return new KeyNamePair(get_ID(), getZZSaqaQualificationTitle());
    }
}