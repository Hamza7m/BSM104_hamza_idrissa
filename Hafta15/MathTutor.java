import java.util.*;
public class MathTutor {

	public static void main(String[] args) {
		Scanner console = new Scanner (System.in);
			
			giveProblems(console, 3, "*", (x,y) -> x*y);

			}

			
		public static void giveProblems(Scanner console,int numProblems , String text , IntBinaryOperator operator) {
			
			Random rnd = new Random();
			
			int numRight = 0 ;
			for (int i = 0 ; i < numProblems; i++) {
				
				int x = rnd.nextInt(12)+1;
				int y = rnd.nextInt(12)+1 ;
				System.out.println(x+ " " + text + " " + y + " =  ");
				int answer = operator.applyAsInt(x, y);
				int response= console.nextInt();
				
				if (response ==answer) {
					System.out.println("dogru");
					
					numRight++;
				}
				else 
					System.out.println("yanls cevap" + answer);
				
			}
			System.out.println(numProblems+" cevaptan dogru sayisi : " + numRight );
		}
}