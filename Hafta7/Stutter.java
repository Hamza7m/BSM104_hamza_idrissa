package uygulama_Hafta7;
import java.util.*;
import java.util.Queue;
public class Stutter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		int data[]= {3,4,6,7};
		Queue<Integer> q = new LinkedList<Integer>();
		for(int n:data) {
			q.add(n);
			System.out.println(q);
			stutter(q);
			System.out.println(q);
			
		}
		
		
	}
	public static void stutter(Queue<Integer> q) {
		int size = q.size();
		
		while(size > 0 ) {
			int temp = q.remove();
			q.add(temp);
			q.add(temp);
			size--;
		}
		
	}

}