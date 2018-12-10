package com.abo.www.dp.filer;

public class MessageProcessor {
	String msg;
	
	Filter [] f = {new HtmlFilter(),new SesitiveFilter()};
	public String getMsg(){
		return msg;
	}
	

	public void setMsg(String s){
		this.msg = s;
	}
	
	public String process(){
		String r = msg;
		for(Filter f : f){
			r = f.doFilter(r);
		}
		return r;
	}
	
	
}
//对消息动态过滤 