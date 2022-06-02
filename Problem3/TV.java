package com.Problem3;

public interface TV {
	
	 public static final String purpose = "Entertainment";
	
	String location  = "Living Room ";   // compiler adds (public static final) keywords by itself to data members of interface.

	public abstract void screen();
	
	 void remote();                    // public abstract adds  buy compiler to abstract methods.
	
	public static void channels() {
		
		System.out.println("Inside channel method of TV interface  -- static method");
	}
	
     default void dish() {   // keyword public is access modifier and Default is nature of method () 
 		
		System.out.println("inside dish method of TV interface -- Default method ");
	}
	
	default void antenna() {
		System.out.println("inside ANtenna method of TV interface -- Default method ");
	}
	
}

   interface A{    // Marker interface
	   
   }
   
   interface  B extends TV{   // interface extends to interface
	   
   }

class SmartTv implements TV,A {   // classes implements interface

	@Override
	public void screen() {

		System.out.println("Inside screen method of smart Tv class   -- overriden ");	
		System.out.println("Now the screeen is  LED");
	}

	@Override
	public void remote() {
		
		System.out.println("Inside remote method of smart Tv class   -- overriden ");	
		
		System.out.println("Now the remote is  also Smart ");
	}
	
	@Override
	public void dish() {
		System.out.println("inside dish method of SmartTv class -- Default method ");
	}
	

	public static void channels() {
		
		System.out.println("Inside channel method of Class Smart tv  -- static method");
	}
	
}


class Demo{
	
	
	            public static void main(String[] args) {
					
	            	TV.channels();
	            	
	            	TV tv1 = new SmartTv();
	            	
	            	tv1.dish();
	            	tv1.screen();
	            	tv1.remote();
	            	
//	            	tv1.channels(); 
	            	
	            	
				}
	
	
}


/*                
 
                    <<----------------------------------------------------  INTERFACE  --------------------------------------------------->>
 
 
                     ---->> To declare an interface, we use the interface keyword.
                     
                     ---->> An interface in Java is a blueprint of a class. just like a class is a blueprint for  object.
                     
                     ---->> PRIOR to Java 8  A Java interface contains static constants and abstract methods only,
                            BUT after java 8 it also supports default and static methods.
                            
                     ---->> Its main objective is to Provide 100% abstraction which abstract classes dont provide (0-100 %)  
                            Not very valid after Java 8 (since it supports method body also with  static and default keywords  )
 
                     ---->> We can Achieve multiple inheritence in java by using interface which s not posiible in case of classes,
                            class cant extends to more than one class but a class can implement two or more interfaces 
                            (LINE-- 37 ) SmartTv class is implementing TV interface as well as A interface.
                            
                     ---->> Java Interface also represents the IS-A relationship like a smartTV is aTV also (same as class when it extends).
                     
                     ---->> It cannot be instantiated just like the abstract class ( CAnt create its own object ),
                            though its variable  can refer to a implemented class object (same as superclass reference child class object)
                            (LINE -- 75)
                            
                     ---->> To implement an interface to a class we use implements keyword. (LINE -- 37 )
       
                     ---->> the class that implement a interface need to implement all the abstract method of that interface.
                            ( LINE-- 40 & 46 )
                     
                     ---->> Default method of an interface can also be overridden but not necessary to do so for instance in (line --  55 ) 
                            the interface implementing class has overridden the inerface's default  method but the other default method
                            of interface  in (LINE -- 23) is  not . THat is completely fine.
                            
                     ---->> the static method cannot be overridden if we do so it gives a error ,
                            incase we do it without using the @Override keyword the compiler takes it as Class's own specific method not the               
                            overridden one . (LINE-- 60 )
                            
                     ---->> The Java compiler adds public and abstract keywords before the interface
                             abstract methods.(LINE -- 11 )
                             
                     ---->> The Java compiler adds public, static and final keywords before data members.  (LINE -- 7 )  
                                                                              
                     ---->> a class extends another class, an interface extends another interface.(LINE -- 33  )
                            but a class implements an interface (LINE -- 37 )
 
                     ---->> An interface that has no member is known as a marker or tagged interface, for  
                            example interface A (LINE -- 29 ).
 
                     ---->> Members of a Java interface are public by default. all kind members static method default method and abstract methods
                            and variables also.
                            
                     ---->> to call static method we use interfecname.methodname(); way  (LINE -- 73 )
                            need not to create an object. 
                     
                     ---->> by calling methods of interface ovverridden methods get priority. (line -- 77 78 79 ) 
                     
                     ---->> when we try to call a static method it gives error (line -- 81) ,but why its not calling the method in the 
                            smartTv because it needed to downcasting.
                            
                            I think its enough :)
 
 
 */


