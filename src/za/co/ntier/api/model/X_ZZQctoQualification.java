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

/** Generated Model for ZZQctoQualification
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="ZZQctoQualification")
public class X_ZZQctoQualification extends PO implements I_ZZQctoQualification, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20260609L;

    /** Standard Constructor */
    public X_ZZQctoQualification (Properties ctx, int ZZQctoQualification_ID, String trxName)
    {
      super (ctx, ZZQctoQualification_ID, trxName);
      /** if (ZZQctoQualification_ID == 0)
        {
			setZZQctoQualification_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZQctoQualification (Properties ctx, int ZZQctoQualification_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZQctoQualification_ID, trxName, virtualColumns);
      /** if (ZZQctoQualification_ID == 0)
        {
			setZZQctoQualification_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZQctoQualification (Properties ctx, String ZZQctoQualification_UU, String trxName)
    {
      super (ctx, ZZQctoQualification_UU, trxName);
      /** if (ZZQctoQualification_UU == null)
        {
			setZZQctoQualification_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZQctoQualification (Properties ctx, String ZZQctoQualification_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZQctoQualification_UU, trxName, virtualColumns);
      /** if (ZZQctoQualification_UU == null)
        {
			setZZQctoQualification_ID (0);
        } */
    }

    /** Load Constructor */
    public X_ZZQctoQualification (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_ZZQctoQualification[")
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

	/** ZZArtisanQualification AD_Reference_ID=319 */
	public static final int ZZARTISANQUALIFICATION_AD_Reference_ID=319;
	/** No = N */
	public static final String ZZARTISANQUALIFICATION_No = "N";
	/** Yes = Y */
	public static final String ZZARTISANQUALIFICATION_Yes = "Y";
	/** Set Artisan Qualification.
		@param ZZArtisanQualification Artisan Qualification
	*/
	public void setZZArtisanQualification (String ZZArtisanQualification)
	{

		set_Value (COLUMNNAME_ZZArtisanQualification, ZZArtisanQualification);
	}

	/** Get Artisan Qualification.
		@return Artisan Qualification	  */
	public String getZZArtisanQualification()
	{
		return (String)get_Value(COLUMNNAME_ZZArtisanQualification);
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

	/** Part Qualification = Part Qualification */
	public static final String ZZQCTOQUALIFICATIONTYPE_PartQualification = "Part Qualification";
	/** Qualification = Qualification */
	public static final String ZZQCTOQUALIFICATIONTYPE_Qualification = "Qualification";
	/** Set QCTO Qualification Type.
		@param ZZQctoQualificationType QCTO Qualification Type
	*/
	public void setZZQctoQualificationType (String ZZQctoQualificationType)
	{

		set_Value (COLUMNNAME_ZZQctoQualificationType, ZZQctoQualificationType);
	}

	/** Get QCTO Qualification Type.
		@return QCTO Qualification Type	  */
	public String getZZQctoQualificationType()
	{
		return (String)get_Value(COLUMNNAME_ZZQctoQualificationType);
	}

	/** Set QCTO Qualification.
		@param ZZQctoQualification_ID QCTO Qualification
	*/
	public void setZZQctoQualification_ID (int ZZQctoQualification_ID)
	{
		if (ZZQctoQualification_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZQctoQualification_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZQctoQualification_ID, Integer.valueOf(ZZQctoQualification_ID));
	}

	/** Get QCTO Qualification.
		@return QCTO Qualification	  */
	public int getZZQctoQualification_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZQctoQualification_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set ZZQctoQualification_UU.
		@param ZZQctoQualification_UU ZZQctoQualification_UU
	*/
	public void setZZQctoQualification_UU (String ZZQctoQualification_UU)
	{
		set_Value (COLUMNNAME_ZZQctoQualification_UU, ZZQctoQualification_UU);
	}

	/** Get ZZQctoQualification_UU.
		@return ZZQctoQualification_UU	  */
	public String getZZQctoQualification_UU()
	{
		return (String)get_Value(COLUMNNAME_ZZQctoQualification_UU);
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
}