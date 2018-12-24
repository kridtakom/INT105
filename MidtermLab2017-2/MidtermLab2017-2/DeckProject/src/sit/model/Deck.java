package sit.model;

public class Deck {

    private Card[] cards;
    private int size;

    public Deck() {
        cards = new Card[52];
        int count = 0;
        int suit = 0 ;
        int rank ;
        this.size = cards.length;
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= 13; j++) {
                switch (i){
                    case 0: suit = Card.SPADES; break; 
                    case 1: suit = Card.HEARTS; break;
                    case 2: suit = Card.DIAMONDS; break;
                    default: suit = Card.CLUBS; break;
                    // seitch case ต้องมี default ตลอด
                }
                 switch (j){
                    case 1: rank  = Card.ACE; break; 
                    case 11: rank  = Card.JACK; break;
                    case 12: rank  = Card.QUEEN; break;
                    case 13: rank  = Card.KING; break;
                    default : rank  =j;
                }
                
                
                cards[count] = new Card(rank , suit);
                count++;
            }
        }
         

    }

   
/**
 * Return the number of Cards currently in the Deck.
 */
public int size() {
        return size;
    }

    /**
     * Remove one Card from the Deck and return it.
     */
    public Card deal() {
        size--;
        return cards[size];
    }

    /**
     * Return true if the Deck contains no Cards.
     */
    public boolean isEmpty() {
        return size == 0;
    }

    public Card[] getCards() {
        return cards;
    }

    @Override
        public String toString() {
        String cardInDecks = "";
        for (Card c : cards) {
            cardInDecks += c + "\n";
        }
        return cardInDecks;
    }

    /**
     * Randomly rearrange the Cards in the Deck.
     */
    public void shuffle() {
    
    }

    /**
     * Swap the Cards at indices i and j.
     */
    public void swap(int i, int j) {
    
    }

    public Card getMaxCard() { 
    
    }

}
