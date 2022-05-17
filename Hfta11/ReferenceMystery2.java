package uygulama_Hafta11;

public class ReferenceMystery2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int hp =10;
    Pokemon squirtle = new pokemon(5);
    battle(squirtle , hp);
    System.out.println("level" + squirtle + "," + hp + "hp" );
     hp= hp+ squirtle.level ;
     battle(squirtle , hp + 1);
     System.out.println("level" + squirtle + "," + hp + "hp" );
     
     

	}
	public static void battle (Pokemon poke , int hp) {
		poke.level++;
		hp -= 5;
		 System.out.println("level" + poke.level + "," + hp + "hp" );
	}

}
