
import java.util.ArrayList;
import java.util.Scanner;

public class Assignment12 {
	public static void main(String[] args) {
		
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter string values");
	ArrayList <String> a=new ArrayList<String>();
	String qw=sc.nextLine();
	String f=sc.nextLine();
	String j=sc.nextLine();
	a.add(qw);
	a.add(f);
	a.add(j);
    System.out.println("enter any one string from above strings");
    String fe=sc.nextLine();
    if(qw.contains(fe) || f.contains(fe) || j.contains(fe)) {
    	System.out.println(fe);
    	System.out.println("valid search");
    }
    else {
    	System.out.println("invalid");
    }

}
}