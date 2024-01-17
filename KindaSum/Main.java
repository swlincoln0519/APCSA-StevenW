public class Main
{
    public static void main(String[] args) {
        System.out.println(sumInt(5, 7));
        System.out.println(sumInt(5, 4));
        System.out.println(sumInt(10, 12));
    }
    
    public static int sumInt(int n1, int n2) {
        int sum = 0;
        sum = n1 + n2;
        if (sum >= 10 && sum <= 19) {
            return 20;
        }
            return sum; 
    }
}