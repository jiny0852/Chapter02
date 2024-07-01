package com.javaex.ex04;

import java.util.Scanner;

public class PointApp {

	public static void main(String[] args) {
		
		Point p = new Point();
		
		 p.setPointX(5);
		 p.setPointY(5);
		 
		 p.draw();
		 
		 System.out.println("----------");
		 
		 p.setPointX(10);
		 p.setPointY(23);
		
		 p.draw();
		 
		 
		 /*
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("x : ");
		 int x = sc.nextInt();
		 p.setPointX(x);
		 
		 System.out.print("y : ");
		 int y = sc.nextInt();
		 p.setPointY(y);
		 
		 p.draw();
		 

		 sc.close();
		 
		 */
	}


}
