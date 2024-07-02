package com.javaex.ex06;

public class Goods {

	//필드
	private String name;
	private int price;
	
	//기본 생성자는 코딩안해도 생긴다 (다른 생성자가 없을때)
	//다른 생성자를 코딩하면 기본 생성자는 자동으로 만들어지지 않는다
	//다른 생성자가 있을때, 기본 생성자를 같이 쓰고 싶으면
	//-->기본 생성자를 코딩해줘야한다
	
	//생성자
	public Goods() {
		//주된 기능이 메모리에 올리기
	}
	
	public Goods(String name, int price) {
		//메모리 올리기 - 기본기능
		this.name = name;
		this.price = price;
	}
	
	
	
	
	
	//메소드 - get/set
	public String getName() {
		return name;	}
	public void setName(String name) {
		this.name = name;	}
	public int getPrice() {
		return price;	}
	public void setPrice(int price) {
		this.price = price;	}
	
	//메소드 - 일반
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + "]";	}
	
	
	//그리기 - 오래걸림(기술도 복잡)
	
	
	
}
