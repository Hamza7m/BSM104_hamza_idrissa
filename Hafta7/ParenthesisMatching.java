package uygulama_Hafta7;
import java.util.*;
import java.util.Stack;
public class ParenthesisMatching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner input = new Scanner(System.in);
     System.out.println("kontrol etmek istedigin ifadi giriniz ? ");
     String exp = input.next();
     
     if(isMatching(exp)) {
    	 System.out.println("dengili");
     }else {
    	 System.out.println(" dengli degildir ");
     }
     
     
     
	}
   public static boolean isMatching (String exp) {
	   Stack <Character> s = new Stack <Character>();
	   for(int i =0; i<= exp.length();i++) {
		   if(exp.charAt(i)=='(') {
			   s.push(exp.charAt(i));
		   }else if(exp.charAt(i)==')') {
			   if(!s.isEmpty()) {
				   s.pop();
			   }
		   }else {
			   return false ; 
		   }
		   
		  
		   
	   }
	   return(s.isEmpty());
    }
	
}
