import java.util.Scanner;

public class Three {

	public static void main(String[] args) {
		//3. �� ��(������)�� �Է� �޾� ���� ū ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		int a, b, c;
		
		Scanner input = new Scanner(System.in);
		System.out.print("input first interger: ");
		a = input.nextInt();
		System.out.print("input second interger: ");
		b = input.nextInt();
		System.out.print("input third interger: ");
		c = input.nextInt();
		
		if(a>b)
			if(a>c)
				System.out.print("the biggest number is " + a);
			else
				System.out.print("the biggest number is " + c);
		else
			if(b>c)
				System.out.print("the biggest number is " + b);
			else
				System.out.print("the biggest number is " + c);
	}
}
