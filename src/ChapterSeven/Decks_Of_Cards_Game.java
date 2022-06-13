package ChapterSeven;

public class Decks_Of_Cards_Game {
//    Say you want to write a program that will pick four cards at random from a deck of 52 cards.
//    All the cards can be represented using an array named deck, filled with initial values 0 to 51,
//    Card numbers 0 to 12, 13 to 25, 26 to 38, and 39 to 51 represent 13 Spades, 13 Hearts,
//    13 Diamonds, and 13 Clubs, respectively, cardNumber / 13
//    determines the suit of the card and cardNumber % 13 determines the rank of the card,
//    After shuffling the array deck, pick the first four cards from deck. The program
//    displays the cards from these four card numbers
    public static void main(String[]args) {
        int[] deck = new int[52];
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs" };
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
        // Initialize the cards // Shuffle the cards and generate an index randomly
        for (int i = 0; i < deck.length; i++)
            deck[i] = i;
        // Shuffle the cards and generate an index randomly
        //for(int i= 0; i < deck.length; i++){
        for (int i = 0; i < deck.length; i++) {
            int index = (int) (Math.random() * deck.length);
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }
            // Display the first four cards
        for (int i = 0; i < 4; i++) {
            String suit = suits[deck[i] / 13];
            String rank = ranks[deck[i] % 13];
            System.out.println("Card number " + deck[i] + ": " + rank + " of " + suit);

        }

    }
}
