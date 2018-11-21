package com.abo.www;

public class TestConvert {
	public static void main(String [] args){
		int i0 =  123;
		int i1 = 234;
		double d1, d0 = i0 + i1;
		System.out.print(d0);
		d1 =  1234;
		float f0 = (float)(d1 + d0);
		System.out.println("\n d0 + d1 = " + f0);
		byte b0 = 21;
		byte b1 = 127;
		byte b3 =(byte)(b0 +b1);
		System.out.println(b3);
		float f1 = 8123.33f;
		System.out.println((int)f1);
		
	}
}
/*
 * byte short chat - int - long - float - double
 * 
  */
