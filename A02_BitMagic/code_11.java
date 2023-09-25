package A02_BitMagic;

public class code_11
{
    public static void main(String[] args)
    {
        int num = 7;
        System.out.println("the number is: "+Integer.toBinaryString(num)+" "+ num);
        System.out.println("It's gray representation is: "+binaryToGray(Integer.toBinaryString(num)));
    }
    static String binaryToGray(String str1)
    {
        StringBuilder res = new StringBuilder();

        res.append(str1.charAt(0));

        for(int i = 1; i < str1.length(); i++)
        {
            res.append(res.charAt(i-1)^str1.charAt(i));
        }

        return res.toString();
    }
}
