package A03_Recursions;
//  nth fibonacci number using recursions:

public class code_3
{
    public static void main(String[] args)
    {
        int num = 5;
        System.out.println(num+"th Fibonacci number is: "+fibo(num));
    }

    static int fibo(int num)
    {
        if(num < 2)
        {
            return num;
        }
        return fibo(num-1)+ fibo(num-2);
    }
}
