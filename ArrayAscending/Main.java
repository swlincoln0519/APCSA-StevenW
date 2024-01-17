import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println(Arrays.toString(arrAscending(2)));
        System.out.println(Arrays.toString(arrAscending(5)));
        System.out.println(Arrays.toString(arrAscending(9)));
        System.out.println(Arrays.toString(arrAscending(12)));

    }
    
    public static int [] arrAscending(int num) {
        int[] result = new int[num + 1];
        for (int i = 0; i <= num; i++) {
            result[i] = i;
        }
        return result;
    }
}