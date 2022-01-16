package innerClass;


public class innerClass {

private String str="Inner Classes";

 void display(){  
	 class Inner{  
		 void msg(){
			 System.out.println(str);
		 }  
  }
	 Inner l=new Inner();  
	  l.msg();  
	 }  

	 
	public static void main(String[] args) {
		innerClass  ob=new innerClass ();  
		ob.display();  
		}
	}
