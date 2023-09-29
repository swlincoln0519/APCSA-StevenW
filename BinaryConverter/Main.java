public class Main
{
    public static void main(String[] args)
    {
        int result = binaryConverter(11110);
        System.out.println(result);
    }
    
    public static int binaryConverter(int value) {
        int finalValue = 0;
        int multiple = 1;
        
        while (value > 0) {
         if (value % 10 == 1) {
          finalValue = finalValue + multiple;
         }
        value = value / 10;
        multiple = multiple * 2;
        }
        return finalValue;
    }
}