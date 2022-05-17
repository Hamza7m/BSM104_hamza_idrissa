
public class PointMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Point point1 = new Point();
          Point point2 = new Point();
          System.out.println(point1.x + point1.y) ;
          
          
          double dist = Math.sqrt(point1.x*point1.x + point1.y *point1.y);
          
          
          point1.x +=10 ;
          point1.y +=5;
          
          point2.x +=34;
          point2.y +=9 ;
          
          System.out.println(point1.x + point1.y );
          System.out.println(point2.x + point2.y );
	}

}
