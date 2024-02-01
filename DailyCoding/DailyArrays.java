import java.util.Arrays;

public class DailyArrays {
    public static void main(String[] args) {
        //ArrayAscending
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

        //ChangeArrByFive
        double[] arrayQuintuple = {5.3, -1.2, 1.2, -8.7, 9.9, 5.3, 8.8};
        changebyFive(arrayQuintuple);

        //CloneArray
        int[] sequence = {1, 2, 3};
        int[] newArr = cloneArray(sequence, 3);
        
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i]);
            if (i != newArr.length - 1) {
                System.out.print(", ");
            }
        }

        //InsertIntoArray
        String[] teachers = {"Mr. Luu", "Mr. Garcia", "Mr. Brewer", "Ms. Situ", "Ms. Willis", "Ms. Crabtree"};
        teachers = insertIntoArray(teachers, 2, "Mr. Skramstad");
        for (int i = 0; i < teachers.length; i++) {
            String teacher = teachers[i];
            System.out.print(teacher + " | ");
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

    public static void changebyFive(double[] arrayQuintuple) {
        for (int i = 0; i < arrayQuintuple.length; i++) {
            if (arrayQuintuple[i] > 0) {
                arrayQuintuple[i] *= 5;
            }
            else {
                arrayQuintuple[i] = 0;
            }
            if (i == arrayQuintuple.length - 1) {
                System.out.print("and " + arrayQuintuple[i]);
            }
            else {
                System.out.print(arrayQuintuple[i] + ", ");
            }
        }
    }

    public static int[] cloneArray(int[] sequence, int n) {
        int[] newArr = new int[sequence.length * n];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = sequence[i % sequence.length];
        }
        return newArr;
    }

    public static String[] insertIntoArray(String[] arr, int index, String name) {
        String[] newArr = new String[arr.length + 1];
        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }
        newArr[index] = name;
        for (int i = index + 1; i < newArr.length; i++) {
            newArr[i] = arr[i - 1];
        }
        return newArr;
    }
}