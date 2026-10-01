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

/** Generated Model for ZZ_CertificateReprints
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="ZZ_CertificateReprints")
public class X_ZZ_CertificateReprints extends PO implements I_ZZ_CertificateReprints, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20261001L;

    /** Standard Constructor */
    public X_ZZ_CertificateReprints (Properties ctx, int ZZ_CertificateReprints_ID, String trxName)
    {
      super (ctx, ZZ_CertificateReprints_ID, trxName);
      /** if (ZZ_CertificateReprints_ID == 0)
        {
			setIsAffidavitAttached (false);
// N
			setIsCertifiedIDAttached (false);
// N
			setZZ_CertificateReprints_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZ_CertificateReprints (Properties ctx, int ZZ_CertificateReprints_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZ_CertificateReprints_ID, trxName, virtualColumns);
      /** if (ZZ_CertificateReprints_ID == 0)
        {
			setIsAffidavitAttached (false);
// N
			setIsCertifiedIDAttached (false);
// N
			setZZ_CertificateReprints_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZ_CertificateReprints (Properties ctx, String ZZ_CertificateReprints_UU, String trxName)
    {
      super (ctx, ZZ_CertificateReprints_UU, trxName);
      /** if (ZZ_CertificateReprints_UU == null)
        {
			setIsAffidavitAttached (false);
// N
			setIsCertifiedIDAttached (false);
// N
			setZZ_CertificateReprints_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZ_CertificateReprints (Properties ctx, String ZZ_CertificateReprints_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZ_CertificateReprints_UU, trxName, virtualColumns);
      /** if (ZZ_CertificateReprints_UU == null)
        {
			setIsAffidavitAttached (false);
// N
			setIsCertifiedIDAttached (false);
// N
			setZZ_CertificateReprints_ID (0);
        } */
    }

    /** Load Constructor */
    public X_ZZ_CertificateReprints (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_ZZ_CertificateReprints[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Affidavit Attached.
		@param IsAffidavitAttached Affidavit Attached
	*/
	public void setIsAffidavitAttached (boolean IsAffidavitAttached)
	{
		set_Value (COLUMNNAME_IsAffidavitAttached, Boolean.valueOf(IsAffidavitAttached));
	}

	/** Get Affidavit Attached.
		@return Affidavit Attached	  */
	public boolean isAffidavitAttached()
	{
		Object oo = get_Value(COLUMNNAME_IsAffidavitAttached);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Certified ID Attached.
		@param IsCertifiedIDAttached Certified ID Attached
	*/
	public void setIsCertifiedIDAttached (boolean IsCertifiedIDAttached)
	{
		set_Value (COLUMNNAME_IsCertifiedIDAttached, Boolean.valueOf(IsCertifiedIDAttached));
	}

	/** Get Certified ID Attached.
		@return Certified ID Attached	  */
	public boolean isCertifiedIDAttached()
	{
		Object oo = get_Value(COLUMNNAME_IsCertifiedIDAttached);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	public I_ZZLearnerLearnership getZZLearnerLearnership() throws RuntimeException
	{
		return (I_ZZLearnerLearnership)MTable.get(getCtx(), I_ZZLearnerLearnership.Table_ID)
			.getPO(getZZLearnerLearnership_ID(), get_TrxName());
	}

	/** Set Learnership.
		@param ZZLearnerLearnership_ID Learnership
	*/
	public void setZZLearnerLearnership_ID (int ZZLearnerLearnership_ID)
	{
		if (ZZLearnerLearnership_ID < 1)
			set_Value (COLUMNNAME_ZZLearnerLearnership_ID, null);
		else
			set_Value (COLUMNNAME_ZZLearnerLearnership_ID, Integer.valueOf(ZZLearnerLearnership_ID));
	}

	/** Get Learnership.
		@return Learnership	  */
	public int getZZLearnerLearnership_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZLearnerLearnership_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_ZZLearnerSkillsProgramme getZZLearnerSkillsProgramme() throws RuntimeException
	{
		return (I_ZZLearnerSkillsProgramme)MTable.get(getCtx(), I_ZZLearnerSkillsProgramme.Table_ID)
			.getPO(getZZLearnerSkillsProgramme_ID(), get_TrxName());
	}

	/** Set Skills Programme.
		@param ZZLearnerSkillsProgramme_ID Skills Programme
	*/
	public void setZZLearnerSkillsProgramme_ID (int ZZLearnerSkillsProgramme_ID)
	{
		if (ZZLearnerSkillsProgramme_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZLearnerSkillsProgramme_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZLearnerSkillsProgramme_ID, Integer.valueOf(ZZLearnerSkillsProgramme_ID));
	}

	/** Get Skills Programme.
		@return Skills Programme	  */
	public int getZZLearnerSkillsProgramme_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZLearnerSkillsProgramme_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Reason for Re-Issue.
		@param ZZReIssueReason Reason for Re-Issue
	*/
	public void setZZReIssueReason (String ZZReIssueReason)
	{
		set_Value (COLUMNNAME_ZZReIssueReason, ZZReIssueReason);
	}

	/** Get Reason for Re-Issue.
		@return Reason for Re-Issue	  */
	public String getZZReIssueReason()
	{
		return (String)get_Value(COLUMNNAME_ZZReIssueReason);
	}

	/** Set Reprint Date.
		@param ZZReprintDate Reprint Date
	*/
	public void setZZReprintDate (Timestamp ZZReprintDate)
	{
		set_Value (COLUMNNAME_ZZReprintDate, ZZReprintDate);
	}

	/** Get Reprint Date.
		@return Reprint Date	  */
	public Timestamp getZZReprintDate()
	{
		return (Timestamp)get_Value(COLUMNNAME_ZZReprintDate);
	}

	public org.compiere.model.I_AD_User getZZReprinte() throws RuntimeException
	{
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_ID)
			.getPO(getZZReprintedBy(), get_TrxName());
	}

	/** Set Reprinted By.
		@param ZZReprintedBy Reprinted By
	*/
	public void setZZReprintedBy (int ZZReprintedBy)
	{
		set_Value (COLUMNNAME_ZZReprintedBy, Integer.valueOf(ZZReprintedBy));
	}

	/** Get Reprinted By.
		@return Reprinted By	  */
	public int getZZReprintedBy()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZReprintedBy);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Certificates Reprints.
		@param ZZ_CertificateReprints_ID Certificates Reprints
	*/
	public void setZZ_CertificateReprints_ID (int ZZ_CertificateReprints_ID)
	{
		if (ZZ_CertificateReprints_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZ_CertificateReprints_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZ_CertificateReprints_ID, Integer.valueOf(ZZ_CertificateReprints_ID));
	}

	/** Get Certificates Reprints.
		@return Certificates Reprints	  */
	public int getZZ_CertificateReprints_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZ_CertificateReprints_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair()
    {
        return new KeyNamePair(get_ID(), String.valueOf(getZZ_CertificateReprints_ID()));
    }

	/** Set ZZ_CertificateReprints_UU.
		@param ZZ_CertificateReprints_UU ZZ_CertificateReprints_UU
	*/
	public void setZZ_CertificateReprints_UU (String ZZ_CertificateReprints_UU)
	{
		set_Value (COLUMNNAME_ZZ_CertificateReprints_UU, ZZ_CertificateReprints_UU);
	}

	/** Get ZZ_CertificateReprints_UU.
		@return ZZ_CertificateReprints_UU	  */
	public String getZZ_CertificateReprints_UU()
	{
		return (String)get_Value(COLUMNNAME_ZZ_CertificateReprints_UU);
	}

	public org.compiere.model.I_AD_User getZZ_RequestedBy() throws RuntimeException
	{
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_ID)
			.getPO(getZZ_RequestedBy_ID(), get_TrxName());
	}

	/** Set Requested By.
		@param ZZ_RequestedBy_ID Requested By
	*/
	public void setZZ_RequestedBy_ID (int ZZ_RequestedBy_ID)
	{
		if (ZZ_RequestedBy_ID < 1)
			set_Value (COLUMNNAME_ZZ_RequestedBy_ID, null);
		else
			set_Value (COLUMNNAME_ZZ_RequestedBy_ID, Integer.valueOf(ZZ_RequestedBy_ID));
	}

	/** Get Requested By.
		@return Requested By	  */
	public int getZZ_RequestedBy_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZ_RequestedBy_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}