import java.util.ArrayList;
import java.util.List;

public class Player {

  //Fields
  private List<Card> hand = new ArrayList<Card>();  // This created a List of cards in a Array
  
  private int score; // this creates field of integer value named score
  
  private String name; // this is creating a field named name
  
  
  
  //Constructor - Player Class
  public Player() {
      setScore(0);// this sets the score to 0 inside the constructor
      
  }
  //Methods
  public String describe() {  //This is the describe method that shows the card information
      System.out.println("The players cards are " + name);
      for(Card card : hand) {
          card.describe();
      }
      return name;
  }
  
  
  public void draw(Deck deck) {// This method takes a deck as an argument and calls the draw method on the deck adding the returning card to the hand field
      hand.add(deck.draw());
  }
  
  public Card flip() {   //This method removes and returns the top card of the Hand
    return hand.remove(0);
  }
 
  public int getScore() { // this is the Getter
      return score;
  }
  
  public void setScore(int score) { // this is the Setter
      this.score = score;
  }
  
  public void incrementScore() {  // This adds 1 to the players score 
    setScore(getScore() + 1);
  }
  
}
