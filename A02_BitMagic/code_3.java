package A02_BitMagic;

public class code_3
{
    public static void main(String[] args)
    {
        int num = 12345;
        System.out.println(Integer.toBinaryString(num));
        System.out.println(setBits(num));
    }
    static int setBits(int num)
    {
        int count = 0;
        while(num != 0)
        {
            count++;
            num = num&(num-1);
        }
        return count;
    }
}
