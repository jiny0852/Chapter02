package com.javaex.ex17;

public class ShapeApp {

	public static void main(String[] args) {
		
		
		Drawable[] dArr = new Drawable[4];
				
		Drawable p1 = new Point(3, 6);		
		Drawable r1 = new Rectangle(10, 10, "빨강", "검정");		
		Drawable c1 = new Circle(10, "빨강", "검정");		
		Drawable t1 = new Triangle(30, 30, "빨강", "검정");
		
		dArr[0] = p1;
		dArr[1] = r1;
		dArr[2] = c1;
		dArr[3] = t1;
		
		//dArr[0].draw();
		//r1.draw();
		
		for(int i = 0; i < dArr.length; i++) {
			dArr[i].draw();
		}
		/*
		System.out.println(((Shape)r1).area());
		System.out.println(((Shape)c1).area());
		System.out.println(((Shape)t1).area());
		*/
		
		for(int i = 0; i < dArr.length; i++) {
			
			
			//System.out.println(((Shape)dArr[i]).area());
			
			if ( dArr[i] instanceof Shape ) {
				System.out.println(((Shape)dArr[i]).area());
			}
			
		}
		
		
		
		
		
	}

}
