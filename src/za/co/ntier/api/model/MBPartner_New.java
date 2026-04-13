package za.co.ntier.api.model;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.util.Properties;

import org.compiere.model.MBPartner;
import org.compiere.model.Query;
import org.compiere.model.X_I_BPartner;
import org.compiere.util.Env;

@org.adempiere.base.Model(table="C_BPartner")
public class MBPartner_New extends MBPartner implements I_C_BPartner {

	private static final long serialVersionUID = 4154740391812230437L;





	public MBPartner_New(Properties ctx) {
		super(ctx);
	}

	public MBPartner_New(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
	}

	public MBPartner_New(Properties ctx, String C_BPartner_UU, String trxName) {
		super(ctx, C_BPartner_UU, trxName);
	}

	public MBPartner_New(Properties ctx, int C_BPartner_ID, String trxName) {
		super(ctx, C_BPartner_ID, trxName);
	}

	public MBPartner_New(X_I_BPartner impBP) {
		super(impBP);
	}

	public MBPartner_New(MBPartner copy) {
		super(copy);
	}

	public MBPartner_New(Properties ctx, MBPartner copy) {
		super(ctx, copy);
	}

	public MBPartner_New(Properties ctx, MBPartner copy, String trxName) {
		super(ctx, copy, trxName);
	}

	public MBPartner_New(Properties ctx, int C_BPartner_ID, String trxName, String... virtualColumns) {
		super(ctx, C_BPartner_ID, trxName, virtualColumns);
	}

	public static MBPartner getUpper (Properties ctx, String Value, String trxName)
	{
		Value = Value.toUpperCase();
		if (Value == null || Value.length() == 0) {
			return null;
		}
		final String whereClause = "Upper(Value)=? AND AD_Client_ID=?";
		MBPartner retValue = new Query(ctx, I_C_BPartner.Table_Name, whereClause, trxName)
				.setParameters(Value,Env.getAD_Client_ID(ctx))
				.firstOnly();
		return retValue;
	}

	public static MBPartner_New get (Properties ctx, String Value) {
		return get(ctx,Value,null);		
	}

	/**
	 * 	Get BPartner with Value in a transaction
	 *	@param ctx context 
	 *	@param Value value
	 * 	@param trxName transaction
	 *	@return BPartner or null
	 */
	public static MBPartner_New get (Properties ctx, String Value, String trxName)
	{
		if (Value == null || Value.length() == 0)
			return null;
		final String whereClause = "Value=? AND AD_Client_ID=?";
		MBPartner_New retValue = new Query(ctx, I_C_BPartner.Table_Name, whereClause, trxName)
				.setParameters(Value,Env.getAD_Client_ID(ctx))
				.firstOnly();
		return retValue;
	}	//	get

	/** Set Business Registration No.
		@param ZZ_Business_Reg_No Business Registration No
	 */
	public void setZZ_Business_Reg_No (String ZZ_Business_Reg_No)
	{
		set_Value (COLUMNNAME_ZZ_Business_Reg_No, ZZ_Business_Reg_No);
	}

	/** Get Business Registration No.
		@return Business Registration No	  */
	public String getZZ_Business_Reg_No()
	{
		return (String)get_Value(COLUMNNAME_ZZ_Business_Reg_No);
	}

	/** Set Is Employer.
		@param ZZ_Is_Employer Is Employer
	 */
	public void setZZ_Is_Employer (boolean ZZ_Is_Employer)
	{
		set_Value (COLUMNNAME_ZZ_Is_Employer, Boolean.valueOf(ZZ_Is_Employer));
	}

