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

/** Generated Model for ZZQctoModule
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="ZZQctoModule")
public class X_ZZQctoModule extends PO implements I_ZZQctoModule, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20260702L;

    /** Standard Constructor */
    public X_ZZQctoModule (Properties ctx, int ZZQctoModule_ID, String trxName)
    {
      super (ctx, ZZQctoModule_ID, trxName);
      /** if (ZZQctoModule_ID == 0)
        {
			setZZQctoModule_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZQctoModule (Properties ctx, int ZZQctoModule_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZQctoModule_ID, trxName, virtualColumns);
      /** if (ZZQctoModule_ID == 0)
        {
			setZZQctoModule_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZQctoModule (Properties ctx, String ZZQctoModule_UU, String trxName)
    {
      super (ctx, ZZQctoModule_UU, trxName);
      /** if (ZZQctoModule_UU == null)
        {
			setZZQctoModule_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZQctoModule (Properties ctx, String ZZQctoModule_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZQctoModule_UU, trxName, virtualColumns);
      /** if (ZZQctoModule_UU == null)
        {
			setZZQctoModule_ID (0);
        } */
    }

    /** Load Constructor */
    public X_ZZQctoModule (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_ZZQctoModule[")
        .append(get_ID()).append("]");
      return sb.toString();
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

	/** Application = Application */
	public static final String ZZLEARNINGTYPE_Application = "Application";
	/** Knowledge = Knowledge */
	public static final String ZZLEARNINGTYPE_Knowledge = "Knowledge";
	/** Work experience = Work experience */
	public static final String ZZLEARNINGTYPE_WorkExperience = "Work experience";
	/** Set Learning Type.
		@param ZZLearningType Learning Type
	*/
	public void setZZLearningType (String ZZLearningType)
	{

		set_Value (COLUMNNAME_ZZLearningType, ZZLearningType);
	}

	/** Get Learning Type.
		@return Learning Type	  */
	public String getZZLearningType()
	{
		return (String)get_Value(COLUMNNAME_ZZLearningType);
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

	public I_ZZLkpOfoOccupation getZZLkpOfoOccupation() throws RuntimeException
	{
		return (I_ZZLkpOfoOccupation)MTable.get(getCtx(), I_ZZLkpOfoOccupation.Table_ID)
			.getPO(getZZLkpOfoOccupation_ID(), get_TrxName());
	}

	/** Set OFO Occupation.
		@param ZZLkpOfoOccupation_ID OFO Occupation
	*/
	public void setZZLkpOfoOccupation_ID (int ZZLkpOfoOccupation_ID)
	{
		if (ZZLkpOfoOccupation_ID < 1)
			set_Value (COLUMNNAME_ZZLkpOfoOccupation_ID, null);
		else
			set_Value (COLUMNNAME_ZZLkpOfoOccupation_ID, Integer.valueOf(ZZLkpOfoOccupation_ID));
	}

	/** Get OFO Occupation.
		@return OFO Occupation
	  */
	public int getZZLkpOfoOccupation_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZLkpOfoOccupation_ID);
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

	/** Set Module Code.
		@param ZZModuleCode Module Code
	*/
	public void setZZModuleCode (String ZZModuleCode)
	{
		set_Value (COLUMNNAME_ZZModuleCode, ZZModuleCode);
	}

	/** Get Module Code.
		@return Module Code	  */
	public String getZZModuleCode()
	{
		return (String)get_Value(COLUMNNAME_ZZModuleCode);
	}

	/** Set Module Title.
		@param ZZModuleTitle Module Title
	*/
	public void setZZModuleTitle (String ZZModuleTitle)
	{
		set_Value (COLUMNNAME_ZZModuleTitle, ZZModuleTitle);
	}

	/** Get Module Title.
		@return Module Title	  */
	public String getZZModuleTitle()
	{
		return (String)get_Value(COLUMNNAME_ZZModuleTitle);
	}

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair()
    {
        return new KeyNamePair(get_ID(), getZZModuleTitle());
    }

	/** Core = Core */
	public static final String ZZMODULETYPE_Core = "Core";
	/** Elective = Elective */
	public static final String ZZMODULETYPE_Elective = "Elective";
	/** Set Module Type.
		@param ZZModuleType Module Type
	*/
	public void setZZModuleType (String ZZModuleType)
	{

		set_Value (COLUMNNAME_ZZModuleType, ZZModuleType);
	}

	/** Get Module Type.
		@return Module Type	  */
	public String getZZModuleType()
	{
		return (String)get_Value(COLUMNNAME_ZZModuleType);
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

	/** Set QCTO Module.
		@param ZZQctoModule_ID QCTO Module
	*/
	public void setZZQctoModule_ID (int ZZQctoModule_ID)
	{
		if (ZZQctoModule_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZQctoModule_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZQctoModule_ID, Integer.valueOf(ZZQctoModule_ID));
	}

	/** Get QCTO Module.
		@return QCTO Module	  */
	public int getZZQctoModule_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZQctoModule_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set ZZQctoModule_UU.
		@param ZZQctoModule_UU ZZQctoModule_UU
	*/
	public void setZZQctoModule_UU (String ZZQctoModule_UU)
	{
		set_Value (COLUMNNAME_ZZQctoModule_UU, ZZQctoModule_UU);
	}

	/** Get ZZQctoModule_UU.
		@return ZZQctoModule_UU	  */
	public String getZZQctoModule_UU()
	{
		return (String)get_Value(COLUMNNAME_ZZQctoModule_UU);
	}

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
	/** DHET = DHET */
	public static final String ZZQUALITYASSURANCEBODY_DHET = "DHET";
	/** DHET SETA-support = DHET SETA-support */
	public static final String ZZQUALITYASSURANCEBODY_DHETSETA_Support = "DHET SETA-support";
	/** DIDTETA = DIDTETA */
	public static final String ZZQUALITYASSURANCEBODY_DIDTETA = "DIDTETA";
	/** EWSETA = EWSETA */
	public static final String ZZQUALITYASSURANCEBODY_EWSETA = "EWSETA";
	/** FETMIS = FETMIS */
	public static final String ZZQUALITYASSURANCEBODY_FETMIS = "FETMIS";
	/** IEB = IEB */
	public static final String ZZQUALITYASSURANCEBODY_IEB = "IEB";
	/** Indlela NAMB = Indlela NAMB */
	public static final String ZZQUALITYASSURANCEBODY_IndlelaNAMB = "Indlela NAMB";
	/** QCTO = QCTO */
	public static final String ZZQUALITYASSURANCEBODY_QCTO = "QCTO";
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
}