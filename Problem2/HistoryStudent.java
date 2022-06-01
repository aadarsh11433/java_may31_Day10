package com.Problem2;

public class HistoryStudent extends Student{

	int historyMarks;
	int civicsMarks;
	
	

	public HistoryStudent() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public HistoryStudent(String name, String address,int historyMarks, int civicsMarks) {
		super(name, address);
		this.historyMarks = historyMarks;
		this.civicsMarks = civicsMarks;
	}



	@Override
	public double  getPercentage() {
		
		float a = this.historyMarks;
		float b = this.civicsMarks;
	
		
		return (a+b)/2;
	}
}
