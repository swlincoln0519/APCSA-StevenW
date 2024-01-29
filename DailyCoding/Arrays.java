public class Arrays {
    public static void main(String[] args) {
        //ArrayAscending
        System.out.println(Arrays.toString(arrAscending(2)));
        System.out.println(Arrays.toString(arrAscending(5)));
        System.out.println(Arrays.toString(arrAscending(7)));
        System.out.println(Arrays.toString(arrAscending(9)));
        
        //ConcatArrays
        String [] words = {"popcorn", "ice cream", "licorice", "cotton candy"};
        System.out.println(concatArr(words)); // returns popcorn, ice cream, licorice, and cotton candy.
    }

    public static arrayAscend(){
        int[] result = new int[num + 1];
        for (int i = 0; i <= num; i++) {
            result[i] = i;
        }
        return result;
    }

    public static String concatArr(String [] words) {
        if (words.length == 0) {
            return "";
        }
        else if (words.length == 1) {
            return words[0];
        }
        else {
            StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length - 1; i++) {
            result.append(words[i]).append(", ");
        }
        result.append("and ").append(words[words.length - 1]);
        return result.toString();
        }
    }
}