package A04_Arrays;
import java.util.Arrays;
//  move all zeroes to end:


public class code_7
{
    public static void main(String[] args)
    {
        int[]arr = {1,1,2,3,4};
        moveAllZeroesToEnd(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void moveAllZeroesToEnd(int[]arr)
    {
        int j = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] != 0)
            {
                arr[j] = arr[i];
                j++;
            }
        }
        for(; j< arr.length; j++)
        {
            arr[j] = 0;
        }
    }
}
