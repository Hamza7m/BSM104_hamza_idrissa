import java.io.File; 
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class WordCount {

	public static void main(String[] args)throws FileNotFoundException {
		// TODO Auto-generated method stub
		CountWord();
	}
	
	public static void CountWord() throws FileNotFoundException {

			 File yeni = new File ("words.txt");
			 Scanner input= new Scanner(new File(yeni));
			 Set<String> words = new HashSet<String>();
			 
			 while(input.hasNext()) {
				 String word= input.nextLine().toLowerCase();
				 words.add(word);
				 
		}
			 System.out.println(" kelimeler :  " + words );
			 System.out.println(" kelimeler :  " +  words.size());
	}
		 	
}

}
