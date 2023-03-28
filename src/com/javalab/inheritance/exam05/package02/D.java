package com.javalab.inheritance.exam05.package02;

import com.javalab.inheritance.exam05.package01.A;

public class D extends A{ //상속 받았지롱
	
	// 생성자 선언
	public D() {
		//A() 생성자 호출
		super();				//o
	}
	
	//메소드 선언
	public void method1() {
		//A 필드값 변경
		this.field = "value";	//o
		//A 메소드 호출
		this.method();			//o
	}
	//메소드 선언
	public void method2() {
		//A a = new A();		//x 잘못된 방법으로 호출하고 있다
		//a.field = "value";	//x
		//a.method();			//x
	}
}

