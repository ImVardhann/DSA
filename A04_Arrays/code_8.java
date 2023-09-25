package A04_Arrays;
//  left rotate the array by d places:

import java.util.Arrays;

public class code_8
{
    public static void main(String[] args)
    {
        int[]arr = {1,2,3,4,5,5,6,7};
        int d = 4;
        rotateArrayByDPlaces(arr,d);
        System.out.println(Arrays.toString(arr));
    }

    static void rotateArrayByDPlaces(int[]arr, int d)
    {
        reverseArray(arr,0,d);
        reverseArray(arr,d,arr.length);
        reverseArray(arr,0,arr.length);
    }


    static void reverseArray(int[]arr, int s, int e)
    {
        e = e - 1;
        while(s < e)
        {
            arr[s] = arr[s] ^ arr[e];
            arr[e] = arr[s] ^ arr[e];
            arr[s] = arr[s] ^ arr[e];
            s++;
            e--;
        }
    }
}
