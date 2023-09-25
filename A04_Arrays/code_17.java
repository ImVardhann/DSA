package A04_Arrays;
//  maximum circular sub-array sum:

// naive:

public class code_17
{
    public static void main(String[] args)
    {
        int[]arr = {20,28, 2,6, 18, 12, -28, 3, -3, -26, 1, 6, 6, -27, -6, -7, 28, -26, 13, 30, -5, -6};
        System.out.println(maximumCircularSubArraySum(arr));
    }

    static int maximumCircularSubArraySum(int[]arr)
    {
        int res = 0;

        for(int i = 0; i < arr.length; i++)
        {
            int currMax = arr[i];
            int currSum = arr[i];

            for(int j = 1; j < arr.length; j++)
            {
                int index = (i+j)%arr.length;
                currSum = currSum + arr[index];
                currMax = Math.max(currMax,currSum);
            }
            res = Math.max(res,currMax);
        }
        return res;
    }
}
