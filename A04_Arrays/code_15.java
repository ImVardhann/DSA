package A04_Arrays;
import java.util.Arrays;
//  TRAPPING RAIN WATER problem:


public class code_15
{
    public static void main(String[] args)
    {
        int[]arr =  {8,8,2,4,5,5,1};

        //System.out.println(trappinggRainWater(arr));
        System.out.println(trappingRainWaterAndSpace(arr));
    }


    static int trappinggRainWater(int[]arr)
    {
        int[]leftMax = new int[arr.length];
        int[]rightMax = new int[arr.length];

        leftMax[0] = arr[0];
        rightMax[arr.length-1] = arr[arr.length-1];

        int max = arr[0];
        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i] > max)
            {
                leftMax[i] = arr[i];
                max = arr[i];
            }
            else
            {
                leftMax[i] = max;
            }
        }

        max = arr[arr.length-1];
        for(int i = arr.length-2; i >=0; i--)
        {
            if(arr[i] > max)
            {
                rightMax[i] =arr[i];
                max = arr[i];
            }
            else
            {
                rightMax[i] = max;
            }
        }
        System.out.println(Arrays.toString(leftMax));
        System.out.println(Arrays.toString(rightMax));
        System.out.println(Arrays.toString(arr));

        int waterTrapped = 0;
        for(int i = 1; i < arr.length-1; i++)
        {
            waterTrapped = waterTrapped + Math.max(Math.min(leftMax[i],rightMax[i]) - arr[i],0);
//            waterTrapped += leftMax[i] - rightMin[i]-arr[i];
        }
        return waterTrapped;
    }

    static int trappingRainWaterAndSpace(int[]arr)
    {
        //  saving right max array in the actual array itself:

        int maxx = arr[0];
        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i] > maxx)
            {
                maxx = arr[i];
            }
        }
        maxx++;

        System.out.println(Arrays.toString(arr));

        int max = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i]%maxx > max)
            {
                arr[i] = arr[i] + maxx*arr[i];
                max = arr[i]%maxx;
            }
            else
            {
                arr[i] = arr[i] + maxx*max;
            }
        }
        System.out.println(Arrays.toString(arr));

        int rightMax = arr[arr.length-1]%maxx;
        int waterTrapping = 0;
        for(int i = arr.length-2; i > 0; i--)
        {
            if(rightMax < arr[i]%maxx)
            {
                rightMax = arr[i];
            }
            waterTrapping += Math.max(0,Math.min(arr[i]/maxx,rightMax)-arr[i]%maxx);
        }
        return waterTrapping;
    }
}
