package com.Problem1;

import java.util.Scanner;

public class Demo {
	
	public Hotel provideFood(int amount) {
		
		if(amount >= 1000) {
			
			return new TajHotel();
			
		}
		else if(amount > 200 && amount <1000) {
			
			return new RoadSideHotel();
		}
		else {
			System.out.println("Please Enter a valid amount");
		}
		
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Please Enter an amount");
		
		Scanner sc = new Scanner(System.in);
		int amount = sc.nextInt();
		
		Demo demoObj =  new Demo();
		
		 Hotel hotel = demoObj.provideFood(amount);  
		 
		 if( hotel instanceof TajHotel) {
			 
			 hotel.chickenBiryani();
			 hotel.masalaDosa();
             ((TajHotel )hotel).welcomeDrink();
		 }
		 else if (hotel instanceof RoadSideHotel) {
			 
			 hotel.chickenBiryani();
			 hotel.masalaDosa();
             ((RoadSideHotel )hotel).water();
		 }
		 else {
			 
			 System.out.println("Try again");
			 
		 }

	}

}
