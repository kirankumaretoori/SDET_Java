package lab2;

import languagebasics.Testpack1;
import sample.udemy;

/* 1. Write a program where you declare all 3 different types
of variables, a member function and print the value of each
variable*/

public class BasicProgram {
	static int a = 3;
	int b = 4;

	public int test1() {
		return 2;
	}

	public static void test2() {
		System.out.println("test2");
	}

	public void test3() {
		System.out.println(b);

	}

	public static void main(String[] args) {
		BasicProgram a1 = new BasicProgram();
		System.out.println(a1.test1());
		udemy.test2();
		System.out.println(a);

		Testpack1 b1 = new Testpack1();
		b1.mathodfromtestpack1();
		a1.test3();

	}

}
