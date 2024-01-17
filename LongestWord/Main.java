public class Main
{
    public static void main(String[] args)
    {
        System.out.println(longestWordLen("What is the longest word in this sentence."));
        System.out.println(longestWordLen("What you most thankful for?"));
        System.out.println(longestWordLen("Let's go Tigers!"));
    }
    
    public static int longestWordLen(String sentence) {
        int max = 0;
        String longW;
        int length = 0;

        for (int i = 0; i < sentence.length(); i++) {
            String word = sentence.substring(i);

            if (word.substring(word.length() - 1) == " " || word.substring(word.length() - 1) == ".") {
                if (length > max) {
                    max = length;
                }
                length = 0;
                 } else {
                 length++;
            }
        }
        return max;
    }
}