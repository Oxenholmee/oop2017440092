
public class Point {
	//Field
	private double x;
	private double y;
	
	//method
	public String toString() {
		return  ("(" + this.getX() + ", " + this.getY() + ")");
	}
	public void print() {
		System.out.println("(" + this.getX() + ", " + this.getY() + ")");
	}
	
	public double distance () {
		double result;
		
		result = Math.sqrt(x*x+y*y);
		return result;
	}
	//method overloading
	public double distance(Point p) {
		return Math.sqrt((this.x-p.getX())*(this.x-p.getX())+(this.y-p.getY())*(this.y-p.getY()));
	}
	
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
}