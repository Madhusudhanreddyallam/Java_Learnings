package oops;

public class constructor {

	String name;
	int rollno;
	
	constructor () // constructor
	{	
		System.out.println("User defined constructor");	
	}
	
	constructor (String name) // constructor over loading
	{		
		this.name = name; //this keyword calls current class instance variable
		System.out.println(this.name);		
	}
		
	constructor (int rollno1) // constructor over loading
	{			
		rollno = rollno1; // this key word is not required when the instance variable name is not same as local parameterized variable name
		System.out.println(rollno);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructor C = new constructor();
		constructor C1 = new constructor("madhu");
		constructor C2 = new constructor(401);
		constructor C3 = new constructor(402);

	}

}
