package A04_Arrays;
//  max circular sub-array sum:
//  using kadane's algorithm:

//  total array sum - min sub-array sum by kadane's algorithm:
public class code_19
{
    public static void main(String[] args)
    {
        int[]arr = {1,2,3,-2,-3,-4,-6,7,8,9};
        System.out.println(maxCirculaSubArraySum(arr));
    }



    static int maxCirculaSubArraySum(int[]arr)
    {
        int res = arr[0];
        int prevSum = arr[0];
        int sum = arr[0];
        for(int i = 1; i < arr.length; i++)
        {
            sum+= arr[i];
            prevSum = Math.min(arr[i],prevSum+arr[i]);
            res = Math.min(res,prevSum);
        }

        System.out.println(res);
        return sum - res;
    }
}

