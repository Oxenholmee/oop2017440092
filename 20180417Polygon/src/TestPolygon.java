
public class TestPolygon {

	public static void main(String[] args) {
		Triangle tri = new Triangle();
		Rectangle rec = new Rectangle();
		tri.height = 2.0;
		tri.width = 3.0;
		rec.height = 2.0;
		rec.width = 3.0;
		
		System.out.println(tri.area());
		System.out.println(rec.area());
	}

}
