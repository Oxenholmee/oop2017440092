
public class car {
//Field
	private String color;
	private int speed;
	
	public static int numberofcars = 0;//��������, �������� ����
	//constructor(������): �޼ҵ���� Ŭ�� �̸��� ����. ��ȯ���� ����
	//���� �����ڸ� �������� ������ �Ű����� ���� �����ڸ� �ڹٿ��� �ڵ����� �������ش�.
	//������ �����ڸ� �ϳ��� �����ϸ� �ڹٴ� �ƹ��ϵ� ���Ѵ�.
	public car(String color, int speed) {
		this.color = color;
		this.speed = speed;	
		numberofcars++;
	}
	public car() {
		
	}


//method
	public String toString() {
	return ("color is " + this.color + ". Speed is " + this.speed);
	}
	
	//���� �޼ҵ�� ���� ������ ������ �� �ִ�.
	public static void print() {
	//	System.out.println(this.color + ", " + this.speed); - error
		System.out.println(numberofcars);
	}
	

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}


	
}
