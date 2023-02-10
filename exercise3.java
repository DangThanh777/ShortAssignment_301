package ShortAssignment_301;

import java.util.Scanner;

public class exercise3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Input len of array: ");
		int n = sc.nextInt();

		int[] iArr = new int[n];
		for (int i = 0; i < n; i++) {
			iArr[i] = (int) (Math.random() * 90);
		}
		System.out.print("Array is: ");
		for (int i = 0; i < iArr.length; i++) {
			System.out.print(iArr[i] + " ");
		}
		System.out.println();
		System.out.print("Enter the number you want to search: ");
		int checkNumber = sc.nextInt();
		int count = 0;
		for (int i = 0; i < iArr.length; i++) {
			if (checkNumber == iArr[i]) {
				count++;
			}
		}
		System.out.print("Amount of frequence: " + count);
		System.out.println();
		System.out.print("Index: ");
		for (int i = 0; i < iArr.length; i++) {
			if (checkNumber == iArr[i]) {
				count++;
				System.out.print(i + "	");
			}
		}

	}

}
