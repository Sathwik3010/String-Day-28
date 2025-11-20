package com.codegnan.Strings;

import java.util.Scanner;

public class Main8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String s1 = sc.nextLine().trim();
		String s2 = sc.nextLine().trim();
		
		int minLength = Math.min(s1.length(), s2.length());
		StringBuilder prefix = new StringBuilder();
		
		for(int i=0; i<minLength; i++) {
			if(s1.charAt(i) == s2.charAt(i)) {
				prefix.append(s1.charAt(i));
			} else {
				break;
			}
		}
		
		System.out.println(prefix.toString());
		sc.close();
	}

}
