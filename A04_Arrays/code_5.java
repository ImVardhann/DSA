package A04_Arrays;
import java.util.Arrays;
//  reverse an array:


public class code_5
{
    public static void main(String[] args)
    {

        int[]arr = {1,2,3,4,5,66,7};
        System.out.println(Arrays.toString(arr));
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void reverseArray(int[]arr)
    {
        int s = 0;
        int e = arr.length-1;

        while(s < e)
        {
            swap(arr,s,e);
            s++;
            e--;
        }
    }

    static void  swap(int[]arr, int i, int j)
    {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }
}
