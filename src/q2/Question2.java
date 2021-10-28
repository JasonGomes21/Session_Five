package q2;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner ui = new Scanner(System.in);
		
		String inputofuser, reserve = ""; //Object of String Class
		
		System.out.println(" Please enter a  String to chaeck if it is Palindrom");
		
		inputofuser =ui.nextLine();
		
		int length = inputofuser.length();
		
		for(int i= length-1; i>=0; i--)
			reserve= reserve+ inputofuser.charAt(i);
		
		if(inputofuser.equals(reserve))
			
			System.out.println("Entered string is a palindorome.");
		
		else
			System.out.println("Entered string is not a palindorome.");
			
	}
		
		
		
	}


