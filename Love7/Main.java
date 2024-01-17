public class Main
{
    public static void main(String[] args) {
        System.out.println(love7(3, 4));
        System.out.println(love7(5, 12));
        System.out.println(love7(8, 6));
        System.out.println(love7(-4, -11));
    } 
    
    public static boolean love7(int n1, int n2) {
        
        return n1 == 7 || n2 == 7 || n1 + n2 == 7 || n2 - n1 == 7 || n1 - n2 == 7;
    }

}