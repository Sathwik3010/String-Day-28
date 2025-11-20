package com.codegnan.Strings;

import java.util.Scanner;

public class Main12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		char oldChar = sc.nextLine().charAt(0);
		char newChar = sc.nextLine().charAt(0);
		
		String result = str.replace(oldChar, newChar);
		System.out.println(result);
		sc.close();
	}

}
