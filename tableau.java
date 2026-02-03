import java.util.*;
public class tableau 
{
    private ArrayList<Stack<card>> mycolumns = new ArrayList<Stack<card>>();
    
    public tableau()
    {
        for(int lcv = 0; lcv < 7; lcv++)
        {
            Stack<card> col = new Stack<card>();
            mycolumns.add(col);
        }
    }
    
    public void setTable(deck d)
    {
        for(int lcv = 0; lcv < 7; lcv++)
        {
            for(int lcv2 = 0; lcv2 < lcv; lcv2++)
            {
                card x = d.deal();
                if(lcv2 != lcv - 1)
                {
                    x.flip();
                }
                mycolumns.get(lcv).push(x);
            }
        }
    }

    public boolean canPlace(card x, int sp)
    {
        Stack<card> yes = mycolumns.get(sp);
        card y = yes.peek();
        if(x.getRank() == 1)
        {
            return false;
        }
        if(y.getColor().equals("black"))
        {
            if(x.getColor().equals("red") && x.getRank() == y.getRank() - 1)
            {
                yes.push(x);
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            if(x.getColor().equals("black") && x.getRank() == y.getRank() - 1)
            {
                yes.push(x);
                return true;
            }
        }
        return false;
    }
    public boolean canCut(int csp, int msp, int msp2)
    {
        Stack<card> x = mycolumns.get(msp);
        //taking a break now, atleast on this method
        //notes for steps
        //1. put supposed stack of cards you want to move into a stack(peek)
        //2. check if you can put stack into new spot in new column(canPlace bottom card)
        //3. Return false if you cant
        //4. if you can, create the stack for real real(pop instead of peek)
        //5. move real stack to new spot
        // - PAST KAI
        return false;
    }
    public boolean newStack(card x, int sp)
    {
        if(mycolumns.get(sp).empty() == true)
        {
            return false;
        }
        if (x.getRank() == 13)
        {
            mycolumns.get(sp).push(x);
            return true;
        }
        return false;
    }
}
