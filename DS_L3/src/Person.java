import java.util.ArrayList;
import java.util.Scanner;
import BinaryTrees.*;
import java.util.*;

public class Person implements Comparable<Person> {
	protected String first_name;
	protected String family_name;
	protected int age;
	
	static ArrayList<Person> list;
	

	public Person(String first_name, String family_name, int age) {
		this.first_name = first_name;
		this.family_name = family_name;
		this.age = age;
	}// end Person

	public String toString() {
		return "( " + first_name + ", " + family_name + ", " + age + " )";
	}// end toString

	public int compareTo(Person per) {
		if (age < per.age) {
			return -1;

		} else {
			return 0;
		}
		
		
	}// end compareTo
	
	public class Key{
		protected int tKey;
		public Key(int tKey) {
			this.tKey = tKey;
		}
	}
	

	public static void main(String args[]) {

		Scanner scnr = new Scanner(System.in);
		list = new ArrayList<Person>();
		int i = 0;

		while (i < 10) {

			System.out.print("Enter First Name: ");
			System.out.println();
			String first_name = scnr.next();
			System.out.print("Enter Family Name: ");
			System.out.println();
			String family_name = scnr.next();
			System.out.print("Enter Age: ");
			System.out.println();
			int age = scnr.nextInt();

			Person person = new Person(first_name, family_name, age);
			list.add(person);
			i++;
			System.out.println();
		} // end while
		scnr.close();
		BinarySearchTree<Person> tree = new BinarySearchTree<Person>();// new binary tree
		for (Person person : list) {// for ea element of list; add that element to the binary tree
			tree.insert(person);

		}
		TreeIterator printT = new TreeIterator(tree, 0);// iterates through tree
		printT.printInorder();// print function
		
		System.out.println();
		System.out.println();
		
		/*Scanner scnr2 = new Scanner(System.in);
		int j=0;
		while (j<5) {
			System.out.print("Enter Age: ");
			System.out.println();
			int keys = scnr2.nextInt();
			Key k = new Key(keys);
			tree.search(tree.getRootItem(), k);
		}*/
		
		
		
		
		

	} // end main **********************************************

}
