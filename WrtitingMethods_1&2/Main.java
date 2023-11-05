import java.util.Scanner;
public class MyProgram
{
    //Method 1
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String name = input.nextLine();
        greeting(name);
    }
    
    public static void greeting(String name) 
    {
        System.out.println("Greetings, " + name);
    }
    
    
    //Method 2
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String fName = input.nextLine();
        System.out.println("Enter your last name: ");
        String lName = input.nextLine();
        fullName(fName, lName);
    }
    public static void fullName(String fName, String lName) 
    {
        System.out.println("fName" + "lName");
    }
    
    
    //Method 3
    public static void main(String[] args) 
    {
        String string = " hello there ";
        String stringNoSpace = removeWhiteSpace(string);
        System.out.println(stringNoSpace);
    }
    public static String removeWhiteSpace(String string)
    {
        String stringNoSpace = "";
        int i = 0;
        while (i < string.length()) {
            if (string.charAt(i) != ' ') {
                stringNoSpace += string.charAt(i);
            }
            i++;
        }
        return stringNoSpace;
    }
    
    
    //Method 4
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a random string: ");
        String string = input.nextLine();
        int length = totalChar(string);
        System.out.println("The shring has " + length + " character(s).");
    }
    public static int totalChar(String string)
    {
        int length = string.length();
        return length;
    }
    
    
    //Method 5
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String fName = input.nextLine();
        System.out.println("Enter your last name: ");
        String lName = input.nextLine();
        formatName(fName, lName);
    }
    public static void formatName(String fName, String lName)
    {
        System.out.println(lName + ", " + fName);
    }
    
    
    //Method 6
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a random message: ");
        String message = input.nextLine();
        repeatMessage(message);
    }
    public static void repeatMessage(String message) 
    {
        for (int i = 0; i < 5; i++) {
            System.out.println(message);
        }
    }
    
    
    //Method 7 
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a random message: ");
        String message = input.nextLine();
        System.out.println("Enter an integer: ");
        int num = input.nextInt();
        repeatMessage(message, num);
    }
    public static void repeatMessage(String message, int num)
    {
        for (int i = 0; i < num; i++) {
            System.out.println(message);
        }
    }
    
    
    //Method 8
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a random message: ");
        String string1 = input.nextLine();
        System.out.println("Enter another random message: ");
        String string2 = input.nextLine();
        compareMessage(string1, string2);
    }
    public static void compareMessage(String string1, String string2)
    {
        if (string1.length() > string2.length()) {
        System.out.println(string1 + " is longer than " + string2 + ".");
        }
        else if (string2.length() > string1.length()) {
        System.out.println(string2 + " is longer than " + string1 + ".");
        }
        else {
        System.out.println("Both " + string1 + " and " + string2 + " are the same length.");
        }
    }
    
    
    //Method 9
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a random word: ");
        String string = input.nextLine();
        if (isPalindrome(string)) {
            System.out.println(string + " is a palindrome.");
        }
        else {
            System.out.println(string + " is not a palindrome.");
        }
    }
    public static boolean isPalindrome(String string)
    {
        int i = 0, j = string.length() - 1;
        while (i < j) {
            if (string.charAt(i) != string.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    
    
    //Method 10 
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a random sentence: ");
        String sentence = input.nextLine();
        int spaces = checkSpace(sentence);
        System.out.println(space);
    }
    public static int checkSpace(String sentence)
    {
        int spaces = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                space++;
            }
        }
        return space;
    }
    
    
    //Method 11 
    public static void main(String[] args)
    {
        String sentence = "I like eating apples, bananas, and oranges.";
        char character = 'a';
        int totalChar = checkChar(sentence, character);
        System.out.println("The character " + "'" + character + "'" + " appears " + totalChar + " times in the sentence.");
    
    }
    public static int checkChar(String sentence, char character)
    {
        int charCount = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == character) {
                charCount++;
            }
        }
        return charCount;
    }
    
    
    //Method 12
    public static void main(String[] args)
    {
        String sentence = "who let the dogs out";
        char character = 'o';
        String charString = getString(sentence, character);
        System.out.println(charString);
        
    }
    public static String getString(String sentence, char character)
    {
        String charString = "";
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) != character) {
                charString += sentence.charAt(i);
            }
        }
        return charString;
    }
    
    
    //Method 13
    public static void main(String[] args) 
    {
        String string = "is this in uppercase?";
        System.out.println(convertString(string, true));
    }
    public static String convertString(String string, boolean upperCase)
    {
        if (upperCase) {
            return string.toUpperCase();
        }
        else {
            return string.toLowerCase();
        }
    }
    
    
    //Method 14
    public static void main(String[] args)
    {
        String string = "Skramstad";
        int num1 = 2;
        int num2 = 6;
        String substring = rangeSubstring( string, num1, num2);
        System.out.println(substring);
    }
    public static String rangeSubstring(String string, int num1, int num2)
    {
        if (num1 >= 0 && num2 <= string.length()) {
            return string.substring(num1, num2);
        }
        else {
            return "Not in range";
        }
    }
    
    
    //Method 15
    public static String alphabet ="abcdefghijklmnopqrstuvwxyz";
    public static void main(String[] args) 
    {
        char randomChar = randomLetter();
        System.out.println(randomChar);
    }
    public static char randomLetter() 
    {
        int randIndex = (int) (Math.random() * alphabet.length());
        return alphabet.charAt(randIndex);
    }
}