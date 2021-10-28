package q1;

import java.util.Scanner;

public class Addition {
	public static double add() {
		
		Scanner ui = new Scanner(System.in);
		
		System.out.println("Please enter your first number");
		
		double Input1 = ui.nextDouble();
		
		System.out.println("Please enter your second number");
		
		double Input2 = ui.nextDouble();
		
		System.out.println("Your total is");
		
		System.out.println(Input1+Input2);
		return Input1+Input2;
	}

}
