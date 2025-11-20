package com.codegnan.Strings;

import java.util.Scanner;

public class Main11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		
		StringBuilder result = new StringBuilder();
		
		int maxLen = Math.max(s1.length(), s2.length());
		
		for(int i=0;i<maxLen;i++) {
			if(i< s1.length())
				result.append(s1.charAt(i));
			if(i< s2.length())
				result.append(s2.charAt(i));
		}
		
		System.out.println(result.toString());
		sc.close();
	}

}
