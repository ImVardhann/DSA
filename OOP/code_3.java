package OOP;

public class code_3
{
    public static void main(String[] args)
    {
        for (int i = 8; i < 1000; i++)
        {
            if(i %2 == 1 &&  i % 3 == 1 && i % 4 == 1 && i %5 ==1 && i %6 == 1 && i%7 == 0)
            {
                System.out.println(i);
            }
        }
    }
}