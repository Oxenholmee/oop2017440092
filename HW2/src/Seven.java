import java.util.Scanner;

public class Seven {

	public static void main(String[] args) {
		//7. 0이 입력될 때까지 계속 정수를 입력 받고, 입력된 모든 숫자들의 총합을 출력하시오.
		
		int ipt=0;
		int sum=0;
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.print("input interger: ");
			ipt = input.nextInt();
			sum = sum + ipt;
			if(ipt == 0)
				break;
		}
		System.out.println(sum);
	}
}