package collectionTypes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class ListExamples {

	public static void main(String[] args) {
			//ArrayList
			ArrayList<Integer> list =new ArrayList<>();
			list.add(9);
			list.add(23);
			list.add(35);
			list.add(50);
			list.add(null);
			list.add(57);
			System.out.println("ArrayList Elements:" + list);
			
			//LinkedList
			LinkedList<String> list1 =new LinkedList<>();
			list1.add("Chethan");
			list1.add("Jhon");
			list1.add("Jack");
			list1.add(null);
			list1.add("Dhikshith");
			System.out.println("LinkedList Elements:" + list1);
			//Vector
			Vector<String> list2 =new Vector<>();
			list2.add("Chethan");
			list2.add("Jhon");
			list2.add("Jack");
			list2.add(null);
			list2.add("Dhikshith");
			System.out.println("LinkedList Elements:" + list1);
			
			Stack<String> stack =new Stack<>();
			stack.add("Mike");
			stack.add("Smith");
			stack.add("Sumith");
			stack.add("Chethan");
			
			System.out.println("Stack Elements:" + stack.peek());
			System.out.println("Stack Elements:" + stack.peek());
			System.out.println("Stack Elements:" + stack.peek());
			System.out.println("Stack Elements:" + stack.peek());
			System.out.println("stack size before pop="+stack.size());
			System.out.println("Stack Elements:" + stack.pop());
			System.out.println("Stack Elements:" + stack.pop());
			System.out.println("Stack Elements:" + stack.pop());
			System.out.println("Stack Elements:" + stack.pop());
			System.out.println("stack size after pop ="+stack.size());
	}

}