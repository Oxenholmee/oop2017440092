import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		//Animal aaa = new Animal();
		//Dog �籸 = new Dog();
		//aaa.sing();
		//�籸.sing();
		//�籸 = new Dog();
		//�籸.eat();
		//aaa.eat();
		//�캯�� Ŭ������ �º� Ŭ������ subclass�̸� ���� ���� ����. �캯<--�º�
		//Animal aaa = new Dog();
		Animal aaa = (Animal) new Dog();//13���ٰ� ���� (Upcasting)
		//overriding�� �޼ҵ带 ȣ���ϸ� subclass�� �޼ҵ带 �����Ѵ�.
		aaa.sing();//
		aaa = new Cat();
		aaa.sing();//16����18�� �� �� ���� �̸������� �����ϴ� ������ �ٸ���. �̸� ������(Polymorphism)�̶� �Ѵ�. 
		//������(Polymorphism)
		//1. �ϳ��� Ŭ�����κ��� ���� ����Ŭ������ ���� ���
		//2. ��� ����Ŭ������ ����Ŭ������ �޼ҵ带 override�Ѵ�.
		//3. SuperClass refVer = new SubClass();
		//4. superRefVar.overrideMethod() : ��ü�� Ŭ������ ������ �޼ҵ带 �����Ѵ�.
		Scanner ss = new Scanner(System.in);
		String str = ss.next();
		if (str.equals("dog")) aaa = new Dog();
		else aaa = new Cat();
		
		aaa.sing();
		
		
		int a = (int) 3.1;//�� ��ȯ(Type Casting)
		System.out.println(a);
	}
}