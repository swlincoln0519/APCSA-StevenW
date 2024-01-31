public class Main
{
    public static void main(String[] args)
    {
        int[] arr1 = {1, 2, 3, 4, 5};
        System.out.println(isAscending(arr1));
        
        int[] arr2 = {5, 4, 3, 2, 1};
        System.out.println(isAscending(arr2));
        
        int[] arr3 = {168, 169, 170, 171, 172};
        System.out.println(isAscending(arr3));
    }
    
    public static boolean isAscending(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true; 
    }
}