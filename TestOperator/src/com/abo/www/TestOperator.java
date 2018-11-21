package com.abo.www;
public class TestOperator {
	public static void main(String[] args){
		int i0 = 20, i1 = 20;
		int i = i0++;
		i += i0;
		System.out.print("i = "+ i+ "\ni0 ="+ i0);
		String type = i1<60?"bujige":"jige";
		System.out.println(type);
		
	}
}
//当打印时候 无论任何类型都自动转换成string类型打印出来