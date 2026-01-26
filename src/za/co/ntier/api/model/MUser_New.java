package za.co.ntier.api.model;

import java.sql.ResultSet;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.compiere.model.MUser;
import org.compiere.model.SystemIDs;
import org.compiere.model.X_C_BPartner;
import org.compiere.util.Env;
import org.idempiere.cache.ImmutableIntPOCache;

@org.adempiere.base.Model(table="AD_User")
public class MUser_New extends MUser implements I_AD_User {

	private static final long serialVersionUID = -4202021985605290293L;
	/**	Cache					*/
	static private ImmutableIntPOCache<Integer,MUser_New> s_cache = new ImmutableIntPOCache<Integer,MUser_New>(I_AD_User.Table_Name, 30, 60);

	public MUser_New(Properties ctx, String AD_User_UU, String trxName) {
		super(ctx, AD_User_UU, trxName);
		
	}

	public MUser_New(Properties ctx, int AD_User_ID, String trxName) {
		super(ctx, AD_User_ID, trxName);
		
	}

	public MUser_New(X_C_BPartner partner) {
		super(partner);
		
	}

	public MUser_New(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		
	}

	public MUser_New(MUser copy) {
		super(copy);
		
	}

	public MUser_New(Properties ctx, MUser copy) {
		super(ctx, copy);
		
	}

	public MUser_New(Properties ctx, MUser copy, String trxName) {
		super(ctx, copy, trxName);
		
	}
	
	public static MUser_New get (Properties ctx, int AD_User_ID)
	{
		Integer key = Integer.valueOf(AD_User_ID);
		MUser_New retValue = s_cache.get(ctx, key, e -> new MUser_New(ctx, e));
		if (retValue == null)
		{
			retValue = new MUser_New (ctx, AD_User_ID, (String)null);
			if (AD_User_ID == SystemIDs.USER_SYSTEM_DEPRECATED)
			{
				String trxName = null;
				retValue.load(trxName);	//	load System Record
			}
			if (retValue.get_ID() == AD_User_ID)
			{
				s_cache.put(key, retValue, e -> new MUser_New(Env.getCtx(), e));
				return retValue;
			}
			return null;
		}
		return retValue;
	}	//	get




	@Override
	protected boolean beforeSave(boolean newRecord) {
		if (getPhone() != null && !(getPhone().equals("")) && is_ValueChanged(I_AD_User.COLUMNNAME_Phone) && !isValidPhoneNumber(getPhone())) {
			log.saveError("Error", "Phone number must be in format +27999999999");
			return false;
		}
		return super.beforeSave(newRecord);
	}

	@Override
	protected boolean afterSave(boolean newRecord, boolean success) {

		/* try {
			String retMess = null;
			if (isEmployee() && getPhone() != null && !(getPhone().equals("")) && is_ValueChanged(I_AD_User.COLUMNNAME_Phone)) {
				retMess = SendMessage.sendOptInMessage(getCtx(), Env.getAD_Client_ID(getCtx()), X_TW_Message.TWILIO_MESSAGE_TYPE_Whatsapp, getPhone());
			}
		} catch (Exception e) {
			return false;
		}
		*/		
		boolean done = super.afterSave(newRecord, success);
		if (!done) {
			return false;
		}
		/*
		String calledClass = "";
		StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace(); 
		for (int i = 1; i < stackTraceElements.length && i<=10; i++) { 
			StackTraceElement stackTraceElement = stackTraceElements[i]; 
			//System.out.println(stackTraceElement.getClassName() + " Method " + stackTraceElement.getMethodName()); 
			//$NON-NLS-1$`
			calledClass = stackTraceElement.getClassName();
			if (calledClass.equalsIgnoreCase("org.compiere.util.Login")) {
				break;
			}
		} 
		if (!calledClass.equalsIgnoreCase("org.compiere.util.Login")) {
			if (getC_BPartner_ID() != 0) {
				MBPartner_New bp = new MBPartner_New(getCtx(),getC_BPartner_ID(),get_TrxName());
				if (bp.isZZ_Copy_To_Tenants()) {
					CopyRecordToOtherClients copyRecordToOtherClients = new CopyRecordToOtherClients(getCtx(),get_TrxName(),getAD_Client_ID(),getAD_User_ID(),get_TableName());
				}
			}
		}
		*/
		return true;
	}

	public static boolean isValidPhoneNumber(String phoneNumber) {
		String regex = "^[1-9]\\d{1,14}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(phoneNumber);
		return true;
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
}
