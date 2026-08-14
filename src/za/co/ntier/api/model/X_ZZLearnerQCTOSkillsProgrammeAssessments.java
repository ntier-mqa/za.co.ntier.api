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

/** Generated Model for ZZLearnerQCTOSkillsProgrammeAssessments
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="ZZLearnerQCTOSkillsProgrammeAssessments")
public class X_ZZLearnerQCTOSkillsProgrammeAssessments extends PO implements I_ZZLearnerQCTOSkillsProgrammeAssessments, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20260814L;

    /** Standard Constructor */
    public X_ZZLearnerQCTOSkillsProgrammeAssessments (Properties ctx, int ZZLearnerQCTOSkillsProgrammeAssessments_ID, String trxName)
    {
      super (ctx, ZZLearnerQCTOSkillsProgrammeAssessments_ID, trxName);
      /** if (ZZLearnerQCTOSkillsProgrammeAssessments_ID == 0)
        {
			setIs_Partial_Approved (false);
// N
			setIs_Previously_Achieved (false);
// N
			setZZLearnerQCTOSkillsProgrammeAssessments_ID (0);
			setZZRPL (false);
// N
        } */
    }

    /** Standard Constructor */
    public X_ZZLearnerQCTOSkillsProgrammeAssessments (Properties ctx, int ZZLearnerQCTOSkillsProgrammeAssessments_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZLearnerQCTOSkillsProgrammeAssessments_ID, trxName, virtualColumns);
      /** if (ZZLearnerQCTOSkillsProgrammeAssessments_ID == 0)
        {
			setIs_Partial_Approved (false);
// N
			setIs_Previously_Achieved (false);
// N
			setZZLearnerQCTOSkillsProgrammeAssessments_ID (0);
			setZZRPL (false);
// N
        } */
    }

    /** Standard Constructor */
    public X_ZZLearnerQCTOSkillsProgrammeAssessments (Properties ctx, String ZZLearnerQCTOSkillsProgrammeAssessments_UU, String trxName)
    {
      super (ctx, ZZLearnerQCTOSkillsProgrammeAssessments_UU, trxName);
      /** if (ZZLearnerQCTOSkillsProgrammeAssessments_UU == null)
        {
			setIs_Partial_Approved (false);
// N
			setIs_Previously_Achieved (false);
// N
			setZZLearnerQCTOSkillsProgrammeAssessments_ID (0);
			setZZRPL (false);
// N
        } */
    }

    /** Standard Constructor */
    public X_ZZLearnerQCTOSkillsProgrammeAssessments (Properties ctx, String ZZLearnerQCTOSkillsProgrammeAssessments_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZLearnerQCTOSkillsProgrammeAssessments_UU, trxName, virtualColumns);
      /** if (ZZLearnerQCTOSkillsProgrammeAssessments_UU == null)
        {
			setIs_Partial_Approved (false);
// N
			setIs_Previously_Achieved (false);
// N
			setZZLearnerQCTOSkillsProgrammeAssessments_ID (0);
			setZZRPL (false);
// N
        } */
    }

    /** Load Constructor */
    public X_ZZLearnerQCTOSkillsProgrammeAssessments (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_ZZLearnerQCTOSkillsProgrammeAssessments[")
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

	/** Set Date Partial Approved.
		@param Date_Partial_Approved ms_learnerqctolearnershipassessments.datepartialapproved
	*/
	public void setDate_Partial_Approved (Timestamp Date_Partial_Approved)
	{
		set_Value (COLUMNNAME_Date_Partial_Approved, Date_Partial_Approved);
	}

	/** Get Date Partial Approved.
		@return ms_learnerqctolearnershipassessments.datepartialapproved
	  */
	public Timestamp getDate_Partial_Approved()
	{
		return (Timestamp)get_Value(COLUMNNAME_Date_Partial_Approved);
	}

	/** Set Is Partial Approved.
		@param Is_Partial_Approved ms_learnerqctolearnershipassessments.ispartialapproved
	*/
	public void setIs_Partial_Approved (boolean Is_Partial_Approved)
	{
		set_Value (COLUMNNAME_Is_Partial_Approved, Boolean.valueOf(Is_Partial_Approved));
	}

	/** Get Is Partial Approved.
		@return ms_learnerqctolearnershipassessments.ispartialapproved
	  */
	public boolean is_Partial_Approved()
	{
		Object oo = get_Value(COLUMNNAME_Is_Partial_Approved);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Is Previously Achieved.
		@param Is_Previously_Achieved ms_learnerqctolearnershipassessments.ispreviouslyachieved
	*/
	public void setIs_Previously_Achieved (boolean Is_Previously_Achieved)
	{
		set_Value (COLUMNNAME_Is_Previously_Achieved, Boolean.valueOf(Is_Previously_Achieved));
	}

	/** Get Is Previously Achieved.
		@return ms_learnerqctolearnershipassessments.ispreviouslyachieved
	  */
	public boolean is_Previously_Achieved()
	{
		Object oo = get_Value(COLUMNNAME_Is_Previously_Achieved);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
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

	public org.compiere.model.I_AD_User getPartial_Approved() throws RuntimeException
	{
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_ID)
			.getPO(getPartial_Approved_By(), get_TrxName());
	}

	/** Set Partial Approved By.
		@param Partial_Approved_By ms_learnerqctolearnershipassessments.partialapprovedby (ms_user email match)
	*/
	public void setPartial_Approved_By (int Partial_Approved_By)
	{
		set_Value (COLUMNNAME_Partial_Approved_By, Integer.valueOf(Partial_Approved_By));
	}

	/** Get Partial Approved By.
		@return ms_learnerqctolearnershipassessments.partialapprovedby (ms_user email match)
	  */
	public int getPartial_Approved_By()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Partial_Approved_By);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set ZZLearnerQCTOSkillsProgrammeAssessments.
		@param ZZLearnerQCTOSkillsProgrammeAssessments_ID ZZLearnerQCTOSkillsProgrammeAssessments
	*/
	public void setZZLearnerQCTOSkillsProgrammeAssessments_ID (int ZZLearnerQCTOSkillsProgrammeAssessments_ID)
	{
		if (ZZLearnerQCTOSkillsProgrammeAssessments_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZLearnerQCTOSkillsProgrammeAssessments_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZLearnerQCTOSkillsProgrammeAssessments_ID, Integer.valueOf(ZZLearnerQCTOSkillsProgrammeAssessments_ID));
	}

	/** Get ZZLearnerQCTOSkillsProgrammeAssessments.
		@return ZZLearnerQCTOSkillsProgrammeAssessments	  */
	public int getZZLearnerQCTOSkillsProgrammeAssessments_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZLearnerQCTOSkillsProgrammeAssessments_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set ZZLearnerQCTOSkillsProgrammeAssessments_UU.
		@param ZZLearnerQCTOSkillsProgrammeAssessments_UU ZZLearnerQCTOSkillsProgrammeAssessments_UU
	*/
	public void setZZLearnerQCTOSkillsProgrammeAssessments_UU (String ZZLearnerQCTOSkillsProgrammeAssessments_UU)
	{
		set_Value (COLUMNNAME_ZZLearnerQCTOSkillsProgrammeAssessments_UU, ZZLearnerQCTOSkillsProgrammeAssessments_UU);
	}

	/** Get ZZLearnerQCTOSkillsProgrammeAssessments_UU.
		@return ZZLearnerQCTOSkillsProgrammeAssessments_UU	  */
	public String getZZLearnerQCTOSkillsProgrammeAssessments_UU()
	{
		return (String)get_Value(COLUMNNAME_ZZLearnerQCTOSkillsProgrammeAssessments_UU);
	}

	public I_ZZLearnerQCTOSkillsProgramme getZZLearnerQCTOSkillsProgramme() throws RuntimeException
	{
		return (I_ZZLearnerQCTOSkillsProgramme)MTable.get(getCtx(), I_ZZLearnerQCTOSkillsProgramme.Table_ID)
			.getPO(getZZLearnerQCTOSkillsProgramme_ID(), get_TrxName());
	}

	/** Set Learner QCTOSkills Programme.
		@param ZZLearnerQCTOSkillsProgramme_ID Learner QCTOSkills Programme
	*/
	public void setZZLearnerQCTOSkillsProgramme_ID (int ZZLearnerQCTOSkillsProgramme_ID)
	{
		if (ZZLearnerQCTOSkillsProgramme_ID < 1)
			set_Value (COLUMNNAME_ZZLearnerQCTOSkillsProgramme_ID, null);
		else
			set_Value (COLUMNNAME_ZZLearnerQCTOSkillsProgramme_ID, Integer.valueOf(ZZLearnerQCTOSkillsProgramme_ID));
	}

	/** Get Learner QCTOSkills Programme.
		@return Learner QCTOSkills Programme
	  */
	public int getZZLearnerQCTOSkillsProgramme_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZLearnerQCTOSkillsProgramme_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_ZZQctoModule getZZQctoModule() throws RuntimeException
	{
		return (I_ZZQctoModule)MTable.get(getCtx(), I_ZZQctoModule.Table_ID)
			.getPO(getZZQctoModule_ID(), get_TrxName());
	}

	/** Set QCTO Module.
		@param ZZQctoModule_ID QCTO Module
	*/
	public void setZZQctoModule_ID (int ZZQctoModule_ID)
	{
		if (ZZQctoModule_ID < 1)
			set_Value (COLUMNNAME_ZZQctoModule_ID, null);
		else
			set_Value (COLUMNNAME_ZZQctoModule_ID, Integer.valueOf(ZZQctoModule_ID));
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