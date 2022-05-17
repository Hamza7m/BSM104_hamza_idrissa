import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.*;
public class Maps2 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
   	Map<String,Integer> wordCountMap = new HashMap<String,Integer>();
		
		Scanner input = new Scanner(new File("file.txt"));
		
		while(input.hasNext()) {
			
		String word =input.next().toLowerCase();
		
		      if(!wordCountMap.containsKey(word)) {
		    	  wordCountMap.put(word,1);
		      }else {
		    	  
		    	  int count= wordCountMap.get(word);
		    	  wordCountMap.put(word,count +1 ); 
		      }
	      
			
		}
		System.out.print(wordCountMap);
	
	}

}
