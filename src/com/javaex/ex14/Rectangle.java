package com.javaex.ex14;

public class Rectangle {

	//필드
	private int width;
	private int height;
	private String fillColor;
	private String lineColor;
	
	
	//생성자
	public Rectangle() {
		super();	}
	
	public Rectangle(int width, int height, String fillColor, String lineColor) {
		super();
		this.width = width;
		this.height = height;
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}
	

	//메서드gs
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

	


	//메서드 일반
	
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", fillColor=" + fillColor + ", lineColor="
				+ lineColor + "]";
	}
	
	
	
	public void draw() {
		System.out.println("---사각형을 그렸습니다---");
		System.out.println("가로 : " + width + "\n세로 : " + height + 
				           "\n면색 : " + fillColor + "\n선색 : " + lineColor);
		System.out.println("-------------------");
	}
	
	
	
	
	
	
}
