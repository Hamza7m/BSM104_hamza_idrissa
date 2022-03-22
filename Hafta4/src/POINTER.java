
public class POINTER {
 
	private int x ;
	private int y ;
	  
	
	public int getx() {
		return x ; 
		
	}
	
	public void setLocation(int newx , int newy){
		x = newx;
		y = newy; 
	}
	
	public int gety() {
		return y ; 
	}
	
	public POINTER(int X, int Y) {
		setLocation(X,Y);
		
	}
	
	public double distace() {
		return Math.sqrt(x*x + y*y);
	}
	
	public void traslate (int dx,int dy) {
		setLocation(x+dx , y+dy);
	}
	
	public String tostring() {
		return "(+ x  + +y ) ";
	}
	
	
}
