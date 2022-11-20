package com.hackerrank;

import java.util.Scanner;

public class JavaOutputFormatting {

	public static void main(String[] args) {

		JavaOutputFormatting old = new JavaOutputFormatting();
		old.oldSol();

		newSol();

	}

	private static void newSol() {

		Scanner sc = new Scanner(System.in);
		System.out.println("================================");
		for (int i = 0; i < 3; i++) {
			String s1 = sc.next();
			int x = sc.nextInt();
			System.out.printf("%-15s%03d%n", s1, x);
		}
		System.out.println("================================");
		sc.close();

	}

	private void oldSol() {

		Scanner sc = new Scanner(System.in);
		System.out.println("================================");
		String java = sc.nextLine();
		int javaNumber = sc.nextInt();
		sc.nextLine();
		System.out.printf("%-15s%03d\n", java, javaNumber);
		String cpp = sc.nextLine();
		int cppNumber = sc.nextInt();
		sc.nextLine();
		System.out.printf("%-15s%03d\n", cpp, cppNumber);
		String python = sc.nextLine();
		int pythonNumber = sc.nextInt();
		System.out.printf("%-15s%03d\n", python, pythonNumber);
		System.out.println("================================");
		sc.close();

	}

}
