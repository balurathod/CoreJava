import javax.swing.*;
import javax.swing.tree.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class TestJTree extends JPanel  implements TreeSelectionListener 
{
	private JTree tree;
	private JTextField jtf;

	public TestJTree() 
	{
		jtf = new JTextField(15);
		jtf.setEditable(false);
		DefaultMutableTreeNode root =  new DefaultMutableTreeNode("My Company");
		DefaultMutableTreeNode fin = new DefaultMutableTreeNode("Finance");
		DefaultMutableTreeNode acc =  new DefaultMutableTreeNode("Accounting");
		DefaultMutableTreeNode res =   new DefaultMutableTreeNode("Research");
		DefaultMutableTreeNode Bob =  new DefaultMutableTreeNode("Bob Wood");
		DefaultMutableTreeNode Sue = new DefaultMutableTreeNode("Sue Mi");
		DefaultMutableTreeNode Joe =  new DefaultMutableTreeNode("Joe King");
		DefaultMutableTreeNode Moe = new DefaultMutableTreeNode("Moe Knee");
		
		DefaultTreeModel dtm = new DefaultTreeModel(root);
		dtm.insertNodeInto(fin, root, 0);
		dtm.insertNodeInto(acc, root, 1);
		dtm.insertNodeInto(res, root, 2);
		dtm.insertNodeInto(Bob, fin, 0);
		dtm.insertNodeInto(Sue, fin, 1);
		dtm.insertNodeInto(Joe, fin, 2);
		dtm.insertNodeInto(Moe, acc, 0);

		tree = new JTree(dtm);
		tree.setShowsRootHandles(false);
		tree.expandRow(0);

		tree.addTreeSelectionListener(this);
		add(new JScrollPane(tree), BorderLayout.CENTER);
		add(jtf, BorderLayout.SOUTH);

	}

	public void valueChanged(TreeSelectionEvent tse) 
	{

	DefaultMutableTreeNode dmtn = (DefaultMutableTreeNode) tree.getLastSelectedPathComponent();
	String name = (String) dmtn.getUserObject();
	jtf.setText("name is: " + name);
	jtf.setForeground(Color.black);
	} 

	public static void main(String args[])
	{
		JFrame f=new JFrame("TestJTree:");
		f.setContentPane(new TestJTree());
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
