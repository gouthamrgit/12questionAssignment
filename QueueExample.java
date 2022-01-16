package collectionTypes;


import java.util.PriorityQueue;
import java.util.ArrayDeque;
import java.util.Deque;


public class QueueExample {

	public static void main(String[] args) {
		
		
		PriorityQueue<String> name=new PriorityQueue<>();
		name.add("Kavita");
		name.add("Sunil");
		name.add("Nisha");
		name.add("Monica");
		name.add("Sunil");
		name.add("Sunil");
		//name.add(null); //throw exception
		System.out.println(name);
		
		
	}

}
