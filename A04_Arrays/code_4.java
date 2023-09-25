package A04_Arrays;
//  return the second-largest element in the array


public class code_4
{
    public static void main(String[] args)
    {
        int[]arr = {1,1,1,2,3,0,0};
        System.out.println("Second largest element's index is: "+secLargestElement(arr));
    }

    static  int secLargestElement(int[]arr)
    {
        int lar = 0;
        int secLar = -1;

        for(int i = 1;i < arr.length; i++)
        {
            if(arr[i] > arr[lar])
            {
                secLar = lar;
                lar = i;
            }
            else if(arr[i] < arr[lar] && secLar == -1)
            {
                secLar = i;
            }
            else if (arr[i] < arr[lar] && arr[secLar] < arr[i])
            {
                secLar = i;
            }

        }
        return secLar;
    }
}
