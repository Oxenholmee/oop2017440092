
public class Teststring {

	public static void main(String[] args) {
		
		String str1 = new String("hello");
		String str2 = new String("hello");
		
		boolean t;
		t = (str1 == str2);
		
		System.out.println(t);
		System.out.println(str1.equals(str2));	
	}
}