import java.awt.*;
public class TestGraphics {
	public static void main(String[] arg){
		new MyFrame().launchMyFrame();
	}
}

class MyFrame extends Frame{
	public void launchMyFrame(){
		this.setBounds(3000, 200, 400, 600);
		this.setVisible(true);
	}
	
	public void paint(Graphics g){
		Color c = g.getColor();
		g.setColor(Color.red);
		g.drawLine(122, 231, 22, 232);
		g.fillOval(234,344, 233, 45);
		g.setColor(Color.blue);
		g.drawRect(100, 34, 345, 345);
		g.setColor(c);
		
	}
}