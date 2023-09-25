package A01_Mathematics;
//  Factorial:

/*
time complexity:    O(N)
space complexity:   O(1)

*/
public class code_3
{
    public static void main(String[] args)
    {
        int num = 1;
        System.out.println("Factorial of "+num+"is : "+factorial(num));
    }

    static int factorial(int num)
    {
        int fact = 1;

        if(num >= 2)
        {
            for(int i = 2; i <= num; i++)
            {
                fact *= i;
            }
        }
        return fact;
    }
}
