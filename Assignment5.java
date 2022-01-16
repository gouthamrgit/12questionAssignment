package constructorTypes;
//Default Constructor
public class Assignment5 {
	String name;
	int phNo;
	double marks;
	public Assignment5(String name, int phNo, double marks) {
		super();
		this.name = name;
		this.phNo = phNo;
		this.marks = marks;
	}
	public Assignment5() {
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
	void display() {
		System.out.println(name+" "+phNo+" "+marks);
	}
	public static void main(String[] args) {
		Assignment5 s1=new Assignment5();
		Assignment5 s2=new Assignment5();
		s1.display();
		s2.display();
		
		
	}
}
