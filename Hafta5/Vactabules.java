import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner;
import java.util.ArrayList; // import the ArrayList class
public class Vactabules {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (new File("fruits.txt"));
		int a = 5 ; 
		int b = 4 ; 
		ArrayList<String> list = new ArrayList<String>();
		System.out.println(list);
		
		
	    
	}
	
//	public static ArrayList<String> getwords( Scanner input){
//		return null ; 
//	}
	
	
	public static ArrayList<String> getwords(Scanner input ){
		
	    ArrayList<String> words = new ArrayList<String>(); /// ne iþ yara bu objec 
	    while(input.hasNext()) {
	    	String next = input.next().toLowerCase();
	    	if(!words.contains(next)) {
	    		words.add(next);	    	
	    		}
	    }
	    return words ; 
	}

}
