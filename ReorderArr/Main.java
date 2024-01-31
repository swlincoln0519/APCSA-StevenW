public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 0, 0, 1};
        int[] result = reorderArr(arr1);
        
        for (int num : result) {
            System.out.print(num + " ");
        }
        
    }
    
    public static int[] reorderArr(int[] arr) {
        int countZero = 0;
        int[] newArr = new int[arr.length];
        
        for (int i =0; i < arr.length; i++) {
            if (arr[i] == 0) {
                countZero++;
            }
        }
        
        for (int i = 0; i < countZero; i++) {
            newArr[i] = 0;
        }
        
        for (int i = 0, j = countZero; i < arr.length; i++) {
            if (arr[i] != 0) {
                newArr[j] = arr[i];
                j++;
            }
        }
        return newArr; 
    }
}