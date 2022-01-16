package String;
public class demo{
public static void main(String[] args) {
		

//Conversion of Strings to StringBuffer and StringBuilder

	String str = "jhon"; 

	// conversion from String object to StringBuffer 
	StringBuffer sb = new StringBuffer(str); 
	sb.reverse(); 
	System.out.println("String to StringBuffer");
	System.out.println(sb); 
	  
	// conversion from String object to StringBuilder 
	StringBuilder sbl = new StringBuilder(str); 
	sbl.append("spiderman"); 
	System.out.println("String to StringBuilder");
	System.out.println(sbl);              		
	}
}