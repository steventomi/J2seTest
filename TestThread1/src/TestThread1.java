import java.lang.*;
public class TestThread1 {
	public static void main(String [] args) {
		ThreadTestRunner tr = new ThreadTestRunner();
		ThreadTestRunner1 tr1 = new ThreadTestRunner1();
		//tr.run();这个是方法的调用 还是一个执行路径 这个执行完了在执行下面的
		Thread t = new Thread(tr);
		//Thread t1 = new Thread(tr1);
		//创建线程对象 把实现了runnable接口的方法的类的实例作为参数
		t.start();
		try{
		Thread.sleep(2000);
		}catch(InterruptedException ae){
			ae.printStackTrace();	
		}
		tr1.start();
		//thread里的启动线程方法
		for(int i = 0; i<=30; i++){
			System.out.println("Main Thread ..... " + i);
		}
	}
}

class ThreadTestRunner implements Runnable{
	public void run(){
		int i ;
		for( i = 0; i  <= 30; i++){
			System.out.println("Threadtestrunner thread....." + i);
			
		}
	}
}

class ThreadTestRunner1 extends Thread{
	public void run(){
		int i ;
		for( i = 0; i  <= 30; i++){
			System.out.println("Threadtestrunner thread 1 ....." + i);
		}
	}
}