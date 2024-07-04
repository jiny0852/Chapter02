package com.javaex.ex08;

public class Arr3 {

	public static void main(String[] args) {
		
		int[] a = {3, 6, 9};
		
		
		int[] b = new int[3];
			
		for(int j = 0; j<b.length ; j++) {
					
			for (int i = 0 ; i < 10 ; i++) {
					
				if ( i%3 == 0 ) {
					b[j] = i;
					System.out.println("a : " + j + "는" + a[j]);
					System.out.println("b : " + j + "는" + b[j]);
					
				}
			}
		}
		
		

	}

}
