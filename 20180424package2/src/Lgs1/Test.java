package Lgs1;

public class Test {

	public static void main(String[] args) {
		Dog 犁备 = new Dog();
		犁备.print();
		犁备.name = "犁备";
		//犁备.IDN = "12345678"; Error: IDN is Private
		犁备.nickName = "港港";
		犁备.publicField = "U2";
		//犁备.privateField = "Sting"; Error: privateField is a private Field
		犁备.pakageField = "Ed";
		犁备.protectedField = "Beatles";
		犁备.print();
		
		Animal aa = new Animal();
		aa.protectedField = "ddd";
	}

}