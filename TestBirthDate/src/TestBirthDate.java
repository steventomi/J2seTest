
public class TestBirthDate {
	public static void main(String []  arg){
		BirthDate bd = new BirthDate(12,22,1990);
		TestBirthDate tbd = new TestBirthDate();
		bd.setMonth(11);
		bd.display();
		tbd.changeBirthDate(bd);
		tbd.changeDay(bd);
		bd.display();
	}
	
	void changeDay(BirthDate bd){
		bd = new BirthDate(15,12,1990);
	}
	
	void changeBirthDate(BirthDate bd){
		bd.setDate(13);
		bd.setYear(1992);
	}

}

 class BirthDate{//加了public 后要单独放到一个文件 要理解权限
	 int day;
	 int month;
	 int year;
	 
	 BirthDate(int day, int month, int year){
		 this.day = day;
		 this.month = month;
		 this.year = year;
	 }
	 
	 void setDate(int day){
		 this.day = day;
	 }
	 
	 void setMonth(int month){
		 this.month = month;
	 }
	 
	 void setYear(int year){
		 this.year = year;
	 }
	 
	 int getDay(){
		 return day;
	 }
	 
	 int getMonth(){
		 return month;
	 }
	 
	 int getYear(){
		 return year;
	 }
	 
	 void display(){
		 System.out.println("birthday is:"+ day+"."+month +"."+ year);
	 }
 }
