package A04_Arrays;
//  max sum of k consecutive terms in an array
//  Sliding window technique


public class code_21
{
    public static void main(String[] args)
    {
        int[]arr = {1,1,1,2,2,2,2,3,-1,3,-3,3};
        int k = 3;

        System.out.println(maxSumOfKElements(arr,k));
    }

    static int maxSumOfKElements(int[]arr, int k)
    {
        int currSum = 0;

        for(int i = 0; i < k; i++)
        {
            currSum+=arr[i];
        }
        int res = currSum;
        for(int i = k; i < arr.length; i++)
        {
            currSum = currSum - arr[i-k] + arr[i];
            res = Math.max(res,currSum);
        }
        return res;
    }
}
