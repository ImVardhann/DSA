package A04_Arrays;
//  find the majority element in the array:
//  MOORE'S VOTING ALGORITHM:

/*
time complexity:    O(N)
space complexity:   O(1)
*/

public class code_20
{
    public static void main(String[] args)
    {
        int[]arr = {1,1,1,2,2,2,2,3,3,3};
        System.out.println(majorityElement(arr));
    }

    static int majorityElement(int[]arr)
    {
        int count = 1;
        int temp = arr[0];

        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i] == temp)
            {
                count++;
            }
            else
            {
                count--;
            }
            if(count < 0)
            {
                count = 1;
                temp = arr[i];
            }
        }

        count = 0;

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == temp)
            {
                count++;
            }
        }
        if(count > arr.length/2)
        {
            return temp;
        }
        else
        {
            return -1;
        }
    }
}
