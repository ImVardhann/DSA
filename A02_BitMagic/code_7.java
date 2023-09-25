package A02_BitMagic;
import java.util.ArrayList;
//  two odd occurring elements:

/*
time complexity:    O(N)
space complexity:   O(1)
*/
public class code_7
{
    public static void main(String[] args)
    {
        int[]arr = {1,1,2,2,3,3,4,4,5,5,6,7,6,8};
        System.out.println(twoOddOccurring(arr));
    }

    static ArrayList<Integer> twoOddOccurring(int[]arr)
    {
        ArrayList<Integer> res = new ArrayList<>();

        int temp = 0;
        int firstOdd = 0;
        int secondOdd = 0;

        for(int i = 0; i < arr.length; i++)
        {
            temp = temp ^ arr[i];
        }

        int k = firstSetBit(temp);
        for (int i = 0; i < arr.length; i++)
        {
            if(((arr[i]>>(k-1))&1) == 1)
            {
                firstOdd = firstOdd ^ arr[i];
            }
            else
            {
                secondOdd = secondOdd ^ arr[i];
            }
        }
        res.add(firstOdd);
        res.add(secondOdd);
        return res;
    }

    static int firstSetBit(int num)
    {
        int count = 0;

        while (num > 0)
        {
            count++;
            if(num%2 == 1)
            {
                return count;
            }
            num = num/2;
        }
        return count;
    }
}
