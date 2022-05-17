import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner ;
import java.io.IOException;
import java.time.LocalDateTime; 
public class readFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      try {
    	  File myobj = new File("fruits.txt");
    	  Scanner Reader = new Scanner(myobj);
    	  while(Reader.hasNextLine()) {
    		  String data = Reader.nextLine();
    		  System.out.println(data);  
    	  }
       Reader.close();
      }catch(FileNotFoundException e){
    	  System.out.println("your file had an error ");
    	  e.printStackTrace();
      }
	}


}
