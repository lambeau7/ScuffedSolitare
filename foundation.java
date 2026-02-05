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
        String s = x.getSuit();

        if(s.equals("♥"))
        {
            if(mf.get(0).size() == 0)
            {
                if(x.getRank() == 1)
                {
                    mf.get(0).add(x);
                    return true;
                }
                else
                {
                    return false;
                }
            }

            int temp = mf.get(0).get(0).getRank();

            if(x.getRank() == (temp + 1))
            {
                mf.get(0).add(x);
                return true;
            }

            return false;
        }
        if(s.equals("♦"))
        {
            if(mf.get(1).size() == 0)
            {
                if(x.getRank() == 1)
                {
                    mf.get(1).add(x);
                    return true;
                }
                else
                {
                    return false;
                }
            }
            
            int temp = mf.get(1).get(1).getRank();

            if(x.getRank() == (temp + 1))
            {
                mf.get(1).add(x);
                return true;
            }

            return false;
        }
        if(s.equals("♣"))
        {
            if(mf.get(2).size() == 0)
            {
                if(x.getRank() == 1)
                {
                    mf.get(2).add(x);
                    return true;
                }
                else
                {
                    return false;
                }
            }

            int temp = mf.get(2).get(2).getRank();

            if(x.getRank() == (temp + 1))
            {
                mf.get(2).add(x);
                return true;
            }

            return false;
        }
        if(s.equals("♠"))
        {
            if(mf.get(3).size() == 0)
            {
                if(x.getRank() == 1)
                {
                    mf.get(3).add(x);
                    return true;
                }
                else
                {
                    return false;
                }
            }

            int temp = mf.get(3).get(3).getRank();

            if(x.getRank() == (temp + 1))
            {
                mf.get(3).add(x);
                return true;
            }

            return false;
        }

        if(mf.get(0).size() == 13 && mf.get(1).size() == 13 && mf.get(2).size() == 13 && mf.get(3).size() == 13)
        {
            // won lol
        }

        return false;
    }
}
