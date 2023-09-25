package A01_Mathematics;
import java.util.ArrayList;
//  return all the numbers less than N that exactly has 3 factors:

/*
time complexity:    O(n^(1/2) * n^(1/4))
space complexity:   O(1)
*/

public class code_8
{
    public static void main(String[] args)
    {
        int num = 10000;
        System.out.println(threeFactors(num));
    }


    static ArrayList<Integer> threeFactors(int num)
    {
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 2; i*i <= num; i++)
        {
            if(isPrime(i))
            {
                res.add(i);
            }
        }
        return res;
    }
    static boolean isPrime(int num)
    {
        for(int i = 2; i*i <= num; i++)
        {
            if(num%i == 0)
            {
                return false;
            }
        }
        return true;
    }
}
