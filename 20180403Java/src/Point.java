
public class Point {
	//�ʵ��� Scope(��ȿ����)�� Ŭ���� �����̴�.
	public double x;
	public double y;
	
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	
	
	public void setX(double xx) {
		this.x = xx;
	}
	public void setY(double yy) {
		this.y = yy;
	}
	
	
	public double distance() {
		//��ȯ�� ���� ����
		double result;//���� ������ ��ȿ������ �޼ҵ� ����
		
		//�Ÿ����
		result = Math.sqrt(x*x + y*y);
		
		//�Ÿ���ȯ
		return result;
	}
	
	public Point move(Point p) { //�Ű����� P�� ��ȿ������ �޼ҵ� �����̴�./
		//tempt ���� ����
		double a;
		double b;
		
		//����Ʈ p��ŭ �̵�
		a = this.x + p.x;
		b = this.y + p.y;
		
		//���ο� ����Ʈ ����
		Point pnt = new Point();
		pnt.x = a;
		pnt.y = b;
		
		//���ο� ����Ʈ ��ȯ
		return pnt;
	}
}
//c: move(p1, p)
//java: p1 move(p)