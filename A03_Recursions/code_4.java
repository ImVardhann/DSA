package A03_Recursions;
//  return max cuts possible:


public class code_4
{
    public static void main(String[] args)
    {
        int len = 15;
        int a = 5;
        int b = 6;
        int c = 7;
        System.out.println(maxCuts(len,a,b,c));
    }

    static int maxCuts(int len, int a, int b, int c)
    {
        if(len == 0)
        {
            return 0;
        }
        else if (len < 0)
        {
            return -1;
        }
        int res = 0;

        res = Math.max((Math.max(maxCuts(len-a,a,b,c),maxCuts(len-b,a,b,c))),maxCuts(len-c,a,b,c));

        if (res < 0)
        {
            return -1;
        }
        return res+1;
    }

}
