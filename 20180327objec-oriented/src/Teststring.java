
public class Teststring {

	public static void main(String[] args) {
		int a = 10;//string 객체 생성 방법
		String str;//클라스 스트링의 객체를 참조할 수 있는 참조 변수(레퍼런스 변수) 생성(class type)
		str = new String("Hello darkness my old friend.");//객체 생성
		System.out.println(str);
		
		//String 객체의 길이
		//메소드 호출 방법: 참조변수.메소드
		int len = str.length();
		System.out.println("string legth is " + len);
		
		String str1;
		str1 = str.toUpperCase();
		System.out.println("Uppercase: " + str1);
	}
}