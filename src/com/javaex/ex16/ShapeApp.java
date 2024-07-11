package com.javaex.ex16;

public class ShapeApp {

	public static void main(String[] args) {
		
		
		Shape[] sArr = new Shape[3];
		
		Shape r1 = new Rectangle(2, 4, "빨강", "검정");
		Shape c1 = new Circle(10, "빨강", "검정");
		Shape t1 = new Triangle(30, 30, "빨강", "검정");
		//Shape s0 = new Shape("빨강", "검정");
		
		sArr[0] = r1;
		sArr[1] = c1;
		sArr[2] = t1;
		//sArr[3] = s0;
		
		for(int i = 0 ; i<sArr.length ; i++) {
			
			sArr[i].draw();	//오버라이딩 된 메소드
		}
		
		for(int i = 0 ; i<sArr.length ; i++) {
			
			System.out.println(sArr[i].area());
		}
		
		
		//////////////////////////////
		
		//Shape s1 = new Shape("빨강", "검정");
		//s1.draw();
		
		
		
		
		
		
	}

}
