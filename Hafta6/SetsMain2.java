import java.util.*;
import java.io.File;
import java.util.HashMap;
import java.util.Set;
public class SetsMain2 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
	      Set<String> word = new HashSet<String>();
	      word = reads();
		  System.out.println(word);
	       
			for(String words : reads()) {
				word.add(words);
				System.out.println(words);
			}
	   
	}
	
	public static Set<String> reads() throws FileNotFoundException {
		
		System.out.println("okumak istedigin dosya giriniz : ");
		Scanner input = new  Scanner(System.in);
		String file = input.next();
		Scanner in = new Scanner(new File(file));
		
		Set<String> temp = new HashSet<String>();
		
		while(in.hasNext()) {
			String word = in.next().toLowerCase();
			temp.add(word);
			return temp;
		      	
		}
		return temp;
	}

}
