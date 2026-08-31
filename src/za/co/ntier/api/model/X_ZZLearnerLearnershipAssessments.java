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

/** Generated Model for ZZLearnerLearnershipAssessments
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="ZZLearnerLearnershipAssessments")
public class X_ZZLearnerLearnershipAssessments extends PO implements I_ZZLearnerLearnershipAssessments, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20260831L;

    /** Standard Constructor */
    public X_ZZLearnerLearnershipAssessments (Properties ctx, int ZZLearnerLearnershipAssessments_ID, String trxName)
    {
      super (ctx, ZZLearnerLearnershipAssessments_ID, trxName);
      /** if (ZZLearnerLearnershipAssessments_ID == 0)
        {
			setZZIsPartialApproved (false);
// N
			setZZIsPreviouslyAchieved (false);
// N
			setZZLearnerLearnershipAssessments_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZLearnerLearnershipAssessments (Properties ctx, int ZZLearnerLearnershipAssessments_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZLearnerLearnershipAssessments_ID, trxName, virtualColumns);
      /** if (ZZLearnerLearnershipAssessments_ID == 0)
        {
			setZZIsPartialApproved (false);
// N
			setZZIsPreviouslyAchieved (false);
// N
			setZZLearnerLearnershipAssessments_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZLearnerLearnershipAssessments (Properties ctx, String ZZLearnerLearnershipAssessments_UU, String trxName)
    {
      super (ctx, ZZLearnerLearnershipAssessments_UU, trxName);
      /** if (ZZLearnerLearnershipAssessments_UU == null)
        {
			setZZIsPartialApproved (false);
// N
			setZZIsPreviouslyAchieved (false);
// N
			setZZLearnerLearnershipAssessments_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZLearnerLearnershipAssessments (Properties ctx, String ZZLearnerLearnershipAssessments_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZLearnerLearnershipAssessments_UU, trxName, virtualColumns);
      /** if (ZZLearnerLearnershipAssessments_UU == null)
        {
			setZZIsPartialApproved (false);
// N
			setZZIsPreviouslyAchieved (false);
// N
			setZZLearnerLearnershipAssessments_ID (0);
        } */
    }

    /** Load Constructor */
    public X_ZZLearnerLearnershipAssessments (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_ZZLearnerLearnershipAssessments[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public I_Assessment_Status getAssessment_Status() throws RuntimeException
	{
		return (I_Assessment_Status)MTable.get(getCtx(), I_Assessment_Status.Table_ID)
			.getPO(getAssessment_Status_ID(), get_TrxName());
	}

	/** Set Assessment Status.
		@param Assessment_Status_ID Assessment Status
	*/
	public void setAssessment_Status_ID (int Assessment_Status_ID)
	{
		if (Assessment_Status_ID < 1)
			set_Value (COLUMNNAME_Assessment_Status_ID, null);
		else
			set_Value (COLUMNNAME_Assessment_Status_ID, Integer.valueOf(Assessment_Status_ID));
	}

	/** Get Assessment Status.
		@return Assessment Status	  */
	public int getAssessment_Status_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Assessment_Status_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Assessment Date.
		@param ZZAssessmentDate Assessment Date
	*/
	public void setZZAssessmentDate (Timestamp ZZAssessmentDate)
	{
		set_Value (COLUMNNAME_ZZAssessmentDate, ZZAssessmentDate);
	}

	/** Get Assessment Date.
		@return Assessment Date	  */
	public Timestamp getZZAssessmentDate()
	{
		return (Timestamp)get_Value(COLUMNNAME_ZZAssessmentDate);
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

	public org.compiere.model.I_AD_User getZZAssessorPerson() throws RuntimeException
	{
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_ID)
			.getPO(getZZAssessorPerson_ID(), get_TrxName());
	}

	/** Set Assessor Person.
		@param ZZAssessorPerson_ID Assessor Person
	*/
	public void setZZAssessorPerson_ID (int ZZAssessorPerson_ID)
	{
		if (ZZAssessorPerson_ID < 1)
			set_Value (COLUMNNAME_ZZAssessorPerson_ID, null);
		else
			set_Value (COLUMNNAME_ZZAssessorPerson_ID, Integer.valueOf(ZZAssessorPerson_ID));
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

	/** Set Date Assessment Captured.
		@param ZZDateAssessmentCaptured Date Assessment Captured
	*/
	public void setZZDateAssessmentCaptured (Timestamp ZZDateAssessmentCaptured)
	{
		set_Value (COLUMNNAME_ZZDateAssessmentCaptured, ZZDateAssessmentCaptured);
	}

	/** Get Date Assessment Captured.
		@return Date Assessment Captured	  */
	public Timestamp getZZDateAssessmentCaptured()
	{
		return (Timestamp)get_Value(COLUMNNAME_ZZDateAssessmentCaptured);
	}

	/** Set Date Partial Approved.
		@param ZZDatePartialApproved Date Partial Approved
	*/
	public void setZZDatePartialApproved (Timestamp ZZDatePartialApproved)
	{
		set_Value (COLUMNNAME_ZZDatePartialApproved, ZZDatePartialApproved);
	}

	/** Get Date Partial Approved.
		@return Date Partial Approved	  */
	public Timestamp getZZDatePartialApproved()
	{
		return (Timestamp)get_Value(COLUMNNAME_ZZDatePartialApproved);
	}

	/** Set ZZIsPartialApproved.
		@param ZZIsPartialApproved ms_learnerlearnershipassessments.ispartialapproved
	*/
	public void setZZIsPartialApproved (boolean ZZIsPartialApproved)
	{
		set_Value (COLUMNNAME_ZZIsPartialApproved, Boolean.valueOf(ZZIsPartialApproved));
	}

	/** Get ZZIsPartialApproved.
		@return ms_learnerlearnershipassessments.ispartialapproved
	  */
	public boolean isZZIsPartialApproved()
	{
		Object oo = get_Value(COLUMNNAME_ZZIsPartialApproved);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set ZZIsPreviouslyAchieved.
		@param ZZIsPreviouslyAchieved ms_learnerlearnershipassessments.ispreviouslyachieved
	*/
	public void setZZIsPreviouslyAchieved (boolean ZZIsPreviouslyAchieved)
	{
		set_Value (COLUMNNAME_ZZIsPreviouslyAchieved, Boolean.valueOf(ZZIsPreviouslyAchieved));
	}

	/** Get ZZIsPreviouslyAchieved.
		@return ms_learnerlearnershipassessments.ispreviouslyachieved
	  */
	public boolean isZZIsPreviouslyAchieved()
	{
		Object oo = get_Value(COLUMNNAME_ZZIsPreviouslyAchieved);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set ZZLearnerLearnershipAssessments.
		@param ZZLearnerLearnershipAssessments_ID ZZLearnerLearnershipAssessments
	*/
	public void setZZLearnerLearnershipAssessments_ID (int ZZLearnerLearnershipAssessments_ID)
	{
		if (ZZLearnerLearnershipAssessments_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZLearnerLearnershipAssessments_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZLearnerLearnershipAssessments_ID, Integer.valueOf(ZZLearnerLearnershipAssessments_ID));
	}

	/** Get ZZLearnerLearnershipAssessments.
		@return ZZLearnerLearnershipAssessments	  */
	public int getZZLearnerLearnershipAssessments_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZLearnerLearnershipAssessments_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set ZZLearnerLearnershipAssessments_UU.
		@param ZZLearnerLearnershipAssessments_UU ZZLearnerLearnershipAssessments_UU
	*/
	public void setZZLearnerLearnershipAssessments_UU (String ZZLearnerLearnershipAssessments_UU)
	{
		set_Value (COLUMNNAME_ZZLearnerLearnershipAssessments_UU, ZZLearnerLearnershipAssessments_UU);
	}

	/** Get ZZLearnerLearnershipAssessments_UU.
		@return ZZLearnerLearnershipAssessments_UU	  */
	public String getZZLearnerLearnershipAssessments_UU()
	{
		return (String)get_Value(COLUMNNAME_ZZLearnerLearnershipAssessments_UU);
	}

	public I_ZZLearnerLearnership getZZLearnerLearnership() throws RuntimeException
	{
		return (I_ZZLearnerLearnership)MTable.get(getCtx(), I_ZZLearnerLearnership.Table_ID)
			.getPO(getZZLearnerLearnership_ID(), get_TrxName());
	}

	/** Set Learner Learnership.
		@param ZZLearnerLearnership_ID Learner Learnership
	*/
	public void setZZLearnerLearnership_ID (int ZZLearnerLearnership_ID)
	{
		if (ZZLearnerLearnership_ID < 1)
			set_Value (COLUMNNAME_ZZLearnerLearnership_ID, null);
		else
			set_Value (COLUMNNAME_ZZLearnerLearnership_ID, Integer.valueOf(ZZLearnerLearnership_ID));
	}

	/** Get Learner Learnership.
		@return Learner Learnership	  */
	public int getZZLearnerLearnership_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZLearnerLearnership_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Moderation Date.
		@param ZZModerationDate Moderation Date
	*/
	public void setZZModerationDate (Timestamp ZZModerationDate)
	{
		set_Value (COLUMNNAME_ZZModerationDate, ZZModerationDate);
	}

	/** Get Moderation Date.
		@return Moderation Date	  */
	public Timestamp getZZModerationDate()
	{
		return (Timestamp)get_Value(COLUMNNAME_ZZModerationDate);
	}

	public org.compiere.model.I_AD_User getZZModerator() throws RuntimeException
	{
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_ID)
			.getPO(getZZModerator_ID(), get_TrxName());
	}

	/** Set Moderator.
		@param ZZModerator_ID Moderator
	*/
	public void setZZModerator_ID (int ZZModerator_ID)
	{
		if (ZZModerator_ID < 1)
			set_Value (COLUMNNAME_ZZModerator_ID, null);
		else
			set_Value (COLUMNNAME_ZZModerator_ID, Integer.valueOf(ZZModerator_ID));
	}

	/** Get Moderator.
		@return Moderator	  */
	public int getZZModerator_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZModerator_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_AD_User getZZPartialApprove() throws RuntimeException
	{
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_ID)
			.getPO(getZZPartialApprovedBy(), get_TrxName());
	}

	/** Set ZZPartialApprovedBy.
		@param ZZPartialApprovedBy ms_learnerlearnershipassessments.partialapprovedby (ms_user email match)
	*/
	public void setZZPartialApprovedBy (int ZZPartialApprovedBy)
	{
		set_Value (COLUMNNAME_ZZPartialApprovedBy, Integer.valueOf(ZZPartialApprovedBy));
	}

	/** Get ZZPartialApprovedBy.
		@return ms_learnerlearnershipassessments.partialapprovedby (ms_user email match)
	  */
	public int getZZPartialApprovedBy()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZPartialApprovedBy);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** ZZRPL AD_Reference_ID=319 */
	public static final int ZZRPL_AD_Reference_ID=319;
	/** No = N */
	public static final String ZZRPL_No = "N";
	/** Yes = Y */
	public static final String ZZRPL_Yes = "Y";
	/** Set RPL.
		@param ZZRPL RPL
	*/
	public void setZZRPL (String ZZRPL)
	{

		set_Value (COLUMNNAME_ZZRPL, ZZRPL);
	}

	/** Get RPL.
		@return RPL	  */
	public String getZZRPL()
	{
		return (String)get_Value(COLUMNNAME_ZZRPL);
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

	/** Set id.
		@param id id
	*/
	public void setid (int id)
	{
		set_Value (COLUMNNAME_id, Integer.valueOf(id));
	}

	/** Get id.
		@return id	  */
	public int getid()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_id);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}