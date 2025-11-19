import java.awt.*;
import java.awt.event.*;
class Lab8P1 extends Frame implements ActionListener{
Label label;

	Lab8P1(){
		super("Demonstrotion of MenuBar");
		MenuBar mb = new MenuBar();
		setMenuBar(mb);
		BorderLayout bl = new BorderLayout();
		setLayout(bl);
		
		label = new label();
		label.setFont(new Font("Arial",Font.BOLD,40));
		label.setAlignment(Left.CENTER);//label.setBounds(10,10,100,500);
		add(label);
		
		Menu file = new Menu("File");
		
		String[] menus ={"File","Edit","Help"};
		String[][] file = {
			{"Open","Save","Close"},
			{"cut","copy","paste"},	
			{"About","Update","License"},
		};
		int x = 0,y = 0;
		for(String s : menus){
			y=0;
			Menu m = new Menu(s);
			for(int i=0;i<3;i++){
				MenuItem mmi = new MenuItem(mi[x][y]);
				mmi.addItemListener(this);
				m.add(mmi);
				y++;
				}
				x++;
				mb.add(m);
			s = s.toLowerCase();
			for(String ms : s){ 
			m.add(new MenuItem(ms));
			}
			mb.add(m);
		}
		
		setSize(500,400);
		setVisible(true);
		addWindowListener(
			new WindowAdapter() {
				public void windowClosing(WindowEvent we){
					dispose();
				}
			});
		
	public void actionPerformed(ActionEvent ae){
		String mstr = ae.getCommand();
		if(mstr.equals("Close"));{
			System.exit(0);
		}
		}
		}
		
		
public static void main(String...args){
		Lab8P1();
}
		

			
			
					
				
