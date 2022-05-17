import java.util.ArrayList;
public class kisiMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		ArrayList<kisi> bireyler = new ArrayList<>();
		bireyler.add(new kisi("hamza",23));
		bireyler.add(new kisi("idrissa",26));
		bireyler.add(new kisi("furkan",73));
		
		for(kisi birey:bireyler) {
			System.out.print("isim " +birey.getisim()+ " yas " + birey.getyas() );
		}
	}

}
