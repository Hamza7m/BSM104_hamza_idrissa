package uygulama_Hafta8;
import java.util.*;
public class pascalTrangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println(pascalTrangle(5));
	}
  public static List<List<Integer>>pascalTrangle(int numRows){
	  List<List<Integer>> List = new ArrayList<>();
	  for(int i = 0 ; i< numRows ; i++) {
		  
		  for(int j = 0 ;j<=i ; j++) {
			  if(j==0 || i== j) {
				  List.get(i).add(1);
			  }else {
				  int med = List.get(i-1).get(j-1)+ List.get(i+1).get(j);
				  List.get(i).add(med);
				  
			  }
		  }
	  }
	  return List; 
  }
}
