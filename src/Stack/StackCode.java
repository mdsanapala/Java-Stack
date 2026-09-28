package Stack;

public class StackCode {
	char[] stack;
	int top;
	public StackCode(int size) {
		stack = new char[size];
		top = -1;
	}
//	push
	void push(char value) {
		if(isFull()) {
			System.out.println("Stack is overflow");
			return;
		}
		stack[++top]=value;
	}
	
//	pop
	char pop() {
		if(isEmpty()) {
			System.out.println("Stack is underflow");
			return 0;
		}
		return stack[top--];
	}
	
//	peak
	char peek() {
		if(isEmpty()) {
			System.err.println("Stack is Empty");
			return 0;
		}
		return stack[top];
	}
	
boolean isEmpty() {
	return top==-1;
}
boolean isFull() {
	return top==stack.length-1;
}
}
