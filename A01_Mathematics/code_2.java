package A01_Mathematics;
//  palindrome check

/*
time complexity:    O(N)
space complexity:   O(1)
N == number of digits in the number
*/
public class code_2
{
    public static void main(String[] args)
    {
        int num = 101;
        System.out.println("Palindrome check of "+num+": "+palindromeCheck(num));
    }


    static boolean palindromeCheck(int num)
    {
        int rev = 0;
        int temp = num;
        while(temp > 0)
        {
            rev = rev * 10 + (temp%10);
            temp = temp/10;
        }
//        System.out.println(rev);
        return (rev == num);
    }
}
