public class Main
{
    public static void main(String[] args)
    {
        int[] sequence = {1, 2, 3};
        int[] newArr = cloneArray(sequence, 3);
        
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i]);
            if (i != newArr.length - 1) {
                System.out.print(", ");
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
}