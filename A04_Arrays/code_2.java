package A04_Arrays;
//  find max or min:

public class code_2
{
    public static void main(String[] args)
    {
        int[]arr = {1,23,45,61,123,1,-1,123};
        System.out.println("max index is "+max_index(arr));
        System.out.println("min index is "+min_index(arr));
    }
    static int max_index(int[]arr)
    {
        int max = 0;
        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i] > arr[max])
            {
                max = i;
            }
        }
        return max;
    }

    static int min_index(int[]arr)
    {
        int min = 0;
        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i] < arr[min])
            {
                min = i;
            }
        }
        return min;
    }
}
