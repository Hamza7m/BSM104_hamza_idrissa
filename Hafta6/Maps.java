import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Maps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Map<Integer,String> Citys = new TreeMap<Integer,String>();
		 
		// <key , value  > 
		
		Citys.put(12, "Istanbul");
		Citys.put(34, "Izmir");
		Citys.put(12, "Samsun");
		Citys.put(12, "Ankara");
		
		System.out.println(Citys);
		
		System.out.println("indekler - key " + Citys.keySet());
		System.out.println(Citys.values());
		System.out.println(Citys.get(12));
		
		Map<Integer,Set<String>> Citys2 = new HashMap<Integer,Set<String>>();
	    Citys2.put(23,new TreeSet<String>());
	    
	    Citys2.get(34).add("Istanbul");
	    Citys2.get(34).add("baris");
	    Citys2.get(34).add("moscow");
	    
	    Citys2.put(6,new TreeSet<String>());
	    Citys2.get(6).add("moscow");
	    Citys2.get(6).add("makke");
	    System.out.println(Citys2);
	}

}
