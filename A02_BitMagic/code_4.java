package A02_BitMagic;
//  check is the number a power of two;


public class code_4
{
    public static void main(String[] args)
    {
        int num = 127;
        System.out.println(Integer.toBinaryString(num));

        System.out.println(isPowerOf2(num));

    }

    static boolean isPowerOf2(int num)
    {
        return ((num&(num-1)) == 0);
    }
}
