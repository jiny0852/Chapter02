package com.javaex.ex15;

public class Circle extends Shape {
	
	private int radius;
	
	
	public Circle() {
		super();	}
	
	public Circle(int radius, String fillColor, String lineColor) {
		super();
		this.radius = radius;
		setFillColor(fillColor);
		setLineColor(lineColor);
	}


	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	///////////////////////////////////////////
	
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", getFillColor()=" + getFillColor() + ", getLineColor()=" + getLineColor()
				+ "]";
	}
	
	public void draw() {
		System.out.println("---원형을 그렸습니다---");
		System.out.println("지름 : " + radius + 
				           "\n면색 : " + getFillColor() + "\n선색 : " + getLineColor());
		System.out.println("-------------------");
	}

	
	
	

}
