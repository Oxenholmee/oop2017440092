package Lgs;

public class Dog extends Animal {
	public Dog() { //디폴트 생성자
		super(); //명시적 수퍼클래스의 생성자 호출
		System.out.println("Dog 생성자");
	}
	public Dog(int a) {
		super(a); //명시적 슈퍼클래스의 생성자 호출
		System.out.println("Dog 정수형 생성자");
	}

}