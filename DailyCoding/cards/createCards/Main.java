public class Main
{
    public static void main(String[] args)
    {
        String[] deck = createCards();
        
        for (String card : deck) {
            System.out.println(card);
        }
    }
    
    public static String[] createCards() {
        String[] values = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        String[] suits = {"Clubs", "Hearts", "Diamonds", "Spades"};
        String[] deck = new String[52];
        int index = 0 ;
        
        for (String value : values) {
            for (String suit : suits) {
                deck[index] = value + " of " + suit;
                index++;
            }
        }
    return deck;
    }
}