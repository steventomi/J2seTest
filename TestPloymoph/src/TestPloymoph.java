
public class TestPloymoph {
	public static void main(String [] args){
		Animals a  =  new Dog("dogWang","RED");
		Animals b  =  new Cat("catZhang","black");
		Animals a1 =  new Animals("huihui",12);
	    Cat c = new Cat("guangjie","yellow");
		Girls g1 = new Girls("hongli", 12);
		
		g1.myPetScream(a);
		g1.myPetScream(b);
		g1.myPetScream(a1);
		
		System.out.println(c.getFurColor());
	}
}

class Animals{
	String name;
    static int age;
	
	public Animals(String name, int age){
		this.name = name;
		Animals.age = age;
	}

	public void scream(){
		System.out.println("i am animals AAAAAA");
	}
}

class Dog extends Animals{
	private String eyesColor;
	
	public Dog(String name,String eyesColor ){
		super(name , age);
		this.setEyesColor(eyesColor);
	}

	public String getEyesColor() {
		return eyesColor;
	}

	public void setEyesColor(String eyesColor) {
		this.eyesColor = eyesColor;
	}
	
	public void scream(){
		System.out.println("i am a dog ,ddddd...");
	}
}

class Cat extends Animals{
	private String furColor ;
	
	public Cat(String name, String furColor ){
		super(name, age);
		this.furColor = furColor;
		
	}
	
	public void scream(){
		System.out.println("i am a cat , ccccc");
	}
	
	public String getFurColor(){
		return this.furColor;
	}
}

class Girls{
	String name ;
	int age;
	
	public Girls(String name, int age){
		this.name = name;
		this.age = age;
		
	}
	
	public void myPetScream(Object ob){
		Animals a = (Animals) ob;
		a.scream();
	}
}


/*
java动态绑定 有三个条件 存在继承 子类对父类的方法有重写 基类的引用指向子类对象

基类的引用指向的对象和通过该引用调用的方法 实在java编译时候确定的
*/






