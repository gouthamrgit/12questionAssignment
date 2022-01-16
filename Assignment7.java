//map

import java.util.HashMap;

public class Assignment7 {

	public static void main(String[] args) {
	
	HashMap<Integer,String> h=new HashMap<Integer, String>();
	h.put(1, "abhi");
	h.put(2, "raj");
	h.put(3, "rahul");
	h.put(4, "chethan");
	h.put(5, "nihal");
	h.put(7, "jhon");
	h.put(6, "raju");
	h.put(8, "abc");
	h.put(2,"amith");
	h.put(null, "def");
	h.put(2, "dhikshith");
	
	
	System.out.println("Size of the map "+h.size());
	System.out.println("printing the contents");
	for(Integer key:h.keySet()){
		String name=h.get(key);
		System.out.println(key+ " "+name);
	}
	h.remove(2);
	System.out.println("After Deleting 2nd");
	for(Integer key:h.keySet()){
		String i=h.get(key);
		System.out.println(key+ " "+i);
	}
	System.out.println();
	System.out.println("is the map contains anything " +h.isEmpty());
	System.out.println("is the map contains 2 "+h.containsKey(2));
	System.out.println("is the map contains shreya "+h.containsValue("Shreya"));
	
	

	}

}