	/** Get Is Employer.
		@return Is Employer	  */
	public boolean isZZ_Is_Employer()
	{
		Object oo = get_Value(COLUMNNAME_ZZ_Is_Employer);
		if (oo != null)
		{
			if (oo instanceof Boolean)
				return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}
	/** Set MQA Sector.
	@param ZZ_Is_MQA_Sector MQA Sector
	 */
	public void setZZ_Is_MQA_Sector (boolean ZZ_Is_MQA_Sector)
	{
		set_Value (COLUMNNAME_ZZ_Is_MQA_Sector, Boolean.valueOf(ZZ_Is_MQA_Sector));
	}

	/** Get MQA Sector.
	@return MQA Sector	  */
	public boolean isZZ_Is_MQA_Sector()
	{
		Object oo = get_Value(COLUMNNAME_ZZ_Is_MQA_Sector);
		if (oo != null)
		{
			if (oo instanceof Boolean)
				return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Municipality/District.
		@param ZZ_Municipality_District Municipality/District
	 */
	public void setZZ_Municipality_District (String ZZ_Municipality_District)
	{
		set_Value (COLUMNNAME_ZZ_Municipality_District, ZZ_Municipality_District);
	}

	/** Get Municipality/District.
		@return Municipality/District	  */
	public String getZZ_Municipality_District()
	{
		return (String)get_Value(COLUMNNAME_ZZ_Municipality_District);
	}

	/** Set Number Of Employees.
	@param ZZ_Number_Of_Employees Number Of Employees
	 */
	public void setZZ_Number_Of_Employees (BigDecimal ZZ_Number_Of_Employees)
	{
		set_Value (COLUMNNAME_ZZ_Number_Of_Employees, ZZ_Number_Of_Employees);
	}

	/** Get Number Of Employees.
	@return Number Of Employees	  */
	public BigDecimal getZZ_Number_Of_Employees()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_ZZ_Number_Of_Employees);
		if (bd == null)
			return Env.ZERO;
		return bd;
	}


	/** Set SDL Number.
		@param ZZ_SDL_No SDL Number
	 */
	public void setZZ_SDL_No (String ZZ_SDL_No)
	{
		set_Value (COLUMNNAME_ZZ_SDL_No, ZZ_SDL_No);
	}

	/** Get SDL Number.
		@return SDL Number	  */
	public String getZZ_SDL_No()
	{
		return (String)get_Value(COLUMNNAME_ZZ_SDL_No);
	}

	/** Set Chamber Code.
	@param ZZChamberCode Chamber Code
	 */
	public void setZZChamberCode (String ZZChamberCode)
	{

		set_Value (COLUMNNAME_ZZChamberCode, ZZChamberCode);
	}

	/** Get Chamber Code.
		@return Chamber Code	  */
	public String getZZChamberCode()
	{
		return (String)get_Value(COLUMNNAME_ZZChamberCode);
	}

	/** Set SDL Number Type.
	@param ZZLevyNumberType SDL Number Type
	 */
	public void setZZLevyNumberType (String ZZLevyNumberType)
	{

		set_Value (COLUMNNAME_ZZLevyNumberType, ZZLevyNumberType);
	}

	/** Get SDL Number Type.
		@return SDL Number Type	  */
	public String getZZLevyNumberType()
	{
		return (String)get_Value(COLUMNNAME_ZZLevyNumberType);
	}

	/** Set Number Employees Profile.
		@param ZZNumberOfEmployeesProfile Number of Employees as per the Employment Profile
	 */
	public void setZZNumberOfEmployeesProfile (int ZZNumberOfEmployeesProfile)
	{
		set_Value (COLUMNNAME_ZZNumberOfEmployeesProfile, Integer.valueOf(ZZNumberOfEmployeesProfile));
	}

	/** Get Number Employees Profile.
		@return Number of Employees as per the Employment Profile
	 */
	public int getZZNumberOfEmployeesProfile()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZNumberOfEmployeesProfile);
		if (ii == null)
			return 0;
		return ii.intValue();
	}

	/** Set Organisation Registration Number Type.
	@param ZZOrgRegistrationNumberType Organisation Registration Number Type
	 */
	public void setZZOrgRegistrationNumberType (String ZZOrgRegistrationNumberType)
	{

		set_Value (COLUMNNAME_ZZOrgRegistrationNumberType, ZZOrgRegistrationNumberType);
	}

	/** Get Organisation Registration Number Type.
		@return Organisation Registration Number Type	  */
	public String getZZOrgRegistrationNumberType()
	{
		return (String)get_Value(COLUMNNAME_ZZOrgRegistrationNumberType);
	}
	/** Set Organisation Type.
	@param ZZOrganisationType Organisation Type
	 */
	public void setZZOrganisationType (String ZZOrganisationType)
	{

		set_Value (COLUMNNAME_ZZOrganisationType, ZZOrganisationType);
	}


	/** Get Organisation Type.
		@return Organisation Type	  */
	public String getZZOrganisationType()
	{
		return (String)get_Value(COLUMNNAME_ZZOrganisationType);
	}

	/** Set SARS Number.
		@param ZZSarsNumber SARS Number
	 */
	public void setZZSarsNumber (String ZZSarsNumber)
	{
		set_Value (COLUMNNAME_ZZSarsNumber, ZZSarsNumber);
	}

	/** Get SARS Number.
		@return SARS Number	  */
	public String getZZSarsNumber()
	{
		return (String)get_Value(COLUMNNAME_ZZSarsNumber);
	}
	/** Set SIC Code.
	@param ZZSicCode SIC Code
	 */
	public void setZZSicCode (String ZZSicCode)
	{

		set_Value (COLUMNNAME_ZZSicCode, ZZSicCode);
	}

	/** Get SIC Code.
		@return SIC Code	  */
	public String getZZSicCode()
	{
		return (String)get_Value(COLUMNNAME_ZZSicCode);
	}

	/** Set Sub Sector.
	@param ZZSubSector Sub Sector
	 */
	public void setZZSubSector (String ZZSubSector)
	{

		set_Value (COLUMNNAME_ZZSubSector, ZZSubSector);
	}

	/** Get Sub Sector.
		@return Sub Sector	  */
	public String getZZSubSector()
	{
		return (String)get_Value(COLUMNNAME_ZZSubSector);
	}

	/** Set Terminated Employees.
		@param ZZTerminatedEmployees Terminated Employees
	 */
	public void setZZTerminatedEmployees (int ZZTerminatedEmployees)
	{
		set_Value (COLUMNNAME_ZZTerminatedEmployees, Integer.valueOf(ZZTerminatedEmployees));
	}

	/** Get Terminated Employees.
		@return Terminated Employees	  */
	public int getZZTerminatedEmployees()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ZZTerminatedEmployees);
		if (ii == null)
			return 0;
		return ii.intValue();
	}

	/*
	 * @Override protected boolean afterSave(boolean newRecord, boolean success) {
	 * boolean result = super.afterSave(newRecord, success); if (!result) { return
	 * false; } if (getAD_Client_ID() != 1000018) { return true; } if
	 * (isZZ_Copy_To_Tenants()) { CopyRecordToOtherClients copyRecordToOtherClients
	 * = new CopyRecordToOtherClients(getCtx(),get_TrxName(),getAD_Client_ID(),
	 * getC_BPartner_ID(),get_TableName());
	 * 
	 * if
	 * (is_ValueChanged(za.ntier.models.I_C_BPartner.COLUMNNAME_ZZ_Copy_To_Tenants))
	 * { copyLinkedTableRecords(MUser.Table_Name);
	 * copyLinkedTableRecords(MBPBankAccount_New.Table_Name); List
	 * <MBPartnerLocation> mBPartnerLocations =
	 * MLocation_New.getBPLocation_IDs(getCtx(), getC_BPartner_ID(), get_TrxName());
	 * for (MBPartnerLocation mBPartnerLocation: mBPartnerLocations) {
	 * 
	 * copyRecordToOtherClients = new
	 * CopyRecordToOtherClients(getCtx(),get_TrxName(),getAD_Client_ID(),
	 * mBPartnerLocation.getC_Location_ID(),MLocation_New.Table_Name); }
	 * copyLinkedTableRecords(MBPartnerLocation_New.Table_Name); } } return true; }
	 */


	/** ZZMaintainStatus AD_Reference_ID=319 */
	public static final int ZZMAINTAINSTATUS_AD_Reference_ID=319;
	/** No = N */
	public static final String ZZMAINTAINSTATUS_No = "N";
	/** Yes = Y */
	public static final String ZZMAINTAINSTATUS_Yes = "Y";
	/** Set Maintain Status.
		@param ZZMaintainStatus Maintain Status
	 */
	public void setZZMaintainStatus (String ZZMaintainStatus)
	{

		set_Value (COLUMNNAME_ZZMaintainStatus, ZZMaintainStatus);
	}

	/** Get Maintain Status.
		@return Maintain Status	  */
	public String getZZMaintainStatus()
	{
		return (String)get_Value(COLUMNNAME_ZZMaintainStatus);
	}

	/** Set IsSDRUser.
	@param ZZ_IsSDRUser IsSDRUser
	 */
	public void setZZ_IsSDRUser (boolean ZZ_IsSDRUser)
	{
		set_Value (COLUMNNAME_ZZ_IsSDRUser, Boolean.valueOf(ZZ_IsSDRUser));
	}

	/** Get IsSDRUser.
		@return IsSDRUser	  */
	public boolean isZZ_IsSDRUser()
	{
		Object oo = get_Value(COLUMNNAME_ZZ_IsSDRUser);
		if (oo != null)
		{
			if (oo instanceof Boolean)
				return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}


	/** ZZUnionised AD_Reference_ID=319 */
	public static final int ZZUNIONISED_AD_Reference_ID=319;
	/** No = N */
	public static final String ZZUNIONISED_No = "N";
	/** Yes = Y */
	public static final String ZZUNIONISED_Yes = "Y";
	/** Set Unionised.
		@param ZZUnionised Unionised
	 */
	public void setZZUnionised (String ZZUnionised)
	{

		set_Value (COLUMNNAME_ZZUnionised, ZZUnionised);
	}

	/** Get Unionised.
		@return Unionised	  */
	public String getZZUnionised()
	{
		return (String)get_Value(COLUMNNAME_ZZUnionised);
	}

	@Override
	public void setParentValue(String ParentValue) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getParentValue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setZZBPartner_Parent_ID(int ZZBPartner_Parent_ID) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getZZBPartner_Parent_ID() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public org.compiere.model.I_C_BPartner getZZBPartner_Parent() throws RuntimeException {
		// TODO Auto-generated method stub
		return null;
	}

	/** Set T Number.
	@param ZZ_T_Number T Number
	 */
	public void setZZ_T_Number (String ZZ_T_Number)
	{
		set_Value (COLUMNNAME_ZZ_T_Number, ZZ_T_Number);
	}

	/** Get T Number.
	@return T Number	  */
	public String getZZ_T_Number()
	{
		return (String)get_Value(COLUMNNAME_ZZ_T_Number);
	}

}