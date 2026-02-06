import java.util.*;
public class Solitaire
{
    public static void main(String[] args)
    {
        Scanner er = new Scanner(System.in);
        deck d = new deck();
        Stack<card> hand = new Stack<card>();
        tableau table = new tableau();
        table.setTable(d);
        foundation f = new foundation();
        boolean wonfish = false;

        while(wonfish!= false)
        {
            hand = d.drawhand(hand);
           

        }
    }
}
