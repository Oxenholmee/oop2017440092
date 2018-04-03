import java.util.Scanner;

public class Three {

	public static void main(String[] args) {
		//3. 세 수(정수형)를 입력 받아 가장 큰 수를 출력하는 프로그램을 작성하시오.
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
