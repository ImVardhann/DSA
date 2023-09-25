package A05_Searching;
//  Moore's voting Algorithm


public class code_4
{
    public static void main(String[] args)
    {
        int[]arr = {1,2,2,1,2,2,2,1,2,2,2,1,1,1,1,1,1,1,1,0,0};
        System.out.println(majorityElement(arr));
    }

    static int majorityElement(int arr[])
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
            if(count == 0)
            {
                temp = arr[i];
                count = 1;
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

        if(count > (arr.length/2))
        {
            return temp;
        }
        else
        {
            return -1;
        }
    }
}
