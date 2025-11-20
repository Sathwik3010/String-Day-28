package com.codegnan.Strings;

import java.util.Scanner;

public class Main9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String mainString = sc.nextLine().trim();
		String subString = sc.nextLine().trim();
		
		if(mainString.contains(subString)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		sc.close();
	}

}
