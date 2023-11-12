import java.util.Scanner;
class UsingScanner {
  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("What is your favorite flavor of ice cream?");
    String stringAnswer = input.nextLine();
    System.out.println("");
    
    System.out.println("What is your birth year?");
    int intAnswer = input.nextInt();
    System.out.println("");
    
    System.out.println("What is the value of a Nickle? (Answer in decimal form)");
    double doubleAnswer = input.nextDouble();
    System.out.println("");
    
    System.out.println("What is the first letter/number of your Replit username? ");
    char charAnswer = input.next(".").charAt(0);
    System.out.println("");

    System.out.println("|true or false| There are 27 letters in the English aplhabet.");
    boolean booleanAnswer = input.nextBoolean();
    System.out.println("");
        if (booleanAnswer == false) {
          System.out.println("You are correct, there isn't 27 letters in the aplhabet.");
        } else if (booleanAnswer == true) {
          System.out.println("You are incorrect, there are 26 letters in the aplhabet.");
        }
    
    System.out.println("Your favorite ice cream flavor is " + stringAnswer + ".");
    System.out.println("You were born in the year " + intAnswer + ".");
    System.out.println("Based on your answer, a Nickle is $" + doubleAnswer + ".");
    System.out.println("Your username begins with " + charAnswer + ".");
    
  }
}
