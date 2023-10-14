import java.util.Scanner;

class Player
{
    int guessNumber;
    int guessingNumber()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Player! Kindly guess the number between 0 to 10");
        guessNumber=scan.nextInt();
        return guessNumber;
    }
}