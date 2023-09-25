package A05_Searching;
//  binary search recursive:


public class code_2
{
    public static void main(String[] args)
    {
        int[]arr = {-2,-1,2,3,6,7,9,10};
        int target = 3;
        System.out.println(binSearchRec(arr,target,0,arr.length-1));
    }

    static int binSearchRec(int[]arr, int target,int s, int e)
    {
        if(s > e)
        {
            return -1;
        }
        int mid = s + (e-s)/2;

        if(arr[mid] == target)
        {
            return mid;
        }
        else if (arr[mid] > target)
        {
            return binSearchRec(arr,target,s,mid-1);
        }
        else
        {
            return binSearchRec(arr,target,mid+1, arr.length-1);
        }
    }
}
