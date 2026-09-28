//Q1.Write a Java program to implement a stack using an integer array.
//Perform: Push 10, 20, 30, 40; Display; Peek; Pop two elements;
//Display again. Show appropriate messages for overflow and underflow. 

package assignment;

public class StackOperations {
	public static void main(String[] args) {
		Stack stack = new Stack(4);
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		
		stack.display();
		
		stack.peek();
		
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());

		
		stack.display();
	}

}
