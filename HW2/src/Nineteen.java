import java.util.Scanner;

public class Nineteen {

	public static void main(String[] args) {
		//19. 사용자로부터 한 숫자를 입력받아, 입력받은 숫자가 소수인지 아닌지를 검사하는 프로그램을 작성하시오.
		
		int ipt;
		int i;
		int count=0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("input interger: ");
		
		ipt=input.nextInt();
		
		for(i=1; i<=ipt; i++) {
			if(ipt % i != 0)
				continue;
			count++;
		}
		if(count==2)//1과 자기 자신
			System.out.println("It is a prime number.");
		
		else
			System.out.println("It is not a prime number.");
		}
    }