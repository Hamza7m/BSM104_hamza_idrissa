import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
public class Set1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList<String>  list = new ArrayList<String>();
    
    list.add("kalem");
    list.add("bilgisayar");
    list.add("bartin");
    list.add("muhandislik");
    
    list.add(3,"hamza ");
    
    System.out.println(list);
    
    Set<String> sets = new TreeSet<String>();
    
    System.out.println(list);
    System.out.println(sets.contains("bartin"));
   
    sets.clear();
    sets.addAll(list);
    
	}

}
