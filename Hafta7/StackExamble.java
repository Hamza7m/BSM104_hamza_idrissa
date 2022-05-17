package uygulama_Hafta7;
import  java.util.Stack;
import  java.util.*; class StackExamble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
				String data[] = {"java" , "php" ,"python"};
				
				Stack<String> s = new Stack <String> ();
				
				for(String word :data) {
					s.push(word);
					
				}
				
				System.out.println("stack ="+s);
				System.out.println(s.peek());
				System.out.println(s.pop());
				System.out.println("stack ="+s);
				System.out.println(s.size());
				
				while(!s.isEmpty()) {
					System.out.println(s.pop());
				}
				
				
				

}
}