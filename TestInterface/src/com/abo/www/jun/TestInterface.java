package com.abo.www.jun;
public class TestInterface {
	public static void main(String [] args){
		Student s0 = new Student("junjiang");
		System.out.println("my name is " + s0.getName());
		s0.run();
		s0.sing();
	}
}

interface Singer{
	public  void sing();
	public  void sleep();
}

interface Runner{
	public void run();
	
}
class Student implements Singer,Runner{
	private String name;
	
	public Student(String name){
		this.name = name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public  void sing(){
		System.out.println("i can singing a  song ");
	 }
   
     public void sleep(){
	   System.out.println("sleep");
     }
     
     public void run(){
    	 System.out.println("i am running");
     }
}
/*interface是抽象方法和常量的定义集合
 * 
 * 从本质上讲 接口是一种特殊的抽象类 这种抽象类中只包含了常量和方法的定义 
 * 而没有变量和方法的实现
 * 
 * public static final
 * 
 * 接口可以被多重实现
 * 接口中成员变量默认是 public static final  
 * 接口中的方法只能是抽象的 且是public的
 * 接口可以继承接口 类可以继承类 类只能实现接口
 * 
 */
