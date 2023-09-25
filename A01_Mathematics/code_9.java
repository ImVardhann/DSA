package A01_Mathematics;
import java.util.ArrayList;
//  return an ArrayList of all the factors of a number:

/*
time complexity:    O(sqrt(N))
space complexity:   O(1)

*/
public class code_9
{
    public static void main(String[] args)
    {
        int num = 200;
        System.out.println(allDivisors(num));
    }

    static ArrayList<Integer> allDivisors(int num)
    {
        ArrayList<Integer> res = new ArrayList<>();
        int i = 1;

        for(; i*i <= num; i++)
        {
            if(num%i == 0)
            {
                res.add(i);
            }
        }
//        System.out.println(i);

        for(i = res.size()-1;i >= 0; i--)
        {
            int divisor = num/res.get(i);
            if(divisor != res.get(i))
            {
                res.add(divisor);
            }
        }
        return res;
    }
}
