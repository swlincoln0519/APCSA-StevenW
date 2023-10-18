import java.util.Random;
import java.util.Scanner; 
public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        String[] responses = {"It is certain", "It is decidedly so", 
        "Without a doubt", "Yes definitely", "You may rely on it", 
        "As I see it, yes", "Most likely", "Outlook good", "Yes", 
        "Signs point to yes", "Reply hazy, try again", "Ask again later", 
        "Better not tell you now", "Cannot predict now", 
        "Concetrate and ask again", "Don't count on it", "My reply is no", 
        "My sources say no", "Outlook not so good", "Very doubtful"};
        
         System.out.println("Enter " + "\"" + "Quit" + "\"" + " to stop the program.");  
         System.out.println("Ask the Magic 8 Ball a (Yes or No) Question: ");
         String question = input.nextLine();
         System.out.println("");

        while (!question.equalsIgnoreCase("Quit")) {
            int index = rand.nextInt(responses.length);
             String response = responses[index];
             System.out.println("8 Ball: " + response);
             System.out.println("\n");
             System.out.println("Enter " + "\"" + "Quit" + "\"" + " to stop the program."); 
             System.out.println("Ask the Magic 8 Ball a (Yes or No) Question: ");
             question = input.nextLine();
             System.out.println("");
        }
         System.out.println("8 Ball Signing Off");
    }
}