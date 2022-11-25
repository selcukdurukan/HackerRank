package com.hackerrank;

import java.util.Scanner;

public class JavaLoops2 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();

			for (int p = 1; p < n + 1; p++) {
				int sum = a;
				for (int j = 0; j < p; j++) {
					sum = (int) ((b * Math.pow(2, j)) + sum);
				}
				System.out.print(sum + " ");
			}
			System.out.println();
		}
		in.close();

	}

}
