import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class TableDemo extends JFrame{
	Label l;
	TableDemo(){	
		super("JTableDemo Demo");
		String[] heading = {"Name","Course","RollNo"};

		String[][] data = {
			{"DELL","CSE","123456"},
			{"BELL","CSD","214152"},
			{"CELL","CSM","8475984"},
			{"YELL","CSIT","1527482"},
		};

		JTable jt = new JTable(data,heading);
		JScrollPane jsp = new JScrollPane(jt);
		jsp.add(jt);

		add(jt);

		setVisible(true);
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String...args){
		new TableDemo();
	}
}