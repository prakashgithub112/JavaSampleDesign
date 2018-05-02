package com.cg.java;
import java.util.Scanner;
import java.util.TreeSet;

public class BinaryGaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int i = Integer.parseInt(scan.next());
		String s = Integer.toBinaryString(i);

		char[] c = s.toCharArray();
		int b = 0;

		TreeSet<Integer> hashet = new TreeSet<Integer>();
		for (int k = 0; k < c.length; k++) {
			if (c[k] == '0') {
				b++;
			} else {
				hashet.add(b);
				b = 0;
			}

		}

	}
}
