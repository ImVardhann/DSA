package A04_Arrays;
//  is sub-array with sum 'k' is present or not:

//  similar to windows sliding method
public class code_22
{
    public static void main(String[] args)
    {
        int[]arr = {5,4,1,3,4};
        int k = 1;

        System.out.println(subArrayWithSum(arr,k));
    }


    static boolean subArrayWithSum(int[]arr, int k)
    {
        int s = 0;
        int currSum = 0;

        for(int e = 0; e < arr.length; e++)
        {
            currSum += arr[e];
            while (s <= e && currSum > k)
            {
                currSum -= arr[s];
                s++;
            }
            if(currSum == k)
            {
                return true;
            }
        }
        return false;
    }
}
