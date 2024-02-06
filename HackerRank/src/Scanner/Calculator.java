package Scanner;

import java.util.Scanner;

public class Calculator {

	public static int add(int a, int b) {
		int c = a + b;
		return c;
	}

	public static int sub(int a, int b) {
		int c = a - b;
		return c;
	}

	public static int mult(int a, int b) {
		int c = a * b;
		return c;
	}

	public static int div(int a, int b) {
		int c = a / b;
		return c;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Value Of N");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter The Value Of A");
			int a = sc.nextInt();
			System.out.println("Enter THe Valur Of B");
			int b = sc.nextInt();

			System.out.println("Enter 1 for Add");
			System.out.println("Enter 2 for Sub");
			System.out.println("Enter 3 for Mult");
			System.out.println("Enter 4 for Div");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println(Calculator.add(a, b));
				break;
			case 2:
				System.out.println(Calculator.sub(a, b));
				break;
			case 3:
				System.out.println(Calculator.mult(a, b));
				break;
			case 4:
				if (b == 0) {
					System.out.println("Invalid");
				} else {
					System.out.println(Calculator.div(a, b));
				}
			}
		}

	}
}
