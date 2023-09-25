package A05_Searching;
//  ternary search



public class code_5
{
    public static void main(String[] args)
    {
        int[]arr = {1,2,3,4,5,6,7,8,10,11,12,13,14,15,16,17,18,19,20};
        int target = -12;
        System.out.println(ternarySearch(arr,target));
    }

    static int ternarySearch(int[]arr, int target)
    {
        int l = 0;
        int r = arr.length-1;

        while(l <= r)
        {
            int mid1 = l + (r-l)/3;
            int mid2 = r - (r-l)/3;

            if(arr[mid1] == target)
            {
                return mid1;
            }
            else if (arr[mid2] == target )
            {
                return mid2;
            }
            else if(target < arr[mid1])
            {
                r = mid1-1;
            }
            else if(target < arr[mid2])
            {
                l = mid1+1;
                r = mid2 -1;
            }
            else
            {
                l = mid2+1;
            }
        }
        return -1;
    }
}
