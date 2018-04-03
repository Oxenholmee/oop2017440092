import java.util.Scanner;

public class Thirteen {

	public static void main(String[] args) {
		//13. month와 day를 입력 받아, 1월 1일부터의 총 day수를 출력하는 프로그램을 작성하시오. (switch문 사용) //1월 20일은 20일 출력, 2월 5일은 36일 출력. 단 2월은 28일로 계산.
		
		int month;
		int date;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("input month: ");
		month = input.nextInt();
		
		System.out.print("input date: ");
		date = input.nextInt();
		
		switch(month) {
		case 1:
			System.out.println(date);
			break;
		case 2:
			System.out.println(date+31);
			break;
		case 3:
			System.out.println(date+59);
			break;
		case 4:
			System.out.println(date+90);
			break;
		case 5:
			System.out.println(date+120);
			break;
		case 6:
			System.out.println(date+151);
			break;
		case 7:
			System.out.println(date+181);
			break;
		case 8:
			System.out.println(date+212);
			break;
		case 9:
			System.out.println(date+243);
			break;
		case 10:
			System.out.println(date+273);
			break;
		case 11:
			System.out.println(date+304);
			break;
		case 12:
			System.out.println(date+334);
			break;
		}
	}
}
