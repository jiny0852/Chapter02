package com.javaex.ex03;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods computer = new Goods();
		Goods cup = new Goods();
		Goods camera = new Goods();
		
		//캡슐화 - 직접 저장할수없다
		//computer.name = "LG그램";
		//computer.price = 1000000;
		
		computer.setName("LG그램");
		computer.setPrice(1000000);
		
		cup.setName("머그컵");
		cup.setPrice(2000);
		
		camera.setName("니콘");
		camera.setPrice(400000);
		
		
		/*
		System.out.println(computer.getName());
		System.out.println(computer.getPrice());
		
		System.out.println("------------");
		
		System.out.println(cup.getName());
		System.out.println(cup.getPrice());
				
		
		System.out.println("------------");
		
		System.out.println(camera.getName());
		System.out.println(camera.getPrice());
		*/
		
		
		
		System.out.println("상품이름 : " + computer.getName());
		System.out.println("가격 : " + computer.getPrice());
		
		System.out.println("------------");
		
		System.out.println("상품이름 : " + cup.getName());
		System.out.println("가격 : " + cup.getPrice());
		
		System.out.println("------------");
		
		System.out.println("상품이름 : " + camera.getName());
		System.out.println("가격 : " + camera.getPrice());
		
		
		computer.showInfo();
		cup.showInfo();
		camera.showInfo();
		
		

	}

}
