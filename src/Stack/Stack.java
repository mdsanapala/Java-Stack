package Stack;

public class Stack {
	int[] stack;
	int top;
	public Stack(int size) {
		stack = new int[size];
		top = -1;
	}
	
	void push(int value) {
		if(isFull()) {
			System.out.println("Stack is over flow");
		}else {
			stack[++top] = value;
		}
	}
	
	int pop() {
		if(isEmpty()) {
			System.out.println("Stack is Under flow");
			return -1;
		}
		return stack[top--];
	}
	
	int peek() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			return -1;
		}else {
			return stack[top];
		}
	}
	

	private boolean isEmpty() {
		return top==-1;

	}

	private boolean isFull() {
		return top == stack.length-1;
	}
	
	void dispaly() {
		for(int i=top;i>=0;i--) {
			System.out.print(stack[i]+" ");
		}
	}
}
