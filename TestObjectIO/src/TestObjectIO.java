import java.io.*;
public class TestObjectIO {
	public static void main(String [] args){
		Employeree emp1 = new Employeree("jun","jiang");
		Employeree emp2 = new Employeree("Jimmy","liu");
		emp2.age = 45;
		
		try{
			FileOutputStream fos = new FileOutputStream("Tomi:\\User\\jiangjun\\ObjectIOtest.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			//BufferedOutputStream bos = new BufferedOutputStream(oos);
			//oos.writeObject(new Employeree("san","zhang"));
			oos.writeObject(emp2);
			oos.flush();
			oos.close();
		}catch(IOException ae){
			ae.printStackTrace();
			System.out.println("can not found the file.......");
		}
		
		try{
			FileInputStream fis = new FileInputStream("Tomi:\\User\\jiangjun\\ObjectIOtest.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			try{
				Object ob = ois.readObject();
				System.out.println(ob);
				ois.close();
				}catch(ClassNotFoundException ae){
				ae.printStackTrace();
			}
		}catch(IOException ae){
			ae.printStackTrace();
		}

	}
}

class Employeree implements Serializable{//需要序列化的类 需要implements serializable interface
	String firstName;
	String lastName;
	transient int age;//transient关键词修饰后是透明的 
	
    public Employeree(String firstName , String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
    public String toString(){
    	return this.firstName + this.lastName + "age is " +this.age;
    }
}