package com.abo.www.dp.filer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg = "hello :), <script>, 敏感，被就业";
		MessageProcessor mp = new MessageProcessor();
		
		mp.setMsg(msg);
		String afterProcess = mp.process();
		System.out.println(afterProcess);
		//System.out.print(mp.getMsg());
		
	}

}
