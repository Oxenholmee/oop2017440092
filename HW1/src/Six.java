import java.util.Scanner;

public class Six {

	public static void main(String[] args) {
		//6. � �� �ڸ� ���� �ڸ����� ������ ���� �ٲٴ� ���α׷��� �ۼ��Ͻÿ�.
		//����� �Է� : �� ���� �� �ڸ� ����
		//��� : �ڸ����� ������ �ݴ�� �� ����
		
		int ipt;
		int num1, num2;
		
		Scanner input = new Scanner(System.in);
		System.out.print("input two-digit interger: ");
		ipt = input.nextInt();
		
		num1 = ipt / 10;
		num2 = ipt % 10;
		System.out.print(num2);
		System.out.print(num1);
	}

}
