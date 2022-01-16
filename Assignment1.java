import java.util.Scanner;

public class Assignment1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		double d=Double.valueOf(str);
		System.out.println(d);
		int i=Integer.valueOf(str);
		System.out.println(i);
		long l=Long.parseLong(str);
		System.out.println(l);
		boolean b=Boolean.parseBoolean(str);
		System.out.println(b);
				
	}
}
