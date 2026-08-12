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

/** Generated Model for C_BP_SkillsProgramme
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="C_BP_SkillsProgramme")
public class X_C_BP_SkillsProgramme extends PO implements I_C_BP_SkillsProgramme, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20260812L;

    /** Standard Constructor */
    public X_C_BP_SkillsProgramme (Properties ctx, int C_BP_SkillsProgramme_ID, String trxName)
    {
      super (ctx, C_BP_SkillsProgramme_ID, trxName);
      /** if (C_BP_SkillsProgramme_ID == 0)
        {
        } */
    }

    /** Standard Constructor */
    public X_C_BP_SkillsProgramme (Properties ctx, int C_BP_SkillsProgramme_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, C_BP_SkillsProgramme_ID, trxName, virtualColumns);
      /** if (C_BP_SkillsProgramme_ID == 0)
        {
        } */
    }

    /** Standard Constructor */
    public X_C_BP_SkillsProgramme (Properties ctx, String C_BP_SkillsProgramme_UU, String trxName)
    {
      super (ctx, C_BP_SkillsProgramme_UU, trxName);
      /** if (C_BP_SkillsProgramme_UU == null)
        {
        } */
    }

    /** Standard Constructor */
    public X_C_BP_SkillsProgramme (Properties ctx, String C_BP_SkillsProgramme_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, C_BP_SkillsProgramme_UU, trxName, virtualColumns);
      /** if (C_BP_SkillsProgramme_UU == null)
        {
        } */
    }

    /** Load Constructor */
    public X_C_BP_SkillsProgramme (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_C_BP_SkillsProgramme[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Skills.
		@param C_BP_SkillsProgramme_ID Skills
	*/
	public void setC_BP_SkillsProgramme_ID (int C_BP_SkillsProgramme_ID)
	{
		if (C_BP_SkillsProgramme_ID < 1)
			set_ValueNoCheck (COLUMNNAME_C_BP_SkillsProgramme_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_C_BP_SkillsProgramme_ID, Integer.valueOf(C_BP_SkillsProgramme_ID));
	}

	/** Get Skills.
		@return Skills	  */
	public int getC_BP_SkillsProgramme_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_BP_SkillsProgramme_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set C_BP_SkillsProgramme_UU.
		@param C_BP_SkillsProgramme_UU C_BP_SkillsProgramme_UU
	*/
	public void setC_BP_SkillsProgramme_UU (String C_BP_SkillsProgramme_UU)
	{
		set_ValueNoCheck (COLUMNNAME_C_BP_SkillsProgramme_UU, C_BP_SkillsProgramme_UU);
	}

	/** Get C_BP_SkillsProgramme_UU.
		@return C_BP_SkillsProgramme_UU	  */
	public String getC_BP_SkillsProgramme_UU()
	{
		return (String)get_Value(COLUMNNAME_C_BP_SkillsProgramme_UU);
	}

	public org.compiere.model.I_C_BPartner getC_BPartner() throws RuntimeException
	{
		return (org.compiere.model.I_C_BPartner)MTable.get(getCtx(), org.compiere.model.I_C_BPartner.Table_ID)
			.getPO(getC_BPartner_ID(), get_TrxName());
	}

	/** Set Business Partner.
		@param C_BPartner_ID Identifies a Business Partner
	*/
	public void setC_BPartner_ID (int C_BPartner_ID)
	{
		if (C_BPartner_ID < 1)
			set_ValueNoCheck (COLUMNNAME_C_BPartner_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_C_BPartner_ID, Integer.valueOf(C_BPartner_ID));
	}

	/** Get Business Partner.
		@return Identifies a Business Partner
	  */
	public int getC_BPartner_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartner_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	/** Set QCTO Skills Programme.
		@param ZZQctoSkillsProgramme_ID QCTO Skills Programme
	*/
	public void setZZQctoSkillsProgramme_ID (int ZZQctoSkillsProgramme_ID)
	{
		if (ZZQctoSkillsProgramme_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZQctoSkillsProgramme_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZQctoSkillsProgramme_ID, Integer.valueOf(ZZQctoSkillsProgramme_ID));
	}

	/** Get QCTO Skills Programme.
		@return QCTO Skills Programme	  */
	public int getZZQctoSkillsProgramme_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZQctoSkillsProgramme_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	/** Set Accreditation Number.
		@param ZZ_AccreditationNumber Accreditation Number
	*/
	public void setZZ_AccreditationNumber (String ZZ_AccreditationNumber)
	{
		set_Value (COLUMNNAME_ZZ_AccreditationNumber, ZZ_AccreditationNumber);
	}

	/** Get Accreditation Number.
		@return Accreditation Number	  */
	public String getZZ_AccreditationNumber()
	{
		return (String)get_Value(COLUMNNAME_ZZ_AccreditationNumber);
	}

	/** Accredited = AC */
	public static final String ZZ_STATUS_Accredited = "AC";
	/** De-Accredited = DA */
	public static final String ZZ_STATUS_De_Accredited = "DA";
	/** Set Status.
		@param ZZ_Status Status
	*/
	public void setZZ_Status (String ZZ_Status)
	{

		set_Value (COLUMNNAME_ZZ_Status, ZZ_Status);
	}

	/** Get Status.
		@return Status	  */
	public String getZZ_Status()
	{
		return (String)get_Value(COLUMNNAME_ZZ_Status);
	}
}