import javax.swing.*;
import javax.swing.tree.*;
import java.awt.*;
import java.awt.event.*;

public class TestDMN extends JPanel
{
	private JTree tree;

	public TestDMN() 
	{
		DefaultMutableTreeNode root =  new DefaultMutableTreeNode("My Company");
		DefaultMutableTreeNode fin = new DefaultMutableTreeNode("Finance");
		DefaultMutableTreeNode acc =  new DefaultMutableTreeNode("Accounting");
		DefaultMutableTreeNode res =   new DefaultMutableTreeNode("Research");
		DefaultMutableTreeNode Bob =  new DefaultMutableTreeNode("Bob Wood");
		DefaultMutableTreeNode Sue = new DefaultMutableTreeNode("Sue Mi");
		DefaultMutableTreeNode Joe =  new DefaultMutableTreeNode("Joe King");
		DefaultMutableTreeNode Moe = new DefaultMutableTreeNode("Moe Knee");

		root.add(fin);
		root.add(acc);
		root.add(res);
		fin.add(Bob);
		fin.add(Sue);
		fin.add(Joe);
		acc.add(Moe);

		DefaultTreeModel dtm = new DefaultTreeModel(root);
		tree = new JTree(dtm);
		tree.setShowsRootHandles(true);
		TreePath t1 = new TreePath(Sue);
		tree.expandPath(t1);
		add(new JScrollPane(tree), BorderLayout.CENTER);
	}

	public static void main(String args[])
	{
		JFrame f=new JFrame("TestDMN:");
		f.setContentPane(new TestDMN());
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
