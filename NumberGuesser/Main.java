import java.util.Scanner; 
public class Main 
{
  
  public static void main(String[] args) 
  {
    
    Scanner input = new Scanner(System.in);
    int randSecretNumber = (int) (Math.random() * 100) + 1;
    int numberGuess = 0;
    
    System.out.println("Guess a number between 1-100.");
    int userGuess = input.nextInt();
    System.out.println("");
    numberGuess ++;

    boolean guessed = false;
    while (!guessed) {
      if (randSecretNumber > userGuess) {
      System.out.println("Incorrect! Your guess was too low.");
      }
    else if (randSecretNumber < userGuess) {
      System.out.println("Incorrect! Your guess was too high.");
      }
    else {
      System.out.println("Correct! The correct answer was " + randSecretNumber + ".");
      guessed = true; 
      }

      if (!guessed) {
        System.out.println("Guess again!");
        userGuess = input.nextInt();
        System.out.println("");
        numberGuess++;
      }
    }
    System.out.print("You guessed " + numberGuess + " times.");
    }
}