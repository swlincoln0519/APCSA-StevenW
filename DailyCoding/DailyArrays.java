import java.util.Arrays;

public class DailyArrays {
    public static void main(String[] args) {
        // ArrayAscending
        System.out.println(Arrays.toString(arrayAscend(2)));
        System.out.println(Arrays.toString(arrayAscend(5)));
        System.out.println(Arrays.toString(arrayAscend(7)));
        System.out.println(Arrays.toString(arrayAscend(9)));
        
        // ConcatArray
        String[] words = {"popcorn", "ice cream", "licorice", "cotton candy"};
        System.out.println(concatArr(words));

        // ConcatArray
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10};
        
        //ConcatArrays
        int[] combinedArray = combineArrays(arr1, arr2);
        for (int num : combinedArray) {
            System.out.print(num + " ");
        }
    }

    public static int[] arrayAscend(int num){
        int[] result = new int[num + 1];
        for (int i = 0; i <= num; i++) {
            result[i] = i;
        }
        return result;
    }

    public static String concatArr(String[] words) {
        if (words.length == 0) {
            return "";
        } else if (words.length == 1) {
            return words[0];
        } else {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < words.length - 1; i++) {
                result.append(words[i]).append(", ");
            }
            result.append("and ").append(words[words.length - 1]);
            return result.toString();
        }
    }

    public static int[] concatArrays(int[] arr1, int[] arr2) {
        int[] concatArray = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, concatArray, 0, arr1.length);
        System.arraycopy(arr2, 0, concatArray, arr1.length, arr2.length);
        return concatArray;
    }
}