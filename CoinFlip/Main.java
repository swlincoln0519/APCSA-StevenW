public class Main
{
    public static void main(String[] args)
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
}