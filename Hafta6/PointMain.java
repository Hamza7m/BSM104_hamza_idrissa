import java.util.HashSet;

public class PointMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Set<point> points = new HashSet<point>();
		
		point pi= new point(2,45);
		points.add(pi);
		points.add(new point(43,100));
		points.add(new point(3,300));
		
		System.out.println(points);
		for(point p:points ) {
			System.out.println(points);
		}
		
	}

}
