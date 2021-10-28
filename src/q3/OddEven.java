package q3;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		
		Scanner ui = new Scanner (System.in);
			System.out.println("Please enter a number");
			int num = ui.nextInt();
			
			
			
			if(num % 2 ==0) 
				System.out.println("even");
				
				else
					System.out.println("odd");	
			
			

	}

}