//import java.math.*;
public class TestPoint {
	public static void main(String [] args){
		Point p1 = new Point(1,2,3);
		Point p2 = new Point(2,4,5);
		p1.display();
		p1.getDistance(p1);
		p1.getDistance(p2, p1);
		
	}
}

class Point{
	int x,y,z;
	
	Point(int x , int y, int z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	int getX(){
		return x;
	}
	int getZ(){
		return z;
	}
	int getY(){
		return y;
	}
	void setX(int x){
		this.x = x;
	}
	void setY(int y){
		this.y = y;
	}
	void setZ(int z){
		this.z = z;
	}
	
	void getDistance(Point p){
		//Math math = new Math();
		System.out.println( Math.sqrt(p.x*p.x + p.y*p.y + p.z*p.z));
	}
	
	void getDistance(Point p, Point p1){
		System.out.println( Math.sqrt((p.x - p1.x)*(p.x - p1.x) + (p.y - p1.y)*(p.y - p1.y) + (p.z - p1.z)*(p.z - p1.z)));
	}
	void display(){
		System.out.println("x=" + x +"\ny="+y+"\nz="+z);
	}
}






