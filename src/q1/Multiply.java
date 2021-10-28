package q1;

import java.util.Scanner;

public class Multiply {
	public double times() {
		
		Scanner ui = new Scanner(System.in);
		
		System.out.println("Please enter your first number");
		
		double Input1 = ui.nextDouble();
		
		System.out.println("Please enter your second number");
		
		double Input2 = ui.nextDouble();
		
		System.out.println(Input1*Input2);
		return Input1*Input2;
		
		
		
		
	}

}
