package A01_Mathematics;
//  LCM and HCF

/*
time complexity:    O(log(min(a,b))
space complexity:   O(log(min(a,b))

*/
public class code_5
{
    public static void main(String[] args)
    {
        int num1 = 23;
        int num2 = 123;
        System.out.println(GCD(num1,num2));
        System.out.println(LCM(num1,num2));

    }



    static int GCD(int a, int b)
    {
        if(a%b == 0)
        {
            return b;
        }
        else
        {
            return GCD(b,a%b);
        }
    }



    static int LCM(int a, int b)
    {
        return a*b/GCD(a,b);
    }
}
