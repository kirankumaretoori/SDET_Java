package lab9;

// 2. Write a program to throw  ArrayOutOfBoundsException

public class ArrayIndexOutOfBoundsExample {

	public static void main(String[] args) {

		try {
			int arr[] = new int[6];
			System.out.println(arr[7]);

		}

		catch (Exception e) {
			e.printStackTrace();
		}

	}
}
