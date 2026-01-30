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
}
