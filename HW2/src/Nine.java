import java.util.Scanner;

public class Nine {

	public static void main(String[] args) {
		//���� �������� 1���� 9���� �̿��� ���ڸ� ����ڰ� �߸� �Է��� ���� ������, �� ��쿡 �߸��� ���ڶ�� ���� �˷��ִ� ���� �޽����� ����ϰ� �ٽ� ���ڸ� �Է� �޵��� ó���Ͻÿ�.(�Է��� ��ȿ�� �˻�)
		
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
