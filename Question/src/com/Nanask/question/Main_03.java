package com.Nanask.question;

import java.util.Scanner;

public class Main_03 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		scan.close();
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		if(A < B) {
			System.out.println("<");
		}else if(A > B) {
			System.out.println(">");
		}else if(A == B) {
			System.out.println("==");
		}
		
	}

}
