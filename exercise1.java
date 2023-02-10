package ShortAssignment_301;

import java.util.Scanner;

public class exercise1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input len: ");
		int n = sc.nextInt();
		int sum = 0 ;
		for(int i = 1;i<=n;i++) {sum+=i;}
		
		float avg = sum/n;
		System.out.println(avg);

	}

}
