import java.util.Scanner;

public class Two {

	public static void main(String[] args) {
		//2. �ϳ��� ������ �Է� �޾� �� ���� ¦��(even number)���� Ȧ��(odd number)������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		int num;
		
		System.out.print("input interger: ");
		Scanner input = new Scanner(System.in);
		num = input.nextInt();
		
		if(num%2==1)
			System.out.print("it is odd number.");
		else
			System.out.print("it is even number.");
	}
}