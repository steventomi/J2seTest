package com.abo.www.cs.jiangun;

public class TestInherit {
	public static void main(String [] args){
		//System.out.println("jj");
		Animals dog = new Dog(12,"inty");
		dog.animalsScream();
		Animals dog1 = new Dog(12,"inty");
		System.out.println(dog.age);
		((Dog)dog).changeAge(16);//为何不行
		System.out.println(dog.age);
		System.out.println(dog.toString());
		System.out.println(dog.equals(dog1));
		try{
			dog.notify();
		}catch(Exception ae){
			
		}
	}
}

class Animals{
	int age;
	String name;
	
	Animals(){
		
	}
	
	Animals(int age, String name){
		this.age  = age;
		this.name  = name;
	}
	
	void animalsScream(){
		System.out.println("i am a best, AAAAA");
	}
	
	void animalsEating(){
		System.out.println("i am eating now , dont trouble me AAA");
	}
}

class Dog extends Animals{
	String color ;
	
	public String toString(){
		return "this is dog";
	}
	
	Dog(int age , String name){
		//super(age, name);
		super.age = age;
		super.name = name;
	}
	
	void animalsScream(){
		System.out.println("i am a dog  DDDD");
	}
	
	void changeAge(int age){
		super.age = age;
	}
	
}