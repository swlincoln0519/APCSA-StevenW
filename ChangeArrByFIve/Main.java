public class Main
{
    public static void main(String[] args)
    {
        double[] arrayQuintuple = {5.3, -1.2, 1.2, -8.7, 9.9, 5.3, 8.8};
        changebyFive(arrayQuintuple);
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
}