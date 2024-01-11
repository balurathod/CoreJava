package com.rathod.awt;
//  RoundedLineBorder.java
// A simple demontstration of the LineBorder class built with rounded
// corners.
//
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class RoundedLineBorder extends JPanel {

    public RoundedLineBorder() {
        super(true);
	setLayout(new BorderLayout());

        JLabel label = new JLabel("Rounded Corners");

        label.setHorizontalAlignment(JLabel.CENTER);

	LineBorder line = new LineBorder(Color.blue, 2, true);

        label.setBorder(line);

        add(label, BorderLayout.CENTER);
    }

    public static void main(String s[]) {
         JFrame frame = new JFrame("Rounded Line Border");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setSize(500, 200);
         frame.setContentPane(new RoundedLineBorder());
         frame.setVisible(true);
    }
}
