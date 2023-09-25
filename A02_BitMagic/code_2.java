package A02_BitMagic;
//  find first set bit:


public class code_2
{
    public static void main(String[] args)
    {
        int num = 12345;
        System.out.println(Integer.toBinaryString(num));
        System.out.println("first set bit in the number "+num+" is "+firstSetBit(num));
    }
    static int firstSetBit(int num)
    {
        int i = 1;

        while(num > 0)
        {
            if(num %2 == 1)
            {
                return i;
            }
            num = num/2;
            i++;
        }
        return 0;
    }
}
