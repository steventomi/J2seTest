
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
		System.out.println(a instanceof Animals);
		
		//System.out.println(a.eyesColor);
		//这是不行的 因为子类的变量对父类的引用是不可见的
		System.out.println(((Dog)a).eyesColor);
		//刚才对eyescolor加了private 所以不可见 ，现在friendly了 且对a进行了对象类型转换；
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
    String eyesColor;
	
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

*/






