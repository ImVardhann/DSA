package A03_Recursions;
//  basic recursion problems:

public class code_1
{
    public static void main(String[] args)
    {
        int num = 5;
        printNto1(num);
        print1toN(num);
        System.out.println();
        System.out.println("sum to N terms = "+sumToN(num));
    }
    static int sumToN(int num)
    {
        if(num <= 1)
        {
            return 1;
        }
        return num + sumToN(num-1);
    }

    static void printNto1(int num)
    {
        if(num <=1)
        {
            System.out.println(1);
            return;
        }
        System.out.print(num+" ");
        printNto1(num-1);
    }

    static void print1toN(int num)
    {
        if(num <= 1)
        {
            System.out.print(1+" ");
            return;
        }
        print1toN(num-1);
        System.out.print(num+" ");
    }
}
