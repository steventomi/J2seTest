
public class TestSynchtonied {
	public static void main(String [] args){
		TT t = new TT();
		Thread thread = new Thread(t);
		thread.start();
		
		//Thread.currentThread().setPriority(2);
		try{
			Thread.sleep(1000);
		}catch(InterruptedException ae){
			ae.printStackTrace();
		}
		t.m2(); 
	}
}

class TT implements Runnable {
	int b = 100;
	
	public void run(){
		Thread.currentThread().setPriority(10);
		try{
			m1();
		}catch(Exception ae){
			ae.printStackTrace();
		}
	}
	
	public synchronized void m1(){
		b = 1000;
		try{
			Thread.sleep(5000);
		}catch(Exception ae){
			ae.printStackTrace();			
		}
		System.out.println("b = " + b);
	}
	
	public void m2(){
		b = 2000;
		System.out.println(b);
	}
}