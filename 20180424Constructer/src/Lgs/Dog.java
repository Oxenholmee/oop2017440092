package Lgs;

public class Dog extends Animal {
	public Dog() { //����Ʈ ������
		super(); //����� ����Ŭ������ ������ ȣ��
		System.out.println("Dog ������");
	}
	public Dog(int a) {
		super(a); //����� ����Ŭ������ ������ ȣ��
		System.out.println("Dog ������ ������");
	}

}