package A01_Mathematics;
//  count digits:

/*
time complexity:    O(N)
space complexity:   O(1)

N == number of digits:
*/

public class code_1
{
    public static void main(String[] args)
    {
        long num = 1234567890;
        System.out.println(countDigits(num));
    }


    static int countDigits(long num)
    {
         num = Math.abs(num);
         int count = 0;
         while(num > 0)
         {
             count++;
             num = num/10;
         }
         return count;
    }
}
