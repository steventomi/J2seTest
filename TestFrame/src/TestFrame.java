import java.awt.*;
import java.awt.event.*;

public class TestFrame {
	public static void main(String [] args){
		Frame f = new Frame("Test of actionlister");
		Button b1 = new Button("try to press me");
		Button b2 = new Button("exit");
		TextField tf = new TextField(" input");
		
		b1.setSize(120,120);
		b2.setSize(120,124);
		tf.setSize(120,23);
		f.add(tf,BorderLayout.AFTER_LAST_LINE);
		f.add(b1,BorderLayout.CENTER);
		f.add(b2,BorderLayout.AFTER_LINE_ENDS);
		b1.setActionCommand("this is b1 button");
		
		b1.addActionListener(new Monitor());
		
		b2.addActionListener(new FrameExit());
		f.setSize(250,250);
		f.setVisible(true);
		
	}
		
	
}

class Monitor implements ActionListener{

	public void actionPerformed(ActionEvent ae){
		System.out.println("a button has been pressed" + ae.getActionCommand());
		ae.getActionCommand();

	}
}

class TextFiledTest implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		e.getSource();
		
	}
	
}
class FrameExit implements ActionListener{
	public void actionPerformed(ActionEvent a){
		System.exit(0);
	}
}
