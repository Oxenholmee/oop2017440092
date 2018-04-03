import java.util.Scanner;

public class Eleven {

	public static void main(String[] args) {
		//11. 위의 문제를 0을 입력하기 전까지는 계속 수행(인수 출력)하도록 수정하시오.
		
		int ipt;
		int i;
		
		Scanner input = new Scanner(System.in);
		System.out.println("if you input 0, program ends.");
		
		while(true) {
			System.out.print("input interger: ");
			ipt = input.nextInt();
			
			for(i=2; i<ipt; i++) {
				if(ipt%i != 0)
					continue;
				System.out.print(i + " ");
			}
			System.out.print("\n");
			if (ipt == 0)
				break;
		}
	}
}
