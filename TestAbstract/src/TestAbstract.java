
public class TestAbstract {
	public static void main(String [] args){
		//Animals a  = new Animals();
		//this is wrong , abstract class can not be instance
		Person p0 =  new Person("sanzhang",340811);
		System.out.println("this person name is " + p0.printName() );
		p0.getName();
		
	}
}


abstract class Animals{
	String name;
	int age;
	final int dna = 454545;
	
	abstract public void eatFood();
	
	String printName(){
		return this.name;
	}
	
	
}

class Person extends Animals{
	String weight, height;
	int id;
	// final int dna;  final should be initialized;
	final int dna = 2434;
	
	public Person(String name, int id){
		super();
		this.name = name;
		this.id = id;
	}
	
	public void eatFood(){
		System.out.println("i am eating food with chopsticks");
	}
	
	public void getName(){
		System.out.println(this.name);
	}
}
/*抽象方法就是用来重写的 
 * abstract 添加在类和方法前面 表示该类和方法是抽象的
 * 含有抽象类的方法必须声明为抽象类
 * 抽象类必须被继承
 * 抽象类不能被实例华
 * 抽象方法只要声明不需要实现
 * 
 * final变量值需要initialized 且只可以读不可以写  
 * final 的方法不能被重写
 * final的类不能被inherit 
 * 
 */
 