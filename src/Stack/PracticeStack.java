package Stack;

public class PracticeStack {
	int[] stack;
	int top;
	public PracticeStack(int size) {
		stack = new int[size];
		top = -1;
	}
	
//	push
	void push(int value) {
		if(isFull()) {
			System.out.println("Stack Overflow");
			return;
		}
		stack[++top] = value;
	}
	
//	pop
	int pop() {
		if(isEmpty()) {
			System.out.println("Stack is underflow");
			return -1;
		}
		return stack[top--];
	}
	
//	peek
	
	int peek() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			return -1;
		}
		return stack[top];
	}
	
	void display() {
		for(int i=top;i>=0;i--) {
			System.out.print(stack[i]+" ");
		}
	}
	
private boolean isEmpty() {
	return top==-1;
}

private boolean isFull() {
	return top==stack.length-1;
}
}
