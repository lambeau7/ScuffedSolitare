import java.util.*;
public class tableau 
{
    private ArrayList<Stack> mycolumns = new ArrayList<Stack>()
    
    public tableau();
    {
        for(int lcv = 0; lcv < 7; lcv++)
        {
            Stack<card> col = new Stack<card>();
        }
    }
    
    public void setTable(deck d)
    {
        for(int lcv = 0; lcv < 7; lcv++)
        {
            card x = d.deal();
            mycolumns.get(lcv).push(x);
        }
    }
}
