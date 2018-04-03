import java.util.Scanner;

public class One {

	public static void main(String[] args) {
		//1. 두 수(정수)를 입력 받아, 그 중 큰 수를 출력하는 프로그램을 작성하시오.
		int a, b;
		
		Scanner input = new Scanner(System.in);
		System.out.print("첫 번쨰 정수를 입력하세요: ");
		a = input.nextInt();
		System.out.print("두 번째 정수를 입력하세요: ");
		b = input.nextInt();
		
		if (a>b)
			System.out.print("a가 큽니다.");
		else
			System.out.print("b가 큽니다.");
		System.out.println("===============프로그램 종료===============");
	}
}