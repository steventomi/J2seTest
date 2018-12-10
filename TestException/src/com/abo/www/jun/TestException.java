package com.abo.www.jun;

public class TestException {
	public static void main(String[] args){
		try{
			int[] a ={1,3,4};
			System.out.println(a[3]);
		}catch(Exception ae){
			ae.printStackTrace();
		}finally{
			System.out.println("dddd\n");		
		  }
		
		try{
			int i = 1/0;
		}catch(ArithmeticException ae){
			ae.printStackTrace();
			ae.getLocalizedMessage();
		}
	}
}
/*java异常是java提供的用于处理程序中错误的一种机制
 * 所谓的错误是指运行过程中发生的额一些异常
 * 
 * Throwable subclass Error  Exception
 * exception subclass RuntimeException
 *
 */
 