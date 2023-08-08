//Alec Howard 
//DS HWK4

import java.util.ArrayList;
import java.util.Scanner;

public class Stack<E> {
	private ArrayList<E> stack;

	public Stack() {
		stack = new ArrayList<E>();
	} // end default constructor

	public void push(E newItem) {

		stack.add(0, newItem);
	} // end push

	public void pop() {

		stack.remove(0);

	} // end pop

	public void top() {

		stack.get(0);

	} // end top

	public boolean isEmpty() {
		return stack.isEmpty();
	} // end isEmpty

	public static boolean parenthesisBal(String str) {
		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			char ch2 = str.charAt(i+1);
			if (ch == '(' && ch2 =='(') {
				stack.push(ch);
				stack.push(ch2);
			}
			if (stack.isEmpty()) {
				return false;
			}

			else if (ch == ')'&& ch2==')') {
				stack.pop();
				stack.pop();
			}
		}
		if (stack.isEmpty()) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {

		System.out.println("Enter Expression: ");
		Scanner scnr = new Scanner(System.in);
		String str = scnr.nextLine();
		if (parenthesisBal(str)) {
			System.out.println("correct");
		} else {
			System.out.println("incorrect");
		}
		scnr.close();

	}

}
