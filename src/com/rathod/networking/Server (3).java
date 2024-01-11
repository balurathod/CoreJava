import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Server extends JPanel
{
	private JTextField enter;
	private JTextArea display;
	ObjectOutputStream output;
	ObjectInputStream input;

	public Server()
	{
		setLayout(new BorderLayout());
		enter = new JTextField();
		enter.setEnabled( false );
		enter.addActionListener( new ActionListener() 
		{
			public void actionPerformed( ActionEvent e )
			{
				sendData( e.getActionCommand() );
			}
		}     );
		
		add( enter, BorderLayout.NORTH );
		display = new JTextArea();
		add( new JScrollPane( display ),BorderLayout.CENTER );
	}

	public void runServer()
	{
		ServerSocket server;
		Socket connection;
		int counter = 1;
		try 	
		{
			server = new ServerSocket( 5110, 100 );
			while ( true ) 
			{
				display.setText( "Waiting for connection\n" );
				connection = server.accept();
				display.append( "Connection " + counter + " received from: " +
				connection.getInetAddress().getHostName() );
				output = new ObjectOutputStream( connection.getOutputStream() );
				output.flush();
				input = new ObjectInputStream( connection.getInputStream() );
				display.append( "\nGot I/O streams\n" );
				String message = "SERVER>>> Connection successful";
				output.writeObject( message );
				output.flush();
				enter.setEnabled( true );
				do 
				{
					try 
					{
						message = (String) input.readObject();
						display.append( "\n" + message );
						display.setCaretPosition( display.getText().length() );
					}
					catch ( ClassNotFoundException cnfex ) 
					{
						display.append( "\nUnknown object type received" );
					}
				} while ( !message.equals( "CLIENT>>> TERMINATE" ) );

				display.append( "\nUser terminated connection" );
				enter.setEnabled( false );
				output.close();
				input.close();
				connection.close();
				++counter;
			}
		}
		catch ( EOFException eof ) 
		{
			System.out.println( "Client terminated connection" );
		}

		catch ( IOException io ) 	
		{
			io.printStackTrace();
		}
	}

	private void sendData( String s )
	{
		try 
		{
			output.writeObject( "SERVER>>> " + s );
			output.flush();
			display.append( "\nSERVER>>>" + s );
		}
		catch ( IOException cnfex ) 
		{
			display.append( "\nError writing object" );
		}
	}

	public static void main(String args[])
	{
		JFrame f=new JFrame("Vedisoft : TCP Server");
		Server app=new Server();
		f.setContentPane(app);
		f.setSize(500,500);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.runServer();
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


