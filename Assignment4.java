
public class Assignment4 {
void display() {
	System.out.println("Hello");
}
int display1(int a,int b) {
	int sum=a+b;
	return sum;
}
double display2(double a,double b) {
	double sum=a+b;
	return sum;
}
String display3(String str) {
	
	return str;
}
public static void main(String[] args) {
	Assignment4 rt=new Assignment4();
	rt.display();
	
	System.out.println(rt.display1(10, 20));
	System.out.println(rt.display2(14.0, 14.0));
	System.out.println(rt.display3("Hi"));
}
}
