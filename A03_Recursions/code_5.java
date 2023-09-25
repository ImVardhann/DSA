package A03_Recursions;
//  tower of hanoi :


public class code_5
{
    public static void main(String[] args)
    {
        int num = 3;

        towerOfHanoi(num,'A','B','C');
    }

    static void towerOfHanoi(int num, char A, char B, char C)
    {
        if(num == 0)
        {
            return;
        }
        towerOfHanoi(num-1,A,C,B);
        System.out.println("move "+num+"th disc from "+A+" to "+C);
        towerOfHanoi(num-1,B,A,C);
    }

}
