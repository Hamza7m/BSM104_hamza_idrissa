import java.time.LocalTime;
import java.time.LocalDateTime ;
import java.io.File;
import java.util.ArrayList ; 
import java.util.Collections; 
import java.io.IOException;
public class FliCreat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    try {
    	LocalDateTime history =  LocalDateTime.now(); 
     File myFile = new File("fruits.txt");
     if(myFile.createNewFile()) {
    	 System.out.println(" the file had created " + myFile.getName());
     }else {
    	 System.out.println(" your  file has existed  " + " " +   myFile.getName()+ " in " +  history);
     }
    	
    }catch(IOException e ){
    	System.out.println("An error has created   " );
    	e.printStackTrace();
    }
    
	}

}
