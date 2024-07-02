package com.javaex.ex06;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods computer = new Goods();
		computer.setName("LG그램");
		computer.setPrice(1000000);
		
		//System.out.println(computer.toString());
		
		Goods cup = new Goods("머그컵", 2000);
		//cup.setName("머그컵");
		//cup.setPrice(2000);
		
		//System.out.println(cup.toString());
		
		

	}

}
