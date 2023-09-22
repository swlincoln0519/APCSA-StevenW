import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your first name:");
        String name = input.nextLine();
        System.out.println("");
        
        System.out.println("Enter birth date: (in format MM/DD/YY)");
        String birthYear = input.nextLine();
        System.out.println("");

        int year = Integer.parseInt(birthYear.substring(6));
        int remainder = year % 12;
        
        String zodiacSign = "";
        String zodiacDescrip = "";
        
        switch (remainder) {
         case 0:
          zodiacSign = "Monkey";
          zodiacDescrip = "";
          break;
          
         case 1:
          zodiacSign = "Rooster";
          zodiacDescrip = "";
          break;
          
         case 2:
          zodiacSign = "Dog";
          zodiacDescrip = "";
          break;
          
         case 3:
          zodiacSign = "Pig";
          zodiacDescrip = "";
          break;
          
         case 4:
          zodiacSign = "Rat";
          zodiacDescrip = "";
          break;
          
         case 5:
          zodiacSign = "Ox";
          zodiacDescrip = "";
          break;
          
         case 6:
          zodiacSign = "Tiger";
          zodiacDescrip = "";
          break;
          
         case 7:
          zodiacSign = "Rabbit";
          zodiacDescrip = "";
          break;
          
          case 8:
           zodiacSign = "Dragon";
           zodiacDescrip = "";
           break;
           
          case 9:
           zodiacSign = "Snake";
           zodiacDescrip = "";
           break; 
           
          case 10:
           zodiacSign = "Horse";
           zodiacDescrip = "";
           break;
           
          case 11:
           zodiacSign = "Goat";
           zodiacDescrip = "";
           break;
        }
        
        System.out.println("You are a " + zodiacSign + " " + zodiacDescrip);
    }
}