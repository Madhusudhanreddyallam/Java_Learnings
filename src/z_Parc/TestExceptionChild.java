package z_Parc;

import java.io.IOException;

 class Parent {
	


	  // defining the method   
	  void msg() throws IOException, Exception  {  
	    System.out.println("parent method");  
	    }    
	}    
	    
	public class TestExceptionChild extends Parent{    
	  
	  // overriding the method in child class  
	  // gives compile time error  
	  void msg() throws Exception {    
	    int x = 50/0;    
	  }  
	  
	  public static void main(String args[]) throws Exception  {    
		  TestExceptionChild p = new TestExceptionChild();    
	   p.msg();    
	  }    
	} 
	


