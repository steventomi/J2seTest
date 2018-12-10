package com.abo.www.dp.filer;

public class HtmlFilter implements Filter {

	public String doFilter(String s) {
		String r =s.replace('<', '}').replace('>', '{');
		return r;
	}

}
