package studio2;
import java.util.Scanner;
public class Gambler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int startAmount;
		double winChance;
		int winLimit;
		int totalSimulations;
		int success = 0;
		int ruin = 0;
		double ruinrate;
		int win = 0;
		int lose = 0;
		String outcome = null;
		int finalwinlose = 0;
		
		
		System.out.println("enter start amount:");
		startAmount = in.nextInt();
		
		System.out.println("enter win chance:");
		winChance = in.nextDouble();
		
		System.out.println("enter win limit:");
		winLimit = in.nextInt();
		
		System.out.println("enter total simulations:");
		totalSimulations = in.nextInt();
		
		for (int i = 0; i <= totalSimulations; i++) {
			while ((startAmount >= 0)&&(startAmount <= winLimit)) {
				double randomodds = Math.random();
				if (randomodds >= winChance) {
					startAmount++;
					finalwinlose++;
				}else {
					startAmount--;
				}
				
				if (startAmount == winLimit) {
					win++;
					outcome = "WIN";

				}
				else if(startAmount == 0) {
					lose++;
					outcome = "LOSE";
					finalwinlose = lose;
				}

				
			}


			System.out.println("Simulation " + i + ": " + finalwinlose + " " + outcome);
			
			
		}
	}

}
