public class card {
  private int rank;
  private String suit;
  private boolean faceUp;
  private String color;

  public card(int rank, String suit)
  {
    this.rank = rank;
    this.suit = suit;
    this.faceUp = false;
    if(this.suit.equals("♥") || this.suit.equals("♦"))
    {
      color = "red";
    }
    else
    {
      color = "black";
    }
  }

  public int getRank()
  {
    return rank;
  }
  public String getSuit()
  {
    return suit;
  }
  public boolean isFaceUp()
  {
    return faceUp;
  }
  public void flip()
  {
    faceUp = !faceUp;
  }
  public String getColor()
  {
    return color;
  }
  public String toString()
  {
    return( faceUp ? rank + "" + suit : "XX");
    // HOLY HELL THIS IS AMAZING ^^^ (basically shortened a entire if statement :D
  }
  
}
