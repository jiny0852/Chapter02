package com.javaex.ex11;

public class PersonApp {
	
	public static void main(String[] args) {
		
		Person p01 = new Person("정우성", 45);
		
		System.out.println(p01.toString());
		p01.showInfo();
		
		Student s01 = new Student();
		s01.setSchool("제주");
		
		s01.showInfo();
		
		s01.setName("이효리");
		s01.setAge(14);
		
		s01.showInfo();
		System.out.println(s01.toString());
		
		
	}

}
/*
#자식클래스가 부모클래스를 상속했을때
Student extends Person
-부모의 필드, 메소드를 꽁짜로 사용할 수 있다

-부모클래스는 완성되어 있는상태
-부모클래스는 자식이 누구인지 모른다(영향받지 않는다)
-자식클래스가 부모클래스를 선택했다(누구인지 안다, 내용도 안다)
-----------------------------------------------------
*Person p01 = new Person()  이경우는 상속이랑 상관없다

*Student s01 = new Student() 
-부모를 상속한 경우 생성자에서 부모필드에 저장할 값도 받아줘야한다 

#메모리에 올라가는 순서는?
-자식생성자 시작만 --> 부모생성자 --> 자식생성자 완료
-먼저 완전히 완료되는건 부모생성자
 그다음 자식 생성자완료

#메모리에 올리는일(생성자) 규칙
-자식의 생성자를 정의할때 부모의 어떤 생성자를 사용할지 정해줘야 한다
 부모쪽에 있는 생성자중 선택해야함

-*아무것도 안쓰면 부모의 기본생성자사용 super()
 부모쪽에 없으면 에러
 

#일반메소드
부모의 메소드와  자식의 메소드의 이름이 동일할경우
-굳이 이름을 같게 만드는 이유?
 부모의 그메소드를 못쓰게 할려고
 자식쪽정의된 메소드가 사용된다
 (재정의)


-본인쪽  this, this()
-부모쪽  super., super()
*/
