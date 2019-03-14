package Seleniumclass6;

import java.util.Stack;

public class StackCollection {

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<>();
		
		System.out.println("Stack values: "+stack);
		stack.push("Ankush");
		System.out.println("Stack values: "+stack);
		stack.push("Yogesh");
		stack.push("Ramesh");
		
		System.out.println("Stack values: "+stack);
		
		System.out.println(stack.contains("Ankush"));
		
		System.out.println("Element removed: "+stack.pop());
		System.out.println("Stack values after updation: "+stack);
		System.out.println("Element removed: "+stack.pop());
		System.out.println("Element removed: "+stack.pop());
		
		//System.out.println("Element removed: "+stack.pop());
		//java.util.EmptyStackException
		
		System.out.println("Stack values after updation: "+stack);
	}

}
