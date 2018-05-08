
public class car {
//Field
	private String color;
	private int speed;
	
	public static int numberofcars = 0;//정적변수, ㄴㅅㅁ샻 랴딩
	//constructor(생성자): 메소드명이 클라스 이름과 같다. 반환형이 같다
	//만약 생성자를 정의하지 않으면 매개변수 없는 생성자를 자바에서 자동으로 생성해준다.
	//하지만 생성자를 하나라도 정의하면 자바는 아무일도 안한다.
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
	
	//정적 메소드는 정적 변수만 접근할 수 있다.
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
