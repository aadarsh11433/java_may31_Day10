package com.Problem2;

import java.util.Scanner;

public class AllStudent {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
				
		
	                 /*	<-------------------------Input taking for Science Student---------------------------------->    */
		
		System.out.println("enter the name of Science Student");
		String student1_name = sc.next();
		
		System.out.println("enter the address of Science Student");
		String student1_address = sc.next();
		
		System.out.println("enter the marks of Chemistry");
		int student1_chem = sc.nextInt();
		
		System.out.println("enter the marks of Physics");
		int student1_phy = sc.nextInt();
		
		System.out.println("enter the marks of Maths");
		int student1_math = sc.nextInt();
		
		
		
		 ScienceStudent student1 = new ScienceStudent(student1_name ,student1_address ,student1_chem ,student1_phy, student1_math);
		
		 double student1Average =  student1.getPercentage();
		 
		 
		 System.out.println("Percentage of "+student1.name + " is : "+student1Average);
		
		
		   /*	<-------------------------Input taking for History Student---------------------------------->    */
		
				System.out.println("enter the name of History Student");
				String student2_name = sc.next();
				
				System.out.println("enter the address of History Student");
				String student2_address = sc.next();
				
				System.out.println("enter the marks of History");
				int student2_history = sc.nextInt();
				
				System.out.println("enter the marks of Maths");
				int student2_civics = sc.nextInt();
				
				
			   	HistoryStudent student2 = new HistoryStudent(student2_name,student2_address,student2_history,student2_civics);
		
		      
		       double student2Average =  student2.getPercentage();
		      
		       
		       System.out.println("Percentage of "+student2.name + " is : "+student2Average);
		
	}

}
