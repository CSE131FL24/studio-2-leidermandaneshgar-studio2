package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		System.out.print("What is your start amount?:");
		Scanner in = new Scanner (System.in);
		double startAmount = in.nextDouble();
		System.out.print("What is your win chance?:");
		double winChance = in.nextDouble();	
		System.out.print("What is your win limit?:");
		double winLimit = in.nextDouble ();
		while (startAmount < winLimit || startAmount == 0) {
			double number = (double)(Math.random());
			System.out.print(number);
			if (number < winChance) { 
				startAmount = startAmount + 1;
				System.out.print("You win!:");
			}
			
			else {
				startAmount = startAmount - 1;
				System.out.print("You lose!:");
			}
		double totalSimulations = in.nextDouble();
		System.out.print("What is your total amount of simulations?;");
		
		}
	}

}
