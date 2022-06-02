

package com.Problem3;

abstract class Laptop {
 
	abstract void start();
	
	public void shutdown() {
		System.out.println("laptop goes to sleep");
	}

	public static void monitor() {
		
		System.out.println("Laptop has a monitor");
	}
	
	public final  void mouse(){
		
		System.out.println("this method is final and cant be override  NAMED AS MOUSE in class Laptop");
	
	}
}

class Acer extends Laptop{
 
	@Override
	void start() {
		
		System.out.println("starting slowly");
		
	}
	
	
}

  abstract class Apple extends Laptop{
	  
  }
  

  class main {
	
	public static void main(String[] args) {
		
		Acer  acer  = new Acer();
		
		acer.start();
		
		
		
		
	}
}





/*
<--------------------------   Astract Class   -------------------------------->

    A class that is declared as abstract is known as an abstract class.
    

 Important points of Abstract class:

  ----> An abstract class must be declared with an abstract keyword. (line--5)

  ----> It can have abstract and non-abstract methods, ie Abstract method is not neccessory.

  ----> It cannot be instantiated that is its own object cannot be created.
   
   It can have constructors and static methods also. (line -- 13)

   It can have final methods which will force the subclass not to change the body of the
   method. which is same as Concrete Class. (method in line -- 18 cant be overriden)
    
   ====>> arrowed points are the main difference between an Abstract Class and Concrete class. 
   
   Without child class it has no meaning.
   
   if some class extends to this abstract class it has to implement the abstract methods 
   (line -- 28) 
   
   In case we dont override all the abstract method we have to make the child classs also Abstract .
   (line -- 37) 
*/