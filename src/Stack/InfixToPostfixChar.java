package Stack;
import java.util.*;

public class InfixToPostfixChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size:");
		int size = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter String: ");
		String str = sc.nextLine();
		StackCode stack = new StackCode(size);
		
		sc.close();
	}

}
