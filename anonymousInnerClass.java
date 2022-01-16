package innerClass;

abstract class AnoonymousInnerClass {
	   public abstract void display();
	}


	public class anonymousInnerClass {

	public static void main(String[] args) {
	AnoonymousInnerClass i = new AnoonymousInnerClass() {

	         public void display() {
	            System.out.println("Anonymous Inner Class");
	         }
	      };
	      i.display();
	   }
	}
