package com.rathod.awt;
import javax.swing.*;
import javax.swing.tree.*;
import java.awt.*;
import java.awt.event.*;

public class TestDTM extends JPanel implements ActionListener 
{
	private DefaultTreeModel dtm;
	private JTree tree;
	private JButton removeButton;

	public TestDTM() 
	{
		setLayout(new BorderLayout());	
		DefaultMutableTreeNode root =  new DefaultMutableTreeNode("My Company");
		DefaultMutableTreeNode fin = new DefaultMutableTreeNode("Finance");
		DefaultMutableTreeNode acc =  new DefaultMutableTreeNode("Accounting");
		DefaultMutableTreeNode res =   new DefaultMutableTreeNode("Research");
		DefaultMutableTreeNode Bob =  new DefaultMutableTreeNode("Bob Wood");
		DefaultMutableTreeNode Sue = new DefaultMutableTreeNode("Sue Mi");
		DefaultMutableTreeNode Joe =  new DefaultMutableTreeNode("Joe King");
		DefaultMutableTreeNode Moe = new DefaultMutableTreeNode("Moe Knee");
		
		dtm = new DefaultTreeModel(root);
		dtm.insertNodeInto(fin, root, 0);
		dtm.insertNodeInto(acc, root, 1);
		dtm.insertNodeInto(res, root, 2);
		dtm.insertNodeInto(Bob, fin, 0);
		dtm.insertNodeInto(Sue, fin, 1);
		dtm.insertNodeInto(Joe, fin, 2);
		dtm.insertNodeInto(Moe, acc, 0);

		tree = new JTree(dtm);
		tree.setShowsRootHandles(true);
		tree.setSelectionRow(1);

	removeButton = new JButton("Remove");
removeButton.setBorder(BorderFactory.createRaisedBevelBorder());
		removeButton.addActionListener(this);
		
		add(removeButton,BorderLayout.SOUTH);
		add(new JScrollPane(tree), BorderLayout.CENTER);
	}

	public void actionPerformed(ActionEvent ae) 
	{
		TreePath path = tree.getSelectionPath();
		DefaultMutableTreeNode node = (DefaultMutableTreeNode) path.getLastPathComponent();
		
		if (!node.isRoot()) 
		{
			dtm.removeNodeFromParent(node);
		} 
	} 

	public static void main(String args[])
	{
		JFrame f=new JFrame("Vedisoft : TestDTM");
		f.setContentPane(new TestDTM());
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
