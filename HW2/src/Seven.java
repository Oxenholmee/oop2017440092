import java.util.Scanner;

public class Seven {

	public static void main(String[] args) {
		//7. 0�� �Էµ� ������ ��� ������ �Է� �ް�, �Էµ� ��� ���ڵ��� ������ ����Ͻÿ�.
		
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