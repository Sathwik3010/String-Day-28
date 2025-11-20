package com.codegnan.Strings;

import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String s1 = sc.nextLine().trim();
		String s2 = sc.nextLine().trim();

		String result = s1.concat(s2);
		
		System.out.println(result);
		sc.close();
	}

}
