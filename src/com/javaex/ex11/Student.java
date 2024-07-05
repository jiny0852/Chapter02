package com.javaex.ex11;

public class Student extends Person {
	
	private String school;

	
	
	
	
	public Student() {
		super();//public Person(){} 부모 디폴트 생성자 찾아감 
	}
	public Student(String school) {
		super();
		this.school = school;	
	}
	public Student(String name, int age, String school) {
		//생성자 - 메모리 올리는 역할
		//super.name = name; //public떄문에 안됨
		/*
		방법1 부모의 기본 생성자 사용
		super();
		super.setName(name);
		super.setAge(age);
		*/
		/*
		방법2 부모와 다른 생성자(2) 사용
		super(name, age);
		*/
		/*
		방법3 부모의 필드의 접근제어자를 protected 놓는다
		super.name = name;
		super.age = age;
		*/
		
		this.setName(name);
		super.setName(name);
		
		this.school = school;	
	}

	
	
	
	
	public String getSchool() {
		return school;	}
	public void setSchool(String school) {
		this.school = school;	}
	
	
	
	@Override
	public String toString() {
		return "Student [school=" + school + "]";
	}
	public void showInfo( ) {
		System.out.println("-------------------");
		System.out.println("이름 : " + getName() + ", 나이 : " + getAge() 
		                    + " , 학교 : " + this.school);
		System.out.println("-------------------");
	}
	

}
