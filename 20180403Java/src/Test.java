
public class Test {

	public static void main(String[] args) {
		
		Point p;
		p = new Point(); // ����Ʈ ��ü ���� �� ���۷��� p�� ����
		
		//��ü�� �ʵ� ����
		//p.x = 1.0;
		//p.y = 1.0;
		
		double temp = 1.0;
		
		
		p.setX(temp);
		System.out.println("temp=" + temp);
		
		p.setY(temp);
		
		System.out.println(p.getX());
		
		System.out.println(p.distance());//p��ü�� distance() ����
	}
}