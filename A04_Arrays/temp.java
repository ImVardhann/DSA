package A04_Arrays;

import java.net.HttpRetryException;

public class temp
{
    public static void main(String[] args)
    {
        int[]arr = {8,1,1,2,35,4};
        int k = 9;
        System.out.println(SubArraySum(arr,k));
    }

    static boolean SubArraySum(int[]arr,int sum)
    {
        int currSum = 0;
        int s = 0;

        for(int e = 0; e < arr.length; e++)
        {
            currSum += arr[e];
            while(currSum > sum && s <= e)
            {
                currSum -= arr[s];
                s++;
            }
            if(currSum == sum)
            {
                return true;
            }
        }
        return false;
    }
}
