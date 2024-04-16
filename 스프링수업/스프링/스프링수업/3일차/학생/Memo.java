package com.acorn.day3.project;

import lombok.Data;

@Data
public class Memo {

	int num;
	String code;
	String content;
	
	
	public Memo(String code, String content) {
		super();
		
		this.code = code;
		this.content = content;
	}
	
	
	public Memo(int num, String code, String content) {
		super();
		this.num = num;
		this.code = code;
		this.content = content;
	}
	
	
	public Memo() {
		// TODO Auto-generated constructor stub
	}
	
	
	
}
