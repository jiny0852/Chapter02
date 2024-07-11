package com.javaex.ex15;

public class Shape {
	
	private String fillColor;
	private String lineColor;
	
	
	
	public Shape() {	}

	public Shape(String fillColor, String lineColor) {
		super();
		this.fillColor = fillColor;
		this.lineColor = lineColor;
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
		System.out.println("---도형을 그렸습니다---");
		System.out.println("\n면색 : " + fillColor + "\n선색 : " + lineColor);
		System.out.println("-------------------");
	}
	
	

}
