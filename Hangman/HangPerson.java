import java.util.Scanner;

public class HangPerson {
    String word;
    String wordStatus;
    String guessedLetters = "";
    int incorrect = 0;
    int correct = 0;
    Scanner user_input;

    public void start() {
        System.out.println("Welcome to Hangperson");
        System.out.println();
        System.out.println("The rules are simple.. You know the drill. Guess the word before time runs out.");
        System.out.println();
        System.out.println("Choosing word....");
        setup();
        run();
    }

    public void setup() {
        word = getRandomWord();
        setupWordStatus();
    }

    public void run() {
        user_input = new Scanner(System.in);
        while (incorrect < 5 && !wordStatus.equals(word)) {
            System.out.print("Enter a letter: ");
            showStatus();
            char letter = user_input.next().substring(0, 1).charAt(0);
            boolean isGuessed = checkGuessedLetter(letter);
            if (isGuessed) {
                System.out.println("You already guessed that letter. Try another one!");
            } else {
                guessedLetters += letter;
                if (word.indexOf(letter) != -1) {
                    updateWordStatus(letter);
                } else {
                    incorrect++;
                    showHangman(incorrect);
                }
            }
        }
        if (wordStatus.equals(word)) {
            System.out.println("Congratulations! You guessed the word " + word);
        } else {
            System.out.println("Sorry! You've used all your attempts. The word was: " + word);
        }
        user_input = null;
    }

    public void updateWordStatus(char letter) {
      String updatedStatus = wordStatus;
      for (int i = 0; i < word.length(); i++) {
       if (word.substring(i, i + 1).equals(String.valueOf(letter))) {
         updatedStatus = updatedStatus.substring(0, i) + letter + updatedStatus.substring(i + 1);
       }
      }
      wordStatus = updatedStatus;
    }
    
    private void setupWordStatus() {
      String ws = "";
      for (int i=0; i < word.length(); i ++) {
          ws += "_";
      }
      wordStatus = ws;
    }

    private String displayCurrentStatus() {
        
      String newStr ="";
      for (int i =0; i < wordStatus.length(); i ++) {
        newStr += wordStatus.substring(i, i + 1);
        newStr += " ";
      }
      return newStr;
    }

    public boolean checkGuessedLetter(char c) {
        return guessedLetters.contains(String.valueOf(c));
    }

    public void showStatus() {
        System.out.println("There are " + word.length() + " letters in the word.");
        System.out.println("You have guessed these letters: " + guessedLetters);
        System.out.println("Current status: " + displayCurrentStatus());
        System.out.println();
    }

    public String getRandomWord() {
        String tenWords = "0science1chemistry2computers3measurements4thermometer5ecology6hypothesis7procedure8evidence9experiment";
        int randInt = (int) ((Math.random() * 10) + 1);
        int startPos = tenWords.indexOf(String.valueOf(randInt));
        int endPos = tenWords.indexOf(String.valueOf(randInt + 1));
        if (randInt < 9) {
            String word = tenWords.substring(startPos + 1, endPos);
            System.out.print(word);
            return word;
        }
        return "";
    }

    private void showHangman(int inc) {
        switch (inc) {
            case 0:
                break;
            case 1:
                System.out.println("We've got the scaffold ready...");
                System.out.println("   _______");
                System.out.println("    |/      |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("   _|___");
                break;
            case 2:
                System.out.println("Second wrong.. he's hanging...");
                System.out.println("   _______");
                System.out.println("    |/      |");
                System.out.println("    |      (_)");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("   _|___");
                break;
            case 3:
                System.out.println("He's raising his hands for help.. Help him!...");
                System.out.println("   _______");
                System.out.println("    |/      |");
                System.out.println("    |      (_)");
                System.out.println("    |      \\|/");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("   _|___");
                break;
            case 4:
                System.out.println("No time left.. one false step...");
                System.out.println("   _______");
                System.out.println("    |/      |");
                System.out.println("    |      (_)");
                System.out.println("    |      \\|/");
                System.out.println("    |       |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("   _|___");
                break;
            case 5:
                System.out.println("Times up!");
                System.out.println("   _______");
                System.out.println("    |/      |");
                System.out.println("    |      (_)");
                System.out.println("    |      \\|/");
                System.out.println("    |       |");
                System.out.println("    |      / \\");
                System.out.println("    |");
                System.out.println("   _|___");
                break;
        }
    }
}