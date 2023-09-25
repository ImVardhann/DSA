package A03_Recursions;
//  palindrome check:


public class code_2
{
    public static void main(String[] args)
    {
        String str = "1234321";
        System.out.println("Palindrome check of "+str+" : "+palindromeCheck(str,0,str.length()-1));
    }

    static boolean palindromeCheck(String str, int s, int e)
    {
        if(s >= e)
        {
            return true;
        }

        if(str.charAt(s) != str.charAt(e))
        {
            return false;
        }
        else
        {
            return palindromeCheck(str,++s,--e);
        }
    }
}
