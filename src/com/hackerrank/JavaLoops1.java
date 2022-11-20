package com.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;

public class JavaLoops1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine().trim());
        
        for (int i = 1; i < 11; i++) {
			int result = N * i;
			System.out.println(N + " x " + i + " = " + result);
		} 
	}

}
