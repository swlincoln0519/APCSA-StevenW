public class Main
{
    public static void main(String[] args)
    {
        double[] arr1 = {2.3, 2.1, 5.4, 8.9, 7.7, 1.0, .95, 9.9, 2.2};
        double[] result = minMax(arr1);
        System.out.println("Minimum: " + result[0] + ", " + "Maximum: " + result[1]);
    }
    
    public static double[] minMax(double[] arr) {
        double max = arr[0]; 
        double min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            
            if (arr[i] > max) {
                max = arr[i];
            }
            else if (arr[i] < min) {
                min = arr[i];
            }
        }
        return new double[] {min, max};
    }
}