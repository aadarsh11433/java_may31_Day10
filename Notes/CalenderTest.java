package com.Notes;

import java.util.Calendar;  //  automatically imports when we try to instantiate (create object) 

public class CalenderTest {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
		 cal.add(Calendar.DAY_OF_MONTH, 2);
		 System.out.println(cal.getCalendarType());
			
	}

}
