package com.Problem2;

public class ScienceStudent extends Student{
	
		 int physicsMarks;
	     int chemistryMarks;
	     int mathsMarks;
	     


		public ScienceStudent(String name, String address,int physicsMarks, int chemistryMarks, int mathsMarks) {
			super(name , address);
			this.physicsMarks = physicsMarks;
			this.chemistryMarks = chemistryMarks;
			this.mathsMarks = mathsMarks;
		}



		@Override
		public double  getPercentage() {
			
			double a = this.chemistryMarks;
			double b = this.physicsMarks;
			double c = this.mathsMarks;
			
			return (a+b+c)/3;
		}
		
		
		
}