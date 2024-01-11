package com.rathod.oops;
import java.rmi.*;
import java.rmi.server.*;
import java.sql.*;

public class AccImpl extends UnicastRemoteObject implements AccIntf
{
	Connection conn;
	/*------------------------------------------------------*/
	public AccImpl() throws RemoteException
	{
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			conn = DriverManager.getConnection("jdbc:odbc:mydsn","scott","tiger");
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Unable to load driver...");
		}

		catch(SQLException e)
		{
			System.out.println("Unable to make connection.....");
		}
	}
/*------------------------------------------------------*/
	public void createAccount(Account acc) throws RemoteException, DuplicateAccNoException, NotEnoughBalanceException
	{
		System.out.println("Creating account...");
		if(acc.bal<500)
			throw new NotEnoughBalanceException("Opening balance should be min.500");

		try
		{
			Statement st = conn.createStatement();
			String sql="select * from accmaster where accno="+acc.accno;
			ResultSet rs = st.executeQuery(sql);

			if(rs.next())
			{
				throw new DuplicateAccNoException("accnount number already exists!!!!");
			}
			String insql = "insert into accmaster values(?,?,?)";
			PreparedStatement pst = conn.prepareStatement(insql);
			pst.setInt(1,acc.accno);
			pst.setString(2,acc.accname);
			pst.setInt(3,acc.bal);
		
			pst.executeUpdate();
			System.out.println("row inserted...");
		}
		catch(SQLException e)
		{
			System.out.println("Error in creating row...."+e);
		}
	}//end of createAccount
/*------------------------------------------------------*/

	public Account getDetails(int accno) throws RemoteException, AccNoNotFoundException
	{
		System.out.println("Getting account details...");
		try
		{
			Statement st = conn.createStatement();
			String sql="select * from accmaster where accno="+accno;
			ResultSet rs = st.executeQuery(sql);

			if(rs.next())
			{
				Account acc = new Account(rs.getInt(1),rs.getString(2),rs.getInt(3));
				return acc;
			}
			else
				throw new AccNoNotFoundException("Account no does not exist!!!");
		}
		catch(SQLException e)
		{
			System.out.println("Error in SQL...."+e);
			return null;
		}

	}
/*------------------------------------------------------*/

	public void withDraw(int accno, int amt) throws RemoteException, AccNoNotFoundException, NotEnoughBalanceException
	{
		System.out.println("Withdrawing amount...");
		try
		{
			Statement st = conn.createStatement();
			String sql="select bal from accmaster where accno="+accno;
			ResultSet rs = st.executeQuery(sql);

			if(rs.next())
			{
				int bal = rs.getInt(1);
				if(bal-amt<500)
					throw new NotEnoughBalanceException("account balance should be minimum 500");
			}
			else
				throw new AccNoNotFoundException("Account no does not exist!!!");

			String updsql = "update accmaster set bal = bal-? where accno="+accno;
			PreparedStatement pst = conn.prepareStatement(updsql);
			pst.setInt(1,amt);
		
			int row = pst.executeUpdate();
			System.out.println("row updated.."+row);
				
		}
		catch(SQLException e)
		{
			System.out.println("Error in WITHDRAW...."+e);
		}
}
/*------------------------------------------------------*/
	public void deposit(int accno, int amt) throws  RemoteException, AccNoNotFoundException
	{
		System.out.println("Depositing amount...");
		try
		{
			Statement st = conn.createStatement();
			String sql="select bal from accmaster where accno="+accno;
			ResultSet rs = st.executeQuery(sql);
			int bal;

			if(rs.next())
			{
				bal = rs.getInt(1);
				System.out.println("Current balance is "+bal);
			}
			else
					throw new AccNoNotFoundException("account number does not exist");

			String updsql = "update accmaster set bal = bal+? where accno="+accno;
			PreparedStatement pst = conn.prepareStatement(updsql);
			pst.setInt(1,amt);
		
			int row = pst.executeUpdate();
			System.out.println("row updated.."+row);
				
		}
		catch(SQLException e)
		{
			System.out.println("Error in WITHDRAW...."+e);
		}
	}
/*------------------------------------------------------*/

}	

