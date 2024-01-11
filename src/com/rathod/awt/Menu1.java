package com.rathod.awt;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.*;

public class Menu1 extends JFrame implements ActionListener
{

	JDesktopPane desktop;
	JMenuBar mb;
	JMenu m1,m2,m3,m4,m5,m6,m7;
	JMenu m21,m22;
	JMenuItem m11,m12,m13,m14,m15;
	JMenuItem m211,m212,m221,m222;
	JMenuItem m31,m32,m33;
	JMenuItem m41,m42;
	JMenuItem m51,m52,m53;
	JMenuItem m61,m62;
	JMenuItem m611,m612,m613,m621,m622;

	String strings[] = { "Metal", "Motif", "Windows" };
	String strings1[] = { "images/pic6.gif", "images/pic7.gif", "images/pic8.gif" };
	UIManager.LookAndFeelInfo looks[];
	JRadioButtonMenuItem r[];
	ButtonGroup g;
	JPopupMenu pop;
	

	public Menu1() 
	{
		super("Vedisoft : Project Title");
		
		mb=new JMenuBar();
		m1=new JMenu("Class 1");
		m2=new JMenu("Class 2");
		m3=new JMenu("Class 3");
		m4=new JMenu("Class 4");
		m5=new JMenu("Class 5");
		m6=new JMenu("Class 6");
		m7= new JMenu("Look and Feel");
		pop = new JPopupMenu();


		m11 = new JMenuItem("Simple JLabel Example",new ImageIcon("images/pic1.gif"));
		m12 = new JMenuItem("Alignment Example",new ImageIcon("images/pic2.gif"));
		m13 = new JMenuItem("Mnemonic Labels",new ImageIcon("images/pic3.gif"));
		m14 = new JMenuItem("Image Labels",new ImageIcon("images/pic4.gif"));
		m15 = new JMenuItem("Exit");

		m11.setMnemonic('S');
		m12.setMnemonic('A');
		m13.setMnemonic('M');
		m14.setMnemonic('I');
		m15.setMnemonic('x');

		m11.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, Event.CTRL_MASK));
		m12.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, Event.CTRL_MASK));
		m13.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, Event.CTRL_MASK));
		m14.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, Event.CTRL_MASK));
		m15.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, Event.CTRL_MASK));
		m11.addActionListener(this);
		m12.addActionListener(this);
		m13.addActionListener(this);
		m14.addActionListener(this);
		m15.addActionListener(this);


		m21 = new JMenu("Buttons");
		m22 = new JMenu("Borders");

		m21.setMnemonic('u');
		m22.setMnemonic('o');
		
		m211 = new JMenuItem("Fancy Button Implementation",new ImageIcon("images/pic5.gif"));
		m212 = new JMenuItem("Mnemonic Buttons",new ImageIcon("images/pic6.gif"));

		m211.setMnemonic('F');
		m212.setMnemonic('M');
		m211.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, Event.CTRL_MASK));
		m212.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, Event.CTRL_MASK));
		
		m211.addActionListener(this);
		m212.addActionListener(this);
		
	
		m221 = new JMenuItem("Border Factory",new ImageIcon("images/pic7.gif"));
		m222 = new JMenuItem("Bevel Border",new ImageIcon("images/pic8.gif"));

		m221.setMnemonic('F');
		m222.setMnemonic('B');
		m221.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, Event.CTRL_MASK));
		m222.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, Event.CTRL_MASK));

		m221.addActionListener(this);
		m222.addActionListener(this);

		m31 = new JMenuItem("My Check",new ImageIcon("images/pic9.gif"));
		m32 = new JMenuItem("Simple List Example",new ImageIcon("images/pic10.gif"));
		m33 = new JMenuItem("List Model Example",new ImageIcon("images/pic11.gif"));

		m31.setMnemonic('M');
		m32.setMnemonic('S');
		m33.setMnemonic('L');
		m31.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_J, Event.CTRL_MASK));
		m32.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K, Event.CTRL_MASK));
		m33.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, Event.CTRL_MASK));

		m31.addActionListener(this);
		m32.addActionListener(this);
		m33.addActionListener(this);

		m3.add(m31);
		m3.add(m32);
		m3.add(m33);
		
		m41 = new JMenuItem("GridBag Layout",new ImageIcon("images/pic12.gif"));
		m42 = new JMenuItem("Card Layout",new ImageIcon("images/pic13.gif"));

		m41.setMnemonic('G');
		m42.setMnemonic('C');
		m41.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, Event.CTRL_MASK));
		m42.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, Event.CTRL_MASK));

		m41.addActionListener(this);
		m42.addActionListener(this);

		m4.add(m41);
		m4.add(m42);

		m51 = new JMenuItem("Option Pane",new ImageIcon("images/pic14.gif"));
		m52 = new JMenuItem("Color Chooser",new ImageIcon("images/pic15.gif"));
		m53 = new JMenuItem("File Chooser",new ImageIcon("images/pic16.gif"));

		m51.setMnemonic('O');
		m52.setMnemonic('C');
		m53.setMnemonic('F');

		m51.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, Event.CTRL_MASK));
		m52.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, Event.CTRL_MASK));
		m53.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, Event.CTRL_MASK));


		m51.addActionListener(this);
		m52.addActionListener(this);
		m53.addActionListener(this);

		m5.add(m51);
		m5.add(m52);
		m5.add(m53);

		m61 = new JMenu("Tree");
		m62 = new JMenu("Table");
		m61.setMnemonic('r');
		m62.setMnemonic('T');

		m611 = new JMenuItem("Default Tree Model",new ImageIcon("images/pic17.gif"));
		m612 = new JMenuItem("Default Mutable Node",new ImageIcon("images/pic18.gif"));
		m613 = new JMenuItem("Test JTree",new ImageIcon("images/pic19.gif"));
		m621 = new JMenuItem("Default Table Model",new ImageIcon("images/pic20.gif"));
		m622 = new JMenuItem("Test JTable",new ImageIcon("images/pic21.gif"));

		m611.setMnemonic('T');
		m612.setMnemonic('M');
		m613.setMnemonic('J');
		m621.setMnemonic('D');
		m622.setMnemonic('T');

		m611.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, Event.CTRL_MASK));
		m612.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, Event.CTRL_MASK));
		m613.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T, Event.CTRL_MASK));
		m621.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_U, Event.CTRL_MASK));
		m622.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK));

		m611.addActionListener(this);
		m612.addActionListener(this);
		m613.addActionListener(this);
		m621.addActionListener(this);
		m622.addActionListener(this);
		m61.add(m611);
		m61.add(m612);
		m61.add(m613);
		m62.add(m621);
		m62.add(m622);
		m6.add(m61);
		m6.add(m62);

		
		m21.add(m211);
		m21.add(m212);
		m22.add(m221);
		m22.add(m222);
		m2.add(m21);
		m2.add(m22);


		m1.setMnemonic('1');
		m2.setMnemonic('2');
		m3.setMnemonic('3');
		m4.setMnemonic('4');
		m5.setMnemonic('5');
		m6.setMnemonic('6');
		m7.setMnemonic('L');



		r = new JRadioButtonMenuItem[ strings.length ];
		g = new ButtonGroup();
		ItemHandler h = new ItemHandler();
		for ( int i = 0; i < r.length; i++ ) 
		{
			r[ i ] = new JRadioButtonMenuItem(strings[ i ] ,new ImageIcon(strings1[i]));
			r[ i ].addItemListener( h );
			g.add( r[ i ] );
			m7.add(r[i]);
		}

		looks = UIManager.getInstalledLookAndFeels();
		r[0].setSelected( true );


		m1.add(m11);
		m1.add(m12);
		m1.add(m13);
		m1.add(m14);
		m1.addSeparator();
		m1.add(m15);

		pop.add(m7);

		mb.add(m1);
		mb.add(m2);
		mb.add(m3);
		mb.add(m4);
		mb.add(m5);
		mb.add(m6);


		setJMenuBar(mb);

		desktop = new JDesktopPane();
		desktop.setOpaque(true);
		desktop.addMouseListener(new M());
		add(desktop, BorderLayout.CENTER);	


		ImageIcon ii = new ImageIcon("images/logo.gif");
		setIconImage(ii.getImage());

	


		JLabel lbl = new JLabel(new ImageIcon("images/vedisoft.jpg"));
		int width = 410;
		int height =230;
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (screen.width-width)/2;
		int y = (screen.height-height)/2;
		lbl.setBounds(x,y,width,height);
		desktop.add(lbl, Integer.MIN_VALUE);

		setSize(Toolkit.getDefaultToolkit().getScreenSize());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
		show();
	}

	public void actionPerformed(ActionEvent ae)
	{
	String str = ae.getActionCommand();
	if(str.equals("Exit"))
	{
		System.out.println("Vedisoft Java Module I : Desktop Technologies");
		System.exit(0);
	}
	JInternalFrame internalFrame = new JInternalFrame(ae.getActionCommand(),true,true,true,true);
	
	if(str.equals("Simple JLabel Example"))
		internalFrame.setContentPane(new SimpleJLabelExample());
	else if(str.equals("Alignment Example"))
		internalFrame.setContentPane(new AlignmentExample());
	else if(str.equals("Mnemonic Labels"))
		internalFrame.setContentPane(new MnemonicLabels());
	else if(str.equals("Image Labels"))
		internalFrame.setContentPane(new ImageLabelDemo());
	else if(str.equals("Fancy Button Implementation"))
		internalFrame.setContentPane(new FancyButtonImp());
	else if(str.equals("Mnemonic Buttons"))
		internalFrame.setContentPane(new Mnemonic());
	else if(str.equals("Border Factory"))
		internalFrame.setContentPane(new MyFrame());
	else if(str.equals("Bevel Border"))
		internalFrame.setContentPane(new BevelExample());
	else if(str.equals("My Check"))
		internalFrame.setContentPane(new MyCheck());
	else if(str.equals("Simple List Example"))
		internalFrame.setContentPane(new SimpleList());
	else if(str.equals("List Model Example"))
		internalFrame.setContentPane(new ListModelExample());
	else if(str.equals("GridBag Layout"))
		internalFrame.setContentPane(new GridBagDemo());
	else if(str.equals("Card Layout"))
		internalFrame.setContentPane(new CardTest());
	else if(str.equals("Option Pane"))
		internalFrame.setContentPane(new JOptionPaneTest());
	else if(str.equals("Color Chooser"))
		internalFrame.setContentPane(new ShowColors());
	else if(str.equals("File Chooser"))
		internalFrame.setContentPane(new SimpleFileChooser());
	else if(str.equals("Default Tree Model"))
		internalFrame.setContentPane(new TestDTM());
	else if(str.equals("Default Mutable Node"))
		internalFrame.setContentPane(new TestDMN());
	else if(str.equals("Test JTree"))
		internalFrame.setContentPane(new TestJTree());
	else if(str.equals("Default Table Model"))
		internalFrame.setContentPane(new TestColumnModel());
	else if(str.equals("Test JTable"))
		internalFrame.setContentPane(new TestJTable());
	internalFrame.setSize(300,200);
	desktop.add(internalFrame);
	internalFrame.setVisible(true);
		
	}
	private class M extends MouseAdapter
	{
		public void mouseClicked(MouseEvent m1)
		{
		                       if(m1.getModifiers() == InputEvent.BUTTON3_MASK)
				pop.show(Menu1.this,m1.getX(),m1.getY());
		}
	}

	private class ItemHandler implements ItemListener 
	{
		public void itemStateChanged( ItemEvent e )
		{
			for ( int i = 0; i < r.length; i++ )
			if ( r[ i ].isSelected() ) 
			{
			try{
			UIManager.setLookAndFeel(looks[i].getClassName() );
			SwingUtilities.updateComponentTreeUI( Menu1.this ); }
			catch(Exception ex)
			{
			ex.printStackTrace();
			}

			}
		}		
	}


	public static void main(String args[]) 
	{
		Menu1 sif = new Menu1();

	}

}