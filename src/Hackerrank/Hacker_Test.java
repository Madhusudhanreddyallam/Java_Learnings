package Hackerrank;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Hacker_Test {



	public static void main(String args[])
	{
		String ss[] = {"({})(())", "({(){}()})()({(){}()})(){()}{}((()))", "{}()))(()()({}}{}"
				,"}}}}","))))","{{{","(((","{}(){()}((())){{{}}}{()()}{{}{}}","{{{{{{{)))))))))))))))))))"
				,"{}{}(","{}}}{}","()()()())))" ,"(((((()()()" ,"(){}{{}}()(()){{()()}}", "{}{{{}}}{{{((()))}}}"
				,"((()))","{{}}(())"};

		for(String s: ss)
		{
			//System.out.println(s);
			
			while(true)
			{
				int startLen = s.length();
				s=s.replace("[]", "");
				//System.out.println(s);
				s=s.replace("()", "");
				//System.out.println(s);
				s=s.replace("{}", "");
				//System.out.println(s);
				
				int newLen = s.length();
				
				if(newLen==startLen)
					break;

			}
         
			if(s.length()==0)
				System.out.println("true");
			else
				System.out.println("flase");
		}
	}


}




