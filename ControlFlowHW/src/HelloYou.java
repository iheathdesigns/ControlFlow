import java.util.Random;
import java.util.Scanner;

public class HelloYou {

	static boolean testYes(String value) {
		if(value.toLowerCase().startsWith("y")) {
			return true;
		} else {
			return false;
		}
	}
	
	static int clampToRange(int value, int lowerValue, int upperValue) {
		//For example we can say clampToRange(300, 1, 75);
		int rangeWidth = upperValue - lowerValue + 1;
		
		while(value > upperValue) {
			value -= rangeWidth;
		}
		while(value < lowerValue) {
			value += rangeWidth;
		}
		return value;
	}
	
	public static void playLottery(Scanner input) {
		System.out.println("What is the name of your favorite pet?");
		String petName = input.nextLine();
		
		System.out.println("What is the age of your favorite pet?");
		Integer petAge = Integer.parseInt(input.nextLine());
		
		System.out.println("What is your lucky number?");
		Integer luckyNumber = Integer.parseInt(input.nextLine());
		
		System.out.println("Do you have a favorite quarterback?");
		boolean hasQuarterback = testYes(input.nextLine());
		
		int jerseyNumber = -1;
		if(hasQuarterback) {
			System.out.println("What is their jersey number?");
			jerseyNumber = Integer.parseInt(input.nextLine());
		}
		System.out.println("What is two-digit model year of your car?");
		int carYear = Integer.parseInt(input.nextLine());
		
		System.out.println("What is name of your favorite actor or actress?");
		String actorName = input.nextLine();
		
		System.out.println("Enter a random number between 1 and 50");
		int chooseNumber = Integer.parseInt(input.nextLine());
		
		int[] randomNumbers = new int[3];
		Random rng = new Random();
		
		//We'll choose a number between 1 and 65
		for(int i = 0; i < 3; i++) {
			randomNumbers[i] = rng.nextInt(65)+1;
		}
		
		int magic8Ball;
		//Generate the magic ball number first
		
		if(hasQuarterback) {
			magic8Ball = jerseyNumber;
		} else {
			magic8Ball = luckyNumber * randomNumbers[0];
		}
		//But no guarantee is in the range 1-75 like its supposed to be
		//What we can do is while magic8Ball is greater than 75, we can subtract 75 until it is in range
		magic8Ball = clampToRange(magic8Ball, 1, 75);
		
		int[] balls = new int[5];
		
		//Third letter of favorite pet
		balls[0] = petName.charAt(2);
		
		//Two-digit model year car + lucky number
		balls[1] = carYear + luckyNumber;
		
		//Use a random number between 1 and 50, subtracting one of the generated numbers
		balls[2] = chooseNumber - randomNumbers[1];
		
		//Convert the first letter of their favorite actor/actress to an integer
		balls[3] = actorName.charAt(0);
		
		//Use the value 42
		balls[4] = 42;
		
		for(int i=0; i<5; ++i) {
			balls[i] = clampToRange(balls[i], 1, 65);
		}
		
		System.out.printf("Lottery numbers: %d, %d, %d, %d Magic ball: %d\n", balls[0], balls[1], balls[2], balls[3], balls[4], magic8Ball);
		
		
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your name: ");
		
		String name = input.nextLine();
		System.out.println("Hello " + name);
		
		System.out.println("Do you wish to continue?");
		String response = input.nextLine();
		//Check to see if it's yes or y
		if(testYes(response)) {
			do {
				playLottery(input);
				
				System.out.println("Do you want to play again?");
				response = input.nextLine();
			} while(testYes(response));
		} else {
			System.out.println("Please return later to complete the survey");
		}

	}

}
