package assignment;
import java.util.*;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String str = sc.nextLine();
		int size = str.length();
		StackChar stack = new StackChar(size);
		
		for(int i=0;i<str.length();i++) {
			System.out.println(stack.push(0));
		}
		

	}

}
