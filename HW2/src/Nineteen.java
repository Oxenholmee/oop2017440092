import java.util.Scanner;

public class Nineteen {

	public static void main(String[] args) {
		//19. ����ڷκ��� �� ���ڸ� �Է¹޾�, �Է¹��� ���ڰ� �Ҽ����� �ƴ����� �˻��ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
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
		if(count==2)//1�� �ڱ� �ڽ�
			System.out.println("It is a prime number.");
		
		else
			System.out.println("It is not a prime number.");
		}
    }