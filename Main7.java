package com.codegnan.Strings;

import java.util.Scanner;

public class Main7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		int start = sc.nextInt();
		int end = sc.nextInt();
		
		String result = str.substring(start ,end);
		System.out.println(result);
		sc.close();
	}

}
