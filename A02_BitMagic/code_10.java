package A02_BitMagic;
//  swap all odd and even bits:

/*
time complexity:    O(1)
space complexity:   O(1)
*/

public class code_10
{
    public static void main(String[] args)
    {
        int num = 156;
        System.out.println(num);
        System.out.println(Integer.toBinaryString(num));
        System.out.println(swapAllOddEveBits(num));
        System.out.println(Integer.toBinaryString(swapAllOddEveBits(num)));
    }
    static int swapAllOddEveBits(int num)
    {
        return (num & 0xAAAAAAAA) >> 1 | (num & 0x55555555) << 1;
    }
}
