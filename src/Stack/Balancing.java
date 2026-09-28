package Stack;
import java.util.*;

public class Balancing {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean balanced = true;
		
		System.out.print("Enter stack size: ");
		int size = sc.nextInt();
		sc.nextLine();
		StackBalancing stack = new StackBalancing(size);
		System.out.print("Enter string: ");
		String s1 = sc.nextLine();
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)=='(' || s1.charAt(i)=='[' || s1.charAt(i)=='{') {
				stack.push(s1.charAt(i));
			}
			else if(s1.charAt(i)==')' || s1.charAt(i)==']' || s1.charAt(i)=='}') {
				if(stack.isEmpty()) {
					balanced = false;
					break;
				}else {
					if(s1.charAt(i)==')' && stack.peek()=='(') {
						stack.pop();
					}
					else if(s1.charAt(i)==']' && stack.peek()=='[') {
						stack.pop();
					}
					else if(s1.charAt(i)=='}' && stack.peek()=='{') {
						stack.pop();
					}else {
						balanced = false;
						break;
					}
					
				}
			}
		}
		if(balanced && stack.isEmpty()) {
			System.out.println("Balanced");
		}else {
			System.out.println("Not Balanced");
		}		
		sc.close();
	}
}
