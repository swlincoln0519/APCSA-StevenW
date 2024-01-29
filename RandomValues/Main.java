public class Main
{
    public static void main(String[] args)
    {
        int n = (int) (Math.random() * 10) + 1;
        int[] randArr = randomValue(n);
        for (int i = 0; i < randArr.length; i++) {
            System.out.print(randArr[i] + " ");
        }
    }
    
    public static int[] randomValue(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * 100) + 1;
        }
        return arr;
    }
}