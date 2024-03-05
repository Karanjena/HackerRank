package Scanner;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		if (number % 3 == 0 && number % 5 == 0) {
			System.out.println(number + " is divisible by both 3 and 5.");
		} else if (number % 3 == 0) {
			System.out.println(number + " is divisible by 3.");
		} else if (number % 5 == 0) {
			System.out.println(number + " is divisible by 5.");
		} else {
			System.out.println(number + " is not divisible by 3 or 5.");
		}
		sc.close();
	}
}
