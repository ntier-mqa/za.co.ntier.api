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

/** Generated Model for ZZ_QAAuditAllocations
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="ZZ_QAAuditAllocations")
public class X_ZZ_QAAuditAllocations extends PO implements I_ZZ_QAAuditAllocations, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20260414L;

    /** Standard Constructor */
    public X_ZZ_QAAuditAllocations (Properties ctx, int ZZ_QAAuditAllocations_ID, String trxName)
    {
      super (ctx, ZZ_QAAuditAllocations_ID, trxName);
      /** if (ZZ_QAAuditAllocations_ID == 0)
        {
        } */
    }

    /** Standard Constructor */
    public X_ZZ_QAAuditAllocations (Properties ctx, int ZZ_QAAuditAllocations_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZ_QAAuditAllocations_ID, trxName, virtualColumns);
      /** if (ZZ_QAAuditAllocations_ID == 0)
        {
        } */
    }

    /** Standard Constructor */
    public X_ZZ_QAAuditAllocations (Properties ctx, String ZZ_QAAuditAllocations_UU, String trxName)
    {
      super (ctx, ZZ_QAAuditAllocations_UU, trxName);
      /** if (ZZ_QAAuditAllocations_UU == null)
        {
        } */
    }

    /** Standard Constructor */
    public X_ZZ_QAAuditAllocations (Properties ctx, String ZZ_QAAuditAllocations_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZ_QAAuditAllocations_UU, trxName, virtualColumns);
      /** if (ZZ_QAAuditAllocations_UU == null)
        {
        } */
    }

    /** Load Constructor */
    public X_ZZ_QAAuditAllocations (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_ZZ_QAAuditAllocations[")
        .append(get_ID()).append(",Name=").append(getName()).append("]");
      return sb.toString();
    }

	/** Set Address 1.
		@param Address1 Address line 1 for this location
	*/
	public void setAddress1 (String Address1)
	{
		set_ValueNoCheck (COLUMNNAME_Address1, Address1);
	}

	/** Get Address 1.
		@return Address line 1 for this location
	  */
	public String getAddress1()
	{
		return (String)get_Value(COLUMNNAME_Address1);
	}

	/** Set Address 2.
		@param Address2 Address line 2 for this location
	*/
	public void setAddress2 (String Address2)
	{
		set_ValueNoCheck (COLUMNNAME_Address2, Address2);
	}

	/** Get Address 2.
		@return Address line 2 for this location
	  */
	public String getAddress2()
	{
		return (String)get_Value(COLUMNNAME_Address2);
	}

	/** Set City.
		@param City Identifies a City
	*/
	public void setCity (String City)
	{
		set_ValueNoCheck (COLUMNNAME_City, City);
	}

	/** Get City.
		@return Identifies a City
	  */
	public String getCity()
	{
		return (String)get_Value(COLUMNNAME_City);
	}

	/** Set EMail Address.
		@param EMail Electronic Mail Address
	*/
	public void setEMail (String EMail)
	{
		set_Value (COLUMNNAME_EMail, EMail);
	}

	/** Get EMail Address.
		@return Electronic Mail Address
	  */
	public String getEMail()
	{
		return (String)get_Value(COLUMNNAME_EMail);
	}

	/** Set Line.
		@param LineNo Line No
	*/
	public void setLineNo (int LineNo)
	{
		set_Value (COLUMNNAME_LineNo, Integer.valueOf(LineNo));
	}

	/** Get Line.
		@return Line No
	  */
	public int getLineNo()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_LineNo);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Observation.
		@param ManualNote Note for manual entry
	*/
	public void setManualNote (String ManualNote)
	{
		set_Value (COLUMNNAME_ManualNote, ManualNote);
	}

	/** Get Observation.
		@return Note for manual entry
	  */
	public String getManualNote()
	{
		return (String)get_Value(COLUMNNAME_ManualNote);
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

	/** Set Postalcode.
		@param Postalcode Postalcode
	*/
	public void setPostalcode (String Postalcode)
	{
		set_Value (COLUMNNAME_Postalcode, Postalcode);
	}

	/** Get Postalcode.
		@return Postalcode	  */
	public String getPostalcode()
	{
		return (String)get_Value(COLUMNNAME_Postalcode);
	}

	/** Set Region.
		@param Region Region
	*/
	public void setRegion (String Region)
	{
		set_ValueNoCheck (COLUMNNAME_Region, Region);
	}

	/** Get Region.
		@return Region	  */
	public String getRegion()
	{
		return (String)get_Value(COLUMNNAME_Region);
	}

	/** Set Legal Name.
		@param ZZLegalName Legal Name
	*/
	public void setZZLegalName (String ZZLegalName)
	{
		set_Value (COLUMNNAME_ZZLegalName, ZZLegalName);
	}

	/** Get Legal Name.
		@return Legal Name	  */
	public String getZZLegalName()
	{
		return (String)get_Value(COLUMNNAME_ZZLegalName);
	}

	/** Set Surname.
		@param ZZSurname Surname
	*/
	public void setZZSurname (String ZZSurname)
	{
		set_Value (COLUMNNAME_ZZSurname, ZZSurname);
	}

	/** Get Surname.
		@return Surname	  */
	public String getZZSurname()
	{
		return (String)get_Value(COLUMNNAME_ZZSurname);
	}

	/** Set Trade Name.
		@param ZZTradeName Trade Name
	*/
	public void setZZTradeName (String ZZTradeName)
	{
		set_ValueNoCheck (COLUMNNAME_ZZTradeName, ZZTradeName);
	}

	/** Get Trade Name.
		@return Trade Name	  */
	public String getZZTradeName()
	{
		return (String)get_Value(COLUMNNAME_ZZTradeName);
	}

	/** Set Allocation Month.
		@param ZZ_AllocationMonth Allocation Month
	*/
	public void setZZ_AllocationMonth (String ZZ_AllocationMonth)
	{
		set_Value (COLUMNNAME_ZZ_AllocationMonth, ZZ_AllocationMonth);
	}

	/** Get Allocation Month.
		@return Allocation Month
	  */
	public String getZZ_AllocationMonth()
	{
		return (String)get_Value(COLUMNNAME_ZZ_AllocationMonth);
	}

	/** Set Allocation No.
		@param ZZ_AllocationNo Allocation No
	*/
	public void setZZ_AllocationNo (String ZZ_AllocationNo)
	{
		set_Value (COLUMNNAME_ZZ_AllocationNo, ZZ_AllocationNo);
	}

	/** Get Allocation No.
		@return Allocation No	  */
	public String getZZ_AllocationNo()
	{
		return (String)get_Value(COLUMNNAME_ZZ_AllocationNo);
	}

	/** Set Alt Contact Email.
		@param ZZ_AltContactEmail Email of Alt Contact
	*/
	public void setZZ_AltContactEmail (String ZZ_AltContactEmail)
	{
		set_Value (COLUMNNAME_ZZ_AltContactEmail, ZZ_AltContactEmail);
	}

	/** Get Alt Contact Email.
		@return Email of Alt Contact
	  */
	public String getZZ_AltContactEmail()
	{
		return (String)get_Value(COLUMNNAME_ZZ_AltContactEmail);
	}

	/** Set Alt Contact Name.
		@param ZZ_AltContactName Full Name(s) of Additional Contact Person
	*/
	public void setZZ_AltContactName (String ZZ_AltContactName)
	{
		set_Value (COLUMNNAME_ZZ_AltContactName, ZZ_AltContactName);
	}

	/** Get Alt Contact Name.
		@return Full Name(s) of Additional Contact Person
	  */
	public String getZZ_AltContactName()
	{
		return (String)get_Value(COLUMNNAME_ZZ_AltContactName);
	}

	/** Set Alt Contact Surname.
		@param ZZ_AltContactSurname Surname of Alt Contact
	*/
	public void setZZ_AltContactSurname (String ZZ_AltContactSurname)
	{
		set_Value (COLUMNNAME_ZZ_AltContactSurname, ZZ_AltContactSurname);
	}

	/** Get Alt Contact Surname.
		@return Surname of Alt Contact
	  */
	public String getZZ_AltContactSurname()
	{
		return (String)get_Value(COLUMNNAME_ZZ_AltContactSurname);
	}

	/** Set Alt Contact Title.
		@param ZZ_AltContactTitle Title of Additional Contact Person
	*/
	public void setZZ_AltContactTitle (String ZZ_AltContactTitle)
	{
		set_Value (COLUMNNAME_ZZ_AltContactTitle, ZZ_AltContactTitle);
	}

	/** Get Alt Contact Title.
		@return Title of Additional Contact Person
	  */
	public String getZZ_AltContactTitle()
	{
		return (String)get_Value(COLUMNNAME_ZZ_AltContactTitle);
	}

	/** Set CIPC Registration.
		@param ZZ_CIPCNumber CIPC Registration
	*/
	public void setZZ_CIPCNumber (String ZZ_CIPCNumber)
	{
		set_Value (COLUMNNAME_ZZ_CIPCNumber, ZZ_CIPCNumber);
	}

	/** Get CIPC Registration.
		@return CIPC Registration
	  */
	public String getZZ_CIPCNumber()
	{
		return (String)get_Value(COLUMNNAME_ZZ_CIPCNumber);
	}

	/** Set Title of Contact Person.
		@param ZZ_ContactTitle Title of Contact Person
	*/
	public void setZZ_ContactTitle (String ZZ_ContactTitle)
	{
		set_Value (COLUMNNAME_ZZ_ContactTitle, ZZ_ContactTitle);
	}

	/** Get Title of Contact Person.
		@return Title of Contact Person
	  */
	public String getZZ_ContactTitle()
	{
		return (String)get_Value(COLUMNNAME_ZZ_ContactTitle);
	}

	/** Set Date Not Recommended.
		@param ZZ_Date_Not_Recommended Date Not Recommended
	*/
	public void setZZ_Date_Not_Recommended (Timestamp ZZ_Date_Not_Recommended)
	{
		set_Value (COLUMNNAME_ZZ_Date_Not_Recommended, ZZ_Date_Not_Recommended);
	}

	/** Get Date Not Recommended.
		@return Date Not Recommended	  */
	public Timestamp getZZ_Date_Not_Recommended()
	{
		return (Timestamp)get_Value(COLUMNNAME_ZZ_Date_Not_Recommended);
	}

	/** Set Date Recommended.
		@param ZZ_Date_Recommended Date Recommended
	*/
	public void setZZ_Date_Recommended (Timestamp ZZ_Date_Recommended)
	{
		set_Value (COLUMNNAME_ZZ_Date_Recommended, ZZ_Date_Recommended);
	}

	/** Get Date Recommended.
		@return Date Recommended	  */
	public Timestamp getZZ_Date_Recommended()
	{
		return (Timestamp)get_Value(COLUMNNAME_ZZ_Date_Recommended);
	}

	/** Set Designation.
		@param ZZ_Designation Designation
	*/
	public void setZZ_Designation (String ZZ_Designation)
	{
		set_Value (COLUMNNAME_ZZ_Designation, ZZ_Designation);
	}

	/** Get Designation.
		@return Designation	  */
	public String getZZ_Designation()
	{
		return (String)get_Value(COLUMNNAME_ZZ_Designation);
	}

	/** Exec Approve = AE */
	public static final String ZZ_DOCACTION_ExecApprove = "AE";
	/** Approve/Do Not Approve = AP */
	public static final String ZZ_DOCACTION_ApproveDoNotApprove = "AP";
	/** Complete = CO */
	public static final String ZZ_DOCACTION_Complete = "CO";
	/** Evaluate = EV */
	public static final String ZZ_DOCACTION_Evaluate = "EV";
	/** Final Approval/Do not Approve = FA */
	public static final String ZZ_DOCACTION_FinalApprovalDoNotApprove = "FA";
	/** PrepareCEO = PC */
	public static final String ZZ_DOCACTION_PrepareCEO = "PC";
	/** Recommend = RE */
	public static final String ZZ_DOCACTION_Recommend = "RE";
	/** Re-Submit = RS */
	public static final String ZZ_DOCACTION_Re_Submit = "RS";
	/** Submit = S1 */
	public static final String ZZ_DOCACTION_Submit = "S1";
	/** System Only (No manual action) = S2 */
	public static final String ZZ_DOCACTION_SystemOnlyNoManualAction = "S2";
	/** Submit to Manager Finance Consumables = SC */
	public static final String ZZ_DOCACTION_SubmitToManagerFinanceConsumables = "SC";
	/** Submit to SDL Finance Mgr = SD */
	public static final String ZZ_DOCACTION_SubmitToSDLFinanceMgr = "SD";
	/** Submit to Snr Mgr LP = SL */
	public static final String ZZ_DOCACTION_SubmitToSnrMgrLP = "SL";
	/** Submit to Snr Mgr Ops = SO */
	public static final String ZZ_DOCACTION_SubmitToSnrMgrOps = "SO";
	/** Submit to Snr Mgr Projects = SP */
	public static final String ZZ_DOCACTION_SubmitToSnrMgrProjects = "SP";
	/** Submit to Snr Mgr QA = SQ */
	public static final String ZZ_DOCACTION_SubmitToSnrMgrQA = "SQ";
	/** Submit to Recommender = SR */
	public static final String ZZ_DOCACTION_SubmitToRecommender = "SR";
	/** Submit to Snr Mgr SRU = SS */
	public static final String ZZ_DOCACTION_SubmitToSnrMgrSRU = "SS";
	/** Submit to Line Manager = SU */
	public static final String ZZ_DOCACTION_SubmitToLineManager = "SU";
	/** Update = UP */
	public static final String ZZ_DOCACTION_Update = "UP";
	/** Verify = VE */
	public static final String ZZ_DOCACTION_Verify = "VE";
	/** Set Document Action.
		@param ZZ_DocAction Document Action
	*/
	public void setZZ_DocAction (String ZZ_DocAction)
	{

		set_Value (COLUMNNAME_ZZ_DocAction, ZZ_DocAction);
	}

	/** Get Document Action.
		@return Document Action	  */
	public String getZZ_DocAction()
	{
		return (String)get_Value(COLUMNNAME_ZZ_DocAction);
	}

	/** Audit Confirmed = AC */
	public static final String ZZ_DOCSTATUS_AuditConfirmed = "AC";
	/** Approved = AP */
	public static final String ZZ_DOCSTATUS_Approved = "AP";
	/** Awaiting QCTO Recommendation = AW */
	public static final String ZZ_DOCSTATUS_AwaitingQCTORecommendation = "AW";
	/** Audit Cancelled = AX */
	public static final String ZZ_DOCSTATUS_AuditCancelled = "AX";
	/** Draft = DR */
	public static final String ZZ_DOCSTATUS_Draft = "DR";
	/** Not Approved = NA */
	public static final String ZZ_DOCSTATUS_NotApproved = "NA";
	/** Not Recommended = NR */
	public static final String ZZ_DOCSTATUS_NotRecommended = "NR";
	/** Recommended = RC */
	public static final String ZZ_DOCSTATUS_Recommended = "RC";
	/** Received from QCTO = RF */
	public static final String ZZ_DOCSTATUS_ReceivedFromQCTO = "RF";
	/** Audit Notification Sent = ST */
	public static final String ZZ_DOCSTATUS_AuditNotificationSent = "ST";
	/** Site Visit Notification Sent = SV */
	public static final String ZZ_DOCSTATUS_SiteVisitNotificationSent = "SV";
	/** Site Visit Date Confirmed = VC */
	public static final String ZZ_DOCSTATUS_SiteVisitDateConfirmed = "VC";
	/** Set Document Status.
		@param ZZ_DocStatus Document Status
	*/
	public void setZZ_DocStatus (String ZZ_DocStatus)
	{

		set_Value (COLUMNNAME_ZZ_DocStatus, ZZ_DocStatus);
	}

	/** Get Document Status.
		@return Document Status	  */
	public String getZZ_DocStatus()
	{
		return (String)get_Value(COLUMNNAME_ZZ_DocStatus);
	}

	/** Level 1 = 01 */
	public static final String ZZ_NQF_LEVEL_Level1 = "01";
	/** Level 2 = 02 */
	public static final String ZZ_NQF_LEVEL_Level2 = "02";
	/** Level 3 = 03 */
	public static final String ZZ_NQF_LEVEL_Level3 = "03";
	/** Level 4 = 04 */
	public static final String ZZ_NQF_LEVEL_Level4 = "04";
	/** Level 5 = 05 */
	public static final String ZZ_NQF_LEVEL_Level5 = "05";
	/** Level 6 = 06 */
	public static final String ZZ_NQF_LEVEL_Level6 = "06";
	/** Level 7 = 07 */
	public static final String ZZ_NQF_LEVEL_Level7 = "07";
	/** Level 8 = 08 */
	public static final String ZZ_NQF_LEVEL_Level8 = "08";
	/** Level 9 = 09 */
	public static final String ZZ_NQF_LEVEL_Level9 = "09";
	/** Level 10 = 10 */
	public static final String ZZ_NQF_LEVEL_Level10 = "10";
	/** Level1-3 = L3 */
	public static final String ZZ_NQF_LEVEL_Level1_3 = "L3";
	/** N1 - N3 = NN */
	public static final String ZZ_NQF_LEVEL_N1_N3 = "NN";
	/** Pre Basic = PB */
	public static final String ZZ_NQF_LEVEL_PreBasic = "PB";
	/** Set NQF Level.
		@param ZZ_NQF_Level NQF Level
	*/
	public void setZZ_NQF_Level (String ZZ_NQF_Level)
	{

		set_Value (COLUMNNAME_ZZ_NQF_Level, ZZ_NQF_Level);
	}

	/** Get NQF Level.
		@return NQF Level	  */
	public String getZZ_NQF_Level()
	{
		return (String)get_Value(COLUMNNAME_ZZ_NQF_Level);
	}

	/** Set QA Audit Allocations.
		@param ZZ_QAAuditAllocations_ID QA Audit Allocations
	*/
	public void setZZ_QAAuditAllocations_ID (int ZZ_QAAuditAllocations_ID)
	{
		if (ZZ_QAAuditAllocations_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZ_QAAuditAllocations_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZ_QAAuditAllocations_ID, Integer.valueOf(ZZ_QAAuditAllocations_ID));
	}

	/** Get QA Audit Allocations.
		@return QA Audit Allocations	  */
	public int getZZ_QAAuditAllocations_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZ_QAAuditAllocations_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set ZZ_QAAuditAllocations_UU.
		@param ZZ_QAAuditAllocations_UU ZZ_QAAuditAllocations_UU
	*/
	public void setZZ_QAAuditAllocations_UU (String ZZ_QAAuditAllocations_UU)
	{
		set_ValueNoCheck (COLUMNNAME_ZZ_QAAuditAllocations_UU, ZZ_QAAuditAllocations_UU);
	}

	/** Get ZZ_QAAuditAllocations_UU.
		@return ZZ_QAAuditAllocations_UU	  */
	public String getZZ_QAAuditAllocations_UU()
	{
		return (String)get_Value(COLUMNNAME_ZZ_QAAuditAllocations_UU);
	}

	public I_ZZ_QAAudit getZZ_QAAudit() throws RuntimeException
	{
		return (I_ZZ_QAAudit)MTable.get(getCtx(), I_ZZ_QAAudit.Table_ID)
			.getPO(getZZ_QAAudit_ID(), get_TrxName());
	}

	/** Set QA Audit.
		@param ZZ_QAAudit_ID QA Audit
	*/
	public void setZZ_QAAudit_ID (int ZZ_QAAudit_ID)
	{
		if (ZZ_QAAudit_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZ_QAAudit_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZ_QAAudit_ID, Integer.valueOf(ZZ_QAAudit_ID));
	}

	/** Get QA Audit.
		@return QA Audit	  */
	public int getZZ_QAAudit_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZ_QAAudit_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_ZZ_QCTO_Alloc_AC getZZ_QCTO_Alloc_AC() throws RuntimeException
	{
		return (I_ZZ_QCTO_Alloc_AC)MTable.get(getCtx(), I_ZZ_QCTO_Alloc_AC.Table_ID)
			.getPO(getZZ_QCTO_Alloc_AC_ID(), get_TrxName());
	}

	/** Set ZZ_QCTO_Alloc_AC.
		@param ZZ_QCTO_Alloc_AC_ID ZZ_QCTO_Alloc_AC
	*/
	public void setZZ_QCTO_Alloc_AC_ID (int ZZ_QCTO_Alloc_AC_ID)
	{
		if (ZZ_QCTO_Alloc_AC_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZ_QCTO_Alloc_AC_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZ_QCTO_Alloc_AC_ID, Integer.valueOf(ZZ_QCTO_Alloc_AC_ID));
	}

	/** Get ZZ_QCTO_Alloc_AC.
		@return ZZ_QCTO_Alloc_AC	  */
	public int getZZ_QCTO_Alloc_AC_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZ_QCTO_Alloc_AC_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_ZZ_QCTO_Alloc_OC getZZ_QCTO_Alloc_OC() throws RuntimeException
	{
		return (I_ZZ_QCTO_Alloc_OC)MTable.get(getCtx(), I_ZZ_QCTO_Alloc_OC.Table_ID)
			.getPO(getZZ_QCTO_Alloc_OC_ID(), get_TrxName());
	}

	/** Set ZZ_QCTO_Alloc_OC.
		@param ZZ_QCTO_Alloc_OC_ID ZZ_QCTO_Alloc_OC
	*/
	public void setZZ_QCTO_Alloc_OC_ID (int ZZ_QCTO_Alloc_OC_ID)
	{
		if (ZZ_QCTO_Alloc_OC_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZ_QCTO_Alloc_OC_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZ_QCTO_Alloc_OC_ID, Integer.valueOf(ZZ_QCTO_Alloc_OC_ID));
	}

	/** Get ZZ_QCTO_Alloc_OC.
		@return ZZ_QCTO_Alloc_OC	  */
	public int getZZ_QCTO_Alloc_OC_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZ_QCTO_Alloc_OC_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_ZZ_QCTO_Alloc_Skills getZZ_QCTO_Alloc_Skills() throws RuntimeException
	{
		return (I_ZZ_QCTO_Alloc_Skills)MTable.get(getCtx(), I_ZZ_QCTO_Alloc_Skills.Table_ID)
			.getPO(getZZ_QCTO_Alloc_Skills_ID(), get_TrxName());
	}

	/** Set ZZ_QCTO_Alloc_Skills.
		@param ZZ_QCTO_Alloc_Skills_ID ZZ_QCTO_Alloc_Skills
	*/
	public void setZZ_QCTO_Alloc_Skills_ID (int ZZ_QCTO_Alloc_Skills_ID)
	{
		if (ZZ_QCTO_Alloc_Skills_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZ_QCTO_Alloc_Skills_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZ_QCTO_Alloc_Skills_ID, Integer.valueOf(ZZ_QCTO_Alloc_Skills_ID));
	}

	/** Get ZZ_QCTO_Alloc_Skills.
		@return ZZ_QCTO_Alloc_Skills	  */
	public int getZZ_QCTO_Alloc_Skills_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZ_QCTO_Alloc_Skills_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_ZZ_QCTO_Allocation getZZ_QCTO_Allocation() throws RuntimeException
	{
		return (I_ZZ_QCTO_Allocation)MTable.get(getCtx(), I_ZZ_QCTO_Allocation.Table_ID)
			.getPO(getZZ_QCTO_Allocation_ID(), get_TrxName());
	}

	/** Set ZZ_QCTO_Allocation_ID.
		@param ZZ_QCTO_Allocation_ID ZZ_QCTO_Allocation_ID
	*/
	public void setZZ_QCTO_Allocation_ID (int ZZ_QCTO_Allocation_ID)
	{
		if (ZZ_QCTO_Allocation_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZ_QCTO_Allocation_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZ_QCTO_Allocation_ID, Integer.valueOf(ZZ_QCTO_Allocation_ID));
	}

	/** Get ZZ_QCTO_Allocation_ID.
		@return ZZ_QCTO_Allocation_ID	  */
	public int getZZ_QCTO_Allocation_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZ_QCTO_Allocation_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Qualification.
		@param ZZ_Qualification Qualification
	*/
	public void setZZ_Qualification (String ZZ_Qualification)
	{
		set_Value (COLUMNNAME_ZZ_Qualification, ZZ_Qualification);
	}

	/** Get Qualification.
		@return Qualification	  */
	public String getZZ_Qualification()
	{
		return (String)get_Value(COLUMNNAME_ZZ_Qualification);
	}

	/** Set Quality Partner.
		@param ZZ_QualityPartner Quality Partner
	*/
	public void setZZ_QualityPartner (String ZZ_QualityPartner)
	{
		set_Value (COLUMNNAME_ZZ_QualityPartner, ZZ_QualityPartner);
	}

	/** Get Quality Partner.
		@return Quality Partner
	  */
	public String getZZ_QualityPartner()
	{
		return (String)get_Value(COLUMNNAME_ZZ_QualityPartner);
	}

	public org.compiere.model.I_AD_User getZZ_Recommender() throws RuntimeException
	{
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_ID)
			.getPO(getZZ_Recommender_ID(), get_TrxName());
	}

	/** Set Recommender.
		@param ZZ_Recommender_ID Recommender
	*/
	public void setZZ_Recommender_ID (int ZZ_Recommender_ID)
	{
		if (ZZ_Recommender_ID < 1)
			set_Value (COLUMNNAME_ZZ_Recommender_ID, null);
		else
			set_Value (COLUMNNAME_ZZ_Recommender_ID, Integer.valueOf(ZZ_Recommender_ID));
	}

	/** Get Recommender.
		@return Recommender	  */
	public int getZZ_Recommender_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZ_Recommender_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set SAQA ID Number.
		@param ZZ_SAQAIDOrSPID SAQA ID Number
	*/
	public void setZZ_SAQAIDOrSPID (String ZZ_SAQAIDOrSPID)
	{
		set_Value (COLUMNNAME_ZZ_SAQAIDOrSPID, ZZ_SAQAIDOrSPID);
	}

	/** Get SAQA ID Number.
		@return SAQA ID Number
	  */
	public String getZZ_SAQAIDOrSPID()
	{
		return (String)get_Value(COLUMNNAME_ZZ_SAQAIDOrSPID);
	}

	/** Set Site Visit Date.
		@param ZZ_SiteVisitDate Site Visit Date
	*/
	public void setZZ_SiteVisitDate (Timestamp ZZ_SiteVisitDate)
	{
		set_Value (COLUMNNAME_ZZ_SiteVisitDate, ZZ_SiteVisitDate);
	}

	/** Get Site Visit Date.
		@return Site Visit Date
	  */
	public Timestamp getZZ_SiteVisitDate()
	{
		return (Timestamp)get_Value(COLUMNNAME_ZZ_SiteVisitDate);
	}
}