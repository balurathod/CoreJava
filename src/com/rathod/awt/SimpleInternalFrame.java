package com.rathod.awt;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleInternalFrame extends JFrame {

  JDesktopPane desktop;
  JInternalFrame internalFrame;

  public SimpleInternalFrame() {
    super("Vedisoft : Project Title");
    setSize(Toolkit.getDefaultToolkit().getScreenSize());
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
	desktop = new JDesktopPane();
	desktop.setOpaque(true);
	add(desktop, BorderLayout.CENTER);


	ImageIcon ii = new ImageIcon("images/logo.gif");
	setIconImage(ii.getImage());

    internalFrame = new JInternalFrame("Vedisoft : Mnemonic Labels",true, true, true, true);
    internalFrame.setBounds(50, 50, 200, 200);
    internalFrame.setContentPane(new MnemonicLabels());
    internalFrame.setVisible(true);
    desktop.add(internalFrame, new Integer(1));    


    internalFrame = new JInternalFrame("Vedisoft : Default Tree Model",true, true, true, true);
    internalFrame.setBounds(400, 50, 200, 200);
    internalFrame.setContentPane(new TestDTM());
    internalFrame.setVisible(true);
    desktop.add(internalFrame, new Integer(2));    


    internalFrame = new JInternalFrame("Vedisoft : Alignment Example",true, true, true, true);
    internalFrame.setBounds(450, 350, 200, 200);
    internalFrame.setContentPane(new AlignmentExample());
    internalFrame.setVisible(true);
    desktop.add(internalFrame, new Integer(3));    

	JLabel lbl = new JLabel(new ImageIcon("images/vedisoft.jpg"));
	    int width = 410;
	    int height =230;
	    Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
	    int x = (screen.width-width)/2;
	    int y = (screen.height-height)/2;
	    lbl.setBounds(x,y,width,height);
	desktop.add(lbl, Integer.MIN_VALUE);



  }

  public static void main(String args[]) {
    SimpleInternalFrame sif = new SimpleInternalFrame();
    sif.setVisible(true);
  }

}

