import java.util.Scanner;

public class Five {

	public static void main(String[] args) {
		//5. �޴��� ����ϰ�, ����ڷκ��� �Է��� �޾� ���õ� �޴��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		//choose one of the following.
		//apple
		//orange
		//banana
		//peach
		//enter your choice here : (����� �Է�)orange
		// --------------
		//Your choice is ��orange��.
		
		String f;
		
		Scanner input = new Scanner(System.in);
		System.out.println("choose one of the following.");
		System.out.print("apple\norange\nbanana\npeach\nenter your choice here: ");
		f = input.nextLine();
		System.out.println("--------------");
		System.out.println("Your choice is \"" + f + "\"");	
		}
	}
