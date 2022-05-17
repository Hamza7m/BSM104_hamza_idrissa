package uygulama_Hafta8;

public class ReferenceMystery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String name = "janet";
    int money = 30; 
    Account a = new Account(name,money);
    
    mystery(name,money,a);
    System.out.println(name + " , "  +money + ", " +a);
    money +=10;
    a.name="BILLY";
    System.out.println(name + " , "  +money + ", " +a);
    
	}
   public static void mystery(String name ,int money, Account a) {
	   a.money++;
	   name = "susan";
	   System.out.println(name + ", " + money + " , " + a);
   }
}
