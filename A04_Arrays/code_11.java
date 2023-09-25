package A04_Arrays;
import java.util.Arrays;
//  Rearrange Array Alternately


/*
QUESTION DESCRIPTION:
Given a sorted array of positive integers.
Your task is to rearrange the array elements alternatively
i.e first element should be max value, second should be min value,
third should be second max, fourth should be second min and so on.
Note: Modify the original array itself. Do it without using any extra space.
You do not have to return anything.
*/
public class code_11
{
    public static void main(String[] args)
    {
        int[]arr = {1,2,3,4,5,6,7,8,9};
        rearrangeAlternatively(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void rearrangeAlternatively(int[]arr)
    {
        int s = 0;
        int e = arr.length-1;

        int max = arr[arr.length-1] +1;
        for(int i = 0; i < arr.length; i++)
        {
            if(i%2 == 0)
            {
                arr[i] = arr[i]%max + max*(arr[e]%max);
                e--;
            }
            else
            {
                arr[i] = arr[i]%max + max*(arr[s]%max);
                s++;
            }
        }
        for(int j = 0; j < arr.length; j++)
        {
            arr[j] = arr[j]/max;
        }
    }
}
