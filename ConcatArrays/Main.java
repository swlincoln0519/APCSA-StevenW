public class Main
{
    public static void main(String[] args)
    {
        String [] words = {"popcorn", "ice cream", "licorice", "cotton candy"};
        System.out.println(concatArr(words)); // returns popcorn, ice cream, licorice, and cotton candy.
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