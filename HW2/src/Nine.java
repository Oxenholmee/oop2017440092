import java.util.Scanner;

public class Nine {

	public static void main(String[] args) {
		//위의 문제에서 1부터 9사이 이외의 숫자를 사용자가 잘못 입력할 수도 있으니, 이 경우에 잘못된 숫자라는 것을 알려주는 에러 메시지를 출력하고 다시 숫자를 입력 받도록 처리하시오.(입력의 유효성 검사)
		
		int ipt;
		int i;
		
		Scanner input = new Scanner(System.in);
		System.out.println("if you input 0, program ends.");
		
		while(true) {
			System.out.print("input interger between 1 to 9: ");
			ipt = input.nextInt();
			if(ipt>=10) {
				System.out.println("It is bigger than 10. Please try again.");
				continue;
				}
			for(i=1; i<10; i++) {
				System.out.println(ipt + "X" + i + "=" + ipt*i);
			}
			if(ipt==0)
				break;
			}
		}
	}
