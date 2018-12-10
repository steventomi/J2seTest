import java.lang.*;
import java.util.*;
public class TestThreadSleep {
	public static void main(String [] args){
		CountdownThread ct = new CountdownThread();
		Thread t = new Thread(ct);
		t.start();
		try{
			Thread.sleep(10000);
		}catch(InterruptedException ae){
			//ct.flag = false;
			ae.printStackTrace();
		}
		ct.flag =false;
		
	}
}

class CountdownThread implements Runnable{
	boolean flag = true;
	public void run(){
		while(flag){
			System.out.println(">>>>>" + new Date() +"<<<<<<");
			try{
				Thread.sleep(1000);
			}catch(InterruptedException ae){
				return;
			}

		}
	}
}