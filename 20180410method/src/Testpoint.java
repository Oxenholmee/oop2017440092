
public class Testpoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double result;
		Point pnt1 = new Point();
		pnt1.setX(1.0);
		pnt1.setY(1.0);
		Point pnt2 = new Point();
		pnt2.setX(2.0);
		pnt2.setY(2.0);
		System.out.println(pnt1);
		System.out.println(pnt2);
		System.out.println(pnt1.distance());
		System.out.println(pnt2.distance());
		//method overloading: �޼ҵ� �̸��� ����������, �Ű������� ȣ���� �޼ҵ带 ������ �� �ִ�.
		System.out.println(pnt2.distance(pnt1));
	}
}