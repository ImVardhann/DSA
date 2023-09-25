package A03_Recursions;
import java.util.ArrayList;

//  permute string:

public class code_9
{
    public static void main(String[] args)
    {
        String str = "abc";
        ArrayList<String> res = new ArrayList<>();
        permute(str,0,res);
        System.out.println(res);
    }
    static void permute(String str, int i, ArrayList<String> res)
    {
        if(i == str.length()-1)
        {
            res.add(str);
//            System.out.println(str);
        }
        else
        {
            for(int j = i; j < str.length(); j++)
            {
                str = swap(str,i,j);
                permute(str,i+1,res);
                str = swap(str,i,j);
            }
        }
    }

    static String swap(String str, int i, int j)
    {
        char temp;
        char[] charArray = str.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
