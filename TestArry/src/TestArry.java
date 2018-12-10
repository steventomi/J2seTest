
import java.util.Arrays;

public class TestArry {
	public static void main(String [] args){
		Date[] days = new Date[4];
		int j[] ={1,34,56,7};
		System.out.println(j[1]);
		try{
			for(int i = 0; i<days.length;i++){
				days[i] = new Date(1990+i,11,15);
			}
		}catch(Exception ae){
			ae.printStackTrace();
		}
		try{
			for(int i = 0; i<= 3; i++){
				System.out.println(days[i]);
			}
		}catch(Exception ae){
			ae.printStackTrace();
		}
	}
}

class Date{
	int day,month,year;
	
	public Date(int day, int month, int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public String toString(){
		return "date is " + this.year + this.month + this.day;
	}
}