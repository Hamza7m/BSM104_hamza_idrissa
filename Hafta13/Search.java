package uygulama_Hafta13;

public class Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[]numbers = {63,18,51,37,29,49,42,11};
       int[]nmber2 = {11,18,29,37,42,49,51,63};
       
       int index = indexOf2(numbers, 63);
       if(index != -1) {
    	   System.out.println("Eleman index : " + index);
       }else {
    	   System.out.println("Eleman bulunmadi ");  
       }
       
	}
  public static int indexOf2(int []numbers , int target) {
	  int i = 0; 
	  while(i < numbers.length && numbers[i]<=target) {
		  if(numbers[i]== target) {
			  return i ;
			  
		  }else {
			  i++;
		  }
		 
	  }
	  return -1 ; 
  }
}
