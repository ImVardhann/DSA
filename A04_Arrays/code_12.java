package A04_Arrays;
//  frequency of the elements in the sorted array:


public class code_12
{
    public static void main(String[] args)
    {
        int[]arr = { 0,1,1,1,1,2};
        freqOfSortedArray(arr);
    }

    static void freqOfSortedArray(int[]arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            int temp = arr[i];
            int count = 1;

            while((i < arr.length-1)&& arr[i] == arr[i+1])
            {
                count++;
                i++;
            }
            System.out.println(arr[i] +"---"+count);
        }
    }
}
