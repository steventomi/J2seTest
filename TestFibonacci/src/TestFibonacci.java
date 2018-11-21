
public class TestFibonacci {
	public static void main(String []  args){
		System.out.println(testFibo(20));
	}
	
	static int  testFibo(int i){
		if(i ==1 || i== 2){
			return 1;
		}else{
			return testFibo(i- 1) +testFibo(i - 2 );
		}
			
			
	}
}
//尝试用非递归方式 解决fibonacci数列