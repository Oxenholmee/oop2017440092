
public class Testcar {

	public static void main(String[] args) {
		car mycar = new car("space blue", 300);
		car yourcar = new car();
		//mycar.setColor("black");
		//mycar.setSpeed(100);
		System.out.println(mycar);
		System.out.println(mycar.numberofcars);
		//정적변수는 "클라스명.정적변수명"으로도 접근할 수 있다.
		System.out.println(car.numberofcars);
		System.out.println(Math.cos(0));//Math.cos() 객체를 지정하지 않아도 사용할 수 있는 메소드
	}

}
