
public class TestMethodDemo {
	public static void main(String [] args){
		m(3);
		System.out.println(m2(2,3));
		System.out.println(m3(4,6));
	}
	
	 static void m(int i){
		System.out.println("i=" + i);	
	}
	 
	 static int m2(int i, int j){
		 return  i + j;
	 }
	 
	 static int m3(int i, int j){
		 return i>j?i:j;
	 }
}
