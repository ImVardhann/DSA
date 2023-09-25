package A04_Arrays;
//  kadane's algorithm:


public class code_16
{
    public static void main(String[] args)
    {
        int[]arr = {-2, -3, 4, -1, -2, 1, 5, 6};
        System.out.println(maximumSubArraySum(arr));
        System.out.println(maxSubArraySum(arr));
    }

    static int maximumSubArraySum(int[]arr)
    {
        int res = arr[0];
        int prevSum = arr[0];

        for(int i = 1; i < arr.length; i++)
        {
            prevSum = Math.max(arr[i], prevSum+arr[i]);
            res = Math.max(res,prevSum);
        }
        return res;
    }

    static int maxSubArraySum(int[]arr)
    {
        int res = arr[0];
        for(int i = 0; i < arr.length; i++)
        {
            int max = arr[i];
            int sum = arr[i];
            for(int j = i+1; j < arr.length; j++)
            {
                sum = sum + arr[j];
                max = Math.max(max, sum);

            }
            res = Math.max(res,max);
        }
        return res;
    }
}
