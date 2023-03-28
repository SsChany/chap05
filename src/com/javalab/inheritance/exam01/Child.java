package com.javalab.inheritance.exam01;

public class Child extends Parent{

	
		
		public String address;
		public String phone;
		
		// 기본생성자
		public Child() {
			super(); // 첫줄에서 부모 객체 기본 생성자 호출 // 안써도 자동으로 써짐 근데 써야 됨 개빡침
		}
		
		public Child(String address) {
			super("김길동", 29); // 부모 필드 초기화 // 항시 첫줄에 쓰기❤❤ 👁‍;
			System.out.println("자식 객체의 생성자1"); // 자기필드 초기화
		}
		public Child(String address , String phone) {
			this.address = address;
			this.phone = phone;
			System.out.println("자식 객체의 생성자2");
		}
	}


