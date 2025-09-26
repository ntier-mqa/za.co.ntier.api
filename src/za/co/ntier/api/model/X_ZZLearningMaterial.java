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

/** Generated Model for ZZLearningMaterial
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="ZZLearningMaterial")
public class X_ZZLearningMaterial extends PO implements I_ZZLearningMaterial, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20250925L;

    /** Standard Constructor */
    public X_ZZLearningMaterial (Properties ctx, int ZZLearningMaterial_ID, String trxName)
    {
      super (ctx, ZZLearningMaterial_ID, trxName);
      /** if (ZZLearningMaterial_ID == 0)
        {
			setZZLearningMaterial_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZLearningMaterial (Properties ctx, int ZZLearningMaterial_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZLearningMaterial_ID, trxName, virtualColumns);
      /** if (ZZLearningMaterial_ID == 0)
        {
			setZZLearningMaterial_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZLearningMaterial (Properties ctx, String ZZLearningMaterial_UU, String trxName)
    {
      super (ctx, ZZLearningMaterial_UU, trxName);
      /** if (ZZLearningMaterial_UU == null)
        {
			setZZLearningMaterial_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ZZLearningMaterial (Properties ctx, String ZZLearningMaterial_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, ZZLearningMaterial_UU, trxName, virtualColumns);
      /** if (ZZLearningMaterial_UU == null)
        {
			setZZLearningMaterial_ID (0);
        } */
    }

    /** Load Constructor */
    public X_ZZLearningMaterial (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_ZZLearningMaterial[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Accredited Training Provider.
		@param ZZAccreditedTrainingProvider Accredited Training Provider
	*/
	public void setZZAccreditedTrainingProvider (String ZZAccreditedTrainingProvider)
	{
		set_Value (COLUMNNAME_ZZAccreditedTrainingProvider, ZZAccreditedTrainingProvider);
	}

	/** Get Accredited Training Provider.
		@return Accredited Training Provider	  */
	public String getZZAccreditedTrainingProvider()
	{
		return (String)get_Value(COLUMNNAME_ZZAccreditedTrainingProvider);
	}

	/** Set Cell No Of Writer.
		@param ZZCellNoWriter Cell No Of Writer
	*/
	public void setZZCellNoWriter (String ZZCellNoWriter)
	{
		set_Value (COLUMNNAME_ZZCellNoWriter, ZZCellNoWriter);
	}

	/** Get Cell No Of Writer.
		@return Cell No Of Writer	  */
	public String getZZCellNoWriter()
	{
		return (String)get_Value(COLUMNNAME_ZZCellNoWriter);
	}

	/** Set Email Address Of Writer.
		@param ZZEmailWriter Email Address Of Writer
	*/
	public void setZZEmailWriter (String ZZEmailWriter)
	{
		set_Value (COLUMNNAME_ZZEmailWriter, ZZEmailWriter);
	}

	/** Get Email Address Of Writer.
		@return Email Address Of Writer	  */
	public String getZZEmailWriter()
	{
		return (String)get_Value(COLUMNNAME_ZZEmailWriter);
	}

	/** Set Learning Material.
		@param ZZLearningMaterial_ID Learning Material
	*/
	public void setZZLearningMaterial_ID (int ZZLearningMaterial_ID)
	{
		if (ZZLearningMaterial_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZLearningMaterial_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZLearningMaterial_ID, Integer.valueOf(ZZLearningMaterial_ID));
	}

	/** Get Learning Material.
		@return Learning Material	  */
	public int getZZLearningMaterial_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZLearningMaterial_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set ZZLearningMaterial_UU.
		@param ZZLearningMaterial_UU ZZLearningMaterial_UU
	*/
	public void setZZLearningMaterial_UU (String ZZLearningMaterial_UU)
	{
		set_Value (COLUMNNAME_ZZLearningMaterial_UU, ZZLearningMaterial_UU);
	}

	/** Get ZZLearningMaterial_UU.
		@return ZZLearningMaterial_UU	  */
	public String getZZLearningMaterial_UU()
	{
		return (String)get_Value(COLUMNNAME_ZZLearningMaterial_UU);
	}

	/** Set Name Of Writer.
		@param ZZNameWriter NAME OF WRITER (ABRIDGED CV OF WRITER MUST BE ATTACHED)
	*/
	public void setZZNameWriter (String ZZNameWriter)
	{
		set_Value (COLUMNNAME_ZZNameWriter, ZZNameWriter);
	}

	/** Get Name Of Writer.
		@return NAME OF WRITER (ABRIDGED CV OF WRITER MUST BE ATTACHED)
	  */
	public String getZZNameWriter()
	{
		return (String)get_Value(COLUMNNAME_ZZNameWriter);
	}

	/** Set Qualification/Skill Programme.
		@param ZZQualificationProgramme Qualification/Skill Programme
	*/
	public void setZZQualificationProgramme (String ZZQualificationProgramme)
	{
		set_Value (COLUMNNAME_ZZQualificationProgramme, ZZQualificationProgramme);
	}

	/** Get Qualification/Skill Programme.
		@return Qualification/Skill Programme	  */
	public String getZZQualificationProgramme()
	{
		return (String)get_Value(COLUMNNAME_ZZQualificationProgramme);
	}

	/** Set Unabridged CV File.
		@param ZZUnabridgedCVFile Unabridged CV File
	*/
	public void setZZUnabridgedCVFile (byte[] ZZUnabridgedCVFile)
	{
		set_Value (COLUMNNAME_ZZUnabridgedCVFile, ZZUnabridgedCVFile);
	}

	/** Get Unabridged CV File.
		@return Unabridged CV File	  */
	public byte[] getZZUnabridgedCVFile()
	{
		return (byte[])get_Value(COLUMNNAME_ZZUnabridgedCVFile);
	}

	/** Set Unabridged CV File Name.
		@param ZZUnabridgedCVFileName Unabridged CV File Name
	*/
	public void setZZUnabridgedCVFileName (String ZZUnabridgedCVFileName)
	{
		set_Value (COLUMNNAME_ZZUnabridgedCVFileName, ZZUnabridgedCVFileName);
	}

	/** Get Unabridged CV File Name.
		@return Unabridged CV File Name	  */
	public String getZZUnabridgedCVFileName()
	{
		return (String)get_Value(COLUMNNAME_ZZUnabridgedCVFileName);
	}

	public I_ZZ_Application_Form getZZ_Application_Form() throws RuntimeException
	{
		return (I_ZZ_Application_Form)MTable.get(getCtx(), I_ZZ_Application_Form.Table_ID)
			.getPO(getZZ_Application_Form_ID(), get_TrxName());
	}

	/** Set Application Form.
		@param ZZ_Application_Form_ID Application Form
	*/
	public void setZZ_Application_Form_ID (int ZZ_Application_Form_ID)
	{
		if (ZZ_Application_Form_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ZZ_Application_Form_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ZZ_Application_Form_ID, Integer.valueOf(ZZ_Application_Form_ID));
	}

	/** Get Application Form.
		@return Application Form	  */
	public int getZZ_Application_Form_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZ_Application_Form_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}