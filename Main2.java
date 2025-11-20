package com.codegnan.Strings;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String mainStr = sc.nextLine().trim();
        String prefix = sc.nextLine().trim();

        if(mainStr.startsWith(prefix)) {
        	System.out.println("Yes");
        } else {
        	System.out.println("No");
        }
		sc.close();
	}

}
