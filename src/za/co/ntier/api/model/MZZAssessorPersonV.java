package za.co.ntier.api.model;

import java.sql.ResultSet;
import java.util.Properties;

import org.compiere.model.MColumn;
import org.compiere.model.MRefList;

public class MZZAssessorPersonV extends X_ZZAssessorPerson_v {

	private static final long serialVersionUID = -6781499310347460976L;

	public MZZAssessorPersonV(Properties ctx, int ZZAssessorPerson_v_ID, String trxName) {
		super(ctx, ZZAssessorPerson_v_ID, trxName);
	}
	
	public MZZAssessorPersonV(Properties ctx, int ZZAssessorPerson_v_ID, String trxName, String[] virtualColumns) {
		super(ctx, ZZAssessorPerson_v_ID, trxName, virtualColumns);
	}

	public MZZAssessorPersonV(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
	}

	public MZZAssessorPersonV(Properties ctx, String ZZAssessorPerson_v_UU, String trxName) {
		super(ctx, ZZAssessorPerson_v_UU, trxName);
	}
	
	public MZZAssessorPersonV(Properties ctx, String ZZAssessorPerson_v_UU, String trxName, String[] virtualColumns) {
		super(ctx, ZZAssessorPerson_v_UU, trxName, virtualColumns);
	}
	
	public String getZZDocStatusText() {
		int columnIndex = p_info.getAD_Column_ID(COLUMNNAME_ZZ_DocStatus);
		MColumn columnDef = MColumn.get(columnIndex);
		MRefList refListItem = MRefList.get(getCtx(), columnDef.getAD_Reference_Value_ID(), getZZ_DocStatus(), null);
		return refListItem == null ? null:refListItem.getName();
	}
	
	public String getZZAssessorRoleText() {
		int columnIndex = p_info.getAD_Column_ID(COLUMNNAME_ZZAssessorRole);
		MColumn columnDef = MColumn.get(columnIndex);
		MRefList refListItem = MRefList.get(getCtx(), columnDef.getAD_Reference_Value_ID(), getZZAssessorRole(), null);
		return refListItem == null ? null:refListItem.getName();
	}
	
	public String getZZScopeExtensionText() {
		return getParent_ID() == 0 ? "False" : "True";
	}
}
