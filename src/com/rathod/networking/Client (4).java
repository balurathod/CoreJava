import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Client extends JPanel
{
	private JTextField enter;
	private JTextArea display;
	ObjectOutputStream output;
	ObjectInputStream input;
	String message = "";

	public Client()
	{

		setLayout(new BorderLayout());
		enter = new JTextField();
		enter.setEnabled( false );
		enter.addActionListener(new ActionListener() 
				{
				   public void actionPerformed( ActionEvent e )
				{
					sendData( e.getActionCommand() );
				}
				}     );
		add( enter, BorderLayout.NORTH );
		display = new JTextArea();
		add( new JScrollPane( display ),
		BorderLayout.CENTER );

	}


	public void runClient() 
	{
		Socket client;
		try 
		{
			display.setText( "Attempting connection\n" );
			client = new Socket( InetAddress.getByName( "127.0.0.1" ), 5110 );
			display.append( "Connected to: " + client.getInetAddress().getHostName() );
			output = new ObjectOutputStream( client.getOutputStream() );
			output.flush();
			input = new ObjectInputStream( client.getInputStream() );
			display.append( "\nGot I/O streams\n" );
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
			}
			 while ( !message.equals( "SERVER>>> TERMINATE" ) );

			display.append( "Closing connection.\n" );
			output.close();
			input.close();
			client.close();
	}
	catch ( EOFException eof ) 
	{
		System.out.println( "Server terminated connection" );
	}

	catch ( IOException e ) 
	{
		e.printStackTrace();
	}
}

	private void sendData( String s )
	{
		try 
		{
			message = s;
			output.writeObject( "CLIENT>>> " + s );
			output.flush();
			display.append( "\nCLIENT>>>" + s );
		}
		catch ( IOException cnfex ) 
		{
			display.append( "\nError writing object" );
	}
}

	public static void main(String args[])
	{
		JFrame f=new JFrame("Client:");
		Client app=new Client();
		f.setContentPane(app);
		f.setSize(500,500);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.runClient();
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


