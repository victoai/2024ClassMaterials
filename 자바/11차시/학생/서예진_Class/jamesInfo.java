package com.acorn_SYJ;

public class jamesInfo {
	/*
	이 사람이 나이
	이 사람의 이름
	이 사람의 결혼 여부
	이사람의 자녀수
	*/
	
	private  String name;
	private int age;
	private int ch;
	private boolean isMarried = true;
	
	public void input(String name, int age, int ch, boolean isMarried) {
		this.name = name;
		
		if( age >0) {
			this.age = age;
		}
		this.ch = ch;
		this.isMarried = isMarried;
	}
	
	public void printInfo() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(ch);
		System.out.println(isMarried);
	}
	
}
