package A03_Recursions;

public class code_8
{
    public static void main(String[] args)
    {
        int num = 1;

        System.out.println(isLucky(num));
    }

    static boolean isLucky(int num)
    {
        return luckyCheck(num,2);
    }

    static boolean luckyCheck(int num, int i)
    {
        if(i > num)
        {
            return true;
        }
        if(num % i == 0)
        {
            return false;
        }
        return luckyCheck(num- num/i, ++i);
    }
}
