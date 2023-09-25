package A05_Searching;

public class code_10
{
    public static void main(String[] args)
    {
        int[]arr = {1,2,3,4,5,6,7,8,9,10,11,12,14,16,18};
        int target = 14;
        System.out.println("the target element is "+target);
        System.out.println("Floor index of the target element is "+floorInSortedArr(arr,target));
        System.out.println("Ceiling index of the target element is "+ceilInSortedArr(arr,target));
    }



    static int floorInSortedArr(int[]arr, int target)
    {
        int s = 0;
        int e = arr.length-1;

        while(s <= e)
        {
            int mid = s + (e-s)/2;

            if(arr[mid] == target)
            {
                return arr[mid];
            }
            else if (arr[mid] < target)
            {
                s = mid + 1;
            }
            else
            {
                e = mid - 1;
            }
        }
        return arr[e];
    }

    static int ceilInSortedArr(int[]arr, int target)
    {

        int s = 0;
        int e = arr.length-1;

        while(s <= e)
        {
            int mid = s + (e-s)/2;

            if(arr[mid] == target)
            {
                return arr[mid];
            }
            else if (arr[mid] < target)
            {
                s = mid + 1;
            }
            else
            {
                e = mid - 1;
            }
        }
        return arr[s];
    }
}
