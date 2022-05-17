package uygulama_Hafta11;

import java.util.*;
public class Palindrom {

	public static void main(String[] args) {


	     System.out.println("herhangi bir kilme giriniz: ");
	     Scanner input=new Scanner (System.in);
	     String harf= input.nextLine();
	   if(  valipalindrom(harf)) {
		   System.out.println("palindromudur");
	   }else {
		   System.out.println("palindrom deðildir");

	   }
	     
		}

		public static boolean valipalindrom(String word ) {
			Stack<Character> m=new Stack <Character>();
			for (int index = 0; index < word.length(); index++) {
				m.push(word.charAt(index));
				
			}
		String space="";
			while(!m.isEmpty()) {
				space=space+m.pop();
			} 
			if(word.equals(space)) {
				return true;
			}
			return false;

	}

}

