package java8features.CollectionsFmwrk;

import java.util.Enumeration;
import java.util.Stack;

public class StackPractice {

	public static void main(String args[]) {
		
		Stack stack = new Stack();
		stack.push(12);
		stack.push(52);
		stack.push(23);
		stack.push(65);
		
		Enumeration em= stack.elements();
		while(em.hasMoreElements()) {
			System.out.println(em.nextElement());
		}
		
		System.out.println(stack.search(12));
	}
}
