package com.javaex.ex04;

public class Point {
	
	//필드
	private int x;
	private int y;

	//생성자
	
	//메소드
	//get set
	public void setPointX(int x) {
		this.x = x;	}
	public int getPointX() {
		return this.x;	}
	public void setPointY(int y) {
		this.y = y;	}
	public int getPointY() {
		return this.y;	}
	
	
	//일반이름
	public void draw() {
		System.out.println("점[x=" + x + ", y=" + y + "]을 그렸습니다.");
	}
	
	
	
}
