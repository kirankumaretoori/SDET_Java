package lab10;

//SuperClass inherited by the SubClass
public class SubClass extends SuperClass {

 // method() declaring Unchecked Exception ArithmeticException
 void method() throws ArithmeticException
 {

     // ArithmeticException is of type Unchecked Exception
     // so the compiler won't give any error

     System.out.println("SubClass");
 }

 // Driver code
 public static void main(String args[])
 {
     SuperClass s = new SubClass();
     s.method();
 }
}
