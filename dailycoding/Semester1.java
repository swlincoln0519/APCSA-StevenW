import java.util.Scanner;
import java.util.Arrays;

public class Semester1 {
    public static void main(String[] args) {
        PiggyBank(); // (CountChange)

        countdown(); // (CountDown)
        
        JavaArrays(); // (Iterate Over Array)

        traversals(); // (Traversals)
        
        coinFlip(); // (Coin Simulation)

        int result = binaryConverter(11110); // (Binary Converter) 
        System.out.println(result); // should output 30

        stringToArray(); // (StringToArray)
    }

    public static void countdown() {
        int countDown = 100;
        
        for(countDown = 100;  countDown > -1; countDown--) {
         if (countDown%10 == 0) {
          System.out.println("** " + countDown + " **");
         }
         else {
          System.out.println(countDown);
         }
        }
        System.out.println("Let's Go Tigers!");
    }

    public static int PiggyBank() 
    {
        Scanner input = new Scanner(System.in);
        int totalPennies;
        int totalNickels;
        int totalDimes;
        int totalQuarters;
        
        System.out.println("How many PENNIES do you have in your piggy bank?");
        totalPennies = input.nextInt();
        
        System.out.println("How many NICKELS do you have in your piggy bank?");
        totalNickels = input.nextInt();
        
        System.out.println("How many DIMES do you have in your piggy bank?");
        totalDimes = input.nextInt();
        
        System.out.println("How many QUARTERS do you have in your piggy bank");
        totalQuarters = input.nextInt();
        
        System.out.println("");
        System.out.println("");
        
        double totalAmount = ((totalPennies * 0.01) + (totalNickels * 0.05) + (totalDimes * 0.1) + (totalQuarters * 0.25));
        return format("You have the following amount in your piggy bank: $ %.2f", totalAmount);

    } 

    public static void javaArrays()
    {
        int[] roomNum = new int[] {754, 756, 164, 168, 172};
        String[] teacherName = {"Mr. Luu", "Mr. Gracia ", "Ms. Situ", "Mr. Skramstad", "Mr. Paja"};
        int[] reverseNum = new int[roomNum.length] ;
        String[] reverseName = new String[teacherName.length];
        
        System.out.println("Lists before revseral: ");
        System.out.println(Arrays.toString(roomNum));
        System.out.println(Arrays.toString(teacherName));
        System.out.println("");
        
        for (int i = 0; i < roomNum.length; i++) {
            reverseNum[i] = roomNum[roomNum.length - i - 1];
        }
        
        for (int i = 0; i < teacherName.length; i++) {
            reverseName[i] = teacherName[teacherName.length - i - 1];
        }
        System.out.println("");
        System.out.println("Lists after revseral: ");
        System.out.println(Arrays.toString(reverseNum));
        System.out.println(Arrays.toString(reverseName));
    }    
    
    public static void traversals()
    {
        String[] className = {"Mandarin", "Health", "AP CHEM", "JROTC", "AP LANG", "APUSH", "AP CALC AB", "APCSA"};
        String[] teacherName = {"Situ", "Mcgillen", "Willis", "Harris", "Paja", "Garcia", "Luu", "Skramstad"};
        
        System.out.println("This is the list of my classes.");
        System.out.println(Arrays.toString(className));
        System.out.println("");
        System.out.println("This is the list of my teacher's last name.");
        System.out.println(Arrays.toString(teacherName));

        System.out.println("");
        System.out.println("ODD:");
        //(i += 2), because the loop is looping through the list by 2s. 
        //(int i = 0), because it makes the loop start at 0, then it adds one
        //to display the first value, which is the odd value.
        for (int i = 0; i < className.length; i += 2) {
            if (i < className.length && i < teacherName.length) {
             System.out.println((i + 1) + " - " + className[i] + " (" + teacherName[i] + ")");
            }
        }
        
        System.out.println("");
        System.out.println("EVEN:");
        //(int i = 1), because that makes the loop began at the first value
        //then displays the value directly after the first value, 
        //making it an even value. 
        for (int i = 1; i < className.length; i += 2) {
            if (i < className.length && i < teacherName.length) {
                System.out.println((i + 1) + " - " + className[i] + " (" + teacherName[i] + ")");
            }
        }
    }

    public static void coinFlip()
    {
        double randNum = Math.random();
        int flips = 100;
        int totalHeads = 0;
        int totalTails = 0;
        
        for (int i = 0; i < flips; i++) {
         randNum = Math.random();
         if (randNum > 0.5) {
            totalHeads ++;
         }
         else {
            totalTails ++;
         }
        }
        System.out.println("The coin flipped " + flips + " times.");
        System.out.print("Heads: " + totalHeads + ", Tails: " + totalTails);
    }

    public static int binaryConverter(int value) {
        int finalValue = 0;
        int multiple = 1;
        
        while (value > 0) {
         if (value % 10 == 1) {
          finalValue = finalValue + multiple;
         }
        value = value / 10;
        multiple = multiple * 2;
        }
        return finalValue;
    }

    public static String stringToArray()
    {
        String str = "WHO LET THE DOGS OUT!";
        String[] words = str.split(" ");
        return Arrays.toString(words);
    }

}