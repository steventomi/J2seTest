import java.util.*;
public class TestCollection {
	public static void main(String [] args){
		Collection c = new HashSet();
		
		
		c.add("Hello");
		c.add(new String("jiangjun"));
		c.add(new Integer(100));
		
		//只能添加对象 不能添加基本数据类型 c.add（int i = 5）这是不可以
		c.add(new Name("jun","jiang"));
		//为何刚才 打印出来的是[jiangjun, 100, Name@7852e922] 应为print（c）是
		//调用c集合里面每一个对象的toString方法 而Object里的toStirng方法就是getClass().getName() + "@" + get.....
		//所以一定要在Name这个类里面重写 equils（）这个方法也是额
		System.out.println(c.size());
		// 打印该集合的元素个数
		System.out.println(c);
		//调用了 c的tosString 方法 其实现类型为【ele0， ele1】
		System.out.println(c.isEmpty());
		
		c.remove("Hello");
		System.out.println(c);
		//移除这个对象 调用equals 比较 
		
		c.remove(new Name("jun","jiang"));
		System.out.println(c);
		//为何没有移除  因为25行 和11行 里添加的是两个不同对象 
		//内部操作做时候 用equals（）比较
		//所以要重写 object 里equals（）
		System.out.println(c.iterator());
		//打印出来的是java.util.ArrayList$Itr@7852e922
		Iterator i = c.iterator();
		/*while(i.hasNext()){
			Object ob = i.next();
			System.out.println(ob);
			//c.iterator().next();
		}*/
		
		Collection<Name> cIterator = new HashSet<Name>();
		
		cIterator.add(new Name("san0","zhang"));
		cIterator.add(new Name("sa","zhang"));
		cIterator.add(new Name("san2","zhang"));
		cIterator.add(new Name("san3","zhang"));
		
		
		
		Iterator i1 = cIterator.iterator();
		while(i1.hasNext()){
			Object name = i1.next();
			System.out.println(name);
		}
		
		System.out.println("\n");
		
		Iterator i2 = cIterator.iterator();
		while(i2.hasNext()){
			Name name = (Name)i2.next();
			
			//System.out.print(name.getFirstName());
			if(name.getName().equals("zhangsa")){
				i2.remove();
			}
			System.out.println(name);
		}
		System.out.println(cIterator);
		
		for(Object ob : cIterator){
			System.out.println(ob);
		}
		
		/*
		 * 集合框架iterator 迭代器 用于遍历集合元素 获取迭代器可以使用Collection定义的方法 iterator（Itterator）
		 * 迭代器是一个接口 集合在重写collection的iterator（）的方法时候利用了内部类提供了迭代的实现
		 * Iterator提供了统一的遍历元素的方法 其提供了用于遍历集合的方法 一半和while（）使用
		 * boolean hasNext（）；判断集合是否还有元素可以遍历
		 *  E next（） 返回迭代器杠杆越过的元素的引用 返回值是object 需要强制转换成自己需要的类型
		 *  void remove（） 删除迭代器刚刚越过的元素
		 *  
		 *  更多参考https://blog.csdn.net/zsp151296/article/details/76714137
		 */

		/*这是不可以的 死循环 
		 * while(cIterator.iterator().hasNext()){
			Name name = (Name)cTterator.iterator().next();
			System.out.println(name.getFirstName());
		}
		  
		 */
		 
	
	
	}
}
