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

/** Generated Model for ZZAssessorRegistrationHistory
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="ZZAssessorRegistrationHistory")
public class X_ZZAssessorRegistrationHistory extends PO implements I_ZZAssessorRegistrationHistory, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20260702L;

    /** Standard Constructor */
    public X_ZZAssessorRegistrationHistory (Properties ctx, int ZZAssessorRegistrationHistory_ID, String trxName)
    {
      super (ctx, ZZAssessorRegistrationHistory_ID, trxName);
      /** if (ZZAssessorRegistrationHistory_ID == 0)
        {
			setZZAssessorRegistrationHistory_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZAssessorRegistrationHistory (Properties ctx, int ZZAssessorRegistrationHistory_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZAssessorRegistrationHistory_ID, trxName, virtualColumns);
      /** if (ZZAssessorRegistrationHistory_ID == 0)
        {
			setZZAssessorRegistrationHistory_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZAssessorRegistrationHistory (Properties ctx, String ZZAssessorRegistrationHistory_UU, String trxName)
    {
      super (ctx, ZZAssessorRegistrationHistory_UU, trxName);
      /** if (ZZAssessorRegistrationHistory_UU == null)
        {
			setZZAssessorRegistrationHistory_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZAssessorRegistrationHistory (Properties ctx, String ZZAssessorRegistrationHistory_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZAssessorRegistrationHistory_UU, trxName, virtualColumns);
      /** if (ZZAssessorRegistrationHistory_UU == null)
        {
			setZZAssessorRegistrationHistory_ID (0);
        } */
    }

    /** Load Constructor */
    public X_ZZAssessorRegistrationHistory (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_ZZAssessorRegistrationHistory[")
        .append(get_ID()).append("]");
      return sb.toString();
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

	/** Set Assessor Registration History.
		@param ZZAssessorRegistrationHistory_ID Assessor Registration History
	*/
	public void setZZAssessorRegistrationHistory_ID (int ZZAssessorRegistrationHistory_ID)
	{
		if (ZZAssessorRegistrationHistory_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZAssessorRegistrationHistory_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZAssessorRegistrationHistory_ID, Integer.valueOf(ZZAssessorRegistrationHistory_ID));
	}

	/** Get Assessor Registration History.
		@return Assessor Registration History	  */
	public int getZZAssessorRegistrationHistory_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZAssessorRegistrationHistory_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set ZZAssessorRegistrationHistory_UU.
		@param ZZAssessorRegistrationHistory_UU ZZAssessorRegistrationHistory_UU
	*/
	public void setZZAssessorRegistrationHistory_UU (String ZZAssessorRegistrationHistory_UU)
	{
		set_Value (COLUMNNAME_ZZAssessorRegistrationHistory_UU, ZZAssessorRegistrationHistory_UU);
	}

	/** Get ZZAssessorRegistrationHistory_UU.
		@return ZZAssessorRegistrationHistory_UU	  */
	public String getZZAssessorRegistrationHistory_UU()
	{
		return (String)get_Value(COLUMNNAME_ZZAssessorRegistrationHistory_UU);
	}

	/** Set Submitted Date.
		@param ZZSubmittedDate Submitted Date
	*/
	public void setZZSubmittedDate (Timestamp ZZSubmittedDate)
	{
		set_Value (COLUMNNAME_ZZSubmittedDate, ZZSubmittedDate);
	}

	/** Get Submitted Date.
		@return Submitted Date	  */
	public Timestamp getZZSubmittedDate()
	{
		return (Timestamp)get_Value(COLUMNNAME_ZZSubmittedDate);
	}

	/** Approved By Manager Finance Consumables = AC */
	public static final String ZZ_DOCSTATUS_ApprovedByManagerFinanceConsumables = "AC";
	/** Approved = AP */
	public static final String ZZ_DOCSTATUS_Approved = "AP";
	/** Prepared for CEO = CF */
	public static final String ZZ_DOCSTATUS_PreparedForCEO = "CF";
	/** Completed = CO */
	public static final String ZZ_DOCSTATUS_Completed = "CO";
	/** Draft = DR */
	public static final String ZZ_DOCSTATUS_Draft = "DR";
	/** Error Importing = EE */
	public static final String ZZ_DOCSTATUS_ErrorImporting = "EE";
	/** Validation Error = ER */
	public static final String ZZ_DOCSTATUS_ValidationError = "ER";
	/** Evaluated = EV */
	public static final String ZZ_DOCSTATUS_Evaluated = "EV";
	/** Importing = IG */
	public static final String ZZ_DOCSTATUS_Importing = "IG";
	/** Imported = IM */
	public static final String ZZ_DOCSTATUS_Imported = "IM";
	/** In Progress = IP */
	public static final String ZZ_DOCSTATUS_InProgress = "IP";
	/** Not Recommended By Senior Mgr SDR = N1 */
	public static final String ZZ_DOCSTATUS_NotRecommendedBySeniorMgrSDR = "N1";
	/** Not Recommended By Senior Mgr Finance = N2 */
	public static final String ZZ_DOCSTATUS_NotRecommendedBySeniorMgrFinance = "N2";
	/** Not Recommended By COO = N3 */
	public static final String ZZ_DOCSTATUS_NotRecommendedByCOO = "N3";
	/** Not Recommended By CFO = N4 */
	public static final String ZZ_DOCSTATUS_NotRecommendedByCFO = "N4";
	/** Not Recommended By CEO = N5 */
	public static final String ZZ_DOCSTATUS_NotRecommendedByCEO = "N5";
	/** Not Approved by Snr Manager = NA */
	public static final String ZZ_DOCSTATUS_NotApprovedBySnrManager = "NA";
	/** Not Approved By Manager Finance Consumables = NC */
	public static final String ZZ_DOCSTATUS_NotApprovedByManagerFinanceConsumables = "NC";
	/** Not Approved By SDL Finance Mgr = ND */
	public static final String ZZ_DOCSTATUS_NotApprovedBySDLFinanceMgr = "ND";
	/** Not Approved By IT Manager = NI */
	public static final String ZZ_DOCSTATUS_NotApprovedByITManager = "NI";
	/** Not Approved by LM = NL */
	public static final String ZZ_DOCSTATUS_NotApprovedByLM = "NL";
	/** Not Approved = NP */
	public static final String ZZ_DOCSTATUS_NotApproved = "NP";
	/** Not Recommended = NR */
	public static final String ZZ_DOCSTATUS_NotRecommended = "NR";
	/** Not Approved by Snr Admin Finance = NS */
	public static final String ZZ_DOCSTATUS_NotApprovedBySnrAdminFinance = "NS";
	/** Not Verified = NV */
	public static final String ZZ_DOCSTATUS_NotVerified = "NV";
	/** Pending = PE */
	public static final String ZZ_DOCSTATUS_Pending = "PE";
	/** Query = QR */
	public static final String ZZ_DOCSTATUS_Query = "QR";
	/** Recommended By Senior Mgr Finance = R1 */
	public static final String ZZ_DOCSTATUS_RecommendedBySeniorMgrFinance = "R1";
	/** Recommended By COO = R2 */
	public static final String ZZ_DOCSTATUS_RecommendedByCOO = "R2";
	/** Recommended By CFO = R3 */
	public static final String ZZ_DOCSTATUS_RecommendedByCFO = "R3";
	/** Recommended By CEO = R4 */
	public static final String ZZ_DOCSTATUS_RecommendedByCEO = "R4";
	/** Recommended for Approval = RA */
	public static final String ZZ_DOCSTATUS_RecommendedForApproval = "RA";
	/** Recommended = RC */
	public static final String ZZ_DOCSTATUS_Recommended = "RC";
	/** Recommended By Senior Mgr SDR = RD */
	public static final String ZZ_DOCSTATUS_RecommendedBySeniorMgrSDR = "RD";
	/** Recommended for Evaluation = RE */
	public static final String ZZ_DOCSTATUS_RecommendedForEvaluation = "RE";
	/** Submitted to Manager Finance Consumables = SC */
	public static final String ZZ_DOCSTATUS_SubmittedToManagerFinanceConsumables = "SC";
	/** Submitted To SDL Finance Mgr = SD */
	public static final String ZZ_DOCSTATUS_SubmittedToSDLFinanceMgr = "SD";
	/** Submitted To IT Manager = SI */
	public static final String ZZ_DOCSTATUS_SubmittedToITManager = "SI";
	/** Submitted To IT Admin = ST */
	public static final String ZZ_DOCSTATUS_SubmittedToITAdmin = "ST";
	/** Submitted = SU */
	public static final String ZZ_DOCSTATUS_Submitted = "SU";
	/** Transfer Out = TO */
	public static final String ZZ_DOCSTATUS_TransferOut = "TO";
	/** Updated by SDR Admin = UA */
	public static final String ZZ_DOCSTATUS_UpdatedBySDRAdmin = "UA";
	/** Uploaded = UP */
	public static final String ZZ_DOCSTATUS_Uploaded = "UP";
	/** Delinked = UnSdfOrg */
	public static final String ZZ_DOCSTATUS_Delinked = "UnSdfOrg";
	/** Validating = VA */
	public static final String ZZ_DOCSTATUS_Validating = "VA";
	/** Verified = VE */
	public static final String ZZ_DOCSTATUS_Verified = "VE";
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
}