import java.util.Random;
import java.util.Scanner;

public class Fifteen {

	public static void main(String[] args) {
		//15. 1~100 사이의 숫자 하나를 정한 뒤(랜덤으로 생성해도 됨), 10번 이내로 그 숫자를 맞추는 게임을 작성하시오.(10번 이내로 못 맞추었을 경우는 약간 머리가 딸리는 사람이므로 Game Over 처리를 신랄하게 해 주기 바람)
		//난수발생기능은 검색해서 알아냈습니다.

		int ipt;
		int i;
		int num;
		
		Random rg = new Random();
		num = rg.nextInt(100);
		
		Scanner input = new Scanner(System.in);
		System.out.println("Game Start");
		System.out.println("Game will set a random number. It will give you a 10 chances to predict.\nIt will tell you the number is higher or lower than your prediction.\nIf you can't get number in 10 times, you will lose.");
		
		for(i=1; i<=11; i++) {
			System.out.println("Chance "+i);
			System.out.print("input number: ");
			ipt = input.nextInt();
			if(i>=10) {
				System.out.println("The Answer was " + num + "\nYou lose. \nGame Over.");
				break;
			}
			if(ipt>num) {
				System.out.println("It is lower than that.\n");
				continue;
			}
			if(ipt<num) {
				System.out.println("It is higher than that.\n");
				continue;
			}
			if(ipt==num) {
				System.out.println("Correct Answer.\nYou Win.");
				break;
			}		
		}
	}
}