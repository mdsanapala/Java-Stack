package Stack;

public class StackBalancing {
	char[] stack;
	int top;
	public StackBalancing(int size) {
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
	
//peak
	char peek() {
		if(isEmpty()) {
			System.out.println("Stack is overflow");
			return 0;
		}
		return stack[top];
	}
	
//	dispaly
//	void display() {
//		if(isEmpty()) {
//			System.out.println("Stack is Empty");
//		}
//		System.out.print("Stack Elements: ");
//		for(int i=top;i>=0;i--) {
//			System.out.println(stack[i]+" ");
//		}
//	}
	
	
boolean isEmpty() {
	return top==-1;
}

boolean isFull() {
	return top==stack.length-1;
}
	
}
