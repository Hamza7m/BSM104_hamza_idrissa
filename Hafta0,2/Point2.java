
public class Point2 {
 
	int x ; 
	int y ; 
	public double distinceFromOrigin() {
		
		return Math.sqrt(x*x + y*y);
	}
	
	public void traslate (int dx , int dy) {
		
		x += dx;
		y += dy;
	}
}
