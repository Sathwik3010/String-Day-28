package com.codegnan.Strings;

import java.util.Scanner;

public class Main6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		char ch = sc.nextLine().charAt(0);
		int start = sc.nextInt();
		int end = sc.nextInt();
		
		int count = 0;
		
		for(int i=start;i<end;i++) {
			if(str.charAt(i)==ch) {
				count ++;
			}
		}
		
		System.out.println(count);
		sc.close();
	}

}
