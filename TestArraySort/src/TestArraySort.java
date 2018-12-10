import java.lang.String;

public class TestArraySort {
	public static void main(String [] arg){
	
		int[] a = {12,34,3,54,6,57,5,7,78,8};
		
		String s = new String();
		String s1 = "today";
		
		
		s = "today is black FRIiday";
		
		char c  = s.charAt(4);
		
		System.out.println();
		
				
		Sort.selectionSort(a);
		
		for(int i = 0; i < a.length; i++){
			System.out.println(a[i]);
		}

	}
}

class Sort{
	int number;
	public static void selectionSort(int [] a){
		//number =6;
		for(int i = 0; i < a.length; i++){
			for(int j= i+1; j<a.length; j++){
				if(a[i] > a[j]){
						int temp = a[i];
						a[i] = a[j];
						a[j] = temp;
				}
			}
		}
	}
	//about static https://blog.csdn.net/fengyuzhengfan/article/details/38082999
}