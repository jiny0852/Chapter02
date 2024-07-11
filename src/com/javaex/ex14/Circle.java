package com.javaex.ex14;

public class Circle {
	
	private int radius;
	private String fillColor;
	private String lineColor;
	
	
	
	
	public Circle() {
		super();	}
	
	public Circle(int radius, String fillColor, String lineColor) {
		super();
		this.radius = radius;
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}


	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public String getFillColor() {
		return fillColor;
	}
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
	public String getLineColor() {
		return lineColor;
	}
	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	
	
	
	
	
	public void draw() {
		System.out.println("---원형을 그렸습니다---");
		System.out.println("지름 : " + radius + 
				           "\n면색 : " + fillColor + "\n선색 : " + lineColor);
		System.out.println("-------------------");
	}
	
	

}
