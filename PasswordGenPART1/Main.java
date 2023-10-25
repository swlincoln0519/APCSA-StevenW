import java.util.Scanner;
public class MyProgram 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Press \"Enter\"" + " to generate a password.");
        String userInput = input.nextLine();
        
        final String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXY";
        final String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        final String numbers = "0123456789";
        final String symbols = "!@#$%&~?_";
        String password = "";
    
        password += getRandomChar(upperCase);
        password += getRandomChar(lowerCase);
        password += getRandomChar(numbers);
        password += getRandomChar(symbols);

        final String characterSet = upperCase + lowerCase + numbers + symbols;
        for (int i = 8; i < 12; i++) {
            password += getRandomChar(characterSet);
            }
            
            System.out.println("Password: " + password);
        }   
        
        private static char getRandomChar (String characterSet) {
            int index = (int) (Math.random() * characterSet.length());
            return characterSet.charAt(index);
        }
}

//A good password is one that contains letters, numbers, 
//symbols and upper and lowercase characters.

//Create a method that generates a random password 
//of a certain length that includes at least one of each type.