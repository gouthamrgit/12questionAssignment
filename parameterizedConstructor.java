//parameterizedConstructor
package constructorTypes;
//Default Constructor
public class  parameterizedConstructor{
	String name;
	int phNo;
	double marks;
	public parameterizedConstructor(String name, int phNo, double marks) {
		super();
		this.name = name;
		this.phNo = phNo;
		this.marks = marks;
	}
	public parameterizedConstructor() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhNo() {
		return phNo;
	}
	public void setPhNo(int phNo) {
		this.phNo = phNo;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	void display(String string, int i, double d) {
		System.out.println(string+" "+i+" "+d);
	}
	public static void main(String[] args) {
		parameterizedConstructor s1=new parameterizedConstructor();
		parameterizedConstructor s2=new parameterizedConstructor();
		s1.display("Jhon",1234567899,50.0);
		s2.display("Chethan", 999999999, 89.0);
		
		
	}
}
