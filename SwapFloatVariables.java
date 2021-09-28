package lab2;

/*Write a program where to swap values of two float
variables*/

public class SwapFloatVariables {
	
	public static void main(String[] args) {
		float first = 12.234f;
		float second = 24.567f;

        System.out.println("***Before swap***");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);

        first = first - second; //-12
        second = first + second; //12
        first = second - first; //24

        System.out.println("**After swap***");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);

}
}
