package com.codegnan.Strings;

import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		 String s1 = sc.nextLine().trim();
	     String s2 = sc.nextLine().trim();
	        
	     int result = s1.compareToIgnoreCase(s2);
	     
	     if(result < 0) {
	        System.out.println(-1);
	     } else {
	    	 if(result > 0) {
	    		 System.out.println(1);
	    	 } else {
	    		 System.out.println(0);
	    	 }
	     }
		sc.close();
	}

}
