package collectionTypes;



import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Vector;

public class SetExample {

	public static void main(String[] args) {
		//HashSet
		HashSet<String> hlist =new HashSet<>();
		hlist.add("abc");
		hlist.add("jhon");
		hlist.add("rahul");
		hlist.add(null);
		hlist.add("Heena");
		System.out.println("HashSet Elements:" + hlist);
		//LinkedHashSet
		LinkedHashSet<String> nlist =new LinkedHashSet<>();
		nlist.add("abc");
		nlist.add("jhon");
		nlist.add("rahul");
		nlist.add(null);
		nlist.add("Heena");
		System.out.println("LinkedHashSet Elements:" + nlist);
		
		//TreeSet
		TreeSet<String> tlist =new TreeSet<>();
		tlist.add("Heena");
		tlist.add("Manish");
		tlist.add("Babita");
		tlist.add("Kavish");
		//null is not allowed in treeset
		tlist.add("Heena");
		System.out.println("TreeSet Elements:" + tlist);
	}

}
