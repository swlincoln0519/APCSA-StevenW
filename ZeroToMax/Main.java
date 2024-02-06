import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        int[] arr1 = {0, 5, 0, 3};
        int[] arr2 = {0, 4, 0, 3};
        
        System.out.println(Arrays.toString(zeroToMax(arr1)));
        System.out.println(Arrays.toString(zeroToMax(arr2)));
    }
    
    public static int[] zeroToMax(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] % 2 != 0) {
                    max = Math.max(max, arr[j]);
                    }
                }
                arr[i] = max;
            }
        }
        return arr;
    }
}