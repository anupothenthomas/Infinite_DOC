package testprogs;

import java.util.Scanner;

public class CheckNumber {

	public static void CheckNumberos(int number) {
		if (number > 0) {
			System.out.println("positive");
		} else if (number < 0) {
			System.out.println("negative");
		} else if (number == 0) {
			System.out.println("equal to zero");
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.println("\n Enter the number you wish to check: \n");
			int number = sc.nextInt();
			CheckNumber.CheckNumberos(number);
		}

	}
}
