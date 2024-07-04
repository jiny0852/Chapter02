package com.javaex.ex08;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods computer = new Goods("LG그램", 1000000);
		Goods cup = new Goods("머그컵", 2000);
		
		System.out.println(computer.toString());
		System.out.println(cup.toString());
		
		System.out.println("-----------------");
		
		//배열에 상품주소 추가 (자주안한다)
		Goods[] goodsArray = {computer, cup};//new Goods[2];
		System.out.println(goodsArray[0]);
		System.out.println(goodsArray[1]);

		System.out.println(cup.getName());
		System.out.println(goodsArray[1].getName());
		
		
		//goodsArray[0] = computer;
		//System.out.println(goodsArray[0]);
		
		System.out.println("----------------");
		
		
		for (int i = 0 ; i < goodsArray.length ; i++) {
			
			System.out.println(goodsArray[i].getName());
						
			
		}
		
		goodsArray[0].showInfo();
		goodsArray[1].showInfo();
		
		

	}

}
