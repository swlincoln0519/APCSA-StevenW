public class Semester2 {
    public static void main(String[] args) {
        //KindaSum
        System.out.println(sumInt(5, 7));
        System.out.println(sumInt(5, 4));
        System.out.println(sumInt(10, 12));

        //AnswerPhone
            //morning & friend
        System.out.println(answerCall(true, true, false));
            //morning & friend & asleep 
        System.out.println(answerCall(true, true, true));
            //asleep
        System.out.println(answerCall(false, false, true));
            //isFriend
        System.out.println(answerCall(false, true, false));
            //isFriend & asleep 
        System.out.println(answerCall(false, true, true));

        //love7
        System.out.println(love7(3, 4));
        System.out.println(love7(5, 12));
        System.out.println(love7(8, 6));
        System.out.println(love7(-4, -11));

        //lotteryTicket
        System.out.println(lottery(10, 15, 20));
        System.out.println(lottery(69, 69, 69));
        System.out.println(lottery(25, 25, 50));
        System.out.println(lottery(60, 25, 25));
        System.out.println(lottery(25, 30, 25));

        //longestWord
        System.out.println(longestWordLen("What is the longest word in this sentence."));
        System.out.println(longestWordLen("What you most thankful for?"));
        System.out.println(longestWordLen("Let's go Tigers!"));

        //reorderArr
        int[] arr1 = {1, 0, 0, 1};
        int[] result = reorderArr(arr1);
        
        for (int num : result) {
            System.out.print(num + " ");
        }

        //zeroToMax
        int[] array1 = {0, 5, 0, 3};
        int[] array2 = {0, 4, 0, 3};
        
        System.out.println(Arrays.toString(zeroToMax(arr1)));
        System.out.println(Arrays.toString(zeroToMax(arr2)));
        
        //getMinMax
        double[] array3 = {2.3, 2.1, 5.4, 8.9, 7.7, 1.0, .95, 9.9, 2.2};
        double[] results = minMax(arr1);
        System.out.println("Minimum: " + results[0] + ", " + "Maximum: " + results[1]);
    }

    public static int sumInt(int n1, int n2) {
        int sum = 0;
        sum = n1 + n2;
        if (sum >= 10 && sum <= 19) {
            return 20;
        }
            return sum; 
    }

    public static boolean answerCall(boolean morning, boolean isFriend, boolean asleep) {
        if (asleep) {
            return false; 
        }
        else if (morning && isFriend) {
            return true;
        }
        return true;
    }

    public static boolean love7(int n1, int n2) {
        
        return n1 == 7 || n2 == 7 || n1 + n2 == 7 || n2 - n1 == 7 || n1 - n2 == 7;
    }

    public static int lottery(int a, int b, int c) {
        if (a != b && b != c && c != a) {
            return 1;
        }
        else if (a == b && b == c && c == a) {
            return 10;
        }
            return 20;
    }

    public static int longestWordLen(String sentence) {
        int max = 0;
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

    public static int[] reorderArr(int[] arr) {
        int countZero = 0;
        int[] newArr = new int[arr.length];
        
        for (int i =0; i < arr.length; i++) {
            if (arr[i] == 0) {
                countZero++;
            }
        }
        
        for (int i = 0; i < countZero; i++) {
            newArr[i] = 0;
        }
        
        for (int i = 0, j = countZero; i < arr.length; i++) {
            if (arr[i] != 0) {
                newArr[j] = arr[i];
                j++;
            }
        }
        return newArr; 
    }

    public static int[] zeroToMax(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] % 2 != 0) {
                    max = Math.max(max, arr[j]);
                    }
                }
                arr[i] = max;
            }
        }
        return arr;
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