import java.util.Scanner;

public class InputHelper {
    static Scanner userInput = new Scanner(System.in);

    public static char getChar(String message) {
        System.out.println(message);
        String answer = userInput.nextLine().toUpperCase();
        return answer.charAt(0);
    }
}