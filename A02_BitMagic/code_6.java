package A02_BitMagic;
//  one odd occurring:

public class code_6
{
    public static void main(String[] args)
    {
        int[]arr = {1,1,2,2,3,3,4,4,5,5,6,6,7};
        System.out.println(oneOddNum(arr));
    }
    static int oneOddNum(int[]arr)
    {
        int res = 0;
        for(int i = 0; i < arr.length; i++)
        {
            res = res^arr[i];
        }
        return res;
    }
}
