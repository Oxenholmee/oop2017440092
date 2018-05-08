import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		//Animal aaa = new Animal();
		//Dog 재구 = new Dog();
		//aaa.sing();
		//재구.sing();
		//재구 = new Dog();
		//재구.eat();
		//aaa.eat();
		//우변의 클래스가 좌변 클래스의 subclass이면 전혀 문제 없다. 우변<--좌변
		//Animal aaa = new Dog();
		Animal aaa = (Animal) new Dog();//13번줄과 동일 (Upcasting)
		//overriding한 메소드를 호출하면 subclass의 메소드를 실행한다.
		aaa.sing();//
		aaa = new Cat();
		aaa.sing();//16변과18번 둘 다 같은 이름이지만 시행하는 내용은 다르다. 이를 다형성(Polymorphism)이라 한다. 
		//다형성(Polymorphism)
		//1. 하나의 클래스로부터 여러 서브클래스를 만들 경우
		//2. 모든 서브클래스는 수퍼클래스의 메소드를 override한다.
		//3. SuperClass refVer = new SubClass();
		//4. superRefVar.overrideMethod() : 객체의 클래스가 구현한 메소드를 실행한다.
		Scanner ss = new Scanner(System.in);
		String str = ss.next();
		if (str.equals("dog")) aaa = new Dog();
		else aaa = new Cat();
		
		aaa.sing();
		
		
		int a = (int) 3.1;//형 변환(Type Casting)
		System.out.println(a);
	}
}