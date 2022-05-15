package com.anagrm.demo;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
	
		String firstString,secondString;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first String:");
		firstString = sc.nextLine();
		System.out.println("Enter second String:");
		secondString = sc.nextLine();
		
		firstString = firstString.toLowerCase();
		secondString = secondString.toLowerCase();
		
		char[] S1 = firstString.toCharArray();  
        char[] S2= secondString.toCharArray();
        
		Arrays.sort(S1);  
        Arrays.sort(S2); 
        if(Arrays.equals(S1, S2) == true) {  
            System.out.println("Both the strings are anagram");  
        }  
        else {  
            System.out.println("Both the strings are not anagram");  
        }
		
	}

}