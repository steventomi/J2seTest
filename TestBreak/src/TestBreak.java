
public class TestBreak {
	public static void main(String[] args){
		int stop = 5;
		int skip = 2;
		for(int i = 1; i<=10; i++){
			if(i == skip) continue;
			if(i == stop) break;
			System.out.println(i);
		}
		int i = 1;
		String weekDay ;
		
		switch (i){
		case 1 : weekDay = "monday"; break;
		case 2 : weekDay = "monday"; break;
		case 3 : weekDay = "monday"; break;
		case 4 : weekDay = "monday"; break;
		case 5 : weekDay = "monday"; break;
		default: weekDay = "Invaild weekday "; break;
		}
		System.out.println(weekDay);
		
	}
}
