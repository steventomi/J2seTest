import java.util.*;
import java.lang.*;
public class TestMap {
	public static void main(String [] arg){
		Map<Integer, String> mp = new TreeMap<Integer, String>();
		Map<Integer,String> mp1 = new TreeMap<Integer, String>();
		
		mp.put(new Integer(5), new String("jiangjun"));
		mp.put(new Integer(6), new String("zhang san"));
		
		System.out.println(mp);
		
		String s1 =  new String("jiang");
		mp1.put(1, "wang wu");
		mp1.put(2, "liu sun");
		mp1.put(3, "tomi ");
		mp1.put(4,s1);
		
		System.out.println(mp1);
		
		String s  = mp1.get(1);
		//注意get（）；返回的值 是object 
		//用了泛形后 就不用强制类型转换
		System.out.println(s);
		
		mp.putAll(mp1);
		System.out.println(mp);
		/*key是不能重复的  所以刚才
		 * mp.put(new Integer（1), new String("jiangjun"));
		 *mp.put(new Integer(2), new String("zhang san"));
		 *调用mp1.mp();是不行的
		 */
		Object k = mp1.containsKey(4);
		System.out.println(k);
		
		boolean b = (boolean)mp.containsValue("jiangjun");
		System.out.println(b);
		
		System.out.println("the treemap of mp is empty ? "+mp.isEmpty());
		
		mp.clear();
		System.out.println("the treemap of mp is or not empty after use clear? "+mp.isEmpty());
		
	}
}
/*map里 key 和 value 必须是new出来的对象或者对象的引用  所以在获取value时候返回值是object 具体是那个类 具体定
*/