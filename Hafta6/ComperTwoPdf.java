import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.IOException;

public class ComperTwoPdf {
    public static void ComperFile() throws IOException{
    	
      File file1 = new File("C:\\Users\\Win10\\eclipse-workspace\\Uygulama_hafta6\\src\\txt2")	;
      File file2 = new File("C:\\Users\\Win10\\eclipse-workspace\\Uygulama_hafta6\\src\\txt1")	;
      
      
      FileReader r1 = new FileReader(file1);
      FileReader r2 = new FileReader(file2);
      
      BufferedReader reader1 = new BufferedReader(r1);
      BufferedReader reader2 = new BufferedReader(r2);
      
      String str1 = reader1.readLine();
      String str2 = reader2.readLine();
      
      boolean durum = false ; 
      int lineNum  = 1; 
     while(str1 != null && str2 !=null) {
    	if(str1.equalsIgnoreCase(str2)) {
    		durum = true ;
    		lineNum++; 
    	}else {
    		durum = false ; 
    		break ; 
    	}
    	
    	 str1 = reader1.readLine();
         str2 = reader2.readLine();
    
       	  
     }
    	
         if(durum) {
        	 System.out.println(" dosyalar esttir");
         }else {
        	 System.out.print("iki dosyalar ayni degildir   satirda " + lineNum);
         }
     
    }
    
    
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		ComperFile();
		
	}

}
