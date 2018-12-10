import java.awt.*;
import java.awt.event.*;
public class PlusCal {
	public static void main(String [] args){
		new MyPlusCalFrame().Launch();
	}
}


class MyPlusCalFrame extends Frame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	    TextField tf1,tf2,tf3;
	public void Launch(){
		 tf1 = new TextField(10);
		 tf2 = new TextField(10);
		 tf3 = new TextField(10);
		Label lbPlus = new Label("+");
		Button lbEqual = new Button("=");
//		this.setSize(900,50);
//		tf1.setSize(250,50);
//		tf2.setSize(250,50);
//		tf3.setSize(250,50);
		this.setLayout(new FlowLayout());
		lbEqual.addActionListener(new ActionListener( ){
			public void actionPerformed(ActionEvent a){
				int n1 = Integer.parseInt(tf1.getText());
				int n2 = Integer.parseInt(tf2.getText());
				//int n3 = n1 + n2;
				tf3.setText("" + (n1 +n2));}
		});
		this.setVisible(true);
		this.add(tf1);
		this.add(lbPlus);
		this.add(tf2);
		this.add(lbEqual);
		this.add(tf3);
		this.pack();
		this.setVisible(true);
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				setVisible(true);
				System.exit(-1);
			}
		});
		
	}
	
}

//class MonitorPlus implements ActionListener{
//	MyPlusCalFrame mpc;
//	public MonitorPlus(MyPlusCalFrame mpc){
//		this.mpc = mpc;
//		
//	}
//	public void actionPerformed(ActionEvent a){
//		int n1 = Integer.parseInt(mpc.tf1.getText());
//		int n2 = Integer.parseInt(mpc.tf2.getText());
//		//int n3 = n1 + n2;
//		mpc.tf3.setText("" + (n1 +n2));
//	}
//	
//}
