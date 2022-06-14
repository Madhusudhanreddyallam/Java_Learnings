package oops;

import org.testng.annotations.Test;

/*
1) Only one public class can be defined in a single java program
2) When public is defined for any of the class in a single java program,then the name of java program should be same as the name of public class  
3) If a public class is not defined in a single java program, then the java program name be anything  	
*/
public class class_ {

String instance_variable = "instance";
static String static_variable = "static";



public void local_method () {
	
	String local_variable = "p1";
	System.out.println(local_variable);
}


public static void main(String args[]){  
	
	
	class_ reference_variable = new class_();	// object creation 
	
	System.out.println(reference_variable.instance_variable);
	System.out.println(static_variable);
	reference_variable.local_method();
	
}

}




