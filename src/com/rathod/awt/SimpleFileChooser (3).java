import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class SimpleFileChooser extends JPanel
{

	JButton openButton ;
	JButton saveButton ;
	JButton dirButton ;
	final JLabel statusbar;

	public SimpleFileChooser() 
	{

		setLayout(new FlowLayout());
    		openButton = new JButton("Open");
		saveButton = new JButton("Save");
		dirButton = new JButton("Pick Dir");
		statusbar =  new JLabel("Output of your selection will go here");

		openButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent ae) 
			{
				JFileChooser chooser = new JFileChooser();
				chooser.setMultiSelectionEnabled(true);
				int option = chooser.showOpenDialog(SimpleFileChooser.this);
				
				if (option == JFileChooser.APPROVE_OPTION) 
				{
					File[] sf = chooser.getSelectedFiles();
					String filelist = "nothing";

					if (sf.length > 0) 
						filelist = sf[0].getName();
					
					for (int i = 1; i < sf.length; i++) 
					{
						filelist += ", " + sf[i].getName();
					}
					statusbar.setText("You chose " + filelist);
				}
				else 
				{
					statusbar.setText("You canceled.");
				}
			}
	});

	saveButton.addActionListener(new ActionListener() 
	{
		public void actionPerformed(ActionEvent ae) 
		{
			JFileChooser chooser = new JFileChooser();
			int option = chooser.showSaveDialog(SimpleFileChooser.this);
			if (option == JFileChooser.APPROVE_OPTION) 
			{
				statusbar.setText("You saved " + ((chooser.getSelectedFile()!=null)?
				chooser.getSelectedFile().getName():"nothing"));
			}
			else 
			{
				statusbar.setText("You canceled.");
			}
		}
	});

	dirButton.addActionListener(new ActionListener() 
	{
		public void actionPerformed(ActionEvent ae) 
		{
			JFileChooser chooser = new JFileChooser();
			chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
			int option = chooser.showOpenDialog(SimpleFileChooser.this);
			if (option == JFileChooser.APPROVE_OPTION) 
			{
				statusbar.setText("You opened " + ((chooser.getSelectedFile()!=null)?
				chooser.getSelectedFile().getName():"nothing"));
			}
			else 
			{
				statusbar.setText("You canceled.");
			}
		}
	});

	add(openButton);
	add(saveButton);
	add(dirButton);
	add(statusbar);
	}

	public static void main(String args[])
	{
		JFrame f=new JFrame("SimpleFileChooser:");
		f.setContentPane(new SimpleFileChooser());
		f.setSize(500,500);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
