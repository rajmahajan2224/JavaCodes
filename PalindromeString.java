package com.mycompany;

import java.util.Scanner;

public class PalindromeString {
	
	public static void main(String [] args) {
		System.out.println("Enter the String");
		 
		Scanner sc = new Scanner(System.in);
		String str =sc.nextLine();
		 boolean flag = true;
		 
		 str = str.toLowerCase();
		 
		 for(int i = 0; i < str.length()/2; i++) {
			 if(str.charAt(i) != str.charAt(str.length()-i-1)) {
				 flag = false;
				 break;
			 }
		 }
		 if(flag) {
			 System.out.println("Palindrome");
		 }
		 else {
			 System.out.println("Not a Palindrome");
		 }
		 
		}
}
