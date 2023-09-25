package A04_Arrays;
import java.util.Arrays;


//  insert element at the given index:
/*
time complexity:    O(N)
space complexity:   O(1)
*/
public class code_1
{
    public static void main(String[] args)
    {
        int[]arr = {1,2,3,4,5,6,7,8,9,10};
        int element = 12;
        int index = 3;
        System.out.println(Arrays.toString(arr));
        insert(arr,index,element);
        System.out.println(Arrays.toString(arr));
    }

    static void insert(int[]arr, int index, int element)
    {
        for(int i = arr.length-1; i>index; i--)
        {
            arr[i] = arr[i-1];
        }
        arr[index] = element;
        return;
    }
}
