import java.util.Scanner;

public class One {

	public static void main(String[] args) {
		//1. �� ��(����)�� �Է� �޾�, �� �� ū ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		int a, b;
		
		Scanner input = new Scanner(System.in);
		System.out.print("ù ���� ������ �Է��ϼ���: ");
		a = input.nextInt();
		System.out.print("�� ��° ������ �Է��ϼ���: ");
		b = input.nextInt();
		
		if (a>b)
			System.out.print("a�� Ů�ϴ�.");
		else
			System.out.print("b�� Ů�ϴ�.");
		System.out.println("===============���α׷� ����===============");
	}
}