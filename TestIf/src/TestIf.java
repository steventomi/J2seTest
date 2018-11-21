
public class TestIf {
	public static void main(String [] args){
		int result = 0;
		
		for( int i = 1; i <=100 ;i++){
		//result +=result;
		//result++;
		
			result = i + result;
			System.out.println(result);
		}
		
		if(result != 5050){
			System.out.println("the answer is worng");
		}else{
			System.out.println("thats right, its 5050");
		}
		
	}
}
