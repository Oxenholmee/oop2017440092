
public class Twenty_Three {

	public static void main(String[] args) {
		//23.***** *
		//   *** ***
		//   * *****
		//를 출력하시오(반복문 써서!)
		
		int i,j;
		
		for(i=3; i>0; i--) {
			for(j=1; j<=2*i-1; j++) {
			System.out.print("*");
			}//초항이 5, 등차가 -2인 등차수열만큼 출력
			System.out.print(" ");
			for(j=1; j<=7-2*i; j++) {
				System.out.print("*");
			}//6에서 위 for문에서 출력한 수를 뺀 값을 출력
			System.out.print("\n");
		}
	}
}