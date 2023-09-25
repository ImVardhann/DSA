package A05_Searching;

import java.util.Arrays;

public class code_14
{
    public static void main(String[] args)
    {
        int[]arr1 = {1,2,3};
        int[]arr2 = {2,3};

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println("median is: "+medianInSortedArray(arr1,arr2));
        System.out.println("median is: "+nonOptimizedMedianInSortedArray(arr1,arr2));
    }



    static double nonOptimizedMedianInSortedArray(int[]arr1, int[]arr2)
    {
        // median in the two sorted arrays

        if (arr1.length > arr2.length)
            return medianInSortedArray(arr2, arr1);
        int x = arr1.length;
        int y = arr2.length;
        int low = 0;
        int high = x;
        while (low <= high)
        {
            int xPartition = (low + high) / 2;
            int yPartition = (x+y+1) / 2-xPartition;

            int maxX = (xPartition == 0) ? Integer.MIN_VALUE: arr1[xPartition -1];
            int maxY = (yPartition == 0) ? Integer.MIN_VALUE: arr2[yPartition -1];
            int minX = (xPartition == x) ? Integer.MAX_VALUE: arr1[xPartition];
            int minY = (yPartition == y) ? Integer.MAX_VALUE: arr2[yPartition];

            int medX = maxX + maxY + 1;
            int medY = minX + minY + 1;
            if (medX == medY)
            {
                return (double) medX;
            }

        }

        throw new IllegalArgumentException("Input array is not sorted");
    }
    static double medianInSortedArray(int[]arr1, int[]arr2)
    {
        if(arr1.length > arr2.length)
        {
            return medianInSortedArray(arr2,arr1);
        }

        int x = arr1.length;
        int y = arr2.length;

        int low = 0;
        int high = x;

        while (low <= high)
        {
            int xPartition = (low + high)/2;
            int yPartition = (x + y + 1)/2 - xPartition;

            int maxX = (xPartition == 0) ? Integer.MIN_VALUE : arr1[xPartition-1];
            int maxY = (yPartition == 0) ? Integer.MIN_VALUE : arr2[yPartition-1];

            int minX = (xPartition == x) ? Integer.MAX_VALUE : arr1[xPartition];
            int minY = (yPartition == y) ? Integer.MAX_VALUE : arr2[yPartition];

            if (maxX <= minY && maxY <= minX)
            {
                if ((x + y) % 2 == 0)
                {
                    return  ((Math.max(maxX, maxY) + Math.min(minX, minY)) / 2.0);
                }
                else
                {
                    return Math.max(maxX, maxY);
                }
            }
            else if (maxX > minY)
            {
                high = xPartition - 1;
            }
            else
            {
                low = xPartition + 1;
            }

        }
        throw new IllegalArgumentException("Input arrays are not sorted.");
    }
}
