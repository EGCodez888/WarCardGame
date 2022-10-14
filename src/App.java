
public class App {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

// Step 3 
    Deck deck = new Deck(); // Instantiated a deck and 2 players
    Player player1 = new Player();
    Player player2 = new Player();
    
    deck.shuffle(); // this is the shuffle method
    
    // Step 4
    
    for(int i = 0; i < 52; i++) { // For loop to to iterate through the deck
        if (i % 2 == 0) {
            player1.draw(deck);
        } else {
            player2.draw(deck);
        }
    }
    
// Step 5
    for(int i = 0; i < 26 ; i++) {  // This iterates 26 times and calls the flip method for each player
        Card player1Cards = player1.flip(); // This is flip method for each player
        Card player2Cards = player2.flip();
        
        if (player1Cards.getValue() > player2Cards.getValue()) { // this calls the increment method on the player that has the higher score
            player1.incrementScore();
            
        } if (player1Cards.getValue() < player2Cards.getValue()) {
            player2.incrementScore();
        }
    }

    
    // Part 6 getting the scores
System.out.println("Player 1's Score is : " + player1.getScore());
System.out.println("Player 2's Score is : " + player2.getScore());
    

// Step 7 printing out the results
if (player1.getScore() > player2.getScore()) {
  System.out.println("Player 1 wins!");
  
} else if (player1.getScore() < player2.getScore()) {
  System.out.println("Player 2 wins!");
  
} else {
  System.out.println("Draw");
}
    }
  {
    
    
    
}
  
  
  
  
}
