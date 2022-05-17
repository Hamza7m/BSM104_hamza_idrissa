package uygulama_Hafta7;
import java.util.*;
public class QueueExamble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String data[]= {"java", "php", "python"};
		Queue<String> q = new LinkedList<String>();
		for(String word:data) {
			q.add(word);
		}
		
		System.out.println("queue = " +q);
		System.out.println("peek = " +q.peek());
		System.out.println(q.size());
	}

}
