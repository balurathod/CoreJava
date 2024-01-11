package com.rathod.jdbc;
import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class DisplayQueryResults extends JPanel {
   private Connection connection;
   private Statement statement;
   private ResultSet resultSet;
   private ResultSetMetaData rsMetaData;

   private JTable table;
   private JTextArea inputQuery;
   private JButton submitQuery;
    
   public DisplayQueryResults() 
   {   

      String url = "jdbc:odbc:vedisoft1";  
      String username = "anonymous";
      String password = "guest";

      try {
         Class.forName( "sun.jdbc.odbc.JdbcOdbcDriver" );

         connection = DriverManager.getConnection( 
            url, username, password );
      } 
      catch ( ClassNotFoundException cnfex ) {
         System.err.println( 
            "Failed to load JDBC/ODBC driver." );
         cnfex.printStackTrace();
         System.exit( 1 );  // terminate program
      }
      catch ( SQLException sqlex ) {
         System.err.println( "Unable to connect" );
         sqlex.printStackTrace();
         System.exit( 1 );  // terminate program
      }

      inputQuery =
         new JTextArea( "SELECT * FROM Authors", 4, 30 );
      submitQuery = new JButton( "Submit query" );
      submitQuery.addActionListener(
         new ActionListener() {
            public void actionPerformed( ActionEvent e ) 
            {
               getTable();
            }
         }   
      );

      JPanel topPanel = new JPanel();
      topPanel.setLayout( new BorderLayout() );
      topPanel.add( new JScrollPane( inputQuery), 
                    BorderLayout.CENTER );
      topPanel.add( submitQuery, BorderLayout.SOUTH );
 
      table = new JTable( 4, 4 );

      setLayout( new BorderLayout() );
      add( topPanel, BorderLayout.NORTH );
      add( table, BorderLayout.CENTER );      

      getTable();

      setSize( 500, 500 );
      show();
   }

   private void getTable()
   {
      try {
         String query = inputQuery.getText();

         statement = connection.createStatement();
         resultSet = statement.executeQuery( query );         
         displayResultSet( resultSet );
      }
      catch ( SQLException sqlex ) {
         sqlex.printStackTrace();
      }
   }

   private void displayResultSet( ResultSet rs )
      throws SQLException
   {
      // position to first record
      boolean moreRecords = rs.next();  

      // If there are no records, display a message
      if ( ! moreRecords ) {
         JOptionPane.showMessageDialog( this, 
            "ResultSet contained no records" );
         return;
      }

      Vector columnHeads = new Vector();
      Vector rows = new Vector();

      try {
         // get column heads
         ResultSetMetaData rsmd = rs.getMetaData();
      
         for ( int i = 1; i <= rsmd.getColumnCount(); ++i ) 
            columnHeads.addElement( rsmd.getColumnName( i ) );

         // get row data
         do {
            rows.addElement( getNextRow( rs, rsmd ) ); 
         } while ( rs.next() );

         // display table with ResultSet contents
         table = new JTable( rows, columnHeads );
         JScrollPane scroller = new JScrollPane( table );
         remove( 1 );
         add( scroller, BorderLayout.CENTER );
         validate();
      }
      catch ( SQLException sqlex ) {
         sqlex.printStackTrace();
      }
   }

   private Vector getNextRow( ResultSet rs, 
                              ResultSetMetaData rsmd )
       throws SQLException
   {
      Vector currentRow = new Vector();
      
      for ( int i = 1; i <= rsmd.getColumnCount(); ++i )
         switch( rsmd.getColumnType( i ) ) {
            case Types.VARCHAR:
            case Types.LONGVARCHAR:
                  currentRow.addElement( rs.getString( i ) );
               break;
            case Types.INTEGER:
                  currentRow.addElement( 
                     new Long( rs.getLong( i ) ) );
               break;
            default: 
               System.out.println( "Type was: " + 
                  rsmd.getColumnTypeName( i ) );
         }
      
      return currentRow;
   }

   public void shutDown()
   {
      try {
         connection.close();
      }
      catch ( SQLException sqlex ) {
         System.err.println( "Unable to disconnect" );
         sqlex.printStackTrace();
      }
   }

   public static void main( String args[] ) 
   {
JFrame f=new JFrame("Vedisoft: JDBC Example 3");
final DisplayQueryResults td = new DisplayQueryResults();
	f.setContentPane(td);
	f.setSize(500,500);
	f.setVisible(true);
	f.addWindowListener( 
         new WindowAdapter() {
            public void windowClosing( WindowEvent e ) 
            {  
               td.shutDown();
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