package Stack;

public class StackMain {
	public static void main(String[] args) {
		Stack s1 = new Stack(5);
		s1.push(20);
		s1.push(21);
		s1.push(22);
		s1.push(23);
		s1.push(24);

		
		System.out.println("Pop: " + s1.pop());
		System.out.println("Pop: " + s1.pop());
		
		System.out.println("Peek: " + s1.peek());
		
		s1.dispaly();
	}
	
}
