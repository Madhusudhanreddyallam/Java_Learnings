package a_String;

public class compresion_amazon {
	
	public static void main(String[] args) {
	    String str = "AAABBBBC";      
	    int length = str.length();     
	   // String temp = "";
      
	   StringBuilder sb = new StringBuilder(); 
	    int count=1;   
	    for(int i=0; i<length; i++){
	        
	        if(i==length-1){         
	            sb.append(str.charAt(i)+""+count);
	        	//temp += str.charAt(i)+""+count;
	            break;
	        }
	        
	        if(str.charAt(i)==str.charAt(i+1)){   
	            count++;
	        }
	        
	        else{                         
	            sb.append(str.charAt(i)+""+count);
	            //temp += str.charAt(i)+""+count;
	            count=1;     
	        }
	   }
        //System.out.println(sb.toString());  
	    System.out.println(sb);

	}

}
