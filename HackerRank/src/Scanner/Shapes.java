package Scanner;

import java.util.Scanner;

public class Shapes {

	public static double Area_Trangle(int a, int b) {
		double c = 0.5 * a * b;
		return c;
	}

	public static int Area_Retrangle(int a, int b) {
		int c = a * b;
		return c;
	}

	public static int Area_square(int a) {
		int c = a * a;
		return c;
	}

	public static double Area_Cricle(int a) {
		double c = 3.14 * a * a;
		return c;
	}

	public static double Circum_Ference(int a) {
		double c = 2 * 3.14 * a;
		return c;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.err.println("Enter The Value Of N");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter The Value Of A");
			int a = sc.nextInt();
			System.out.println("Enter The VAlur Of B");
			int b = sc.nextInt();

			System.out.println("Enter Value 1 for Area_Trangle");
			System.out.println("Enter Value 1 for Area_Retrangle");
			System.out.println("Enter Value 1 for Area_square");
			System.out.println("Enter Value 1 for Area_Cricle");
			System.out.println("Enter Value 1 for Circum_Ference");

			int choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.println(Shapes.Area_Trangle(a, b));
				break;
			case 2:
				System.out.println(Shapes.Area_Retrangle(a, b));
				break;
			case 3:
				System.out.println(Shapes.Area_square(a));
				break;
			case 4:
				System.out.println(Shapes.Area_Cricle(a));
				break;
			case 5:
				System.out.println(Shapes.Circum_Ference(a));
				break;
			}
			System.out.println("**********************************");
		}
	}

}
