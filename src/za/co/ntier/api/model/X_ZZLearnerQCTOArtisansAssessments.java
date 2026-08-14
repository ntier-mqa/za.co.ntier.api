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
import java.util.Properties;
import org.compiere.model.*;

/** Generated Model for ZZLearnerQCTOArtisansAssessments
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="ZZLearnerQCTOArtisansAssessments")
public class X_ZZLearnerQCTOArtisansAssessments extends PO implements I_ZZLearnerQCTOArtisansAssessments, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20260814L;

    /** Standard Constructor */
    public X_ZZLearnerQCTOArtisansAssessments (Properties ctx, int ZZLearnerQCTOArtisansAssessments_ID, String trxName)
    {
      super (ctx, ZZLearnerQCTOArtisansAssessments_ID, trxName);
      /** if (ZZLearnerQCTOArtisansAssessments_ID == 0)
        {
			setZZLearnerQCTOArtisansAssessments_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZLearnerQCTOArtisansAssessments (Properties ctx, int ZZLearnerQCTOArtisansAssessments_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZLearnerQCTOArtisansAssessments_ID, trxName, virtualColumns);
      /** if (ZZLearnerQCTOArtisansAssessments_ID == 0)
        {
			setZZLearnerQCTOArtisansAssessments_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZLearnerQCTOArtisansAssessments (Properties ctx, String ZZLearnerQCTOArtisansAssessments_UU, String trxName)
    {
      super (ctx, ZZLearnerQCTOArtisansAssessments_UU, trxName);
      /** if (ZZLearnerQCTOArtisansAssessments_UU == null)
        {
			setZZLearnerQCTOArtisansAssessments_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZLearnerQCTOArtisansAssessments (Properties ctx, String ZZLearnerQCTOArtisansAssessments_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZLearnerQCTOArtisansAssessments_UU, trxName, virtualColumns);
      /** if (ZZLearnerQCTOArtisansAssessments_UU == null)
        {
			setZZLearnerQCTOArtisansAssessments_ID (0);
        } */
    }

    /** Load Constructor */
    public X_ZZLearnerQCTOArtisansAssessments (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_ZZLearnerQCTOArtisansAssessments[")
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

	/** Set ZZLearnerQCTOArtisansAssessments.
		@param ZZLearnerQCTOArtisansAssessments_ID ZZLearnerQCTOArtisansAssessments
	*/
	public void setZZLearnerQCTOArtisansAssessments_ID (int ZZLearnerQCTOArtisansAssessments_ID)
	{
		if (ZZLearnerQCTOArtisansAssessments_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZLearnerQCTOArtisansAssessments_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZLearnerQCTOArtisansAssessments_ID, Integer.valueOf(ZZLearnerQCTOArtisansAssessments_ID));
	}

	/** Get ZZLearnerQCTOArtisansAssessments.
		@return ZZLearnerQCTOArtisansAssessments	  */
	public int getZZLearnerQCTOArtisansAssessments_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZLearnerQCTOArtisansAssessments_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set ZZLearnerQCTOArtisansAssessments_UU.
		@param ZZLearnerQCTOArtisansAssessments_UU ZZLearnerQCTOArtisansAssessments_UU
	*/
	public void setZZLearnerQCTOArtisansAssessments_UU (String ZZLearnerQCTOArtisansAssessments_UU)
	{
		set_Value (COLUMNNAME_ZZLearnerQCTOArtisansAssessments_UU, ZZLearnerQCTOArtisansAssessments_UU);
	}

	/** Get ZZLearnerQCTOArtisansAssessments_UU.
		@return ZZLearnerQCTOArtisansAssessments_UU	  */
	public String getZZLearnerQCTOArtisansAssessments_UU()
	{
		return (String)get_Value(COLUMNNAME_ZZLearnerQCTOArtisansAssessments_UU);
	}

	public I_ZZLearnerQCTOArtisans getZZLearnerQCTOArtisans() throws RuntimeException
	{
		return (I_ZZLearnerQCTOArtisans)MTable.get(getCtx(), I_ZZLearnerQCTOArtisans.Table_ID)
			.getPO(getZZLearnerQCTOArtisans_ID(), get_TrxName());
	}

	/** Set Learner QCTO Artisans.
		@param ZZLearnerQCTOArtisans_ID Learner QCTO Artisans
	*/
	public void setZZLearnerQCTOArtisans_ID (int ZZLearnerQCTOArtisans_ID)
	{
		if (ZZLearnerQCTOArtisans_ID < 1)
			set_Value (COLUMNNAME_ZZLearnerQCTOArtisans_ID, null);
		else
			set_Value (COLUMNNAME_ZZLearnerQCTOArtisans_ID, Integer.valueOf(ZZLearnerQCTOArtisans_ID));
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