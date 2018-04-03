import java.util.Scanner;

public class Six {

	public static void main(String[] args) {
		//6. 어떤 두 자리 수의 자릿수의 순서를 서로 바꾸는 프로그램을 작성하시오.
		//사용자 입력 : 한 개의 두 자리 정수
		//출력 : 자릿수의 순서가 반대로 된 정수
		
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
