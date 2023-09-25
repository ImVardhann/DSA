package A01_Mathematics;
import java.util.ArrayList;
//  return an ArrayList of prime factors of a number:

/*
time complexity:    O(√N)
space complexity:   O(1)

*/

public class code_7
{
    public static void main(String[] args)
    {
        int num = 1234;
        ArrayList<Integer> prime_factors = new ArrayList<>();

        System.out.println(primeFactorization(num,prime_factors));
    }




    static ArrayList<Integer> primeFactorization(int n, ArrayList<Integer> prime_factors)
    {
        if(isPrime(n))
        {
            prime_factors.add(n);
            return prime_factors;
        }
        int i;
        int temp = n;
        for( i = 2; i*i <= n; i++)
        {
            if(isPrime(i))
            {
                while(temp % i == 0)
                {
                    prime_factors.add(i);
                    temp = temp/i;
                }
            }
        }

        temp = n;
        for(; i > 1; i--)
        {
            while(temp % i == 0)
            {
                prime_factors.add(n/i);
                temp = temp/i;
            }
        }
        return prime_factors;
    }






    static boolean isPrime(int n)
    {
        if(n < 2)
        {
            return false;
        }
        if(n == 2|| n == 3)
        {
            return true;
        }
        if(n%2 == 0 || n%3 == 0)
        {
            return false;
        }
        for(int i = 5; i*i < n; i = i+6)
        {
            if(n%i ==0 || n%(i+2) == 0)
            {
                return false;
            }
        }
        return true;
    }
}
