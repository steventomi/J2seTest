//import java.*;
public class TestArray1 {
	public static void main(String [] arg){
		int [] a = {12,23,43,5,64,6,57,67,33};
		
		Selectionsort(a);
		
		for(int j = 0; j<a.length ; j++){
			System.out.println(a[j]);
		}
	}
		
		public static void Selectionsort(int [] a){
			for(int i = 0; i<a.length;i++ ){
				for(int j = i+1; j< a.length;j++){
					if(a[i]>a[j]){
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					}
				}
				
			}
			
		}

	
}

//java 中数组是对象 放在堆上

