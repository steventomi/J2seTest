
public class TestStringBuffer {
	public static void main(String[] arg){
		String s ="this is a test demo of stringbuffer";
		StringBuffer sb0 = new StringBuffer(s);
		Double d = new Double(12);
		
		System.out.println(sb0.append("!"));//在sb0后添加 字符去 和其他的类型数据
		System.out.println(sb0.append(s));
		
		System.out.println(sb0.delete(s.length(), 2*s.length()+1));
		
		System.out.println(sb0.toString());
		
		System.out.println(sb0.reverse());
		
		//System.out.print();
		
	}

}
/*
 * Integer  Float Charter 
 */