package uygulama_Hafta8;
import java.util.*;
public class ValidParantheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      public boolean ValidParantheses (String str) {
    	  Stack<Character> s  =new Stack<Character>();
    	  
    	  for(char x:str.toCharArray()) {
    		  if(x == '{' || x=='['|| x == '(') {
    			  s.push(x);
    		  }else if(!s.isEmpty() && (x== ']' && s.peak()=='[' || x=='}' && s.peak() =='{') || x==')' && s.peek()=='(') {
    			  s.pop();    		  }
    	  }else {
    		  return false ;
    	  }
    	  
      }
		return s.isEmpty();
		
		
	}

}
