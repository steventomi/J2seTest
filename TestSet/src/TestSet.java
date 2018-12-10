import java.util.*;
public class TestSet {
	public static void main(String [] arg){
		Collection cSet0 = new HashSet();
		Collection cSet1 = new HashSet();
		
		cSet0.add("a");cSet0.add("b");cSet0.add("c");cSet0.add("a");
		cSet1.add("d");cSet1.add("a");cSet1.add("e");
		
		System.out.println(cSet0);
		System.out.println(cSet1);
		
		System.out.println(cSet0.size());
		
		Set cSet2 = new HashSet(cSet0);
		
		cSet0.addAll(cSet1);
		System.out.println(cSet0);
		
		cSet0.retainAll(cSet1);
		System.out.println(cSet0);
		
		cSet0.clear();
		System.out.println(cSet0);
		
		System.out.println(cSet2.retainAll(cSet1));
	}

}
