
public class Test {

	public static void main(String[] args) {
		
		Point p;
		p = new Point(); // 포인트 객체 생생 및 레퍼런스 p에 저장
		
		//객체의 필드 접근
		//p.x = 1.0;
		//p.y = 1.0;
		
		double temp = 1.0;
		
		
		p.setX(temp);
		System.out.println("temp=" + temp);
		
		p.setY(temp);
		
		System.out.println(p.getX());
		
		System.out.println(p.distance());//p객체의 distance() 츨력
	}
}