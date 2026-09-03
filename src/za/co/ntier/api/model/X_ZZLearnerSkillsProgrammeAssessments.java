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

/** Generated Model for ZZLearnerSkillsProgrammeAssessments
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="ZZLearnerSkillsProgrammeAssessments")
public class X_ZZLearnerSkillsProgrammeAssessments extends PO implements I_ZZLearnerSkillsProgrammeAssessments, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20260903L;

    /** Standard Constructor */
    public X_ZZLearnerSkillsProgrammeAssessments (Properties ctx, int ZZLearnerSkillsProgrammeAssessments_ID, String trxName)
    {
      super (ctx, ZZLearnerSkillsProgrammeAssessments_ID, trxName);
      /** if (ZZLearnerSkillsProgrammeAssessments_ID == 0)
        {
			setZZLearnerSkillsProgrammeAssessments_ID (0);
			setZZRPL (false);
// N
        } */
    }

    /** Standard Constructor */
    public X_ZZLearnerSkillsProgrammeAssessments (Properties ctx, int ZZLearnerSkillsProgrammeAssessments_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZLearnerSkillsProgrammeAssessments_ID, trxName, virtualColumns);
      /** if (ZZLearnerSkillsProgrammeAssessments_ID == 0)
        {
			setZZLearnerSkillsProgrammeAssessments_ID (0);
			setZZRPL (false);
// N
        } */
    }

    /** Standard Constructor */
    public X_ZZLearnerSkillsProgrammeAssessments (Properties ctx, String ZZLearnerSkillsProgrammeAssessments_UU, String trxName)
    {
      super (ctx, ZZLearnerSkillsProgrammeAssessments_UU, trxName);
      /** if (ZZLearnerSkillsProgrammeAssessments_UU == null)
        {
			setZZLearnerSkillsProgrammeAssessments_ID (0);
			setZZRPL (false);
// N
        } */
    }

    /** Standard Constructor */
    public X_ZZLearnerSkillsProgrammeAssessments (Properties ctx, String ZZLearnerSkillsProgrammeAssessments_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZLearnerSkillsProgrammeAssessments_UU, trxName, virtualColumns);
      /** if (ZZLearnerSkillsProgrammeAssessments_UU == null)
        {
			setZZLearnerSkillsProgrammeAssessments_ID (0);
			setZZRPL (false);
// N
        } */
    }

    /** Load Constructor */
    public X_ZZLearnerSkillsProgrammeAssessments (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_ZZLearnerSkillsProgrammeAssessments[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Assessment Date.
		@param Assessment_Date ms_learnerqctoskillsprogrammeassessments.assessmentdate
	*/
	public void setAssessment_Date (Timestamp Assessment_Date)
	{
		set_Value (COLUMNNAME_Assessment_Date, Assessment_Date);
	}

	/** Get Assessment Date.
		@return ms_learnerqctoskillsprogrammeassessments.assessmentdate
	  */
	public Timestamp getAssessment_Date()
	{
		return (Timestamp)get_Value(COLUMNNAME_Assessment_Date);
	}

	public org.compiere.model.I_AD_User getAssessor() throws RuntimeException
	{
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_ID)
			.getPO(getAssessor_ID(), get_TrxName());
	}

	/** Set Assessor ID.
		@param Assessor_ID ms_learnerqctoskillsprogrammeassessments.assessorid (ms_user email match)
	*/
	public void setAssessor_ID (int Assessor_ID)
	{
		if (Assessor_ID < 1)
			set_Value (COLUMNNAME_Assessor_ID, null);
		else
			set_Value (COLUMNNAME_Assessor_ID, Integer.valueOf(Assessor_ID));
	}

	/** Get Assessor ID.
		@return ms_learnerqctoskillsprogrammeassessments.assessorid (ms_user email match)
	  */
	public int getAssessor_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Assessor_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Date Assessment Captured.
		@param Date_Assessment_Captured ms_learnerqctoskillsprogrammeassessments.dateassessmentcaptured
	*/
	public void setDate_Assessment_Captured (Timestamp Date_Assessment_Captured)
	{
		set_Value (COLUMNNAME_Date_Assessment_Captured, Date_Assessment_Captured);
	}

	/** Get Date Assessment Captured.
		@return ms_learnerqctoskillsprogrammeassessments.dateassessmentcaptured
	  */
	public Timestamp getDate_Assessment_Captured()
	{
		return (Timestamp)get_Value(COLUMNNAME_Date_Assessment_Captured);
	}

	/** Set Moderation Date.
		@param Moderation_Date ms_learnerqctoskillsprogrammeassessments.moderationdate
	*/
	public void setModeration_Date (Timestamp Moderation_Date)
	{
		set_Value (COLUMNNAME_Moderation_Date, Moderation_Date);
	}

	/** Get Moderation Date.
		@return ms_learnerqctoskillsprogrammeassessments.moderationdate
	  */
	public Timestamp getModeration_Date()
	{
		return (Timestamp)get_Value(COLUMNNAME_Moderation_Date);
	}

	public org.compiere.model.I_AD_User getModerator() throws RuntimeException
	{
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_ID)
			.getPO(getModerator_ID(), get_TrxName());
	}

	/** Set Moderator ID.
		@param Moderator_ID ms_learnerqctoskillsprogrammeassessments.moderatorid (ms_user email match)
	*/
	public void setModerator_ID (int Moderator_ID)
	{
		if (Moderator_ID < 1)
			set_Value (COLUMNNAME_Moderator_ID, null);
		else
			set_Value (COLUMNNAME_Moderator_ID, Integer.valueOf(Moderator_ID));
	}

	/** Get Moderator ID.
		@return ms_learnerqctoskillsprogrammeassessments.moderatorid (ms_user email match)
	  */
	public int getModerator_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Moderator_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Competent = CO */
	public static final String ZZASSESSMENTSTATUS_Competent = "CO";
	/** Not Competent = NC */
	public static final String ZZASSESSMENTSTATUS_NotCompetent = "NC";
	/** Set Assessment Status.
		@param ZZAssessmentStatus Assessment Status
	*/
	public void setZZAssessmentStatus (String ZZAssessmentStatus)
	{

		set_Value (COLUMNNAME_ZZAssessmentStatus, ZZAssessmentStatus);
	}

	/** Get Assessment Status.
		@return Assessment Status	  */
	public String getZZAssessmentStatus()
	{
		return (String)get_Value(COLUMNNAME_ZZAssessmentStatus);
	}

	/** Set Skills Programme Assessments.
		@param ZZLearnerSkillsProgrammeAssessments_ID Skills Programme Assessments
	*/
	public void setZZLearnerSkillsProgrammeAssessments_ID (int ZZLearnerSkillsProgrammeAssessments_ID)
	{
		if (ZZLearnerSkillsProgrammeAssessments_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZLearnerSkillsProgrammeAssessments_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZLearnerSkillsProgrammeAssessments_ID, Integer.valueOf(ZZLearnerSkillsProgrammeAssessments_ID));
	}

	/** Get Skills Programme Assessments.
		@return Skills Programme Assessments	  */
	public int getZZLearnerSkillsProgrammeAssessments_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZLearnerSkillsProgrammeAssessments_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set ZZLearnerSkillsProgrammeAssessments_UU.
		@param ZZLearnerSkillsProgrammeAssessments_UU ZZLearnerSkillsProgrammeAssessments_UU
	*/
	public void setZZLearnerSkillsProgrammeAssessments_UU (String ZZLearnerSkillsProgrammeAssessments_UU)
	{
		set_Value (COLUMNNAME_ZZLearnerSkillsProgrammeAssessments_UU, ZZLearnerSkillsProgrammeAssessments_UU);
	}

	/** Get ZZLearnerSkillsProgrammeAssessments_UU.
		@return ZZLearnerSkillsProgrammeAssessments_UU	  */
	public String getZZLearnerSkillsProgrammeAssessments_UU()
	{
		return (String)get_Value(COLUMNNAME_ZZLearnerSkillsProgrammeAssessments_UU);
	}

	public I_ZZLearnerSkillsProgramme getZZLearnerSkillsProgramme() throws RuntimeException
	{
		return (I_ZZLearnerSkillsProgramme)MTable.get(getCtx(), I_ZZLearnerSkillsProgramme.Table_ID)
			.getPO(getZZLearnerSkillsProgramme_ID(), get_TrxName());
	}

	/** Set Learner Skills Programme.
		@param ZZLearnerSkillsProgramme_ID Learner Skills Programme
	*/
	public void setZZLearnerSkillsProgramme_ID (int ZZLearnerSkillsProgramme_ID)
	{
		if (ZZLearnerSkillsProgramme_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZLearnerSkillsProgramme_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZLearnerSkillsProgramme_ID, Integer.valueOf(ZZLearnerSkillsProgramme_ID));
	}

	/** Get Learner Skills Programme.
		@return Learner Skills Programme	  */
	public int getZZLearnerSkillsProgramme_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZLearnerSkillsProgramme_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set RPL.
		@param ZZRPL RPL
	*/
	public void setZZRPL (boolean ZZRPL)
	{
		set_Value (COLUMNNAME_ZZRPL, Boolean.valueOf(ZZRPL));
	}

	/** Get RPL.
		@return RPL	  */
	public boolean isZZRPL()
	{
		Object oo = get_Value(COLUMNNAME_ZZRPL);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	public I_ZZSkillsProgrammeUnitStandard getZZSkillsProgrammeUnitStandard() throws RuntimeException
	{
		return (I_ZZSkillsProgrammeUnitStandard)MTable.get(getCtx(), I_ZZSkillsProgrammeUnitStandard.Table_ID)
			.getPO(getZZSkillsProgrammeUnitStandard_ID(), get_TrxName());
	}

	/** Set Skills Programme Unit Standard.
		@param ZZSkillsProgrammeUnitStandard_ID Skills Programme Unit Standard
	*/
	public void setZZSkillsProgrammeUnitStandard_ID (int ZZSkillsProgrammeUnitStandard_ID)
	{
		if (ZZSkillsProgrammeUnitStandard_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZSkillsProgrammeUnitStandard_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZSkillsProgrammeUnitStandard_ID, Integer.valueOf(ZZSkillsProgrammeUnitStandard_ID));
	}

	/** Get Skills Programme Unit Standard.
		@return Skills Programme Unit Standard	  */
	public int getZZSkillsProgrammeUnitStandard_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZSkillsProgrammeUnitStandard_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_ZZUnitStandard getZZUnitStandard() throws RuntimeException
	{
		return (I_ZZUnitStandard)MTable.get(getCtx(), I_ZZUnitStandard.Table_ID)
			.getPO(getZZUnitStandard_ID(), get_TrxName());
	}

	/** Set Unit Standard.
		@param ZZUnitStandard_ID Unit Standard
	*/
	public void setZZUnitStandard_ID (int ZZUnitStandard_ID)
	{
		if (ZZUnitStandard_ID < 1)
			set_Value (COLUMNNAME_ZZUnitStandard_ID, null);
		else
			set_Value (COLUMNNAME_ZZUnitStandard_ID, Integer.valueOf(ZZUnitStandard_ID));
	}

	/** Get Unit Standard.
		@return Unit Standard	  */
	public int getZZUnitStandard_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZUnitStandard_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}