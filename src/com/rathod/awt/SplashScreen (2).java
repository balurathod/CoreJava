import java.awt.*;
import javax.swing.*;

public class SplashScreen extends JWindow {
  private int duration;
  public SplashScreen(int d) {
    duration = d;
  }

  public void showSplash() {
    setBackground(Color.white);

    int width = 410;
    int height =230;
    Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (screen.width-width)/2;
    int y = (screen.height-height)/2;
    setBounds(x,y,width,height);

    // Build the splash screen
    JLabel label = new JLabel(new ImageIcon("images/vedisoft.jpg"));
    JLabel copyrt = new JLabel
      ("Copyright 2007, Vedisoft. Plot No. 173, Zone II, M.P. Nagar, Bhopal.", JLabel.CENTER);
    Color clr = new Color(0,0, 128);
copyrt.setForeground(clr);	
    copyrt.setFont(new Font("Sans-Serif", Font.BOLD, 12));
    add(label, BorderLayout.CENTER);
    add(copyrt, BorderLayout.SOUTH);
    JPanel p = (JPanel) getContentPane();
p.setBorder(BorderFactory.createLineBorder(clr, 10));

    setVisible(true);

    try { Thread.sleep(duration); } catch (Exception e) {}

    setVisible(false);
  }

  public void showSplashAndExit() {
    showSplash();
    Menu2 sif = new Menu2();
  }

  public static void main(String[] args) {
    SplashScreen splash = new SplashScreen(10000);
    splash.showSplashAndExit();
  }
}
