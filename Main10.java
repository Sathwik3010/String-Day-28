package com.codegnan.Strings;

import java.util.Scanner;

public class Main10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String original = sc.nextLine().trim();
		int position = sc.nextInt();
		sc.nextLine();
		String toInsert = sc.nextLine().trim();
		
		String result = original.substring(0,position)+toInsert+original.substring(position);
		System.out.println(result);
		sc.close();
	}

}
