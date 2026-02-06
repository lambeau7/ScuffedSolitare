
import java.util.*;

public class deck {
  private Stack<card> cards = new Stack<card>();

  public deck() {
    String[] suits = { "♠", "♥", "♦", "♣" };
    for (String s : suits) {
      for (int r = 1; r <= 13; r++) {
        cards.push(new card(r, s));
      }
    }
    shuffle();
  }

  public void shuffle() {
    Collections.shuffle(cards);
    // This is why we ask AI some things...
  }

  public card deal() {
    return cards.pop();
  }

  public void draw() {

    deal();
  }


  public Stack<card> drawhand(Stack<card> temp)
  {
    if (cards.size() != 0) {
      temp.push(cards.pop());
      return temp;
    }
    cards = temp;
    Stack<card> f = new Stack<card>();
    f.push(cards.pop());
    return f;
  }
}
