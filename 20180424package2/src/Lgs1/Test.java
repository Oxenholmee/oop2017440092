package Lgs1;

public class Test {

	public static void main(String[] args) {
		Dog �籸 = new Dog();
		�籸.print();
		�籸.name = "�籸";
		//�籸.IDN = "12345678"; Error: IDN is Private
		�籸.nickName = "�۸�";
		�籸.publicField = "U2";
		//�籸.privateField = "Sting"; Error: privateField is a private Field
		�籸.pakageField = "Ed";
		�籸.protectedField = "Beatles";
		�籸.print();
		
		Animal aa = new Animal();
		aa.protectedField = "ddd";
	}

}