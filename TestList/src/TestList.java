import java.util.*;
public class TestList {
	public static void main(String[] arg){
		List list1 = new LinkedList();
		Collection list2 = new LinkedList();
		
		for(int i = 0 ; i <= 9 ; i++){
			list1.add("a"+i);
			list2.add("b"+i);
		}
		
		System.out.println("list1 初始状态 >>>" + list1);
		
		list1.add(4,"b5");
		((List)list2).add(4,"a3");
		//list2.add(4,"a5");
		/*这个是不行的 无法执行 因为list2是collection类型引用 
		 * 当他指向linklist的对象时候 用父类的引用无法调用子类特有的方法和变量
		 * add（int index， E ele）；是对add（E e）；的重载入
		 */
		System.out.println("list1 在第五位添加一个元素后>>>"+ list1);
		System.out.println("list2 在第五位添加一个元素后>>>"+ list2);
		
		list1.remove(4);
	    extracted(list1);
	    Collections.reverse(list1);
	    System.out.println("list1倒序排列>>>> " + list1);
	    try{
	    Collections.reverse(list1);
	    System.out.println( list1);
	    int i =   Collections.binarySearch(list1, "a3");
	    System.out.println("a3在list1中的位置 >>>"+ ++i);
	    }catch(Exception ae){
	    	ae.printStackTrace();
	    }
	}

	private static void extracted(List list1) {
		Collections.sort(list1);
	}
}
