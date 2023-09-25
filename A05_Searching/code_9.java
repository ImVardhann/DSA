package A05_Searching;
//  index of the peak element:

public class code_9
{
    public static void main(String[] args)
    {
        int[]arr = {1,2,3,4,3};

        System.out.println("the peak element is :"+peakElementInArr(arr));
    }


    static int peakElementInArr(int[]arr)
    {
        int s = 0;
        int e = arr.length-1;


        while(s <= e)
        {
            int mid = s + (e-s)/2;

            if(arr[mid] > arr[mid+1] && arr[mid] > arr[mid-1])
            {
                return mid;
            }
            else if (arr[mid] < arr[mid+1])
            {
                s = mid + 1;
            }
            else
            {
                e = mid -1;
            }
        }
        return -1;

    }
}
