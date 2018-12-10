package com.abo.www.dp.filer;

public class SesitiveFilter implements Filter {
	public String doFilter(String str){
		String s = str.replace("敏感" , "不敏感").replace("你好", "滚");
		return s;
	}
}
