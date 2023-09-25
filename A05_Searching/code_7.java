package A05_Searching;
//  ceiling of the target, floor of the target, freq of the target




public class code_7
{
    public static void main(String[] args)
    {
        int[]arr = {1,2,2,2,2,2,3,4,5,6,7,8,9,10,10,10};
        int target = 2;

        System.out.println("freq of "+target+" is : "+ (ceilingSortedArray(arr,target) - floorSortedArray(arr,target) + 1));
    }


    static int ceilingSortedArray(int[]arr, int target)
    {
        int s = 0;
        int e = arr.length-1;

        int res = -1;

        while (s <= e)
        {
            int mid = s + (e-s)/2;

            if(arr[mid] == target)
            {
                res = mid;
                s = mid+1;
            }
            else if(arr[mid] < target)
            {
                s = mid + 1;
            }
            else
            {
                e = mid - 1;
            }
        }
        return res;
    }

    static int floorSortedArray(int[]arr, int target)
    {
        int s = 0;
        int e = arr.length-1;

        int res = -1;

        while (s <= e)
        {
            int mid = s + (e-s)/2;

            if(arr[mid] == target)
            {
                res = mid;
                e = mid - 1;
            }
            else if(arr[mid] < target)
            {
                s = mid + 1;
            }
            else
            {
                e = mid - 1;
            }
        }
        return res;
    }
}
