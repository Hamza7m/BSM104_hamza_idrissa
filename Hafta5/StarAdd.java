import java.util.*;
public class StarAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		ArrayList<String> words = new ArrayList<String>();
		words.add("Hamza");
		words.add("idrissa ");
		words.add("bartin ");
		words.add("bilgisayar ");
		words.add("muhandisligi");
		
		
		for(int index = 0 ; index<= words.size(); index +=2) {
			words.add("*");
		}
		System.out.println("dongu sonrasinda " +words);
		System.out.println("dongu sonrasinda  dizinin uzunlugu = " +words.size());
		
		
		for(int index = 0 ; index<= words.size(); index +=2) {
			words.remove(index);
		}
		
		System.out.println("dongu sonrasinda " +words);
		System.out.println("dongu sonrasinda  dizinin uzunlugu = " +words.size());
		
		
	}

}
