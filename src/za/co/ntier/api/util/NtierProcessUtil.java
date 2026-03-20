package za.co.ntier.api.util;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

import org.adempiere.exceptions.AdempiereException;
import org.compiere.util.DB;

public class NtierProcessUtil {

	public static enum TSelectionInfoWindowColumn {
		ID("T_Selection_ID"), 
		UUID("t_selection_uu"),		
		VIEW_ID("viewid"),
		COLUMN_NAME("ColumnName"),
		VALUE_STR("Value_String"),
		VALUE_NUM("Value_Number"),
		VALUE_DATE("Value_Date");
		
		private final String columnName; 
	
		TSelectionInfoWindowColumn(String columnName) {
	        this.columnName = columnName;
	    }
		
		@Override
	    public String toString() {
	        return this.columnName; 
	    }
	}

	public static Map<String, Map<Object, Object>> getSelectedRecordsFromTempTable (String trxName, int pInstanceID){
		Map<String, Map<Object, Object>> selectionValueMap = new HashMap<>();
		
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT T_Selection_ID, t_selection_uu, viewid, ColumnName, Value_String, Value_Number, Value_Date ");
		sql.append("FROM T_Selection_InfoWindow ");
		sql.append("WHERE AD_PInstance_ID=? ");
		sql.append("ORDER BY T_Selection_ID, viewid, ColumnName ");
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try
		{
			pstmt = DB.prepareStatement(sql.toString(), trxName);
			pstmt.setInt(1, pInstanceID);
			rs = pstmt.executeQuery();
			String currentRecordKey = null;
			Map<Object, Object> selectedRow = null;
			
			while (rs.next()){
				int keyColumn = rs.getInt(TSelectionInfoWindowColumn.ID.toString());
				String keyUUColumn = rs.getString(TSelectionInfoWindowColumn.UUID.toString());
				
				String columnName = rs.getString(TSelectionInfoWindowColumn.COLUMN_NAME.toString());
				String viewId = rs.getString(TSelectionInfoWindowColumn.VIEW_ID.toString());
	
				Object strValue = rs.getObject(TSelectionInfoWindowColumn.VALUE_STR.toString());
				Object numValue = rs.getObject(TSelectionInfoWindowColumn.VALUE_NUM.toString());
				Object dateValue = rs.getObject(TSelectionInfoWindowColumn.VALUE_DATE.toString());
				
				String key = Integer.valueOf(keyColumn) + "_" + keyUUColumn + "_" + String.valueOf(viewId);
				
				Object value = null;
				if (strValue != null)
					value = strValue;
				else if (numValue != null)
					value = numValue;
				else if (dateValue != null)
					value = dateValue;
				
				if (currentRecordKey == null || !currentRecordKey.equals(key)) {
					selectedRow = new HashMap<>();
					selectionValueMap.put(key, selectedRow);
					
					currentRecordKey = key;
					selectionValueMap.put(key, selectedRow);
					
					selectedRow.put(TSelectionInfoWindowColumn.ID, keyColumn);
					selectedRow.put(TSelectionInfoWindowColumn.VIEW_ID, viewId);
					selectedRow.put(TSelectionInfoWindowColumn.UUID, keyUUColumn);
				}
				
				selectedRow.put(columnName, value);
			}
	
			return selectionValueMap;
		}
		catch (Exception e){
			throw new AdempiereException(e);
		}
		finally{
			DB.close(rs, pstmt);
			rs = null;
			pstmt = null;
		}		
	}

}
