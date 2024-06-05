public class MyProgram
{
    public static void main(String[] args)
    {
        String[] cards = {"Alice of Clubs", "Two of Diamonds", "Jack of Spades", "Two of Hearts"};
        shuffle(cards);
        
        for (String card : cards) {
            System.out.println(card);
        }
    }
    
    public static void shuffle(String[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            int rand = (int) (Math.random() * (i + 1));
            String temp = arr[i];
            arr[i] = arr[rand];
            arr[rand] = temp;
        }
    }
}