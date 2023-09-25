package A03_Recursions;
//  josephus problem:


public class code_7
{
    public static void main(String[] args)
    {
        int num = 5;
        int k = 2;
        System.out.println(lastToLive(num,k));
    }

    static int lastToLive(int num, int  k)
    {
        if(num == 1)
        {
            return 1;
        }
        return ((lastToLive(num-1,k) + k-1)%num + 1);
    }
}
