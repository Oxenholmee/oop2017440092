import java.util.Scanner;

public class Eleven {

	public static void main(String[] args) {
		//11. ���� ������ 0�� �Է��ϱ� �������� ��� ����(�μ� ���)�ϵ��� �����Ͻÿ�.
		
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
