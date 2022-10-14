
public class Card {

//Part 1a. Created a class named Card


    private int value;
    private String name;
    

// constructor for Card Class
public Card (String name, int value) {
    this.name = name;
    this.value = value;
}

// Getter And Setters for both value and name
public int getValue() {
    return value;
}


public void setValue(int value) {
    this.value = value;
}


public String getName() {
    return name;
}


public void setName(String name) {
    this.name = name;
}
    
    
    public void describe() {
        System.out.println(name  +" has the value of: " + value); // this prints out the name and value of the method describe
    }
  
  
  
}
