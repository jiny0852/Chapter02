package com.javaex.ex01;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods computer = new Goods();
		computer.name = "LG그램";
		computer.price = 1000000;
		
		System.out.println(computer.name);
		System.out.println(computer.price);
		
		
		Goods cup = new Goods();
		cup.name = "머그컵";
		cup.price = 2000;
		
		System.out.println(cup.name);
		System.out.println(cup.price);
		

	}

}
