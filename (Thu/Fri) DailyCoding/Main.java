public class Main
{
    public static void main(String[] args)
    {
        int[] arr1 = {3, 3, 1, 4, 3};
        int[] arr2 = {4, 4, 2, 6, 4};
        int[] arr3 = {5, 2, 5, 2, 5};
        
        System.out.println(oddEvenCheck(arr1));
        System.out.println(oddEvenCheck(arr2));
        System.out.println(oddEvenCheck(arr3));
    }
    
    public static boolean oddEvenCheck(int[] arr) {
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] % 2 == 1 && arr[i + 1] % 2 == 0 && arr[i + 2] % 2 == 1) {
                return true;
            }
        }
        return false;
    }
}