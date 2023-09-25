package A02_BitMagic;
//  return the gray code equivalent of the given binary equivalent number:

/*
time complexity:    O(1)
space complexity:   O(1)
*/
public class code_8
{
    public static void main(String[] args)
    {
        int num = 5;
        System.out.println(grayEquivalent(num));
    }

    static int grayEquivalent(int num)
    {
        return ((num>>1)^num);
    }
}
