import java.util.Scanner;

public class MyUtils {

    public static int getRandomNumber(int max) {
        return (int) (Math.random() * (max + 1));
    }

    public static int findInstancesOfLetter(String word, char letter) {
       String strLetter = String.valueOf(letter);
       int count = 0;
       for (int i = 0; i < word.length(); i++) {
           if (word.substring(i, i + 1).equals(strLetter)) {
            count++;
           }
       }
    return count;
    }

    public static String replaceCharAt(String word, int index, char c) {

        if (index < 0 || index >= word.length()) {
            return "Invalid Index";
        }
        return word.substring(0, index) + c + word.substring(index + 1);
    }

    public static String getLetter() {
        Scanner user_input = new Scanner(System.in);
        System.out.println("Enter a letter: ");
        String input = user_input.nextLine();
        return input.substring(0, 1);
    }
}