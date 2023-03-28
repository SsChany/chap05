package com.javalab.inheritance.exam03.pkg01;

public class SmartPhone	extends Phone {
	
	// field
	public String frequency;
	
	// 생성자 구현
	public SmartPhone() {
		super();	// 부모의 기본생성자 호출
	}
	
	//오버로딩 생성자 호출
	public SmartPhone(String model, String color) {
		super(model,color);
	}
	//오버로딩 생성자 호출
	public SmartPhone(String model, String color, String frequency) {
		super(model, color);
		this.frequency=frequency;
	}
	
	public void showSmartPhoneInfo() {
		this.phoneInfo();	// 부모의 정보를 조회하는 메소드 호ㅜㄹ(this 사용)
		System.out.println("frequency : " + this.frequency); //자신의 필드 정보 조회
	}
	
	
	
	
	//자식 생성자 선언 안합니다. 안해요. 안할겁니다.
}
