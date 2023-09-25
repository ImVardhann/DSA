package A04_Arrays;

public class code_18
{
    public static void main(String[] args)
    {
        int[]arr = {1,2,3,-3,-2,6,-4,3,-10};

        System.out.println(maxSubArraySum(arr));
        System.out.println(minSubArraySum(arr));
    }

    static int maxSubArraySum(int[]arr)
    {
        int res = arr[0];
        int prevSum = arr[0];

        for(int i = 1; i < arr.length; i++)
        {
            prevSum = Math.max(arr[i],prevSum+arr[i]);
            res = Math.max(res,prevSum);
        }
        return res;
    }

    static int minSubArraySum(int[]arr)
    {
        int res = arr[0];
        int prevSum = arr[0];

        for(int i = 1; i < arr.length; i++)
        {
            prevSum = Math.min(arr[i], prevSum+arr[i]);
            res = Math.min(res, prevSum);
        }
        return res;
    }
}
