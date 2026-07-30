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

/** Generated Model for ZZLearnership
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="ZZLearnership")
public class X_ZZLearnership extends PO implements I_ZZLearnership, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20260730L;

    /** Standard Constructor */
    public X_ZZLearnership (Properties ctx, int ZZLearnership_ID, String trxName)
    {
      super (ctx, ZZLearnership_ID, trxName);
      /** if (ZZLearnership_ID == 0)
        {
			setZZLearnership_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZLearnership (Properties ctx, int ZZLearnership_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZLearnership_ID, trxName, virtualColumns);
      /** if (ZZLearnership_ID == 0)
        {
			setZZLearnership_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZLearnership (Properties ctx, String ZZLearnership_UU, String trxName)
    {
      super (ctx, ZZLearnership_UU, trxName);
      /** if (ZZLearnership_UU == null)
        {
			setZZLearnership_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZLearnership (Properties ctx, String ZZLearnership_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZLearnership_UU, trxName, virtualColumns);
      /** if (ZZLearnership_UU == null)
        {
			setZZLearnership_ID (0);
        } */
    }

    /** Load Constructor */
    public X_ZZLearnership (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_ZZLearnership[")
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

	/** Set Learnership Code.
		@param ZZLearnershipCode Learnership Code
	*/
	public void setZZLearnershipCode (String ZZLearnershipCode)
	{
		set_Value (COLUMNNAME_ZZLearnershipCode, ZZLearnershipCode);
	}

	/** Get Learnership Code.
		@return Learnership Code	  */
	public String getZZLearnershipCode()
	{
		return (String)get_Value(COLUMNNAME_ZZLearnershipCode);
	}

	/** Set Learnership Title.
		@param ZZLearnershipTitle Learnership Title
	*/
	public void setZZLearnershipTitle (String ZZLearnershipTitle)
	{
		set_Value (COLUMNNAME_ZZLearnershipTitle, ZZLearnershipTitle);
	}

	/** Get Learnership Title.
		@return Learnership Title	  */
	public String getZZLearnershipTitle()
	{
		return (String)get_Value(COLUMNNAME_ZZLearnershipTitle);
	}

	/** Non MQA learnership = Non MQA learnership */
	public static final String ZZLEARNERSHIPTYPE_NonMQALearnership = "Non MQA learnership";
	/** Qualification Compulsory Electives = Qualification Compulsory Electives */
	public static final String ZZLEARNERSHIPTYPE_QualificationCompulsoryElectives = "Qualification Compulsory Electives";
	/** Qualification Electives = Qualification Electives */
	public static final String ZZLEARNERSHIPTYPE_QualificationElectives = "Qualification Electives";
	/** Standard Qualification = Standard Qualification */
	public static final String ZZLEARNERSHIPTYPE_StandardQualification = "Standard Qualification";
	/** Set Learnership Type.
		@param ZZLearnershipType Learnership Type
	*/
	public void setZZLearnershipType (String ZZLearnershipType)
	{

		set_Value (COLUMNNAME_ZZLearnershipType, ZZLearnershipType);
	}

	/** Get Learnership Type.
		@return Learnership Type	  */
	public String getZZLearnershipType()
	{
		return (String)get_Value(COLUMNNAME_ZZLearnershipType);
	}

	/** Set Learnership.
		@param ZZLearnership_ID Learnership
	*/
	public void setZZLearnership_ID (int ZZLearnership_ID)
	{
		if (ZZLearnership_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZLearnership_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZLearnership_ID, Integer.valueOf(ZZLearnership_ID));
	}

	/** Get Learnership.
		@return Learnership	  */
	public int getZZLearnership_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZLearnership_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set ZZLearnership_UU.
		@param ZZLearnership_UU ZZLearnership_UU
	*/
	public void setZZLearnership_UU (String ZZLearnership_UU)
	{
		set_Value (COLUMNNAME_ZZLearnership_UU, ZZLearnership_UU);
	}

	/** Get ZZLearnership_UU.
		@return ZZLearnership_UU	  */
	public String getZZLearnership_UU()
	{
		return (String)get_Value(COLUMNNAME_ZZLearnership_UU);
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