package com.rathod.oops;

import java.util.*;
import java.sql.*;
import javax.sql.*;

public class SampleRetry {

	public static Connection getConnection(){
		
		ResultSet rs=null;
		Connection con=null;
		String timeValue;
		PreparedStatement ps=null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			/*Class.forName("com.mysql.jdbc.Driver");*/
			con = DriverManager.getConnection("172.16.3.94:1521:XE","FCL_PROD_OWNER_VIEW","FCL_PROD_OWNER_VIEW");
			/*con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");*/
			//String sql="select MAKER_DATE from tb_transactiondata where workitemid('?')";
			//String sql="select ETL_ACQ_NOT as ETLFLAG, OFFICE_ID as OFFICE_ID from EOD_MSG_Details where  OFFICE_ID in('GB1','GI1','CY1') and MESSAGE_TIME like sysdate=?";
			String sql="select ACCT_NUM, ACCT_SYS_ID, BR_CD, OFFICE_ID, CLEAR_BAL, LEDGER_BAL, DEBTINTEREST_BAL, CCY, LCY_CCY, REFERENCE_ID, OVERDRAFT_LIMIT, DAYLIGHTEXPO_LIMIT, RESERVE_LIMIT, SETTLEMENTRISK_LIMIT, REFER_TYPE, REFER_VALUE,TRADE_BAL ," +
					" LCY_CLEAR_BAL,LCY_LEDGER_BAL,LCY_DEBTINTEREST_BAL ,LCY_TRADE_BAL,SR_No,ACC_NAME,LED_BAL_CCY,DEBTINTEREST_BAL_CCY from  ACCOUNT_BALANCE_DETAILS";
			ps=con.prepareStatement(sql);
			//ps.setString(1,"27-AUG-13" );
		
			 rs=ps.executeQuery();
			while(rs.next())
			{
				timeValue=rs.getString(1);
				System.out.println("timerValue" + timeValue);
			}
		return con;	
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
		
		
		// TODO Auto-generated method stub

	}

}
