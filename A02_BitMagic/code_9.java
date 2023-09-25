package A02_BitMagic;
//  return the binary equivalent of the given gray code equivalent decimal
public class code_9
{
    public static void main(String[] args)
    {
        int num = 5;
        System.out.println(BinaryEquivalent(num));
    }

    static int BinaryEquivalent(int num)
    {
        int res = 0;

        while(num > 0)
        {
            res = res ^ num;
            num = num >>1;
        }
        return res;
    }
}
