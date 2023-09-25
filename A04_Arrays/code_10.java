package A04_Arrays;
//  max difference with order:


public class code_10
{
    public static void main(String[] args)
    {
        int[]arr = {5,4,3,2,1};
        System.out.println(maxDifferenceWithOrder(arr));
    }

    static int maxDifferenceWithOrder(int[]arr)
    {
        int min = arr[0];
        int res = arr[1] - arr[0];

        for(int i = 1; i < arr.length; i++)
        {
            res = Math.max(res,arr[i]-min);
            min = Math.min(min,arr[i]);
        }
        return res;
    }
}
