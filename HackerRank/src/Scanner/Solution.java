package Scanner;

import java.util.Scanner;

public class Solution {

	public static String login(String user, String pass) {
		String username = user;
		String password = pass;

		if (username.equals("Karan_jena")) {
			if (password.equals("Karan@000")) {
				return "Login Successfull";
			} else {
				return "Worng Password";
			}
		} else {
			return "Worng Username";
		}

	}

	public static String Eligible_vote(int age) {
		if (age > 18) {

			return "Eligible To Vote";
		} else {
			return "Not Eligible To Vote";
		}
	}

	public static String vote(int vote) {

		switch (vote) {
		case 1:
			return "You voted for BJD";
		case 2:
			return "You voted for BJP";
		case 3:
			return "You voted for CON";
		case 4:
			return "You voted for THIRDPARTY";
		default:
			return "Invalid vote. Please enter 1,2,3,4";
		}

	}

	public static String grade(int score) {

		if (score >= 90 && score <= 100) {
			return "A";
		} else if (score >= 80 && score < 90) {
			return "B";
		} else if (score >= 70 && score < 80) {
			return "C";
		} else if (score >= 60 && score < 70) {
			return "D";
		} else if (score >= 0 && score < 60) {
			return "F";
		} else {
			return "Fail";
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Value Of N");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter The usernamme");
			String user = sc.next();
			System.out.println("Enter The password");
			String pass = sc.next();
			System.out.println("Enter Your age");
			int age = sc.nextInt();
			System.out.println(
					" To vote BJD press 1\n To vote BJP press 2\n To vote CON press 3\n To vote THIRDPARTY press 4");
			System.out.println("Chose The Value Of vote");
			int vote = sc.nextInt();
			System.out.println("Enter The score");
			int score = sc.nextInt();

			System.out.println("Enter Value 1 for login");
			System.out.println("Enter Value 2 for Eligible_vote");
			System.out.println("Enter Value 3 for vote");
			System.out.println("Enter Value 4 for grade");

			int choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.println(Solution.login(user, pass));
				break;
			case 2:
				System.out.println(Solution.Eligible_vote(age));
				break;
			case 4:
				System.out.println(Solution.grade(score));
				break;
			case 3:
				System.out.println(Solution.vote(vote));
				break;

			}
			System.out.println("**********************************");
		}
	}
}
