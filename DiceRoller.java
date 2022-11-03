import java.util.Scanner;

public class DiceRoller {
	public static int generateRandomDieRoll (int sides) {
			return (int) Math.round(Math.random()*sides);
		}
	public static void main(String[] args) {
		char loopResponse;
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Welcome to the Grand Circus Casino!");
		do {
			System.out.println("How many sides should each die have?");
			int sides;
			sides = scan.nextInt();
			System.out.println(generateRandomDieRoll(sides));
			System.out.println(generateRandomDieRoll(sides));
			System.out.print("Continue?(Y/N):");
			loopResponse = scan.next().charAt(0);
		}while(loopResponse == 'y' || loopResponse == 'Y');
		System.out.println("Bye!");
		scan.close();
	}
}
