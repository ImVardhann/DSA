package A04_Arrays;
//  match sticks game:

/*
QUESTION DESCRIPTION: Two friends, A and B, are playing the game of matchsticks.
In this game, a group of N matchsticks is placed on the table. The players can pick
any number of matchsticks from 1 to 4 (both inclusive) during their chance.
The player who takes the last match stick wins the game. If A starts first,
how many matchsticks should he pick on his 1st turn such that he is
guaranteed to win the game or determine if it's impossible for him to win.
Return -1 if it's impossible for A to win the game, else return the number
of matchsticks should he pick on his 1st turn such that he is guaranteed to win.
Note : Consider both A and B play the game optimally.
 */
public class code_3
{
    public static void main(String[] args)
    {
        int numberOfSticks = 11;
        int k = 5;
        System.out.println("In order to win, I must first collect "+matchSticksGame(numberOfSticks, k)+" Sticks");
    }

    static int matchSticksGame(int num, int k)
    {
        if(num % k == 0)
        {
            return -1;
        }
        else
        {
            return num%k;
        }
    }
}
