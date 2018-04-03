import java.util.Scanner;

public class Twenty_One {

	public static void main(String[] args) {
		//21. 사용자로부터 한 숫자를 입력받아, 입력받은 숫자 이하의 소수들의 합을 구하는 프로그램을 작성하시오.
		
		int ipt;
		int i,j;
		int count=0;
		int sum=0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("input interger: ");
		
		ipt=input.nextInt();
		
		for(i=1; i<=ipt; i++) {
			for(j=1; j<=i; j++) {
				if(i % j != 0)
					continue;
				count++;
				}
			if(count==2)
				sum=sum+i;
			}
		System.out.println(sum);
		}
}