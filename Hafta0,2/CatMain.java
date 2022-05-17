
public class CatMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Cat kedi1 = new Cat();
       Cat kedi2 = new Cat();  
       System.out.println( kedi1.age +"," + kedi1.color + " , " + kedi1.name );
       System.out.println( kedi2.age +"," + kedi2.color + " , " + kedi2.name );
       
       Cat kedi3 = new Cat(2,"duman", "gri");
       System.out.println(kedi3.age +", "+  kedi3.color +" , "+ kedi3.name);
       
       Cat kedi4 = new Cat(4,"ates", "erkek");
       System.out.println(kedi3.age +", "+  kedi3.color +" , "+ kedi3.name);
	}

}
