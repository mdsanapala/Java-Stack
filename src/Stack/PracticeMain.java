package Stack;

public class PracticeMain {

	public static void main(String[] args) {
		PracticeStack stack = new PracticeStack(5);
		
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		
		stack.display();

		stack.pop();
		stack.pop();
		
		System.out.println("\nPeek: "+ stack.peek());

		stack.display();
	}

}
