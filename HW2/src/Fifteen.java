import java.util.Random;
import java.util.Scanner;

public class Fifteen {

	public static void main(String[] args) {
		//15. 1~100 ������ ���� �ϳ��� ���� ��(�������� �����ص� ��), 10�� �̳��� �� ���ڸ� ���ߴ� ������ �ۼ��Ͻÿ�.(10�� �̳��� �� ���߾��� ���� �ణ �Ӹ��� ������ ����̹Ƿ� Game Over ó���� �Ŷ��ϰ� �� �ֱ� �ٶ�)
		//�����߻������ �˻��ؼ� �˾Ƴ½��ϴ�.

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