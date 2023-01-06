package org.example.helpers;

public class StringMessage {
	private String key;
	private String msg;
	
	public StringMessage(){}
	
	public StringMessage(String key, String msg){
		this.key = key;
		this.msg = msg;
	}
	
	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
