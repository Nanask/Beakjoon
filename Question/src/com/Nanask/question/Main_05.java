package com.Nanask.question;

import java.util.Scanner;

public class Main_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();

		scan.close();
		if (num % 4 == 0 && (num % 100 != 0) || (num % 400 == 0)) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}
}
