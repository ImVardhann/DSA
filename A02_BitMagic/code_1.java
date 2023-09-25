package A02_BitMagic;
//  check if kth bit is set or not:
//  returning the binary code (String) from decimal number;


public class code_1
{
    public static void main(String[] args)
    {
        int num = 13;
        int k = 2;
        System.out.println(printBinary(num));
        System.out.println(k+"th bit is set or not: "+kthBitIsSet(num,k));
    }

    static boolean kthBitIsSet(int num, int k)
    {
//        return (((num>>(k-1)) & 1) == 1);
        return (((1<<(k-1)&(num)) != 0));
    }

    static String printBinary(int num)
    {
        StringBuilder str = new StringBuilder();

        while(num > 0)
        {
            str.insert(0,num%2);
            num = num/2;
        }
        return str.toString();
    }
}
