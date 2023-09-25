package A04_Arrays;
//  EQUILIBRIUM POINT:


import java.util.Arrays;

public class code_23
{
    public static void main(String[] args)
    {
        int[]arr = {1,2,3,-6,5};
        System.out.println(equilibriumPoint(arr));
    }

    static boolean equilibriumPoint(int[]arr)
    {
        int suffixSum = 0;
        for (int j : arr)
        {
            suffixSum += j;
        }
        int prefixSum = 0;
        for(int i = 0; i < arr.length; i++)
        {
            suffixSum -= arr[i];
            if(prefixSum == suffixSum)
            {
                System.out.println(i);
                return true;
            }
            prefixSum += arr[i];
        }
        return false;
    }
}

