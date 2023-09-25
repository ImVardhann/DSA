package A04_Arrays;
//  stock buy and sell problem:


public class code_14
{
    public static void main(String[] args)
    {
        int[]arr = {1,2,3,4,1,2,310,1,25};
        System.out.println(maxProfit(arr));
    }

    static int maxProfit(int[]arr)
    {
        int profit = 0;

        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i] > arr[i-1])
            {
                profit = profit + arr[i] - arr[i-1];
            }
        }
        return profit;
    }
}
