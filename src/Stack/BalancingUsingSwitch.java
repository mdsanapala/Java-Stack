package Stack;
import java.util.*;

public class BalancingUsingSwitch {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size: ");
		int size = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter string: ");
		String str = sc.nextLine();
		
		StackCode stack = new StackCode(size);
		
		boolean balanced = true;
		for(int i=0;i<str.length();i++) {
			char current = str.charAt(i);
//			push open brackets
			if(current == '(' || current == '[' || current == '{') {
				stack.push(current);
			}
			else if(current == ')' || current == ']' || current == '}') {
				if(stack.isEmpty()) {
					balanced = false;
					break;
				}
				char expected;
				switch(current) {
				case ')':
					expected = '(';
					break;
				case ']':
					expected = '[';
					break;
				case '}':
					expected = '{';
					break;
				
				default:
					expected = '\0';
				}
			if(stack.peek()==expected) {
				stack.pop();
			}else {
				balanced = false;
				break;
			}
			}
		}
		if(balanced==true && stack.isEmpty()) {
			System.out.println("stack is balanced");
		}else {
			System.out.println("stack is not balanced");
		}
		sc.close();
	}
}
