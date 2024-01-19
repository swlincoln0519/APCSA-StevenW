public class Arrays {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrAscending(2)));
        System.out.println(Arrays.toString(arrAscending(5)));
        System.out.println(Arrays.toString(arrAscending(7)));
        System.out.println(Arrays.toString(arrAscending(9)));
        
    }

    public static arrayAscend(){
        int[] result = new int[num + 1];
        for (int i = 0; i <= num; i++) {
            result[i] = i;
        }
        return result;
    }
}