
public class TestThreadSyn implements Runnable {
	Timer t  = new Timer();
	public static void main(String [] args){
		TestThreadSyn test = new TestThreadSyn();
		Thread t1 = new Thread(test);
		Thread t2 = new Thread(test);
		t1.setName("thread1");
		t2.setName("Thread2");
		t1.start();
		//System.out.print(Timer.num);
		t2.start();
		
		//System.out.println(Timer.num);
	}
	public void run(){
		
		t.add(Thread.currentThread().getName());
		//System.out.println(Timer.num);
	}
   
}
 
class Timer{
	public static int num = 0;
	public synchronized void add(String name){
		//synchronized(this){
		num++;
		try{
			Thread.sleep(0);
		}catch(InterruptedException ae){
			ae.printStackTrace();
		}
		
		System.out.println(name + " 你是第 " + num + " 个使用timer的线程");
		
		//}
	}
}