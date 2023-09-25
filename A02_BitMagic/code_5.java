package A02_BitMagic;
//  count the total number of sets present in all the numbers less than or equal to n;


public class code_5
{
    public static void main(String[] args)
    {
        int num = 12;
        for(int i = 0; i <= num; i++)
        {
            System.out.printf("%8s\n",Integer.toBinaryString(i));
        }
        System.out.println(TotalSetBits(num));
    }
    static int TotalSetBits(int n)
    {
        n = n + 1;
        int count = 0;
        for( int x=2 ; x/2<n ; x=x*2 )
        {
            //Total count of pairs of 0s and 1s.
            int quotient = n/x;
            //quotient gives the complete count of pairs of 1s.
            //Multiplying it with the (current power of 2)/2 will give
            //the count of 1s in the current bit.
            count = count + quotient * x / 2;

            int remainder = n%x;
            //If the count of pairs is odd then we add the remaining 1s
            //which could not be grouped together.
            if(remainder > x/2)
            {
                count = count +  remainder - x/2;
            }
        }
        return count;
    }
}
