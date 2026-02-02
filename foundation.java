import java.util.*;
public class foundation 
{
    private ArrayList<Stack<card>> mf = new ArrayList<Stack<card>>();

    public foundation()
    {
        for(int lcv = 0; lcv < 4; lcv++)
        {
            Stack<card> p = new Stack<card>();
            mf.add(p);
        }
    }

    public boolean canPlace(card x)
    {
        boolean flag = false;
        String s = x.getSuit();
        return flag;
    }
}
