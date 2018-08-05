package arrays_DOC;

import java.util.Scanner;

public class ArrayAvgDynamic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the size of the array: \n");
		int a = sc.nextInt();

		double[] arr = new double[a];
		double total = 0;

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter Element number for" + (i + 1) + ";");
			arr[i] = sc.nextDouble();
		}

		sc.close();

		for (int i = 0; i < arr.length; i++) {
			total = total + arr[i];
		}

		double avg = total / arr.length;

		System.out.println("The average of the user input array is: \n" + avg);

	}

}
