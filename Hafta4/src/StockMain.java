import java.util.*;
public class StockMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("ilk magaza ismi ");
		Scanner console = new Scanner (System.in);
		String store1 = console.next();
		Stock stock1 = new Stock (store1);
		int profit1 = makePurchases( stock1, console);
		
		System.out.print("ikinci magaza ismi ");
		String store2 = console.next();
		Stock stock2 = new Stock (store2);
		int profit2 = makePurchases( stock2, console);
		if(profit1 > profit2) {
			System.out.println(store1 + " daha yararlidir ");
			
		}else if(profit2 > profit1 ){
			System.out.println(store2 + "daha yararlidir");
		}else {
			System.out.println(store1 + " ve " + store2 + " esittir");
		}
		
	}
	

}
