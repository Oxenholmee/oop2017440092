
public class Twenty_Three {

	public static void main(String[] args) {
		//23.***** *
		//   *** ***
		//   * *****
		//�� ����Ͻÿ�(�ݺ��� �Ἥ!)
		
		int i,j;
		
		for(i=3; i>0; i--) {
			for(j=1; j<=2*i-1; j++) {
			System.out.print("*");
			}//������ 5, ������ -2�� ����������ŭ ���
			System.out.print(" ");
			for(j=1; j<=7-2*i; j++) {
				System.out.print("*");
			}//6���� �� for������ ����� ���� �� ���� ���
			System.out.print("\n");
		}
	}
}