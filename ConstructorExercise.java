package lab2;

/*Define a class and create its objects, define its
attributes, constructors and member functions*/

public class ConstructorExercise {      //Defining class and creating objects
	int c1;
	int c2;

	public ConstructorExercise(int a, int b) {         //defining attributes
		c1 = a;
		c2 = b;
	}

	public ConstructorExercise() {         //Creating constructor
		System.out.println("this is my default constructor1");
	}

	public void display() {
		System.out.println("test display");
		System.out.println(c1 * c2);
	}

	public static void main(String[] args) {
		ConstructorExercise lc = new ConstructorExercise(20, 30);
		lc.display();
	}

}
