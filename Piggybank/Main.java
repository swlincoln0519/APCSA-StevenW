import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) 
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
        System.out.format("You have the following amount in your piggy bank: $ %.2f", totalAmount);

    } 
}