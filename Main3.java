package com.codegnan.Strings;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String mainStr = sc.nextLine().trim();
		String sufix = sc.nextLine().trim();
		
		if(mainStr.endsWith(sufix)) {
        	System.out.println("Yes");
		}else {
        	System.out.println("No");
        }
		sc.close();
	}

}
