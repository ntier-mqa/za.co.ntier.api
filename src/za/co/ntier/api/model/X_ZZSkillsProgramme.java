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

/** Generated Model for ZZSkillsProgramme
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="ZZSkillsProgramme")
public class X_ZZSkillsProgramme extends PO implements I_ZZSkillsProgramme, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20260407L;

    /** Standard Constructor */
    public X_ZZSkillsProgramme (Properties ctx, int ZZSkillsProgramme_ID, String trxName)
    {
      super (ctx, ZZSkillsProgramme_ID, trxName);
      /** if (ZZSkillsProgramme_ID == 0)
        {
			setZZSkillsProgramme_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZSkillsProgramme (Properties ctx, int ZZSkillsProgramme_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZSkillsProgramme_ID, trxName, virtualColumns);
      /** if (ZZSkillsProgramme_ID == 0)
        {
			setZZSkillsProgramme_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZSkillsProgramme (Properties ctx, String ZZSkillsProgramme_UU, String trxName)
    {
      super (ctx, ZZSkillsProgramme_UU, trxName);
      /** if (ZZSkillsProgramme_UU == null)
        {
			setZZSkillsProgramme_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZSkillsProgramme (Properties ctx, String ZZSkillsProgramme_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZSkillsProgramme_UU, trxName, virtualColumns);
      /** if (ZZSkillsProgramme_UU == null)
        {
			setZZSkillsProgramme_ID (0);
        } */
    }

    /** Load Constructor */
    public X_ZZSkillsProgramme (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_ZZSkillsProgramme[")
        .append(get_ID()).append(",Name=").append(getName()).append("]");
      return sb.toString();
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

	/** ABET Level 0 = 1 */
	public static final String ZZAETLEVEL_ABETLevel0 = "1";
	/** ABET Level 1 = 2 */
	public static final String ZZAETLEVEL_ABETLevel1 = "2";
	/** ABET Level 2 = 3 */
	public static final String ZZAETLEVEL_ABETLevel2 = "3";
	/** ABET Level 3 = 4 */
	public static final String ZZAETLEVEL_ABETLevel3 = "4";
	/** ABET Level 4 = 5 */
	public static final String ZZAETLEVEL_ABETLevel4 = "5";
	/** Set AET Level.
		@param ZZAetLevel AET Level
	*/
	public void setZZAetLevel (String ZZAetLevel)
	{

		set_Value (COLUMNNAME_ZZAetLevel, ZZAetLevel);
	}

	/** Get AET Level.
		@return AET Level	  */
	public String getZZAetLevel()
	{
		return (String)get_Value(COLUMNNAME_ZZAetLevel);
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

	/** ZZIsOhs AD_Reference_ID=319 */
	public static final int ZZISOHS_AD_Reference_ID=319;
	/** No = N */
	public static final String ZZISOHS_No = "N";
	/** Yes = Y */
	public static final String ZZISOHS_Yes = "Y";
	/** Set OHS.
		@param ZZIsOhs OHS
	*/
	public void setZZIsOhs (String ZZIsOhs)
	{

		set_Value (COLUMNNAME_ZZIsOhs, ZZIsOhs);
	}

	/** Get OHS.
		@return OHS	  */
	public String getZZIsOhs()
	{
		return (String)get_Value(COLUMNNAME_ZZIsOhs);
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

	/** Below Level 01 = 0 */
	public static final String ZZNQFLEVEL_BelowLevel01 = "0";
	/** Level 01 = 1 */
	public static final String ZZNQFLEVEL_Level01 = "1";
	/** Level 10 = 10 */
	public static final String ZZNQFLEVEL_Level10 = "10";
	/** Level 11 = 11 */
	public static final String ZZNQFLEVEL_Level11 = "11";
	/** Level 02 = 2 */
	public static final String ZZNQFLEVEL_Level02 = "2";
	/** Level 03 = 3 */
	public static final String ZZNQFLEVEL_Level03 = "3";
	/** Level 04 = 4 */
	public static final String ZZNQFLEVEL_Level04 = "4";
	/** Level 05 = 5 */
	public static final String ZZNQFLEVEL_Level05 = "5";
	/** Level 06 = 6 */
	public static final String ZZNQFLEVEL_Level06 = "6";
	/** Level 07 = 7 */
	public static final String ZZNQFLEVEL_Level07 = "7";
	/** Level 08 = 8 */
	public static final String ZZNQFLEVEL_Level08 = "8";
	/** Level 09 = 9 */
	public static final String ZZNQFLEVEL_Level09 = "9";
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

	public I_ZZQualification getZZQualification() throws RuntimeException
	{
		return (I_ZZQualification)MTable.get(getCtx(), I_ZZQualification.Table_ID)
			.getPO(getZZQualification_ID(), get_TrxName());
	}

	/** Set Qualification.
		@param ZZQualification_ID Qualification
	*/
	public void setZZQualification_ID (int ZZQualification_ID)
	{
		if (ZZQualification_ID < 1)
			set_Value (COLUMNNAME_ZZQualification_ID, null);
		else
			set_Value (COLUMNNAME_ZZQualification_ID, Integer.valueOf(ZZQualification_ID));
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

	/** Standalone = 1 */
	public static final String ZZSKILLSPROGRAMMETYPE_Standalone = "1";
	/** Leads to a Qualification = 2 */
	public static final String ZZSKILLSPROGRAMMETYPE_LeadsToAQualification = "2";
	/** Mine Community = 3 */
	public static final String ZZSKILLSPROGRAMMETYPE_MineCommunity = "3";
	/** Small Scale Projects = 4 */
	public static final String ZZSKILLSPROGRAMMETYPE_SmallScaleProjects = "4";
	/** Unemployed Youth Development = 5 */
	public static final String ZZSKILLSPROGRAMMETYPE_UnemployedYouthDevelopment = "5";
	/** Set Skills Programme Type.
		@param ZZSkillsProgrammeType Skills Programme Type
	*/
	public void setZZSkillsProgrammeType (String ZZSkillsProgrammeType)
	{

		set_Value (COLUMNNAME_ZZSkillsProgrammeType, ZZSkillsProgrammeType);
	}

	/** Get Skills Programme Type.
		@return Skills Programme Type	  */
	public String getZZSkillsProgrammeType()
	{
		return (String)get_Value(COLUMNNAME_ZZSkillsProgrammeType);
	}

	/** Set Skills Programme.
		@param ZZSkillsProgramme_ID Skills Programme
	*/
	public void setZZSkillsProgramme_ID (int ZZSkillsProgramme_ID)
	{
		if (ZZSkillsProgramme_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZSkillsProgramme_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZSkillsProgramme_ID, Integer.valueOf(ZZSkillsProgramme_ID));
	}

	/** Get Skills Programme.
		@return Skills Programme	  */
	public int getZZSkillsProgramme_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZSkillsProgramme_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set ZZSkillsProgramme_UU.
		@param ZZSkillsProgramme_UU ZZSkillsProgramme_UU
	*/
	public void setZZSkillsProgramme_UU (String ZZSkillsProgramme_UU)
	{
		set_Value (COLUMNNAME_ZZSkillsProgramme_UU, ZZSkillsProgramme_UU);
	}

	/** Get ZZSkillsProgramme_UU.
		@return ZZSkillsProgramme_UU	  */
	public String getZZSkillsProgramme_UU()
	{
		return (String)get_Value(COLUMNNAME_ZZSkillsProgramme_UU);
	}
}