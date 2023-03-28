package com.javalab.inheritance.exam04;
/*
 * 자식 클래스
 */
public class Child extends Parent{

	int x = 200;
	
	// 메소드 오버라이딩 (부모의 메소드를 다시 정의함)
	@Override //어노테이션 //오버라이드 메소드 위에 붙여줌	// 오버라이딩 규칙이 맞는지 확인하는역할 안맞으면 빨간줄
	void display2() {
		System.out.println("child display2( )");
	}
	
	//자식이 새롭게 추가한 메소드
	void display3() {
		System.out.println("child display3( )");
	}
}
