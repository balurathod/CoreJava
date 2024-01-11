package com.rathod.oops;

import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.Timestamp;
import java.util.*;

public class ExampleCac {
public static void main(String[] args) {
	int value = -1;
try {
	createNewCache(value);
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	System.out.println("Problem in creating cache");
}
	}
	public static void createNewCache(int cachefrom) throws Exception {
		ByteArrayOutputStream baos = null;
		ObjectOutputStream objOutstream = null;
		String FCL_FORMULACODE="FCL_FormulaCode";
		String FCL_OLD="OLD";
		ObjectInputStream ois = null;
		List lstFormulaCode =null;
		Map mpFormulaCode = null;
		List lstObjectInputparam = null;
		byte[] bArray = null;
		List lstInputparam =null;
		byte [] newArray = null;
		try {
			if(cachefrom == -1) {
				//No cache exist in the CACHE_DATA_TABLE table, so the cache data has to be created using the FCSS_FORMULA and 
				//FCSS_FORMULA_DETAILS table and needs to be persisted in the d/b
				
				String sql="SELECT SBU_ID, OFFICE_ID, LIMIT_TYPE, ENTITY_TYPE, F.FORMULA_CODE FORMULA_CODE, FORMULA FROM FCSS_FORMULA F, FCSS_FORMULA_DETAILS FE WHERE F.FORMULA_CODE = FE.FORMULA_CODE ORDER BY SBU_ID, OFFICE_ID, LIMIT_TYPE, ENTITY_TYPE";
				baos = new ByteArrayOutputStream();
				objOutstream = new ObjectOutputStream(baos);
				objOutstream.writeObject(mpFormulaCode);
				bArray = baos.toByteArray();
				Timestamp  sqlDate = new java.sql.Timestamp(new java.util.Date().getTime());
				
			    lstObjectInputparam = new ArrayList();
				lstObjectInputparam.add(FCL_FORMULACODE);
				lstObjectInputparam.add(FCL_OLD);
				lstObjectInputparam.add(bArray);
				lstObjectInputparam.add(sqlDate);
				
				Connection con=JDBCUtil.getConnection();
				
				/*dataAccessService.setParametersForBlob(QueryConstants.INSERT_CACHE, lstObjectInputparam);
				dataAccessService.executeUpdateForBlobData();		*/		
				
				
				
}
}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}

