package uygulama_Hafta7;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int data[]= {1,3,5,7,8,6,4};
       	Queue<Integer> q = new LinkedList<Integer>();
       	for(int n:data) {
       		q.add(n);
       		System.out.println("queue = "+q);
       		removeAll(q,4);
       		System.out.println("queue = " + q);
       		
       	}
	}
       	public static void removeAll(Queue<Integer> q , int value) {
       		int size  = q.size();
       		for(int i= 0 ;i<size;i++) {
       			int n = q.remove();
       			System.out.println(n + "elemany cikarildi ");
       			System.out.println(n + "current queue = "+ q);
       			if(n!=value) {
       				q.add(n);
       				System.out.println(n + "eklendi");
       			}
       			
       			
       		}
       	}
       	
	}


