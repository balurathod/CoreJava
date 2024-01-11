package com.rathod.jdbc;
/*
Table Required for this example :
create table MyForm(code number(10),name varchar2(20), department varchar2(20),destignation varchar2(20),
basic number(20,3),date_of_join date);
*/


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.sql.*;

public class MyForm extends JPanel implements ActionListener
 {
	ResultSet rs;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
	JLabel lb1,lb2,lb3,lb4,lb5,lb6;
	JTextField tf1,tf2,tf3,tf4,tf5,tf6;
	JLabel stat;
	Statement stmt1;
	Connection conn=null;
	int tot=0, t, cur=0,y;
	String op="",query;    
	String ma[]={"Jan","Feb","Mar","Apr","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};

	JPanel p1,p2,p3;

	public MyForm()
       	{
	setLayout(new BorderLayout(5,5));

	p1=new JPanel();
	p2=new JPanel();
	p3=new JPanel();
	
	p1.setLayout(new FlowLayout());
	p2.setLayout(null);

	stat= new JLabel();
	stat.setFont(new Font("Bookman Old Style",Font.BOLD,18));
	stat.setForeground(Color.blue);

	MatteBorder  b=new MatteBorder(2,2,2,2,Color.white);
	p1.setBorder(b);
	p1.setBackground(new Color(22,67,89));
	b=new MatteBorder(4,4,4,4,Color.white);
	p2.setBorder(b);
	b=new MatteBorder(1,1,1,1,Color.black);
	p3.setBorder(b);


	b1=new JButton(new ImageIcon("images/add.gif"));
	b2=new JButton(new ImageIcon("images/update.gif"));
	b3=new JButton(new ImageIcon("images/save.gif"));
	b4=new JButton(new ImageIcon("images/clear.gif"));
	b5=new JButton(new ImageIcon("images/delete.gif"));

	b6=new JButton(new ImageIcon("images/first.gif"));
	b7=new JButton(new ImageIcon("images/next.gif"));
	b8=new JButton(new ImageIcon("images/previous.gif"));
	b9=new JButton(new ImageIcon("images/last.gif"));
	
	b1.setToolTipText("Add");
	b2.setToolTipText("Update");
	b3.setToolTipText("Save");
	b4.setToolTipText("Clear");
	b5.setToolTipText("Delete");
	b6.setToolTipText("First");
	b7.setToolTipText("Previous");
	b8.setToolTipText("Next");
	b9.setToolTipText("Last");


	lb1=new JLabel("Code");
	lb2=new JLabel("Name");
	lb3=new JLabel("Department");
	lb4=new JLabel("Designation");
	lb5=new JLabel("Basic");
	lb6=new JLabel("Date of Joining");

	tf1=new JTextField();
	tf2=new JTextField();
	tf3=new JTextField();
	tf4=new JTextField();
	tf5=new JTextField();
	tf6=new JTextField();

	lb1.setBounds(130,70,100,25);
	lb2.setBounds(130,110,100,25);
	lb3.setBounds(130,150,100,25);
	lb4.setBounds(130,190,100,25);
	lb5.setBounds(130,230,100,25);
	lb6.setBounds(130,270,100,25);

	tf1.setBounds(260,70,260,30);
	tf2.setBounds(260,110,260,30);
	tf3.setBounds(260,150,260,30);
	tf4.setBounds(260,190,260,30);
	tf5.setBounds(260,230,260,30);
	tf6.setBounds(260,270,260,30); 

	b1.setMnemonic('A');
	b2.setMnemonic('U');
	b3.setMnemonic('S');
	b4.setMnemonic('C');
	b5.setMnemonic('D');

	b6.setMnemonic('I');
	b7.setMnemonic('N');
	b8.setMnemonic('P');
	b9.setMnemonic('L');

	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	b5.addActionListener(this);
	b6.addActionListener(this);
	b7.addActionListener(this);
	b8.addActionListener(this);
	b9.addActionListener(this);

	p1.add(b1);	
	p1.add(b2);	
	p1.add(b3);	
	p1.add(b4);	
	p1.add(b5);	
	p1.add(b6);	
	p1.add(b7);	
	p1.add(b8);	
	p1.add(b9);	

	p2.add(lb1);	
	p2.add(lb2);	
	p2.add(lb3);	
	p2.add(lb4);
	p2.add(lb5);	
	p2.add(lb6);
	p2.add(tf1);
	p2.add(tf2);	
	p2.add(tf3);	
	p2.add(tf4);
	p2.add(tf5);	
	p2.add(tf6);          
	p3.add(stat);

	p3.setLayout(new BoxLayout(p3, BoxLayout.Y_AXIS));
	p3.setBackground(Color.white);
	p3.add(Box.createRigidArea(new Dimension(1, 50)));

	add(p1,"North");	
	add(p2,"Center");	
	add(p3,"South");
 
       	try
	{
	DriverManager.registerDriver(new sun.jdbc.odbc.JdbcOdbcDriver ());
	conn =DriverManager.getConnection("jdbc:odbc:vedisoft","scott","tiger");
	query = "Select * from myform" ;
	stmt1 = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY );
	 rs = stmt1.executeQuery(query);
	rs.last();
	tot = rs.getRow();
	rs.beforeFirst();
	if(rs.next())
	{
		cur=1;
		show(rs);
		title();
	}
	}
	catch(Exception e)
	{
                  stat.setText("  Unable to Register");
	}
	disable();
}

	public void actionPerformed(ActionEvent ae)
	{
	String s=ae.getActionCommand();
	Statement stmt=null;       
	String sql1=new String();

                  if(ae.getSource()==b1) //Add
            {
		try
	{
		op="Add";
		ena();
		stmt = conn.createStatement();
		sql1="select max(code) from MyForm" ;
		ResultSet rs1=stmt.executeQuery(sql1);        
		boolean b = rs1.next();
		
		   if(b)
		{
			t = rs1.getInt(1);
		}
		  else
		{
		t = 0;
		}
		t=t+1;	
		tf1.setText(t+"");
		  tf2.setText("");
		  tf3.setText("");
		  tf4.setText("");
		  tf5.setText("");
		  tf6.setText("");
			}	
	catch(Exception e)
	{
                       stat.setText("\n\tInsertion Failure");
	}
             }
	else          if(ae.getSource()==b2)  //Update
		{
		op="Update";
		ena();
		}

               else                    if(ae.getSource()==b3) //Save
        {
 	if(op.equals("Add"))
               {
	try{
		stmt=conn.createStatement();
		sql1="Insert into MyForm values("+tf1.getText()  +",'"+ tf2.getText() +"','"+tf3.getText()+"','"+tf4.getText()+"',"+ tf5.getText() +",'"+ tf6.getText() +"')";
    	                y=stmt.executeUpdate(sql1);
                               disable();
		tot+=1;

stmt1 = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY );
	 rs = stmt1.executeQuery(query);
		rs.last();
		show(rs);
		title();
		if(y!=0)
		stat.setText("\tInsertion Successful");
		else
		stat.setText("\tInsertion Failure");
                       } 
	catch(Exception e)
	{
                       stat.setText("\t Insertion Failure");
	}

                }
	  else  if(op.equals("Update"))
               {
	try{
		stmt=conn.createStatement();
		sql1="update MyForm set name='"+ tf2.getText() +"',Department='"+tf3.getText()+"',DESIGNATION ='"+tf4.getText()+ "',basic="+tf5.getText()+",Date_of_join='"+ tf6.getText()+"' where code="+ Integer.parseInt (tf1.getText()) ;
       	                 y=stmt.executeUpdate(sql1);
		if(y!=0)
			stat.setText("\tUpdate Successful");
		else
			stat.setText("\tUpdate Failure");
		disable();
                       } 
		catch(Exception e)
	        {
                       stat.setText("Updation Exception");
	        }
             	}
         }

      else           if(ae.getSource()==b5) //Delete
        {
 	try{
	ena();

	  if(!tf1.getText().equals(""))
	{
		stmt=conn.createStatement();
sql1="delete from MyForm where code="+ Integer.parseInt (tf1.getText()) ;
		y=stmt.executeUpdate(sql1);

	cur-=1;
	tot-=1;
	stmt1 = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY );
	 rs = stmt1.executeQuery(query);
		rs.absolute(cur);
		show(rs);
		title();
         		 stat.setText("\tDeletion Successful");
	}
		}
	catch(Exception e)
	{
                       stat.setText(" Deletion Exception");
	}
         }
	else  if(ae.getSource()==b4) //Clear
	{
	  tf1.setText("");
	  tf2.setText("");
	  tf3.setText("");
	  tf4.setText("");
	  tf5.setText("");
	  tf6.setText("");
	}
	else   if(ae.getSource()==b9) //last
	{
	try{
		if(cur==tot)
		{
			stat.setText("Already On Last Record");
		}
                	else
		{
			rs.last();
			cur=tot;
			show(rs);
			title();
		}
	}
	catch(Exception e)
	{
                       stat.setText(" Record Not Found");
	}
}

	else   if(ae.getSource()==b6) //First
	{
	try{
		if(cur==1)
		{
			stat.setText("Already On First Record");
		}
                	else
		{
			rs.first();
			cur=1;
			title();
			show(rs);		
		}
	}
	catch(Exception e)
	{
                       stat.setText(" Record Not Found");
	}

	}

	else      if(ae.getSource()==b7) //Next
	{
	try{
		if(cur==tot)
		{
			stat.setText("Already On Last Record");
		}
                	else
		{
			rs.next();
			cur+=1;
			show(rs);
			title();
		}
                }
	catch(Exception e)
	{
                       stat.setText(" Record Not Found");
	}

	}

	else    if(ae.getSource()==b8) //Previous
	{
	try{
		if(cur==1)
		{
			stat.setText("Already On First Record");
		}
                	else
		{
			rs.previous();
			cur-=1;
			show(rs);
			title();
		}
	}
	catch(Exception e)
	{
                       stat.setText(" Record Not Found");
	}

	}
}

	  public void title()
	{
stat.setText("My Database Form : Record " + (cur) + " of  " + tot );
	}

	public String con(String st)
{
	String s1=st;
	int i1=Integer.parseInt(s1.substring(5,7));
	String s2=ma[i1-1];
	return	s1.substring(8,10)+"-"+s2+"-"+s1.substring(0,4);

}

	public void show(ResultSet rs)
{
	try
	{
		stat.setText("\tRecord  Found");		
		tf1.setText(rs.getString(1));
		tf2.setText(rs.getString(2));
		tf3.setText(rs.getString(3));
		tf4.setText(rs.getString(4));
		tf5.setText(rs.getString(5));
		tf6.setText(con(rs.getString(6)));
	}

	catch(Exception e)
	{
                     stat.setText("  Record Not Found");
	}
}
	public void ena()
     {
         tf1.setEnabled(true);
         tf2.setEnabled(true);
         tf3.setEnabled(true);
         tf4.setEnabled(true);
         tf5.setEnabled(true);
         tf6.setEnabled(true);
     }

	public void disable()
     {
         tf1.setEnabled(false);
         tf2.setEnabled(false);
         tf3.setEnabled(false);
         tf4.setEnabled(false);
         tf5.setEnabled(false);
         tf6.setEnabled(false);
     }

   public void shutDown()
   {
      try {
         conn.close();
      }
      catch ( SQLException sqlex ) {
         System.err.println( "Unable to disconnect" );
         sqlex.printStackTrace();
      }
   }

        public static void main(String arg[])
   {
	JFrame f = new JFrame("Vedisoft : JDBC Example 1");
	Dimension Screen=Toolkit.getDefaultToolkit().getScreenSize();
	int x=Screen.width;
	int y=Screen.height;     
	f.setSize(x,y);
	final MyForm mf = new MyForm();
	f.setContentPane(mf); 
	f.setVisible(true);
	f.addWindowListener( 
         new WindowAdapter() {
            public void windowClosing( WindowEvent e ) 
            {  
               mf.shutDown();
               System.exit( 0 );
            }
         }
      );

   }
}

/* 
Vedisoft : Java - Module 1 "Desktop Technologies"


Vedisoft
Plot No. 173, Zone II, M.P. Nagar,
Bhopal.
Phone : 0755 - 6541546
Email : contact@vedisoft.com
Web : www.vedisoft.com
*/