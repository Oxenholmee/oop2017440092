import java.util.Scanner;

public class Thirteen {

	public static void main(String[] args) {
		//13. month�� day�� �Է� �޾�, 1�� 1�Ϻ����� �� day���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. (switch�� ���) //1�� 20���� 20�� ���, 2�� 5���� 36�� ���. �� 2���� 28�Ϸ� ���.
		
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
