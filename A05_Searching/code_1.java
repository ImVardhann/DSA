package A05_Searching;
// binary search (iterative method)


public class code_1
{
    public static void main(String[] args)
    {
        int[]arr = {-2,-1,2,3,6,7,9,10};
        int target = 2;
        System.out.println(binSearchIter(arr,target));
    }

    static int binSearchIter(int[]arr, int target)
    {
        int s = 0;
        int e = arr.length-1;

        while(s <= e)
        {
            int mid = s + (e-s)/2;
            if(arr[mid] == target)
            {
                return mid;
            }
            else if (arr[mid] > target)
            {
                e = mid - 1;
            }
            else
            {
                s = mid + 1;
            }
        }
        return -1;
    }

}
