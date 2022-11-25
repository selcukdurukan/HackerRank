package com.hackerrank;

import java.util.Scanner;

public class JavaDataTypes {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {

			try {
				long x = sc.nextLong();
				System.out.println(x + " can be fitted in:");
				if (-128 <= x && x <= 127) {
					System.out.println("* byte");
				}
				if (-32728 <= x && x <= 32767) {
					System.out.println("* short");
				}
				if (Math.pow(-2, 31) <= x && x <= (Math.pow(2, 31) - 1)) {
					System.out.println("* int");
				}
				if (Math.pow(-2, 63) <= x && x <= (Math.pow(2, 63) - 1)) {
					System.out.println("* long");
				}
			} catch (Exception e) {
				System.out.println(sc.next() + " can't be fitted anywhere.");
			}
		}

	}

}
