package com.javaex.ex09;

public class GoodsApp {

	//static조사 Goods computer
	
	public static void main(String[] args) {
		
		Goods computer = new Goods("LG그램", 1000000);
		System.out.println(computer.toString());
		
		System.out.println(computer.getCount());
		
		Goods cup = new Goods("머그컵", 2000);
		System.out.println(cup.toString());
		
		System.out.println(computer.getCount());
		
		Goods camera = new Goods("니콘", 400000);
		System.out.println(camera.toString());
		
		System.out.println(computer.getCount());
		System.out.println(cup.getCount());
		
		System.out.println(Goods.count);
		

	}

}
