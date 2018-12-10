
public class TestArrayParser {
	public static void main(String [] arf){
		String s = "1,2;3,4,5;6,7,8";
		
		String [] sArray = s.split(";");
		Double[][] d;
		
		d = new Double[sArray.length][];
		
		for(int i = 0 ; i < sArray.length;i++ ){
			//System.out.println(sArray[i]);
			String[] sArray1 = sArray[i].split(",");
			 
			d[i] = new Double[sArray1.length];
					
			for(int j = 0; j < sArray1.length; j++){
				//System.out.println(sArray1[j]);
				
				d[i][j] = Double.parseDouble(sArray1[j]);
				
			}
		}
		
		for(int i = 0; i < d.length;i++){
			for(int j = 0; j < d[i].length; j++){
				System.out.print(d[i][j] + " ");
			}
			
			System.out.println();
			
		}
	}
}
