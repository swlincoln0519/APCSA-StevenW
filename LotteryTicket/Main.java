public class Main
{
    public static void main(String[] args)
    {
        System.out.println(lottery(10, 15, 20));
        System.out.println(lottery(69, 69, 69));
        System.out.println(lottery(25, 25, 50));
        System.out.println(lottery(60, 25, 25));
        System.out.println(lottery(25, 30, 25));
    }
    
    public static int lottery(int a, int b, int c) {
        if (a != b && b != c && c != a) {
            return 1;
        }
        else if (a == b && b == c && c == a) {
            return 10;
        }
            return 20;
    }
}