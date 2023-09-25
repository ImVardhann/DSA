package A03_Recursions;
import java.util.ArrayList;
//  return the power-set of the string:


public class code_6
{
    public static void main(String[] args)
    {
        String str = "abcd";
        ArrayList<String> res = new ArrayList<>();
        powerSet("",str,res);

        System.out.println(res);
    }

    static void powerSet(String p, String up, ArrayList<String> res)
    {
        if(up.isEmpty())
        {
            res.add(p);
            return;
        }
        char temp = up.charAt(0);
        powerSet(p+temp,up.substring(1),res);
        powerSet(p,up.substring(1),res);
    }
}
