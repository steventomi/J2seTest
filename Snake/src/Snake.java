import java.awt.Color;
import java.awt.Graphics;

public class Snake {
	private Node head = null;
	private Node tail = null;
	int size = 0 ;
	Dire dir = Dire.L;
	
	private Node n = new Node(20,30,Dire.L);
	
//	public Snake(Node node){
//		head = node;
//		tail = node;
//		size = 1;
//	}
	
	public Snake(){
		head = n;
		tail = n;
		size = 1;
	}
	
	public void addToTail(){
		Node node = null;
		switch(tail.dir){
		case L:
			node = new Node(tail.row,tail.col + 1,tail.dir);break;
		case U:
			node = new Node(tail.row + 1,tail.col,tail.dir);break;
		case R:
			node = new Node(tail.row ,tail.col - 1,tail.dir);break;
		case D:
			node = new Node(tail.row - 1,tail.col  ,tail.dir);break;
		}
		tail.next = node;
		tail = node;
		size++;
	}
	
	public void addToHead(){
		Node node = null;
		switch(head.dir){
			case L:
				node = new Node(head.row,head.col - 1,head.dir);break;
			case U:
				node = new Node(head.row - 1,head.col ,head.dir);break;
			case R:
				node = new Node(head.row,head.col + 1,head.dir);break;
			case D:
				node = new Node(head.row + 1,head.col ,head.dir);break;
				
		}
		
		head.next = node;
		head = node;
		size ++;
	}
	
	public void draw(Graphics g){
		if(size <= 0)
			return;
		for(Node n  = head ; n != null; n =n.next){
			n.draw(g);
		}
	}

	private class Node{
		int w = Yard.BLOCK_SIZE; 
		int height = Yard.BLOCK_SIZE;
		int row, col;
		Dire dir = Dire.L;
		Node next = null;
		
		public Node(int row, int col,Dire dir) {
			super();
			this.row = row;
			this.col = col;
			this.dir = dir;
		}
		
		void draw(Graphics g){
			Color c = g.getColor();
			g.setColor(Color.black);
			g.fillRect(Yard.BLOCK_SIZE*row, Yard.BLOCK_SIZE*col,w , height);
			g.setColor(c);
		}
		
	}

}
