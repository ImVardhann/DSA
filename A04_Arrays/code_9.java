package A04_Arrays;
//  leaders in an array:

import java.util.ArrayList;

public class code_9
{
    public static void main(String[] args)
    {
        int[]arr = {16, 17, 4, 3, 5, 2};
        System.out.println(leadersInArray(arr));
    }

    static ArrayList<Integer> leadersInArray(int[]arr)
    {
        ArrayList<Integer> res = new ArrayList<>();
        res.add(arr[arr.length-1]);

        int max = arr[arr.length-1];
        for(int i = arr.length - 2; i>=0; i--)
        {
            if(arr[i] > max)
            {
                res.add(0,arr[i]);
                max = arr[i];
            }
        }
        return res;
    }
}
