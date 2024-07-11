package com.javaex.ex17;

public class Triangle extends Shape implements Drawable {

	private int width;
	private int height;
	
	/////////////////////////////
	
	public Triangle() {
		super();	}
	
	public Triangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	public Triangle(int width, int height, String fillColor, String lineColor) {
		super(fillColor, lineColor);
		this.width = width;
		this.height = height;
	}
	
	////////////////////////////////////////
	

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	////////////////////////////////////
	
	
	@Override
	public String toString() {
		return "Triangle [width=" + width + ", height=" + height + ", getFillColor()=" + getFillColor()
				+ ", getLineColor()=" + getLineColor() + "]";
	}
	
	public void draw() {
		System.out.println("---삼각형을 그렸습니다---");
		System.out.println("가로 : " + width + "\n세로 : " + height + 
		           "\n면색 : " + getFillColor() + "\n선색 : " + getLineColor());
		System.out.println("-------------------");
	}

	
	public double area() {
		return width*height/2;
	}
	
	
	
}
