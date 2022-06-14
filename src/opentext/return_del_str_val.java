package opentext;

public class return_del_str_val {

	 public int solution(String S, int[] C) {
	        int sum = 0;
	       
	       for(int i=0 ; i< S.length() ; i++)
	       {
	           if(i==S.length()-1)
	              break;
	           if(S.charAt(i)==S.charAt(i+1))
	           {
	             sum += C[i];
	           }
	             
	       }

	        return sum;
	    }
}
