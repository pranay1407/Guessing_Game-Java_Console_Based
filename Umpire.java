class Umpire
{
    int numFromGuesser;

    int numFromP1;
    int numFromP2;
    int numFromP3;

    void collectNumFromGuesser()
    {
        Guesser guess=new Guesser();
        numFromGuesser=guess.guessingNumber();
    }

    void collectNumFromPlayers()
    {
        Player p1=new Player();

        Player p2=new Player();

        Player p3=new Player();

        numFromP1=p1.guessingNumber();

        numFromP2=p2.guessingNumber();

        numFromP3=p3.guessingNumber();
    }

    void compare()
    {

        if(numFromGuesser==numFromP1)
        {
            if(numFromGuesser==numFromP2 && numFromGuesser==numFromP3)
            {
                System.out.println("All Players guessed the number correctly! Game tied");
            }
            else if(numFromGuesser==numFromP2)
            {
                System.out.println("Game tied between Player 1 and Player2");
            }
            else if(numFromGuesser==numFromP3)
            {
                System.out.println("Game tied between Player 1 and Player3");
            }
            else
            {
                System.out.println("Player 1 Won the game!");
            }

        }
        else if(numFromGuesser==numFromP2)
        {
            if(numFromGuesser==numFromP3)
            {
                System.out.println("Game tied between Player2 and Player 3");
            }
            else
            {
                System.out.println("Player2 won the game!");
            }
        }
        else if(numFromGuesser==numFromP3)
        {
            System.out.println("Player3 won the game!");
        }
        else
        {
            System.out.println("Game Lost! Try AGain");
        }
    }
}