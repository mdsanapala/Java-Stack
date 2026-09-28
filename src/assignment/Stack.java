package assignment;

public class Stack {
	int[] stack;
	int top;
	public Stack(int size) {
		stack = new int[size];
		top = -1;
	}
	
//push
	
	void push(int value) {
		if(isFull()) {
			System.out.println("Stack is overflow");
			return;
		}
		stack[++top]=value;
	}
	
//	pop
	
	int pop() {
		if(isEmpty()) {
			System.out.println("Stack is underflow");
			return 0;
		}
		return  stack[top--];
	}
	
//	peek
	
	void peek() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			return;
		}
		System.out.println("peek: "+stack[top]);
	}
	
// dispaly
	
	void display() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
		}
		System.out.print("stack: ");
		for(int i=top;i>=0;i--) {
			System.out.print(stack[i]+" ");
		}
	}

boolean isEmpty() {
	return top==-1;
}

boolean isFull() {
	return top==stack.length-1;
}
}
