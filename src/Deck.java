import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

//Fields:
  
  
  
  List<Card> cards = new ArrayList<Card>();// This Creates a List of cards
  //This is the card of suits for the cars
  public static String[] Suit = {"Diamonds", "Clubs", "Spades", "Hearts"}; 
  //this is the array for each card type
  public static String[] CardType = {"2","3","4","5","6","7","8","9","10", "Jack","Queen","King","Ace"};
  
  //Constructor
  public Deck() {
      for(String s : Suit) { // This instantiates the deck and distributes the cards
          for(int i =2; i< CardType.length + 2; i++) {
              String name = CardType[i-2] + " of " + s;
              int cv = i;
              
           Card c = new Card(name,i);
           cards.add(c);
       }
   }
      
  }
  
  
  public Card draw() {  // This Method Draws the cards and removes the top card in the field
    return cards.remove(0);
  
  }
  //These are the methods
  public void shuffle() { // This Method is for shuffling
      Collections.shuffle(cards);
  }
  
 
      
  }
  
  
  
  

