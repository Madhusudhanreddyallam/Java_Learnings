package oops2;

import oops.Access_modifer1;



public class Access_modifier extends Access_modifer1 {
	

	  
	public void pack ()
	{
		Access_modifier abc = new Access_modifier();
		
        	System.out.println(abc.Public);
        	abc.public_method();
         	abc.protected_method(); // protected methods are available when we extend the parent class
         	                        // and the object should be created for child class not super/parent class
        	
        	
	}

}
