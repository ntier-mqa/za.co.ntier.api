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

/** Generated Model for ZZQctoLearnership
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="ZZQctoLearnership")
public class X_ZZQctoLearnership extends PO implements I_ZZQctoLearnership, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20260703L;

    /** Standard Constructor */
    public X_ZZQctoLearnership (Properties ctx, int ZZQctoLearnership_ID, String trxName)
    {
      super (ctx, ZZQctoLearnership_ID, trxName);
      /** if (ZZQctoLearnership_ID == 0)
        {
			setZZQctoLearnership_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZQctoLearnership (Properties ctx, int ZZQctoLearnership_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZQctoLearnership_ID, trxName, virtualColumns);
      /** if (ZZQctoLearnership_ID == 0)
        {
			setZZQctoLearnership_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZQctoLearnership (Properties ctx, String ZZQctoLearnership_UU, String trxName)
    {
      super (ctx, ZZQctoLearnership_UU, trxName);
      /** if (ZZQctoLearnership_UU == null)
        {
			setZZQctoLearnership_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZQctoLearnership (Properties ctx, String ZZQctoLearnership_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZQctoLearnership_UU, trxName, virtualColumns);
      /** if (ZZQctoLearnership_UU == null)
        {
			setZZQctoLearnership_ID (0);
        } */
    }

    /** Load Constructor */
    public X_ZZQctoLearnership (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_ZZQctoLearnership[")
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

	/** ZZArtisanLearnership AD_Reference_ID=319 */
	public static final int ZZARTISANLEARNERSHIP_AD_Reference_ID=319;
	/** No = N */
	public static final String ZZARTISANLEARNERSHIP_No = "N";
	/** Yes = Y */
	public static final String ZZARTISANLEARNERSHIP_Yes = "Y";
	/** Set Artisan Learnership.
		@param ZZArtisanLearnership Artisan Learnership
	*/
	public void setZZArtisanLearnership (String ZZArtisanLearnership)
	{

		set_Value (COLUMNNAME_ZZArtisanLearnership, ZZArtisanLearnership);
	}

	/** Get Artisan Learnership.
		@return Artisan Learnership	  */
	public String getZZArtisanLearnership()
	{
		return (String)get_Value(COLUMNNAME_ZZArtisanLearnership);
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

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair()
    {
        return new KeyNamePair(get_ID(), getZZLearnershipTitle());
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

	/** Part Qualification = Part Qualification */
	public static final String ZZQCTOLEARNERSHIPTYPE_PartQualification = "Part Qualification";
	/** Qualification = Qualification */
	public static final String ZZQCTOLEARNERSHIPTYPE_Qualification = "Qualification";
	/** Set QCTO Learnership Type.
		@param ZZQctoLearnershipType QCTO Learnership Type
	*/
	public void setZZQctoLearnershipType (String ZZQctoLearnershipType)
	{

		set_Value (COLUMNNAME_ZZQctoLearnershipType, ZZQctoLearnershipType);
	}

	/** Get QCTO Learnership Type.
		@return QCTO Learnership Type	  */
	public String getZZQctoLearnershipType()
	{
		return (String)get_Value(COLUMNNAME_ZZQctoLearnershipType);
	}

	/** Set QCTO Learnership.
		@param ZZQctoLearnership_ID QCTO Learnership
	*/
	public void setZZQctoLearnership_ID (int ZZQctoLearnership_ID)
	{
		if (ZZQctoLearnership_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZQctoLearnership_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZQctoLearnership_ID, Integer.valueOf(ZZQctoLearnership_ID));
	}

	/** Get QCTO Learnership.
		@return QCTO Learnership	  */
	public int getZZQctoLearnership_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZQctoLearnership_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set ZZQctoLearnership_UU.
		@param ZZQctoLearnership_UU ZZQctoLearnership_UU
	*/
	public void setZZQctoLearnership_UU (String ZZQctoLearnership_UU)
	{
		set_Value (COLUMNNAME_ZZQctoLearnership_UU, ZZQctoLearnership_UU);
	}

	/** Get ZZQctoLearnership_UU.
		@return ZZQctoLearnership_UU	  */
	public String getZZQctoLearnership_UU()
	{
		return (String)get_Value(COLUMNNAME_ZZQctoLearnership_UU);
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
}