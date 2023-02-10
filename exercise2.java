package ShortAssignment_301;

import java.util.Scanner;

public class exercise2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] strArr = { "FTP", "Fresher", "Acedemy", "2018" };

		System.out.println("Input string check: ");
		String check = sc.next();
		for (int i = 0; i <= strArr.length; i++) {
			if (check.equals(strArr[i])) {
				System.out.println("Contained!");
				break;
			} else {
				System.out.println("No contain!");
				break;
			}
		}
	}

}
