package com.mycompany;


import java.util.Scanner;

public class mySplit {
	public static void main(String [] args) {
		
		System.out.println("Enter the String to be Split");
		Scanner theValue = new Scanner(System.in);
		String myString = theValue.nextLine();
		String delimiter = "abc";
		toSplit(myString, delimiter);
	}
	
	static void toSplit(String myString, String delimiter) {
		for(int i = 0; i <= myString.length(); i++) {
			if(myString.charAt(i)== ' ') {
				System.out.println();
				continue;
			}
			System.out.println(myString.charAt(i));
		}
	}
}
