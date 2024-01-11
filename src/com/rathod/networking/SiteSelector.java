package com.rathod.networking;
import java.net.*;
import java.util.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.applet.AppletContext;

public class SiteSelector extends JApplet
{
	private Hashtable sites;
	private Vector siteNames;
	
	public void init()
	{
		sites = new Hashtable();
		siteNames = new Vector();

		getSitesFromHTMLParameters();

		Container c = getContentPane();
		c.add(new JLabel("Choose a site to browse"),BorderLayout.NORTH);
		final JList siteChooser = new JList(siteNames);
		siteChooser.addListSelectionListener(new ListSelectionListener()
			{
				public void valueChanged(ListSelectionEvent e)
				{
					Object o = siteChooser.getSelectedValue();
					URL newDocument = (URL) sites.get(o);
					AppletContext browser = getAppletContext();
					browser.showDocument(newDocument);
				}
			});
		c.add(new JScrollPane(siteChooser),BorderLayout.CENTER);
			}

		private void getSitesFromHTMLParameters()
		{
			String title,location;
			URL url;
			int  counter = 0;
			while(true)
			{
				title=getParameter("title"+counter);
				if(title != null)
				{
					location = getParameter("location"+counter);
					try
					{
						url = new URL(location);
						sites.put(title,url);
						siteNames.addElement(title);	
					}
					catch(MalformedURLException e)
					{
						e.printStackTrace();
					}
				}
				else
				break;
				++counter;
			}	
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