package A01_Mathematics;
//  prime check:

/*
time complexity:   O(√N)
space complexity:   O(1)
*/
public class code_6
{
    public static void main(String[] args)
    {
        int num = 149;
        System.out.println("Prime check of "+num+": "+primeCheck(num));
    }


    static boolean primeCheck(int n)
    {
        if(n < 2)
        {
            return false;
        }
        if(n == 2|| n == 3)
        {
            return true;
        }
        if(n%2 == 0 || n%3 == 0)
        {
            return false;
        }
        for(int i = 5; i*i < n; i = i+6)
        {
            if(n%i ==0 || n%(i+2) == 0)
            {
                return false;
            }
        }
        return true;
    }
}
