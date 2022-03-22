import java.nio.channels.IllegalChannelGroupException;
import java.util.*;
public class Stock {

	private int totalPoduct ; 
	private String store ; 
	private int totalCost ; 
	Scanner cosole = new Scanner (System.in);
	public Stock(String thestore) {
		if(thestore== null) {
			throw new NullPointerException();
		}
		store = thestore ; 
		totalPoduct = 0;
		totalCost = 0 ; 
	}
	
	public int getProfit(int currentPrice) {
		if(currentPrice < 0 ) {
			throw new IllegalArgumentException();
		}
		int marketValue = totalPoduct * currentPrice ; 
		return marketValue - totalCost ; 
	}
	
	public void purchase (int shares , int pricePriceshare) {
		if(shares < 0 || pricePriceshare < 0 ) {
			throw new IllegalChannelGroupException();
			
		}
		totalPoduct += shares ; 
		totalCost += shares * pricePriceshare ;
	}
	
	public static int makePurchases (Stock currentStock , Scanner console ) {
		System.out.println("kac kez satin alma yaptiniz ");
		int numPurchases = console.nextInt();
		for(int i=1 ; i<=numPurchases; i++) {
			System.out.println(i + " aldiniz kac tane alin ? birim fiyat nedir  ");
			int numShares = console.nextInt() ; 
			int pricePershare = console.nextInt() ;
			currentStock.purchase(numShares, pricePershare);
           			
		}
		System.out.print("guncel birim fiyat ? : ");
		int currentPrice =console.nextInt();
		int profit = currentStock.getProfit(currentPrice);
		System.out.print("net kazanc / kayip : "+  profit + "TL" ) ;
		System.out.println();
		
		
		return profit;
}
	
	
	
	
	
}
