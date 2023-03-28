package com.javalab.inheritance.exam01;
//  부모클래스
public class Parent {

	public String name;
	public int age;
	
	public Parent() { // 기본생성자 안에 super를 알아서 만들어 주기때문에(오버로딩도 만들어줌) 기본생성자는 꼭 만들어라 안만들면 뒤진다
		System.out.println("여기는 부모 객체의 기본 생성자");
	}
	
	public Parent(String name, int age) {
		System.out.println("여기는 부모 객체의 오버로딩 생성자");
		this.name=name;
		this.age=age;
	}
	
	
	
}
