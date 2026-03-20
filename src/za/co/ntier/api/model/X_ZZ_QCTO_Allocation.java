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

/** Generated Model for ZZ_QCTO_Allocation
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="ZZ_QCTO_Allocation")
public class X_ZZ_QCTO_Allocation extends PO implements I_ZZ_QCTO_Allocation, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20260320L;

    /** Standard Constructor */
    public X_ZZ_QCTO_Allocation (Properties ctx, int ZZ_QCTO_Allocation_ID, String trxName)
    {
      super (ctx, ZZ_QCTO_Allocation_ID, trxName);
      /** if (ZZ_QCTO_Allocation_ID == 0)
        {
			setProcessed (false);
// N
        } */
    }

    /** Standard Constructor */
    public X_ZZ_QCTO_Allocation (Properties ctx, int ZZ_QCTO_Allocation_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZ_QCTO_Allocation_ID, trxName, virtualColumns);
      /** if (ZZ_QCTO_Allocation_ID == 0)
        {
			setProcessed (false);
// N
        } */
    }

    /** Standard Constructor */
    public X_ZZ_QCTO_Allocation (Properties ctx, String ZZ_QCTO_Allocation_UU, String trxName)
    {
      super (ctx, ZZ_QCTO_Allocation_UU, trxName);
      /** if (ZZ_QCTO_Allocation_UU == null)
        {
			setProcessed (false);
// N
        } */
    }

    /** Standard Constructor */
    public X_ZZ_QCTO_Allocation (Properties ctx, String ZZ_QCTO_Allocation_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZ_QCTO_Allocation_UU, trxName, virtualColumns);
      /** if (ZZ_QCTO_Allocation_UU == null)
        {
			setProcessed (false);
// N
        } */
    }

    /** Load Constructor */
    public X_ZZ_QCTO_Allocation (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_ZZ_QCTO_Allocation[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public org.compiere.model.I_C_Year getC_Year() throws RuntimeException
	{
		return (org.compiere.model.I_C_Year)MTable.get(getCtx(), org.compiere.model.I_C_Year.Table_ID)
			.getPO(getC_Year_ID(), get_TrxName());
	}

	/** Set Year.
		@param C_Year_ID Calendar Year
	*/
	public void setC_Year_ID (int C_Year_ID)
	{
		if (C_Year_ID < 1)
			set_ValueNoCheck (COLUMNNAME_C_Year_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_C_Year_ID, Integer.valueOf(C_Year_ID));
	}

	/** Get Year.
		@return Calendar Year
	  */
	public int getC_Year_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Year_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Date Received.
		@param DateReceived Date a product was received
	*/
	public void setDateReceived (Timestamp DateReceived)
	{
		set_Value (COLUMNNAME_DateReceived, DateReceived);
	}

	/** Get Date Received.
		@return Date a product was received
	  */
	public Timestamp getDateReceived()
	{
		return (Timestamp)get_Value(COLUMNNAME_DateReceived);
	}

	/** Set Document No.
		@param DocumentNo Document sequence number of the document
	*/
	public void setDocumentNo (String DocumentNo)
	{
		set_ValueNoCheck (COLUMNNAME_DocumentNo, DocumentNo);
	}

	/** Get Document No.
		@return Document sequence number of the document
	  */
	public String getDocumentNo()
	{
		return (String)get_Value(COLUMNNAME_DocumentNo);
	}

	/** Set File Name.
		@param FileName Name of the local file or URL
	*/
	public void setFileName (String FileName)
	{
		set_Value (COLUMNNAME_FileName, FileName);
	}

	/** Get File Name.
		@return Name of the local file or URL
	  */
	public String getFileName()
	{
		return (String)get_Value(COLUMNNAME_FileName);
	}

	/** Set Processed.
		@param Processed The document has been processed
	*/
	public void setProcessed (boolean Processed)
	{
		set_Value (COLUMNNAME_Processed, Boolean.valueOf(Processed));
	}

	/** Get Processed.
		@return The document has been processed
	  */
	public boolean isProcessed()
	{
		Object oo = get_Value(COLUMNNAME_Processed);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

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
	/** Not Recommended = NR */
	public static final String ZZ_DOCSTATUS_NotRecommended = "NR";
	/** Not Approved by Snr Admin Finance = NS */
	public static final String ZZ_DOCSTATUS_NotApprovedBySnrAdminFinance = "NS";
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

	/** January = 01 */
	public static final String ZZ_FILEMONTH_January = "01";
	/** February = 02 */
	public static final String ZZ_FILEMONTH_February = "02";
	/** March = 03 */
	public static final String ZZ_FILEMONTH_March = "03";
	/** April = 04 */
	public static final String ZZ_FILEMONTH_April = "04";
	/** May = 05 */
	public static final String ZZ_FILEMONTH_May = "05";
	/** June = 06 */
	public static final String ZZ_FILEMONTH_June = "06";
	/** July = 07 */
	public static final String ZZ_FILEMONTH_July = "07";
	/** August = 08 */
	public static final String ZZ_FILEMONTH_August = "08";
	/** September = 09 */
	public static final String ZZ_FILEMONTH_September = "09";
	/** October = 10 */
	public static final String ZZ_FILEMONTH_October = "10";
	/** November = 11 */
	public static final String ZZ_FILEMONTH_November = "11";
	/** December = 12 */
	public static final String ZZ_FILEMONTH_December = "12";
	/** Set File Month.
		@param ZZ_FileMonth File Month
	*/
	public void setZZ_FileMonth (String ZZ_FileMonth)
	{

		set_Value (COLUMNNAME_ZZ_FileMonth, ZZ_FileMonth);
	}

	/** Get File Month.
		@return File Month	  */
	public String getZZ_FileMonth()
	{
		return (String)get_Value(COLUMNNAME_ZZ_FileMonth);
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

	/** Set ZZ_QCTO_Allocation_UU.
		@param ZZ_QCTO_Allocation_UU ZZ_QCTO_Allocation_UU
	*/
	public void setZZ_QCTO_Allocation_UU (String ZZ_QCTO_Allocation_UU)
	{
		set_ValueNoCheck (COLUMNNAME_ZZ_QCTO_Allocation_UU, ZZ_QCTO_Allocation_UU);
	}

	/** Get ZZ_QCTO_Allocation_UU.
		@return ZZ_QCTO_Allocation_UU	  */
	public String getZZ_QCTO_Allocation_UU()
	{
		return (String)get_Value(COLUMNNAME_ZZ_QCTO_Allocation_UU);
	}
}