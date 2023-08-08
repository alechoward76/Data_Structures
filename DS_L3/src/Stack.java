/*
 Author:       Alec Howard
 Date:        11/10/2021
 Course:      Datastructures
 Section      

 File Name:   
 Classes:     Template
 Description: 
*/

import java.util.ArrayList;

public class Stack<E> {
	private ArrayList<E> stack;

	public Stack() {
		stack = new ArrayList<E>();
	} // end default constructor

	public void push(E newItem) {

		stack.add(0, newItem);
	} // end push

	public E pop() {

		return stack.remove(0);

	} // end pop

	public void top() {

		System.out.println("Top: " + stack.get(0));

	} // end top

	public boolean isEmpty() {
		return stack.isEmpty();
	} // end isEmpty

	public int size() {
		return stack.size();
	}// end size

	public E peek() {

		return stack.get(0);

	} // end peek

	public static void main(String args[]) {

		Stack<Integer> S = new Stack<Integer>();
		Stack<Integer> S1 = new Stack<Integer>();
		S.push(3);
		S.push(-4);
		S.push(2);
		S.push(-5);
		S.push(6);
		S.push(10);
		S.push(-12);
		S.push(13);
		S.push(-9);
		S.push(-8);
		S.push(4);

		int size = S.size();
		for (int i = 0; i < size; i++) {

			System.out.print(S.peek() + " ");
			S1.push(S.peek());
			S.pop();
		}
		System.out.println();

		for (int i = 0; i < size; i++) {

			S.push(S1.peek());
			S1.pop();
		}

		for (int i = 0; i < 3; i++) {

			System.out.println("Popped: " + S.pop());

		} // end for

		S.top();

	} // end main **********************************************

} // end Template Class ************************************
