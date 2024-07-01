package com.javaex.ex04;

public class Point {
	
	//필드
	private int x;
	private int y;

	//생성자
	
	//메소드
	//get set
	public void setPointX(int i) {
		x = i;	}
	public int getPointX() {
		return x;	}
	public void setPointY(int i) {
		y = i;	}
	public int getPointY() {
		return y;	}
	
	
	//일반이름
	public void draw() {
		System.out.println("점[x=" + x + ", y=" + y + "]을 그렸습니다.");
	}
	
	
	
}
