public class Main
{
    public static void main(String[] args)
    {
        Deck deck = new Deck();
        Card[] cards = deck.getCards();

        deck.displayDeck();
    }
    
    public static class Card {
        private String suit; 
        private String value; 
        
        public Card(String suit, String value) {
            this.suit = suit;
            this.value = value;
        }
        
        public String getSuit() {
            return suit;
        }
        
        public String getValue() {
            return value; 
        }
    }
    
    public static class Deck {
        private Card[] cards; 
        
        public Deck() {
            String[] values = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
            String[] suits = {"Clubs", "Hearts", "Diamonds", "Spades"};
            cards = new Card[52];
            int index = 0;
            
            for (String value : values) {
                for (String suit : suits) {
                    cards[index] = new Card(suit, value);
                    index++;
                }
            }
        }
        
            public Card[] getCards() {
                return cards;
        }
        
        public void displayDeck() {
            int index = 1;
            for (Card card : cards) {
                System.out.println("[" + index + ": " + card.getValue() + " of " + card.getSuit() + "]");
                index++;
            }
        }
    }
}