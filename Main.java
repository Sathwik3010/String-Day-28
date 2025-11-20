package com.codegnan.Strings;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s = new String("Dev");
//		s.concat("Java Developer");
//		System.out.println(s); // prints Dev
		
		StringBuilder sb = new StringBuilder("Dev");
		sb.append(" Java Developer");
		System.out.println(sb); // prints Dev javaDeveloper
		
		String s1 = new String("Dev");
		String s2 = new String("Dev");
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);
		
		StringBuilder sb1 = new StringBuilder("Dev");
		StringBuilder sb2 = new StringBuilder("Dev");
		System.out.println(sb1.equals(sb2));
		System.out.println(sb1 == sb2);
	}

}
