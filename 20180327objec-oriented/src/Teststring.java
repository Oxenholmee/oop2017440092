
public class Teststring {

	public static void main(String[] args) {
		int a = 10;//string ��ü ���� ���
		String str;//Ŭ�� ��Ʈ���� ��ü�� ������ �� �ִ� ���� ����(���۷��� ����) ����(class type)
		str = new String("Hello darkness my old friend.");//��ü ����
		System.out.println(str);
		
		//String ��ü�� ����
		//�޼ҵ� ȣ�� ���: ��������.�޼ҵ�
		int len = str.length();
		System.out.println("string legth is " + len);
		
		String str1;
		str1 = str.toUpperCase();
		System.out.println("Uppercase: " + str1);
	}
}