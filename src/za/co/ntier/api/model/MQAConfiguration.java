package za.co.ntier.api.model;

import java.sql.ResultSet;
import java.util.Properties;

import org.compiere.model.Query;
import org.compiere.util.CCache;
import org.compiere.util.Env;

public class MQAConfiguration extends X_ZZ_QA_Configuration {

	private static final long serialVersionUID = 2157987563480947672L;
	
	public MQAConfiguration(Properties ctx, int ZZ_QA_Configuration_ID, String trxName) {
		super(ctx, ZZ_QA_Configuration_ID, trxName);

	}

	public MQAConfiguration(Properties ctx, int ZZ_QA_Configuration_ID, String trxName, String[] virtualColumns) {
		super(ctx, ZZ_QA_Configuration_ID, trxName, virtualColumns);

	}

	public MQAConfiguration(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);

	}

	public MQAConfiguration(Properties ctx, String ZZ_QA_Configuration_UU, String trxName) {
		super(ctx, ZZ_QA_Configuration_UU, trxName);

	}

	public MQAConfiguration(Properties ctx, String ZZ_QA_Configuration_UU, String trxName, String[] virtualColumns) {
		super(ctx, ZZ_QA_Configuration_UU, trxName, virtualColumns);

	}

	private static CCache<Integer, X_ZZ_QA_Configuration> qaConfigurationCache = new CCache<>("master-X_ZZ_QA_Configuration", 1);

	protected static X_ZZ_QA_Configuration getQAConfiguration() {
		int clientId = Env.getAD_Client_ID(Env.getCtx());
		X_ZZ_QA_Configuration qaConfiguration = qaConfigurationCache.get(clientId);
		
		if (qaConfiguration == null) {
			X_ZZ_QA_Configuration qaConfig = new Query(	Env.getCtx(), X_ZZ_QA_Configuration.Table_Name, X_ZZ_QA_Configuration.COLUMNNAME_AD_Client_ID + "=?", null)
					.setParameters(clientId)
					.setOnlyActiveRecords(true)
					.firstOnly();
			if (qaConfig != null)
				qaConfigurationCache.put(clientId, qaConfig);
			// TODO: in case null create a default
		}
		
		return qaConfigurationCache.get(clientId);
	}
	
	public static int getMonthsBeforeExpiry() {
		X_ZZ_QA_Configuration qaConfiguration = getQAConfiguration();
		if (qaConfiguration == null)
			return 0;
		
		return qaConfiguration.getZZ_MonthsBeforeExpiryNotify();
	}
}
