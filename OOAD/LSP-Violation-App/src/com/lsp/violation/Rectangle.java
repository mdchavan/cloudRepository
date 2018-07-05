package com.lsp.violation;

public class Rectangle {
	private int height;
	private int width;
	
	public Rectangle(){
		
	}
	
	public Rectangle(int height,int width){
		this.height=height;
		this.width=width;
	}
	
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int calculateArea(){
		return height*width;
	}

}
