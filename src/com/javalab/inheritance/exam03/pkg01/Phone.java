package com.javalab.inheritance.exam03.pkg01;
// 부모 클래스
public class Phone { // 모든 클래스에 가장 조상인 클래스는 object	클래스에 extends object 안써도 컴파일러가 써줌.

	// 필드 선언
	public String model;
	public String color;
	
	//기본 생성자
	public Phone() {
	super();
	}
	// 생성자 선언
	public Phone(String model, String color) {
		this.model=model;
		this.color=color;
	}
	
	//phoneInfo() 메소드 구현
	public void phoneInfo() {
		System.out.println("[phone Info]");
		System.out.println("모델: " + model);
		System.out.println("색상 : " + color);
	}
	
}
