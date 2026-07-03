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

/** Generated Model for ZZLearnerQctoLearnershipAssessments
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="ZZLearnerQctoLearnershipAssessments")
public class X_ZZLearnerQctoLearnershipAssessments extends PO implements I_ZZLearnerQctoLearnershipAssessments, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20260703L;

    /** Standard Constructor */
    public X_ZZLearnerQctoLearnershipAssessments (Properties ctx, int ZZLearnerQctoLearnershipAssessments_ID, String trxName)
    {
      super (ctx, ZZLearnerQctoLearnershipAssessments_ID, trxName);
      /** if (ZZLearnerQctoLearnershipAssessments_ID == 0)
        {
			setZZLearnerQctoLearnershipAssessments_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZLearnerQctoLearnershipAssessments (Properties ctx, int ZZLearnerQctoLearnershipAssessments_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZLearnerQctoLearnershipAssessments_ID, trxName, virtualColumns);
      /** if (ZZLearnerQctoLearnershipAssessments_ID == 0)
        {
			setZZLearnerQctoLearnershipAssessments_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZLearnerQctoLearnershipAssessments (Properties ctx, String ZZLearnerQctoLearnershipAssessments_UU, String trxName)
    {
      super (ctx, ZZLearnerQctoLearnershipAssessments_UU, trxName);
      /** if (ZZLearnerQctoLearnershipAssessments_UU == null)
        {
			setZZLearnerQctoLearnershipAssessments_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZLearnerQctoLearnershipAssessments (Properties ctx, String ZZLearnerQctoLearnershipAssessments_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZLearnerQctoLearnershipAssessments_UU, trxName, virtualColumns);
      /** if (ZZLearnerQctoLearnershipAssessments_UU == null)
        {
			setZZLearnerQctoLearnershipAssessments_ID (0);
        } */
    }

    /** Load Constructor */
    public X_ZZLearnerQctoLearnershipAssessments (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_ZZLearnerQctoLearnershipAssessments[")
        .append(get_ID()).append("]");
      return sb.toString();
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

	public I_ZZAssessorPerson getZZAssessorPerson() throws RuntimeException
	{
		return (I_ZZAssessorPerson)MTable.get(getCtx(), I_ZZAssessorPerson.Table_ID)
			.getPO(getZZAssessorPerson_ID(), get_TrxName());
	}

	/** Set Assessor Person.
		@param ZZAssessorPerson_ID Assessor Person
	*/
	public void setZZAssessorPerson_ID (int ZZAssessorPerson_ID)
	{
		if (ZZAssessorPerson_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZAssessorPerson_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZAssessorPerson_ID, Integer.valueOf(ZZAssessorPerson_ID));
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

	public I_ZZLearnerQCTOLearnership getZZLearnerQCTOLearnership() throws RuntimeException
	{
		return (I_ZZLearnerQCTOLearnership)MTable.get(getCtx(), I_ZZLearnerQCTOLearnership.Table_ID)
			.getPO(getZZLearnerQCTOLearnership_ID(), get_TrxName());
	}

	/** Set Learner QCTOLearnership.
		@param ZZLearnerQCTOLearnership_ID Learner QCTOLearnership
	*/
	public void setZZLearnerQCTOLearnership_ID (int ZZLearnerQCTOLearnership_ID)
	{
		if (ZZLearnerQCTOLearnership_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZLearnerQCTOLearnership_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZLearnerQCTOLearnership_ID, Integer.valueOf(ZZLearnerQCTOLearnership_ID));
	}

	/** Get Learner QCTOLearnership.
		@return Learner QCTOLearnership
	  */
	public int getZZLearnerQCTOLearnership_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZLearnerQCTOLearnership_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Learner QCTOLearnership Assessments.
		@param ZZLearnerQctoLearnershipAssessments_ID Learner QCTOLearnership Assessments
	*/
	public void setZZLearnerQctoLearnershipAssessments_ID (int ZZLearnerQctoLearnershipAssessments_ID)
	{
		if (ZZLearnerQctoLearnershipAssessments_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZLearnerQctoLearnershipAssessments_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZLearnerQctoLearnershipAssessments_ID, Integer.valueOf(ZZLearnerQctoLearnershipAssessments_ID));
	}

	/** Get Learner QCTOLearnership Assessments.
		@return Learner QCTOLearnership Assessments	  */
	public int getZZLearnerQctoLearnershipAssessments_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZLearnerQctoLearnershipAssessments_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set ZZLearnerQctoLearnershipAssessments_UU.
		@param ZZLearnerQctoLearnershipAssessments_UU ZZLearnerQctoLearnershipAssessments_UU
	*/
	public void setZZLearnerQctoLearnershipAssessments_UU (String ZZLearnerQctoLearnershipAssessments_UU)
	{
		set_Value (COLUMNNAME_ZZLearnerQctoLearnershipAssessments_UU, ZZLearnerQctoLearnershipAssessments_UU);
	}

	/** Get ZZLearnerQctoLearnershipAssessments_UU.
		@return ZZLearnerQctoLearnershipAssessments_UU	  */
	public String getZZLearnerQctoLearnershipAssessments_UU()
	{
		return (String)get_Value(COLUMNNAME_ZZLearnerQctoLearnershipAssessments_UU);
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

	public I_ZZAssessorPerson getZZModerator() throws RuntimeException
	{
		return (I_ZZAssessorPerson)MTable.get(getCtx(), I_ZZAssessorPerson.Table_ID)
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

	/** ZZPreviouslyAchieved AD_Reference_ID=319 */
	public static final int ZZPREVIOUSLYACHIEVED_AD_Reference_ID=319;
	/** No = N */
	public static final String ZZPREVIOUSLYACHIEVED_No = "N";
	/** Yes = Y */
	public static final String ZZPREVIOUSLYACHIEVED_Yes = "Y";
	/** Set Previously Achieved.
		@param ZZPreviouslyAchieved Previously Achieved
	*/
	public void setZZPreviouslyAchieved (String ZZPreviouslyAchieved)
	{

		set_Value (COLUMNNAME_ZZPreviouslyAchieved, ZZPreviouslyAchieved);
	}

	/** Get Previously Achieved.
		@return Previously Achieved	  */
	public String getZZPreviouslyAchieved()
	{
		return (String)get_Value(COLUMNNAME_ZZPreviouslyAchieved);
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
}