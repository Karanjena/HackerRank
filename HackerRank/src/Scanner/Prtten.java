package Scanner;

import java.util.Scanner;

public class Prtten {

	public static void partten1(int n) {

		for (int a = 1; a <= n; a++) {
			for (int b = 1; b <= n; b++) {
				if (a == 1 || b == n || a == n || b == 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}

			}
			System.out.println();
		}

	}

	public static void partten2(int n) {

		for (int a = 1; a <= n; a++) {
			for (int b = 1; b <= n; b++) {
				if (a == b || a + b == n + 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}

			}
			System.out.println();
		}
	}

	public static void partten3(int n) {

		for (int a = 1; a <= n; a++) {
			for (int b = 1; b <= n; b++) {
				if (b == 1 || a == n || a == b) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}

			}
			System.out.println();
		}

	}

	public static void partten4(int n) {

		for (int a = 1; a <= n; a++) {
			for (int b = 1; b <= n; b++) {
				if (a == n || b == n || a + b == n + 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}

			}
			System.out.println();
		}
	}

	public static void partten5(int n) {

		for (int a = 1; a <= n; a++) {
			for (int b = 1; b <= n; b++) {
				if (b % 2 == 1) {
					System.out.print(b + " ");
				} else {
					System.out.print(a + " ");
				}

			}
			System.out.println();
		}
	}

	public static void partten6(int n) {

		for (int a = 1; a <= n; a++) {
			for (int b = 1; b <= n; b++) {
				if (a % 2 == 1) {
					System.out.print(a + " ");
				} else {
					System.out.print(b + " ");
				}

			}
			System.out.println();
		}
	}

	public static void partten7(int n) {

		for (int a = 1; a <= n; a++) {
			for (int b = 1; b <= n; b++) {
				if (b % 2 == 0) {
					System.out.print("1 ");
				} else {
					System.out.print("0 ");
				}

			}
			System.out.println();
		}
	}

	public static void partten8(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j % 2 == 1) {
					System.out.print(i + " ");
				} else {
					System.out.print(j + " ");
				}
			}
			System.out.println();
		}
	}

	public static void partten9(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i % 2 == 1) {
					System.out.print(i + " ");
				} else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
	}

	public static void partten10(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i <= n && j <= n) {
					System.out.print("* ");
				} else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Value Of N");
		int N = sc.nextInt();
		for (int i = 1; i <= N; i++) {
			System.out.println("Enter the partten Value");
			int n = sc.nextInt();

			System.out.println("Enter 1 for Partten1");
			System.out.println("Enter 2 for Partten2");
			System.out.println("Enter 3 for Partten3");
			System.out.println("Enter 4 for Partten4");
			System.out.println("Enter 5 for Partten5");
			System.out.println("Enter 6 for Partten6");
			System.out.println("Enter 7 for Partten7");
			System.out.println("Enter 8 for Partten8");
			System.out.println("Enter 9 for Partten9");
			System.out.println("Enter 10 for Partten10");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				Prtten.partten1(n);
				break;
			case 2:
				Prtten.partten2(n);
				break;
			case 3:
				Prtten.partten3(n);
				break;
			case 4:
				Prtten.partten4(n);
				break;
			case 5:
				Prtten.partten5(n);
				break;
			case 6:
				Prtten.partten7(n);
				break;
			case 7:
				Prtten.partten7(n);
				break;
			case 8:
				Prtten.partten8(n);
				break;
			case 9:
				Prtten.partten9(n);
				break;
			case 10:
				Prtten.partten10  (n);
				break;
			}
		}
	}
}