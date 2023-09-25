package A04_Arrays;
import java.util.Arrays;
//  smallest missing natural number in the array:

//  cycle sort:

public class code_13
{
    public static void main(String[] args)
    {
        int[]arr = {1,2,3,4};

        System.out.println("Smallest missing natural number in the array is: "+smallestMissingNumber(arr));
    }

    static int smallestMissingNumber(int[]arr)
    {
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));

        for(int i = 0; i < arr.length; i++)
        {
            if (arr[i] != i+1)
            {
                return i+1;
            }
        }
        return arr.length+1;
    }



    static void cycleSort(int[]arr)
    {
        int i = 0;

        while(i < arr.length)
        {
            if(arr[i]>0 && arr[i]<=arr.length && arr[arr[i]-1] != arr[i])
            {
                swap(arr,i,arr[i]-1);
            }
            else
            {
                i++;
            }
        }
    }
    static void  swap(int[]arr, int i, int j)
    {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }

}
