package Scanner;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int startRange = sc.nextInt(); // Change as needed
		int endRange = sc.nextInt(); // Change as needed

		int count = countNumbersWithNoRepeatingDigits(startRange, endRange);
		System.out.println("Number of numbers with no repeating digits: " + count);

	}

	public static int countNumbersWithNoRepeatingDigits(int start, int end) {
		int count = 0;

		for (int num = start; num <= end; num++) {
			if (hasNoRepeatingDigits(num)) {
				count++;
			}
		}

		return count;
	}

	public static boolean hasNoRepeatingDigits(int number) {
		boolean[] digitSeen = new boolean[10]; // Assuming 0-9 digits

		while (number > 0) {
			int digit = number % 10;

			if (digitSeen[digit]) {
				return false; // Digit repeated
			}

			digitSeen[digit] = true;
			number /= 10;
		}

		return true;
	}

}
