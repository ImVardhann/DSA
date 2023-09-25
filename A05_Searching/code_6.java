package A05_Searching;
//  Missing and repeating number in the array containing elements of range 1 to n

import java.util.Arrays;

public class code_6
{
    public static void main(String[] args)
    {
        int[]arr = {1,2,23,4,4};

        System.out.println("the missing integer is "+ missingInteger(arr));
        System.out.println("The repeating integer is "+repeatingNumber(arr));
    }



    static int repeatingNumber(int[]arr)
    {
        int i = 0;

        while (i < arr.length)
        {
            if(arr[i] <=0 || arr[i] > arr.length)
            {
                i++;
            }
            else if(arr[i] == arr[arr[i]-1])
            {
                i++;
            }
            else
            {
                swap(arr,i,arr[i]-1);
            }

        }
        System.out.println(Arrays.toString(arr));

        for (int j = 0; j < arr.length; j++)
        {
            if(arr[j] != j+1 && (arr[j] >0 && arr[j] <= arr.length))
            {
                return arr[j];
            }
        }
        return -1;
    }
    static int missingInteger(int[]arr)
    {
        int i = 0;

        while (i < arr.length)
        {
            if(arr[i] <=0 || arr[i] > arr.length)
            {
                i++;
            }
            else if(arr[i] == arr[arr[i]-1])
            {
                i++;
            }
            else
            {
                swap(arr,i,arr[i]-1);
            }

        }
        System.out.println(Arrays.toString(arr));

        for (int j = 0; j < arr.length; j++)
        {
            if(arr[j] != j+1)
            {
                return j+1;
            }
        }
        return arr.length+1;
    }




    static void swap(int[]arr,int i, int j)
    {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }
}
