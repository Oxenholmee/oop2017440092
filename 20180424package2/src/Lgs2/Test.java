package Lgs2;

import Lgs1.*;

public class Test {

	public static void main(String[] args) {
		Basil abasil = new Basil();
		abasil.name = "Lily";
		//abasil.age = 2; Error: age is a private field
		
		// 타 패키지의 클래스를 사용하려면
		//1. 패키지명.클래스명
		//Lgs1.Dog aDog = new Lgs1.Dog();
		//2. import 명령어를 사용
		Dog aDog = new Dog();
		aDog.name = "홍구";
		//aDog.IDN = "1234"; Error: IDN is private Field
		//aDog.nickName = "kk"; Error: nickName은 Lgs1패키지 네에서만 public
		
		Animal aa = new Animal();
		//aa.protectedField = "ddd";
		
	
		
		
	}

}
