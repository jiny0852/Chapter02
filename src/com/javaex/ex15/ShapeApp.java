package com.javaex.ex15;

public class ShapeApp {

	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle(3, 3, "빨강", "노랑");
		System.out.println(r1.toString());
		
		
		Circle c1 = new Circle (10, "파랑", "노랑");
		System.out.println(c1.toString());
		
		
		
		Triangle t1 = new Triangle(13, 15, "보라", "주황");
		System.out.println(t1.toString());
		
		////////////////////////////////////////
		
		Shape[] sArr = new Shape[3];
		
		
		//섞어쓰기  
		//사각형 --> 도형
		Shape s1 = new Rectangle(3, 5, "빨강", "노랑");
		//원형 --> 도형
		Shape s2 = new Circle(17, "파랑", "빨강");
		//삼각형 --> 도형
		Shape s3 = new Triangle(10, 20, "파랑", "파랑");
		
		sArr[0] = s1;
		sArr[1] = s2;
		sArr[2] = s3;
		
		System.out.println("----------------");
		System.out.println(sArr[0].toString()); //메소드 * 오버라이딩

		
		System.out.println("----------------");
		for(int i = 0 ; i < sArr.length ; i++) {
			//System.out.println(sArr[i].toString());
			sArr[i].draw();
		}
		
		System.out.println(((Rectangle)s1).getWidth());
		System.out.println(((Circle) s2).getRadius());		
		System.out.println(((Triangle)s3).getHeight());
		
		
		
		
	}

}
