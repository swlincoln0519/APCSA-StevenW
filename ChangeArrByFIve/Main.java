public class Main
{
    public static void main(String[] args)
    {
        double[] array = {5.3, -1.2, 1.2, -8.7, 9.9, 5.3, 8.8};
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                array[i] *= 5;
            }
            else {
                array[i] = 0;
            }
            if (i == array.length - 1) {
                System.out.print("and " + array[i]);
            }
            else {
                System.out.print(array[i] + ", ");
            }
        }
    }
}