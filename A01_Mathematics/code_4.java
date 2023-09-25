package A01_Mathematics;
//  trailing zeroes in factorial:

/*
time complexity:    O(N/5) == O(N)
space complexity:   O(1)
 */
public class code_4
{
    public static void main(String[] args)
    {
        int num = 500;
        System.out.println("Number of trailing zeroes in "+num+"is: "+trailingZeroesInFact(num));
    }



    static int trailingZeroesInFact(int num)
    {
        int count = 0;
        for(int i = 5; i <= num; i = i*5)
        {
            count = count + (num/i);
        }
        return count;
    }
}
