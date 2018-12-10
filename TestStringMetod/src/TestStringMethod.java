
public class TestStringMethod {
	public static void main(String [] args){
		String s ="jaingJJSADjingjunjiangjunF./SDAF/AS....SDjjkxkah";
		int lowerC = 0;
		int upperC = 0;
		int otherC = 0;
		String s1 = new String();
		s1 = "this is String class test.";
		String s2 ;
		
		s2 = s1.toUpperCase().concat(s.toUpperCase());
		
		
		for(int i = 0; i < s.length(); i++){
			char c = s.charAt(i);
			if(Character.isLowerCase(c)){
				lowerC++;
			}if(Character.isUpperCase(c)){
				upperC++;
			}else{
				otherC++;
			}
			
		}
		
		System.out.println("lower char is " + lowerC);
		System.out.println(s2);
		System.out.println(s2.compareTo(s));
	}


}
