package com.javaex.ex14;

public class ShapeApp {

	public static void main(String[] args) {
		
		//3 3 빨강 노랑
		
		Rectangle[] rArr = new Rectangle[3];
		Circle[] cArr = new Circle[3];
		
		
		
		Rectangle r1 = new Rectangle(3, 3, "빨강", "노랑");
		Rectangle r2 = new Rectangle(6, 10, "초록", "파랑");
		Rectangle r3 = new Rectangle(9, 4, "보라", "하양");
		
		rArr[0] = r1;
		rArr[1] = r2;
		rArr[2] = r3;
		
		
		/*
		System.out.println(r1.toString());
		System.out.println(r2.toString());
		System.out.println(r3.toString());
		*/
		
		for (int i = 0; i < cArr.length; i++) {
			rArr[i].draw();
		}
		
		
		Circle c1 = new Circle(7, "까망", "주황");
		Circle c2 = new Circle(4, "노랑", "초록");
		Circle c3 = new Circle(10, "똥색", "곤색");
		
		cArr[0] = c1;
		cArr[1] = c2;
		cArr[2] = c3;
		

		for (int i = 0; i < cArr.length; i++) {
			cArr[i].draw();
		}
		
		
		
		/////////////////////////////////////////////
		
		
		
		
		
		
		
		
		
		
		
	}

}
