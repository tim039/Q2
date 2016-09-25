import java.util.Scanner;

public class Tuition {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("What is the first year tuition? ");
		double baseTuition = input.nextDouble();

		System.out.println("What percent does the tuition increase by (0-100) "); 
		double perIncrease = input.nextDouble() / 100 + 1;

		double finalTuition = baseTuition; // Counter
		
		for (int i = 1; i < 4; i++) {

			double tuition = baseTuition * Math.pow(perIncrease, i);
			finalTuition = finalTuition + tuition;

		}

		System.out.printf("Total Tuition = $%.2f",finalTuition);

	}

}
