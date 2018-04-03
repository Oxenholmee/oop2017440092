
public class Loop {

	public static void main(String[] args) {
		//1~10 정수를 화면에 출력
		int sum, i;//i는 루프변수
		sum = 0;
		i = 1;//1. 루프변수 초기화
		while (i<=10) { //2. 루프 조건식
			System.out.println(i);//3. 루프문
			sum=sum+i;
			i++;//4. 루프변수 변화
		}
		//위의 while문을 for문으로 변환
		for (i=1; i<=10; i++) {
			System.out.println(i);
		}
		System.out.println("Sum: " + sum);
		
		String str = "Hello darkness my old friend";
		int count=0;
		for( i=0; i < str.length(); i++) {
			if(str.charAt(i) != 'l')
				continue;
			count++;
		}
		System.out.println("문장에서 발견한 l의 개수: " + count);
		System.out.println("===============프로그램 종료===============");
	}
}