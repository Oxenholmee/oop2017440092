import java.util.Scanner;

public class Four {

	public static void main(String[] args) {
		//4. 점수(정수)를 입력 받아서 등급(A, B, C, D, E)을 출력하는 프로그램을 작성하시오.
		//(A : 100-80, B: 79-60, C: 59-40, D: 39-20, E: 19-0)
		
		int score;
		
		Scanner input = new Scanner(System.in);
		System.out.print("input score: ");
		score = input.nextInt();
		
		if(score >= 80)
			System.out.print("your grade is A");
		else if(score >= 60 && score < 80)
			System.out.print("your grade is B");
		else if(score >= 40 && score < 60)
			System.out.print("your grade is C");
		else if(score >= 20 && score <40)
			System.out.print("your grade is D");
		else if(score >=0 && score <20)
			System.out.print("your grade is E");
	}

}
