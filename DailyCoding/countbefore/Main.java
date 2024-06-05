public class Main
{
    public static void main(String[] args)
    {
        String[] array = {"asymptote", "binomial", "concavity", "differentiate", "e", "variable"};
        String target = "e";
        int count = 0;
        
        for (String str : array) {
            if (str.compareTo(target) < 0) {
                count++;
            }
        }
        System.out.println(count + ", is the number of strings that come before \"" + target + "\" alphabetically.");
    }
}