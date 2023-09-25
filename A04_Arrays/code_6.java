package A04_Arrays;
import java.util.Arrays;
//  remove all the duplicates in the sorted array:

/*
time complexity:    O(N)
space complexity:   O(1)
*/


public class code_6
{
    public static void main(String[] args)
    {
        int[]arr = {1,2,2,2,3,3,4,4,5,6,7,7,7,88};
        System.out.println(Arrays.toString(arr));
        removeDuplicates(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void removeDuplicates(int[]arr)
    {
        int j = 1;

        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i] != arr[i-1])
            {
                arr[j] = arr[i];
                j++;
            }
        }
        for(; j < arr.length; j++)
        {
            arr[j] = 0;
        }
    }
}
