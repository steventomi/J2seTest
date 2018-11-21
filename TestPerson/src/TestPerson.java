
public class TestPerson {
	int age;
	int id;
	String  name;
	
	TestPerson(int ag ,String name){
		this.age = ag;
		//name = this.name;
		//this 表示该方法对象本身的引用
	}
	
	
	public static void main(String [] arg){

		TestPerson  tom = new TestPerson(15,"tomg");
		System.out.println(tom.age);
	}

}
