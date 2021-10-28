package q1;

import java.util.Scanner;

public class Calaculator {
	public static void main(String [] args) {
		
		
		
		Multiply timesObject = new Multiply();
		Division dividObject = new Division();
		
		System.out.println("Select one of the following: add, sub, multi, div");
		
		Scanner ui = new Scanner(System.in);
		String inputBYuser = ui.next();
		
		switch(inputBYuser) {
		
		case"add":Addition.add();
		break;
		case "sub":Subtract.sub();
		break;
		case"multi":timesObject.times();
		break;
		case "div":dividObject.divid();
		break;
		default:System.out.println("incorrect input");
		
		
		
		
		
		
		}
		
		
	}

	
}
