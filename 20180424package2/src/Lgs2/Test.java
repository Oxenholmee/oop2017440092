package Lgs2;

import Lgs1.*;

public class Test {

	public static void main(String[] args) {
		Basil abasil = new Basil();
		abasil.name = "Lily";
		//abasil.age = 2; Error: age is a private field
		
		// Ÿ ��Ű���� Ŭ������ ����Ϸ���
		//1. ��Ű����.Ŭ������
		//Lgs1.Dog aDog = new Lgs1.Dog();
		//2. import ��ɾ ���
		Dog aDog = new Dog();
		aDog.name = "ȫ��";
		//aDog.IDN = "1234"; Error: IDN is private Field
		//aDog.nickName = "kk"; Error: nickName�� Lgs1��Ű�� �׿����� public
		
		Animal aa = new Animal();
		//aa.protectedField = "ddd";
		
	
		
		
	}

}
