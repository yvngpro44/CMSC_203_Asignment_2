import java.util.Scanner;
import java.util.Random;
public class RandomNumberGuesser {
	public static void main (String [] args) {
		
	String user;
	Scanner sc = new Scanner(System.in);
	do {
		int randInt, nextGuess ,highGuess = 100, lowGuess = 0;
		int elvis = 4;
		randInt=RNG.rand();
		System.out.println("Welcome to Random Number Guesser" + '\n' + 
				"Enter any number from 0 to 100: ");
		System.out.println("Enter First Guess");
		RNG.getCount();
		RNG.resetCount();
		nextGuess = sc.nextInt();
		
		while(nextGuess != randInt) {
			if (!RNG.inputValidation(nextGuess, lowGuess, highGuess)) {
				nextGuess = sc.nextInt();
				continue;
			}
			
			if (nextGuess < randInt) {
				switch(elvis) {
				case 4:
				lowGuess = nextGuess;
				System.out.println("Guesses made: "+RNG.getCount());
				System.out.println("Your Guess is too low!" +" Please Guess higher!");
				}

			} else {
				if(elvis> 3) {
				highGuess = nextGuess;
				System.out.println("Guesses made: "+RNG.getCount());
				System.out.println("Your Guess is too high! " + "Please Guess lower!");
				}
			}
			
			System.out.print("Enter next guess between: "+ lowGuess +" "+ "&" +" "+ highGuess);
			nextGuess = sc.nextInt();
		}if(nextGuess == randInt)
			System.out.println("Congratulations! it took you"+" "+(RNG.getCount()+1)+" "+"tries");

		System.out.println("Would you like to play again?"+" to possibly beat  previous attempts made: "+(RNG.getCount()+1));
		System.out.print("\nYes or No?");
		user = sc.next();

	}	while (user.equalsIgnoreCase("Yes"));    

	if (user == "no");
	System.out.println("Thank you for playing Random Number Guesser!!!!");

	return;
		
		
		
		
		
	}
}
