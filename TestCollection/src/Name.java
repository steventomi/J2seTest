
public class Name {
	private String firstName, lastName;
	
	public Name(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	
	public String getName(){
		return this.lastName + this.firstName;
	}

	public String getFirstName(){
		return  this.firstName;
	}
	
	public String  getLastName(){
		return "Last name is : " + this.lastName;
	}
	
	public String toString(){
		return this.lastName +  this.firstName;
	}
	//注意 ⚠️自己定义一个类 时候一定要注意重写object里的toString和equails（）方法
	
	public boolean equals(Object ob){
		if(ob instanceof Name){
			Name obn = (Name)ob;
			//继承中 父类对象向下转换后 就能访问该类的成员变量和方法
			if(this.firstName == obn.firstName && this.lastName == obn.lastName ){
				return true;
			}
		}else
			return false;
		return false;
	}
}
