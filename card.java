public class card {
  private int rank;
  private string suit;
  private boolean faceUp;

  public card(int rank, string suit)
  {
    this.rank = rank;
    this.suit = suit;
    this.faceUp = false;
  }

  public int getRank()
  {
    return rank;
  }
  public string getSuit()
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
  public string toString()
  {
    return( faceUp ? rank + "" + suit : "XX");
    // HOLY HELL THIS IS AMAZING ^^^ (basically shortened a entire if statement :D
  }
  
}
