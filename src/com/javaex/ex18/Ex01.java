package com.javaex.ex18;

import java.util.Scanner;

public class Ex01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		num = sc.nextInt();
		
		
		try {
			
			double result = 100/num;
			System.out.println(result);
			
		} catch ( ArithmeticException e ) {
			
			System.out.println(e.toString());
			System.out.println("0으로 나눌수 없습니다");
			
		} catch ( ClassCastException e ) {
			
			System.out.println(e.toString());
			System.out.println("형변환 할 수 없습니다");
			
		} finally {
			
			System.out.println("공통인 영역");
			
		}
		
		System.out.println("프로그램 종료");
		
		sc.close();
		
	}
	

}
