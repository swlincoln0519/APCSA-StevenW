public class Main
{
    public static void main(String[] args)
    {
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
}