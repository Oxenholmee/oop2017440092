
public class Twenty_Five {

	public static void main(String[] args) {
		//25.다음과 같은 출력이 나오도록 프로그램을 작성하시오.
		//(1)*********** (2)54321012345
		//   *********      432101234
		//   *******        3210123
		//   *****          21012
		//   ***            101
		//   *              0
		//   ***            101 
		//   *****          21012 
		//   *******        3210123 
		//   *********      432101234 
		//   ***********    54321012345
		
		int i,j;
		
		System.out.println("(1)");
		for(i=6; i>0; i--) {
			for(j=1; j<=2*i-1; j++) {
			System.out.print("*");
			}
			System.out.print("\n");
		}
		for(i=2; i<=6; i++) {
			for(j=1; j<=2*i-1; j++) {
			System.out.print("*");
			}
			System.out.print("\n");
		}
		
		System.out.println("(2)");
		for(i=0; i<=10; i++) {
			for(j=0; j<Math.abs(i-5)*2+1; j++) {
			System.out.print(Math.abs(j-Math.abs(i-5)));
			}
			System.out.print("\n");
		}
	}
}