package com.Problem4;

public class Area extends Shape{

	@Override
	public int rectangleArea(int length, int breadth) {
		
		int area = length * breadth;
		
		return area;
	}

	@Override
	public int squareArea(int side) {
		// TODO Auto-generated method stub
		return side*side;
	}

	@Override
	public int circleArea(int radius) {
	
		float pie = 3.14f;
		
		float area = pie*radius*radius;
		
		return (int)area;
	}

}
