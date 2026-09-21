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

/** Generated Model for ZZLearnerQCTOArtisans
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="ZZLearnerQCTOArtisans")
public class X_ZZLearnerQCTOArtisans extends PO implements I_ZZLearnerQCTOArtisans, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20260921L;

    /** Standard Constructor */
    public X_ZZLearnerQCTOArtisans (Properties ctx, int ZZLearnerQCTOArtisans_ID, String trxName)
    {
      super (ctx, ZZLearnerQCTOArtisans_ID, trxName);
      /** if (ZZLearnerQCTOArtisans_ID == 0)
        {
			setEmp_Contract (false);
// N
			setEmp_Contract_Copy (false);
// N
			setIs_Approved (false);
// N
			setIs_Terms_Employment (false);
// N
			setNamb_Confirmation (false);
// N
			setPrevious_Employed (false);
// N
			setWP_Agreement (false);
// N
			setZZLearnerQCTOArtisans_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZLearnerQCTOArtisans (Properties ctx, int ZZLearnerQCTOArtisans_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZLearnerQCTOArtisans_ID, trxName, virtualColumns);
      /** if (ZZLearnerQCTOArtisans_ID == 0)
        {
			setEmp_Contract (false);
// N
			setEmp_Contract_Copy (false);
// N
			setIs_Approved (false);
// N
			setIs_Terms_Employment (false);
// N
			setNamb_Confirmation (false);
// N
			setPrevious_Employed (false);
// N
			setWP_Agreement (false);
// N
			setZZLearnerQCTOArtisans_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZLearnerQCTOArtisans (Properties ctx, String ZZLearnerQCTOArtisans_UU, String trxName)
    {
      super (ctx, ZZLearnerQCTOArtisans_UU, trxName);
      /** if (ZZLearnerQCTOArtisans_UU == null)
        {
			setEmp_Contract (false);
// N
			setEmp_Contract_Copy (false);
// N
			setIs_Approved (false);
// N
			setIs_Terms_Employment (false);
// N
			setNamb_Confirmation (false);
// N
			setPrevious_Employed (false);
// N
			setWP_Agreement (false);
// N
			setZZLearnerQCTOArtisans_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZLearnerQCTOArtisans (Properties ctx, String ZZLearnerQCTOArtisans_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZLearnerQCTOArtisans_UU, trxName, virtualColumns);
      /** if (ZZLearnerQCTOArtisans_UU == null)
        {
			setEmp_Contract (false);
// N
			setEmp_Contract_Copy (false);
// N
			setIs_Approved (false);
// N
			setIs_Terms_Employment (false);
// N
			setNamb_Confirmation (false);
// N
			setPrevious_Employed (false);
// N
			setWP_Agreement (false);
// N
			setZZLearnerQCTOArtisans_ID (0);
        } */
    }

    /** Load Constructor */
    public X_ZZLearnerQCTOArtisans (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_ZZLearnerQCTOArtisans[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public org.compiere.model.I_AD_User getApproved() throws RuntimeException
	{
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_ID)
			.getPO(getApproved_By(), get_TrxName());
	}

	/** Set Approved By.
		@param Approved_By ms_learnerqctoartisans.approvedby (0 of 1230 staged rows populated as of 2026-07-16, added anyway)
	*/
	public void setApproved_By (int Approved_By)
	{
		set_Value (COLUMNNAME_Approved_By, Integer.valueOf(Approved_By));
	}

	/** Get Approved By.
		@return ms_learnerqctoartisans.approvedby (0 of 1230 staged rows populated as of 2026-07-16, added anyway)
	  */
	public int getApproved_By()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Approved_By);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Ass Partner.
		@param Ass_Partner ms_learnerqctoartisans.asspartner (free text, e.g. &quot;MQA&quot;)
	*/
	public void setAss_Partner (String Ass_Partner)
	{
		set_Value (COLUMNNAME_Ass_Partner, Ass_Partner);
	}

	/** Get Ass Partner.
		@return ms_learnerqctoartisans.asspartner (free text, e.g. &quot;MQA&quot;)
	  */
	public String getAss_Partner()
	{
		return (String)get_Value(COLUMNNAME_Ass_Partner);
	}

	/** Set Cur Reg Number.
		@param Cur_Reg_Number ms_learnerqctoartisans.curregnumber (free text registration number)
	*/
	public void setCur_Reg_Number (String Cur_Reg_Number)
	{
		set_Value (COLUMNNAME_Cur_Reg_Number, Cur_Reg_Number);
	}

	/** Get Cur Reg Number.
		@return ms_learnerqctoartisans.curregnumber (free text registration number)
	  */
	public String getCur_Reg_Number()
	{
		return (String)get_Value(COLUMNNAME_Cur_Reg_Number);
	}

	/** Set Date Approved.
		@param Date_Approved ms_learnerqctoartisans.dateapproved
	*/
	public void setDate_Approved (Timestamp Date_Approved)
	{
		set_Value (COLUMNNAME_Date_Approved, Date_Approved);
	}

	/** Get Date Approved.
		@return ms_learnerqctoartisans.dateapproved
	  */
	public Timestamp getDate_Approved()
	{
		return (Timestamp)get_Value(COLUMNNAME_Date_Approved);
	}

	/** Set Emp Contract.
		@param Emp_Contract ms_learnerqctoartisans.empcontract (confirmed only 1/2/null across staged data)
	*/
	public void setEmp_Contract (boolean Emp_Contract)
	{
		set_Value (COLUMNNAME_Emp_Contract, Boolean.valueOf(Emp_Contract));
	}

	/** Get Emp Contract.
		@return ms_learnerqctoartisans.empcontract (confirmed only 1/2/null across staged data)
	  */
	public boolean isEmp_Contract()
	{
		Object oo = get_Value(COLUMNNAME_Emp_Contract);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Emp Contract Copy.
		@param Emp_Contract_Copy ms_learnerqctoartisans.empcontractcopy (confirmed only 1/2/null across staged data)
	*/
	public void setEmp_Contract_Copy (boolean Emp_Contract_Copy)
	{
		set_Value (COLUMNNAME_Emp_Contract_Copy, Boolean.valueOf(Emp_Contract_Copy));
	}

	/** Get Emp Contract Copy.
		@return ms_learnerqctoartisans.empcontractcopy (confirmed only 1/2/null across staged data)
	  */
	public boolean isEmp_Contract_Copy()
	{
		Object oo = get_Value(COLUMNNAME_Emp_Contract_Copy);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	public org.compiere.model.I_C_BPartner getEmployer() throws RuntimeException
	{
		return (org.compiere.model.I_C_BPartner)MTable.get(getCtx(), org.compiere.model.I_C_BPartner.Table_ID)
			.getPO(getEmployer_ID(), get_TrxName());
	}

	/** Set Employer ID.
		@param Employer_ID ms_learnerqctoartisans.employerid, resolved via ms_organisation.sdlnumber = c_bpartner.zz_sdl_no (same as organisationid elsewhere)
	*/
	public void setEmployer_ID (int Employer_ID)
	{
		if (Employer_ID < 1)
			set_Value (COLUMNNAME_Employer_ID, null);
		else
			set_Value (COLUMNNAME_Employer_ID, Integer.valueOf(Employer_ID));
	}

	/** Get Employer ID.
		@return ms_learnerqctoartisans.employerid, resolved via ms_organisation.sdlnumber = c_bpartner.zz_sdl_no (same as organisationid elsewhere)
	  */
	public int getEmployer_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Employer_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Is Approved.
		@param Is_Approved ms_learnerqctoartisans.isapproved (0 of 1230 staged rows populated as of 2026-07-16, added anyway)
	*/
	public void setIs_Approved (boolean Is_Approved)
	{
		set_Value (COLUMNNAME_Is_Approved, Boolean.valueOf(Is_Approved));
	}

	/** Get Is Approved.
		@return ms_learnerqctoartisans.isapproved (0 of 1230 staged rows populated as of 2026-07-16, added anyway)
	  */
	public boolean is_Approved()
	{
		Object oo = get_Value(COLUMNNAME_Is_Approved);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Is Terms Employment.
		@param Is_Terms_Employment ms_learnerqctoartisans.istermsemployment (confirmed only 1/2/null across staged data)
	*/
	public void setIs_Terms_Employment (boolean Is_Terms_Employment)
	{
		set_Value (COLUMNNAME_Is_Terms_Employment, Boolean.valueOf(Is_Terms_Employment));
	}

	/** Get Is Terms Employment.
		@return ms_learnerqctoartisans.istermsemployment (confirmed only 1/2/null across staged data)
	  */
	public boolean is_Terms_Employment()
	{
		Object oo = get_Value(COLUMNNAME_Is_Terms_Employment);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Learner Employed.
		@param Learner_Employed ms_learnerqctoartisans.learneremployed (free text - mixed dates/numbers/&quot;never worked&quot;)
	*/
	public void setLearner_Employed (String Learner_Employed)
	{
		set_Value (COLUMNNAME_Learner_Employed, Learner_Employed);
	}

	/** Get Learner Employed.
		@return ms_learnerqctoartisans.learneremployed (free text - mixed dates/numbers/&quot;never worked&quot;)
	  */
	public String getLearner_Employed()
	{
		return (String)get_Value(COLUMNNAME_Learner_Employed);
	}

	/** Set Namb Confirmation.
		@param Namb_Confirmation ms_learnerqctoartisans.nambconfirmation (only 1 of 1230 staged rows populated as of 2026-07-16, added anyway)
	*/
	public void setNamb_Confirmation (boolean Namb_Confirmation)
	{
		set_Value (COLUMNNAME_Namb_Confirmation, Boolean.valueOf(Namb_Confirmation));
	}

	/** Get Namb Confirmation.
		@return ms_learnerqctoartisans.nambconfirmation (only 1 of 1230 staged rows populated as of 2026-07-16, added anyway)
	  */
	public boolean isNamb_Confirmation()
	{
		Object oo = get_Value(COLUMNNAME_Namb_Confirmation);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Namb Confirmation Date.
		@param Namb_Confirmation_Date ms_learnerqctoartisans.nambconfirmationdate (only 1 of 1230 staged rows populated as of 2026-07-16, added anyway)
	*/
	public void setNamb_Confirmation_Date (Timestamp Namb_Confirmation_Date)
	{
		set_Value (COLUMNNAME_Namb_Confirmation_Date, Namb_Confirmation_Date);
	}

	/** Get Namb Confirmation Date.
		@return ms_learnerqctoartisans.nambconfirmationdate (only 1 of 1230 staged rows populated as of 2026-07-16, added anyway)
	  */
	public Timestamp getNamb_Confirmation_Date()
	{
		return (Timestamp)get_Value(COLUMNNAME_Namb_Confirmation_Date);
	}

	public org.compiere.model.I_AD_User getNamb_Confirmation_U() throws RuntimeException
	{
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_ID)
			.getPO(getNamb_Confirmation_User(), get_TrxName());
	}

	/** Set Namb Confirmation User.
		@param Namb_Confirmation_User ms_learnerqctoartisans.nambconfirmationuser (0 of 1230 staged rows populated as of 2026-07-16, added anyway)
	*/
	public void setNamb_Confirmation_User (int Namb_Confirmation_User)
	{
		set_Value (COLUMNNAME_Namb_Confirmation_User, Integer.valueOf(Namb_Confirmation_User));
	}

	/** Get Namb Confirmation User.
		@return ms_learnerqctoartisans.nambconfirmationuser (0 of 1230 staged rows populated as of 2026-07-16, added anyway)
	  */
	public int getNamb_Confirmation_User()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Namb_Confirmation_User);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Occupation.
		@param Occupation ms_learnerqctoartisans.occupation (OFO-code-looking free text, e.g. &quot;651302&quot; - does NOT match zzlkpofooccupation.Value&#039;s format, kept as plain text)
	*/
	public void setOccupation (String Occupation)
	{
		set_Value (COLUMNNAME_Occupation, Occupation);
	}

	/** Get Occupation.
		@return ms_learnerqctoartisans.occupation (OFO-code-looking free text, e.g. &quot;651302&quot; - does NOT match zzlkpofooccupation.Value&#039;s format, kept as plain text)
	  */
	public String getOccupation()
	{
		return (String)get_Value(COLUMNNAME_Occupation);
	}

	/** Set Previous Employed.
		@param Previous_Employed ms_learnerqctoartisans.previousemployed (confirmed only 1/2/null across staged data)
	*/
	public void setPrevious_Employed (boolean Previous_Employed)
	{
		set_Value (COLUMNNAME_Previous_Employed, Boolean.valueOf(Previous_Employed));
	}

	/** Get Previous Employed.
		@return ms_learnerqctoartisans.previousemployed (confirmed only 1/2/null across staged data)
	  */
	public boolean isPrevious_Employed()
	{
		Object oo = get_Value(COLUMNNAME_Previous_Employed);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Qcto.
		@param Qcto ms_learnerqctoartisans.qcto (free text, e.g. &quot;NAMB&quot;/&quot;MQA&quot;)
	*/
	public void setQcto (String Qcto)
	{
		set_Value (COLUMNNAME_Qcto, Qcto);
	}

	/** Get Qcto.
		@return ms_learnerqctoartisans.qcto (free text, e.g. &quot;NAMB&quot;/&quot;MQA&quot;)
	  */
	public String getQcto()
	{
		return (String)get_Value(COLUMNNAME_Qcto);
	}

	/** Set Reg Saqa.
		@param Reg_Saqa ms_learnerqctoartisans.regsaqa (free text, e.g. &quot;MQA&quot;)
	*/
	public void setReg_Saqa (String Reg_Saqa)
	{
		set_Value (COLUMNNAME_Reg_Saqa, Reg_Saqa);
	}

	/** Get Reg Saqa.
		@return ms_learnerqctoartisans.regsaqa (free text, e.g. &quot;MQA&quot;)
	  */
	public String getReg_Saqa()
	{
		return (String)get_Value(COLUMNNAME_Reg_Saqa);
	}

	/** Set Responsible Seta.
		@param Responsible_Seta ms_learnerqctoartisans.responsibleseta (free text, e.g. &quot;MQA&quot;)
	*/
	public void setResponsible_Seta (String Responsible_Seta)
	{
		set_Value (COLUMNNAME_Responsible_Seta, Responsible_Seta);
	}

	/** Get Responsible Seta.
		@return ms_learnerqctoartisans.responsibleseta (free text, e.g. &quot;MQA&quot;)
	  */
	public String getResponsible_Seta()
	{
		return (String)get_Value(COLUMNNAME_Responsible_Seta);
	}

	/** Set Terms Employment.
		@param Terms_Employment ms_learnerqctoartisans.termsemployment (free text, e.g. &quot;Contract&quot;)
	*/
	public void setTerms_Employment (String Terms_Employment)
	{
		set_Value (COLUMNNAME_Terms_Employment, Terms_Employment);
	}

	/** Get Terms Employment.
		@return ms_learnerqctoartisans.termsemployment (free text, e.g. &quot;Contract&quot;)
	  */
	public String getTerms_Employment()
	{
		return (String)get_Value(COLUMNNAME_Terms_Employment);
	}

	/** Set WP Agreement.
		@param WP_Agreement ms_learnerqctoartisans.wpagreement (confirmed only 1/2/null across staged data)
	*/
	public void setWP_Agreement (boolean WP_Agreement)
	{
		set_Value (COLUMNNAME_WP_Agreement, Boolean.valueOf(WP_Agreement));
	}

	/** Get WP Agreement.
		@return ms_learnerqctoartisans.wpagreement (confirmed only 1/2/null across staged data)
	  */
	public boolean isWP_Agreement()
	{
		Object oo = get_Value(COLUMNNAME_WP_Agreement);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Assessment Centre Contact.
		@param ZZACContact_ID Assessment Centre Contact
	*/
	public void setZZACContact_ID (int ZZACContact_ID)
	{
		if (ZZACContact_ID < 1)
			set_Value (COLUMNNAME_ZZACContact_ID, null);
		else
			set_Value (COLUMNNAME_ZZACContact_ID, Integer.valueOf(ZZACContact_ID));
	}

	/** Get Assessment Centre Contact.
		@return Assessment Centre Contact	  */
	public int getZZACContact_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZACContact_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** ZZACLevy AD_Reference_ID=319 */
	public static final int ZZACLEVY_AD_Reference_ID=319;
	/** No = N */
	public static final String ZZACLEVY_No = "N";
	/** Yes = Y */
	public static final String ZZACLEVY_Yes = "Y";
	/** Set Assessment Centre Skills Levy.
		@param ZZACLevy Assessment Centre Skills Levy
	*/
	public void setZZACLevy (String ZZACLevy)
	{

		set_Value (COLUMNNAME_ZZACLevy, ZZACLevy);
	}

	/** Get Assessment Centre Skills Levy.
		@return Assessment Centre Skills Levy	  */
	public String getZZACLevy()
	{
		return (String)get_Value(COLUMNNAME_ZZACLevy);
	}

	public I_ZZAssessmentCentre getZZAC() throws RuntimeException
	{
		return (I_ZZAssessmentCentre)MTable.get(getCtx(), I_ZZAssessmentCentre.Table_ID)
			.getPO(getZZAC_ID(), get_TrxName());
	}

	/** Set Assessment Centre.
		@param ZZAC_ID Assessment Centre
	*/
	public void setZZAC_ID (int ZZAC_ID)
	{
		if (ZZAC_ID < 1)
			set_Value (COLUMNNAME_ZZAC_ID, null);
		else
			set_Value (COLUMNNAME_ZZAC_ID, Integer.valueOf(ZZAC_ID));
	}

	/** Get Assessment Centre.
		@return Assessment Centre	  */
	public int getZZAC_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZAC_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Actual Terminated Date.
		@param ZZActualTerminatedDate Actual Terminated Date
	*/
	public void setZZActualTerminatedDate (Timestamp ZZActualTerminatedDate)
	{
		set_Value (COLUMNNAME_ZZActualTerminatedDate, ZZActualTerminatedDate);
	}

	/** Get Actual Terminated Date.
		@return Actual Terminated Date	  */
	public Timestamp getZZActualTerminatedDate()
	{
		return (Timestamp)get_Value(COLUMNNAME_ZZActualTerminatedDate);
	}

	/** Set Agreement Reference Number.
		@param ZZAgreementReferenceNumber Agreement Reference Number
	*/
	public void setZZAgreementReferenceNumber (String ZZAgreementReferenceNumber)
	{
		set_Value (COLUMNNAME_ZZAgreementReferenceNumber, ZZAgreementReferenceNumber);
	}

	/** Get Agreement Reference Number.
		@return Agreement Reference Number	  */
	public String getZZAgreementReferenceNumber()
	{
		return (String)get_Value(COLUMNNAME_ZZAgreementReferenceNumber);
	}

	/** Artisan :Apprenticeship section 13 = Artisan :Apprenticeship section 13 */
	public static final String ZZARTISANPROJECT_ArtisanApprenticeshipSection13 = "Artisan :Apprenticeship section 13";
	/** Artisan :Apprenticeship section 28 = Artisan :Apprenticeship section 28 */
	public static final String ZZARTISANPROJECT_ArtisanApprenticeshipSection28 = "Artisan :Apprenticeship section 28";
	/** Set Artisan Project.
		@param ZZArtisanProject Artisan Project
	*/
	public void setZZArtisanProject (String ZZArtisanProject)
	{

		set_Value (COLUMNNAME_ZZArtisanProject, ZZArtisanProject);
	}

	/** Get Artisan Project.
		@return Artisan Project	  */
	public String getZZArtisanProject()
	{
		return (String)get_Value(COLUMNNAME_ZZArtisanProject);
	}

	public org.compiere.model.I_AD_User getZZCertificateCreate() throws RuntimeException
	{
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_ID)
			.getPO(getZZCertificateCreatedBy(), get_TrxName());
	}

	/** Set Certificate CreatedBy.
		@param ZZCertificateCreatedBy Certificate CreatedBy
	*/
	public void setZZCertificateCreatedBy (int ZZCertificateCreatedBy)
	{
		set_Value (COLUMNNAME_ZZCertificateCreatedBy, Integer.valueOf(ZZCertificateCreatedBy));
	}

	/** Get Certificate CreatedBy.
		@return Certificate CreatedBy	  */
	public int getZZCertificateCreatedBy()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZCertificateCreatedBy);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Certificate Number.
		@param ZZCertificateNumber Certificate Number
	*/
	public void setZZCertificateNumber (String ZZCertificateNumber)
	{
		set_Value (COLUMNNAME_ZZCertificateNumber, ZZCertificateNumber);
	}

	/** Get Certificate Number.
		@return Certificate Number	  */
	public String getZZCertificateNumber()
	{
		return (String)get_Value(COLUMNNAME_ZZCertificateNumber);
	}

	/** Set Commencement Date.
		@param ZZCommencementDate Commencement Date
	*/
	public void setZZCommencementDate (Timestamp ZZCommencementDate)
	{
		set_Value (COLUMNNAME_ZZCommencementDate, ZZCommencementDate);
	}

	/** Get Commencement Date.
		@return Commencement Date	  */
	public Timestamp getZZCommencementDate()
	{
		return (Timestamp)get_Value(COLUMNNAME_ZZCommencementDate);
	}

	/** Set Estimate Completion Date.
		@param ZZCompletionDate Estimate Completion Date
	*/
	public void setZZCompletionDate (Timestamp ZZCompletionDate)
	{
		set_Value (COLUMNNAME_ZZCompletionDate, ZZCompletionDate);
	}

	/** Get Estimate Completion Date.
		@return Estimate Completion Date	  */
	public Timestamp getZZCompletionDate()
	{
		return (Timestamp)get_Value(COLUMNNAME_ZZCompletionDate);
	}

	/** Set Completion Processed Date.
		@param ZZCompletionProcessedDate Completion Processed Date
	*/
	public void setZZCompletionProcessedDate (Timestamp ZZCompletionProcessedDate)
	{
		set_Value (COLUMNNAME_ZZCompletionProcessedDate, ZZCompletionProcessedDate);
	}

	/** Get Completion Processed Date.
		@return Completion Processed Date	  */
	public Timestamp getZZCompletionProcessedDate()
	{
		return (Timestamp)get_Value(COLUMNNAME_ZZCompletionProcessedDate);
	}

	/** Set Contract Number.
		@param ZZContractNumber Contract Number
	*/
	public void setZZContractNumber (String ZZContractNumber)
	{
		set_Value (COLUMNNAME_ZZContractNumber, ZZContractNumber);
	}

	/** Get Contract Number.
		@return Contract Number	  */
	public String getZZContractNumber()
	{
		return (String)get_Value(COLUMNNAME_ZZContractNumber);
	}

	/** Set Certificate Created.
		@param ZZDateCertificateCreated Certificate Created
	*/
	public void setZZDateCertificateCreated (Timestamp ZZDateCertificateCreated)
	{
		set_Value (COLUMNNAME_ZZDateCertificateCreated, ZZDateCertificateCreated);
	}

	/** Get Certificate Created.
		@return Certificate Created	  */
	public Timestamp getZZDateCertificateCreated()
	{
		return (Timestamp)get_Value(COLUMNNAME_ZZDateCertificateCreated);
	}

	/** Set Date Extension Captured.
		@param ZZDateExtensionCaptured Date Extension Captured
	*/
	public void setZZDateExtensionCaptured (Timestamp ZZDateExtensionCaptured)
	{
		set_Value (COLUMNNAME_ZZDateExtensionCaptured, ZZDateExtensionCaptured);
	}

	/** Get Date Extension Captured.
		@return Date Extension Captured	  */
	public Timestamp getZZDateExtensionCaptured()
	{
		return (Timestamp)get_Value(COLUMNNAME_ZZDateExtensionCaptured);
	}

	/** Set Date Termination Captured.
		@param ZZDateTerminationCaptured Date Termination Captured
	*/
	public void setZZDateTerminationCaptured (Timestamp ZZDateTerminationCaptured)
	{
		set_Value (COLUMNNAME_ZZDateTerminationCaptured, ZZDateTerminationCaptured);
	}

	/** Get Date Termination Captured.
		@return Date Termination Captured	  */
	public Timestamp getZZDateTerminationCaptured()
	{
		return (Timestamp)get_Value(COLUMNNAME_ZZDateTerminationCaptured);
	}

	/** Set Duration Learner Employed.
		@param ZZDurationLearnerEmployed Duration Learner Employed
	*/
	public void setZZDurationLearnerEmployed (String ZZDurationLearnerEmployed)
	{
		set_Value (COLUMNNAME_ZZDurationLearnerEmployed, ZZDurationLearnerEmployed);
	}

	/** Get Duration Learner Employed.
		@return Duration Learner Employed	  */
	public String getZZDurationLearnerEmployed()
	{
		return (String)get_Value(COLUMNNAME_ZZDurationLearnerEmployed);
	}

	public org.compiere.model.I_AD_User getZZEnrolle() throws RuntimeException
	{
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_ID)
			.getPO(getZZEnrolledBy(), get_TrxName());
	}

	/** Set EnrolledBy.
		@param ZZEnrolledBy EnrolledBy
	*/
	public void setZZEnrolledBy (int ZZEnrolledBy)
	{
		set_Value (COLUMNNAME_ZZEnrolledBy, Integer.valueOf(ZZEnrolledBy));
	}

	/** Get EnrolledBy.
		@return EnrolledBy	  */
	public int getZZEnrolledBy()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZEnrolledBy);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Enrolment Date.
		@param ZZEnrolmentDate Enrolment Date
	*/
	public void setZZEnrolmentDate (Timestamp ZZEnrolmentDate)
	{
		set_Value (COLUMNNAME_ZZEnrolmentDate, ZZEnrolmentDate);
	}

	/** Get Enrolment Date.
		@return Enrolment Date	  */
	public Timestamp getZZEnrolmentDate()
	{
		return (Timestamp)get_Value(COLUMNNAME_ZZEnrolmentDate);
	}

	/** Financial reasons = 10 */
	public static final String ZZENROLMENTSTATUSREASON_FinancialReasons = "10";
	/** Medical reasons = 15 */
	public static final String ZZENROLMENTSTATUSREASON_MedicalReasons = "15";
	/** None given = 16 */
	public static final String ZZENROLMENTSTATUSREASON_NoneGiven = "16";
	/** Other = 17 */
	public static final String ZZENROLMENTSTATUSREASON_Other = "17";
	/** Social reasons = 27 */
	public static final String ZZENROLMENTSTATUSREASON_SocialReasons = "27";
	/** Study permit not approved = 28 */
	public static final String ZZENROLMENTSTATUSREASON_StudyPermitNotApproved = "28";
	/** Suspension = 29 */
	public static final String ZZENROLMENTSTATUSREASON_Suspension = "29";
	/** Changed priorities = 3 */
	public static final String ZZENROLMENTSTATUSREASON_ChangedPriorities = "3";
	/** Deceased = 4 */
	public static final String ZZENROLMENTSTATUSREASON_Deceased = "4";
	/** Dismissal = 5 */
	public static final String ZZENROLMENTSTATUSREASON_Dismissal = "5";
	/** Employment = 7 */
	public static final String ZZENROLMENTSTATUSREASON_Employment = "7";
	/** Exam enrolment rejected = 8 */
	public static final String ZZENROLMENTSTATUSREASON_ExamEnrolmentRejected = "8";
	/** Exchange student = 9 */
	public static final String ZZENROLMENTSTATUSREASON_ExchangeStudent = "9";
	/** Absconded = Absconded */
	public static final String ZZENROLMENTSTATUSREASON_Absconded = "Absconded";
	/** By Committee = By Committee */
	public static final String ZZENROLMENTSTATUSREASON_ByCommittee = "By Committee";
	/** Met Requirements = Met Requirements */
	public static final String ZZENROLMENTSTATUSREASON_MetRequirements = "Met Requirements";
	/** Withdrawal = Withdrawal */
	public static final String ZZENROLMENTSTATUSREASON_Withdrawal = "Withdrawal";
	/** Set Enrolment Status Reason.
		@param ZZEnrolmentStatusReason Enrolment Status Reason
	*/
	public void setZZEnrolmentStatusReason (String ZZEnrolmentStatusReason)
	{

		set_Value (COLUMNNAME_ZZEnrolmentStatusReason, ZZEnrolmentStatusReason);
	}

	/** Get Enrolment Status Reason.
		@return Enrolment Status Reason	  */
	public String getZZEnrolmentStatusReason()
	{
		return (String)get_Value(COLUMNNAME_ZZEnrolmentStatusReason);
	}

	public org.compiere.model.I_AD_User getZZExtensionCapture() throws RuntimeException
	{
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_ID)
			.getPO(getZZExtensionCapturedBy(), get_TrxName());
	}

	/** Set Extension CapturedBy.
		@param ZZExtensionCapturedBy Extension CapturedBy
	*/
	public void setZZExtensionCapturedBy (int ZZExtensionCapturedBy)
	{
		set_Value (COLUMNNAME_ZZExtensionCapturedBy, Integer.valueOf(ZZExtensionCapturedBy));
	}

	/** Get Extension CapturedBy.
		@return Extension CapturedBy	  */
	public int getZZExtensionCapturedBy()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZExtensionCapturedBy);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Extension Date.
		@param ZZExtensionDate Extension Date
	*/
	public void setZZExtensionDate (Timestamp ZZExtensionDate)
	{
		set_Value (COLUMNNAME_ZZExtensionDate, ZZExtensionDate);
	}

	/** Get Extension Date.
		@return Extension Date	  */
	public Timestamp getZZExtensionDate()
	{
		return (Timestamp)get_Value(COLUMNNAME_ZZExtensionDate);
	}

	/** Set Extension Reason.
		@param ZZExtensionReason Extension Reason
	*/
	public void setZZExtensionReason (String ZZExtensionReason)
	{
		set_Value (COLUMNNAME_ZZExtensionReason, ZZExtensionReason);
	}

	/** Get Extension Reason.
		@return Extension Reason	  */
	public String getZZExtensionReason()
	{
		return (String)get_Value(COLUMNNAME_ZZExtensionReason);
	}

	public org.compiere.model.I_C_Year getZZFinancialYear() throws RuntimeException
	{
		return (org.compiere.model.I_C_Year)MTable.get(getCtx(), org.compiere.model.I_C_Year.Table_ID)
			.getPO(getZZFinancialYear_ID(), get_TrxName());
	}

	/** Set Financial Year.
		@param ZZFinancialYear_ID Financial Year
	*/
	public void setZZFinancialYear_ID (int ZZFinancialYear_ID)
	{
		if (ZZFinancialYear_ID < 1)
			set_Value (COLUMNNAME_ZZFinancialYear_ID, null);
		else
			set_Value (COLUMNNAME_ZZFinancialYear_ID, Integer.valueOf(ZZFinancialYear_ID));
	}

	/** Get Financial Year.
		@return Financial Year	  */
	public int getZZFinancialYear_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZFinancialYear_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_ZZGrantType getZZGrantType() throws RuntimeException
	{
		return (I_ZZGrantType)MTable.get(getCtx(), I_ZZGrantType.Table_ID)
			.getPO(getZZGrantType_ID(), get_TrxName());
	}

	/** Set Grant Type.
		@param ZZGrantType_ID Grant Type
	*/
	public void setZZGrantType_ID (int ZZGrantType_ID)
	{
		if (ZZGrantType_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZGrantType_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZGrantType_ID, Integer.valueOf(ZZGrantType_ID));
	}

	/** Get Grant Type.
		@return Grant Type	  */
	public int getZZGrantType_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZGrantType_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Lead SDP Contact.
		@param ZZLeadSDProviderContact_ID Lead SDP Contact
	*/
	public void setZZLeadSDProviderContact_ID (int ZZLeadSDProviderContact_ID)
	{
		if (ZZLeadSDProviderContact_ID < 1)
			set_Value (COLUMNNAME_ZZLeadSDProviderContact_ID, null);
		else
			set_Value (COLUMNNAME_ZZLeadSDProviderContact_ID, Integer.valueOf(ZZLeadSDProviderContact_ID));
	}

	/** Get Lead SDP Contact.
		@return Lead SDP Contact	  */
	public int getZZLeadSDProviderContact_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZLeadSDProviderContact_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** ZZLeadSDProviderLevy AD_Reference_ID=319 */
	public static final int ZZLEADSDPROVIDERLEVY_AD_Reference_ID=319;
	/** No = N */
	public static final String ZZLEADSDPROVIDERLEVY_No = "N";
	/** Yes = Y */
	public static final String ZZLEADSDPROVIDERLEVY_Yes = "Y";
	/** Set Lead SDP Skills Levy.
		@param ZZLeadSDProviderLevy Lead SDP Skills Levy
	*/
	public void setZZLeadSDProviderLevy (String ZZLeadSDProviderLevy)
	{

		set_Value (COLUMNNAME_ZZLeadSDProviderLevy, ZZLeadSDProviderLevy);
	}

	/** Get Lead SDP Skills Levy.
		@return Lead SDP Skills Levy	  */
	public String getZZLeadSDProviderLevy()
	{
		return (String)get_Value(COLUMNNAME_ZZLeadSDProviderLevy);
	}

	/** Set Learner QCTO Artisans.
		@param ZZLearnerQCTOArtisans_ID Learner QCTO Artisans
	*/
	public void setZZLearnerQCTOArtisans_ID (int ZZLearnerQCTOArtisans_ID)
	{
		if (ZZLearnerQCTOArtisans_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZLearnerQCTOArtisans_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZLearnerQCTOArtisans_ID, Integer.valueOf(ZZLearnerQCTOArtisans_ID));
	}

	/** Get Learner QCTO Artisans.
		@return Learner QCTO Artisans	  */
	public int getZZLearnerQCTOArtisans_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZLearnerQCTOArtisans_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set ZZLearnerQCTOArtisans_UU.
		@param ZZLearnerQCTOArtisans_UU ZZLearnerQCTOArtisans_UU
	*/
	public void setZZLearnerQCTOArtisans_UU (String ZZLearnerQCTOArtisans_UU)
	{
		set_Value (COLUMNNAME_ZZLearnerQCTOArtisans_UU, ZZLearnerQCTOArtisans_UU);
	}

	/** Get ZZLearnerQCTOArtisans_UU.
		@return ZZLearnerQCTOArtisans_UU	  */
	public String getZZLearnerQCTOArtisans_UU()
	{
		return (String)get_Value(COLUMNNAME_ZZLearnerQCTOArtisans_UU);
	}

	public I_ZZLearner getZZLearner() throws RuntimeException
	{
		return (I_ZZLearner)MTable.get(getCtx(), I_ZZLearner.Table_ID)
			.getPO(getZZLearner_ID(), get_TrxName());
	}

	/** Set Learner.
		@param ZZLearner_ID Learner
	*/
	public void setZZLearner_ID (int ZZLearner_ID)
	{
		if (ZZLearner_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZLearner_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZLearner_ID, Integer.valueOf(ZZLearner_ID));
	}

	/** Get Learner.
		@return Learner	  */
	public int getZZLearner_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZLearner_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Most Recent Registration Date.
		@param ZZMostRecentRegistrationDate Most Recent Registration Date
	*/
	public void setZZMostRecentRegistrationDate (Timestamp ZZMostRecentRegistrationDate)
	{
		set_Value (COLUMNNAME_ZZMostRecentRegistrationDate, ZZMostRecentRegistrationDate);
	}

	/** Get Most Recent Registration Date.
		@return Most Recent Registration Date	  */
	public Timestamp getZZMostRecentRegistrationDate()
	{
		return (Timestamp)get_Value(COLUMNNAME_ZZMostRecentRegistrationDate);
	}

	public I_ZZLearnership getZZPreviousLearnership() throws RuntimeException
	{
		return (I_ZZLearnership)MTable.get(getCtx(), I_ZZLearnership.Table_ID)
			.getPO(getZZPreviousLearnership_ID(), get_TrxName());
	}

	/** Set Previous Learnership.
		@param ZZPreviousLearnership_ID Previous Learnership
	*/
	public void setZZPreviousLearnership_ID (int ZZPreviousLearnership_ID)
	{
		if (ZZPreviousLearnership_ID < 1)
			set_Value (COLUMNNAME_ZZPreviousLearnership_ID, null);
		else
			set_Value (COLUMNNAME_ZZPreviousLearnership_ID, Integer.valueOf(ZZPreviousLearnership_ID));
	}

	/** Get Previous Learnership.
		@return Previous Learnership	  */
	public int getZZPreviousLearnership_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZPreviousLearnership_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Project.
		@param ZZProject Project
	*/
	public void setZZProject (String ZZProject)
	{

		set_Value (COLUMNNAME_ZZProject, ZZProject);
	}

	/** Get Project.
		@return Project	  */
	public String getZZProject()
	{
		return (String)get_Value(COLUMNNAME_ZZProject);
	}

	/** ARPL = ARPL */
	public static final String ZZQCTOARTISANTYPE_ARPL = "ARPL";
	/** Artisan = Artisan */
	public static final String ZZQCTOARTISANTYPE_Artisan = "Artisan";
	/** Set QCTO Artisan Type.
		@param ZZQctoArtisanType QCTO Artisan Type
	*/
	public void setZZQctoArtisanType (String ZZQctoArtisanType)
	{

		set_Value (COLUMNNAME_ZZQctoArtisanType, ZZQctoArtisanType);
	}

	/** Get QCTO Artisan Type.
		@return QCTO Artisan Type	  */
	public String getZZQctoArtisanType()
	{
		return (String)get_Value(COLUMNNAME_ZZQctoArtisanType);
	}

	public I_ZZQctoLearnership getZZQctoLearnership() throws RuntimeException
	{
		return (I_ZZQctoLearnership)MTable.get(getCtx(), I_ZZQctoLearnership.Table_ID)
			.getPO(getZZQctoLearnership_ID(), get_TrxName());
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

	public I_ZZQctoProgrammeStatus getZZQctoProgrammeStatus() throws RuntimeException
	{
		return (I_ZZQctoProgrammeStatus)MTable.get(getCtx(), I_ZZQctoProgrammeStatus.Table_ID)
			.getPO(getZZQctoProgrammeStatus_ID(), get_TrxName());
	}

	/** Set QCTO Programme Status.
		@param ZZQctoProgrammeStatus_ID QCTO Programme Status
	*/
	public void setZZQctoProgrammeStatus_ID (int ZZQctoProgrammeStatus_ID)
	{
		if (ZZQctoProgrammeStatus_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZQctoProgrammeStatus_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZQctoProgrammeStatus_ID, Integer.valueOf(ZZQctoProgrammeStatus_ID));
	}

	/** Get QCTO Programme Status.
		@return QCTO Programme Status	  */
	public int getZZQctoProgrammeStatus_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZQctoProgrammeStatus_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Met entry requirements = Met entry requirements */
	public static final String ZZQUALIFICATIONREQUIREMENTS_MetEntryRequirements = "Met entry requirements";
	/** Other = Other */
	public static final String ZZQUALIFICATIONREQUIREMENTS_Other = "Other";
	/** RPL -skills experience = RPL -skills experience */
	public static final String ZZQUALIFICATIONREQUIREMENTS_RPL_SkillsExperience = "RPL -skills experience";
	/** RPL with qualification at lower level than required = RPL with qualification at lower level than required */
	public static final String ZZQUALIFICATIONREQUIREMENTS_RPLWithQualificationAtLowerLevelThanRequired = "RPL with qualification at lower level than required";
	/** Set Qualification Entry Requirements.
		@param ZZQualificationRequirements Qualification Entry Requirements
	*/
	public void setZZQualificationRequirements (String ZZQualificationRequirements)
	{

		set_Value (COLUMNNAME_ZZQualificationRequirements, ZZQualificationRequirements);
	}

	/** Get Qualification Entry Requirements.
		@return Qualification Entry Requirements	  */
	public String getZZQualificationRequirements()
	{
		return (String)get_Value(COLUMNNAME_ZZQualificationRequirements);
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

	public org.compiere.model.I_AD_User getZZRegistere() throws RuntimeException
	{
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_ID)
			.getPO(getZZRegisteredBy(), get_TrxName());
	}

	/** Set RegisteredBy.
		@param ZZRegisteredBy RegisteredBy
	*/
	public void setZZRegisteredBy (int ZZRegisteredBy)
	{
		set_Value (COLUMNNAME_ZZRegisteredBy, Integer.valueOf(ZZRegisteredBy));
	}

	/** Get RegisteredBy.
		@return RegisteredBy	  */
	public int getZZRegisteredBy()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZRegisteredBy);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Registration Date.
		@param ZZRegistrationDate Registration Date
	*/
	public void setZZRegistrationDate (Timestamp ZZRegistrationDate)
	{
		set_Value (COLUMNNAME_ZZRegistrationDate, ZZRegistrationDate);
	}

	/** Get Registration Date.
		@return Registration Date	  */
	public Timestamp getZZRegistrationDate()
	{
		return (Timestamp)get_Value(COLUMNNAME_ZZRegistrationDate);
	}

	/** Set Secondary SDP Contact.
		@param ZZSecondarySDProviderContact_ID Secondary SDP Contact
	*/
	public void setZZSecondarySDProviderContact_ID (int ZZSecondarySDProviderContact_ID)
	{
		if (ZZSecondarySDProviderContact_ID < 1)
			set_Value (COLUMNNAME_ZZSecondarySDProviderContact_ID, null);
		else
			set_Value (COLUMNNAME_ZZSecondarySDProviderContact_ID, Integer.valueOf(ZZSecondarySDProviderContact_ID));
	}

	/** Get Secondary SDP Contact.
		@return Secondary SDP Contact	  */
	public int getZZSecondarySDProviderContact_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZSecondarySDProviderContact_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** ZZSecondarySDProviderLevy AD_Reference_ID=319 */
	public static final int ZZSECONDARYSDPROVIDERLEVY_AD_Reference_ID=319;
	/** No = N */
	public static final String ZZSECONDARYSDPROVIDERLEVY_No = "N";
	/** Yes = Y */
	public static final String ZZSECONDARYSDPROVIDERLEVY_Yes = "Y";
	/** Set Secondary SDP Skills Levy.
		@param ZZSecondarySDProviderLevy Secondary SDP Skills Levy
	*/
	public void setZZSecondarySDProviderLevy (String ZZSecondarySDProviderLevy)
	{

		set_Value (COLUMNNAME_ZZSecondarySDProviderLevy, ZZSecondarySDProviderLevy);
	}

	/** Get Secondary SDP Skills Levy.
		@return Secondary SDP Skills Levy	  */
	public String getZZSecondarySDProviderLevy()
	{
		return (String)get_Value(COLUMNNAME_ZZSecondarySDProviderLevy);
	}

	public I_ZZProvider getZZSecondarySDProvider() throws RuntimeException
	{
		return (I_ZZProvider)MTable.get(getCtx(), I_ZZProvider.Table_ID)
			.getPO(getZZSecondarySDProvider_ID(), get_TrxName());
	}

	/** Set Secondary Skills Development Provider.
		@param ZZSecondarySDProvider_ID Secondary Skills Development Provider
	*/
	public void setZZSecondarySDProvider_ID (int ZZSecondarySDProvider_ID)
	{
		if (ZZSecondarySDProvider_ID < 1)
			set_Value (COLUMNNAME_ZZSecondarySDProvider_ID, null);
		else
			set_Value (COLUMNNAME_ZZSecondarySDProvider_ID, Integer.valueOf(ZZSecondarySDProvider_ID));
	}

	/** Get Secondary Skills Development Provider.
		@return Secondary Skills Development Provider	  */
	public int getZZSecondarySDProvider_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZSecondarySDProvider_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Secondary Workplace Approval Contact.
		@param ZZSecondaryWAContact_ID Secondary Workplace Approval Contact
	*/
	public void setZZSecondaryWAContact_ID (int ZZSecondaryWAContact_ID)
	{
		if (ZZSecondaryWAContact_ID < 1)
			set_Value (COLUMNNAME_ZZSecondaryWAContact_ID, null);
		else
			set_Value (COLUMNNAME_ZZSecondaryWAContact_ID, Integer.valueOf(ZZSecondaryWAContact_ID));
	}

	/** Get Secondary Workplace Approval Contact.
		@return Secondary Workplace Approval Contact	  */
	public int getZZSecondaryWAContact_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZSecondaryWAContact_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** ZZSecondaryWALevy AD_Reference_ID=319 */
	public static final int ZZSECONDARYWALEVY_AD_Reference_ID=319;
	/** No = N */
	public static final String ZZSECONDARYWALEVY_No = "N";
	/** Yes = Y */
	public static final String ZZSECONDARYWALEVY_Yes = "Y";
	/** Set Secondary Workplace Approval Skills Levy.
		@param ZZSecondaryWALevy Secondary Workplace Approval Skills Levy
	*/
	public void setZZSecondaryWALevy (String ZZSecondaryWALevy)
	{

		set_Value (COLUMNNAME_ZZSecondaryWALevy, ZZSecondaryWALevy);
	}

	/** Get Secondary Workplace Approval Skills Levy.
		@return Secondary Workplace Approval Skills Levy	  */
	public String getZZSecondaryWALevy()
	{
		return (String)get_Value(COLUMNNAME_ZZSecondaryWALevy);
	}

	public I_ZZWorkplaceApproval getZZSecondaryWA() throws RuntimeException
	{
		return (I_ZZWorkplaceApproval)MTable.get(getCtx(), I_ZZWorkplaceApproval.Table_ID)
			.getPO(getZZSecondaryWA_ID(), get_TrxName());
	}

	/** Set Secondary Workplace Approval.
		@param ZZSecondaryWA_ID Secondary Workplace Approval
	*/
	public void setZZSecondaryWA_ID (int ZZSecondaryWA_ID)
	{
		if (ZZSecondaryWA_ID < 1)
			set_Value (COLUMNNAME_ZZSecondaryWA_ID, null);
		else
			set_Value (COLUMNNAME_ZZSecondaryWA_ID, Integer.valueOf(ZZSecondaryWA_ID));
	}

	/** Get Secondary Workplace Approval.
		@return Secondary Workplace Approval	  */
	public int getZZSecondaryWA_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZSecondaryWA_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Employed = 01 */
	public static final String ZZSOCIOECONOMICSTATUS_Employed = "01";
	/** Unemployed = 02 */
	public static final String ZZSOCIOECONOMICSTATUS_Unemployed = "02";
	/** Set Socio Economic Status.
		@param ZZSocioEconomicStatus Socio Economic Status
	*/
	public void setZZSocioEconomicStatus (String ZZSocioEconomicStatus)
	{

		set_Value (COLUMNNAME_ZZSocioEconomicStatus, ZZSocioEconomicStatus);
	}

	/** Get Socio Economic Status.
		@return Socio Economic Status	  */
	public String getZZSocioEconomicStatus()
	{
		return (String)get_Value(COLUMNNAME_ZZSocioEconomicStatus);
	}

	/** SETA Funded = 1 */
	public static final String ZZSPONSORSHIP_SETAFunded = "1";
	/** Industry Funded = 2 */
	public static final String ZZSPONSORSHIP_IndustryFunded = "2";
	/** Set Sponsorship.
		@param ZZSponsorship Sponsorship
	*/
	public void setZZSponsorship (String ZZSponsorship)
	{

		set_Value (COLUMNNAME_ZZSponsorship, ZZSponsorship);
	}

	/** Get Sponsorship.
		@return Sponsorship	  */
	public String getZZSponsorship()
	{
		return (String)get_Value(COLUMNNAME_ZZSponsorship);
	}

	/** Set Status Effective Date.
		@param ZZStatusEffectiveDate Status Effective Date
	*/
	public void setZZStatusEffectiveDate (Timestamp ZZStatusEffectiveDate)
	{
		set_Value (COLUMNNAME_ZZStatusEffectiveDate, ZZStatusEffectiveDate);
	}

	/** Get Status Effective Date.
		@return Status Effective Date	  */
	public Timestamp getZZStatusEffectiveDate()
	{
		return (Timestamp)get_Value(COLUMNNAME_ZZStatusEffectiveDate);
	}

	/** Set Student Number.
		@param ZZStudentNumber Student Number
	*/
	public void setZZStudentNumber (String ZZStudentNumber)
	{
		set_Value (COLUMNNAME_ZZStudentNumber, ZZStudentNumber);
	}

	/** Get Student Number.
		@return Student Number	  */
	public String getZZStudentNumber()
	{
		return (String)get_Value(COLUMNNAME_ZZStudentNumber);
	}

	public org.compiere.model.I_AD_User getZZTerminatedCapture() throws RuntimeException
	{
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_ID)
			.getPO(getZZTerminatedCapturedBy(), get_TrxName());
	}

	/** Set Terminated CapturedBy.
		@param ZZTerminatedCapturedBy Terminated CapturedBy
	*/
	public void setZZTerminatedCapturedBy (int ZZTerminatedCapturedBy)
	{
		set_Value (COLUMNNAME_ZZTerminatedCapturedBy, Integer.valueOf(ZZTerminatedCapturedBy));
	}

	/** Get Terminated CapturedBy.
		@return Terminated CapturedBy	  */
	public int getZZTerminatedCapturedBy()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZTerminatedCapturedBy);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Termination Date.
		@param ZZTerminationDate Termination Date
	*/
	public void setZZTerminationDate (Timestamp ZZTerminationDate)
	{
		set_Value (COLUMNNAME_ZZTerminationDate, ZZTerminationDate);
	}

	/** Get Termination Date.
		@return Termination Date	  */
	public Timestamp getZZTerminationDate()
	{
		return (Timestamp)get_Value(COLUMNNAME_ZZTerminationDate);
	}

	/** Learner absconded = Learner absconded */
	public static final String ZZTERMINATIONREASON_LearnerAbsconded = "Learner absconded";
	/** Learner got permanent employment somewhere else = Learner got permanent employment somewhere else */
	public static final String ZZTERMINATIONREASON_LearnerGotPermanentEmploymentSomewhereElse = "Learner got permanent employment somewhere else";
	/** Learner no longer working for the company = Learner no longer working for the company */
	public static final String ZZTERMINATIONREASON_LearnerNoLongerWorkingForTheCompany = "Learner no longer working for the company";
	/** Learner passed away = Learner passed away */
	public static final String ZZTERMINATIONREASON_LearnerPassedAway = "Learner passed away";
	/** Learner resigned = Learner resigned */
	public static final String ZZTERMINATIONREASON_LearnerResigned = "Learner resigned";
	/** Learner to continue with full time studies/went back to school = Learner to continue with full time studies/went back to scho */
	public static final String ZZTERMINATIONREASON_LearnerToContinueWithFullTimeStudiesWentBackToSchool = "Learner to continue with full time studies/went back to scho";
	/** Learner went AWOL = Learner went AWOL */
	public static final String ZZTERMINATIONREASON_LearnerWentAWOL = "Learner went AWOL";
	/** Other = Other */
	public static final String ZZTERMINATIONREASON_Other = "Other";
	/** Set Termination Reason.
		@param ZZTerminationReason Map to TerminationReasonID on old database
	*/
	public void setZZTerminationReason (String ZZTerminationReason)
	{

		set_Value (COLUMNNAME_ZZTerminationReason, ZZTerminationReason);
	}

	/** Get Termination Reason.
		@return Map to TerminationReasonID on old database
	  */
	public String getZZTerminationReason()
	{
		return (String)get_Value(COLUMNNAME_ZZTerminationReason);
	}

	/** Set Termination Reason.
		@param ZZTerminationReasonText Termination Reason
	*/
	public void setZZTerminationReasonText (String ZZTerminationReasonText)
	{
		set_Value (COLUMNNAME_ZZTerminationReasonText, ZZTerminationReasonText);
	}

	/** Get Termination Reason.
		@return Termination Reason	  */
	public String getZZTerminationReasonText()
	{
		return (String)get_Value(COLUMNNAME_ZZTerminationReasonText);
	}

	/** Set Trade Test Serial Number.
		@param ZZTradeTestSerialNumber Trade Test Serial Number
	*/
	public void setZZTradeTestSerialNumber (String ZZTradeTestSerialNumber)
	{
		set_Value (COLUMNNAME_ZZTradeTestSerialNumber, ZZTradeTestSerialNumber);
	}

	/** Get Trade Test Serial Number.
		@return Trade Test Serial Number	  */
	public String getZZTradeTestSerialNumber()
	{
		return (String)get_Value(COLUMNNAME_ZZTradeTestSerialNumber);
	}

	/** Set Lead Workplace Approval Contact.
		@param ZZWAContact_ID Lead Workplace Approval Contact
	*/
	public void setZZWAContact_ID (int ZZWAContact_ID)
	{
		if (ZZWAContact_ID < 1)
			set_Value (COLUMNNAME_ZZWAContact_ID, null);
		else
			set_Value (COLUMNNAME_ZZWAContact_ID, Integer.valueOf(ZZWAContact_ID));
	}

	/** Get Lead Workplace Approval Contact.
		@return Lead Workplace Approval Contact	  */
	public int getZZWAContact_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZWAContact_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** ZZWALevy AD_Reference_ID=319 */
	public static final int ZZWALEVY_AD_Reference_ID=319;
	/** No = N */
	public static final String ZZWALEVY_No = "N";
	/** Yes = Y */
	public static final String ZZWALEVY_Yes = "Y";
	/** Set Lead Workplace Approval Skills Levy.
		@param ZZWALevy Lead Workplace Approval Skills Levy
	*/
	public void setZZWALevy (String ZZWALevy)
	{

		set_Value (COLUMNNAME_ZZWALevy, ZZWALevy);
	}

	/** Get Lead Workplace Approval Skills Levy.
		@return Lead Workplace Approval Skills Levy	  */
	public String getZZWALevy()
	{
		return (String)get_Value(COLUMNNAME_ZZWALevy);
	}

	public org.compiere.model.I_C_BPartner getZZ_Employer() throws RuntimeException
	{
		return (org.compiere.model.I_C_BPartner)MTable.get(getCtx(), org.compiere.model.I_C_BPartner.Table_ID)
			.getPO(getZZ_Employer_ID(), get_TrxName());
	}

	/** Set Employer.
		@param ZZ_Employer_ID Lead Workplace Approval
	*/
	public void setZZ_Employer_ID (int ZZ_Employer_ID)
	{
		if (ZZ_Employer_ID < 1)
			set_Value (COLUMNNAME_ZZ_Employer_ID, null);
		else
			set_Value (COLUMNNAME_ZZ_Employer_ID, Integer.valueOf(ZZ_Employer_ID));
	}

	/** Get Employer.
		@return Lead Workplace Approval
	  */
	public int getZZ_Employer_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZ_Employer_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_BPartner getZZ_SDP() throws RuntimeException
	{
		return (org.compiere.model.I_C_BPartner)MTable.get(getCtx(), org.compiere.model.I_C_BPartner.Table_ID)
			.getPO(getZZ_SDP_ID(), get_TrxName());
	}

	/** Set SDP.
		@param ZZ_SDP_ID Lead Skills Development Provider
	*/
	public void setZZ_SDP_ID (int ZZ_SDP_ID)
	{
		if (ZZ_SDP_ID < 1)
			set_Value (COLUMNNAME_ZZ_SDP_ID, null);
		else
			set_Value (COLUMNNAME_ZZ_SDP_ID, Integer.valueOf(ZZ_SDP_ID));
	}

	/** Get SDP.
		@return Lead Skills Development Provider
	  */
	public int getZZ_SDP_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZ_SDP_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}