import java.util.Scanner;

public class Two {

	public static void main(String[] args) {
		//2. 하나의 정수를 입력 받아 이 수가 짝수(even number)인지 홀수(odd number)인지를 출력하는 프로그램을 작성하시오.
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