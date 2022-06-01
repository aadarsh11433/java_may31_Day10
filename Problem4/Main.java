package com.Problem4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

//		float a =5.0f;
		
		Scanner sc = new Scanner(System.in);
		
		Area area = new Area();
		
		System.out.println("Enter the length  of Rectangle in cm (dont pass floating value)");
		int length = sc.nextInt();
		
		System.out.println("Enter the Breadth  of Rectangle (dont pass floating value) ");
		int breadth  =sc.nextInt();
		
		
		int rectangleArea = area.rectangleArea(length,breadth);
		
		System.out.println("the area of Rectangle with above dimensions is " + rectangleArea +"cm");
		
		System.out.println("<----------------------------->");

		
		System.out.println("Enter the Radius  of Circle (dont pass floating value) ");
		int radius  =sc.nextInt();
		
		int circleArea = area.circleArea(radius);
		
		System.out.println("the area of Circle with above Radius is " + circleArea + "cm");
		
		System.out.println("<----------------------------->");
		
		
		System.out.println("Enter the side  of Square (dont pass floating value) ");
		int side  =sc.nextInt();
		
		int squareArea = area.squareArea(side);
		
		System.out.println("the area of Square with above side is " + squareArea+"cm");
		
		System.out.println("<----------------------------->");
		
	}

}
