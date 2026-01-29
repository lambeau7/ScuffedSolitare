import java.util.*;

public class deck 
{
  private ArrayList<card> cards = new ArrayList<>();

  public deck()
  {
    String[] suits = {"S","H","D","C"};
    for(String s : suits) 
    {
      for(int r = 1; r <= 13; r++)
      {
        cards.add(new card(r, s));
      }
    }
    shuffle();
  }

  public void shuffle() 
  {
    Collections.shuffle(cards);
    // This is why we ask AI some things... 
  }

  public card deal()
  {
    return cards.remove(cards.size() - 1);
  }
}
    
